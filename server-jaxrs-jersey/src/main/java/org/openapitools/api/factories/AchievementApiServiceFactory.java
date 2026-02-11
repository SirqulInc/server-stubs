package org.openapitools.api.factories;

import org.openapitools.api.AchievementApiService;
import org.openapitools.api.impl.AchievementApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementApiServiceFactory {
    private static final AchievementApiService service = new AchievementApiServiceImpl();

    public static AchievementApiService getAchievementApi() {
        return service;
    }
}
