package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AppResponse;
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
public class AppApiServiceImpl extends AppApiService {
    @Override
    public Response getAppData( @NotNull Integer start,  @NotNull Integer limit, String deviceId, Long accountId, String gameType, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postAppData( @NotNull String gameType,  @NotNull Integer start,  @NotNull Integer limit,  @NotNull String data, String deviceId, Long accountId, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response regenAppData(Long accountId, String appKey, String buildVersion, String apiVersion, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
