package org.openapitools.api.factories;

import org.openapitools.api.FavoriteApiService;
import org.openapitools.api.impl.FavoriteApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FavoriteApiServiceFactory {
    private static final FavoriteApiService service = new FavoriteApiServiceImpl();

    public static FavoriteApiService getFavoriteApi() {
        return service;
    }
}
