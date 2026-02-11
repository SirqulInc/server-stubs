package org.openapitools.api.factories;

import org.openapitools.api.NoteApiService;
import org.openapitools.api.impl.NoteApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NoteApiServiceFactory {
    private static final NoteApiService service = new NoteApiServiceImpl();

    public static NoteApiService getNoteApi() {
        return service;
    }
}
