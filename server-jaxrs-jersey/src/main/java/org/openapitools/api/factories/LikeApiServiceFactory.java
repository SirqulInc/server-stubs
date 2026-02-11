package org.openapitools.api.factories;

import org.openapitools.api.LikeApiService;
import org.openapitools.api.impl.LikeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LikeApiServiceFactory {
    private static final LikeApiService service = new LikeApiServiceImpl();

    public static LikeApiService getLikeApi() {
        return service;
    }
}
