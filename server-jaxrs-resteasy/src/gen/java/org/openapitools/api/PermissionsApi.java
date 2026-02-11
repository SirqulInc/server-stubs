package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PermissionsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.UserPermissionsResponse;

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

@Path("/permissions")


@io.swagger.annotations.Api(description = "the permissions API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionsApi  {

    @Inject PermissionsApiService service;

    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Permissionables", notes = "Search on UserPermissions", response = UserPermissionsResponse.class, responseContainer = "List", tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List") })
    public Response searchPermissionables( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("connectionAccountIds") String connectionAccountIds,, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPermissionables(deviceId,accountId,connectionAccountId,connectionAccountIds,permissionableType,permissionableId,keyword,sortField,descending,pending,admin,start,limit,securityContext);
    }
    @GET
    @Path("/distancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Permissionables by Distnace", notes = "Search on UserPermissions by distance", response = UserPermissionsResponse.class, responseContainer = "List", tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List") })
    public Response searchPermissionablesFollowingDistance( @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("connectionAccountIds") String connectionAccountIds,, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @DefaultValue("5") @QueryParam("searchRange") Double searchRange, @QueryParam("keyword") String keyword, @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPermissionablesFollowingDistance(latitude,longitude,deviceId,accountId,connectionAccountId,connectionAccountIds,permissionableType,permissionableId,searchRange,keyword,pending,admin,start,limit,securityContext);
    }
}
