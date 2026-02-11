package org.openapitools.api

import org.openapitools.model.AppResponse
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
class AppApiController() {

    @Operation(
        summary = "Get App Data",
        operationId = "getAppData",
        description = """Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.   

Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AppResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/app/get"
        value = [PATH_GET_APP_DATA],
        produces = ["*/*"]
    )
    fun getAppData(
        @NotNull @Parameter(description = "start the search results at a record.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "limit the search results to some number.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the game to retrieve the data for, use your application key.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "if true then include the game data blob, otherwise don't include.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "query string used to filter the search results when looking for community and saved levels.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "order the search results descending or ascending when looking for community and saved levels.") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "if true then include the game object count, otherwise don't include.") @Valid @RequestParam(value = "gameObjectCount", required = false) gameObjectCount: kotlin.Boolean?,
        @Parameter(description = "restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED") @Valid @RequestParam(value = "filter", required = false) filter: kotlin.String?,
        @Parameter(description = "restrict the search to items created less then date") @Valid @RequestParam(value = "dateCreated", required = false) dateCreated: kotlin.Long?,
        @Parameter(description = "get levels owned by a particular account") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "get missions by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "missionIds", required = false) missionIds: kotlin.String?,
        @Parameter(description = "get games by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "gameIds", required = false) gameIds: kotlin.String?,
        @Parameter(description = "get packs by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "packIds", required = false) packIds: kotlin.String?,
        @Parameter(description = "get game levels by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "gameLevelIds", required = false) gameLevelIds: kotlin.String?,
        @Parameter(description = "the application version, used to versin the game level data") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.") @Valid @RequestParam(value = "includeHigherVersionPacks", required = false) includeHigherVersionPacks: kotlin.Boolean?,
        @Parameter(description = "default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.") @Valid @RequestParam(value = "includeHigherVersionLevels", required = false) includeHigherVersionLevels: kotlin.Boolean?,
        @Parameter(description = "use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list ") @Valid @RequestParam(value = "responseGroups", required = false) responseGroups: kotlin.String?,
        @Parameter(description = "the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase ") @Valid @RequestParam(value = "purchaseType", required = false) purchaseType: kotlin.String?
    ): ResponseEntity<AppResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create App Data",
        operationId = "postAppData",
        description = """Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.

The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.    

Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AppResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/app/post"
        value = [PATH_POST_APP_DATA],
        produces = ["*/*"]
    )
    fun postAppData(
        @NotNull @Parameter(description = "the game to retrieve the data for, use your application key.", required = true) @Valid @RequestParam(value = "gameType", required = true) gameType: kotlin.String,
        @NotNull @Parameter(description = "start the search results at a record.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "limit the search results to some number.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "The analytic data AnalyticListResponse", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String,
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "if true then include the game data blob, otherwise don't include.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "query string used to filter the search results when looking for community and saved levels.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "order the search results descending or ascending when looking for community and saved levels.") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "if true then include the game object count, otherwise don't include.") @Valid @RequestParam(value = "gameObjectCount", required = false) gameObjectCount: kotlin.Boolean?,
        @Parameter(description = "restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED") @Valid @RequestParam(value = "filter", required = false) filter: kotlin.String?,
        @Parameter(description = "restrict the search to items created less then date") @Valid @RequestParam(value = "dateCreated", required = false) dateCreated: kotlin.Long?,
        @Parameter(description = "get levels owned by a particular account") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "get missions by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "missionIds", required = false) missionIds: kotlin.String?,
        @Parameter(description = "get games by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "gameIds", required = false) gameIds: kotlin.String?,
        @Parameter(description = "get packs by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "packIds", required = false) packIds: kotlin.String?,
        @Parameter(description = "get game levels by specified id, comman seperated list of long ids") @Valid @RequestParam(value = "gameLevelIds", required = false) gameLevelIds: kotlin.String?,
        @Parameter(description = "the application version, used to versin the game level data") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.") @Valid @RequestParam(value = "includeHigherVersionPacks", required = false) includeHigherVersionPacks: kotlin.Boolean?,
        @Parameter(description = "default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.") @Valid @RequestParam(value = "includeHigherVersionLevels", required = false) includeHigherVersionLevels: kotlin.Boolean?,
        @Parameter(description = "use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list ") @Valid @RequestParam(value = "responseGroups", required = false) responseGroups: kotlin.String?,
        @Parameter(description = "the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase ") @Valid @RequestParam(value = "purchaseType", required = false) purchaseType: kotlin.String?
    ): ResponseEntity<AppResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Regenerate App Data",
        operationId = "regenAppData",
        description = """Regenerate the app data cache for apps""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/app/regen"
        value = [PATH_REGEN_APP_DATA],
        produces = ["*/*"]
    )
    fun regenAppData(
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "process a specific application, if null process all apps with caches") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "create a specific version, if null use current version. Be careful if processing all") @Valid @RequestParam(value = "buildVersion", required = false) buildVersion: kotlin.String?,
        @Parameter(description = "create a specific version, if null use current version. Be careful if processing all") @Valid @RequestParam(value = "apiVersion", required = false) apiVersion: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_APP_DATA: String = "/app/get"
        const val PATH_POST_APP_DATA: String = "/app/post"
        const val PATH_REGEN_APP_DATA: String = "/app/regen"
    }
}
