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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.ID;

/**
 * Contains the output schema for a company.
 */
public class CompanyQuery extends AbstractQuery<CompanyQuery> {
    CompanyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The list of all resources defined within the company.
     */
    public CompanyQuery aclResources(CompanyAclResourceQueryDefinition queryDef) {
        startField("acl_resources");

        _queryBuilder.append('{');
        queryDef.define(new CompanyAclResourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An object containing information about the company administrator.
     */
    public CompanyQuery companyAdmin(CustomerQueryDefinition queryDef) {
        startField("company_admin");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Company credit balances and limits.
     */
    public CompanyQuery credit(CompanyCreditQueryDefinition queryDef) {
        startField("credit");

        _queryBuilder.append('{');
        queryDef.define(new CompanyCreditQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CreditHistoryArguments extends Arguments {
        CreditHistoryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public CreditHistoryArguments filter(CompanyCreditHistoryFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public CreditHistoryArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        public CreditHistoryArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CreditHistoryArgumentsDefinition {
        void define(CreditHistoryArguments args);
    }

    /**
     * Details about the history of company credit operations.
     */
    public CompanyQuery creditHistory(CompanyCreditHistoryQueryDefinition queryDef) {
        return creditHistory(args -> {}, queryDef);
    }

    /**
     * Details about the history of company credit operations.
     */
    public CompanyQuery creditHistory(CreditHistoryArgumentsDefinition argsDef, CompanyCreditHistoryQueryDefinition queryDef) {
        startField("credit_history");

        CreditHistoryArguments args = new CreditHistoryArguments(_queryBuilder);
        argsDef.define(args);
        CreditHistoryArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyCreditHistoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The email address of the company contact.
     */
    public CompanyQuery email() {
        startField("email");

        return this;
    }

    /**
     * The unique ID of a `Company` object.
     */
    public CompanyQuery id() {
        startField("id");

        return this;
    }

    /**
     * The address where the company is registered to conduct business.
     */
    public CompanyQuery legalAddress(CompanyLegalAddressQueryDefinition queryDef) {
        startField("legal_address");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLegalAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The full legal name of the company.
     */
    public CompanyQuery legalName() {
        startField("legal_name");

        return this;
    }

    /**
     * The name of the company.
     */
    public CompanyQuery name() {
        startField("name");

        return this;
    }

    /**
     * The list of payment methods available to a company.
     */
    public CompanyQuery paymentMethods() {
        startField("payment_methods");

        return this;
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public CompanyQuery resellerId() {
        startField("reseller_id");

        return this;
    }

    /**
     * A company role filtered by the unique ID of a `CompanyRole` object.
     */
    public CompanyQuery role(ID id, CompanyRoleQueryDefinition queryDef) {
        startField("role");

        _queryBuilder.append("(id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RolesArguments extends Arguments {
        RolesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The maximum number of results to return at once. The default value is 20.
         */
        public RolesArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default value is 1
         */
        public RolesArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RolesArgumentsDefinition {
        void define(RolesArguments args);
    }

    /**
     * An object that contains a list of company roles.
     */
    public CompanyQuery roles(CompanyRolesQueryDefinition queryDef) {
        return roles(args -> {}, queryDef);
    }

    /**
     * An object that contains a list of company roles.
     */
    public CompanyQuery roles(RolesArgumentsDefinition argsDef, CompanyRolesQueryDefinition queryDef) {
        startField("roles");

        RolesArguments args = new RolesArguments(_queryBuilder);
        argsDef.define(args);
        RolesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An object containing information about the company sales representative.
     */
    public CompanyQuery salesRepresentative(CompanySalesRepresentativeQueryDefinition queryDef) {
        startField("sales_representative");

        _queryBuilder.append('{');
        queryDef.define(new CompanySalesRepresentativeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StructureArguments extends Arguments {
        StructureArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The ID of the node in the company structure that serves as the root for the query.
         */
        public StructureArguments rootId(ID value) {
            if (value != null) {
                startArgument("rootId");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
         * The maximum number of levels of the structure to return.
         */
        public StructureArguments depth(Integer value) {
            if (value != null) {
                startArgument("depth");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StructureArgumentsDefinition {
        void define(StructureArguments args);
    }

    /**
     * The company structure of teams and customers in depth-first order.
     */
    public CompanyQuery structure(CompanyStructureQueryDefinition queryDef) {
        return structure(args -> {}, queryDef);
    }

    /**
     * The company structure of teams and customers in depth-first order.
     */
    public CompanyQuery structure(StructureArgumentsDefinition argsDef, CompanyStructureQueryDefinition queryDef) {
        startField("structure");

        StructureArguments args = new StructureArguments(_queryBuilder);
        argsDef.define(args);
        StructureArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyStructureQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The company team data filtered by the unique ID for a `CompanyTeam` object.
     */
    public CompanyQuery team(ID id, CompanyTeamQueryDefinition queryDef) {
        startField("team");

        _queryBuilder.append("(id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyTeamQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A company user filtered by the unique ID of a `Customer` object.
     */
    public CompanyQuery user(ID id, CustomerQueryDefinition queryDef) {
        startField("user");

        _queryBuilder.append("(id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UsersArguments extends Arguments {
        UsersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The type of company users to return.
         */
        public UsersArguments filter(CompanyUsersFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * The maximum number of results to return at once. The default value is 20.
         */
        public UsersArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default value is 1.
         */
        public UsersArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UsersArgumentsDefinition {
        void define(UsersArguments args);
    }

    /**
     * An object that contains a list of company users based on activity status.
     */
    public CompanyQuery users(CompanyUsersQueryDefinition queryDef) {
        return users(args -> {}, queryDef);
    }

    /**
     * An object that contains a list of company users based on activity status.
     */
    public CompanyQuery users(UsersArgumentsDefinition argsDef, CompanyUsersQueryDefinition queryDef) {
        startField("users");

        UsersArguments args = new UsersArguments(_queryBuilder);
        argsDef.define(args);
        UsersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyUsersQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public CompanyQuery vatTaxId() {
        startField("vat_tax_id");

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<CompanyQuery> createFragment(String name, CompanyQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CompanyQuery(sb));
        return new Fragment<>(name, "Company", sb.toString());
    }

    /**
     * Adds a <code>CompanyQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CompanyQuery addFragmentReference(Fragment<CompanyQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}
