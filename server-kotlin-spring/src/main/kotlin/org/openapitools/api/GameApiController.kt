package org.openapitools.api

import org.openapitools.model.GameResponse
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
class GameApiController() {

    @Operation(
        summary = "Create a Game",
        operationId = "createGame",
        description = """Create a Game.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/create"
        value = [PATH_CREATE_GAME],
        produces = ["*/*"]
    )
    fun createGame(
        @Parameter(description = "The logged in user.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The game application key to save the level for.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Title of the game.") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "Description of the game.") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "metaData of the Game.") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "comma separated String of pack Ids that will associate with the game.") @Valid @RequestParam(value = "packIds", required = false) packIds: kotlin.String?,
        @Parameter(description = "Show more details in response.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<GameResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Question",
        operationId = "createQuestion",
        description = """Create a question and related answers by the given params.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QuestionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/question/create"
        value = [PATH_CREATE_QUESTION],
        produces = ["*/*"]
    )
    fun createQuestion(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the text of the question", required = true) @Valid @RequestParam(value = "question", required = true) question: kotlin.String,
        @NotNull @Parameter(description = "```json [   {     \"text\": \"1942\",     \"image\": 123,     \"videoURL\": \"http://www.here.com\",     \"correct\": true   },   {     \"text\": \"1943\",     \"image\": 124,     \"videoURL\": \"http://www.there.com\",     \"correct\": false   } ] ``` ", required = true) @Valid @RequestParam(value = "answers", required = true) answers: kotlin.String,
        @NotNull @Parameter(description = "If true set the question to active. Default to false.", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean,
        @NotNull @Parameter(description = "If true then scoring will give tickets. Default to false.", required = true) @Valid @RequestParam(value = "allocateTickets", required = true) allocateTickets: kotlin.Boolean,
        @NotNull @Parameter(description = "The number of tickets to reward", required = true) @Valid @RequestParam(value = "ticketCount", required = true) ticketCount: kotlin.Long,
        @Parameter(description = "The tags of the question for search.") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "The video link for the question.") @Valid @RequestParam(value = "videoURL", required = false) videoURL: kotlin.String?,
        @Parameter(description = "The asset id of the question.") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?
    ): ResponseEntity<QuestionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Word",
        operationId = "createWord",
        description = """Create a word by the given params.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WordzWordResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/word/create"
        value = [PATH_CREATE_WORD],
        produces = ["*/*"]
    )
    fun createWord(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The text of the word.", required = true) @Valid @RequestParam(value = "word", required = true) word: kotlin.String,
        @NotNull @Parameter(description = "The definition of the word.", required = true) @Valid @RequestParam(value = "definition", required = true) definition: kotlin.String,
        @NotNull @Parameter(description = "If true set the word to active. Default to false.", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "active", required = true, defaultValue = "false") active: kotlin.Boolean,
        @NotNull @Parameter(description = "If true then scoring will give tickets. Default to false.", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "allocateTickets", required = true, defaultValue = "false") allocateTickets: kotlin.Boolean,
        @NotNull @Parameter(description = "The number of tickets to reward", required = true, schema = Schema(defaultValue = "0L")) @Valid @RequestParam(value = "ticketCount", required = true, defaultValue = "0L") ticketCount: kotlin.Long,
        @Parameter(description = "The asset id of the word.") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?
    ): ResponseEntity<WordzWordResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a Game",
        operationId = "deleteGame",
        description = """Delete a game.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/delete"
        value = [PATH_DELETE_GAME],
        produces = ["*/*"]
    )
    fun deleteGame(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the updating game's id.", required = true) @Valid @RequestParam(value = "gameId", required = true) gameId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Question",
        operationId = "deleteQuestion",
        description = """Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/question/delete"
        value = [PATH_DELETE_QUESTION],
        produces = ["*/*"]
    )
    fun deleteQuestion(
        @NotNull @Parameter(description = "the id of the question to delete", required = true) @Valid @RequestParam(value = "questionId", required = true) questionId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the account that can execute this request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Word",
        operationId = "deleteWord",
        description = """Delete a word by the given id. The accountId given needs to be the owner or executive to delete.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/game/word/delete"
        value = [PATH_DELETE_WORD],
        produces = ["*/*"]
    )
    fun deleteWord(
        @NotNull @Parameter(description = "The id of the word to delete.", required = true) @Valid @RequestParam(value = "wordId", required = true) wordId: kotlin.Long,
        @NotNull @Parameter(description = "The account vor validating permission", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a Game by id",
        operationId = "getGame",
        description = """Get a Game by id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/game/get"
        value = [PATH_GET_GAME],
        produces = ["*/*"]
    )
    fun getGame(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the updating game's id.", required = true) @Valid @RequestParam(value = "gameId", required = true) gameId: kotlin.Long,
        @Parameter(description = "If true include the game level data, otherwise don't. default is false.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<GameResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Question",
        operationId = "getQuestion",
        description = """Get a question by the given id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QuestionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/game/question/get"
        value = [PATH_GET_QUESTION],
        produces = ["*/*"]
    )
    fun getQuestion(
        @NotNull @Parameter(description = "the id of the question to get", required = true) @Valid @RequestParam(value = "questionId", required = true) questionId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the account that can make this request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<QuestionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Word",
        operationId = "getWord",
        description = """Get a word by the given id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WordzWordResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/game/word/get"
        value = [PATH_GET_WORD],
        produces = ["*/*"]
    )
    fun getWord(
        @NotNull @Parameter(description = "The id of the word to get.", required = true) @Valid @RequestParam(value = "wordId", required = true) wordId: kotlin.Long,
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<WordzWordResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Words",
        operationId = "getWords",
        description = """Search for words by the given params.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = WordzWordResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/game/word/search"
        value = [PATH_GET_WORDS],
        produces = ["*/*"]
    )
    fun getWords(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The column to sort the search on", required = true, schema = Schema(defaultValue = "id")) @Valid @RequestParam(value = "sortField", required = true, defaultValue = "id") sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the search results", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = true, defaultValue = "false") descending: kotlin.Boolean,
        @NotNull @Parameter(description = "Return only active results if set to true.", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = true, defaultValue = "false") activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "The record to begin the return set on.", required = true, schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = true, defaultValue = "0") start: kotlin.Int,
        @NotNull @Parameter(description = "The number of records to return.", required = true, schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = true, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "The keyword for searching words with matching definition or word text.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<WordzWordResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search a Game",
        operationId = "searchGames",
        description = """Get a list of games for an application, just those the account has permissions to view.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/game/search"
        value = [PATH_SEARCH_GAMES],
        produces = ["*/*"]
    )
    fun searchGames(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Start the result set at some index.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "Limit the result to some number.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "Match the keyword to the owner name or level name.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The maximum version of the level to return.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "more details in response") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "more details in response") @Valid @RequestParam(value = "includeInactive", required = false) includeInactive: kotlin.Boolean?
    ): ResponseEntity<GameResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Questions",
        operationId = "searchQuestions",
        description = """Search for questions by the given params.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = QuestionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/game/question/search"
        value = [PATH_SEARCH_QUESTIONS],
        produces = ["*/*"]
    )
    fun searchQuestions(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The column to sort the search on", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the search results", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "Return only active results if set to true.", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "The record to begin the return set on.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The number of records to return.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "The keyword for searching questions with matching tags or question text.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<QuestionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update a Game",
        operationId = "updateGame",
        description = """Update a Game""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GameResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/update"
        value = [PATH_UPDATE_GAME],
        produces = ["*/*"]
    )
    fun updateGame(
        @Parameter(description = "The logged in user.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the updating game's id") @Valid @RequestParam(value = "gameId", required = false) gameId: kotlin.Long?,
        @Parameter(description = "The game application key to save the level for.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Title of the Game.") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "Description of the Game.") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "metaData of the Game.") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "comma separated String of pack Ids that will associate with the game.") @Valid @RequestParam(value = "packIds", required = false) packIds: kotlin.String?,
        @Parameter(description = "show more details in response.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<GameResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Question",
        operationId = "updateQuestion",
        description = """Update a question and related answers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QuestionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/question/update"
        value = [PATH_UPDATE_QUESTION],
        produces = ["*/*"]
    )
    fun updateQuestion(
        @NotNull @Parameter(description = "The id of the question to update.", required = true) @Valid @RequestParam(value = "questionId", required = true) questionId: kotlin.Long,
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The number of tickets to reward", required = true) @Valid @RequestParam(value = "ticketCount", required = true) ticketCount: kotlin.Long,
        @Parameter(description = "The text of the question.") @Valid @RequestParam(value = "question", required = false) question: kotlin.String?,
        @Parameter(description = "The json representations of answers for the question.") @Valid @RequestParam(value = "answers", required = false) answers: kotlin.String?,
        @Parameter(description = "The tags of the question for search.") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "The video link for the question.") @Valid @RequestParam(value = "videoURL", required = false) videoURL: kotlin.String?,
        @Parameter(description = "The asset id of the question.") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "If true set the question to active.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "If true then scoring will give tickets.") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?
    ): ResponseEntity<QuestionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Word",
        operationId = "updateWord",
        description = """Update a word by the given params.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WordzWordResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/game/word/update"
        value = [PATH_UPDATE_WORD],
        produces = ["*/*"]
    )
    fun updateWord(
        @NotNull @Parameter(description = "The id of the word to update.", required = true) @Valid @RequestParam(value = "wordId", required = true) wordId: kotlin.Long,
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The number of tickets to reward", required = true, schema = Schema(defaultValue = "0L")) @Valid @RequestParam(value = "ticketCount", required = true, defaultValue = "0L") ticketCount: kotlin.Long,
        @Parameter(description = "The text for the word") @Valid @RequestParam(value = "wordText", required = false) wordText: kotlin.String?,
        @Parameter(description = "The definition of the word.") @Valid @RequestParam(value = "definition", required = false) definition: kotlin.String?,
        @Parameter(description = "The asset id of the word.") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "If true set the word to active.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "If true then scoring will give tickets.") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?
    ): ResponseEntity<WordzWordResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_GAME: String = "/game/create"
        const val PATH_CREATE_QUESTION: String = "/game/question/create"
        const val PATH_CREATE_WORD: String = "/game/word/create"
        const val PATH_DELETE_GAME: String = "/game/delete"
        const val PATH_DELETE_QUESTION: String = "/game/question/delete"
        const val PATH_DELETE_WORD: String = "/game/word/delete"
        const val PATH_GET_GAME: String = "/game/get"
        const val PATH_GET_QUESTION: String = "/game/question/get"
        const val PATH_GET_WORD: String = "/game/word/get"
        const val PATH_GET_WORDS: String = "/game/word/search"
        const val PATH_SEARCH_GAMES: String = "/game/search"
        const val PATH_SEARCH_QUESTIONS: String = "/game/question/search"
        const val PATH_UPDATE_GAME: String = "/game/update"
        const val PATH_UPDATE_QUESTION: String = "/game/question/update"
        const val PATH_UPDATE_WORD: String = "/game/word/update"
    }
}
