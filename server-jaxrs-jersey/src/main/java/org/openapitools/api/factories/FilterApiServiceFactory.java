package org.openapitools.api.factories;

import org.openapitools.api.FilterApiService;
import org.openapitools.api.impl.FilterApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FilterApiServiceFactory {
    private static final FilterApiService service = new FilterApiServiceImpl();

    public static FilterApiService getFilterApi() {
        return service;
    }
}
