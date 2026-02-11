package org.openapitools.api.factories;

import org.openapitools.api.EmployeeApiService;
import org.openapitools.api.impl.EmployeeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EmployeeApiServiceFactory {
    private static final EmployeeApiService service = new EmployeeApiServiceImpl();

    public static EmployeeApiService getEmployeeApi() {
        return service;
    }
}
