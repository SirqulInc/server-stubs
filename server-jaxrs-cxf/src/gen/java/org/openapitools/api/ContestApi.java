package org.openapitools.api;

import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
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
@Path("/consumer/album/contest")
@Api(value = "/", description = "")
public interface ContestApi  {

    /**
     * Create or Update Contest
     *
     * Creates or updates a contest.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create or Update Contest", tags={ "Contest" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public AlbumContestResponse addOrUpdateAlbumContest(@QueryParam("publicRead") @NotNull Boolean publicRead, @QueryParam("publicWrite") @NotNull Boolean publicWrite, @QueryParam("publicDelete") @NotNull Boolean publicDelete, @QueryParam("publicAdd") @NotNull Boolean publicAdd, @QueryParam("visibility") @NotNull String visibility, @QueryParam("includeFriendGroup") @NotNull Boolean includeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("contestType") String contestType, @QueryParam("albumContestId") Long albumContestId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("albumId1") Long albumId1, @QueryParam("removeAlbum1") Boolean removeAlbum1, @QueryParam("albumId2") Long albumId2, @QueryParam("removeAlbum2") Boolean removeAlbum2, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("locationDescription") String locationDescription, @QueryParam("connectionIdsToAdd") String connectionIdsToAdd, @QueryParam("connectionGroupIdsToAdd") String connectionGroupIdsToAdd, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Approve Contest
     *
     * Sets the approval status of a contest.
     *
     */
    @POST
    @Path("/approve")
    @Produces({ "*/*" })
    @ApiOperation(value = "Approve Contest", tags={ "Contest" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse approveAlbumContest(@QueryParam("albumContestId") @NotNull Long albumContestId, @QueryParam("approvalStatus") @NotNull String approvalStatus, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Delete Contest
     *
     * Deletes a contest.
     *
     */
    @POST
    @Path("/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Contest", tags={ "Contest" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteContest(@QueryParam("albumContestId") @NotNull Long albumContestId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Contest
     *
     * Gets the contest object including the likes and notes
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Contest", tags={ "Contest" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public AlbumContestResponse getAlbumContest(@QueryParam("albumContestId") @NotNull Long albumContestId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Contests
     *
     * Searches on contests.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Contests", tags={ "Contest" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumContestListResponse.class) })
    public AlbumContestListResponse getAlbumContests(@QueryParam("filter") @NotNull String filter, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appType") String appType, @QueryParam("contestType") String contestType, @QueryParam("ownerId") Long ownerId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("dateCreated") Long dateCreated, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Vote on Contest
     *
     * Vote on a collection in a contest.
     *
     */
    @POST
    @Path("/vote")
    @Produces({ "*/*" })
    @ApiOperation(value = "Vote on Contest", tags={ "Contest" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public AlbumContestResponse voteOnAlbumContest(@QueryParam("albumContestId") @NotNull Long albumContestId, @QueryParam("albumId") @NotNull Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("contestType") String contestType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
