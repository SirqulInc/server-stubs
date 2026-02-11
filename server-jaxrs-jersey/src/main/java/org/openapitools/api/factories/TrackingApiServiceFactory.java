package org.openapitools.api.factories;

import org.openapitools.api.TrackingApiService;
import org.openapitools.api.impl.TrackingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrackingApiServiceFactory {
    private static final TrackingApiService service = new TrackingApiServiceImpl();

    public static TrackingApiService getTrackingApi() {
        return service;
    }
}
