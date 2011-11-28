package com.microsoft.windowsazure.services.serviceBus.implementation;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.microsoft.windowsazure.services.core.ServiceException;
import com.microsoft.windowsazure.services.core.utils.ServiceExceptionFactory;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.representation.Form;

public class WrapRestProxy implements WrapContract {
    Client channel;

    static Log log = LogFactory.getLog(WrapContract.class);

    @Inject
    public WrapRestProxy(Client channel) {
        this.channel = channel;
    }

    public WrapAccessTokenResult wrapAccessToken(String uri, String name, String password, String scope) throws ServiceException {
        Form requestForm = new Form();
        requestForm.add("wrap_name", name);
        requestForm.add("wrap_password", password);
        requestForm.add("wrap_scope", scope);

        Form responseForm;
        try {
            responseForm = channel.resource(uri).accept(MediaType.APPLICATION_FORM_URLENCODED).type(MediaType.APPLICATION_FORM_URLENCODED)
                    .post(Form.class, requestForm);
        }
        catch (UniformInterfaceException e) {
            log.warn("WRAP server returned error acquiring access_token", e);
            throw ServiceExceptionFactory.process("WRAP", new ServiceException("WRAP server returned error acquiring access_token", e));
        }

        WrapAccessTokenResult response = new WrapAccessTokenResult();

        response.setAccessToken(responseForm.getFirst("wrap_access_token"));

        String expiresIn = responseForm.getFirst("wrap_access_token_expires_in");
        response.setExpiresIn(Long.parseLong(expiresIn));

        return response;
    }
}
