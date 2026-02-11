package org.openapitools.api.factories;

import org.openapitools.api.FlagApiService;
import org.openapitools.api.impl.FlagApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FlagApiServiceFactory {
    private static final FlagApiService service = new FlagApiServiceImpl();

    public static FlagApiService getFlagApi() {
        return service;
    }
}
