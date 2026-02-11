package org.openapitools.api

import org.openapitools.model.AlbumContestListResponse
import org.openapitools.model.AlbumContestResponse
import org.openapitools.model.ConnectionGroupResponse
import org.openapitools.model.ConnectionListResponse
import org.openapitools.model.ConnectionResponse
import org.openapitools.model.PurchaseItemListResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.ThemeDescriptorResponse
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
class ConsumerApiController() {

    @Operation(
        summary = "Add Connection",
        operationId = "addConnectionToGroup",
        description = """Adds a connection to a group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/group/addConnection"
        value = [PATH_ADD_CONNECTION_TO_GROUP],
        produces = ["*/*"]
    )
    fun addConnectionToGroup(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the group id", required = true) @Valid @RequestParam(value = "groupId", required = true) groupId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the connection id") @Valid @RequestParam(value = "connectionId", required = false) connectionId: kotlin.Long?,
        @Parameter(description = "the connection account id") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "the pending id") @Valid @RequestParam(value = "pendingId", required = false) pendingId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create or Update Contest",
        operationId = "addOrUpdateAlbumContest",
        description = """Creates or updates a contest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AlbumContestResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/album/contest"
        value = [PATH_ADD_OR_UPDATE_ALBUM_CONTEST],
        produces = ["*/*"]
    )
    fun addOrUpdateAlbumContest(
        @NotNull @Parameter(description = "determines whether the contest's participants has read permissions", required = true) @Valid @RequestParam(value = "publicRead", required = true) publicRead: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the contest's participants has write permissions", required = true) @Valid @RequestParam(value = "publicWrite", required = true) publicWrite: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the contest's participants has delete permissions", required = true) @Valid @RequestParam(value = "publicDelete", required = true) publicDelete: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the contest's participants has add permissions", required = true) @Valid @RequestParam(value = "publicAdd", required = true) publicAdd: kotlin.Boolean,
        @NotNull @Parameter(description = "the determines the album's participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)", required = true, schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = true) visibility: kotlin.String,
        @NotNull @Parameter(description = "determines whether to include all friends as participants", required = true) @Valid @RequestParam(value = "includeFriendGroup", required = true) includeFriendGroup: kotlin.Boolean,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. the application key") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "a custom field used for aggregation and searching") @Valid @RequestParam(value = "contestType", required = false) contestType: kotlin.String?,
        @Parameter(description = "the album contest ID for updating (don't pass in if creating)") @Valid @RequestParam(value = "albumContestId", required = false) albumContestId: kotlin.Long?,
        @Parameter(description = "the title of the contest") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the description of the contest") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the album ID for the first album") @Valid @RequestParam(value = "albumId1", required = false) albumId1: kotlin.Long?,
        @Parameter(description = "removes album1 from the contest") @Valid @RequestParam(value = "removeAlbum1", required = false) removeAlbum1: kotlin.Boolean?,
        @Parameter(description = "the album ID for the second album") @Valid @RequestParam(value = "albumId2", required = false) albumId2: kotlin.Long?,
        @Parameter(description = "removes album2 from the contest") @Valid @RequestParam(value = "removeAlbum2", required = false) removeAlbum2: kotlin.Boolean?,
        @Parameter(description = "the start date of the contest (time-stamp in milliseconds)") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date of the contest (time-stamp in milliseconds)") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the location description of the contest taking place") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "comma separated list of connection IDs") @Valid @RequestParam(value = "connectionIdsToAdd", required = false) connectionIdsToAdd: kotlin.String?,
        @Parameter(description = "comma separated list of connection group IDs") @Valid @RequestParam(value = "connectionGroupIdsToAdd", required = false) connectionGroupIdsToAdd: kotlin.String?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<AlbumContestResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create/Update Theme",
        operationId = "addOrUpdateThemeDescriptor",
        description = """Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ThemeDescriptorResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/theme"
        value = [PATH_ADD_OR_UPDATE_THEME_DESCRIPTOR],
        produces = ["*/*"]
    )
    fun addOrUpdateThemeDescriptor(
        @NotNull @Parameter(description = "determines whether the theme's participants have read permissions", required = true) @Valid @RequestParam(value = "publicRead", required = true) publicRead: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the theme's participants have write permissions", required = true) @Valid @RequestParam(value = "publicWrite", required = true) publicWrite: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the theme's participants have delete permissions", required = true) @Valid @RequestParam(value = "publicDelete", required = true) publicDelete: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "publicAdd", required = true) publicAdd: kotlin.Boolean,
        @NotNull @Parameter(description = "the determines the theme's participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)", required = true, schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = true) visibility: kotlin.String,
        @NotNull @Parameter(description = "flag to determine whether to share to the user's \"friends\" group", required = true) @Valid @RequestParam(value = "includeFriendGroup", required = true) includeFriendGroup: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether to use default values to complete the theme", required = true) @Valid @RequestParam(value = "completeWithDefaultValues", required = true) completeWithDefaultValues: kotlin.Boolean,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the theme descriptor id used to update an existing theme, leave empty for creating a new theme") @Valid @RequestParam(value = "themeDescriptorId", required = false) themeDescriptorId: kotlin.Long?,
        @Parameter(description = "the title of the theme") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the description of the theme") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "a comma separated list of connection IDs to share to users") @Valid @RequestParam(value = "connectionIdsToAdd", required = false) connectionIdsToAdd: kotlin.String?,
        @Parameter(description = "a comma separated list of connection group IDs to share to groups") @Valid @RequestParam(value = "connectionGroupIdsToAdd", required = false) connectionGroupIdsToAdd: kotlin.String?,
        @Parameter(description = "the application version the theme was created for") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "a json array used to replace colors within the application. Example: ```json [   {     \"name\": \"sceneAtlas\",     \"valueString\": \"100,100,100,255\"   },   {     \"name\": \"bg\",     \"valueString\": \"100,100,100,255\"   } ] ``` ") @Valid @RequestParam(value = "colorValueJson", required = false) colorValueJson: kotlin.String?,
        @Parameter(description = "a json array used to replace strings within the application. Example: ```json [   {     \"name\": \"coins\",     \"valueString\": \"Gems\"   },   {     \"name\": \"lives\",     \"valueString\": \"lives\"   } ] ``` ") @Valid @RequestParam(value = "stringReplacerJson", required = false) stringReplacerJson: kotlin.String?,
        @Parameter(description = "a json object used by the scene atlas to position sprites. Example: ```json {   \"pShootingOffset\": [     {       \"name\": \"x\",       \"valueString\": \"2.2\"     },     {       \"name\": \"y\",       \"valueString\": \"-0.3\"     }   ],   \"e1ShootingOffset\": [     {       \"name\": \"x\",       \"valueString\": \"0.25\"     },     {       \"name\": \"y\",       \"valueString\": \"0.5\"     }   ] } ``` ") @Valid @RequestParam(value = "customJsonObjects", required = false) customJsonObjects: kotlin.String?,
        @Parameter(description = "a MultipartFile containing the image used as the theme icon") @Valid @RequestParam(value = "iconImage", required = false) iconImage: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "a MultipartFile containing the scene atlas") @Valid @RequestParam(value = "sceneAtlasImage", required = false) sceneAtlasImage: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "a MultipartFile containing the background image") @Valid @RequestParam(value = "bgImage", required = false) bgImage: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "a MultipartFile containing the background sound file (preferably in MP3 format)") @Valid @RequestParam(value = "bgSound", required = false) bgSound: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "used to select a default sound file that already exists in the application") @Valid @RequestParam(value = "musicSelection", required = false) musicSelection: kotlin.String?,
        @Parameter(description = "the description of the user's current location") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ThemeDescriptorResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Add Connection Groups",
        operationId = "addSubGroups",
        description = """Add sub groups to a group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConnectionGroupResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/group/addSubGroup"
        value = [PATH_ADD_SUB_GROUPS],
        produces = ["*/*"]
    )
    fun addSubGroups(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the parent group id", required = true) @Valid @RequestParam(value = "groupId", required = true) groupId: kotlin.Long,
        @NotNull @Parameter(description = "comma separated list of group IDs to add to the parent group", required = true) @Valid @RequestParam(value = "subGroupIds", required = true) subGroupIds: kotlin.String,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ConnectionGroupResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Add User",
        operationId = "addUsersToPermissionable",
        description = """Adds a user to a permissionable object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/permissions/add"
        value = [PATH_ADD_USERS_TO_PERMISSIONABLE],
        produces = ["*/*"]
    )
    fun addUsersToPermissionable(
        @NotNull @Parameter(description = "the permissionable type of the object", required = true, schema = Schema(allowableValues = ["ACCOUNT", "GAMELEVEL", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "SCHEDULED_NOTIFICATION", "TASK", "TRIGGER"])) @Valid @RequestParam(value = "permissionableType", required = true) permissionableType: kotlin.String,
        @NotNull @Parameter(description = "the id of the permissionable object", required = true) @Valid @RequestParam(value = "permissionableId", required = true) permissionableId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the read permission of the users/groups", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "read", required = false, defaultValue = "true") read: kotlin.Boolean,
        @Parameter(description = "the write permission of the users/groups", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "write", required = false, defaultValue = "false") write: kotlin.Boolean,
        @Parameter(description = "the delete permission of the users/groups", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "delete", required = false, defaultValue = "false") delete: kotlin.Boolean,
        @Parameter(description = "the add permission of the users/groups", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "add", required = false, defaultValue = "false") add: kotlin.Boolean,
        @Parameter(description = "a comma separated list of connection ids (NOT the account ids)") @Valid @RequestParam(value = "connectionIds", required = false) connectionIds: kotlin.String?,
        @Parameter(description = "a comma separated list of account ids") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "a comma separated list of connection group ids (these are groups made by the user)") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pending", required = false, defaultValue = "false") pending: kotlin.Boolean,
        @Parameter(description = "sets whether the added users will become admins or not") @Valid @RequestParam(value = "admin", required = false) admin: kotlin.Boolean?,
        @Parameter(description = "flag to determine whether to include the built-in \"friends\" group", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeFriendGroup", required = false, defaultValue = "false") includeFriendGroup: kotlin.Boolean,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "comma separated list of audience ids. This is a feature only available to the permissionable's application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Approve Contest",
        operationId = "approveAlbumContest",
        description = """Sets the approval status of a contest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/album/contest/approve"
        value = [PATH_APPROVE_ALBUM_CONTEST],
        produces = ["*/*"]
    )
    fun approveAlbumContest(
        @NotNull @Parameter(description = "The ID of the album contest", required = true) @Valid @RequestParam(value = "albumContestId", required = true) albumContestId: kotlin.Long,
        @NotNull @Parameter(description = "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}", required = true, schema = Schema(allowableValues = ["PENDING", "REJECTED", "APPROVED", "FEATURED"])) @Valid @RequestParam(value = "approvalStatus", required = true) approvalStatus: kotlin.String,
        @Parameter(description = "A unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create or Update Connection",
        operationId = "createOrUpdateConnection",
        description = """Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConnectionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/add"
        value = [PATH_CREATE_OR_UPDATE_CONNECTION],
        produces = ["*/*"]
    )
    fun createOrUpdateConnection(
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the connection id for editing") @Valid @RequestParam(value = "connectionId", required = false) connectionId: kotlin.Long?,
        @Parameter(description = "the connection account id (i.e. the account id of another user)") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "the pending id (usually for people who do not have a Sirqul account but are already friends via other third party apps)") @Valid @RequestParam(value = "pendingId", required = false) pendingId: kotlin.Long?,
        @Parameter(description = "optional group id if the user wants to add this person into a group") @Valid @RequestParam(value = "groupId", required = false) groupId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "determines whether the user is trusting this account") @Valid @RequestParam(value = "isTrusted", required = false) isTrusted: kotlin.Boolean?,
        @Parameter(description = "determines whether the user has set to ignore the user's friend request") @Valid @RequestParam(value = "ignoreFriendRequest", required = false) ignoreFriendRequest: kotlin.Boolean?,
        @Parameter(description = "determines whether the user is a contact of this account") @Valid @RequestParam(value = "isContact", required = false) isContact: kotlin.Boolean?,
        @Parameter(description = "determines whether the user is blocking this account") @Valid @RequestParam(value = "isBlocked", required = false) isBlocked: kotlin.Boolean?,
        @Parameter(description = "determines whether the user is following this account") @Valid @RequestParam(value = "isFollowing", required = false) isFollowing: kotlin.Boolean?,
        @Parameter(description = "whether to return the connection response or not") @Valid @RequestParam(value = "connectionResponse", required = false) connectionResponse: kotlin.Boolean?
    ): ResponseEntity<ConnectionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create or Update Connection Group",
        operationId = "createOrUpdateGroup",
        description = """Creates a new private group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/group"
        value = [PATH_CREATE_OR_UPDATE_GROUP],
        produces = ["*/*"]
    )
    fun createOrUpdateGroup(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the name of the group") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "the group id to update a group (don't pass anything in if you want to create a new group)") @Valid @RequestParam(value = "groupId", required = false) groupId: kotlin.Long?,
        @Parameter(description = "the asset to attach to the group") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "comma separated list of connection IDs") @Valid @RequestParam(value = "connections", required = false) connections: kotlin.String?,
        @Parameter(description = "the description of the group") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "determines whether the connections in the group can see the user's profile info") @Valid @RequestParam(value = "canViewProfileInfo", required = false) canViewProfileInfo: kotlin.Boolean?,
        @Parameter(description = "determines whether the connections in the group can see the user's game info") @Valid @RequestParam(value = "canViewGameInfo", required = false) canViewGameInfo: kotlin.Boolean?,
        @Parameter(description = "determines whether the connections in the group can see the user's friends/connections") @Valid @RequestParam(value = "canViewFriendInfo", required = false) canViewFriendInfo: kotlin.Boolean?,
        @Parameter(description = "Sets whether the connection group is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "the latitude of the group") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the group") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Contest",
        operationId = "deleteContest",
        description = """Deletes a contest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/album/contest/remove"
        value = [PATH_DELETE_CONTEST],
        produces = ["*/*"]
    )
    fun deleteContest(
        @NotNull @Parameter(description = "the album contest ID", required = true) @Valid @RequestParam(value = "albumContestId", required = true) albumContestId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Accept Follow Request",
        operationId = "followAccept",
        description = """Accept someone's follow request.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/follow/accept"
        value = [PATH_FOLLOW_ACCEPT],
        produces = ["*/*"]
    )
    fun followAccept(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the account ID of the user who initiated the follow", required = true) @Valid @RequestParam(value = "connectionAccountId", required = true) connectionAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key for sending notifications", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Reject Follow Request",
        operationId = "followReject",
        description = """Reject someone's follow request or remove them as a follower.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/follow/reject"
        value = [PATH_FOLLOW_REJECT],
        produces = ["*/*"]
    )
    fun followReject(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the account ID of the user who initiated the follow", required = true) @Valid @RequestParam(value = "connectionAccountId", required = true) connectionAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key for sending notifications", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove Follower / Unfollow",
        operationId = "followRemove",
        description = """Unfollow someone you are following or remove them as a follower.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/follow/remove"
        value = [PATH_FOLLOW_REMOVE],
        produces = ["*/*"]
    )
    fun followRemove(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the account ID of the user who you want to unfollow", required = true) @Valid @RequestParam(value = "connectionAccountId", required = true) connectionAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key for sending notifications", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send Follow Request",
        operationId = "followRequest",
        description = """Send a request to follow someone.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/follow/request"
        value = [PATH_FOLLOW_REQUEST],
        produces = ["*/*"]
    )
    fun followRequest(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the account ID of the user who you want to follow", required = true) @Valid @RequestParam(value = "connectionAccountId", required = true) connectionAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key for sending notifications", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "determines if the other user needs to confirm the follow request", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "approvalNeeded", required = false, defaultValue = "true") approvalNeeded: kotlin.Boolean
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Accept Friend",
        operationId = "friendAccept",
        description = """Accept a friend request and optionally sends a notification.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/friend/accept"
        value = [PATH_FRIEND_ACCEPT],
        produces = ["*/*"]
    )
    fun friendAccept(
        @NotNull @Parameter(description = "the friend's account id", required = true) @Valid @RequestParam(value = "friendAccountId", required = true) friendAccountId: kotlin.Long,
        @NotNull @Parameter(description = "determines whether to send a notification to the afflicting party", required = true) @Valid @RequestParam(value = "notifyFriend", required = true) notifyFriend: kotlin.Boolean,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "optional message to send in a notification") @Valid @RequestParam(value = "notificationMessage", required = false) notificationMessage: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Decline Friend",
        operationId = "friendReject",
        description = """Request a friend request and optionally sends a notification.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/friend/reject"
        value = [PATH_FRIEND_REJECT],
        produces = ["*/*"]
    )
    fun friendReject(
        @NotNull @Parameter(description = "the friend's account id", required = true) @Valid @RequestParam(value = "friendAccountId", required = true) friendAccountId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "determines whether to send a notification to the afflicting party") @Valid @RequestParam(value = "notifyFriend", required = false) notifyFriend: kotlin.Boolean?,
        @Parameter(description = "optional message to send in a notification") @Valid @RequestParam(value = "notificationMessage", required = false) notificationMessage: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Friend",
        operationId = "friendRemove",
        description = """Removes a friend from the user's friends list.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/friend/remove"
        value = [PATH_FRIEND_REMOVE],
        produces = ["*/*"]
    )
    fun friendRemove(
        @NotNull @Parameter(description = "the account ID of the friend to remove", required = true) @Valid @RequestParam(value = "friendAccountId", required = true) friendAccountId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "optionally notifies the connection that they have been removed as a friend") @Valid @RequestParam(value = "notifyFriend", required = false) notifyFriend: kotlin.Boolean?,
        @Parameter(description = "optionally removes the connection from the user's groups") @Valid @RequestParam(value = "removeFromGroups", required = false) removeFromGroups: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Request Friend",
        operationId = "friendRequest",
        description = """Sends a friend request notification to another user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/friend/request"
        value = [PATH_FRIEND_REQUEST],
        produces = ["*/*"]
    )
    fun friendRequest(
        @NotNull @Parameter(description = "the friend's account id", required = true) @Valid @RequestParam(value = "friendAccountId", required = true) friendAccountId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "optional message to send in a notification") @Valid @RequestParam(value = "notificationMessage", required = false) notificationMessage: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Contest",
        operationId = "getAlbumContest",
        description = """Gets the contest object including the likes and notes""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AlbumContestResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/album/contest/get"
        value = [PATH_GET_ALBUM_CONTEST],
        produces = ["*/*"]
    )
    fun getAlbumContest(
        @NotNull @Parameter(description = "the album contest ID", required = true) @Valid @RequestParam(value = "albumContestId", required = true) albumContestId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<AlbumContestResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Contests",
        operationId = "getAlbumContests",
        description = """Searches on contests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AlbumContestListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/album/contest/search"
        value = [PATH_GET_ALBUM_CONTESTS],
        produces = ["*/*"]
    )
    fun getAlbumContests(
        @NotNull @Parameter(description = "a comma separated list of Ownership", required = true) @Valid @RequestParam(value = "filter", required = true) filter: kotlin.String,
        @NotNull @Parameter(description = "the field to sort by. See AlbumContestApiMap", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "the start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit for pagination (there is a hard limit of 30)", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the application type") @Valid @RequestParam(value = "appType", required = false) appType: kotlin.String?,
        @Parameter(description = "filter contests with this contest type") @Valid @RequestParam(value = "contestType", required = false) contestType: kotlin.String?,
        @Parameter(description = "search on contests that have been created by this account (that the user has permissions to)") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "keyword search string") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "filter on items that have been created before this date") @Valid @RequestParam(value = "dateCreated", required = false) dateCreated: kotlin.Long?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<AlbumContestListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Sent Friend Requests",
        operationId = "getConnectionSentFriendRequests",
        description = """Gets the connection sent friend requests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConnectionListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/connection/getRequested"
        value = [PATH_GET_CONNECTION_SENT_FRIEND_REQUESTS],
        produces = ["*/*"]
    )
    fun getConnectionSentFriendRequests(
        @Parameter(description = "the ID of the device") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the account") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<ConnectionListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Connections",
        operationId = "getConnections",
        description = """Gets the connections.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConnectionListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/connection/get"
        value = [PATH_GET_CONNECTIONS],
        produces = ["*/*"]
    )
    fun getConnections(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "a comma separated list of ConnectionApiMap. (NOTE on FOLLOWER vs FOLLOWING: FOLLOWER will get me a list of followers, FOLLOWING will get me a list of people I am following)", required = true) @Valid @RequestParam(value = "filter", required = true) filter: kotlin.String,
        @NotNull @Parameter(description = "sorts the response list by ConnectionApiMap", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "sorts the response list by descending order if true", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "start index of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "optional parameter to search on other account's connections") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "an optional keyword to search on, this parameter is ignored if empty") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ConnectionListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Connection Group",
        operationId = "getGroupDetails",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConnectionGroupResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/connection/group/details/get"
        value = [PATH_GET_GROUP_DETAILS],
        produces = ["*/*"]
    )
    fun getGroupDetails(
        @NotNull @Parameter(description = "whether to combine connections or not", required = true) @Valid @RequestParam(value = "combineConnections", required = true) combineConnections: kotlin.Boolean,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the group id") @Valid @RequestParam(value = "groupId", required = false) groupId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ConnectionGroupResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Theme",
        operationId = "getThemeDescriptor",
        description = """Gets a theme.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PurchaseItemListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/theme/get"
        value = [PATH_GET_THEME_DESCRIPTOR],
        produces = ["*/*"]
    )
    fun getThemeDescriptor(
        @NotNull @Parameter(description = "the theme id", required = true) @Valid @RequestParam(value = "themeDescriptorId", required = true) themeDescriptorId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<PurchaseItemListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Themes",
        operationId = "getThemeDescriptors",
        description = """Searches for themes.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PurchaseItemListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/consumer/theme/search"
        value = [PATH_GET_THEME_DESCRIPTORS],
        produces = ["*/*"]
    )
    fun getThemeDescriptors(
        @NotNull @Parameter(description = "a comma separated list of Ownership", required = true) @Valid @RequestParam(value = "filter", required = true) filter: kotlin.String,
        @NotNull @Parameter(description = "the field to sort by. See ThemeDescriptorApiMap", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "the start parameter for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit parameter for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the unique title of an application given from the admin tool") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "contest type") @Valid @RequestParam(value = "contestType", required = false) contestType: kotlin.String?,
        @Parameter(description = "search on contests that an account has access to") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "a keyword to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "filter on items that have been created before this date") @Valid @RequestParam(value = "dateCreated", required = false) dateCreated: kotlin.Long?,
        @Parameter(description = "application version of the theme to filter by") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<PurchaseItemListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Leave",
        operationId = "leaveFromPermissionable",
        description = """Used when the user wants to leave from someone else's permissionable object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/permissions/leave"
        value = [PATH_LEAVE_FROM_PERMISSIONABLE],
        produces = ["*/*"]
    )
    fun leaveFromPermissionable(
        @NotNull @Parameter(description = "the permissionable type PermissionableType", required = true) @Valid @RequestParam(value = "permissionableType", required = true) permissionableType: kotlin.String,
        @NotNull @Parameter(description = "the id of the permissionable object", required = true) @Valid @RequestParam(value = "permissionableId", required = true) permissionableId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Connection",
        operationId = "removeConnectionFromGroup",
        description = """Removes the connection from group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/group/removeConnection"
        value = [PATH_REMOVE_CONNECTION_FROM_GROUP],
        produces = ["*/*"]
    )
    fun removeConnectionFromGroup(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the group id", required = true) @Valid @RequestParam(value = "groupId", required = true) groupId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the connection id") @Valid @RequestParam(value = "connectionId", required = false) connectionId: kotlin.Long?,
        @Parameter(description = "the connection account id") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "the pending id") @Valid @RequestParam(value = "pendingId", required = false) pendingId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Connection Group",
        operationId = "removeGroup",
        description = """Remove a user's group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/group/remove"
        value = [PATH_REMOVE_GROUP],
        produces = ["*/*"]
    )
    fun removeGroup(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the group id", required = true) @Valid @RequestParam(value = "groupId", required = true) groupId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove Connection Groups",
        operationId = "removeSubGroups",
        description = """Remove sub groups from a group""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/connection/group/removeSubGroup"
        value = [PATH_REMOVE_SUB_GROUPS],
        produces = ["*/*"]
    )
    fun removeSubGroups(
        @NotNull @Parameter(description = "whether to return nulls or not", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the parent group id", required = true) @Valid @RequestParam(value = "groupId", required = true) groupId: kotlin.Long,
        @NotNull @Parameter(description = "comma separated list of group IDs to remove from the parent group", required = true) @Valid @RequestParam(value = "subGroupIds", required = true) subGroupIds: kotlin.String,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Theme",
        operationId = "removeThemeDescriptor",
        description = """Removes a theme.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/theme/remove"
        value = [PATH_REMOVE_THEME_DESCRIPTOR],
        produces = ["*/*"]
    )
    fun removeThemeDescriptor(
        @NotNull @Parameter(description = "the theme id to remove", required = true) @Valid @RequestParam(value = "themeDescriptorId", required = true) themeDescriptorId: kotlin.Long,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the unique title of an application given from the admin tool") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove User",
        operationId = "removeUsersFromPermissionable",
        description = """Used to remove someone (assuming they have permission) from a permissionable object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/permissions/remove"
        value = [PATH_REMOVE_USERS_FROM_PERMISSIONABLE],
        produces = ["*/*"]
    )
    fun removeUsersFromPermissionable(
        @NotNull @Parameter(description = "the permissionable type of the object", required = true, schema = Schema(allowableValues = ["ACCOUNT", "GAMELEVEL", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "SCHEDULED_NOTIFICATION", "TASK", "TRIGGER"])) @Valid @RequestParam(value = "permissionableType", required = true) permissionableType: kotlin.String,
        @NotNull @Parameter(description = "the id of the permissionable object", required = true) @Valid @RequestParam(value = "permissionableId", required = true) permissionableId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "a comma separated list of connection ids (NOT the account ids)") @Valid @RequestParam(value = "connectionIds", required = false) connectionIds: kotlin.String?,
        @Parameter(description = "a comma separated list of account ids") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "a comma separated list of connection group ids (these are groups made by the user)") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "flag to determine whether to remove the built-in \"friends\" group", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "removeFriendGroup", required = false, defaultValue = "false") removeFriendGroup: kotlin.Boolean,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Save Match Token",
        operationId = "setMatchToken",
        description = """Save user's match token to be used for profile match making""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/profile/matchToken"
        value = [PATH_SET_MATCH_TOKEN],
        produces = ["*/*"]
    )
    fun setMatchToken(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "A string of numbers") @Valid @RequestParam(value = "matchToken", required = false) matchToken: kotlin.String?,
        @Parameter(description = "Game Type (deprecated)", schema = Schema(defaultValue = "BOOPY")) @Valid @RequestParam(value = "gameType", required = false, defaultValue = "BOOPY") gameType: kotlin.String,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Vote on Contest",
        operationId = "voteOnAlbumContest",
        description = """Vote on a collection in a contest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AlbumContestResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/consumer/album/contest/vote"
        value = [PATH_VOTE_ON_ALBUM_CONTEST],
        produces = ["*/*"]
    )
    fun voteOnAlbumContest(
        @NotNull @Parameter(description = "the album contest ID", required = true) @Valid @RequestParam(value = "albumContestId", required = true) albumContestId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the album to vote on", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "a custom field used for aggregation and searching") @Valid @RequestParam(value = "contestType", required = false) contestType: kotlin.String?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<AlbumContestResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_CONNECTION_TO_GROUP: String = "/consumer/connection/group/addConnection"
        const val PATH_ADD_OR_UPDATE_ALBUM_CONTEST: String = "/consumer/album/contest"
        const val PATH_ADD_OR_UPDATE_THEME_DESCRIPTOR: String = "/consumer/theme"
        const val PATH_ADD_SUB_GROUPS: String = "/consumer/connection/group/addSubGroup"
        const val PATH_ADD_USERS_TO_PERMISSIONABLE: String = "/consumer/permissions/add"
        const val PATH_APPROVE_ALBUM_CONTEST: String = "/consumer/album/contest/approve"
        const val PATH_CREATE_OR_UPDATE_CONNECTION: String = "/consumer/connection/add"
        const val PATH_CREATE_OR_UPDATE_GROUP: String = "/consumer/connection/group"
        const val PATH_DELETE_CONTEST: String = "/consumer/album/contest/remove"
        const val PATH_FOLLOW_ACCEPT: String = "/consumer/follow/accept"
        const val PATH_FOLLOW_REJECT: String = "/consumer/follow/reject"
        const val PATH_FOLLOW_REMOVE: String = "/consumer/follow/remove"
        const val PATH_FOLLOW_REQUEST: String = "/consumer/follow/request"
        const val PATH_FRIEND_ACCEPT: String = "/consumer/friend/accept"
        const val PATH_FRIEND_REJECT: String = "/consumer/friend/reject"
        const val PATH_FRIEND_REMOVE: String = "/consumer/friend/remove"
        const val PATH_FRIEND_REQUEST: String = "/consumer/friend/request"
        const val PATH_GET_ALBUM_CONTEST: String = "/consumer/album/contest/get"
        const val PATH_GET_ALBUM_CONTESTS: String = "/consumer/album/contest/search"
        const val PATH_GET_CONNECTION_SENT_FRIEND_REQUESTS: String = "/consumer/connection/getRequested"
        const val PATH_GET_CONNECTIONS: String = "/consumer/connection/get"
        const val PATH_GET_GROUP_DETAILS: String = "/consumer/connection/group/details/get"
        const val PATH_GET_THEME_DESCRIPTOR: String = "/consumer/theme/get"
        const val PATH_GET_THEME_DESCRIPTORS: String = "/consumer/theme/search"
        const val PATH_LEAVE_FROM_PERMISSIONABLE: String = "/consumer/permissions/leave"
        const val PATH_REMOVE_CONNECTION_FROM_GROUP: String = "/consumer/connection/group/removeConnection"
        const val PATH_REMOVE_GROUP: String = "/consumer/connection/group/remove"
        const val PATH_REMOVE_SUB_GROUPS: String = "/consumer/connection/group/removeSubGroup"
        const val PATH_REMOVE_THEME_DESCRIPTOR: String = "/consumer/theme/remove"
        const val PATH_REMOVE_USERS_FROM_PERMISSIONABLE: String = "/consumer/permissions/remove"
        const val PATH_SET_MATCH_TOKEN: String = "/consumer/profile/matchToken"
        const val PATH_VOTE_ON_ALBUM_CONTEST: String = "/consumer/album/contest/vote"
    }
}
