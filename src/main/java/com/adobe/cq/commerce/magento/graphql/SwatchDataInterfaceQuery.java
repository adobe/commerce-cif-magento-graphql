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

import com.shopify.graphql.support.AbstractQuery;

public class SwatchDataInterfaceQuery extends AbstractQuery<SwatchDataInterfaceQuery> {
    SwatchDataInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
     * Value of swatch item (HEX color code, image link or textual value)
     */
    public SwatchDataInterfaceQuery value() {
        startField("value");

        return this;
    }

    public SwatchDataInterfaceQuery onColorSwatchData(ColorSwatchDataQueryDefinition queryDef) {
        startInlineFragment("ColorSwatchData");
        queryDef.define(new ColorSwatchDataQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SwatchDataInterfaceQuery onImageSwatchData(ImageSwatchDataQueryDefinition queryDef) {
        startInlineFragment("ImageSwatchData");
        queryDef.define(new ImageSwatchDataQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SwatchDataInterfaceQuery onTextSwatchData(TextSwatchDataQueryDefinition queryDef) {
        startInlineFragment("TextSwatchData");
        queryDef.define(new TextSwatchDataQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
