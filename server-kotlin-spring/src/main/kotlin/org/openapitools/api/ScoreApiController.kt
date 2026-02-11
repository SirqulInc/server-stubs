package org.openapitools.api

import org.openapitools.model.ScoreResponse
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
class ScoreApiController() {

    @Operation(
        summary = "Create Score",
        operationId = "createScore",
        description = """Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via 
a list of {@link MessageResponse}.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/score/create"
        value = [PATH_CREATE_SCORE],
        produces = ["*/*"]
    )
    fun createScore(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The game application key to save the score for.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The score", required = true) @Valid @RequestParam(value = "points", required = true) points: kotlin.Int,
        @Parameter(description = "The missionId to score for, ignore if not playing mission.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The gameId to score for, ignore if not playing mission.") @Valid @RequestParam(value = "gameId", required = false) gameId: kotlin.Long?,
        @Parameter(description = "The packId to score for, send -2 if playing community levels.") @Valid @RequestParam(value = "packId", required = false) packId: kotlin.Long?,
        @Parameter(description = "The gameLevelId to score for.") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "The gameObjectId to score for, ignore if level based scoring.") @Valid @RequestParam(value = "gameObjectId", required = false) gameObjectId: kotlin.Long?,
        @Parameter(description = "The time taken to complete task") @Valid @RequestParam(value = "timeTaken", required = false) timeTaken: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "highest", required = false) highest: kotlin.Boolean?
    ): ResponseEntity<ScoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Score",
        operationId = "getScore",
        description = """Get the high score for an item.  Pass in the full path IDs for the score.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/score/get"
        value = [PATH_GET_SCORE],
        produces = ["*/*"]
    )
    fun getScore(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The game application key to get the level for.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The missionId to score for, null if not playing mission.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The gameId to score for, null if not playing mission.") @Valid @RequestParam(value = "gameId", required = false) gameId: kotlin.Long?,
        @Parameter(description = "The packId to score for, null if playing community levels.") @Valid @RequestParam(value = "packId", required = false) packId: kotlin.Long?,
        @Parameter(description = "The gameLevelId to score for.") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "The gameObjectId to score for, null if level based scoring.") @Valid @RequestParam(value = "gameObjectId", required = false) gameObjectId: kotlin.Long?,
        @Parameter(description = "The object type to filter scores by (TicketObjectType)") @Valid @RequestParam(value = "scoreObjectType", required = false) scoreObjectType: kotlin.String?,
        @Parameter(description = "The status of the score to filter (ScoreStatus)") @Valid @RequestParam(value = "scoreStatus", required = false) scoreStatus: kotlin.String?
    ): ResponseEntity<ScoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Score",
        operationId = "searchScores",
        description = """Search the scores for an item.  Pass in the full path IDs for the scores.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ScoreResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/score/search"
        value = [PATH_SEARCH_SCORES],
        produces = ["*/*"]
    )
    fun searchScores(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The game application key to get the level for.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The missionId to score for, null if not playing mission.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The gameId to score for, null if not playing mission.") @Valid @RequestParam(value = "gameId", required = false) gameId: kotlin.Long?,
        @Parameter(description = "The packId to score for, null if playing community levels.") @Valid @RequestParam(value = "packId", required = false) packId: kotlin.Long?,
        @Parameter(description = "The gameLevelId to score for.") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "The gameObjectId to score for, null if level based scoring.") @Valid @RequestParam(value = "gameObjectId", required = false) gameObjectId: kotlin.Long?
    ): ResponseEntity<List<ScoreResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_SCORE: String = "/score/create"
        const val PATH_GET_SCORE: String = "/score/get"
        const val PATH_SEARCH_SCORES: String = "/score/search"
    }
}
