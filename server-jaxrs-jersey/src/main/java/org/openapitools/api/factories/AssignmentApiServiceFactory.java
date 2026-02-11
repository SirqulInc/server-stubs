package org.openapitools.api.factories;

import org.openapitools.api.AssignmentApiService;
import org.openapitools.api.impl.AssignmentApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentApiServiceFactory {
    private static final AssignmentApiService service = new AssignmentApiServiceImpl();

    public static AssignmentApiService getAssignmentApi() {
        return service;
    }
}
