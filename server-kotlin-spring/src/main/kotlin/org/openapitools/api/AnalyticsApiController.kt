package org.openapitools.api

import org.openapitools.model.ChartData
import org.openapitools.model.SirqulResponse
import org.openapitools.model.UserActivityResponse
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
class AnalyticsApiController() {

    @Operation(
        summary = "Get User Activity",
        operationId = "activities",
        description = """Get an activity feed by user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = UserActivityResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/analytics/useractivity"
        value = [PATH_ACTIVITIES],
        produces = ["*/*"]
    )
    fun activities(
        @NotNull @Parameter(description = "The start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<List<UserActivityResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Aggregated Filtered Usage",
        operationId = "aggregatedFilteredUsage",
        description = """Query analytics to get data used for nested graphs and charts""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ChartData::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/analytics/aggregatedFilteredUsage"
        value = [PATH_AGGREGATED_FILTERED_USAGE],
        produces = ["*/*"]
    )
    fun aggregatedFilteredUsage(
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "applicationId", required = false) applicationId: kotlin.Long?,
        @Parameter(description = "The application key used to filter results by application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The device type to filter results by (performs a LIKE search)") @Valid @RequestParam(value = "deviceType", required = false) deviceType: kotlin.String?,
        @Parameter(description = "The device to filter results by (performs a LIKE search)") @Valid @RequestParam(value = "device", required = false) device: kotlin.String?,
        @Parameter(description = "The device OS to filter results by (performs a LIKE search)") @Valid @RequestParam(value = "deviceOS", required = false) deviceOS: kotlin.String?,
        @Parameter(description = "The gender to filter results by {MALE, FEMALE}") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}") @Valid @RequestParam(value = "ageGroup", required = false) ageGroup: kotlin.String?,
        @Parameter(description = "The country to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The state to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The city to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The zip to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "zip", required = false) zip: kotlin.String?,
        @Parameter(description = "The model to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "model", required = false) model: kotlin.String?,
        @Parameter(description = "The tag to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "tag", required = false) tag: kotlin.String?,
        @Parameter(description = "The account id to filter results for a particular user") @Valid @RequestParam(value = "userAccountId", required = false) userAccountId: kotlin.Long?,
        @Parameter(description = "The user display to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "userAccountDisplay", required = false) userAccountDisplay: kotlin.String?,
        @Parameter(description = "The username to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "userAccountUsername", required = false) userAccountUsername: kotlin.String?,
        @Parameter(description = "Determines how to group results. For example, passing in 'CREATED' will return results by date. Passing in 'ACCOUNT' will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "groupByRoot", required = false) groupByRoot: kotlin.String?,
        @Parameter(description = "Determines how to group the nested data. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "groupBy", required = false) groupBy: kotlin.String?,
        @Parameter(description = "Performs a unique query on the specified column. For example, passing in 'ACCOUNT' will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, NEW_ACCOUNT}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "distinctCount", required = false) distinctCount: kotlin.String?,
        @Parameter(description = "Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether to return results in descending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return data that has empty or unknown values") @Valid @RequestParam(value = "hideUnknown", required = false) hideUnknown: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return a JOSN or XML representation of the graph results", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "Used to limit results to get a cleaner graph. The results that gets filtered out will be combined") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ChartData> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Filtered Usage",
        operationId = "filteredUsage",
        description = """Query analytics to get data used for graphs and charts""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ChartData::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/analytics/filteredUsage"
        value = [PATH_FILTERED_USAGE],
        produces = ["*/*"]
    )
    fun filteredUsage(
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "applicationId", required = false) applicationId: kotlin.Long?,
        @Parameter(description = "The application key used to filter results by application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The device type to filter results by (performs a LIKE search)") @Valid @RequestParam(value = "deviceType", required = false) deviceType: kotlin.String?,
        @Parameter(description = "The device to filter results by (performs a LIKE search)") @Valid @RequestParam(value = "device", required = false) device: kotlin.String?,
        @Parameter(description = "The device OS to filter results by (performs a LIKE search)") @Valid @RequestParam(value = "deviceOS", required = false) deviceOS: kotlin.String?,
        @Parameter(description = "The gender to filter results by {MALE, FEMALE}") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}") @Valid @RequestParam(value = "ageGroup", required = false) ageGroup: kotlin.String?,
        @Parameter(description = "The country to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The state to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The city to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The zip to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "zip", required = false) zip: kotlin.String?,
        @Parameter(description = "The model to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "model", required = false) model: kotlin.String?,
        @Parameter(description = "The tag to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "tag", required = false) tag: kotlin.String?,
        @Parameter(description = "The account id to filter results for a particular user") @Valid @RequestParam(value = "userAccountId", required = false) userAccountId: kotlin.Long?,
        @Parameter(description = "The user display to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "userAccountDisplay", required = false) userAccountDisplay: kotlin.String?,
        @Parameter(description = "The username to filter results by (performs a wild-card search)") @Valid @RequestParam(value = "userAccountUsername", required = false) userAccountUsername: kotlin.String?,
        @Parameter(description = "The ID for the custom table column") @Valid @RequestParam(value = "customId", required = false) customId: kotlin.Long?,
        @Parameter(description = "The type defined for the custom table column") @Valid @RequestParam(value = "customType", required = false) customType: kotlin.String?,
        @Parameter(description = "The value for the custom table column") @Valid @RequestParam(value = "customValue", required = false) customValue: kotlin.Double?,
        @Parameter(description = "The value for another custom table column") @Valid @RequestParam(value = "customValue2", required = false) customValue2: kotlin.Double?,
        @Parameter(description = "The value that supports Longs for custom table column") @Valid @RequestParam(value = "customLong", required = false) customLong: kotlin.Long?,
        @Parameter(description = "The value that supports Longs for custom table column") @Valid @RequestParam(value = "customLong2", required = false) customLong2: kotlin.Long?,
        @Parameter(description = "The message for the custom table column") @Valid @RequestParam(value = "customMessage", required = false) customMessage: kotlin.String?,
        @Parameter(description = "The message for the custom table column") @Valid @RequestParam(value = "customMessage2", required = false) customMessage2: kotlin.String?,
        @Parameter(description = "Determines how to group results. For example, passing in 'CREATED' will return results by date. Passing in 'ACCOUNT' will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "groupBy", required = false) groupBy: kotlin.String?,
        @Parameter(description = "Performs a unique query on the specified column. For example, passing in 'ACCOUNT' will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "distinctCount", required = false) distinctCount: kotlin.String?,
        @Parameter(description = "sum of the column values", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "sumColumn", required = false) sumColumn: kotlin.String?,
        @Parameter(description = "Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}", schema = Schema(allowableValues = ["TAG_COUNT", "TAG", "TOKEN", "MODEL", "DEVICE_TYPE", "DEVICE", "DEVICE_OS", "DEVICE_ID", "IP_ADDRESS", "STATE", "CITY", "ZIP", "COUNTRY", "CREATED", "UPDATED", "LAST_UPDATED", "CLIENT_TIME", "ACTIVE", "CUSTOM_ID", "CUSTOM_TYPE", "CUSTOM_VALUE", "CUSTOM_VALUE2", "CUSTOM_LONG", "CUSTOM_LONG2", "CUSTOM_MESSAGE", "CUSTOM_MESSAGE2", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_CREATED", "ACCOUNT_GENDER", "ACCOUNT_AGE_GROUP", "APPLICATION_ID", "APPLICATION_KEY", "APPLICATION_NAME"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether to return results in descending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return data that has empty or unknown values") @Valid @RequestParam(value = "hideUnknown", required = false) hideUnknown: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return a JOSN or XML representation of the graph results", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "Used to limit results to get a cleaner graph. The results that gets filtered out will be combined") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ChartData> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Usage Record",
        operationId = "usage",
        description = """Record an analytic record for a known state within the application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/analytics/usage"
        value = [PATH_USAGE],
        produces = ["*/*"]
    )
    fun usage(
        @NotNull @Parameter(description = "The tag to apply: the name of the action or thing being logged.", required = true) @Valid @RequestParam(value = "tag", required = true) tag: kotlin.String,
        @Parameter(description = "The client deviceID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. This is deprecated, use appKey.") @Valid @RequestParam(value = "applicationId", required = false) applicationId: kotlin.Long?,
        @Parameter(description = "The application key unique to each application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The current build version of the application") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)") @Valid @RequestParam(value = "device", required = false) device: kotlin.String?,
        @Parameter(description = "The type of device (Handheld or Desktop)") @Valid @RequestParam(value = "deviceType", required = false) deviceType: kotlin.String?,
        @Parameter(description = "The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc)") @Valid @RequestParam(value = "deviceOS", required = false) deviceOS: kotlin.String?,
        @Parameter(description = "The model of the device (iPhone5,1 , Nexus One, etc.)") @Valid @RequestParam(value = "model", required = false) model: kotlin.String?,
        @Parameter(description = "The current position of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current position of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "A customId used to associate the usage record with some other record in the system") @Valid @RequestParam(value = "customId", required = false) customId: kotlin.Long?,
        @Parameter(description = "The type of record the customId is recorded for") @Valid @RequestParam(value = "customType", required = false) customType: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. This is deprecated, use \"customValue\". Determines how many achievement points and/or ranking points the user gets if this analytic is associated with an achievement") @Valid @RequestParam(value = "achievementIncrement", required = false) achievementIncrement: kotlin.Long?,
        @Parameter(description = "The current city of the user") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The current state of the user") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The current country of the user") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The current zip of the user") @Valid @RequestParam(value = "zip", required = false) zip: kotlin.String?,
        @Parameter(description = "The general description of the user's location") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "Timestamp sent from device") @Valid @RequestParam(value = "clientTime", required = false) clientTime: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "errorMessage", required = false) errorMessage: kotlin.String?,
        @Parameter(description = "the ip address of the client device") @Valid @RequestParam(value = "ip", required = false) ip: kotlin.String?,
        @Parameter(description = "this is a description of the client (might contain the device's OS, browser version etc - its a common term)") @Valid @RequestParam(value = "userAgent", required = false) userAgent: kotlin.String?,
        @Parameter(description = "This is deprecated.") @Valid @RequestParam(value = "backgroundEvent", required = false) backgroundEvent: kotlin.Boolean?,
        @Parameter(description = "a custom message for the usage record") @Valid @RequestParam(value = "customMessage", required = false) customMessage: kotlin.String?,
        @Parameter(description = "a custom message for the usage record") @Valid @RequestParam(value = "customMessage2", required = false) customMessage2: kotlin.String?,
        @Parameter(description = "a custom value for the usage record") @Valid @RequestParam(value = "customValue", required = false) customValue: kotlin.Double?,
        @Parameter(description = "a custom value for the usage record") @Valid @RequestParam(value = "customValue2", required = false) customValue2: kotlin.Double?,
        @Parameter(description = "a custom long value for the usage record") @Valid @RequestParam(value = "customLong", required = false) customLong: kotlin.Long?,
        @Parameter(description = "a custom long value for the usage record") @Valid @RequestParam(value = "customLong2", required = false) customLong2: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Multiple Usage Records",
        operationId = "usageBatch",
        description = """Sends multiple analytics. Can be used to send in the user's stored usage when they did not have internet access. Should not include more than 100 items per batch.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/analytics/usage/batch"
        value = [PATH_USAGE_BATCH],
        produces = ["*/*"]
    )
    fun usageBatch(
        @NotNull @Parameter(description = "The application key unique to each application.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)", required = true) @Valid @RequestParam(value = "device", required = true) device: kotlin.String,
        @NotNull @Parameter(description = "The analytic data AnalyticListResponse", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String,
        @Parameter(description = "The unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the logged in user making the request") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current build version of the application") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "The type of device (Handheld or Desktop)") @Valid @RequestParam(value = "deviceType", required = false) deviceType: kotlin.String?,
        @Parameter(description = "The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc.)") @Valid @RequestParam(value = "deviceOS", required = false) deviceOS: kotlin.String?,
        @Parameter(description = "The model of the device (iPhone5,1 , Nexus One, etc.)") @Valid @RequestParam(value = "model", required = false) model: kotlin.String?,
        @Parameter(description = "Will create a leaderboard if one does not exist for the \"tag\" yet") @Valid @RequestParam(value = "updateRanking", required = false) updateRanking: kotlin.Boolean?,
        @Parameter(description = "Returns a summary response of the achievements that have been completed due to the analytics") @Valid @RequestParam(value = "returnSummaryResponse", required = false) returnSummaryResponse: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ACTIVITIES: String = "/analytics/useractivity"
        const val PATH_AGGREGATED_FILTERED_USAGE: String = "/analytics/aggregatedFilteredUsage"
        const val PATH_FILTERED_USAGE: String = "/analytics/filteredUsage"
        const val PATH_USAGE: String = "/analytics/usage"
        const val PATH_USAGE_BATCH: String = "/analytics/usage/batch"
    }
}
