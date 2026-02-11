package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LeaderboardApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.LeaderboardResponse;
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

@Path("/leaderboard")


@io.swagger.annotations.Api(description = "the leaderboard API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardApi  {

    @Inject LeaderboardApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", notes = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response createLeaderboard( @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("iconMedia") File iconMedia, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("bannerMedia") File bannerMedia, @QueryParam("bannerAssetId") Long bannerAssetId, @QueryParam("limitation") Integer limitation, @QueryParam("sortField") String sortField, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createLeaderboard(accountId,appKey,rankType,leaderboardMode,iconMedia,iconAssetId,bannerMedia,bannerAssetId,limitation,sortField,title,description,metaData,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete the Leader Board", notes = "Removes a leader board id.", response = SirqulResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteLeaderboard( @NotNull @QueryParam("leaderboardId") Long leaderboardId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteLeaderboard(leaderboardId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Read a leaderboard by id and retrieve the matching ranking list", notes = "Read a leaderboard by id and retrieve the matching ranking list", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response getLeaderboard( @NotNull @QueryParam("leaderboardId") Long leaderboardId, @QueryParam("accountId") Long accountId, @QueryParam("includeFullRankingList") Boolean includeFullRankingList,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLeaderboard(leaderboardId,accountId,includeFullRankingList,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search leaderboard and retrieve the matching ranking list", notes = "Search leaderboard and retrieve the matching ranking list", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response searchLeaderboards( @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("globalOnly") Boolean globalOnly, @QueryParam("keyword") String keyword, @QueryParam("leaderboardIds") String leaderboardIds, @QueryParam("rankTypes") String rankTypes, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("includeAppResponse") Boolean includeAppResponse, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchLeaderboards(accountId,appKey,globalOnly,keyword,leaderboardIds,rankTypes,sortField,descending,includeInactive,includeAppResponse,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", notes = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response updateLeaderboard( @NotNull @QueryParam("leaderboardId") Long leaderboardId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("sortField") String sortField, @QueryParam("iconMedia") File iconMedia, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("bannerMedia") File bannerMedia, @QueryParam("bannerAssetId") Long bannerAssetId, @QueryParam("limitation") Integer limitation, @QueryParam("active") Boolean active, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLeaderboard(leaderboardId,accountId,appKey,rankType,leaderboardMode,sortField,iconMedia,iconAssetId,bannerMedia,bannerAssetId,limitation,active,title,description,metaData,securityContext);
    }
}
