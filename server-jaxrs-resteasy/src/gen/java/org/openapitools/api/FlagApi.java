package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FlagApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CountResponse;
import org.openapitools.model.FlagResponse;
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

@Path("/flag")


@io.swagger.annotations.Api(description = "the flag API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FlagApi  {

    @Inject FlagApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Flag", notes = "Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors", response = SirqulResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createFlag( @NotNull @QueryParam("flagableType") String flagableType, @NotNull @QueryParam("flagableId") Long flagableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("flagDescription") String flagDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFlag(flagableType,flagableId,deviceId,accountId,flagDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Flag", notes = "Deletes a flag.", response = SirqulResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteFlag( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @QueryParam("itemBeingFlaggedId") Long itemBeingFlaggedId, @QueryParam("flagableType") String flagableType, @QueryParam("flagableId") Long flagableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFlag(deviceId,accountId,itemBeingFlaggedType,itemBeingFlaggedId,flagableType,flagableId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Flag", notes = "Gets the details on whether the user has flagged a particular flagable object.", response = FlagResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FlagResponse.class) })
    public Response getFlag( @NotNull @QueryParam("flagableType") String flagableType, @NotNull @QueryParam("flagableId") Long flagableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFlag(flagableType,flagableId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/threshold/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Flag Threshold", notes = "Get the flag threshold value on an object type for a particular application.", response = CountResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public Response getFlagThreshold( @NotNull @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFlagThreshold(itemBeingFlaggedType,appKey,securityContext);
    }
    @POST
    @Path("/threshold/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Flag Threshold", notes = "Update the flag threshold on an object type for a particular application.", response = CountResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public Response updateFlagThreshold( @NotNull @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @NotNull @QueryParam("threshold") Long threshold, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateFlagThreshold(itemBeingFlaggedType,threshold,appKey,deviceId,accountId,securityContext);
    }
}
