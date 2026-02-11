package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AchievementApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/achievement")


@io.swagger.annotations.Api(description = "the achievement API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementApi  {

    @Inject AchievementApiService service;

    @POST
    @Path("/tier/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Searches an Achievement Tier", notes = "Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response achievementTierSearchPost( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("achievementType") Long achievementType, @QueryParam("rankType") String rankType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("descendingGoal") Boolean descendingGoal, @QueryParam("start") Long start, @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.achievementTierSearchPost(deviceId,accountId,appKey,keyword,achievementType,rankType,sortField,descending,descendingGoal,start,limit,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Achievement", notes = "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class) })
    public Response createAchievement( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("title") String title, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("analyticsTag") String analyticsTag, @QueryParam("description") String description, @QueryParam("rankType") String rankType, @QueryParam("rankIncrement") Integer rankIncrement, @QueryParam("minIncrement") Integer minIncrement, @QueryParam("maxIncrement") Integer maxIncrement, @QueryParam("validate") Boolean validate, @QueryParam("active") Boolean active, @QueryParam("triggerDefinition") String triggerDefinition,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAchievement(appKey,title,deviceId,accountId,analyticsTag,description,rankType,rankIncrement,minIncrement,maxIncrement,validate,active,triggerDefinition,securityContext);
    }
    @POST
    @Path("/tier/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Achievement Tier", notes = "Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response createAchievementTier( @NotNull @QueryParam("achievementId") Long achievementId, @NotNull @QueryParam("scoreAllInstances") Boolean scoreAllInstances, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("icon") File icon, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("goalCount") Long goalCount, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Integer gameObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAchievementTier(achievementId,scoreAllInstances,deviceId,accountId,icon,iconAssetId,title,description,goalCount,missionId,gameId,packId,gameLevelId,gameObjectId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Achievement", notes = "Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAchievement( @NotNull @QueryParam("achievementId") Long achievementId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAchievement(achievementId,accountId,securityContext);
    }
    @POST
    @Path("/tier/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Achievement Tier", notes = "Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAchievementTier( @NotNull @QueryParam("achievementTierId") Long achievementTierId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAchievementTier(achievementTierId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Achievement", notes = "Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response getAchievement( @NotNull @QueryParam("achievementId") Long achievementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("achievementType") String achievementType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAchievement(achievementId,deviceId,accountId,achievementType,securityContext);
    }
    @POST
    @Path("/tier/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Gets an achievement tier", notes = "Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response getAchievementTier( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("achievementTierId") Long achievementTierId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAchievementTier(accountId,achievementTierId,securityContext);
    }
    @GET
    @Path("/progress/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Achievement Progress", notes = "Gets a list of user achievements.", response = AchievementProgressResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementProgressResponse.class, responseContainer = "List") })
    public Response getUserAchievements( @NotNull @DefaultValue("true") @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("appKey") String appKey, @NotNull @DefaultValue("true") @QueryParam("includeUndiscovered") Boolean includeUndiscovered, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountEmail") String connectionAccountEmail, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("rankType") String rankType, @QueryParam("achievementType") String achievementType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserAchievements(returnNulls,appKey,includeUndiscovered,deviceId,accountId,connectionAccountEmail,connectionAccountId,rankType,achievementType,latitude,longitude,securityContext);
    }
    @GET
    @Path("/tag/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Achievement Tags", notes = "List achievement tags by application", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response listAchievementTags( @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAchievementTags(appKey,securityContext);
    }
    @GET
    @Path("/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Achievements", notes = "List achievements by billable.", response = AchievementShortResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List") })
    public Response listAchievements( @NotNull, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("achievementType") String achievementType, @QueryParam("rankType") String rankType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAchievements(sortField,descending,start,limit,activeOnly,deviceId,accountId,appKey,keyword,achievementType,rankType,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Achievements", notes = "Searches achievements by application for consumers.", response = AchievementShortResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List") })
    public Response searchAchievements( @NotNull @QueryParam("appKey") String appKey, @NotNull, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID" @DefaultValue("TITLE") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("false") @QueryParam("includeTiers") Boolean includeTiers, @NotNull @DefaultValue("false") @QueryParam("includeInactiveTiers") Boolean includeInactiveTiers, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("achievementType") String achievementType, @QueryParam("rankType") String rankType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAchievements(appKey,sortField,descending,includeTiers,includeInactiveTiers,start,limit,deviceId,accountId,keyword,achievementType,rankType,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement", notes = "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class) })
    public Response updateAchievement( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("achievementId") Long achievementId, @QueryParam("analyticsTag") String analyticsTag, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("rankType") String rankType, @QueryParam("rankIncrement") Integer rankIncrement, @QueryParam("minIncrement") Integer minIncrement, @QueryParam("nullMinIncrement") Boolean nullMinIncrement, @QueryParam("maxIncrement") Integer maxIncrement, @QueryParam("nullMaxIncrement") Boolean nullMaxIncrement, @QueryParam("validate") Boolean validate, @QueryParam("active") Boolean active, @QueryParam("triggerDefinition") String triggerDefinition,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAchievement(deviceId,accountId,achievementId,analyticsTag,title,description,rankType,rankIncrement,minIncrement,nullMinIncrement,maxIncrement,nullMaxIncrement,validate,active,triggerDefinition,securityContext);
    }
    @POST
    @Path("/tier/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement Tier", notes = "Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response updateAchievementTier( @NotNull @QueryParam("achievementTierId") Long achievementTierId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("icon") File icon, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("goalCount") Long goalCount, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("scoreAllInstances") Boolean scoreAllInstances,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAchievementTier(achievementTierId,deviceId,accountId,icon,iconAssetId,title,description,goalCount,missionId,gameId,packId,gameLevelId,gameObjectId,scoreAllInstances,securityContext);
    }
    @POST
    @Path("/progress/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement Progress", notes = "Update user achievement progress.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateUserAchievement( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("achievementId") Long achievementId, @QueryParam("tag") String tag, @QueryParam("customId") Long customId, @QueryParam("increment") Long increment, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("returnProgress") Boolean returnProgress,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserAchievement(accountId,achievementId,tag,customId,increment,startDate,endDate,returnProgress,securityContext);
    }
}
