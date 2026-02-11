package org.openapitools.api.factories;

import org.openapitools.api.ReportApiService;
import org.openapitools.api.impl.ReportApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportApiServiceFactory {
    private static final ReportApiService service = new ReportApiServiceImpl();

    public static ReportApiService getReportApi() {
        return service;
    }
}
