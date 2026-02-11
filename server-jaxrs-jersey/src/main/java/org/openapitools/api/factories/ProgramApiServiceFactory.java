package org.openapitools.api.factories;

import org.openapitools.api.ProgramApiService;
import org.openapitools.api.impl.ProgramApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ProgramApiServiceFactory {
    private static final ProgramApiService service = new ProgramApiServiceImpl();

    public static ProgramApiService getProgramApi() {
        return service;
    }
}
