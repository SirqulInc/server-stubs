package org.openapitools.api

import org.openapitools.model.LikableResponse
import org.openapitools.model.SearchResponse
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
class LikeApiController() {

    @Operation(
        summary = "Create Like",
        operationId = "registerLike",
        description = """Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\dislikes on the same object will replace the previous one.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LikableResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/like"
        value = [PATH_REGISTER_LIKE],
        produces = ["*/*"]
    )
    fun registerLike(
        @NotNull @Parameter(description = "The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}", required = true) @Valid @RequestParam(value = "likableType", required = true) likableType: kotlin.String,
        @NotNull @Parameter(description = "The id of the likable object", required = true) @Valid @RequestParam(value = "likableId", required = true) likableId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \"album\"), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "The id of the permissionable object (for sending group notifications)") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "determines whether the user likes or dislikes the object") @Valid @RequestParam(value = "like", required = false) like: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated. This is deprecated, use \"appKey\" instead.") @Valid @RequestParam(value = "app", required = false) app: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. This is deprecated, use \"appKey\" instead.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<LikableResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Like",
        operationId = "removeLike",
        description = """Removes a like. This will make the user "neutral".""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LikableResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/like/delete"
        value = [PATH_REMOVE_LIKE],
        produces = ["*/*"]
    )
    fun removeLike(
        @NotNull @Parameter(description = "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}", required = true) @Valid @RequestParam(value = "likableType", required = true) likableType: kotlin.String,
        @NotNull @Parameter(description = "The id of the likable object", required = true) @Valid @RequestParam(value = "likableId", required = true) likableId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<LikableResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Likes",
        operationId = "searchLikes",
        description = """Search for likes on a likable object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SearchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/like/search"
        value = [PATH_SEARCH_LIKES],
        produces = ["*/*"]
    )
    fun searchLikes(
        @NotNull @Parameter(description = "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}", required = true) @Valid @RequestParam(value = "likableType", required = true) likableType: kotlin.String,
        @NotNull @Parameter(description = "The id of the likable object", required = true) @Valid @RequestParam(value = "likableId", required = true) likableId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Comma separated list of account IDs for filtering on users") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "The field to sort by. Possible values include: ID", schema = Schema(defaultValue = "ID")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "ID") sortField: kotlin.String,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "return items that have been updated since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedSince", required = false) updatedSince: kotlin.Long?,
        @Parameter(description = "return items that have been updated before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedBefore", required = false) updatedBefore: kotlin.Long?,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<SearchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_REGISTER_LIKE: String = "/like"
        const val PATH_REMOVE_LIKE: String = "/like/delete"
        const val PATH_SEARCH_LIKES: String = "/like/search"
    }
}
