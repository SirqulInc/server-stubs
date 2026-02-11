package org.openapitools.api.factories;

import org.openapitools.api.LeaderboardApiService;
import org.openapitools.api.impl.LeaderboardApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardApiServiceFactory {
    private static final LeaderboardApiService service = new LeaderboardApiServiceImpl();

    public static LeaderboardApiService getLeaderboardApi() {
        return service;
    }
}
