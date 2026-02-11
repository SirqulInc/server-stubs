package org.openapitools.api.factories;

import org.openapitools.api.RatingApiService;
import org.openapitools.api.impl.RatingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingApiServiceFactory {
    private static final RatingApiService service = new RatingApiServiceImpl();

    public static RatingApiService getRatingApi() {
        return service;
    }
}
