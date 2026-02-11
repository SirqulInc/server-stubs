package org.openapitools.api.factories;

import org.openapitools.api.ReservationApiService;
import org.openapitools.api.impl.ReservationApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservationApiServiceFactory {
    private static final ReservationApiService service = new ReservationApiServiceImpl();

    public static ReservationApiService getReservationApi() {
        return service;
    }
}
