package org.openapitools.api.factories;

import org.openapitools.api.SimulationApiService;
import org.openapitools.api.impl.SimulationApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SimulationApiServiceFactory {
    private static final SimulationApiService service = new SimulationApiServiceImpl();

    public static SimulationApiService getSimulationApi() {
        return service;
    }
}
