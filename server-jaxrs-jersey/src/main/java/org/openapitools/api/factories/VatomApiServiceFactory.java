package org.openapitools.api.factories;

import org.openapitools.api.VatomApiService;
import org.openapitools.api.impl.VatomApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VatomApiServiceFactory {
    private static final VatomApiService service = new VatomApiServiceImpl();

    public static VatomApiService getVatomApi() {
        return service;
    }
}
