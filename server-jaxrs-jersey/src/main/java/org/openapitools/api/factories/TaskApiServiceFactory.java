package org.openapitools.api.factories;

import org.openapitools.api.TaskApiService;
import org.openapitools.api.impl.TaskApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TaskApiServiceFactory {
    private static final TaskApiService service = new TaskApiServiceImpl();

    public static TaskApiService getTaskApi() {
        return service;
    }
}
