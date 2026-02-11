package org.openapitools.api.factories;

import org.openapitools.api.RankingApiService;
import org.openapitools.api.impl.RankingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankingApiServiceFactory {
    private static final RankingApiService service = new RankingApiServiceImpl();

    public static RankingApiService getRankingApi() {
        return service;
    }
}
