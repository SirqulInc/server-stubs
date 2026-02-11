package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ConnectionApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/connection")


@io.swagger.annotations.Api(description = "the connection API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionApi  {

    @Inject ConnectionApiService service;

    @POST
    @Path("/group/addConnections")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connections", notes = "Adds a list of connections to a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addConnectionsToGroup( @NotNull @QueryParam("connectionGroupId") Long connectionGroupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addConnectionsToGroup(connectionGroupId,deviceId,accountId,connectionIds,connectionAccountIds,latitude,longitude,securityContext);
    }
    @GET
    @Path("/group/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Connection Groups", notes = "Gets a user's private groups and default groups.", response = ConnectionInfoResponse.class, responseContainer = "List", tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionInfoResponse.class, responseContainer = "List") })
    public Response groupSearch( @NotNull, allowableValues="CREATED, UPDATED, ACTIVE, NAME, DESCRIPTION, CAN_VIEW_PROFILE_INFO, CAN_VIEW_GAME_INFO, CAN_VIEW_FRIEND_INFO, INVITE_CODE, OWNER_DISPLAY, OWNER_USERNAME" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.groupSearch(sortField,descending,activeOnly,start,limit,deviceId,accountId,latitude,longitude,keyword,securityContext);
    }
    @POST
    @Path("/group/removeConnections")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Connections", notes = "Remove a list of connections from a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeConnectionsFromGroup( @NotNull @QueryParam("connectionGroupId") Long connectionGroupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeConnectionsFromGroup(connectionGroupId,deviceId,accountId,connectionIds,connectionAccountIds,latitude,longitude,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Possible Connections", notes = "Search for accounts that the user may not have a connection with.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public Response searchConnections( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("sortField") String sortField, @QueryParam("hasLocation") Boolean hasLocation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchConnections(returnNulls,start,limit,deviceId,accountId,q,keyword,latitude,longitude,gameType,appKey,i,l,sortField,hasLocation,securityContext);
    }
}
