package org.openapitools.api;

import org.openapitools.api.FlagApiService;
import org.openapitools.api.factories.FlagApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CountResponse;
import org.openapitools.model.FlagResponse;
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

@Path("/flag")


@io.swagger.annotations.Api(description = "the flag API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FlagApi  {
   private final FlagApiService delegate;

   public FlagApi(@Context ServletConfig servletContext) {
      FlagApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FlagApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FlagApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = FlagApiServiceFactory.getFlagApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Flag", notes = "Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors", response = SirqulResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response createFlag(@ApiParam(value = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}", required = true) @QueryParam("flagableType") @NotNull  String flagableType,@ApiParam(value = "The flagable object id", required = true) @QueryParam("flagableId") @NotNull  Long flagableId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "An optional description of why is it being flagged") @QueryParam("flagDescription")  String flagDescription,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createFlag(flagableType, flagableId, deviceId, accountId, flagDescription, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Flag", notes = "Deletes a flag.", response = SirqulResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteFlag(@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("itemBeingFlaggedType")  String itemBeingFlaggedType,@ApiParam(value = "This parameter is deprecated.") @QueryParam("itemBeingFlaggedId")  Long itemBeingFlaggedId,@ApiParam(value = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}") @QueryParam("flagableType")  String flagableType,@ApiParam(value = "The flagable object id") @QueryParam("flagableId")  Long flagableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteFlag(deviceId, accountId, itemBeingFlaggedType, itemBeingFlaggedId, flagableType, flagableId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Flag", notes = "Gets the details on whether the user has flagged a particular flagable object.", response = FlagResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FlagResponse.class)
    })
    public Response getFlag(@ApiParam(value = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}", required = true) @QueryParam("flagableType") @NotNull  String flagableType,@ApiParam(value = "The flagable object id", required = true) @QueryParam("flagableId") @NotNull  Long flagableId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFlag(flagableType, flagableId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/threshold/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Flag Threshold", notes = "Get the flag threshold value on an object type for a particular application.", response = CountResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class)
    })
    public Response getFlagThreshold(@ApiParam(value = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}", required = true) @QueryParam("itemBeingFlaggedType") @NotNull  String itemBeingFlaggedType,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFlagThreshold(itemBeingFlaggedType, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/threshold/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Flag Threshold", notes = "Update the flag threshold on an object type for a particular application.", response = CountResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class)
    })
    public Response updateFlagThreshold(@ApiParam(value = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}", required = true) @QueryParam("itemBeingFlaggedType") @NotNull  String itemBeingFlaggedType,@ApiParam(value = "The threshold value", required = true) @QueryParam("threshold") @NotNull  Long threshold,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateFlagThreshold(itemBeingFlaggedType, threshold, appKey, deviceId, accountId, securityContext);
    }
}
