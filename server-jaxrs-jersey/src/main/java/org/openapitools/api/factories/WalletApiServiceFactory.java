package org.openapitools.api.factories;

import org.openapitools.api.WalletApiService;
import org.openapitools.api.impl.WalletApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WalletApiServiceFactory {
    private static final WalletApiService service = new WalletApiServiceImpl();

    public static WalletApiService getWalletApi() {
        return service;
    }
}
