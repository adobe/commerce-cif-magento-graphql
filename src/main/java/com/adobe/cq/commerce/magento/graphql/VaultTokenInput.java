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

/**
 * Contains required input for payment methods with Vault support.
 */
public class VaultTokenInput implements Serializable {
    private String publicHash;

    public VaultTokenInput(String publicHash) {
        this.publicHash = publicHash;
    }

    /**
     * The public hash of the payment token.
     */
    public String getPublicHash() {
        return publicHash;
    }

    /**
     * The public hash of the payment token.
     */
    public VaultTokenInput setPublicHash(String publicHash) {
        this.publicHash = publicHash;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("public_hash:");
        AbstractQuery.appendQuotedString(_queryBuilder, publicHash.toString());

        _queryBuilder.append('}');
    }
}
