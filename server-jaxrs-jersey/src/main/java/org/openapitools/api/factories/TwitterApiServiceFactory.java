package org.openapitools.api.factories;

import org.openapitools.api.TwitterApiService;
import org.openapitools.api.impl.TwitterApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TwitterApiServiceFactory {
    private static final TwitterApiService service = new TwitterApiServiceImpl();

    public static TwitterApiService getTwitterApi() {
        return service;
    }
}
