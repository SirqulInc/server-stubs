package org.openapitools.api.factories;

import org.openapitools.api.CreativeApiService;
import org.openapitools.api.impl.CreativeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CreativeApiServiceFactory {
    private static final CreativeApiService service = new CreativeApiServiceImpl();

    public static CreativeApiService getCreativeApi() {
        return service;
    }
}
