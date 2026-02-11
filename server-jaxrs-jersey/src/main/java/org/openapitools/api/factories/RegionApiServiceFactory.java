package org.openapitools.api.factories;

import org.openapitools.api.RegionApiService;
import org.openapitools.api.impl.RegionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionApiServiceFactory {
    private static final RegionApiService service = new RegionApiServiceImpl();

    public static RegionApiService getRegionApi() {
        return service;
    }
}
