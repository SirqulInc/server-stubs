package org.openapitools.api

import org.openapitools.model.ReservationResponse
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
class ReservationApiController() {

    @Operation(
        summary = "Create Reservation",
        operationId = "createReservation",
        description = """Creates a reservation on an offer object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/reservation/create"
        value = [PATH_CREATE_RESERVATION]
    )
    fun createReservation(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The start date") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The end date") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The id of the offer being added (offerId or offeLocationId required)") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "The id of the offer location being added (offerId or offeLocationId required)") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "The application requesting the reservation") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Reservation",
        operationId = "deleteReservation",
        description = """Deleted a reservation on a reservation object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/reservation/delete"
        value = [PATH_DELETE_RESERVATION]
    )
    fun deleteReservation(
        @NotNull @Parameter(description = "The reservation id", required = true) @Valid @RequestParam(value = "reservationId", required = true) reservationId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Reservations",
        operationId = "searchReservations",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ReservationResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/reservation/search"
        value = [PATH_SEARCH_RESERVATIONS],
        produces = ["*/*"]
    )
    fun searchReservations(
        @Parameter(description = "Device Id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "Appilcation Key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "filter reservations by account ID") @Valid @RequestParam(value = "filterAccountId", required = false) filterAccountId: kotlin.Long?,
        @Parameter(description = "the reservation ID") @Valid @RequestParam(value = "reservableId", required = false) reservableId: kotlin.Long?,
        @Parameter(description = "the type of reservation", schema = Schema(allowableValues = ["LOCATABLE", "RESERVABLE", "PERMISSIONABLE", "NOTABLE", "ASSETABLE", "LIKABLE", "FLAGABLE", "FAVORITABLE", "RATABLE", "ALBUM", "COLLECTION", "APPLICATION", "APPLICATION_SETTING", "APPLICATION_CERT", "APPLICATION_PLACEMENT", "ACCOUNT", "ACCOUNT_SETTING", "GAME_LEVEL", "PACK", "MISSION", "TOURNAMENT", "ASSET", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "OFFER", "OFFER_LOCATION", "EVENT", "RETAILER", "RETAILER_LOCATION", "NOTE", "CREATIVE", "FAVORITE", "LIKE", "RATING", "ANALYTIC", "THIRD_PARTY_CREDENTIAL", "THIRD_PARTY_NETWORK", "REGION"])) @Valid @RequestParam(value = "reservableType", required = false) reservableType: kotlin.String?,
        @Parameter(description = "the keyword to search the reservation on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the start date of the reservation search") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date of the reservation search") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the start of the index and/or pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit of the index and/or pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<List<ReservationResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_RESERVATION: String = "/reservation/create"
        const val PATH_DELETE_RESERVATION: String = "/reservation/delete"
        const val PATH_SEARCH_RESERVATIONS: String = "/reservation/search"
    }
}
