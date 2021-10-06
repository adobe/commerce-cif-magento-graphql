/*******************************************************************************
 *
 *    Copyright 2020 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql;

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;

public class ShareGiftRegistrySenderInput implements Serializable {
    private String message;

    private String name;

    public ShareGiftRegistrySenderInput(String message, String name) {
        this.message = message;

        this.name = name;
    }

    /**
     * A brief message from the sender
     */
    public String getMessage() {
        return message;
    }

    /**
     * A brief message from the sender
     */
    public ShareGiftRegistrySenderInput setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The sender of the gift registry invitation
     */
    public String getName() {
        return name;
    }

    /**
     * The sender of the gift registry invitation
     */
    public ShareGiftRegistrySenderInput setName(String name) {
        this.name = name;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("message:");
        AbstractQuery.appendQuotedString(_queryBuilder, message.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        AbstractQuery.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append('}');
    }
}
