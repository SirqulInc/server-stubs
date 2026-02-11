package org.openapitools.api.factories;

import org.openapitools.api.PersonaApiService;
import org.openapitools.api.impl.PersonaApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PersonaApiServiceFactory {
    private static final PersonaApiService service = new PersonaApiServiceImpl();

    public static PersonaApiService getPersonaApi() {
        return service;
    }
}
