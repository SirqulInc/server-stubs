package org.openapitools.api.factories;

import org.openapitools.api.AdsApiService;
import org.openapitools.api.impl.AdsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AdsApiServiceFactory {
    private static final AdsApiService service = new AdsApiServiceImpl();

    public static AdsApiService getAdsApi() {
        return service;
    }
}
