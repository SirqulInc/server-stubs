package org.openapitools.api

import org.openapitools.model.ConsumerInviteResponse
import org.openapitools.model.InviteResponse
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
class InviteApiController() {

    @Operation(
        summary = "Accept Invite",
        operationId = "acceptInvite",
        description = """Allows a user to accept an invite. The user could also become the inviter's friend.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConsumerInviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/accept"
        value = [PATH_ACCEPT_INVITE],
        produces = ["*/*"]
    )
    fun acceptInvite(
        @NotNull @Parameter(description = "the invite token", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,
        @NotNull @Parameter(description = "the accountId of the user who is accepting the invite", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "the album id associated with this invite (if applicable)") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "the mission id associated with this invite (if applicable)") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "the album contest id associated with this invite (if applicable)") @Valid @RequestParam(value = "albumContestId", required = false) albumContestId: kotlin.Long?,
        @Parameter(description = "the offer id associated with this invite (if applicable)") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "the offer location id associated with this invite (if applicable)") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "the retailer location id associated with this invite (if applicable)") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "whether to auto-friend the invite sender and receiver", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "autoFriend", required = false, defaultValue = "true") autoFriend: kotlin.Boolean,
        @Parameter(description = "whether to mark the event as attending automatically after invite is accepted", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "autoAttendEvent", required = false, defaultValue = "false") autoAttendEvent: kotlin.Boolean,
        @Parameter(description = "whether to mark the offer as favorited automatically after invite is accepted", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "autoFavoriteOffer", required = false, defaultValue = "false") autoFavoriteOffer: kotlin.Boolean,
        @Parameter(description = "whether to mark the offer location as favorited automatically after invite is accepted", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "autoFavoriteOfferLocation", required = false, defaultValue = "false") autoFavoriteOfferLocation: kotlin.Boolean,
        @Parameter(description = "whether to mark the retailer location as favorited automatically after invite is accepted", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "autoFavoriteRetailerLocation", required = false, defaultValue = "false") autoFavoriteRetailerLocation: kotlin.Boolean
    ): ResponseEntity<ConsumerInviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Contest",
        operationId = "albumContestInvite",
        description = """Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/albumContest"
        value = [PATH_ALBUM_CONTEST_INVITE],
        produces = ["*/*"]
    )
    fun albumContestInvite(
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "appId", required = false) appId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the album contest to share") @Valid @RequestParam(value = "albumContestId", required = false) albumContestId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Collection",
        operationId = "albumInvite",
        description = """Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/album"
        value = [PATH_ALBUM_INVITE],
        produces = ["*/*"]
    )
    fun albumInvite(
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "appId", required = false) appId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the album to share") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Event",
        operationId = "eventInvite",
        description = """Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/event"
        value = [PATH_EVENT_INVITE],
        produces = ["*/*"]
    )
    fun eventInvite(
        @NotNull @Parameter(description = "the account ID of the user making the share", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The ID of the event listing", required = true) @Valid @RequestParam(value = "listingId", required = true) listingId: kotlin.Long,
        @Parameter(description = "the account ID of a Sirqul user they would like to share an event with") @Valid @RequestParam(value = "receiverAccountIds", required = false) receiverAccountIds: kotlin.String?,
        @Parameter(description = "The retailer location id of where the event will take place") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Game Level",
        operationId = "gameInvite",
        description = """Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/gameLevel"
        value = [PATH_GAME_INVITE],
        produces = ["*/*"]
    )
    fun gameInvite(
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "appId", required = false) appId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the game level that the user owns and is giving access to") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Invite",
        operationId = "getInvite",
        description = """This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/invite/get"
        value = [PATH_GET_INVITE],
        produces = ["*/*"]
    )
    fun getInvite(
        @Parameter(description = "Account ID of the user if they are logged in") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the invite token") @Valid @RequestParam(value = "token", required = false) token: kotlin.String?,
        @Parameter(description = "album id to match the invite against (if applicable)") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "mission id to match the invite against (if applicable)") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "album contest id to match the invite against (if applicable)") @Valid @RequestParam(value = "albumContestId", required = false) albumContestId: kotlin.Long?,
        @Parameter(description = "offer id to match the invite against (if applicable)") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "offer location id to match the invite against (if applicable)") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "retailer location id to match the invite against (if applicable)") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Mission",
        operationId = "missionInvite",
        description = """Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/mission"
        value = [PATH_MISSION_INVITE],
        produces = ["*/*"]
    )
    fun missionInvite(
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "appId", required = false) appId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the mission to share") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Offer",
        operationId = "offerInvite",
        description = """Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite's list.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/offer"
        value = [PATH_OFFER_INVITE],
        produces = ["*/*"]
    )
    fun offerInvite(
        @NotNull @Parameter(description = "the account ID of the user making the share", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the ID of the offer used to invite to favorite", required = true) @Valid @RequestParam(value = "offerId", required = true) offerId: kotlin.Long
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Offer Location",
        operationId = "offerLocationInvite",
        description = """Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite's list.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/offerLocation"
        value = [PATH_OFFER_LOCATION_INVITE],
        produces = ["*/*"]
    )
    fun offerLocationInvite(
        @NotNull @Parameter(description = "the account ID of the user making the share", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the id of the offer location to share", required = true) @Valid @RequestParam(value = "offerLocationId", required = true) offerLocationId: kotlin.Long
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Invite to Retailer Location",
        operationId = "retailerLocationInvite",
        description = """Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite's list.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = InviteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/invite/retailerLocation"
        value = [PATH_RETAILER_LOCATION_INVITE],
        produces = ["*/*"]
    )
    fun retailerLocationInvite(
        @NotNull @Parameter(description = "the account ID of the user making the share", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The retailer location id of where the event will take place", required = true) @Valid @RequestParam(value = "retailerLocationId", required = true) retailerLocationId: kotlin.Long,
        @Parameter(description = "Optional album id to link with the invite") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?
    ): ResponseEntity<InviteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ACCEPT_INVITE: String = "/invite/accept"
        const val PATH_ALBUM_CONTEST_INVITE: String = "/invite/albumContest"
        const val PATH_ALBUM_INVITE: String = "/invite/album"
        const val PATH_EVENT_INVITE: String = "/invite/event"
        const val PATH_GAME_INVITE: String = "/invite/gameLevel"
        const val PATH_GET_INVITE: String = "/invite/get"
        const val PATH_MISSION_INVITE: String = "/invite/mission"
        const val PATH_OFFER_INVITE: String = "/invite/offer"
        const val PATH_OFFER_LOCATION_INVITE: String = "/invite/offerLocation"
        const val PATH_RETAILER_LOCATION_INVITE: String = "/invite/retailerLocation"
    }
}
