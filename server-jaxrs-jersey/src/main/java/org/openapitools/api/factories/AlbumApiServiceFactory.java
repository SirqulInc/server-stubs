package org.openapitools.api.factories;

import org.openapitools.api.AlbumApiService;
import org.openapitools.api.impl.AlbumApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumApiServiceFactory {
    private static final AlbumApiService service = new AlbumApiServiceImpl();

    public static AlbumApiService getAlbumApi() {
        return service;
    }
}
