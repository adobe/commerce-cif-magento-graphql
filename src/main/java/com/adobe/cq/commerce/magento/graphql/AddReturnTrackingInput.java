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
import com.shopify.graphql.support.ID;

/**
 * Defines tracking information to be added to the return.
 */
public class AddReturnTrackingInput implements Serializable {
    private ID carrierUid;

    private ID returnUid;

    private String trackingNumber;

    public AddReturnTrackingInput(ID carrierUid, ID returnUid, String trackingNumber) {
        this.carrierUid = carrierUid;

        this.returnUid = returnUid;

        this.trackingNumber = trackingNumber;
    }

    /**
     * The unique ID for a `ReturnShippingCarrier` object.
     */
    public ID getCarrierUid() {
        return carrierUid;
    }

    /**
     * The unique ID for a `ReturnShippingCarrier` object.
     */
    public AddReturnTrackingInput setCarrierUid(ID carrierUid) {
        this.carrierUid = carrierUid;
        return this;
    }

    /**
     * The unique ID for a `Returns` object.
     */
    public ID getReturnUid() {
        return returnUid;
    }

    /**
     * The unique ID for a `Returns` object.
     */
    public AddReturnTrackingInput setReturnUid(ID returnUid) {
        this.returnUid = returnUid;
        return this;
    }

    /**
     * The shipping tracking number for this return request.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * The shipping tracking number for this return request.
     */
    public AddReturnTrackingInput setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("carrier_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, carrierUid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("return_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, returnUid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("tracking_number:");
        AbstractQuery.appendQuotedString(_queryBuilder, trackingNumber.toString());

        _queryBuilder.append('}');
    }
}
