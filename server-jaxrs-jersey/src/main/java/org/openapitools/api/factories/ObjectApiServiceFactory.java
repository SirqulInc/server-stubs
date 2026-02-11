package org.openapitools.api.factories;

import org.openapitools.api.ObjectApiService;
import org.openapitools.api.impl.ObjectApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ObjectApiServiceFactory {
    private static final ObjectApiService service = new ObjectApiServiceImpl();

    public static ObjectApiService getObjectApi() {
        return service;
    }
}
