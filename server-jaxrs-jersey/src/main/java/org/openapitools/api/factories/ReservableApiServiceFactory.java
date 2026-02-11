package org.openapitools.api.factories;

import org.openapitools.api.ReservableApiService;
import org.openapitools.api.impl.ReservableApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservableApiServiceFactory {
    private static final ReservableApiService service = new ReservableApiServiceImpl();

    public static ReservableApiService getReservableApi() {
        return service;
    }
}
