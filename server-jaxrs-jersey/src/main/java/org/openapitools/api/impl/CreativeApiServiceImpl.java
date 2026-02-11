package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CreativeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CreativeApiServiceImpl extends CreativeApiService {
    @Override
    public Response addPreview( @NotNull Long accountId,  @NotNull Long creativeId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createCreative( @NotNull Long accountId,  @NotNull String name,  @NotNull Boolean active,  @NotNull Boolean waitForAsset, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Long referenceId, String appVersion, Long missionId, Long offerId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteCreative( @NotNull Long accountId,  @NotNull Long creativeId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCreative( @NotNull Long accountId,  @NotNull Long creativeId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCreativesByApplication( @NotNull Long accountId,  @NotNull String appKey,  @NotNull Integer start,  @NotNull Integer limit, Long missionId, String keyword, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removePreview( @NotNull Long accountId,  @NotNull Long creativeId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateCreative( @NotNull Long accountId,  @NotNull Long creativeId, String name, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Boolean active, Long referenceId, String appVersion, Long missionId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
