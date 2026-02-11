package org.openapitools.api.factories;

import org.openapitools.api.ConsumerApiService;
import org.openapitools.api.impl.ConsumerApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConsumerApiServiceFactory {
    private static final ConsumerApiService service = new ConsumerApiServiceImpl();

    public static ConsumerApiService getConsumerApi() {
        return service;
    }
}
