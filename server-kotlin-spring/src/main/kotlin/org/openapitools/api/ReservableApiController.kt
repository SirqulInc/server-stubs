package org.openapitools.api

import org.openapitools.model.AvailabilityResponse
import org.openapitools.model.TimeSlotResponse
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
class ReservableApiController() {

    @Operation(
        summary = "Update Availability",
        operationId = "reservableAvailability",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AvailabilityResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/reservable/availability/update"
        value = [PATH_RESERVABLE_AVAILABILITY],
        produces = ["*/*"]
    )
    fun reservableAvailability(
        @NotNull @Parameter(description = "the id of the reservation", required = true) @Valid @RequestParam(value = "reservableId", required = true) reservableId: kotlin.Long,
        @NotNull @Parameter(description = "the type of reservation", required = true, schema = Schema(allowableValues = ["LOCATABLE", "RESERVABLE", "PERMISSIONABLE", "NOTABLE", "ASSETABLE", "LIKABLE", "FLAGABLE", "FAVORITABLE", "RATABLE", "ALBUM", "COLLECTION", "APPLICATION", "APPLICATION_SETTING", "APPLICATION_CERT", "APPLICATION_PLACEMENT", "ACCOUNT", "ACCOUNT_SETTING", "GAME_LEVEL", "PACK", "MISSION", "TOURNAMENT", "ASSET", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "OFFER", "OFFER_LOCATION", "EVENT", "RETAILER", "RETAILER_LOCATION", "NOTE", "CREATIVE", "FAVORITE", "LIKE", "RATING", "ANALYTIC", "THIRD_PARTY_CREDENTIAL", "THIRD_PARTY_NETWORK", "REGION"])) @Valid @RequestParam(value = "reservableType", required = true) reservableType: kotlin.String,
        @Parameter(description = "the device id of the reservation") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Availability") @Valid @RequestParam(value = "availability", required = false) availability: kotlin.String?,
        @Parameter(description = "Availability Summary") @Valid @RequestParam(value = "availabilitySummary", required = false) availabilitySummary: kotlin.String?
    ): ResponseEntity<List<AvailabilityResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Availability",
        operationId = "searchAvailability",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AvailabilityResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/reservable/availability/search"
        value = [PATH_SEARCH_AVAILABILITY],
        produces = ["*/*"]
    )
    fun searchAvailability(
        @NotNull @Parameter(description = "the id of the reservation", required = true) @Valid @RequestParam(value = "reservableId", required = true) reservableId: kotlin.Long,
        @NotNull @Parameter(description = "the reservable type", required = true, schema = Schema(allowableValues = ["LOCATABLE", "RESERVABLE", "PERMISSIONABLE", "NOTABLE", "ASSETABLE", "LIKABLE", "FLAGABLE", "FAVORITABLE", "RATABLE", "ALBUM", "COLLECTION", "APPLICATION", "APPLICATION_SETTING", "APPLICATION_CERT", "APPLICATION_PLACEMENT", "ACCOUNT", "ACCOUNT_SETTING", "GAME_LEVEL", "PACK", "MISSION", "TOURNAMENT", "ASSET", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "OFFER", "OFFER_LOCATION", "EVENT", "RETAILER", "RETAILER_LOCATION", "NOTE", "CREATIVE", "FAVORITE", "LIKE", "RATING", "ANALYTIC", "THIRD_PARTY_CREDENTIAL", "THIRD_PARTY_NETWORK", "REGION"])) @Valid @RequestParam(value = "reservableType", required = true) reservableType: kotlin.String,
        @Parameter(description = "the device ID that the reservation is on") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the start date of the reservation") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date of the reservation") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the start of the index and/or pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit of the index and/or pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<List<AvailabilityResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Schedule",
        operationId = "searchSchedule",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = TimeSlotResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/reservable/schedule/search"
        value = [PATH_SEARCH_SCHEDULE],
        produces = ["*/*"]
    )
    fun searchSchedule(
        @NotNull @Parameter(description = "the id of the reservation", required = true) @Valid @RequestParam(value = "reservableId", required = true) reservableId: kotlin.Long,
        @NotNull @Parameter(description = "the reservation type", required = true, schema = Schema(allowableValues = ["LOCATABLE", "RESERVABLE", "PERMISSIONABLE", "NOTABLE", "ASSETABLE", "LIKABLE", "FLAGABLE", "FAVORITABLE", "RATABLE", "ALBUM", "COLLECTION", "APPLICATION", "APPLICATION_SETTING", "APPLICATION_CERT", "APPLICATION_PLACEMENT", "ACCOUNT", "ACCOUNT_SETTING", "GAME_LEVEL", "PACK", "MISSION", "TOURNAMENT", "ASSET", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "OFFER", "OFFER_LOCATION", "EVENT", "RETAILER", "RETAILER_LOCATION", "NOTE", "CREATIVE", "FAVORITE", "LIKE", "RATING", "ANALYTIC", "THIRD_PARTY_CREDENTIAL", "THIRD_PARTY_NETWORK", "REGION"])) @Valid @RequestParam(value = "reservableType", required = true) reservableType: kotlin.String,
        @NotNull @Parameter(description = "the start date of the reservation", required = true) @Valid @RequestParam(value = "startDate", required = true) startDate: kotlin.Long,
        @NotNull @Parameter(description = "the end date of the reservation", required = true) @Valid @RequestParam(value = "endDate", required = true) endDate: kotlin.Long,
        @Parameter(description = "the id of the device that the reservation is on") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the length of time in minutes to search on for reservation", schema = Schema(defaultValue = "30")) @Valid @RequestParam(value = "timeBucketMins", required = false, defaultValue = "30") timeBucketMins: kotlin.Int
    ): ResponseEntity<List<TimeSlotResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_RESERVABLE_AVAILABILITY: String = "/reservable/availability/update"
        const val PATH_SEARCH_AVAILABILITY: String = "/reservable/availability/search"
        const val PATH_SEARCH_SCHEDULE: String = "/reservable/schedule/search"
    }
}
