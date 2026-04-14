# Magento GraphQL Data Models and Query Builders

Auto-generated Java bindings for the Adobe Commerce (Magento) GraphQL schema. Packaged as an OSGi bundle for AEM.

## Build

Requires JDK 11+. Single-module Maven project.

- `mvn clean install` — build and run tests
- `mvn clean install sling:install` — build and deploy to AEM (default: localhost:4502)
- `mvn clean install -Pformat-code` — build and auto-format code + sort imports

## Testing

- **Unit tests** — JUnit 4: `mvn test`

## Code Style

- **Formatter**: Eclipse-based (`eclipse-formatter.xml`), 4-space indent, 140-char line width, spaces (no tabs)
- **Import order**: `java`, `javax`, `org`, then others; static imports last. Enforced by `impsort-maven-plugin`
- **License headers**: Apache 2.0, enforced by `apache-rat-plugin` at compile phase. All Java files must have the header
- **Auto-fix**: `mvn clean install -Pformat-code` reformats code and sorts imports
- **Validation only**: `mvn verify` checks formatting and import order without modifying files

## Module Map

Single-module project. Key packages:

| Package | Path | Description |
|---------|------|-------------|
| `c.a.c.c.magento.graphql` | `src/main/java/.../graphql/` | Generated types, query builders, inputs, enums |
| `c.a.c.c.magento.graphql.gson` | `src/main/java/.../gson/` | Gson deserializers for Query and Mutation responses |
| `c.s.graphql.support` | `src/main/java/com/shopify/graphql/support/` | GraphQL support framework (AbstractQuery, AbstractResponse, etc.) |

## Architecture

- **Code generation**: Most classes are auto-generated from the Magento GraphQL schema via [graphql-java-generator](https://github.com/adobe/graphql-java-generator). Do not manually edit generated files
- **Type pattern**: Each GraphQL object type produces 3-4 files:
  - `Foo.java` — data model (extends `AbstractResponse`)
  - `FooQuery.java` — query builder (extends `AbstractQuery`)
  - `FooQueryDefinition.java` — functional interface for nested query definitions
- **Input types**: Mutable POJOs with fluent setters (return `this`). Constructor takes required fields; optional fields via setters
- **Enums**: Map to Java enums with an `UNKNOWN_VALUE` sentinel for forward compatibility
- **Custom fields**: Queries support `addCustomField()` / responses support `getCustomField()` for schema extensions without regeneration
- **Deserialization**: `QueryDeserializer` and `MutationDeserializer` in the `gson` package parse JSON into the generated types
- **OSGi exports**: `com.adobe.cq.commerce.magento.graphql`, `com.adobe.cq.commerce.magento.graphql.gson`, `com.shopify.graphql.support`
