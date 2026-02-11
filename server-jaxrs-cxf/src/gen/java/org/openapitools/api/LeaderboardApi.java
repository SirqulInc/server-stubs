package org.openapitools.api;

import java.io.File;
import org.openapitools.model.LeaderboardResponse;
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
@Path("/leaderboard")
@Api(value = "/", description = "")
public interface LeaderboardApi  {

    /**
     * Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     * Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", tags={ "Leaderboard" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public LeaderboardResponse createLeaderboard(@QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("iconMedia") File iconMedia, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("bannerMedia") File bannerMedia, @QueryParam("bannerAssetId") Long bannerAssetId, @QueryParam("limitation") Integer limitation, @QueryParam("sortField") String sortField, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData);

    /**
     * Delete the Leader Board
     *
     * Removes a leader board id.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete the Leader Board", tags={ "Leaderboard" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteLeaderboard(@QueryParam("leaderboardId") @NotNull Long leaderboardId, @QueryParam("accountId") Long accountId);

    /**
     * Read a leaderboard by id and retrieve the matching ranking list
     *
     * Read a leaderboard by id and retrieve the matching ranking list
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Read a leaderboard by id and retrieve the matching ranking list", tags={ "Leaderboard" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public LeaderboardResponse getLeaderboard(@QueryParam("leaderboardId") @NotNull Long leaderboardId, @QueryParam("accountId") Long accountId, @QueryParam("includeFullRankingList") Boolean includeFullRankingList);

    /**
     * Search leaderboard and retrieve the matching ranking list
     *
     * Search leaderboard and retrieve the matching ranking list
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search leaderboard and retrieve the matching ranking list", tags={ "Leaderboard" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public LeaderboardResponse searchLeaderboards(@QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("globalOnly") Boolean globalOnly, @QueryParam("keyword") String keyword, @QueryParam("leaderboardIds") String leaderboardIds, @QueryParam("rankTypes") String rankTypes, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("includeAppResponse") Boolean includeAppResponse, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     * Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", tags={ "Leaderboard" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public LeaderboardResponse updateLeaderboard(@QueryParam("leaderboardId") @NotNull Long leaderboardId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("sortField") String sortField, @QueryParam("iconMedia") File iconMedia, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("bannerMedia") File bannerMedia, @QueryParam("bannerAssetId") Long bannerAssetId, @QueryParam("limitation") Integer limitation, @QueryParam("active") Boolean active, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData);
}
