package org.openapitools.api.factories;

import org.openapitools.api.CategoryApiService;
import org.openapitools.api.impl.CategoryApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CategoryApiServiceFactory {
    private static final CategoryApiService service = new CategoryApiServiceImpl();

    public static CategoryApiService getCategoryApi() {
        return service;
    }
}
