package org.openapitools.api

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
class VatomApiController() {

    @Operation(
        summary = "Create following",
        operationId = "createFollowing",
        description = """Create following.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/me/rels/following/create"
        value = [PATH_CREATE_FOLLOWING]
    )
    fun createFollowing(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Vatom Space",
        operationId = "createSpace",
        description = """Create a Vatom space.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/spaces/create"
        value = [PATH_CREATE_SPACE]
    )
    fun createSpace(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Vatom Event",
        operationId = "createVatomEvent",
        description = """Create a Vatom event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/events/create"
        value = [PATH_CREATE_VATOM_EVENT]
    )
    fun createVatomEvent(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete following",
        operationId = "deleteFollowing",
        description = """Delete following.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/me/rels/following/delete"
        value = [PATH_DELETE_FOLLOWING]
    )
    fun deleteFollowing(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom Rels Key", required = true) @Valid @RequestParam(value = "vatomRelsKey", required = true) vatomRelsKey: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Reset All Points Balance",
        operationId = "deletePointsBalance",
        description = """Reset All Points Balance.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/campaign/points/delete"
        value = [PATH_DELETE_POINTS_BALANCE]
    )
    fun deletePointsBalance(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Vatom Space",
        operationId = "deleteSpace",
        description = """Delete a Vatom space.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/spaces/delete"
        value = [PATH_DELETE_SPACE]
    )
    fun deleteSpace(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Space Id", required = true) @Valid @RequestParam(value = "vatomSpaceId", required = true) vatomSpaceId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Vatom Event",
        operationId = "deleteVatomEvent",
        description = """Delete a Vatom event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/events/delete"
        value = [PATH_DELETE_VATOM_EVENT]
    )
    fun deleteVatomEvent(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Event Id", required = true) @Valid @RequestParam(value = "vatomEventId", required = true) vatomEventId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Vatom NFT",
        operationId = "deleteVatomNFT",
        description = """Delete Vatom NFT""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/vatoms/delete"
        value = [PATH_DELETE_VATOM_NFT]
    )
    fun deleteVatomNFT(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom NFT Id", required = true) @Valid @RequestParam(value = "vatomId", required = true) vatomId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Execute Action on NFT",
        operationId = "executeActionOnNFT",
        description = """Execute Action on NFT.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/vatoms/execute-action"
        value = [PATH_EXECUTE_ACTION_ON_NFT]
    )
    fun executeActionOnNFT(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom NFT Id", required = true) @Valid @RequestParam(value = "vatomId", required = true) vatomId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Vatom Geo Map",
        operationId = "geomapSearch",
        description = """Search Vatom Geo Map""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/vatoms/geo-map/search"
        value = [PATH_GEOMAP_SEARCH]
    )
    fun geomapSearch(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom Business Behaviors",
        operationId = "getBusinessBehaviors",
        description = """Gets the behaviors of a business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/behaviors"
        value = [PATH_GET_BUSINESS_BEHAVIORS]
    )
    fun getBusinessBehaviors(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the coins for a Business",
        operationId = "getBusinessCoinsBalance",
        description = """Get the coins for a Businesss.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/coins/get"
        value = [PATH_GET_BUSINESS_COINS_BALANCE]
    )
    fun getBusinessCoinsBalance(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the user business ids",
        operationId = "getBusinessIds",
        description = """Get the business ids the logged in user has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/me/businesses"
        value = [PATH_GET_BUSINESS_IDS]
    )
    fun getBusinessIds(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom Business Info",
        operationId = "getBusinessInfo",
        description = """Gets the business info tied to this account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/get"
        value = [PATH_GET_BUSINESS_INFO]
    )
    fun getBusinessInfo(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom Business Users",
        operationId = "getBusinessUsers",
        description = """Gets the users of a business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/users"
        value = [PATH_GET_BUSINESS_USERS]
    )
    fun getBusinessUsers(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Campaign Group Entities",
        operationId = "getCampaignGroupEntities",
        description = """Get campaign group entities.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/campaign-groups/entities"
        value = [PATH_GET_CAMPAIGN_GROUP_ENTITIES]
    )
    fun getCampaignGroupEntities(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Campaign Group Rules",
        operationId = "getCampaignGroupRules",
        description = """Get campaign group rules.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/campaign-groups/rules"
        value = [PATH_GET_CAMPAIGN_GROUP_RULES]
    )
    fun getCampaignGroupRules(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Campaign Group Stats",
        operationId = "getCampaignGroupStats",
        description = """Get campaign group stats.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/campaign-groups/stats"
        value = [PATH_GET_CAMPAIGN_GROUP_STATS]
    )
    fun getCampaignGroupStats(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Campaign Info",
        operationId = "getCampaignInfo",
        description = """Gets the info on a campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/campaign-groups/get"
        value = [PATH_GET_CAMPAIGN_INFO]
    )
    fun getCampaignInfo(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom Event Guest List",
        operationId = "getEventGuestList",
        description = """Gets the guest list of an event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/events/guests/get"
        value = [PATH_GET_EVENT_GUEST_LIST]
    )
    fun getEventGuestList(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Event Id", required = true) @Valid @RequestParam(value = "vatomEventId", required = true) vatomEventId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom User's Inventory",
        operationId = "getInventory",
        description = """Gets the logged in user's Vatom Inventory.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/me/inventory"
        value = [PATH_GET_INVENTORY]
    )
    fun getInventory(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get following",
        operationId = "getMyFollowing",
        description = """Get following.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/me/rels/following"
        value = [PATH_GET_MY_FOLLOWING]
    )
    fun getMyFollowing(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Points Balance",
        operationId = "getPointsBalance",
        description = """Gets the points balance of a Vatom user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/u/campaign/points/get"
        value = [PATH_GET_POINTS_BALANCE]
    )
    fun getPointsBalance(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Points Balance as Business",
        operationId = "getPointsBalanceAsBusiness",
        description = """Gets the points balance of a Vatom user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/campaign/u/points/get"
        value = [PATH_GET_POINTS_BALANCE_AS_BUSINESS]
    )
    fun getPointsBalanceAsBusiness(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom Space",
        operationId = "getSpace",
        description = """Gets the details of a space.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/spaces/get"
        value = [PATH_GET_SPACE]
    )
    fun getSpace(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Space Id", required = true) @Valid @RequestParam(value = "vatomSpaceId", required = true) vatomSpaceId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the coins for a user (as a Business)",
        operationId = "getUserCoinsAsBusiness",
        description = """Get the coins for a user (as a Business).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/users/coins/get"
        value = [PATH_GET_USER_COINS_AS_BUSINESS]
    )
    fun getUserCoinsAsBusiness(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Gets the coins balance for a Vatom User",
        operationId = "getUserCoinsBalance",
        description = """Gets the coins balance for a Vatom User.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/u/coins/get"
        value = [PATH_GET_USER_COINS_BALANCE]
    )
    fun getUserCoinsBalance(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user followers",
        operationId = "getUserFollowers",
        description = """Get user followers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/users/rels/followers"
        value = [PATH_GET_USER_FOLLOWERS]
    )
    fun getUserFollowers(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user following",
        operationId = "getUserFollowing",
        description = """Get user following.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/users/rels/following"
        value = [PATH_GET_USER_FOLLOWING]
    )
    fun getUserFollowing(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get User Info",
        operationId = "getUserInfo",
        description = """Get a User's Info.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/user/get"
        value = [PATH_GET_USER_INFO]
    )
    fun getUserInfo(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom User Profile",
        operationId = "getUserProfile",
        description = """Gets the logged in user's profile in Vatom.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/me/get"
        value = [PATH_GET_USER_PROFILE]
    )
    fun getUserProfile(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom Event",
        operationId = "getVatomEvent",
        description = """Gets the details of a event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/events/get"
        value = [PATH_GET_VATOM_EVENT]
    )
    fun getVatomEvent(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Event Id", required = true) @Valid @RequestParam(value = "vatomEventId", required = true) vatomEventId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vatom NFT Details",
        operationId = "getVatomNFT",
        description = """Get Vatom NFT Details""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/vatoms/get"
        value = [PATH_GET_VATOM_NFT]
    )
    fun getVatomNFT(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom NFT Id", required = true) @Valid @RequestParam(value = "vatomId", required = true) vatomId: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Vatom Communities",
        operationId = "listCommunities",
        description = """Gets the communities tied to a business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/communities/search"
        value = [PATH_LIST_COMMUNITIES]
    )
    fun listCommunities(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Vatom Events",
        operationId = "listEvents",
        description = """Gets the events tied to a business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/events/search"
        value = [PATH_LIST_EVENTS]
    )
    fun listEvents(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Vatom Spaces",
        operationId = "listSpaces",
        description = """Gets the spaces tied to a business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/spaces/search"
        value = [PATH_LIST_SPACES]
    )
    fun listSpaces(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Coin Transactions for a Vatom User",
        operationId = "listUserCoinTransactions",
        description = """Gets the logged in user's Vatom coin transactions.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/u/coins/txns/search"
        value = [PATH_LIST_USER_COIN_TRANSACTIONS]
    )
    fun listUserCoinTransactions(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List coin transactions for a user (as a Business)",
        operationId = "listUserCoinTransactionsAsBusiness",
        description = """List coin transactions for a user (as a Business).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/users/coins/txns/search"
        value = [PATH_LIST_USER_COIN_TRANSACTIONS_AS_BUSINESS]
    )
    fun listUserCoinTransactionsAsBusiness(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Perform Action on NFT",
        operationId = "performActionOnNFT",
        description = """Perform Action on NFT.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/me/vatoms/actions"
        value = [PATH_PERFORM_ACTION_ON_NFT]
    )
    fun performActionOnNFT(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom NFT Id", required = true) @Valid @RequestParam(value = "vatomId", required = true) vatomId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Action", required = true) @Valid @RequestParam(value = "vatomAction", required = true) vatomAction: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Redeem NFT",
        operationId = "redeemNFT",
        description = """Redeem an NFT.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/redemptions"
        value = [PATH_REDEEM_NFT]
    )
    fun redeemNFT(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Redeem the coins for a user (as a Business)",
        operationId = "redeemUserCoinsAsBusiness",
        description = """Redeem the coins for a user (as a Business).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/users/coins/redeem"
        value = [PATH_REDEEM_USER_COINS_AS_BUSINESS]
    )
    fun redeemUserCoinsAsBusiness(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search for Vatom Businesses",
        operationId = "searchBusinesses",
        description = """Searches for Vatom businesses.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/search"
        value = [PATH_SEARCH_BUSINESSES]
    )
    fun searchBusinesses(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Campaign Groups",
        operationId = "searchCampaignGroups",
        description = """Search campaign groups.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/b/campaign-groups/search"
        value = [PATH_SEARCH_CAMPAIGN_GROUPS]
    )
    fun searchCampaignGroups(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search User Identities",
        operationId = "searchIdentities",
        description = """Search User Identities.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/me/identities/search"
        value = [PATH_SEARCH_IDENTITIES]
    )
    fun searchIdentities(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Vatom User's Inventory",
        operationId = "searchInventory",
        description = """Searches the logged in user's Vatom Inventory.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vatom/user-inventory/search"
        value = [PATH_SEARCH_INVENTORY]
    )
    fun searchInventory(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Vatom Parameters") @Valid @RequestParam(value = "vatomParameters", required = false) vatomParameters: kotlin.String?,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send NFT",
        operationId = "sendNFT",
        description = """Send an NFT.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/campaigns/send"
        value = [PATH_SEND_NFT]
    )
    fun sendNFT(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Set Points Balance as Business",
        operationId = "setPointsBalanceAsBusiness",
        description = """Sets the points balance of a Vatom user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/campaign/u/points/update"
        value = [PATH_SET_POINTS_BALANCE_AS_BUSINESS]
    )
    fun setPointsBalanceAsBusiness(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Campaign Id", required = true) @Valid @RequestParam(value = "vatomCampaignId", required = true) vatomCampaignId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Transfer coins from Vatom Users",
        operationId = "transferUserCoins",
        description = """Transfer coins from Vatom Users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/u/coins/transfer"
        value = [PATH_TRANSFER_USER_COINS]
    )
    fun transferUserCoins(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Fund coins for a Business",
        operationId = "updateBusinessCoins",
        description = """Fund/update coins for a Businesss.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/coins/update"
        value = [PATH_UPDATE_BUSINESS_COINS]
    )
    fun updateBusinessCoins(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Vatom Event Guest List",
        operationId = "updateEventGuestList",
        description = """Update the guest list of an event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/events/guests/update"
        value = [PATH_UPDATE_EVENT_GUEST_LIST]
    )
    fun updateEventGuestList(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Event Id", required = true) @Valid @RequestParam(value = "vatomEventId", required = true) vatomEventId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Vatom Space",
        operationId = "updateSpace",
        description = """Update a Vatom space.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/spaces/update"
        value = [PATH_UPDATE_SPACE]
    )
    fun updateSpace(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Space Id", required = true) @Valid @RequestParam(value = "vatomSpaceId", required = true) vatomSpaceId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update the coins for a user (as a Business)",
        operationId = "updateUserCoinsAsBusiness",
        description = """Update the coins for a user (as a Business).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/users/coins/update"
        value = [PATH_UPDATE_USER_COINS_AS_BUSINESS]
    )
    fun updateUserCoinsAsBusiness(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom User Id", required = true) @Valid @RequestParam(value = "vatomUserId", required = true) vatomUserId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Vatom User Profile",
        operationId = "updateUserProfile",
        description = """Gets the logged in user's profile in Vatom.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/me/update"
        value = [PATH_UPDATE_USER_PROFILE]
    )
    fun updateUserProfile(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Vatom Event",
        operationId = "updateVatomEvent",
        description = """Update a Vatom event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vatom/b/events/update"
        value = [PATH_UPDATE_VATOM_EVENT]
    )
    fun updateVatomEvent(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Application Key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Vatom Event Id", required = true) @Valid @RequestParam(value = "vatomEventId", required = true) vatomEventId: kotlin.String,
        @NotNull @Parameter(description = "Vatom Parameters", required = true) @Valid @RequestParam(value = "vatomParameters", required = true) vatomParameters: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_FOLLOWING: String = "/vatom/me/rels/following/create"
        const val PATH_CREATE_SPACE: String = "/vatom/b/spaces/create"
        const val PATH_CREATE_VATOM_EVENT: String = "/vatom/b/events/create"
        const val PATH_DELETE_FOLLOWING: String = "/vatom/me/rels/following/delete"
        const val PATH_DELETE_POINTS_BALANCE: String = "/vatom/b/campaign/points/delete"
        const val PATH_DELETE_SPACE: String = "/vatom/b/spaces/delete"
        const val PATH_DELETE_VATOM_EVENT: String = "/vatom/b/events/delete"
        const val PATH_DELETE_VATOM_NFT: String = "/vatom/vatoms/delete"
        const val PATH_EXECUTE_ACTION_ON_NFT: String = "/vatom/vatoms/execute-action"
        const val PATH_GEOMAP_SEARCH: String = "/vatom/vatoms/geo-map/search"
        const val PATH_GET_BUSINESS_BEHAVIORS: String = "/vatom/b/behaviors"
        const val PATH_GET_BUSINESS_COINS_BALANCE: String = "/vatom/b/coins/get"
        const val PATH_GET_BUSINESS_IDS: String = "/vatom/me/businesses"
        const val PATH_GET_BUSINESS_INFO: String = "/vatom/b/get"
        const val PATH_GET_BUSINESS_USERS: String = "/vatom/b/users"
        const val PATH_GET_CAMPAIGN_GROUP_ENTITIES: String = "/vatom/b/campaign-groups/entities"
        const val PATH_GET_CAMPAIGN_GROUP_RULES: String = "/vatom/b/campaign-groups/rules"
        const val PATH_GET_CAMPAIGN_GROUP_STATS: String = "/vatom/b/campaign-groups/stats"
        const val PATH_GET_CAMPAIGN_INFO: String = "/vatom/b/campaign-groups/get"
        const val PATH_GET_EVENT_GUEST_LIST: String = "/vatom/b/events/guests/get"
        const val PATH_GET_INVENTORY: String = "/vatom/me/inventory"
        const val PATH_GET_MY_FOLLOWING: String = "/vatom/me/rels/following"
        const val PATH_GET_POINTS_BALANCE: String = "/vatom/u/campaign/points/get"
        const val PATH_GET_POINTS_BALANCE_AS_BUSINESS: String = "/vatom/b/campaign/u/points/get"
        const val PATH_GET_SPACE: String = "/vatom/b/spaces/get"
        const val PATH_GET_USER_COINS_AS_BUSINESS: String = "/vatom/b/users/coins/get"
        const val PATH_GET_USER_COINS_BALANCE: String = "/vatom/u/coins/get"
        const val PATH_GET_USER_FOLLOWERS: String = "/vatom/users/rels/followers"
        const val PATH_GET_USER_FOLLOWING: String = "/vatom/users/rels/following"
        const val PATH_GET_USER_INFO: String = "/vatom/user/get"
        const val PATH_GET_USER_PROFILE: String = "/vatom/me/get"
        const val PATH_GET_VATOM_EVENT: String = "/vatom/b/events/get"
        const val PATH_GET_VATOM_NFT: String = "/vatom/vatoms/get"
        const val PATH_LIST_COMMUNITIES: String = "/vatom/b/communities/search"
        const val PATH_LIST_EVENTS: String = "/vatom/b/events/search"
        const val PATH_LIST_SPACES: String = "/vatom/b/spaces/search"
        const val PATH_LIST_USER_COIN_TRANSACTIONS: String = "/vatom/u/coins/txns/search"
        const val PATH_LIST_USER_COIN_TRANSACTIONS_AS_BUSINESS: String = "/vatom/b/users/coins/txns/search"
        const val PATH_PERFORM_ACTION_ON_NFT: String = "/vatom/me/vatoms/actions"
        const val PATH_REDEEM_NFT: String = "/vatom/b/redemptions"
        const val PATH_REDEEM_USER_COINS_AS_BUSINESS: String = "/vatom/b/users/coins/redeem"
        const val PATH_SEARCH_BUSINESSES: String = "/vatom/b/search"
        const val PATH_SEARCH_CAMPAIGN_GROUPS: String = "/vatom/b/campaign-groups/search"
        const val PATH_SEARCH_IDENTITIES: String = "/vatom/me/identities/search"
        const val PATH_SEARCH_INVENTORY: String = "/vatom/user-inventory/search"
        const val PATH_SEND_NFT: String = "/vatom/b/campaigns/send"
        const val PATH_SET_POINTS_BALANCE_AS_BUSINESS: String = "/vatom/b/campaign/u/points/update"
        const val PATH_TRANSFER_USER_COINS: String = "/vatom/u/coins/transfer"
        const val PATH_UPDATE_BUSINESS_COINS: String = "/vatom/b/coins/update"
        const val PATH_UPDATE_EVENT_GUEST_LIST: String = "/vatom/b/events/guests/update"
        const val PATH_UPDATE_SPACE: String = "/vatom/b/spaces/update"
        const val PATH_UPDATE_USER_COINS_AS_BUSINESS: String = "/vatom/b/users/coins/update"
        const val PATH_UPDATE_USER_PROFILE: String = "/vatom/me/update"
        const val PATH_UPDATE_VATOM_EVENT: String = "/vatom/b/events/update"
    }
}
