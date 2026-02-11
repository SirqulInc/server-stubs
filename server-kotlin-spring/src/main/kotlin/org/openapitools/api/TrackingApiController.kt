package org.openapitools.api

import org.openapitools.model.AccountMiniResponse
import org.openapitools.model.Leg
import org.openapitools.model.LegResponse
import org.openapitools.model.PredictedLocationResponse
import org.openapitools.model.PreferredLocationResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.StepResponse
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
class TrackingApiController() {

    @Operation(
        summary = "Create Batch Tracking",
        operationId = "batchSaveTracking",
        description = """Batch create tracking legs""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Leg::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tracking/batch/create"
        value = [PATH_BATCH_SAVE_TRACKING],
        produces = ["*/*"]
    )
    fun batchSaveTracking(
        @NotNull @Parameter(description = "JSON array of tracking legs ```json [   \"distance\": \"0.08\",   \"duration\": \"10000\",   \"startLatitude\": \"47.614603\",   \"startLongitude\": \"-122.350518\",   \"endLatitude\": \"47.614384\",   \"endLongitude\": \"-122.349161\",   \"startDate\": \"1361924010000\",   \"endDate\": \"1361924020000\",   \"steps\": [     {       \"distance\": \"0.03\",       \"duration\": \"5000\",       \"startLat\": \"47.614603\",       \"startLng\": \"-122.350518\",       \"startDate\": \"1361924010000\",       \"endLat\": \"47.614941\",       \"endLng\": \"-122.350062\",       \"endDate\": \"1361924015000\"     },{       \"distance\": \"0.05\",       \"duration\": \"5000\",       \"startLat\": \"47.614941\",       \"startLng\": \"-122.350062\",       \"startDate\": \"1361924015000\",       \"endLat\": \"47.614384\",       \"endLng\": \"-122.349161\",       \"endDate\": \"1361924020000\"     }   ] ] ``` ", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Whether to generate accounts for tracking entries when the owner does not exist") @Valid @RequestParam(value = "generateAccounts", required = false) generateAccounts: kotlin.Boolean?,
        @Parameter(description = "Whether to update the account's current location from the incoming tracking data") @Valid @RequestParam(value = "updateAccountLocations", required = false) updateAccountLocations: kotlin.Boolean?,
        @Parameter(description = "The default tag to apply to incoming legs when no tag is provided", schema = Schema(defaultValue = "PASSIVE")) @Valid @RequestParam(value = "defaultTag", required = false, defaultValue = "PASSIVE") defaultTag: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "slaveUID", required = false) slaveUID: kotlin.String?
    ): ResponseEntity<List<Leg>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Predicted Locations",
        operationId = "getPredictedLocations",
        description = """Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PredictedLocationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tracking/predicted/get"
        value = [PATH_GET_PREDICTED_LOCATIONS],
        produces = ["*/*"]
    )
    fun getPredictedLocations(
        @NotNull @Parameter(description = "The account id of the customer", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "latitude to return a more likely result set based on the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude to return a more likely result set based on the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow's date (timestamp in milliseconds). If no value is passed in, the current date will be used.") @Valid @RequestParam(value = "dateCheck", required = false) dateCheck: kotlin.Long?,
        @Parameter(description = "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \"8,9,10,11,17,18,19,20\".") @Valid @RequestParam(value = "hourCheck", required = false) hourCheck: kotlin.String?,
        @Parameter(description = "The minimum number matches in 1 hour to be considered a likely location.", schema = Schema(defaultValue = "1L")) @Valid @RequestParam(value = "threshold", required = false, defaultValue = "1L") threshold: kotlin.Long,
        @Parameter(description = "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}", schema = Schema(allowableValues = ["MILES", "KILOMETERS"], defaultValue = "MILES")) @Valid @RequestParam(value = "distanceUnit", required = false, defaultValue = "MILES") distanceUnit: kotlin.String,
        @Parameter(description = "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \"0\" (zero) will ignore the radius restriction.", schema = Schema(defaultValue = "0.0")) @Valid @RequestParam(value = "searchRange", required = false, defaultValue = "0.0") searchRange: kotlin.Double,
        @Parameter(description = "The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}", schema = Schema(allowableValues = ["MATCHES", "DISTANCE", "WEIGHTED"], defaultValue = "MATCHES")) @Valid @RequestParam(value = "sortOrder", required = false, defaultValue = "MATCHES") sortOrder: kotlin.String
    ): ResponseEntity<PredictedLocationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Tracking Path",
        operationId = "getPredictedPath",
        description = """Get the path (lat/long coordinates) between 2 steps previously logged for a customer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = StepResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tracking/path/get"
        value = [PATH_GET_PREDICTED_PATH],
        produces = ["*/*"]
    )
    fun getPredictedPath(
        @NotNull @Parameter(description = "The account id of the customer", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The stepId to begin from", required = true) @Valid @RequestParam(value = "startStepId", required = true) startStepId: kotlin.Long,
        @NotNull @Parameter(description = "The stepId to end with", required = true) @Valid @RequestParam(value = "endStepId", required = true) endStepId: kotlin.Long
    ): ResponseEntity<List<StepResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Preferred Locations",
        operationId = "getPreferredLocations",
        description = """Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = PreferredLocationResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tracking/preferred/search"
        value = [PATH_GET_PREFERRED_LOCATIONS],
        produces = ["*/*"]
    )
    fun getPreferredLocations(
        @NotNull @Parameter(description = "The account id of the customer", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "latitude to return a more likely result set based on the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude to return a more likely result set based on the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow's date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.") @Valid @RequestParam(value = "dateCheck", required = false) dateCheck: kotlin.Long?,
        @Parameter(description = "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \"8,9,10,11,17,18,19,20\".") @Valid @RequestParam(value = "hourCheck", required = false) hourCheck: kotlin.String?,
        @Parameter(description = "Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location", schema = Schema(defaultValue = "PREFERRED_DATE")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "PREFERRED_DATE") sortField: kotlin.String,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \"0\" (zero) will ignore the radius restriction.", schema = Schema(defaultValue = "0.0")) @Valid @RequestParam(value = "searchRange", required = false, defaultValue = "0.0") searchRange: kotlin.Double,
        @Parameter(description = "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}", schema = Schema(allowableValues = ["MILES", "KILOMETERS"], defaultValue = "MILES")) @Valid @RequestParam(value = "distanceUnit", required = false, defaultValue = "MILES") distanceUnit: kotlin.String
    ): ResponseEntity<List<PreferredLocationResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tracking",
        operationId = "getTrackingLegs",
        description = """Retrieve tracking data to be able to show where a user has been.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = LegResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tracking/search"
        value = [PATH_GET_TRACKING_LEGS],
        produces = ["*/*"]
    )
    fun getTrackingLegs(
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the account id of the person the user wants to tracking data for") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "the id of the tracking device") @Valid @RequestParam(value = "trackingDeviceId", required = false) trackingDeviceId: kotlin.String?,
        @Parameter(description = "the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date in (UTC milliseconds) to filter the tracking results") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "filter results by tag") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "gets the last known location of the user", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "getLastPoint", required = false, defaultValue = "false") getLastPoint: kotlin.Boolean
    ): ResponseEntity<List<LegResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Tracking Leg",
        operationId = "saveTrackingLeg",
        description = """Send tracking points to be able to generate pathing data""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tracking/leg/create"
        value = [PATH_SAVE_TRACKING_LEG],
        produces = ["*/*"]
    )
    fun saveTrackingLeg(
        @NotNull @Parameter(description = "the latitude of the first point", required = true) @Valid @RequestParam(value = "startLat", required = true) startLat: kotlin.Double,
        @NotNull @Parameter(description = "the longitude of the first point", required = true) @Valid @RequestParam(value = "startLng", required = true) startLng: kotlin.Double,
        @NotNull @Parameter(description = "the start date (in UTC milliseconds) of the first point", required = true) @Valid @RequestParam(value = "startDate", required = true) startDate: kotlin.Long,
        @NotNull @Parameter(description = "the latitude of the last point", required = true) @Valid @RequestParam(value = "endLat", required = true) endLat: kotlin.Double,
        @NotNull @Parameter(description = "the longitude of the last point", required = true) @Valid @RequestParam(value = "endLng", required = true) endLng: kotlin.Double,
        @NotNull @Parameter(description = "the end date (in UTC milliseconds) of the last point", required = true) @Valid @RequestParam(value = "endDate", required = true) endDate: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the total distance") @Valid @RequestParam(value = "distance", required = false) distance: kotlin.Double?,
        @Parameter(description = "the total duration") @Valid @RequestParam(value = "duration", required = false) duration: kotlin.Long?,
        @Parameter(description = "JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. ```json [{   \"distance\": \"0.03\",   \"duration\": \"5000\",   \"startLat\": \"47.614603\",   \"startLng\": \"-122.350518\",   \"startDate\": \"1361924010000\",   \"endLat\": \"47.614941\",   \"endLng\": \"-122.350062\",   \"endDate\": \"1361924015000\" }] ``` ") @Valid @RequestParam(value = "steps", required = false) steps: kotlin.String?,
        @Parameter(description = "name the leg for searching") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Tracking Step",
        operationId = "saveTrackingStep",
        description = """Send tracking points to be able to generate pathing data""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tracking/step/create"
        value = [PATH_SAVE_TRACKING_STEP],
        produces = ["*/*"]
    )
    fun saveTrackingStep(
        @NotNull @Parameter(description = "the leg to add the step to", required = true) @Valid @RequestParam(value = "legId", required = true) legId: kotlin.Long,
        @NotNull @Parameter(description = "the latitude of the first point", required = true) @Valid @RequestParam(value = "startLat", required = true) startLat: kotlin.Double,
        @NotNull @Parameter(description = "the longitude of the first point", required = true) @Valid @RequestParam(value = "startLng", required = true) startLng: kotlin.Double,
        @NotNull @Parameter(description = "the start date (in UTC milliseconds) of the first point", required = true) @Valid @RequestParam(value = "startDate", required = true) startDate: kotlin.Long,
        @NotNull @Parameter(description = "the latitude of the last point", required = true) @Valid @RequestParam(value = "endLat", required = true) endLat: kotlin.Double,
        @NotNull @Parameter(description = "the longitude of the last point", required = true) @Valid @RequestParam(value = "endLng", required = true) endLng: kotlin.Double,
        @NotNull @Parameter(description = "the end date (in UTC milliseconds) of the last point", required = true) @Valid @RequestParam(value = "endDate", required = true) endDate: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the total distance") @Valid @RequestParam(value = "distance", required = false) distance: kotlin.Double?,
        @Parameter(description = "the total duration") @Valid @RequestParam(value = "duration", required = false) duration: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Tracking",
        operationId = "searchAccountsWithTrackingLegs",
        description = """Search for all accounts that have tracking legs data by the given constraints.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AccountMiniResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tracking/list"
        value = [PATH_SEARCH_ACCOUNTS_WITH_TRACKING_LEGS],
        produces = ["*/*"]
    )
    fun searchAccountsWithTrackingLegs(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Used for LIKE search of first or last name on the acocunt") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Range to begin in UTC milliseconds") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "Range to end in UTC milliseconds") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "Exact match on tag field of Legs's searchTag") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "Origin latitude to perform searching constraints with given range") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Origin longitude to perform searching constraints with given range") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The radius, in miles, to perform the search for", schema = Schema(defaultValue = "5.0")) @Valid @RequestParam(value = "range", required = false, defaultValue = "5.0") range: kotlin.Double,
        @Parameter(description = "The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}", schema = Schema(defaultValue = "LEG_START_DATE")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "LEG_START_DATE") sortField: kotlin.String,
        @Parameter(description = "The order to return the results. Default is false, which will return the results in ascending order.", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "The index into the record set to start with. Default is 0.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The total number of records to return. Default is 20.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active results. Default is false.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<AccountMiniResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tracking (Billable)",
        operationId = "searchTrackingLegs",
        description = """Retrieve tracking data for billable/account scoped queries.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = LegResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tracking/searchByBillable"
        value = [PATH_SEARCH_TRACKING_LEGS],
        produces = ["*/*"]
    )
    fun searchTrackingLegs(
        @NotNull @Parameter(description = "The account id to search tracking for", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The id of the tracking device") @Valid @RequestParam(value = "trackingDeviceId", required = false) trackingDeviceId: kotlin.String?,
        @Parameter(description = "The start date in (UTC milliseconds) to filter the tracking results") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The end date in (UTC milliseconds) to filter the tracking results") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "Filter results by tag") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<List<LegResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_BATCH_SAVE_TRACKING: String = "/tracking/batch/create"
        const val PATH_GET_PREDICTED_LOCATIONS: String = "/tracking/predicted/get"
        const val PATH_GET_PREDICTED_PATH: String = "/tracking/path/get"
        const val PATH_GET_PREFERRED_LOCATIONS: String = "/tracking/preferred/search"
        const val PATH_GET_TRACKING_LEGS: String = "/tracking/search"
        const val PATH_SAVE_TRACKING_LEG: String = "/tracking/leg/create"
        const val PATH_SAVE_TRACKING_STEP: String = "/tracking/step/create"
        const val PATH_SEARCH_ACCOUNTS_WITH_TRACKING_LEGS: String = "/tracking/list"
        const val PATH_SEARCH_TRACKING_LEGS: String = "/tracking/searchByBillable"
    }
}
