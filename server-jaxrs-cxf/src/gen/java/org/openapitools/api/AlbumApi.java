package org.openapitools.api;

import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import java.io.File;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;

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
@Path("/album")
@Api(value = "/", description = "")
public interface AlbumApi  {

    /**
     * Create Album
     *
     * Create an Album.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Album", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public SearchResponse addAlbumCollection(@QueryParam("title") @NotNull String title, @QueryParam("coverAssetNullable") @NotNull Boolean coverAssetNullable, @QueryParam("includeCoverInAssetList") @NotNull Boolean includeCoverInAssetList, @QueryParam("publicRead") @NotNull Boolean publicRead, @QueryParam("publicWrite") @NotNull Boolean publicWrite, @QueryParam("publicDelete") @NotNull Boolean publicDelete, @QueryParam("publicAdd") @NotNull Boolean publicAdd, @QueryParam("anonymous") @NotNull Boolean anonymous, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetsToAdd") String assetsToAdd, @QueryParam("media") File media, @QueryParam("mediaURL") String mediaURL, @QueryParam("assetId") Long assetId, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaURL") String attachedMediaURL, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("description") String description, @QueryParam("albumType") String albumType, @QueryParam("albumTypeId") Long albumTypeId, @QueryParam("subType") String subType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("locationDescription") String locationDescription, @QueryParam("visibility") String visibility, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("cellPhone") String cellPhone, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("fullAddress") String fullAddress, @QueryParam("metaData") String metaData, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("includeAllAppUsersAsMembers") Boolean includeAllAppUsersAsMembers, @QueryParam("includeAudiencesAsMembers") Boolean includeAudiencesAsMembers, @QueryParam("audienceOperator") String audienceOperator, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId);

    /**
     * Add Album Users
     *
     * Add users to an album as participants.
     *
     */
    @POST
    @Path("/user/add")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add Album Users", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse addAlbumUsers(@QueryParam("albumId") @NotNull Long albumId, @QueryParam("includeFriendGroup") @NotNull Boolean includeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("read") Boolean read, @QueryParam("write") Boolean write, @QueryParam("delete") Boolean delete, @QueryParam("add") Boolean add, @QueryParam("connections") String connections, @QueryParam("connectionGroups") String connectionGroups);

