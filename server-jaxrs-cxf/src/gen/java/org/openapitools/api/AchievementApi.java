package org.openapitools.api;

import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import java.io.File;
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
@Path("/achievement")
@Api(value = "/", description = "")
public interface AchievementApi  {

    /**
     * Searches an Achievement Tier
     *
     * Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @POST
    @Path("/tier/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Searches an Achievement Tier", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public AchievementTierResponse achievementTierSearchPost(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("achievementType") Long achievementType, @QueryParam("rankType") String rankType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("descendingGoal") Boolean descendingGoal, @QueryParam("start") Long start, @QueryParam("limit") Long limit);

    /**
     * Create Achievement
     *
     * Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Achievement", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class) })
    public AchievementResponse createAchievement(@QueryParam("appKey") @NotNull String appKey, @QueryParam("title") @NotNull String title, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("analyticsTag") String analyticsTag, @QueryParam("description") String description, @QueryParam("rankType") String rankType, @QueryParam("rankIncrement") Integer rankIncrement, @QueryParam("minIncrement") Integer minIncrement, @QueryParam("maxIncrement") Integer maxIncrement, @QueryParam("validate") Boolean validate, @QueryParam("active") Boolean active, @QueryParam("triggerDefinition") String triggerDefinition);

    /**
     * Create Achievement Tier
     *
     * Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @POST
    @Path("/tier/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Achievement Tier", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public AchievementTierResponse createAchievementTier(@QueryParam("achievementId") @NotNull Long achievementId, @QueryParam("scoreAllInstances") @NotNull Boolean scoreAllInstances, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("icon") File icon, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("goalCount") Long goalCount, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Integer gameObjectId);

    /**
     * Delete Achievement
     *
     * Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Achievement", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteAchievement(@QueryParam("achievementId") @NotNull Long achievementId, @QueryParam("accountId") Long accountId);

    /**
     * Delete Achievement Tier
     *
     * Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.
     *
     */
    @POST
    @Path("/tier/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Achievement Tier", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteAchievementTier(@QueryParam("achievementTierId") @NotNull Long achievementTierId, @QueryParam("accountId") Long accountId);

    /**
     * Get Achievement
     *
     * Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Achievement", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public AchievementTierResponse getAchievement(@QueryParam("achievementId") @NotNull Long achievementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("achievementType") String achievementType);

    /**
     * Gets an achievement tier
     *
     * Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @POST
    @Path("/tier/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Gets an achievement tier", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public AchievementTierResponse getAchievementTier(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("achievementTierId") @NotNull Long achievementTierId);

    /**
     * Get Achievement Progress
     *
     * Gets a list of user achievements.
     *
     */
    @GET
    @Path("/progress/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Achievement Progress", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementProgressResponse.class, responseContainer = "List") })
    public List<AchievementProgressResponse> getUserAchievements(@QueryParam("returnNulls") @NotNull @DefaultValue("true")Boolean returnNulls, @QueryParam("appKey") @NotNull String appKey, @QueryParam("includeUndiscovered") @NotNull @DefaultValue("true")Boolean includeUndiscovered, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountEmail") String connectionAccountEmail, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("rankType") String rankType, @QueryParam("achievementType") String achievementType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * List Achievement Tags
     *
     * List achievement tags by application
     *
     */
    @GET
    @Path("/tag/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Achievement Tags", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse listAchievementTags(@QueryParam("appKey") String appKey);

    /**
     * List Achievements
     *
     * List achievements by billable.
     *
     */
    @GET
    @Path("/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Achievements", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List") })
    public List<AchievementShortResponse> listAchievements(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("achievementType") String achievementType, @QueryParam("rankType") String rankType);

    /**
     * Search Achievements
     *
     * Searches achievements by application for consumers.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Achievements", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List") })
    public List<AchievementShortResponse> searchAchievements(@QueryParam("appKey") @NotNull String appKey, @QueryParam("sortField") @NotNull @DefaultValue("TITLE")String sortField, @QueryParam("descending") @NotNull @DefaultValue("false")Boolean descending, @QueryParam("includeTiers") @NotNull @DefaultValue("false")Boolean includeTiers, @QueryParam("includeInactiveTiers") @NotNull @DefaultValue("false")Boolean includeInactiveTiers, @QueryParam("start") @NotNull @DefaultValue("0")Integer start, @QueryParam("limit") @NotNull @DefaultValue("100")Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("achievementType") String achievementType, @QueryParam("rankType") String rankType);

    /**
     * Update Achievement
     *
     * Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Achievement", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class) })
    public AchievementResponse updateAchievement(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("achievementId") Long achievementId, @QueryParam("analyticsTag") String analyticsTag, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("rankType") String rankType, @QueryParam("rankIncrement") Integer rankIncrement, @QueryParam("minIncrement") Integer minIncrement, @QueryParam("nullMinIncrement") Boolean nullMinIncrement, @QueryParam("maxIncrement") Integer maxIncrement, @QueryParam("nullMaxIncrement") Boolean nullMaxIncrement, @QueryParam("validate") Boolean validate, @QueryParam("active") Boolean active, @QueryParam("triggerDefinition") String triggerDefinition);

    /**
     * Update Achievement Tier
     *
     * Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    @POST
    @Path("/tier/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Achievement Tier", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public AchievementTierResponse updateAchievementTier(@QueryParam("achievementTierId") @NotNull Long achievementTierId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("icon") File icon, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("goalCount") Long goalCount, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("scoreAllInstances") Boolean scoreAllInstances);

    /**
     * Update Achievement Progress
     *
     * Update user achievement progress.
     *
     */
    @POST
    @Path("/progress/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Achievement Progress", tags={ "Achievement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateUserAchievement(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("achievementId") Long achievementId, @QueryParam("tag") String tag, @QueryParam("customId") Long customId, @QueryParam("increment") Long increment, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("returnProgress") Boolean returnProgress);
}
