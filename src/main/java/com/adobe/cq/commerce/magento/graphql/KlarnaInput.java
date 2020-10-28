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

public class KlarnaInput implements Serializable {
    private String authorizationToken;

    public KlarnaInput(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    /**
     * The authorization token must be provided to set any Klarna Payments method
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * The authorization token must be provided to set any Klarna Payments method
     */
    public KlarnaInput setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("authorization_token:");
        AbstractQuery.appendQuotedString(_queryBuilder, authorizationToken.toString());

        _queryBuilder.append('}');
    }
}
