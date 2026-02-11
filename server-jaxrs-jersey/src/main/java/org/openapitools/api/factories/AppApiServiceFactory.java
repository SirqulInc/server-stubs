package org.openapitools.api.factories;

import org.openapitools.api.AppApiService;
import org.openapitools.api.impl.AppApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppApiServiceFactory {
    private static final AppApiService service = new AppApiServiceImpl();

    public static AppApiService getAppApi() {
        return service;
    }
}
