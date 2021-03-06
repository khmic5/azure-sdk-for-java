// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccountType. */
public final class AccountType extends ExpandableStringEnum<AccountType> {
    /** Static value Enterprise for AccountType. */
    public static final AccountType ENTERPRISE = fromString("Enterprise");

    /** Static value Individual for AccountType. */
    public static final AccountType INDIVIDUAL = fromString("Individual");

    /** Static value Partner for AccountType. */
    public static final AccountType PARTNER = fromString("Partner");

    /**
     * Creates or finds a AccountType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccountType.
     */
    @JsonCreator
    public static AccountType fromString(String name) {
        return fromString(name, AccountType.class);
    }

    /** @return known AccountType values. */
    public static Collection<AccountType> values() {
        return values(AccountType.class);
    }
}
