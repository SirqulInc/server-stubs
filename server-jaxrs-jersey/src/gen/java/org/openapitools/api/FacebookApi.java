package org.openapitools.api;

import org.openapitools.api.FacebookApiService;
import org.openapitools.api.factories.FacebookApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TokenResponse;

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

@Path("/facebook")


@io.swagger.annotations.Api(description = "the facebook API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FacebookApi  {
   private final FacebookApiService delegate;

   public FacebookApi(@Context ServletConfig servletContext) {
      FacebookApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FacebookApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FacebookApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = FacebookApiServiceFactory.getFacebookApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/getfbtoken")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Facebook Token", notes = "Gets a user's Facebook token.", response = TokenResponse.class, tags={ "Facebook", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TokenResponse.class)
    })
    public Response getToken(@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getToken(deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/graph")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Post to Facebook", notes = "Make Facebook posts on behalf of the user.", response = SirqulResponse.class, tags={ "Facebook", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response graphInterface(@ApiParam(value = "the type of Sirqul event {DOWNLOADED_APP, CHALLENGE, LEVEL_COMPLETED, LEVEL_CREATED}", required = true) @QueryParam("event") @NotNull  String event,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "for posting about information related to an object. Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "the object id") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "used to include an asset on a Facebook post") @QueryParam("assetId")  Long assetId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.graphInterface(event, deviceId, accountId, permissionableType, permissionableId, assetId, gameType, appKey, latitude, longitude, securityContext);
    }
}
