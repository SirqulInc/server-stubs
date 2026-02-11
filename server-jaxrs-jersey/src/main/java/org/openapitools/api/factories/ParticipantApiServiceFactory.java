package org.openapitools.api.factories;

import org.openapitools.api.ParticipantApiService;
import org.openapitools.api.impl.ParticipantApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ParticipantApiServiceFactory {
    private static final ParticipantApiService service = new ParticipantApiServiceImpl();

    public static ParticipantApiService getParticipantApi() {
        return service;
    }
}
