package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PermissionableApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/permissionable/approve")


@io.swagger.annotations.Api(description = "the permissionable API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionableApi  {

    @Inject PermissionableApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Permissionable", notes = "Sets the approval status of a permissionable object.", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response approvePermissionable( @NotNull, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @DefaultValue("APPROVED") @QueryParam("approvalStatus") String approvalStatus,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approvePermissionable(permissionableType,permissionableId,deviceId,accountId,approvalStatus,securityContext);
    }
}
