package org.openapitools.api.factories;

import org.openapitools.api.NotificationApiService;
import org.openapitools.api.impl.NotificationApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationApiServiceFactory {
    private static final NotificationApiService service = new NotificationApiServiceImpl();

    public static NotificationApiService getNotificationApi() {
        return service;
    }
}
