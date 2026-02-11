package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Program;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ProgramApiService {
    public abstract Response createProgram(Program body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteProgram(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProgram(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postProgram(Long id,Program body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putProgram(Long id,Program body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchPrograms( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,String keyword,SecurityContext securityContext) throws NotFoundException;
}
