package org.openapitools.api;

import org.openapitools.api.LikeApiService;
import org.openapitools.api.factories.LikeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.LikableResponse;
import org.openapitools.model.SearchResponse;

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

@Path("/like")


@io.swagger.annotations.Api(description = "the like API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LikeApi  {
   private final LikeApiService delegate;

   public LikeApi(@Context ServletConfig servletContext) {
      LikeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LikeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LikeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = LikeApiServiceFactory.getLikeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Like", notes = "Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.", response = LikableResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class)
    })
    public Response registerLike(@ApiParam(value = "The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}", required = true) @QueryParam("likableType") @NotNull  String likableType,@ApiParam(value = "The id of the likable object", required = true) @QueryParam("likableId") @NotNull  Long likableId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \"album\"), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "The id of the permissionable object (for sending group notifications)") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "determines whether the user likes or dislikes the object") @QueryParam("like")  Boolean like,@ApiParam(value = "This parameter is deprecated. This is deprecated, use \"appKey\" instead.") @QueryParam("app")  String app,@ApiParam(value = "This parameter is deprecated. This is deprecated, use \"appKey\" instead.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.registerLike(likableType, likableId, deviceId, accountId, permissionableType, permissionableId, like, app, gameType, appKey, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Like", notes = "Removes a like. This will make the user \"neutral\".", response = LikableResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class)
    })
    public Response removeLike(@ApiParam(value = "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}", required = true) @QueryParam("likableType") @NotNull  String likableType,@ApiParam(value = "The id of the likable object", required = true) @QueryParam("likableId") @NotNull  Long likableId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeLike(likableType, likableId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Likes", notes = "Search for likes on a likable object.", response = SearchResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class)
    })
    public Response searchLikes(@ApiParam(value = "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}", required = true) @QueryParam("likableType") @NotNull  String likableType,@ApiParam(value = "The id of the likable object", required = true) @QueryParam("likableId") @NotNull  Long likableId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Comma separated list of account IDs for filtering on users") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "The field to sort by. Possible values include: ID", defaultValue = "ID") @DefaultValue("ID") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "return items that have been updated since this date (time-stamp in milliseconds)") @QueryParam("updatedSince")  Long updatedSince,@ApiParam(value = "return items that have been updated before this date (time-stamp in milliseconds)") @QueryParam("updatedBefore")  Long updatedBefore,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchLikes(likableType, likableId, deviceId, accountId, connectionAccountIds, sortField, descending, updatedSince, updatedBefore, start, limit, securityContext);
    }
}
