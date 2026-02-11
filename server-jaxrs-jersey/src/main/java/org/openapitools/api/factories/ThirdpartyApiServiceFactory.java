package org.openapitools.api.factories;

import org.openapitools.api.ThirdpartyApiService;
import org.openapitools.api.impl.ThirdpartyApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdpartyApiServiceFactory {
    private static final ThirdpartyApiService service = new ThirdpartyApiServiceImpl();

    public static ThirdpartyApiService getThirdpartyApi() {
        return service;
    }
}
