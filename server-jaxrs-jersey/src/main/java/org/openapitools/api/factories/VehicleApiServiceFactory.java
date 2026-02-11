package org.openapitools.api.factories;

import org.openapitools.api.VehicleApiService;
import org.openapitools.api.impl.VehicleApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleApiServiceFactory {
    private static final VehicleApiService service = new VehicleApiServiceImpl();

    public static VehicleApiService getVehicleApi() {
        return service;
    }
}
