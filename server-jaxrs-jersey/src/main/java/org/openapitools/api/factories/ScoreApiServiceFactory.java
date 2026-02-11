package org.openapitools.api.factories;

import org.openapitools.api.ScoreApiService;
import org.openapitools.api.impl.ScoreApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScoreApiServiceFactory {
    private static final ScoreApiService service = new ScoreApiServiceImpl();

    public static ScoreApiService getScoreApi() {
        return service;
    }
}
