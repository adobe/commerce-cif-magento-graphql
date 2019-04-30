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

import java.io.Serializable;
import java.util.List;

public class SendEmailToFriendInput implements Serializable {
    private int productId;

    private List<SendEmailToFriendRecipientInput> recipients;

    private SendEmailToFriendSenderInput sender;

    public SendEmailToFriendInput(int productId, List<SendEmailToFriendRecipientInput> recipients, SendEmailToFriendSenderInput sender) {
        this.productId = productId;

        this.recipients = recipients;

        this.sender = sender;
    }

    public int getProductId() {
        return productId;
    }

    public SendEmailToFriendInput setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public List<SendEmailToFriendRecipientInput> getRecipients() {
        return recipients;
    }

    public SendEmailToFriendInput setRecipients(List<SendEmailToFriendRecipientInput> recipients) {
        this.recipients = recipients;
        return this;
    }

    public SendEmailToFriendSenderInput getSender() {
        return sender;
    }

    public SendEmailToFriendInput setSender(SendEmailToFriendSenderInput sender) {
        this.sender = sender;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("product_id:");
        _queryBuilder.append(productId);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("recipients:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SendEmailToFriendRecipientInput item1 : recipients) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sender:");
        sender.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
