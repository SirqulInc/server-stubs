package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
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
public class ConnectionApiServiceImpl extends ConnectionApiService {
    @Override
    public Response addConnectionsToGroup( @NotNull Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response groupSearch( @NotNull String sortField,  @NotNull Boolean descending,  @NotNull Boolean activeOnly,  @NotNull Integer start,  @NotNull Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removeConnectionsFromGroup( @NotNull Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchConnections( @NotNull Boolean returnNulls,  @NotNull Integer start,  @NotNull Integer limit, String deviceId, Long accountId, String q, String keyword, Double latitude, Double longitude, String gameType, String appKey, Integer i, Integer l, String sortField, Boolean hasLocation, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
