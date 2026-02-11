package org.openapitools.api.factories;

import org.openapitools.api.RetailerApiService;
import org.openapitools.api.impl.RetailerApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerApiServiceFactory {
    private static final RetailerApiService service = new RetailerApiServiceImpl();

    public static RetailerApiService getRetailerApi() {
        return service;
    }
}
