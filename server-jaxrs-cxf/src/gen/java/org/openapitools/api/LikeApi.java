package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.LikableResponse;
import org.openapitools.model.SearchResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/like")
@Api(value = "/", description = "")
public interface LikeApi  {

    /**
     * Create Like
     *
     * Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Like", tags={ "Like" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class) })
    public LikableResponse registerLike(@PathParam("version") BigDecimal version, @QueryParam("likableType") @NotNull String likableType, @QueryParam("likableId") @NotNull Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("like") Boolean like, @QueryParam("app") String app, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Like
     *
     * Removes a like. This will make the user \&quot;neutral\&quot;.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Like", tags={ "Like" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class) })
    public LikableResponse removeLike(@PathParam("version") BigDecimal version, @QueryParam("likableType") @NotNull String likableType, @QueryParam("likableId") @NotNull Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Likes
     *
     * Search for likes on a likable object.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Likes", tags={ "Like" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public SearchResponse searchLikes(@PathParam("version") BigDecimal version, @QueryParam("likableType") @NotNull String likableType, @QueryParam("likableId") @NotNull Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("sortField") @DefaultValue("ID")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);
}
