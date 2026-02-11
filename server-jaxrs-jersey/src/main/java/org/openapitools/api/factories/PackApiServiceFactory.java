package org.openapitools.api.factories;

import org.openapitools.api.PackApiService;
import org.openapitools.api.impl.PackApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PackApiServiceFactory {
    private static final PackApiService service = new PackApiServiceImpl();

    public static PackApiService getPackApi() {
        return service;
    }
}
