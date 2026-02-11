package org.openapitools.api.factories;

import org.openapitools.api.LevelApiService;
import org.openapitools.api.impl.LevelApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LevelApiServiceFactory {
    private static final LevelApiService service = new LevelApiServiceImpl();

    public static LevelApiService getLevelApi() {
        return service;
    }
}
