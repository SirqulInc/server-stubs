package org.openapitools.api.factories;

import org.openapitools.api.WorkflowApiService;
import org.openapitools.api.impl.WorkflowApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WorkflowApiServiceFactory {
    private static final WorkflowApiService service = new WorkflowApiServiceImpl();

    public static WorkflowApiService getWorkflowApi() {
        return service;
    }
}
