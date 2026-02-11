package org.openapitools.api.factories;

import org.openapitools.api.PathingApiService;
import org.openapitools.api.impl.PathingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PathingApiServiceFactory {
    private static final PathingApiService service = new PathingApiServiceImpl();

    public static PathingApiService getPathingApi() {
        return service;
    }
}
