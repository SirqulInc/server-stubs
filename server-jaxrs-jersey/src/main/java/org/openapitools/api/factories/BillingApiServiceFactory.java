package org.openapitools.api.factories;

import org.openapitools.api.BillingApiService;
import org.openapitools.api.impl.BillingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillingApiServiceFactory {
    private static final BillingApiService service = new BillingApiServiceImpl();

    public static BillingApiService getBillingApi() {
        return service;
    }
}