    /**
     * Approve Album
     *
     * Sets the approval status of an Album.
     *
     */
    @POST
    @Path("/approve")
    @Produces({ "*/*" })
    @ApiOperation(value = "Approve Album", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse approveAlbum(@QueryParam("albumId") @NotNull Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("verified") Boolean verified);

    /**
     *  Get Album
     *
     * Get an Album.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = " Get Album", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumFullResponse.class) })
    public AlbumFullResponse getAlbumCollection(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("albumId") @NotNull Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("likePreviewSize") Integer likePreviewSize, @QueryParam("assetPreviewSize") Integer assetPreviewSize, @QueryParam("notePreviewSize") Integer notePreviewSize, @QueryParam("connectionPreviewSize") Integer connectionPreviewSize, @QueryParam("audiencePreviewSize") Integer audiencePreviewSize);

    /**
     * Leave Album
     *
     *  Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.
     *
     */
    @POST
    @Path("/user/leave")
    @Produces({ "*/*" })
    @ApiOperation(value = "Leave Album", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse leaveAlbum(@QueryParam("albumId") @NotNull Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Delete Album
     *
     * Deletes an Album
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Album", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeAlbum(@QueryParam("albumId") @NotNull Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Remove Album Users
     *
     * Remove participants of an album.
     *
     */
    @POST
    @Path("/user/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove Album Users", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeAlbumUsers(@QueryParam("albumId") @NotNull Long albumId, @QueryParam("removeFriendGroup") @NotNull Boolean removeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connections") String connections, @QueryParam("connectionGroups") String connectionGroups);

    /**
     * Search Albums
     *
     * Searches on Albums.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Albums", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumFullResponse.class, responseContainer = "List") })
    public List<AlbumFullResponse> searchAlbums(@QueryParam("filter") @NotNull String filter, @QueryParam("albumTypeId") @NotNull Long albumTypeId, @QueryParam("subType") @NotNull String subType, @QueryParam("includeInactive") @NotNull Boolean includeInactive, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("range") @NotNull Double range, @QueryParam("includeLiked") @NotNull Boolean includeLiked, @QueryParam("includeFavorited") @NotNull Boolean includeFavorited, @QueryParam("includePermissions") @NotNull Boolean includePermissions, @QueryParam("likePreviewSize") @NotNull Integer likePreviewSize, @QueryParam("assetPreviewSize") @NotNull Integer assetPreviewSize, @QueryParam("notePreviewSize") @NotNull Integer notePreviewSize, @QueryParam("connectionPreviewSize") @NotNull Integer connectionPreviewSize, @QueryParam("audiencePreviewSize") @NotNull Integer audiencePreviewSize, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("ownerId") Long ownerId, @QueryParam("albumIds") String albumIds, @QueryParam("excludeAlbumIds") String excludeAlbumIds, @QueryParam("mediaId") Long mediaId, @QueryParam("keyword") String keyword, @QueryParam("albumType") String albumType, @QueryParam("limitPerAlbumType") Integer limitPerAlbumType, @QueryParam("dateCreated") Long dateCreated, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("createdSince") Long createdSince, @QueryParam("createdBefore") Long createdBefore, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("excludeAudienceIds") String excludeAudienceIds, @QueryParam("includeCompletable") Boolean includeCompletable, @QueryParam("includeRating") Boolean includeRating, @QueryParam("searchMode") String searchMode, @QueryParam("stackSearch") Boolean stackSearch, @QueryParam("stackWindowSize") Integer stackWindowSize, @QueryParam("minStackPerPage") Integer minStackPerPage, @QueryParam("stackPaginationIdentifier") String stackPaginationIdentifier, @QueryParam("stackDetails") Boolean stackDetails, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("removeFlaggedContent") @DefaultValue("true")Boolean removeFlaggedContent, @QueryParam("verifiedFilter") Boolean verifiedFilter, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId, @QueryParam("orderAudienceId") Long orderAudienceId, @QueryParam("ignoreDefaultAppFilter") Boolean ignoreDefaultAppFilter, @QueryParam("searchExpression") String searchExpression, @QueryParam("generateAlbums") Boolean generateAlbums);

    /**
     * Update Album
     *
     * Update an Album.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Album", tags={ "Album" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumResponse.class) })
    public AlbumResponse updateAlbumCollection(@QueryParam("albumId") @NotNull Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetsToAdd") String assetsToAdd, @QueryParam("assetsToRemove") String assetsToRemove, @QueryParam("assetId") Long assetId, @QueryParam("media") File media, @QueryParam("mediaURL") String mediaURL, @QueryParam("active") Boolean active, @QueryParam("title") String title, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("description") String description, @QueryParam("albumType") String albumType, @QueryParam("albumTypeId") Long albumTypeId, @QueryParam("subType") String subType, @QueryParam("publicRead") Boolean publicRead, @QueryParam("publicWrite") Boolean publicWrite, @QueryParam("publicDelete") Boolean publicDelete, @QueryParam("publicAdd") Boolean publicAdd, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("locationDescription") String locationDescription, @QueryParam("visibility") String visibility, @QueryParam("cellPhone") String cellPhone, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("fullAddress") String fullAddress, @QueryParam("anonymous") Boolean anonymous, @QueryParam("metaData") String metaData, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("includeAllAppUsersAsMembers") Boolean includeAllAppUsersAsMembers, @QueryParam("includeAudiencesAsMembers") Boolean includeAudiencesAsMembers, @QueryParam("audienceOperator") String audienceOperator, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId, @QueryParam("indexNow") Boolean indexNow);
}
