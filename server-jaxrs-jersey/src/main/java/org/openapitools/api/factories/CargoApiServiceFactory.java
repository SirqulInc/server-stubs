package org.openapitools.api.factories;

import org.openapitools.api.CargoApiService;
import org.openapitools.api.impl.CargoApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CargoApiServiceFactory {
    private static final CargoApiService service = new CargoApiServiceImpl();

    public static CargoApiService getCargoApi() {
        return service;
    }
}
