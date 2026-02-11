package org.openapitools.api;

import org.openapitools.api.ConnectionApiService;
import org.openapitools.api.factories.ConnectionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/connection")


@io.swagger.annotations.Api(description = "the connection API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionApi  {
   private final ConnectionApiService delegate;

   public ConnectionApi(@Context ServletConfig servletContext) {
      ConnectionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ConnectionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ConnectionApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ConnectionApiServiceFactory.getConnectionApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/group/addConnections")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connections", notes = "Adds a list of connections to a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response addConnectionsToGroup(@ApiParam(value = "the connection group ID", required = true) @QueryParam("connectionGroupId") @NotNull  Long connectionGroupId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "comma separated list of connection ids") @QueryParam("connectionIds")  String connectionIds,@ApiParam(value = "comma separated list of connection account ids") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addConnectionsToGroup(connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/group/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Connection Groups", notes = "Gets a user's private groups and default groups.", response = ConnectionInfoResponse.class, responseContainer = "List", tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionInfoResponse.class, responseContainer = "List")
    })
    public Response groupSearch(@ApiParam(value = "the field to sort by", required = true, allowableValues="CREATED, UPDATED, ACTIVE, NAME, DESCRIPTION, CAN_VIEW_PROFILE_INFO, CAN_VIEW_GAME_INFO, CAN_VIEW_FRIEND_INFO, INVITE_CODE, OWNER_DISPLAY, OWNER_USERNAME") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "whether to return results in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "to search on active only or not", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The start of the pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit of the pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "keyword search string") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.groupSearch(sortField, descending, activeOnly, start, limit, deviceId, accountId, latitude, longitude, keyword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/group/removeConnections")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Connections", notes = "Remove a list of connections from a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeConnectionsFromGroup(@ApiParam(value = "connection group id", required = true) @QueryParam("connectionGroupId") @NotNull  Long connectionGroupId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "comma separated list of connection ids") @QueryParam("connectionIds")  String connectionIds,@ApiParam(value = "comma separated list of connection account ids") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeConnectionsFromGroup(connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Possible Connections", notes = "Search for accounts that the user may not have a connection with.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class)
    })
    public Response searchConnections(@ApiParam(value = "return all json attributes if true. defualt is true.", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "start index of the pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "limit of the pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "keyword to search on, optional and this parameter is ignored if empt") @QueryParam("keyword")  String keyword,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the public application key, if provided only looks for users of that application") @QueryParam("appKey")  String appKey,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "the field to sort on") @QueryParam("sortField")  String sortField,@ApiParam(value = "whether the search has location or not") @QueryParam("hasLocation")  Boolean hasLocation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchConnections(returnNulls, start, limit, deviceId, accountId, q, keyword, latitude, longitude, gameType, appKey, i, l, sortField, hasLocation, securityContext);
    }
}
