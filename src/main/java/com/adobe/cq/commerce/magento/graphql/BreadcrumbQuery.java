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
* Breadcrumb item
*/
public class BreadcrumbQuery extends AbstractQuery<BreadcrumbQuery> {
    BreadcrumbQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Category ID
    */
    public BreadcrumbQuery categoryId() {
        startField("category_id");

        return this;
    }

    /**
    * Category level
    */
    public BreadcrumbQuery categoryLevel() {
        startField("category_level");

        return this;
    }

    /**
    * Category name
    */
    public BreadcrumbQuery categoryName() {
        startField("category_name");

        return this;
    }

    /**
    * Category URL key
    */
    public BreadcrumbQuery categoryUrlKey() {
        startField("category_url_key");

        return this;
    }
}
