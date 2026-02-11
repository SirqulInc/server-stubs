package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CsvImportResponse;
import java.io.File;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class CsvimportApiService {
    public abstract Response getStatusCSV( @NotNull Long accountId, @NotNull Long batchId, @NotNull String responseGroup, @NotNull Long start, @NotNull Long limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listStatusCSV( @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response statusCSV( @NotNull Long accountId, @NotNull Long batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadCSV( @NotNull Long accountId, @NotNull String uploadType, @NotNull File importFile, @NotNull String fileFormat,String appKey,SecurityContext securityContext) throws NotFoundException;
}
