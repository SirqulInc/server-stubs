package org.openapitools.api.factories;

import org.openapitools.api.BillableApiService;
import org.openapitools.api.impl.BillableApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableApiServiceFactory {
    private static final BillableApiService service = new BillableApiServiceImpl();

    public static BillableApiService getBillableApi() {
        return service;
    }
}
