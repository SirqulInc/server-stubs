package org.openapitools.api

import org.openapitools.model.GameLevelListResponse
import org.openapitools.model.GameLevelResponse
import org.openapitools.model.QuestionResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.WordzWordResponse
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
class LevelApiController() {

    @Operation(
        summary = "Create Game Level",
        operationId = "createGameLevel",
        description = """Create a game level. Currently does NOT support game objects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameLevelResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/level/create"
        value = [PATH_CREATE_GAME_LEVEL],
        produces = ["*/*"]
    )
    fun createGameLevel(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the level.", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "The game level data: xml, json, or other text based format.", required = true) @Valid @RequestParam(value = "gameData", required = true) gameData: kotlin.String,
        @NotNull @Parameter(description = "The game level data format type.", required = true) @Valid @RequestParam(value = "gameDataSuffix", required = true) gameDataSuffix: kotlin.String,
        @Parameter(description = "The game application key to save the level for.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The description of the level.") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.") @Valid @RequestParam(value = "difficulty", required = false) difficulty: kotlin.String?,
        @Parameter(description = "The version number of the application required to correctly load/play the level.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "The asset Id of the level image.") @Valid @RequestParam(value = "assetImageId", required = false) assetImageId: kotlin.Long?,
        @Parameter(description = "The asset Id of the level icon.") @Valid @RequestParam(value = "assetIconId", required = false) assetIconId: kotlin.Long?,
        @Parameter(description = "Is the level visible to others, possible values are: PUBLIC, PRIVATE.") @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Make the level be readable by all friends.") @Valid @RequestParam(value = "friendGroup", required = false) friendGroup: kotlin.Boolean?,
        @Parameter(description = "Make the level be readable by connections in this list.") @Valid @RequestParam(value = "connectionIds", required = false) connectionIds: kotlin.String?,
        @Parameter(description = "Make the level be readable by connection groups in this list.") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @Valid @RequestParam(value = "balance", required = false) balance: kotlin.Double?,
        @Parameter(description = "If true set the game level as active. Default is false.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "If true then scoring will give tickets. Default is false.") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "The number of tickets to reward") @Valid @RequestParam(value = "ticketCount", required = false) ticketCount: kotlin.Long?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a level") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?,
        @Parameter(description = "Title of the tutorial.") @Valid @RequestParam(value = "tutorialTitle", required = false) tutorialTitle: kotlin.String?,
        @Parameter(description = "Message of the tutotrial.") @Valid @RequestParam(value = "tutorialMessage", required = false) tutorialMessage: kotlin.String?,
        @Parameter(description = "Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY") @Valid @RequestParam(value = "tutorialAlignment", required = false) tutorialAlignment: kotlin.String?,
        @Parameter(description = "Asset id of the tutorial image.") @Valid @RequestParam(value = "tutorialImageAssetId", required = false) tutorialImageAssetId: kotlin.Long?,
        @Parameter(description = "id of the offer") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<GameLevelResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Game Level",
        operationId = "deleteGameLevel",
        description = """Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/level/delete"
        value = [PATH_DELETE_GAME_LEVEL],
        produces = ["*/*"]
    )
    fun deleteGameLevel(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the level to return.", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Game Level",
        operationId = "getGameLevel",
        description = """Get a game level. The level and account must be valid and have the appropirate permissions to view the content.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameLevelResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/level/get"
        value = [PATH_GET_GAME_LEVEL],
        produces = ["*/*"]
    )
    fun getGameLevel(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the level to return.", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long,
        @Parameter(description = "If true include the game level data, otherwise don't. default is false.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<GameLevelResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Game Levels",
        operationId = "getGameLevelsByApplication",
        description = """Get a list of levels for an application, just those the account has permissions to view.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameLevelListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/level/search"
        value = [PATH_GET_GAME_LEVELS_BY_APPLICATION],
        produces = ["*/*"]
    )
    fun getGameLevelsByApplication(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Match the keyword to the owner name or level name.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "what field to sort on") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "whether to return levels in ascending or descending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Start the result set at some index.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "Limit the result to some number.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The maximum version of the level to return.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "If true include the game level data, otherwise don't. default is false.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "filters", required = false) filters: kotlin.String?
    ): ResponseEntity<GameLevelListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Game Level by Billable Entity",
        operationId = "getGameLevelsByBillableEntity",
        description = """Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameLevelResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/level/searchByBillableEntity"
        value = [PATH_GET_GAME_LEVELS_BY_BILLABLE_ENTITY],
        produces = ["*/*"]
    )
    fun getGameLevelsByBillableEntity(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The column to sort the search on", schema = Schema(allowableValues = ["LEVEL_ACTIVE", "LEVEL_NAME", "LEVEL_DESCRIPTION", "LEVEL_CREATED", "LEVEL_UPDATED", "LEVEL_LIKES", "LEVEL_DISLIKES", "LEVEL_NOTES", "LEVEL_PLAYS", "LEVEL_DOWNLOADS", "LEVEL_QUITS", "LEVEL_COMPLETES", "LEVEL_VERSION", "LEVEL_MISSION_TYPE", "LEVEL_OWNER_DISPLAY", "GAME_OWNER_DISPLAY", "GAME_TITLE", "GAME_DESCRIPTION", "GAME_LIKES", "GAME_DISLIKES", "APP_NAME", "APP_SCORING_TYPE"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Return only active results") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Long?
    ): ResponseEntity<GameLevelResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Level Questions",
        operationId = "getQuestionsInLevel",
        description = """Get questions within a level.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QuestionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/level/questions/get"
        value = [PATH_GET_QUESTIONS_IN_LEVEL],
        produces = ["*/*"]
    )
    fun getQuestionsInLevel(
        @NotNull @Parameter(description = "the id of the level to get questions from", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<QuestionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Level Words",
        operationId = "getWordsInLevel",
        description = """Get words within a level.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WordzWordResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/level/words/get"
        value = [PATH_GET_WORDS_IN_LEVEL],
        produces = ["*/*"]
    )
    fun getWordsInLevel(
        @NotNull @Parameter(description = "the id of the level to get words for", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<WordzWordResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Game Level",
        operationId = "updateGameLevel",
        description = """Update a game level. Currently does NOT support game objects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameLevelResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/level/update"
        value = [PATH_UPDATE_GAME_LEVEL],
        produces = ["*/*"]
    )
    fun updateGameLevel(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "If update then include the level Id.", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long,
        @Parameter(description = "The game application key to save the level for.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The name of the level.") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the level.") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.") @Valid @RequestParam(value = "difficulty", required = false) difficulty: kotlin.String?,
        @Parameter(description = "The version number of the applicatuion required to correctly load/play the level.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "The asset Id of the level image.") @Valid @RequestParam(value = "assetImageId", required = false) assetImageId: kotlin.Long?,
        @Parameter(description = "The asset Id of the level icon.") @Valid @RequestParam(value = "assetIconId", required = false) assetIconId: kotlin.Long?,
        @Parameter(description = "The game level data: xml, json, or other texted based format.") @Valid @RequestParam(value = "gameData", required = false) gameData: kotlin.String?,
        @Parameter(description = "The game level data format type.") @Valid @RequestParam(value = "gameDataSuffix", required = false) gameDataSuffix: kotlin.String?,
        @Parameter(description = "Is the level visible to others, possible values are: PUBLIC, PRIVATE.") @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Make the level be readable by all friends.") @Valid @RequestParam(value = "friendGroup", required = false) friendGroup: kotlin.Boolean?,
        @Parameter(description = "Make the level be readable by connections in this list.") @Valid @RequestParam(value = "connectionIds", required = false) connectionIds: kotlin.String?,
        @Parameter(description = "Make the level be readable by connection groups in this list.") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @Valid @RequestParam(value = "balance", required = false) balance: kotlin.Double?,
        @Parameter(description = "If true set the game level as active.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "If true then scoring will give tickets.") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "The number of tickets to reward") @Valid @RequestParam(value = "ticketCount", required = false) ticketCount: kotlin.Long?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a level") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?,
        @Parameter(description = "Title of the tutorial.") @Valid @RequestParam(value = "tutorialTitle", required = false) tutorialTitle: kotlin.String?,
        @Parameter(description = "Message of the tutorial.") @Valid @RequestParam(value = "tutorialMessage", required = false) tutorialMessage: kotlin.String?,
        @Parameter(description = "Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY") @Valid @RequestParam(value = "tutorialAlignment", required = false) tutorialAlignment: kotlin.String?,
        @Parameter(description = "Asset id of the tutorial image.") @Valid @RequestParam(value = "tutorialImageAssetId", required = false) tutorialImageAssetId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<GameLevelResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Level Questions",
        operationId = "updateQuestionsInLevel",
        description = """Updates a level with question game objects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/level/questions/update"
        value = [PATH_UPDATE_QUESTIONS_IN_LEVEL],
        produces = ["*/*"]
    )
    fun updateQuestionsInLevel(
        @NotNull @Parameter(description = "the id of the level to update questions on", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the IDs of the questions to update", required = true) @Valid @RequestParam(value = "questionIds", required = true) questionIds: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Level Words",
        operationId = "updateWordsInLevel",
        description = """Updates a level with word game objects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/level/words/update"
        value = [PATH_UPDATE_WORDS_IN_LEVEL],
        produces = ["*/*"]
    )
    fun updateWordsInLevel(
        @NotNull @Parameter(description = "the id of the level to update words for", required = true) @Valid @RequestParam(value = "levelId", required = true) levelId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the ids of the words to update for the level", required = true) @Valid @RequestParam(value = "wordIds", required = true) wordIds: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_GAME_LEVEL: String = "/level/create"
        const val PATH_DELETE_GAME_LEVEL: String = "/level/delete"
        const val PATH_GET_GAME_LEVEL: String = "/level/get"
        const val PATH_GET_GAME_LEVELS_BY_APPLICATION: String = "/level/search"
        const val PATH_GET_GAME_LEVELS_BY_BILLABLE_ENTITY: String = "/level/searchByBillableEntity"
        const val PATH_GET_QUESTIONS_IN_LEVEL: String = "/level/questions/get"
        const val PATH_GET_WORDS_IN_LEVEL: String = "/level/words/get"
        const val PATH_UPDATE_GAME_LEVEL: String = "/level/update"
        const val PATH_UPDATE_QUESTIONS_IN_LEVEL: String = "/level/questions/update"
        const val PATH_UPDATE_WORDS_IN_LEVEL: String = "/level/words/update"
    }
}
