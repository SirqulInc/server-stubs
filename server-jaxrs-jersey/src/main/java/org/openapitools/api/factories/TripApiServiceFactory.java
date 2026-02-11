package org.openapitools.api.factories;

import org.openapitools.api.TripApiService;
import org.openapitools.api.impl.TripApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TripApiServiceFactory {
    private static final TripApiService service = new TripApiServiceImpl();

    public static TripApiService getTripApi() {
        return service;
    }
}
