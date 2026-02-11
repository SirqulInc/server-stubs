package org.openapitools.api;

import org.openapitools.api.PermissionableApiService;
import org.openapitools.api.factories.PermissionableApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/permissionable/approve")


@io.swagger.annotations.Api(description = "the permissionable API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionableApi  {
   private final PermissionableApiService delegate;

   public PermissionableApi(@Context ServletConfig servletContext) {
      PermissionableApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PermissionableApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PermissionableApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PermissionableApiServiceFactory.getPermissionableApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Permissionable", notes = "Sets the approval status of a permissionable object.", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response approvePermissionable(@ApiParam(value = "The permissionable type of the object", required = true, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER") @QueryParam("permissionableType") @NotNull  String permissionableType,@ApiParam(value = "The id of the permissionable object", required = true) @QueryParam("permissionableId") @NotNull  Long permissionableId,@ApiParam(value = "A unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}", allowableValues="PENDING, REJECTED, APPROVED, FEATURED", defaultValue = "APPROVED") @DefaultValue("APPROVED") @QueryParam("approvalStatus")  String approvalStatus,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.approvePermissionable(permissionableType, permissionableId, deviceId, accountId, approvalStatus, securityContext);
    }
}
