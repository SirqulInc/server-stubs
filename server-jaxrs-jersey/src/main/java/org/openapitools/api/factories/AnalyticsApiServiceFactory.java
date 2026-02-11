package org.openapitools.api.factories;

import org.openapitools.api.AnalyticsApiService;
import org.openapitools.api.impl.AnalyticsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AnalyticsApiServiceFactory {
    private static final AnalyticsApiService service = new AnalyticsApiServiceImpl();

    public static AnalyticsApiService getAnalyticsApi() {
        return service;
    }
}
