package org.openapitools.api.factories;

import org.openapitools.api.StopApiService;
import org.openapitools.api.impl.StopApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StopApiServiceFactory {
    private static final StopApiService service = new StopApiServiceImpl();

    public static StopApiService getStopApi() {
        return service;
    }
}
