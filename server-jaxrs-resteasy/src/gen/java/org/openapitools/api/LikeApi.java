package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LikeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.LikableResponse;
import org.openapitools.model.SearchResponse;

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

@Path("/like")


@io.swagger.annotations.Api(description = "the like API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LikeApi  {

    @Inject LikeApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Like", notes = "Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.", response = LikableResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class) })
    public Response registerLike( @NotNull @QueryParam("likableType") String likableType, @NotNull @QueryParam("likableId") Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("like") Boolean like, @QueryParam("app") String app, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.registerLike(likableType,likableId,deviceId,accountId,permissionableType,permissionableId,like,app,gameType,appKey,latitude,longitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Like", notes = "Removes a like. This will make the user \"neutral\".", response = LikableResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class) })
    public Response removeLike( @NotNull @QueryParam("likableType") String likableType, @NotNull @QueryParam("likableId") Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeLike(likableType,likableId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Likes", notes = "Search for likes on a likable object.", response = SearchResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public Response searchLikes( @NotNull @QueryParam("likableType") String likableType, @NotNull @QueryParam("likableId") Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountIds") String connectionAccountIds, @DefaultValue("ID") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchLikes(likableType,likableId,deviceId,accountId,connectionAccountIds,sortField,descending,updatedSince,updatedBefore,start,limit,securityContext);
    }
}
