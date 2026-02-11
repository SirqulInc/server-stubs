package org.openapitools.api.factories;

import org.openapitools.api.OpenaiApiService;
import org.openapitools.api.impl.OpenaiApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OpenaiApiServiceFactory {
    private static final OpenaiApiService service = new OpenaiApiServiceImpl();

    public static OpenaiApiService getOpenaiApi() {
        return service;
    }
}
