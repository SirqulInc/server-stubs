package org.openapitools.api

import org.openapitools.model.AchievementProgressResponse
import org.openapitools.model.AchievementResponse
import org.openapitools.model.AchievementShortResponse
import org.openapitools.model.AchievementTierResponse
import org.openapitools.model.SirqulResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class AchievementApiController() {

    @Operation(
        summary = "Searches an Achievement Tier",
        operationId = "achievementTierSearchPost",
        description = """Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementTierResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/tier/search"
        value = [PATH_ACHIEVEMENT_TIER_SEARCH_POST],
        produces = ["*/*"]
    )
    fun achievementTierSearchPost(
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "filter results by achievementType (these are exact case sensitive matches)") @Valid @RequestParam(value = "achievementType", required = false) achievementType: kotlin.Long?,
        @Parameter(description = "filter results by the rankType (these are the exact case sensitive matches)") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "the field to sort by. See {@link AchievementApiMap}") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "determines whether the sort list is in descending or ascending order (of the achievement)") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)") @Valid @RequestParam(value = "descendingGoal", required = false) descendingGoal: kotlin.Boolean?,
        @Parameter(description = "The start of the index for pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "the limit for pagination (has a hard limit of 1000)") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Long?
    ): ResponseEntity<AchievementTierResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Achievement",
        operationId = "createAchievement",
        description = """Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/create"
        value = [PATH_CREATE_ACHIEVEMENT],
        produces = ["*/*"]
    )
    fun createAchievement(
        @NotNull @Parameter(description = "the application key the achievement is for", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the title of the achievement (255 character limit)", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the analytics tag that will trigger when a user's achievement count gets updated") @Valid @RequestParam(value = "analyticsTag", required = false) analyticsTag: kotlin.String?,
        @Parameter(description = "the description of the achievement") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the rank type for updating leader boards") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "determines how much the rank count is incremented") @Valid @RequestParam(value = "rankIncrement", required = false) rankIncrement: kotlin.Int?,
        @Parameter(description = "restrict scores to be above or equal to this minimum value") @Valid @RequestParam(value = "minIncrement", required = false) minIncrement: kotlin.Int?,
        @Parameter(description = "restrict scores to be below or equal to this maximum value") @Valid @RequestParam(value = "maxIncrement", required = false) maxIncrement: kotlin.Int?,
        @Parameter(description = "determines whether the customId on analytics are used to validate a user's achievement progress.") @Valid @RequestParam(value = "validate", required = false) validate: kotlin.Boolean?,
        @Parameter(description = "achievement is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "if provided will define what triggers to run after a tier is completed") @Valid @RequestParam(value = "triggerDefinition", required = false) triggerDefinition: kotlin.String?
    ): ResponseEntity<AchievementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Achievement Tier",
        operationId = "createAchievementTier",
        description = """Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementTierResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/tier/create"
        value = [PATH_CREATE_ACHIEVEMENT_TIER],
        produces = ["*/*"]
    )
    fun createAchievementTier(
        @NotNull @Parameter(description = "the achievement id for adding a new tier", required = true) @Valid @RequestParam(value = "achievementId", required = true) achievementId: kotlin.Long,
        @NotNull @Parameter(description = "score all instances", required = true) @Valid @RequestParam(value = "scoreAllInstances", required = true) scoreAllInstances: kotlin.Boolean,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "achievement tier icon image file") @Valid @RequestParam(value = "icon", required = false) icon: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "the icon assetId, if icon is provided, icon will overrule") @Valid @RequestParam(value = "iconAssetId", required = false) iconAssetId: kotlin.Long?,
        @Parameter(description = "the title of the achievement tier") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the description of the achievement tier") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the count requirement for completing the achievement tier") @Valid @RequestParam(value = "goalCount", required = false) goalCount: kotlin.Long?,
        @Parameter(description = "The ID of the mission to associate with the achievement") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The ID of the game to associate with the achievement") @Valid @RequestParam(value = "gameId", required = false) gameId: kotlin.Long?,
        @Parameter(description = "The ID of the pack to associate with the achievement") @Valid @RequestParam(value = "packId", required = false) packId: kotlin.Long?,
        @Parameter(description = "The ID of the game level to associate with the achievement") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "The ID of the game object to associate with the achievement") @Valid @RequestParam(value = "gameObjectId", required = false) gameObjectId: kotlin.Int?
    ): ResponseEntity<AchievementTierResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Achievement",
        operationId = "deleteAchievement",
        description = """Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/delete"
        value = [PATH_DELETE_ACHIEVEMENT],
        produces = ["*/*"]
    )
    fun deleteAchievement(
        @NotNull @Parameter(description = "The ID of the achievement", required = true) @Valid @RequestParam(value = "achievementId", required = true) achievementId: kotlin.Long,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Achievement Tier",
        operationId = "deleteAchievementTier",
        description = """Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/tier/delete"
        value = [PATH_DELETE_ACHIEVEMENT_TIER],
        produces = ["*/*"]
    )
    fun deleteAchievementTier(
        @NotNull @Parameter(description = "the achievement id for deletion", required = true) @Valid @RequestParam(value = "achievementTierId", required = true) achievementTierId: kotlin.Long,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Achievement",
        operationId = "getAchievement",
        description = """Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementTierResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/achievement/get"
        value = [PATH_GET_ACHIEVEMENT],
        produces = ["*/*"]
    )
    fun getAchievement(
        @NotNull @Parameter(description = "The ID of the achievement", required = true) @Valid @RequestParam(value = "achievementId", required = true) achievementId: kotlin.Long,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "achievementType") @Valid @RequestParam(value = "achievementType", required = false) achievementType: kotlin.String?
    ): ResponseEntity<AchievementTierResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Gets an achievement tier",
        operationId = "getAchievementTier",
        description = """Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementTierResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/tier/get"
        value = [PATH_GET_ACHIEVEMENT_TIER],
        produces = ["*/*"]
    )
    fun getAchievementTier(
        @NotNull @Parameter(description = "the account id of the user (deviceId or accountId required)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the achievement tier id that is being retrieved", required = true) @Valid @RequestParam(value = "achievementTierId", required = true) achievementTierId: kotlin.Long
    ): ResponseEntity<AchievementTierResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Achievement Progress",
        operationId = "getUserAchievements",
        description = """Gets a list of user achievements.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AchievementProgressResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/achievement/progress/get"
        value = [PATH_GET_USER_ACHIEVEMENTS],
        produces = ["*/*"]
    )
    fun getUserAchievements(
        @NotNull @Parameter(description = "determines whether to return null fields in the response", required = true, schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "returnNulls", required = true, defaultValue = "true") returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the application key for filtering results by application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "determines whether to return achievements that the user has not discovered yet", required = true, schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "includeUndiscovered", required = true, defaultValue = "true") includeUndiscovered: kotlin.Boolean,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the email of the account to view achievements") @Valid @RequestParam(value = "connectionAccountEmail", required = false) connectionAccountEmail: kotlin.String?,
        @Parameter(description = "the id of the account to view achievements") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "filter results by achievement rankType") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "filter results by achievement type") @Valid @RequestParam(value = "achievementType", required = false) achievementType: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<List<AchievementProgressResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Achievement Tags",
        operationId = "listAchievementTags",
        description = """List achievement tags by application""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/achievement/tag/list"
        value = [PATH_LIST_ACHIEVEMENT_TAGS],
        produces = ["*/*"]
    )
    fun listAchievementTags(
        @Parameter(description = "filter results by application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Achievements",
        operationId = "listAchievements",
        description = """List achievements by billable.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AchievementShortResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/achievement/list"
        value = [PATH_LIST_ACHIEVEMENTS],
        produces = ["*/*"]
    )
    fun listAchievements(
        @NotNull @Parameter(description = "the field to sort by. See AchievementApiMap", required = true, schema = Schema(allowableValues = ["CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "TITLE", "DESCRIPTION", "RANK_TYPE", "APPLICATION_ID", "APPLICATION_NAME", "BILLABLE_ID"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "the start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit for pagination (has a hard limit of 1000)", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Filter results to only return active achievements", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "filter results by the achievementType (these are exact case sensitive matches)") @Valid @RequestParam(value = "achievementType", required = false) achievementType: kotlin.String?,
        @Parameter(description = "filter results by the rankType (these are exact case sensitive matches)") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?
    ): ResponseEntity<List<AchievementShortResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Achievements",
        operationId = "searchAchievements",
        description = """Searches achievements by application for consumers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AchievementShortResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/achievement/search"
        value = [PATH_SEARCH_ACHIEVEMENTS],
        produces = ["*/*"]
    )
    fun searchAchievements(
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the field to sort by. See AchievementApiMap", required = true, schema = Schema(allowableValues = ["CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "TITLE", "DESCRIPTION", "RANK_TYPE", "APPLICATION_ID", "APPLICATION_NAME", "BILLABLE_ID"], defaultValue = "TITLE")) @Valid @RequestParam(value = "sortField", required = true, defaultValue = "TITLE") sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = true, defaultValue = "false") descending: kotlin.Boolean,
        @NotNull @Parameter(description = "return tiers, only applicable for version >3.18", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeTiers", required = true, defaultValue = "false") includeTiers: kotlin.Boolean,
        @NotNull @Parameter(description = "return inactive tiers, only applicable when includeTiers is true, only applicable for version >3.18", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeInactiveTiers", required = true, defaultValue = "false") includeInactiveTiers: kotlin.Boolean,
        @NotNull @Parameter(description = "the start index for pagination", required = true, schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = true, defaultValue = "0") start: kotlin.Int,
        @NotNull @Parameter(description = "the limit for pagination (has a hard limit of 1000)", required = true, schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = true, defaultValue = "100") limit: kotlin.Int,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "filter results by the achievementType (these are exact case sensitive matches)") @Valid @RequestParam(value = "achievementType", required = false) achievementType: kotlin.String?,
        @Parameter(description = "filter results by the rankType (these are exact case sensitive matches)") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?
    ): ResponseEntity<List<AchievementShortResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Achievement",
        operationId = "updateAchievement",
        description = """Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/update"
        value = [PATH_UPDATE_ACHIEVEMENT],
        produces = ["*/*"]
    )
    fun updateAchievement(
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the achievement ID for updating an existing achievement") @Valid @RequestParam(value = "achievementId", required = false) achievementId: kotlin.Long?,
        @Parameter(description = "the analytics tag that will trigger when a user's achievement count gets updated") @Valid @RequestParam(value = "analyticsTag", required = false) analyticsTag: kotlin.String?,
        @Parameter(description = "the title of the achievement (255 character limit)") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the description of the achievement") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the rank type for updating leader boards") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "determines how much the rank count is incremented") @Valid @RequestParam(value = "rankIncrement", required = false) rankIncrement: kotlin.Int?,
        @Parameter(description = "restrict scores to be above or equal to this minimum value") @Valid @RequestParam(value = "minIncrement", required = false) minIncrement: kotlin.Int?,
        @Parameter(description = "enable to ignore usage of minIncrement") @Valid @RequestParam(value = "nullMinIncrement", required = false) nullMinIncrement: kotlin.Boolean?,
        @Parameter(description = "restrict scores to be below or equal to this maximum value") @Valid @RequestParam(value = "maxIncrement", required = false) maxIncrement: kotlin.Int?,
        @Parameter(description = "enable to ignore usage of maxIncrement") @Valid @RequestParam(value = "nullMaxIncrement", required = false) nullMaxIncrement: kotlin.Boolean?,
        @Parameter(description = "determines whether the customId on analytics are used to validate a user's achievement progress.") @Valid @RequestParam(value = "validate", required = false) validate: kotlin.Boolean?,
        @Parameter(description = "if it's active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "if provided will define what triggers to run after a tier is completed") @Valid @RequestParam(value = "triggerDefinition", required = false) triggerDefinition: kotlin.String?
    ): ResponseEntity<AchievementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Achievement Tier",
        operationId = "updateAchievementTier",
        description = """Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AchievementTierResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/tier/update"
        value = [PATH_UPDATE_ACHIEVEMENT_TIER],
        produces = ["*/*"]
    )
    fun updateAchievementTier(
        @NotNull @Parameter(description = "the achievement tier id for updating", required = true) @Valid @RequestParam(value = "achievementTierId", required = true) achievementTierId: kotlin.Long,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "achievement tier icon image file") @Valid @RequestParam(value = "icon", required = false) icon: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "the icon assetId, if icon is provided, icon will overrule") @Valid @RequestParam(value = "iconAssetId", required = false) iconAssetId: kotlin.Long?,
        @Parameter(description = "the title of the achievement tier") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the description of the achievement tier") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the count requirement for completing the achievement tier") @Valid @RequestParam(value = "goalCount", required = false) goalCount: kotlin.Long?,
        @Parameter(description = "The ID of the mission to associate with the achievement") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The ID of the game to associate with the achievement") @Valid @RequestParam(value = "gameId", required = false) gameId: kotlin.Long?,
        @Parameter(description = "The ID of the pack to associate with the achievement") @Valid @RequestParam(value = "packId", required = false) packId: kotlin.Long?,
        @Parameter(description = "The ID of the game level to associate with the achievement") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "The ID of the game object to associate with the achievement") @Valid @RequestParam(value = "gameObjectId", required = false) gameObjectId: kotlin.Long?,
        @Parameter(description = "score all instances") @Valid @RequestParam(value = "scoreAllInstances", required = false) scoreAllInstances: kotlin.Boolean?
    ): ResponseEntity<AchievementTierResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Achievement Progress",
        operationId = "updateUserAchievement",
        description = """Update user achievement progress.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/achievement/progress/update"
        value = [PATH_UPDATE_USER_ACHIEVEMENT],
        produces = ["*/*"]
    )
    fun updateUserAchievement(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "the achievement id (achievementId or tag required)") @Valid @RequestParam(value = "achievementId", required = false) achievementId: kotlin.Long?,
        @Parameter(description = "the analytic tag to identify an achievement (achievementId or tag required)") @Valid @RequestParam(value = "tag", required = false) tag: kotlin.String?,
        @Parameter(description = "a custom identifier used for validation") @Valid @RequestParam(value = "customId", required = false) customId: kotlin.Long?,
        @Parameter(description = "the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement's rankIncrement value)") @Valid @RequestParam(value = "increment", required = false) increment: kotlin.Long?,
        @Parameter(description = "a custom start date that the client can set (not yet used in server logic)") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "a custom end date that the client can set (not yet used in server logic)") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "determines whether to return the achievement progress response") @Valid @RequestParam(value = "returnProgress", required = false) returnProgress: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ACHIEVEMENT_TIER_SEARCH_POST: String = "/achievement/tier/search"
        const val PATH_CREATE_ACHIEVEMENT: String = "/achievement/create"
        const val PATH_CREATE_ACHIEVEMENT_TIER: String = "/achievement/tier/create"
        const val PATH_DELETE_ACHIEVEMENT: String = "/achievement/delete"
        const val PATH_DELETE_ACHIEVEMENT_TIER: String = "/achievement/tier/delete"
        const val PATH_GET_ACHIEVEMENT: String = "/achievement/get"
        const val PATH_GET_ACHIEVEMENT_TIER: String = "/achievement/tier/get"
        const val PATH_GET_USER_ACHIEVEMENTS: String = "/achievement/progress/get"
        const val PATH_LIST_ACHIEVEMENT_TAGS: String = "/achievement/tag/list"
        const val PATH_LIST_ACHIEVEMENTS: String = "/achievement/list"
        const val PATH_SEARCH_ACHIEVEMENTS: String = "/achievement/search"
        const val PATH_UPDATE_ACHIEVEMENT: String = "/achievement/update"
        const val PATH_UPDATE_ACHIEVEMENT_TIER: String = "/achievement/tier/update"
        const val PATH_UPDATE_USER_ACHIEVEMENT: String = "/achievement/progress/update"
    }
}
