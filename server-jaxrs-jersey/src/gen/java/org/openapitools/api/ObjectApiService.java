package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ObjectStoreResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ObjectApiService {
    public abstract Response addField( @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName, @NotNull String fieldType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createData(String objectName,Long accountId,String body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createObject( @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteData(String objectName,String objectId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteField( @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteObject( @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getData(String objectName,String objectId,Long accountId,String include,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getObject( @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchData(String objectName, @NotNull Boolean count, @NotNull Long start, @NotNull Long limit,Long accountId,String criteria,String order,String include,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchObject( @NotNull Long accountId, @NotNull String appKey, @NotNull Long start, @NotNull Long limit,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateData(String objectName,String objectId,Long accountId,String body,SecurityContext securityContext) throws NotFoundException;
}
