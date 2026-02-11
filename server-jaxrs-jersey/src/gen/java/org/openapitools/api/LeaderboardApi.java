package org.openapitools.api;

import org.openapitools.api.LeaderboardApiService;
import org.openapitools.api.factories.LeaderboardApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.LeaderboardResponse;
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

@Path("/leaderboard")


@io.swagger.annotations.Api(description = "the leaderboard API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardApi  {
   private final LeaderboardApiService delegate;

   public LeaderboardApi(@Context ServletConfig servletContext) {
      LeaderboardApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LeaderboardApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LeaderboardApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = LeaderboardApiServiceFactory.getLeaderboardApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", notes = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class)
    })
    public Response createLeaderboard(@ApiParam(value = "The account id of the user creating the leaderboard.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS") @QueryParam("rankType")  String rankType,@ApiParam(value = "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword") @QueryParam("leaderboardMode")  String leaderboardMode,@ApiParam(value = "a MultipartFile containing the icon image of the leaderboard (this will only be used if \"iconAssetId\" is empty)") @QueryParam("iconMedia")  File iconMedia,@ApiParam(value = "The asset ID to set the leaderboard icon") @QueryParam("iconAssetId")  Long iconAssetId,@ApiParam(value = "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \"bannerAssetId\" is empty)") @QueryParam("bannerMedia")  File bannerMedia,@ApiParam(value = "The asset ID to set the leaderboard banner") @QueryParam("bannerAssetId")  Long bannerAssetId,@ApiParam(value = "limit number of rankings for each leaderboard") @QueryParam("limitation")  Integer limitation,@ApiParam(value = "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST") @QueryParam("sortField")  String sortField,@ApiParam(value = "leaderboard's title") @QueryParam("title")  String title,@ApiParam(value = "leaderboard's description") @QueryParam("description")  String description,@ApiParam(value = "custom meta data for the leaderboard") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createLeaderboard(accountId, appKey, rankType, leaderboardMode, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, sortField, title, description, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete the Leader Board", notes = "Removes a leader board id.", response = SirqulResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteLeaderboard(@ApiParam(value = "The leaderboard id to delete.", required = true) @QueryParam("leaderboardId") @NotNull  Long leaderboardId,@ApiParam(value = "The account id of the user making the request.") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteLeaderboard(leaderboardId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Read a leaderboard by id and retrieve the matching ranking list", notes = "Read a leaderboard by id and retrieve the matching ranking list", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class)
    })
    public Response getLeaderboard(@ApiParam(value = "The leaderboard id.", required = true) @QueryParam("leaderboardId") @NotNull  Long leaderboardId,@ApiParam(value = "A valid account.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "set to true if need to return the leaderboard's full ranking list") @QueryParam("includeFullRankingList")  Boolean includeFullRankingList,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLeaderboard(leaderboardId, accountId, includeFullRankingList, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search leaderboard and retrieve the matching ranking list", notes = "Search leaderboard and retrieve the matching ranking list", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class)
    })
    public Response searchLeaderboards(@ApiParam(value = "The account id of the user requesting the search.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key.") @QueryParam("appKey")  String appKey,@ApiParam(value = "only include global leaderboards (this overrides the appKey filter)") @QueryParam("globalOnly")  Boolean globalOnly,@ApiParam(value = "keyword to search by title") @QueryParam("keyword")  String keyword,@ApiParam(value = "comma separated list of leaderboard ids to filter results with") @QueryParam("leaderboardIds")  String leaderboardIds,@ApiParam(value = "comma separated list of rankType to filter results with") @QueryParam("rankTypes")  String rankTypes,@ApiParam(value = "sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "include inactive in the result") @QueryParam("includeInactive")  Boolean includeInactive,@ApiParam(value = "determines whether to include the application response for each leaderboard") @QueryParam("includeAppResponse")  Boolean includeAppResponse,@ApiParam(value = "Start the result set at some index.") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number.") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchLeaderboards(accountId, appKey, globalOnly, keyword, leaderboardIds, rankTypes, sortField, descending, includeInactive, includeAppResponse, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", notes = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class)
    })
    public Response updateLeaderboard(@ApiParam(value = "The leaderboard id to update.", required = true) @QueryParam("leaderboardId") @NotNull  Long leaderboardId,@ApiParam(value = "The account id of the user updating the leaderboard.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.") @QueryParam("rankType")  String rankType,@ApiParam(value = "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM") @QueryParam("leaderboardMode")  String leaderboardMode,@ApiParam(value = "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST") @QueryParam("sortField")  String sortField,@ApiParam(value = "a MultipartFile containing the icon image of the leaderboard (this will only be used if \"iconAssetId\" is empty)") @QueryParam("iconMedia")  File iconMedia,@ApiParam(value = "The asset ID to set the leaderboard icon") @QueryParam("iconAssetId")  Long iconAssetId,@ApiParam(value = "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \"bannerAssetId\" is empty)") @QueryParam("bannerMedia")  File bannerMedia,@ApiParam(value = "The asset ID to set the leaderboard banner") @QueryParam("bannerAssetId")  Long bannerAssetId,@ApiParam(value = "limit number of rankings for each leaderboard") @QueryParam("limitation")  Integer limitation,@ApiParam(value = "Whether the leaderboard is active") @QueryParam("active")  Boolean active,@ApiParam(value = "leaderboard's title") @QueryParam("title")  String title,@ApiParam(value = "leaderboard's description") @QueryParam("description")  String description,@ApiParam(value = "custom meta data for the leaderboard") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateLeaderboard(leaderboardId, accountId, appKey, rankType, leaderboardMode, sortField, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, active, title, description, metaData, securityContext);
    }
}
