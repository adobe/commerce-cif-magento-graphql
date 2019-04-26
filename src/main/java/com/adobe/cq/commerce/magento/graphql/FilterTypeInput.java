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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

public class FilterTypeInput implements Serializable {
    private Input<String> eq = Input.undefined();

    private Input<List<String>> finset = Input.undefined();

    private Input<String> from = Input.undefined();

    private Input<String> gt = Input.undefined();

    private Input<String> gteq = Input.undefined();

    private Input<List<String>> in = Input.undefined();

    private Input<String> like = Input.undefined();

    private Input<String> lt = Input.undefined();

    private Input<String> lteq = Input.undefined();

    private Input<String> moreq = Input.undefined();

    private Input<String> neq = Input.undefined();

    private Input<List<String>> nin = Input.undefined();

    private Input<String> notnull = Input.undefined();

    private Input<String> nullValue = Input.undefined();

    private Input<String> to = Input.undefined();

    public String getEq() {
        return eq.getValue();
    }

    public Input<String> getEqInput() {
        return eq;
    }

    public FilterTypeInput setEq(String eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public FilterTypeInput setEqInput(Input<String> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    public List<String> getFinset() {
        return finset.getValue();
    }

    public Input<List<String>> getFinsetInput() {
        return finset;
    }

    public FilterTypeInput setFinset(List<String> finset) {
        this.finset = Input.optional(finset);
        return this;
    }

    public FilterTypeInput setFinsetInput(Input<List<String>> finset) {
        if (finset == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.finset = finset;
        return this;
    }

    public String getFrom() {
        return from.getValue();
    }

    public Input<String> getFromInput() {
        return from;
    }

    public FilterTypeInput setFrom(String from) {
        this.from = Input.optional(from);
        return this;
    }

    public FilterTypeInput setFromInput(Input<String> from) {
        if (from == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.from = from;
        return this;
    }

    public String getGt() {
        return gt.getValue();
    }

    public Input<String> getGtInput() {
        return gt;
    }

    public FilterTypeInput setGt(String gt) {
        this.gt = Input.optional(gt);
        return this;
    }

    public FilterTypeInput setGtInput(Input<String> gt) {
        if (gt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gt = gt;
        return this;
    }

    public String getGteq() {
        return gteq.getValue();
    }

    public Input<String> getGteqInput() {
        return gteq;
    }

    public FilterTypeInput setGteq(String gteq) {
        this.gteq = Input.optional(gteq);
        return this;
    }

    public FilterTypeInput setGteqInput(Input<String> gteq) {
        if (gteq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gteq = gteq;
        return this;
    }

    public List<String> getIn() {
        return in.getValue();
    }

    public Input<List<String>> getInInput() {
        return in;
    }

    public FilterTypeInput setIn(List<String> in) {
        this.in = Input.optional(in);
        return this;
    }

    public FilterTypeInput setInInput(Input<List<String>> in) {
        if (in == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.in = in;
        return this;
    }

    public String getLike() {
        return like.getValue();
    }

    public Input<String> getLikeInput() {
        return like;
    }

    public FilterTypeInput setLike(String like) {
        this.like = Input.optional(like);
        return this;
    }

    public FilterTypeInput setLikeInput(Input<String> like) {
        if (like == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.like = like;
        return this;
    }

    public String getLt() {
        return lt.getValue();
    }

    public Input<String> getLtInput() {
        return lt;
    }

    public FilterTypeInput setLt(String lt) {
        this.lt = Input.optional(lt);
        return this;
    }

    public FilterTypeInput setLtInput(Input<String> lt) {
        if (lt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lt = lt;
        return this;
    }

    public String getLteq() {
        return lteq.getValue();
    }

    public Input<String> getLteqInput() {
        return lteq;
    }

    public FilterTypeInput setLteq(String lteq) {
        this.lteq = Input.optional(lteq);
        return this;
    }

    public FilterTypeInput setLteqInput(Input<String> lteq) {
        if (lteq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lteq = lteq;
        return this;
    }

    public String getMoreq() {
        return moreq.getValue();
    }

    public Input<String> getMoreqInput() {
        return moreq;
    }

    public FilterTypeInput setMoreq(String moreq) {
        this.moreq = Input.optional(moreq);
        return this;
    }

    public FilterTypeInput setMoreqInput(Input<String> moreq) {
        if (moreq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.moreq = moreq;
        return this;
    }

    public String getNeq() {
        return neq.getValue();
    }

    public Input<String> getNeqInput() {
        return neq;
    }

    public FilterTypeInput setNeq(String neq) {
        this.neq = Input.optional(neq);
        return this;
    }

    public FilterTypeInput setNeqInput(Input<String> neq) {
        if (neq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.neq = neq;
        return this;
    }

    public List<String> getNin() {
        return nin.getValue();
    }

    public Input<List<String>> getNinInput() {
        return nin;
    }

    public FilterTypeInput setNin(List<String> nin) {
        this.nin = Input.optional(nin);
        return this;
    }

    public FilterTypeInput setNinInput(Input<List<String>> nin) {
        if (nin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.nin = nin;
        return this;
    }

    public String getNotnull() {
        return notnull.getValue();
    }

    public Input<String> getNotnullInput() {
        return notnull;
    }

    public FilterTypeInput setNotnull(String notnull) {
        this.notnull = Input.optional(notnull);
        return this;
    }

    public FilterTypeInput setNotnullInput(Input<String> notnull) {
        if (notnull == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notnull = notnull;
        return this;
    }

    public String getNull() {
        return nullValue.getValue();
    }

    public Input<String> getNullInput() {
        return nullValue;
    }

    public FilterTypeInput setNull(String nullValue) {
        this.nullValue = Input.optional(nullValue);
        return this;
    }

    public FilterTypeInput setNullInput(Input<String> nullValue) {
        if (nullValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.nullValue = nullValue;
        return this;
    }

    public String getTo() {
        return to.getValue();
    }

    public Input<String> getToInput() {
        return to;
    }

    public FilterTypeInput setTo(String to) {
        this.to = Input.optional(to);
        return this;
    }

    public FilterTypeInput setToInput(Input<String> to) {
        if (to == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.to = to;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.eq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("eq:");
            if (eq.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, eq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.finset.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("finset:");
            if (finset.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : finset.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.from.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("from:");
            if (from.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, from.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gt:");
            if (gt.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, gt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gteq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gteq:");
            if (gteq.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, gteq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.in.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("in:");
            if (in.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : in.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.like.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("like:");
            if (like.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, like.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lt:");
            if (lt.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, lt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lteq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lteq:");
            if (lteq.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, lteq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.moreq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("moreq:");
            if (moreq.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, moreq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.neq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("neq:");
            if (neq.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, neq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.nin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("nin:");
            if (nin.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : nin.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.notnull.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notnull:");
            if (notnull.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, notnull.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.nullValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("null:");
            if (nullValue.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, nullValue.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.to.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("to:");
            if (to.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, to.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
