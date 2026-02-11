package org.openapitools.api;

import org.openapitools.api.AchievementApiService;
import org.openapitools.api.factories.AchievementApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import java.io.File;
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

@Path("/achievement")


@io.swagger.annotations.Api(description = "the achievement API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementApi  {
   private final AchievementApiService delegate;

   public AchievementApi(@Context ServletConfig servletContext) {
      AchievementApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AchievementApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AchievementApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AchievementApiServiceFactory.getAchievementApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/tier/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Searches an Achievement Tier", notes = "Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class)
    })
    public Response achievementTierSearchPost(@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)") @QueryParam("keyword")  String keyword,@ApiParam(value = "filter results by achievementType (these are exact case sensitive matches)") @QueryParam("achievementType")  Long achievementType,@ApiParam(value = "filter results by the rankType (these are the exact case sensitive matches)") @QueryParam("rankType")  String rankType,@ApiParam(value = "the field to sort by. See {@link AchievementApiMap}") @QueryParam("sortField")  String sortField,@ApiParam(value = "determines whether the sort list is in descending or ascending order (of the achievement)") @QueryParam("descending")  Boolean descending,@ApiParam(value = "determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)") @QueryParam("descendingGoal")  Boolean descendingGoal,@ApiParam(value = "The start of the index for pagination") @QueryParam("start")  Long start,@ApiParam(value = "the limit for pagination (has a hard limit of 1000)") @QueryParam("limit")  Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.achievementTierSearchPost(deviceId, accountId, appKey, keyword, achievementType, rankType, sortField, descending, descendingGoal, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Achievement", notes = "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class)
    })
    public Response createAchievement(@ApiParam(value = "the application key the achievement is for", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the title of the achievement (255 character limit)", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the analytics tag that will trigger when a user's achievement count gets updated") @QueryParam("analyticsTag")  String analyticsTag,@ApiParam(value = "the description of the achievement") @QueryParam("description")  String description,@ApiParam(value = "the rank type for updating leader boards") @QueryParam("rankType")  String rankType,@ApiParam(value = "determines how much the rank count is incremented") @QueryParam("rankIncrement")  Integer rankIncrement,@ApiParam(value = "restrict scores to be above or equal to this minimum value") @QueryParam("minIncrement")  Integer minIncrement,@ApiParam(value = "restrict scores to be below or equal to this maximum value") @QueryParam("maxIncrement")  Integer maxIncrement,@ApiParam(value = "determines whether the customId on analytics are used to validate a user's achievement progress.") @QueryParam("validate")  Boolean validate,@ApiParam(value = "achievement is active or inactive") @QueryParam("active")  Boolean active,@ApiParam(value = "if provided will define what triggers to run after a tier is completed") @QueryParam("triggerDefinition")  String triggerDefinition,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAchievement(appKey, title, deviceId, accountId, analyticsTag, description, rankType, rankIncrement, minIncrement, maxIncrement, validate, active, triggerDefinition, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/tier/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Achievement Tier", notes = "Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class)
    })
    public Response createAchievementTier(@ApiParam(value = "the achievement id for adding a new tier", required = true) @QueryParam("achievementId") @NotNull  Long achievementId,@ApiParam(value = "score all instances", required = true) @QueryParam("scoreAllInstances") @NotNull  Boolean scoreAllInstances,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "achievement tier icon image file") @QueryParam("icon")  File icon,@ApiParam(value = "the icon assetId, if icon is provided, icon will overrule") @QueryParam("iconAssetId")  Long iconAssetId,@ApiParam(value = "the title of the achievement tier") @QueryParam("title")  String title,@ApiParam(value = "the description of the achievement tier") @QueryParam("description")  String description,@ApiParam(value = "the count requirement for completing the achievement tier") @QueryParam("goalCount")  Long goalCount,@ApiParam(value = "The ID of the mission to associate with the achievement") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The ID of the game to associate with the achievement") @QueryParam("gameId")  Long gameId,@ApiParam(value = "The ID of the pack to associate with the achievement") @QueryParam("packId")  Long packId,@ApiParam(value = "The ID of the game level to associate with the achievement") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "The ID of the game object to associate with the achievement") @QueryParam("gameObjectId")  Integer gameObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAchievementTier(achievementId, scoreAllInstances, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Achievement", notes = "Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteAchievement(@ApiParam(value = "The ID of the achievement", required = true) @QueryParam("achievementId") @NotNull  Long achievementId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAchievement(achievementId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/tier/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Achievement Tier", notes = "Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteAchievementTier(@ApiParam(value = "the achievement id for deletion", required = true) @QueryParam("achievementTierId") @NotNull  Long achievementTierId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAchievementTier(achievementTierId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Achievement", notes = "Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class)
    })
    public Response getAchievement(@ApiParam(value = "The ID of the achievement", required = true) @QueryParam("achievementId") @NotNull  Long achievementId,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "achievementType") @QueryParam("achievementType")  String achievementType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAchievement(achievementId, deviceId, accountId, achievementType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/tier/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Gets an achievement tier", notes = "Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class)
    })
    public Response getAchievementTier(@ApiParam(value = "the account id of the user (deviceId or accountId required)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the achievement tier id that is being retrieved", required = true) @QueryParam("achievementTierId") @NotNull  Long achievementTierId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAchievementTier(accountId, achievementTierId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/progress/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Achievement Progress", notes = "Gets a list of user achievements.", response = AchievementProgressResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementProgressResponse.class, responseContainer = "List")
    })
    public Response getUserAchievements(@ApiParam(value = "determines whether to return null fields in the response", required = true, defaultValue = "true") @DefaultValue("true") @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the application key for filtering results by application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "determines whether to return achievements that the user has not discovered yet", required = true, defaultValue = "true") @DefaultValue("true") @QueryParam("includeUndiscovered") @NotNull  Boolean includeUndiscovered,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the email of the account to view achievements") @QueryParam("connectionAccountEmail")  String connectionAccountEmail,@ApiParam(value = "the id of the account to view achievements") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "filter results by achievement rankType") @QueryParam("rankType")  String rankType,@ApiParam(value = "filter results by achievement type") @QueryParam("achievementType")  String achievementType,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserAchievements(returnNulls, appKey, includeUndiscovered, deviceId, accountId, connectionAccountEmail, connectionAccountId, rankType, achievementType, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/tag/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Achievement Tags", notes = "List achievement tags by application", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response listAchievementTags(@ApiParam(value = "filter results by application key") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAchievementTags(appKey, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Achievements", notes = "List achievements by billable.", response = AchievementShortResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List")
    })
    public Response listAchievements(@ApiParam(value = "the field to sort by. See AchievementApiMap", required = true, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "the start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit for pagination (has a hard limit of 1000)", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Filter results to only return active achievements", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)") @QueryParam("keyword")  String keyword,@ApiParam(value = "filter results by the achievementType (these are exact case sensitive matches)") @QueryParam("achievementType")  String achievementType,@ApiParam(value = "filter results by the rankType (these are exact case sensitive matches)") @QueryParam("rankType")  String rankType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAchievements(sortField, descending, start, limit, activeOnly, deviceId, accountId, appKey, keyword, achievementType, rankType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Achievements", notes = "Searches achievements by application for consumers.", response = AchievementShortResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List")
    })
    public Response searchAchievements(@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the field to sort by. See AchievementApiMap", required = true, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID", defaultValue = "TITLE") @DefaultValue("TITLE") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "return tiers, only applicable for version >3.18", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("includeTiers") @NotNull  Boolean includeTiers,@ApiParam(value = "return inactive tiers, only applicable when includeTiers is true, only applicable for version >3.18", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("includeInactiveTiers") @NotNull  Boolean includeInactiveTiers,@ApiParam(value = "the start index for pagination", required = true, defaultValue = "0") @DefaultValue("0") @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit for pagination (has a hard limit of 1000)", required = true, defaultValue = "100") @DefaultValue("100") @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)") @QueryParam("keyword")  String keyword,@ApiParam(value = "filter results by the achievementType (these are exact case sensitive matches)") @QueryParam("achievementType")  String achievementType,@ApiParam(value = "filter results by the rankType (these are exact case sensitive matches)") @QueryParam("rankType")  String rankType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchAchievements(appKey, sortField, descending, includeTiers, includeInactiveTiers, start, limit, deviceId, accountId, keyword, achievementType, rankType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement", notes = "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class)
    })
    public Response updateAchievement(@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the achievement ID for updating an existing achievement") @QueryParam("achievementId")  Long achievementId,@ApiParam(value = "the analytics tag that will trigger when a user's achievement count gets updated") @QueryParam("analyticsTag")  String analyticsTag,@ApiParam(value = "the title of the achievement (255 character limit)") @QueryParam("title")  String title,@ApiParam(value = "the description of the achievement") @QueryParam("description")  String description,@ApiParam(value = "the rank type for updating leader boards") @QueryParam("rankType")  String rankType,@ApiParam(value = "determines how much the rank count is incremented") @QueryParam("rankIncrement")  Integer rankIncrement,@ApiParam(value = "restrict scores to be above or equal to this minimum value") @QueryParam("minIncrement")  Integer minIncrement,@ApiParam(value = "enable to ignore usage of minIncrement") @QueryParam("nullMinIncrement")  Boolean nullMinIncrement,@ApiParam(value = "restrict scores to be below or equal to this maximum value") @QueryParam("maxIncrement")  Integer maxIncrement,@ApiParam(value = "enable to ignore usage of maxIncrement") @QueryParam("nullMaxIncrement")  Boolean nullMaxIncrement,@ApiParam(value = "determines whether the customId on analytics are used to validate a user's achievement progress.") @QueryParam("validate")  Boolean validate,@ApiParam(value = "if it's active or inactive") @QueryParam("active")  Boolean active,@ApiParam(value = "if provided will define what triggers to run after a tier is completed") @QueryParam("triggerDefinition")  String triggerDefinition,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAchievement(deviceId, accountId, achievementId, analyticsTag, title, description, rankType, rankIncrement, minIncrement, nullMinIncrement, maxIncrement, nullMaxIncrement, validate, active, triggerDefinition, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/tier/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement Tier", notes = "Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class)
    })
    public Response updateAchievementTier(@ApiParam(value = "the achievement tier id for updating", required = true) @QueryParam("achievementTierId") @NotNull  Long achievementTierId,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "achievement tier icon image file") @QueryParam("icon")  File icon,@ApiParam(value = "the icon assetId, if icon is provided, icon will overrule") @QueryParam("iconAssetId")  Long iconAssetId,@ApiParam(value = "the title of the achievement tier") @QueryParam("title")  String title,@ApiParam(value = "the description of the achievement tier") @QueryParam("description")  String description,@ApiParam(value = "the count requirement for completing the achievement tier") @QueryParam("goalCount")  Long goalCount,@ApiParam(value = "The ID of the mission to associate with the achievement") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The ID of the game to associate with the achievement") @QueryParam("gameId")  Long gameId,@ApiParam(value = "The ID of the pack to associate with the achievement") @QueryParam("packId")  Long packId,@ApiParam(value = "The ID of the game level to associate with the achievement") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "The ID of the game object to associate with the achievement") @QueryParam("gameObjectId")  Long gameObjectId,@ApiParam(value = "score all instances") @QueryParam("scoreAllInstances")  Boolean scoreAllInstances,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAchievementTier(achievementTierId, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId, scoreAllInstances, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/progress/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement Progress", notes = "Update user achievement progress.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateUserAchievement(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the achievement id (achievementId or tag required)") @QueryParam("achievementId")  Long achievementId,@ApiParam(value = "the analytic tag to identify an achievement (achievementId or tag required)") @QueryParam("tag")  String tag,@ApiParam(value = "a custom identifier used for validation") @QueryParam("customId")  Long customId,@ApiParam(value = "the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement's rankIncrement value)") @QueryParam("increment")  Long increment,@ApiParam(value = "a custom start date that the client can set (not yet used in server logic)") @QueryParam("startDate")  Long startDate,@ApiParam(value = "a custom end date that the client can set (not yet used in server logic)") @QueryParam("endDate")  Long endDate,@ApiParam(value = "determines whether to return the achievement progress response") @QueryParam("returnProgress")  Boolean returnProgress,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUserAchievement(accountId, achievementId, tag, customId, increment, startDate, endDate, returnProgress, securityContext);
    }
}
