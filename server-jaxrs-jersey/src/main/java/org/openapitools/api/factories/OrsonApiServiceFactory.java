package org.openapitools.api.factories;

import org.openapitools.api.OrsonApiService;
import org.openapitools.api.impl.OrsonApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonApiServiceFactory {
    private static final OrsonApiService service = new OrsonApiServiceImpl();

    public static OrsonApiService getOrsonApi() {
        return service;
    }
}
