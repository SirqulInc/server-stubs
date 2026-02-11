package org.openapitools.api.factories;

import org.openapitools.api.BidApiService;
import org.openapitools.api.impl.BidApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BidApiServiceFactory {
    private static final BidApiService service = new BidApiServiceImpl();

    public static BidApiService getBidApi() {
        return service;
    }
}
