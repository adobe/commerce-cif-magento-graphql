/*******************************************************************************
*
*    Copyright 2019 Adobe. All rights reserved.
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

import com.shopify.graphql.support.AbstractQuery;

/**
* The type contains information about a store config
*/
public class StoreConfigQuery extends AbstractQuery<StoreConfigQuery> {
    StoreConfigQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Base currency code
    */
    public StoreConfigQuery baseCurrencyCode() {
        startField("base_currency_code");

        return this;
    }

    /**
    * Base link URL for the store
    */
    public StoreConfigQuery baseLinkUrl() {
        startField("base_link_url");

        return this;
    }

    /**
    * Base media URL for the store
    */
    public StoreConfigQuery baseMediaUrl() {
        startField("base_media_url");

        return this;
    }

    /**
    * Base static URL for the store
    */
    public StoreConfigQuery baseStaticUrl() {
        startField("base_static_url");

        return this;
    }

    /**
    * Base URL for the store
    */
    public StoreConfigQuery baseUrl() {
        startField("base_url");

        return this;
    }

    /**
    * A code assigned to the store to identify it
    */
    public StoreConfigQuery code() {
        startField("code");

        return this;
    }

    /**
    * Default display currency code
    */
    public StoreConfigQuery defaultDisplayCurrencyCode() {
        startField("default_display_currency_code");

        return this;
    }

    /**
    * The ID number assigned to the store
    */
    public StoreConfigQuery id() {
        startField("id");

        return this;
    }

    /**
    * Store locale
    */
    public StoreConfigQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * Secure base link URL for the store
    */
    public StoreConfigQuery secureBaseLinkUrl() {
        startField("secure_base_link_url");

        return this;
    }

    /**
    * Secure base media URL for the store
    */
    public StoreConfigQuery secureBaseMediaUrl() {
        startField("secure_base_media_url");

        return this;
    }

    /**
    * Secure base static URL for the store
    */
    public StoreConfigQuery secureBaseStaticUrl() {
        startField("secure_base_static_url");

        return this;
    }

    /**
    * Secure base URL for the store
    */
    public StoreConfigQuery secureBaseUrl() {
        startField("secure_base_url");

        return this;
    }

    /**
    * Timezone of the store
    */
    public StoreConfigQuery timezone() {
        startField("timezone");

        return this;
    }

    /**
    * The ID number assigned to the website store belongs
    */
    public StoreConfigQuery websiteId() {
        startField("website_id");

        return this;
    }

    /**
    * The unit of weight
    */
    public StoreConfigQuery weightUnit() {
        startField("weight_unit");

        return this;
    }
}
