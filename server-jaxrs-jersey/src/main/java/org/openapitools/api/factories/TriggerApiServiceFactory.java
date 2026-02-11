package org.openapitools.api.factories;

import org.openapitools.api.TriggerApiService;
import org.openapitools.api.impl.TriggerApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TriggerApiServiceFactory {
    private static final TriggerApiService service = new TriggerApiServiceImpl();

    public static TriggerApiService getTriggerApi() {
        return service;
    }
}
