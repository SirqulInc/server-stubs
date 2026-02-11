package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FacebookApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TokenResponse;

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

@Path("/facebook")


@io.swagger.annotations.Api(description = "the facebook API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FacebookApi  {

    @Inject FacebookApiService service;

    @GET
    @Path("/getfbtoken")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Facebook Token", notes = "Gets a user's Facebook token.", response = TokenResponse.class, tags={ "Facebook", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TokenResponse.class) })
    public Response getToken( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getToken(deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/graph")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Post to Facebook", notes = "Make Facebook posts on behalf of the user.", response = SirqulResponse.class, tags={ "Facebook", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response graphInterface( @NotNull @QueryParam("event") String event, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("assetId") Long assetId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.graphInterface(event,deviceId,accountId,permissionableType,permissionableId,assetId,gameType,appKey,latitude,longitude,securityContext);
    }
}
