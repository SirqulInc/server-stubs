package org.openapitools.api.factories;

import org.openapitools.api.CarrierApiService;
import org.openapitools.api.impl.CarrierApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CarrierApiServiceFactory {
    private static final CarrierApiService service = new CarrierApiServiceImpl();

    public static CarrierApiService getCarrierApi() {
        return service;
    }
}
