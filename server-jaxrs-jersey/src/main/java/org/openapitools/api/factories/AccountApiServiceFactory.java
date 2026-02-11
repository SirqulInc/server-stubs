package org.openapitools.api.factories;

import org.openapitools.api.AccountApiService;
import org.openapitools.api.impl.AccountApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountApiServiceFactory {
    private static final AccountApiService service = new AccountApiServiceImpl();

    public static AccountApiService getAccountApi() {
        return service;
    }
}
