package org.openapitools.api.factories;

import org.openapitools.api.TerritoryApiService;
import org.openapitools.api.impl.TerritoryApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TerritoryApiServiceFactory {
    private static final TerritoryApiService service = new TerritoryApiServiceImpl();

    public static TerritoryApiService getTerritoryApi() {
        return service;
    }
}
