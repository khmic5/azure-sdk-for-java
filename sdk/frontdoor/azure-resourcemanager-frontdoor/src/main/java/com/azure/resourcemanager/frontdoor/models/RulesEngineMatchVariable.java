// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RulesEngineMatchVariable. */
public final class RulesEngineMatchVariable extends ExpandableStringEnum<RulesEngineMatchVariable> {
    /** Static value IsMobile for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable IS_MOBILE = fromString("IsMobile");

    /** Static value RemoteAddr for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REMOTE_ADDR = fromString("RemoteAddr");

    /** Static value RequestMethod for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_METHOD = fromString("RequestMethod");

    /** Static value QueryString for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable QUERY_STRING = fromString("QueryString");

    /** Static value PostArgs for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable POST_ARGS = fromString("PostArgs");

    /** Static value RequestUri for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_URI = fromString("RequestUri");

    /** Static value RequestPath for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_PATH = fromString("RequestPath");

    /** Static value RequestFilename for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_FILENAME = fromString("RequestFilename");

    /** Static value RequestFilenameExtension for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_FILENAME_EXTENSION = fromString("RequestFilenameExtension");

    /** Static value RequestHeader for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_HEADER = fromString("RequestHeader");

    /** Static value RequestBody for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_BODY = fromString("RequestBody");

    /** Static value RequestScheme for RulesEngineMatchVariable. */
    public static final RulesEngineMatchVariable REQUEST_SCHEME = fromString("RequestScheme");

    /**
     * Creates or finds a RulesEngineMatchVariable from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RulesEngineMatchVariable.
     */
    @JsonCreator
    public static RulesEngineMatchVariable fromString(String name) {
        return fromString(name, RulesEngineMatchVariable.class);
    }

    /** @return known RulesEngineMatchVariable values. */
    public static Collection<RulesEngineMatchVariable> values() {
        return values(RulesEngineMatchVariable.class);
    }
}