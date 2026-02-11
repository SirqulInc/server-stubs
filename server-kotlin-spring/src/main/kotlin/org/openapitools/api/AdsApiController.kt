package org.openapitools.api

import org.openapitools.model.MissionResponse
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
class AdsApiController() {

    @Operation(
        summary = "Find Missions",
        operationId = "adsFind",
        description = """Get a set of ad filtered by the parameters provided.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = MissionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ads/find"
        value = [PATH_ADS_FIND],
        produces = ["*/*"]
    )
    fun adsFind(
        @NotNull @Parameter(description = "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "return a random set of results, default is true. If false returns in nature order.", required = true) @Valid @RequestParam(value = "randomize", required = true) randomize: kotlin.Boolean,
        @NotNull @Parameter(description = "return only ads targets to the specific app, no global ads.", required = true) @Valid @RequestParam(value = "targetedAdsOnly", required = true) targetedAdsOnly: kotlin.Boolean,
        @Parameter(description = "The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "The logged in user.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The version of the application, will not return levels newer than the appVersion.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "The current location of the requesting device") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the requesting device") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.") @Valid @RequestParam(value = "device", required = false) device: kotlin.String?,
        @Parameter(description = "The device ID of the requesting device, use /audience/devices for list") @Valid @RequestParam(value = "deviceIdentifier", required = false) deviceIdentifier: kotlin.Long?,
        @Parameter(description = "The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.") @Valid @RequestParam(value = "deviceVersion", required = false) deviceVersion: kotlin.String?,
        @Parameter(description = "The index into the record set to start with.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The total number of record to return.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "If true then return the audience data in the response. Default is false.") @Valid @RequestParam(value = "includeAudiences", required = false) includeAudiences: kotlin.Boolean?,
        @Parameter(description = "If true/false only return missions whose game levels allocate (or don't allocate) tickets. Do not provide a value to return both.") @Valid @RequestParam(value = "allocatesTickets", required = false) allocatesTickets: kotlin.Boolean?,
        @Parameter(description = "return only ads from the specified campaigns.") @Valid @RequestParam(value = "missionIds", required = false) missionIds: kotlin.String?
    ): ResponseEntity<List<MissionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADS_FIND: String = "/ads/find"
    }
}
