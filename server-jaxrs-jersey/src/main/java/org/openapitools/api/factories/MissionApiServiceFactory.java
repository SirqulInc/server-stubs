package org.openapitools.api.factories;

import org.openapitools.api.MissionApiService;
import org.openapitools.api.impl.MissionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionApiServiceFactory {
    private static final MissionApiService service = new MissionApiServiceImpl();

    public static MissionApiService getMissionApi() {
        return service;
    }
}
