[![CircleCI](https://circleci.com/gh/adobe/commerce-cif-magento-graphql.svg?style=svg)](https://circleci.com/gh/adobe/commerce-cif-magento-graphql)
[![Maven Central](https://img.shields.io/maven-central/v/com.adobe.commerce.cif/magento-graphql.svg)](https://search.maven.org/search?q=g:com.adobe.commerce.cif%20AND%20a:magento-graphql)

# Magento GraphQL data models and query builders

This project contains the Magento GraphQL data models and query builders that have been automatically generated based on the default/generic (= out-of-the-box) Magento GraphQL schema. These classes can be used to build GraphQL requests and to parse/deserialise GraphQL JSON responses into java objects. These files are suitable for all projects that want to manipulate the default set of objects and attributes available in Magento, without any need to access for example customized product attributes.

If you want to access customized attributes like extra product attributes added to your product attributes set in Magento, you can use the [GraphQL Java Generator](https://github.com/adobe/graphql-java-generator) to generate a similar set of java classes that would include the custom attributes of your Magento project. 


## Installation

To build and install the latest version in a running AEM instance, simply do

```
mvn clean install sling:install
```
This installs everything by default to `localhost:4502` without any context path. You can also configure the install location with the following maven properties:
* `aem.host`: the name of the AEM instance
* `aem.port`: the port number of the AEM instance
* `aem.contextPath`: the context path (if any) of your AEM instance, starting with `/`

## Versioning

The following versioning scheme is used for that maven dependency: `MAJOR.MINOR.PATCH-magentoXYZ`.

The `MAJOR.MINOR.PATCH` parts refers to the semantic versioning of this maven artifact.

The `magentoXYZ` part refers to the version of the Magento GraphQL API, for example for Magento GraphQL `2.3.0` or `2.3.1`.

For example, the first released version of this artifact is `1.0.0-magento230`, which means that it uses the GraphQL schema from Magento `2.3.0` and is the first major version of that artifact.

## Using the query builders and parsing responses

To use this library in your project, just add the following maven dependency to your project and install the bundle in your AEM instance:

```xml
<dependency>
    <groupId>com.adobe.commerce.cif</groupId>
    <artifactId>magento-graphql</artifactId>
    <version>...</version>
    <scope>provided</scope>
</dependency>
```

You can check some examples to create GraphQL queries and parse the JSON responses in the [unit tests](src/test/java/com/adobe/cq/commerce/magento/graphql/), including a test/example showing how to use GraphQL aliases. In addition, you can use our generic [GraphQL client bundle for AEM](https://github.com/adobe/commerce-cif-graphql-client) to send the queries.

## Releases to Maven Central

Releases are triggered by manually running `mvn release:prepare release:clean` on the `master` branch. This automatically pushes a commit with a release git tag like `magento-graphql-x.y.z-magento230` which triggers a dedicated `CircleCI` build that performs the deployment of the artifact to Maven Central.

### Contributing
 
Contributions are welcomed! Read the [Contributing Guide](.github/CONTRIBUTING.md) for more information.
 
### Licensing
 
This project is licensed under the Apache V2 License. See [LICENSE](LICENSE) for more information.