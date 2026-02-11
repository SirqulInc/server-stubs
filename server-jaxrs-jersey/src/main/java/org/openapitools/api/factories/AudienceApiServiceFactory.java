package org.openapitools.api.factories;

import org.openapitools.api.AudienceApiService;
import org.openapitools.api.impl.AudienceApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceApiServiceFactory {
    private static final AudienceApiService service = new AudienceApiServiceImpl();

    public static AudienceApiService getAudienceApi() {
        return service;
    }
}
