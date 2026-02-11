package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ApplicationConfigResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class AppconfigApiService {
    public abstract Response createApplicationConfig( @NotNull Long accountId, @NotNull String appKey, @NotNull String configVersion, @NotNull Long assetId,Long retailerId,Long retailerLocationId,String udid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteApplicationConfig( @NotNull Long accountId, @NotNull Long configId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getApplicationConfig( @NotNull Long accountId, @NotNull Long configId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getApplicationConfigByConfigVersion( @NotNull String appKey, @NotNull String configVersion,Long retailerId,Long retailerLocationId,String udid,Boolean allowOlderVersions,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchApplicationConfig( @NotNull Long accountId,String appKey,Long retailerId,Long retailerLocationId,String udid,String configVersion,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateApplicationConfig( @NotNull Long accountId, @NotNull Long configId,String appKey,String configVersion,Long assetId,Long retailerId,Long retailerLocationId,String udid,SecurityContext securityContext) throws NotFoundException;
}
