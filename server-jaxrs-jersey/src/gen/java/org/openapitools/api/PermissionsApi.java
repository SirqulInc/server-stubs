package org.openapitools.api;

import org.openapitools.api.PermissionsApiService;
import org.openapitools.api.factories.PermissionsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.UserPermissionsResponse;

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

@Path("/permissions")


@io.swagger.annotations.Api(description = "the permissions API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionsApi  {
   private final PermissionsApiService delegate;

   public PermissionsApi(@Context ServletConfig servletContext) {
      PermissionsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PermissionsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PermissionsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PermissionsApiServiceFactory.getPermissionsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Permissionables", notes = "Search on UserPermissions", response = UserPermissionsResponse.class, responseContainer = "List", tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List")
    })
    public Response searchPermissionables(@ApiParam(value = "A unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Filter results for a specific user account") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "Comma separated list of account IDs to filter results with") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "Filter user permissions by the permissionable object type", allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "The id of the permissionable object to filter by") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "Keyword to search within permissionable records") @QueryParam("keyword")  String keyword,@ApiParam(value = "Field to sort results on") @QueryParam("sortField")  String sortField,@ApiParam(value = "Sort descending when true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Return user permissions that are pending") @QueryParam("pending")  Boolean pending,@ApiParam(value = "Return user permissions that are admins") @QueryParam("admin")  Boolean admin,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPermissionables(deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, keyword, sortField, descending, pending, admin, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/distancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Permissionables by Distnace", notes = "Search on UserPermissions by distance", response = UserPermissionsResponse.class, responseContainer = "List", tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List")
    })
    public Response searchPermissionablesFollowingDistance(@ApiParam(value = "The latitude of the current account", required = true) @QueryParam("latitude") @NotNull  Double latitude,@ApiParam(value = "The longitude of the current account", required = true) @QueryParam("longitude") @NotNull  Double longitude,@ApiParam(value = "A unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Filter results for a specific user account") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "Comma separated list of account IDs to filter results with") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "Filter user permissions by the permissionable object type", allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "The id of the permissionable object to filter by") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "The search range in miles", defaultValue = "5") @DefaultValue("5") @QueryParam("searchRange")  Double searchRange,@ApiParam(value = "Keyword to search within permissionable records") @QueryParam("keyword")  String keyword,@ApiParam(value = "Return user permissions that are pending") @QueryParam("pending")  Boolean pending,@ApiParam(value = "Return user permissions that are admins") @QueryParam("admin")  Boolean admin,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPermissionablesFollowingDistance(latitude, longitude, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, searchRange, keyword, pending, admin, start, limit, securityContext);
    }
}
