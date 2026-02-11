package org.openapitools.api.factories;

import org.openapitools.api.ShipmentApiService;
import org.openapitools.api.impl.ShipmentApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentApiServiceFactory {
    private static final ShipmentApiService service = new ShipmentApiServiceImpl();

    public static ShipmentApiService getShipmentApi() {
        return service;
    }
}
