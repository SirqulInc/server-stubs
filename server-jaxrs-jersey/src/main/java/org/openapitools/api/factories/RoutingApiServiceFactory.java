package org.openapitools.api.factories;

import org.openapitools.api.RoutingApiService;
import org.openapitools.api.impl.RoutingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RoutingApiServiceFactory {
    private static final RoutingApiService service = new RoutingApiServiceImpl();

    public static RoutingApiService getRoutingApi() {
        return service;
    }
}
