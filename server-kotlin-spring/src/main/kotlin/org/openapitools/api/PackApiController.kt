package org.openapitools.api

import org.openapitools.model.PackResponse
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
class PackApiController() {

    @Operation(
        summary = "Create Pack",
        operationId = "createPack",
        description = """Create a pack.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PackResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pack/create"
        value = [PATH_CREATE_PACK],
        produces = ["*/*"]
    )
    fun createPack(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The title of the pack", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @NotNull @Parameter(description = "The order of the pack", required = true) @Valid @RequestParam(value = "packOrder", required = true) packOrder: kotlin.Long,
        @NotNull @Parameter(description = "The price in tickets to purchase this pack", required = true) @Valid @RequestParam(value = "price", required = true) price: kotlin.Int,
        @NotNull @Parameter(description = "The scoring is highest is best", required = true) @Valid @RequestParam(value = "highest", required = true) highest: kotlin.Boolean,
        @NotNull @Parameter(description = "Flag to indicate owner should receive tickets for completed packs", required = true) @Valid @RequestParam(value = "allocateTickets", required = true) allocateTickets: kotlin.Boolean,
        @NotNull @Parameter(description = "The number of tickets to reward", required = true) @Valid @RequestParam(value = "ticketCount", required = true) ticketCount: kotlin.Long,
        @Parameter(description = "The description of the pack") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The tags for searching the pack, comma separated") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "Activate/deactivate the pack") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The type of the pack", schema = Schema(allowableValues = ["TUTORIAL", "BUILTIN", "DOWNLOAD", "THRESHOLD", "THEME", "TOURNAMENT"])) @Valid @RequestParam(value = "packType", required = false) packType: kotlin.String?,
        @Parameter(description = "The type of game sequence of the pack", schema = Schema(allowableValues = ["FIRST_AVAILABLE", "ALL_AVAILABLE"])) @Valid @RequestParam(value = "sequenceType", required = false) sequenceType: kotlin.String?,
        @Parameter(description = "The background asset id of the pack") @Valid @RequestParam(value = "backgroundId", required = false) backgroundId: kotlin.Long?,
        @Parameter(description = "The image asset id of the pack") @Valid @RequestParam(value = "imageId", required = false) imageId: kotlin.Long?,
        @Parameter(description = "The date/time to start the pack, send 0 to unset") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The date/time to end the pack, send 0 to unset") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "authorOverride", required = false) authorOverride: kotlin.String?,
        @Parameter(description = "the type of ticket required to purchase this pack") @Valid @RequestParam(value = "priceType", required = false) priceType: kotlin.String?,
        @Parameter(description = "the game level ids to include in the pack, comma separated") @Valid @RequestParam(value = "gameLevelIds", required = false) gameLevelIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "inGame", required = false) inGame: kotlin.Boolean?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a pack") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?
    ): ResponseEntity<PackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Pack",
        operationId = "deletePack",
        description = """Delete a pack.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pack/delete"
        value = [PATH_DELETE_PACK],
        produces = ["*/*"]
    )
    fun deletePack(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the pack to delete", required = true) @Valid @RequestParam(value = "packId", required = true) packId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Pack",
        operationId = "getPack",
        description = """Get a pack.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PackResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pack/get"
        value = [PATH_GET_PACK],
        produces = ["*/*"]
    )
    fun getPack(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the pack to return.", required = true) @Valid @RequestParam(value = "packId", required = true) packId: kotlin.Long,
        @NotNull @Parameter(description = "If true include the game level data, otherwise don't. default is false.", required = true) @Valid @RequestParam(value = "includeGameData", required = true) includeGameData: kotlin.Boolean
    ): ResponseEntity<PackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Packs",
        operationId = "searchPacks",
        description = """Search on packs.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = PackResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pack/search"
        value = [PATH_SEARCH_PACKS],
        produces = ["*/*"]
    )
    fun searchPacks(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED", required = true, schema = Schema(allowableValues = ["TITLE", "DESCRIPTION", "CREATED", "UPDATED"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @Parameter(description = "Keyword search on the pack name") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Filters results on pack type", schema = Schema(allowableValues = ["TUTORIAL", "BUILTIN", "DOWNLOAD", "THRESHOLD", "THEME", "TOURNAMENT"])) @Valid @RequestParam(value = "packType", required = false) packType: kotlin.String?,
        @Parameter(description = "Start the result set at some index.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "Limit the result to some number.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Determines whether to include game data in the results") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "Determines whether to include inactive results") @Valid @RequestParam(value = "includeInactive", required = false) includeInactive: kotlin.Boolean?,
        @Parameter(description = "The application to filter results on") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<List<PackResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Pack",
        operationId = "updatePack",
        description = """Update a pack.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PackResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pack/update"
        value = [PATH_UPDATE_PACK],
        produces = ["*/*"]
    )
    fun updatePack(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the pack to update.", required = true) @Valid @RequestParam(value = "packId", required = true) packId: kotlin.Long,
        @NotNull @Parameter(description = "Flag to indicate owner should receive tickets for completed packs", required = true) @Valid @RequestParam(value = "allocateTickets", required = true) allocateTickets: kotlin.Boolean,
        @NotNull @Parameter(description = "The number of tickets to reward", required = true) @Valid @RequestParam(value = "ticketCount", required = true) ticketCount: kotlin.Long,
        @Parameter(description = "The title of the pack") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The description of the pack") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The tags for searching the pack, comma separated") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "Activate/deactivate the pack") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The type of the pack", schema = Schema(allowableValues = ["TUTORIAL", "BUILTIN", "DOWNLOAD", "THRESHOLD", "THEME", "TOURNAMENT"])) @Valid @RequestParam(value = "packType", required = false) packType: kotlin.String?,
        @Parameter(description = "The order of the pack") @Valid @RequestParam(value = "packOrder", required = false) packOrder: kotlin.Long?,
        @Parameter(description = "The type of game sequence of the pack", schema = Schema(allowableValues = ["FIRST_AVAILABLE", "ALL_AVAILABLE"])) @Valid @RequestParam(value = "sequenceType", required = false) sequenceType: kotlin.String?,
        @Parameter(description = "The background asset id of the pack") @Valid @RequestParam(value = "backgroundId", required = false) backgroundId: kotlin.Long?,
        @Parameter(description = "The image asset id of the pack") @Valid @RequestParam(value = "imageId", required = false) imageId: kotlin.Long?,
        @Parameter(description = "The date/time to start the pack, send 0 to unset") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The date/time to end the pack, send 0 to unset") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "authorOverride", required = false) authorOverride: kotlin.String?,
        @Parameter(description = "The price in tickets to purchase this pack") @Valid @RequestParam(value = "price", required = false) price: kotlin.Int?,
        @Parameter(description = "the type of ticket required to purchase this pack") @Valid @RequestParam(value = "priceType", required = false) priceType: kotlin.String?,
        @Parameter(description = "the game level ids to include in the pack, comma separated") @Valid @RequestParam(value = "gameLevelIds", required = false) gameLevelIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "inGame", required = false) inGame: kotlin.Boolean?,
        @Parameter(description = "The scoring is highest is best") @Valid @RequestParam(value = "highest", required = false) highest: kotlin.Boolean?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a pack") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?
    ): ResponseEntity<PackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_PACK: String = "/pack/create"
        const val PATH_DELETE_PACK: String = "/pack/delete"
        const val PATH_GET_PACK: String = "/pack/get"
        const val PATH_SEARCH_PACKS: String = "/pack/search"
        const val PATH_UPDATE_PACK: String = "/pack/update"
    }
}
