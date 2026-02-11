package org.openapitools.api

import org.openapitools.model.AccountLoginResponse
import org.openapitools.model.AssetListResponse
import org.openapitools.model.GeoPointResponse
import org.openapitools.model.ProfileInfoResponse
import org.openapitools.model.ProfileResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.UserLocationSearchResponse
import org.openapitools.model.UserSettingsResponse
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
class AccountApiController() {

    @Operation(
        summary = "Search Accounts by Location",
        operationId = "accountLocationSearch",
        description = """Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = UserLocationSearchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/search"
        value = [PATH_ACCOUNT_LOCATION_SEARCH],
        produces = ["*/*"]
    )
    fun accountLocationSearch(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Deprecated - legacy query parameter") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "An optional keyword to search on, will be ignore if empty (NOT implemented yet)") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The postal code to search on, either postalCode or the user's exact location is required") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "The latitude of the user, either postalCode or the user's exact location is required") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The longitude of the user, either postalCode or the user's exact location is required") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The range to search on", schema = Schema(defaultValue = "10.0")) @Valid @RequestParam(value = "range", required = false, defaultValue = "10.0") range: kotlin.Double,
        @Parameter(description = "Searches for user's that has updated their location since this date") @Valid @RequestParam(value = "locationLastUpdated", required = false) locationLastUpdated: kotlin.Long?,
        @Parameter(description = "The preferred gender") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The preferred min age") @Valid @RequestParam(value = "minAge", required = false) minAge: kotlin.Int?,
        @Parameter(description = "The preferred max age") @Valid @RequestParam(value = "maxAge", required = false) maxAge: kotlin.Int?,
        @Parameter(description = "The preferred companionship index") @Valid @RequestParam(value = "companionshipIndex", required = false) companionshipIndex: kotlin.Int?,
        @Parameter(description = "this is the start index of a query") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "Start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "this is the limit index of a query") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "Limit of the pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int,
        @Parameter(description = "Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)") @Valid @RequestParam(value = "searchMode", required = false) searchMode: kotlin.String?,
        @Parameter(description = "Sorting field for results (default: DISTANCE)") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Whether to sort descending (default: false)") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Roles to filter on") @Valid @RequestParam(value = "roles", required = false) roles: kotlin.String?,
        @Parameter(description = "Tags to filter on") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "The experience to filter on") @Valid @RequestParam(value = "experience", required = false) experience: kotlin.String?,
        @Parameter(description = "The category ids to filter on (comma separated)") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The audience ids to filter on (comma separated)") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "Operator used to combine audience filters (default: AND)", schema = Schema(defaultValue = "AND")) @Valid @RequestParam(value = "audienceOperator", required = false, defaultValue = "AND") audienceOperator: kotlin.String,
        @Parameter(description = "Whether to use the given lat & long to update the user's current location", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "updateCurrentLocation", required = false, defaultValue = "false") updateCurrentLocation: kotlin.Boolean,
        @Parameter(description = "Whether to use the given parameters to update the user's preferred settings", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "updatePreferredSettings", required = false, defaultValue = "false") updatePreferredSettings: kotlin.Boolean,
        @Parameter(description = "Determines whether to always display user exact locations", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "showExactLocations", required = false, defaultValue = "true") showExactLocations: kotlin.Boolean,
        @Parameter(description = "Return connection of the accounts in the result to the passed in account if there exists any", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "showConnectionToSearcher", required = false, defaultValue = "false") showConnectionToSearcher: kotlin.Boolean,
        @Parameter(description = "Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)") @Valid @RequestParam(value = "flagCountMinimum", required = false) flagCountMinimum: kotlin.Long?,
        @Parameter(description = "Returns only verified users") @Valid @RequestParam(value = "verifiedUserOnly", required = false) verifiedUserOnly: kotlin.Boolean?,
        @Parameter(description = "Returns only content admin users") @Valid @RequestParam(value = "contentAdminOnly", required = false) contentAdminOnly: kotlin.Boolean?
    ): ResponseEntity<UserLocationSearchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Block Account",
        operationId = "blockAccount",
        description = """Moves or removes an account into the user's blocked group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/block"
        value = [PATH_BLOCK_ACCOUNT],
        produces = ["*/*"]
    )
    fun blockAccount(
        @NotNull @Parameter(description = "The id of the account to be blocked/unblocked", required = true) @Valid @RequestParam(value = "accountIdBeingBlocked", required = true) accountIdBeingBlocked: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Determines whether the account is blocked or unblocked", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "blockFlagValue", required = false, defaultValue = "true") blockFlagValue: kotlin.Boolean,
        @Parameter(description = "Determines whether the account is removed from all other groups if blocked", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "removeFromGroupsIfBlocked", required = false, defaultValue = "false") removeFromGroupsIfBlocked: kotlin.Boolean,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Account",
        operationId = "createAccount",
        description = """Create a new account by role.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AccountLoginResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/create"
        value = [PATH_CREATE_ACCOUNT],
        produces = ["*/*"]
    )
    fun createAccount(
        @NotNull @Parameter(description = "The access token to authenticate with (ex: username)", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "The secret to authenticate with (ex: password)", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @Parameter(description = "The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the prefix of the user's name") @Valid @RequestParam(value = "prefixName", required = false) prefixName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's first name") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's middle name") @Valid @RequestParam(value = "middleName", required = false) middleName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's last name") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the suffix of the user's name") @Valid @RequestParam(value = "suffixName", required = false) suffixName: kotlin.String?,
        @Parameter(description = "This field will be used to set the user's job title") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc") @Valid @RequestParam(value = "deviceIdType", required = false) deviceIdType: kotlin.String?,
        @Parameter(description = "The user's contact email address (NOT the username)") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "The asset id to set the user's profile image") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The street address of the user's contact location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "The zipcode of the user's contact location") @Valid @RequestParam(value = "zipcode", required = false) zipcode: kotlin.String?,
        @Parameter(description = "The gender of the user (AudienceGender)") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The birthday date of the user in UTC milliseconds") @Valid @RequestParam(value = "birthday", required = false) birthday: kotlin.Long?,
        @Parameter(description = "The home phone number") @Valid @RequestParam(value = "homePhone", required = false) homePhone: kotlin.String?,
        @Parameter(description = "The cellular phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "The cellular service provider") @Valid @RequestParam(value = "cellPhoneCarrier", required = false) cellPhoneCarrier: kotlin.String?,
        @Parameter(description = "The business phone number") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The account role (default: MEMBER)") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "Comma separated list of development platforms") @Valid @RequestParam(value = "platforms", required = false) platforms: kotlin.String?,
        @Parameter(description = "Search tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "About us information") @Valid @RequestParam(value = "aboutUs", required = false) aboutUs: kotlin.String?,
        @Parameter(description = "Game experience of the user") @Valid @RequestParam(value = "gameExperience", required = false) gameExperience: kotlin.String?,
        @Parameter(description = "A list of category ids that represent interests and associations") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The user's hometown") @Valid @RequestParam(value = "hometown", required = false) hometown: kotlin.String?,
        @Parameter(description = "The user's height") @Valid @RequestParam(value = "height", required = false) height: kotlin.String?,
        @Parameter(description = "The user's height in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "heightIndex", required = false) heightIndex: kotlin.Int?,
        @Parameter(description = "The user's ethnicity") @Valid @RequestParam(value = "ethnicity", required = false) ethnicity: kotlin.String?,
        @Parameter(description = "The user's body type") @Valid @RequestParam(value = "bodyType", required = false) bodyType: kotlin.String?,
        @Parameter(description = "The user's marital status") @Valid @RequestParam(value = "maritalStatus", required = false) maritalStatus: kotlin.String?,
        @Parameter(description = "The user's children status") @Valid @RequestParam(value = "children", required = false) children: kotlin.String?,
        @Parameter(description = "The user's religion") @Valid @RequestParam(value = "religion", required = false) religion: kotlin.String?,
        @Parameter(description = "The user's education") @Valid @RequestParam(value = "education", required = false) education: kotlin.String?,
        @Parameter(description = "The user's education in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "educationIndex", required = false) educationIndex: kotlin.Int?,
        @Parameter(description = "The user's smoke status") @Valid @RequestParam(value = "smoke", required = false) smoke: kotlin.String?,
        @Parameter(description = "The user's drink status") @Valid @RequestParam(value = "drink", required = false) drink: kotlin.String?,
        @Parameter(description = "The user's companionship status") @Valid @RequestParam(value = "companionship", required = false) companionship: kotlin.String?,
        @Parameter(description = "The user's companionship index") @Valid @RequestParam(value = "companionshipIndex", required = false) companionshipIndex: kotlin.Int?,
        @Parameter(description = "The preferred minimum age in the account location search") @Valid @RequestParam(value = "preferredMinAge", required = false) preferredMinAge: kotlin.Int?,
        @Parameter(description = "The preferred maximum age in the account location search") @Valid @RequestParam(value = "preferredMaxAge", required = false) preferredMaxAge: kotlin.Int?,
        @Parameter(description = "The preferred minimum height in the account location search") @Valid @RequestParam(value = "preferredMinHeight", required = false) preferredMinHeight: kotlin.Int?,
        @Parameter(description = "The preferred maximum height in the account location search") @Valid @RequestParam(value = "preferredMaxHeight", required = false) preferredMaxHeight: kotlin.Int?,
        @Parameter(description = "The preferred gender in the account location search") @Valid @RequestParam(value = "preferredGender", required = false) preferredGender: kotlin.String?,
        @Parameter(description = "The preferred education in the account location search") @Valid @RequestParam(value = "preferredEducation", required = false) preferredEducation: kotlin.String?,
        @Parameter(description = "The preferred education in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "preferredEducationIndex", required = false) preferredEducationIndex: kotlin.Int?,
        @Parameter(description = "The preferred body type in the account location search") @Valid @RequestParam(value = "preferredBodyType", required = false) preferredBodyType: kotlin.String?,
        @Parameter(description = "The preferred ethnicity in the account location search") @Valid @RequestParam(value = "preferredEthnicity", required = false) preferredEthnicity: kotlin.String?,
        @Parameter(description = "The preferred location in the account location search") @Valid @RequestParam(value = "preferredLocation", required = false) preferredLocation: kotlin.String?,
        @Parameter(description = "The preferred location range in the account location search") @Valid @RequestParam(value = "preferredLocationRange", required = false) preferredLocationRange: kotlin.Double?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Accepted Terms") @Valid @RequestParam(value = "acceptedTerms", required = false) acceptedTerms: kotlin.Boolean?,
        @Parameter(description = "The inviteToken that the referrer used for this account to sign up") @Valid @RequestParam(value = "inviteToken", required = false) inviteToken: kotlin.String?,
        @Parameter(description = "The accountId of the referrer (used if there is no inviteToken)") @Valid @RequestParam(value = "referralAccountId", required = false) referralAccountId: kotlin.Long?,
        @Parameter(description = "Whether to send validation email") @Valid @RequestParam(value = "sendValidation", required = false) sendValidation: kotlin.Boolean?,
        @Parameter(description = "Deprecated: use appKey") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The application version") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "Returns an AccountLoginResponse if \"AccountLoginResponse\" is passed in") @Valid @RequestParam(value = "responseType", required = false) responseType: kotlin.String?,
        @Parameter(description = "Comma separated list of audience ids to assign to the user") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "Application blob data") @Valid @RequestParam(value = "appBlob", required = false) appBlob: kotlin.String?,
        @Parameter(description = "Enable push for the app") @Valid @RequestParam(value = "appEnablePush", required = false) appEnablePush: kotlin.Boolean?,
        @Parameter(description = "Enable SMS for the app") @Valid @RequestParam(value = "appEnableSMS", required = false) appEnableSMS: kotlin.Boolean?,
        @Parameter(description = "Enable email for the app") @Valid @RequestParam(value = "appEnableEmail", required = false) appEnableEmail: kotlin.Boolean?,
        @Parameter(description = "Location visibility setting") @Valid @RequestParam(value = "locationVisibility", required = false) locationVisibility: kotlin.String?,
        @Parameter(description = "Home latitude") @Valid @RequestParam(value = "homeLatitude", required = false) homeLatitude: kotlin.Double?,
        @Parameter(description = "Home longitude") @Valid @RequestParam(value = "homeLongitude", required = false) homeLongitude: kotlin.Double?,
        @Parameter(description = "The nickname used in the application for this account") @Valid @RequestParam(value = "appNickname", required = false) appNickname: kotlin.String?,
        @Parameter(description = "Personal audience id to associate with this account") @Valid @RequestParam(value = "personalAudienceId", required = false) personalAudienceId: kotlin.Long?
    ): ResponseEntity<AccountLoginResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Account",
        operationId = "editAccount",
        description = """Edit the user's profile information""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileInfoResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/profile/update"
        value = [PATH_EDIT_ACCOUNT],
        produces = ["*/*"]
    )
    fun editAccount(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The account id used to edit another person's account") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "The account role to change to") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "The asset id to set the user's profile image") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the prefix of the user's name") @Valid @RequestParam(value = "prefixName", required = false) prefixName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's first name") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's middle name") @Valid @RequestParam(value = "middleName", required = false) middleName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's last name") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the suffix of the user's name") @Valid @RequestParam(value = "suffixName", required = false) suffixName: kotlin.String?,
        @Parameter(description = "This field will be used to set the user's job title") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The gender of the user AudienceGender") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "This is deperecated, use the birthday parameter") @Valid @RequestParam(value = "age", required = false) age: kotlin.Int?,
        @Parameter(description = "The birthday date of the user in UTC milliseconds") @Valid @RequestParam(value = "birthday", required = false) birthday: kotlin.Long?,
        @Parameter(description = "The home phone number") @Valid @RequestParam(value = "homePhone", required = false) homePhone: kotlin.String?,
        @Parameter(description = "The cellular phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "The cellular service provider") @Valid @RequestParam(value = "cellPhoneCarrier", required = false) cellPhoneCarrier: kotlin.String?,
        @Parameter(description = "The business phone number") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The user's contact email address (NOT the username)") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "The street address of the user's contact location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the user's contact location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the user's contact location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The zipcode of the user's contact location") @Valid @RequestParam(value = "zipcode", required = false) zipcode: kotlin.String?,
        @Parameter(description = "The country of the user's contact location") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "Allow anyone to view the user's personal profile") @Valid @RequestParam(value = "makeProfileInfoPublic", required = false) makeProfileInfoPublic: kotlin.Boolean?,
        @Parameter(description = "Allow anyone to view the user's game/app info") @Valid @RequestParam(value = "makeGameInfoPublic", required = false) makeGameInfoPublic: kotlin.Boolean?,
        @Parameter(description = "Allow anyone to view the user's friends list") @Valid @RequestParam(value = "makeFriendsInfoPublic", required = false) makeFriendsInfoPublic: kotlin.Boolean?,
        @Parameter(description = "The user's hometown") @Valid @RequestParam(value = "hometown", required = false) hometown: kotlin.String?,
        @Parameter(description = "The user's height") @Valid @RequestParam(value = "height", required = false) height: kotlin.String?,
        @Parameter(description = "The user's height in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "heightIndex", required = false) heightIndex: kotlin.Int?,
        @Parameter(description = "The user's ethnicity") @Valid @RequestParam(value = "ethnicity", required = false) ethnicity: kotlin.String?,
        @Parameter(description = "The user's body type") @Valid @RequestParam(value = "bodyType", required = false) bodyType: kotlin.String?,
        @Parameter(description = "The user's marital status") @Valid @RequestParam(value = "maritalStatus", required = false) maritalStatus: kotlin.String?,
        @Parameter(description = "The user's children status") @Valid @RequestParam(value = "children", required = false) children: kotlin.String?,
        @Parameter(description = "The user's religion") @Valid @RequestParam(value = "religion", required = false) religion: kotlin.String?,
        @Parameter(description = "The user's education") @Valid @RequestParam(value = "education", required = false) education: kotlin.String?,
        @Parameter(description = "The user's education in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "educationIndex", required = false) educationIndex: kotlin.Int?,
        @Parameter(description = "The user's smoke status") @Valid @RequestParam(value = "smoke", required = false) smoke: kotlin.String?,
        @Parameter(description = "The user's drink status") @Valid @RequestParam(value = "drink", required = false) drink: kotlin.String?,
        @Parameter(description = "The user's companionship status") @Valid @RequestParam(value = "companionship", required = false) companionship: kotlin.String?,
        @Parameter(description = "The user's companionship index") @Valid @RequestParam(value = "companionshipIndex", required = false) companionshipIndex: kotlin.Int?,
        @Parameter(description = "The preferred minimum age in the account location search") @Valid @RequestParam(value = "preferredMinAge", required = false) preferredMinAge: kotlin.Int?,
        @Parameter(description = "The preferred maximum age in the account location search") @Valid @RequestParam(value = "preferredMaxAge", required = false) preferredMaxAge: kotlin.Int?,
        @Parameter(description = "The preferred minimum height in the account location search") @Valid @RequestParam(value = "preferredMinHeight", required = false) preferredMinHeight: kotlin.Int?,
        @Parameter(description = "The preferred maximum height in the account location search") @Valid @RequestParam(value = "preferredMaxHeight", required = false) preferredMaxHeight: kotlin.Int?,
        @Parameter(description = "The preferred gender in the account location search") @Valid @RequestParam(value = "preferredGender", required = false) preferredGender: kotlin.String?,
        @Parameter(description = "The preferred education in the account location search") @Valid @RequestParam(value = "preferredEducation", required = false) preferredEducation: kotlin.String?,
        @Parameter(description = "The preferred education in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "preferredEducationIndex", required = false) preferredEducationIndex: kotlin.Int?,
        @Parameter(description = "The preferred body type in the account location search") @Valid @RequestParam(value = "preferredBodyType", required = false) preferredBodyType: kotlin.String?,
        @Parameter(description = "The preferred ethnicity in the account location search") @Valid @RequestParam(value = "preferredEthnicity", required = false) preferredEthnicity: kotlin.String?,
        @Parameter(description = "The preferred education in the account location search") @Valid @RequestParam(value = "preferredLocation", required = false) preferredLocation: kotlin.String?,
        @Parameter(description = "The preferred location range in the account location search") @Valid @RequestParam(value = "preferredLocationRange", required = false) preferredLocationRange: kotlin.Double?,
        @Parameter(description = "Platforms") @Valid @RequestParam(value = "platforms", required = false) platforms: kotlin.String?,
        @Parameter(description = "Tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "About Us") @Valid @RequestParam(value = "aboutUs", required = false) aboutUs: kotlin.String?,
        @Parameter(description = "Match Token") @Valid @RequestParam(value = "matchToken", required = false) matchToken: kotlin.String?,
        @Parameter(description = "Game Experience") @Valid @RequestParam(value = "gameExperience", required = false) gameExperience: kotlin.String?,
        @Parameter(description = "Deprecated use categoryIds") @Valid @RequestParam(value = "categories", required = false) categories: kotlin.String?,
        @Parameter(description = "A list of category ids that represent interests and associations") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "A comma separated list of ProfileFilters for filtering the returned response data", schema = Schema(defaultValue = "PROFILE,PROFILE_CONTACT")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE,PROFILE_CONTACT") responseFilters: kotlin.String,
        @Parameter(description = "The user's preference if they want to be shown by zipcode on a map") @Valid @RequestParam(value = "showAsZipcode", required = false) showAsZipcode: kotlin.Boolean?,
        @Parameter(description = "The user's preference if they want to be shown by their exact location on a map") @Valid @RequestParam(value = "showExactLocation", required = false) showExactLocation: kotlin.Boolean?,
        @Parameter(description = "The user's preference if they want to see others exact location on a map") @Valid @RequestParam(value = "showOthersExactLocation", required = false) showOthersExactLocation: kotlin.Boolean?,
        @Parameter(description = "Accepted Terms") @Valid @RequestParam(value = "acceptedTerms", required = false) acceptedTerms: kotlin.Boolean?,
        @Parameter(description = "Location Visibility") @Valid @RequestParam(value = "locationVisibility", required = false) locationVisibility: kotlin.String?,
        @Parameter(description = "App Blob") @Valid @RequestParam(value = "appBlob", required = false) appBlob: kotlin.String?,
        @Parameter(description = "App Enable Push") @Valid @RequestParam(value = "appEnablePush", required = false) appEnablePush: kotlin.Boolean?,
        @Parameter(description = "App Enable SMS") @Valid @RequestParam(value = "appEnableSMS", required = false) appEnableSMS: kotlin.Boolean?,
        @Parameter(description = "App Enable Email") @Valid @RequestParam(value = "appEnableEmail", required = false) appEnableEmail: kotlin.Boolean?,
        @Parameter(description = "Game Type") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Return Profile") @Valid @RequestParam(value = "returnProfile", required = false) returnProfile: kotlin.Boolean?,
        @Parameter(description = "Audience Ids to add") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "Audience Ids to remove") @Valid @RequestParam(value = "audienceIdsToRemove", required = false) audienceIdsToRemove: kotlin.String?,
        @Parameter(description = "The account id of the referrer") @Valid @RequestParam(value = "referralAccountId", required = false) referralAccountId: kotlin.Long?,
        @Parameter(description = "App nickname") @Valid @RequestParam(value = "appNickname", required = false) appNickname: kotlin.String?,
        @Parameter(description = "Personal Audience") @Valid @RequestParam(value = "personalAudienceId", required = false) personalAudienceId: kotlin.Long?,
        @Parameter(description = "The user's username to update with if they currently have a guest username") @Valid @RequestParam(value = "nonGuestUsername", required = false) nonGuestUsername: kotlin.String?
    ): ResponseEntity<ProfileInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Username and Email",
        operationId = "editUsername",
        description = """Update account's own username and/or emailAddress""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/username/update"
        value = [PATH_EDIT_USERNAME],
        produces = ["*/*"]
    )
    fun editUsername(
        @Parameter(description = "The device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the user's contact email address (NOT the username) which is also used for email validation") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "the user's username to update with if they currently have a guest username") @Valid @RequestParam(value = "username", required = false) username: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Account",
        operationId = "getAccount",
        description = """Gets a user's account profile. Application settings and account settings will also be returned for the owner of the account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/profile/get"
        value = [PATH_GET_ACCOUNT],
        produces = ["*/*"]
    )
    fun getAccount(
        @Parameter(description = "Return Nulls", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnNulls", required = false, defaultValue = "false") returnNulls: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Connection Account Email") @Valid @RequestParam(value = "connectionAccountEmail", required = false) connectionAccountEmail: kotlin.String?,
        @Parameter(description = "The account id used to view another person's account", schema = Schema(defaultValue = "0L")) @Valid @RequestParam(value = "connectionAccountId", required = false, defaultValue = "0L") connectionAccountId: kotlin.Long,
        @Parameter(description = "A comma separated list of ProfileFilters for filtering the returned response data", schema = Schema(defaultValue = "PROFILE")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE") responseFilters: kotlin.String,
        @Parameter(description = "Game Type") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Purchase Type", schema = Schema(defaultValue = "SIRQUL")) @Valid @RequestParam(value = "purchaseType", required = false, defaultValue = "SIRQUL") purchaseType: kotlin.String,
        @Parameter(description = "Determines whether to track if a person has viewed someone's profile", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "updateViewedDate", required = false, defaultValue = "false") updateViewedDate: kotlin.Boolean,
        @Parameter(description = "Latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Location by Trilateration",
        operationId = "getLocationByTrilateration",
        description = """Send in device data and calculate a position based on signal strengths.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = GeoPointResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/location/trilaterate"
        value = [PATH_GET_LOCATION_BY_TRILATERATION],
        produces = ["*/*"]
    )
    fun getLocationByTrilateration(
        @Parameter(description = "The account making the request, if provided the last know location will be updated") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The known GPS latitude to compare to the calculated version") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The known GPS longitude to compare to the calculated version") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The json formated sample data:  ```json {    \"count\": 2,   \"timespan\": 10,    \"samples\": [     {       \"deviceId\": \"device1\",       \"rssi\": [-63, -75]     },      {       \"deviceId\": \"device2\",       \"rssi\": [-83, -79]     }   ] } ``` ") @Valid @RequestParam(value = "data", required = false) `data`: kotlin.String?,
        @Parameter(description = "Optional response filters (not used currently)") @Valid @RequestParam(value = "responseFilters", required = false) responseFilters: kotlin.String?
    ): ResponseEntity<GeoPointResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Profile Assets",
        operationId = "getProfileAssets",
        description = """Get a list of assets a person has ever uploaded. Filters the list based on parameters.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssetListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/profile/assets"
        value = [PATH_GET_PROFILE_ASSETS],
        produces = ["*/*"]
    )
    fun getProfileAssets(
        @Parameter(description = "Determines whether to return null fields in the response", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnNulls", required = false, defaultValue = "false") returnNulls: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The account id of the person the user wants to view") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "Comma separated list of MediaType") @Valid @RequestParam(value = "mediaTypes", required = false) mediaTypes: kotlin.String?,
        @Parameter(description = "Comma separated list of mime types") @Valid @RequestParam(value = "mimeTypes", required = false) mimeTypes: kotlin.String?,
        @Parameter(description = "Determines what the returning list will be sorted by (see AssetApiMap)", schema = Schema(defaultValue = "CREATED")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "CREATED") sortField: kotlin.String,
        @Parameter(description = "Determines whether to return the resulting list in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "Latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "_i") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "Start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "_l") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "Limit of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "0") limit: kotlin.Int
    ): ResponseEntity<AssetListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Accounts",
        operationId = "getReferralList",
        description = """Gets a user's account profile and their referral List.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/referral/list"
        value = [PATH_GET_REFERRAL_LIST]
    )
    fun getReferralList(
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it's parents, recursively - GET_ALL will get all of the above") @Valid @RequestParam(value = "retrieveType", required = false) retrieveType: kotlin.String?,
        @Parameter(description = "level limit for children and ancestors of current account, starts from current account") @Valid @RequestParam(value = "levelLimit", required = false) levelLimit: java.math.BigDecimal?,
        @Parameter(description = "level limit for ancestors, will override levelLimit if this is set") @Valid @RequestParam(value = "ancestorLevelLimit", required = false) ancestorLevelLimit: java.math.BigDecimal?,
        @Parameter(description = "level limit for children, will override levelLimit if this is set") @Valid @RequestParam(value = "childrenLevelLimit", required = false) childrenLevelLimit: java.math.BigDecimal?,
        @Parameter(description = "pagination start for children list") @Valid @RequestParam(value = "ancestorListStart", required = false) ancestorListStart: java.math.BigDecimal?,
        @Parameter(description = "pagination limit for children list") @Valid @RequestParam(value = "ancestorListLimit", required = false) ancestorListLimit: java.math.BigDecimal?,
        @Parameter(description = "pagination start for children list") @Valid @RequestParam(value = "childrenListStart", required = false) childrenListStart: java.math.BigDecimal?,
        @Parameter(description = "pagination limit for children list") @Valid @RequestParam(value = "childrenListLimit", required = false) childrenListLimit: java.math.BigDecimal?,
        @Parameter(description = "if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "childrenChildren", required = false, defaultValue = "true") childrenChildren: kotlin.Boolean
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Account Settings",
        operationId = "getSettings",
        description = """Get the account settings for a user""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = UserSettingsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/settings/get"
        value = [PATH_GET_SETTINGS],
        produces = ["*/*"]
    )
    fun getSettings(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<UserSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login as Account",
        operationId = "loginDelegate",
        description = """A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/login/delegate"
        value = [PATH_LOGIN_DELEGATE],
        produces = ["*/*"]
    )
    fun loginDelegate(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "accessToken", required = true) accessToken: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "accessTokenSecret", required = false) accessTokenSecret: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "delegatedAccountId", required = false) delegatedAccountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "delegatedUsername", required = false) delegatedUsername: kotlin.String?,
        @Parameter(description = "The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE", schema = Schema(defaultValue = "USERNAME")) @Valid @RequestParam(value = "networkUID", required = false, defaultValue = "USERNAME") networkUID: kotlin.String,
        @Parameter(description = "Checks user's birthday to see if they meet an age requirement. If the user is under age, an error message is returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "ageRestriction", required = false, defaultValue = "0") ageRestriction: kotlin.Int,
        @Parameter(description = "This determines how much of the profile should be returned, see ProfileFilters", schema = Schema(defaultValue = "PROFILE")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE") responseFilters: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login Account",
        operationId = "loginGeneral",
        description = """General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/login"
        value = [PATH_LOGIN_GENERAL],
        produces = ["*/*"]
    )
    fun loginGeneral(
        @NotNull @Parameter(description = "The access token to authenticate with (ex: username or fb token)", required = true) @Valid @RequestParam(value = "accessToken", required = true) accessToken: kotlin.String,
        @NotNull @Parameter(description = "The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE ", required = true, schema = Schema(defaultValue = "USERNAME")) @Valid @RequestParam(value = "networkUID", required = true, defaultValue = "USERNAME") networkUID: kotlin.String,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc") @Valid @RequestParam(value = "deviceIdType", required = false) deviceIdType: kotlin.String?,
        @Parameter(description = "The secret to authenticate with (ex: password)") @Valid @RequestParam(value = "accessTokenSecret", required = false) accessTokenSecret: kotlin.String?,
        @Parameter(description = "Checks user's birthday to see if they meet an age requirement. If the user is under age, an error message is returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "ageRestriction", required = false, defaultValue = "0") ageRestriction: kotlin.Int,
        @Parameter(description = "This determines how much of the profile should be returned, see ProfileFilters", schema = Schema(defaultValue = "PROFILE")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE") responseFilters: kotlin.String,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Option to check for email if username doesn't match, also support multiple accounts", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "emailMatch", required = false, defaultValue = "false") emailMatch: kotlin.Boolean,
        @Parameter(description = "Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request", schema = Schema(defaultValue = "0L")) @Valid @RequestParam(value = "chosenAccountId", required = false, defaultValue = "0L") chosenAccountId: kotlin.Long,
        @Parameter(description = "Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object", schema = Schema(defaultValue = "0L")) @Valid @RequestParam(value = "thirdPartyCredentialId", required = false, defaultValue = "0L") thirdPartyCredentialId: kotlin.Long
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login Account (Username)",
        operationId = "loginUsername",
        description = """Login to system with an account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/get"
        value = [PATH_LOGIN_USERNAME],
        produces = ["*/*"]
    )
    fun loginUsername(
        @NotNull @Parameter(description = "the user's email address they used to sign-up", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "the password", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @Parameter(description = "the device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the app") @Valid @RequestParam(value = "app", required = false) app: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. This is deprecated, use appKey.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the profile to return") @Valid @RequestParam(value = "returnProfile", required = false) returnProfile: kotlin.Boolean?,
        @Parameter(description = "a comma separated list of ProfileFilters for filtering the returned response data") @Valid @RequestParam(value = "responseFilters", required = false) responseFilters: kotlin.String?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Logout Account",
        operationId = "logout",
        description = """Cleans up the users data for logging out.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/logout"
        value = [PATH_LOGOUT],
        produces = ["*/*"]
    )
    fun logout(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "Device Id Type") @Valid @RequestParam(value = "deviceIdType", required = false) deviceIdType: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Merge Account",
        operationId = "mergeAccount",
        description = """Merges the analytics, achievements, leaderboards of two accounts.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/merge"
        value = [PATH_MERGE_ACCOUNT],
        produces = ["*/*"]
    )
    fun mergeAccount(
        @NotNull @Parameter(description = "The id of the account to being merged", required = true) @Valid @RequestParam(value = "mergeAccountId", required = true) mergeAccountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Password",
        operationId = "passwordChange",
        description = """Update the account password.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/passwordchange"
        value = [PATH_PASSWORD_CHANGE],
        produces = ["*/*"]
    )
    fun passwordChange(
        @NotNull @Parameter(description = "The account to update", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The current password, used to validate access", required = true) @Valid @RequestParam(value = "oldPassword", required = true) oldPassword: kotlin.String,
        @NotNull @Parameter(description = "The new password to set, cannot be empty", required = true) @Valid @RequestParam(value = "newPassword", required = true) newPassword: kotlin.String,
        @NotNull @Parameter(description = "The new password to confirm, must match newPassword", required = true) @Valid @RequestParam(value = "confirmPassword", required = true) confirmPassword: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Reset Password",
        operationId = "passwordReset",
        description = """Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/passwordreset"
        value = [PATH_PASSWORD_RESET],
        produces = ["*/*"]
    )
    fun passwordReset(
        @NotNull @Parameter(description = "The token associated with the account to update, good for 24 hours", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,
        @NotNull @Parameter(description = "The new password to set, cannot be empty", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @NotNull @Parameter(description = "The new password to confirm, must match newPassword", required = true) @Valid @RequestParam(value = "confirm", required = true) confirm: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Request Password Reset",
        operationId = "requestPasswordReset",
        description = """Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/requestpasswordreset"
        value = [PATH_REQUEST_PASSWORD_RESET],
        produces = ["*/*"]
    )
    fun requestPasswordReset(
        @NotNull @Parameter(description = "The email/username of the account", required = true) @Valid @RequestParam(value = "email", required = true) email: kotlin.String,
        @Parameter(description = "this is the sender email", schema = Schema(defaultValue = "Sirqul")) @Valid @RequestParam(value = "from", required = false, defaultValue = "Sirqul") from: kotlin.String,
        @Parameter(description = "this is the domain (like dev.sirqul.com) used to generate the password reset link") @Valid @RequestParam(value = "domain", required = false) domain: kotlin.String?,
        @Parameter(description = "this is the the subUrl (like resetpassword) used to generate a password reset link") @Valid @RequestParam(value = "subUrl", required = false) subUrl: kotlin.String?,
        @Parameter(description = "this is used to generate a password reset link", schema = Schema(defaultValue = "http://dev.sirqul.com/resetpassword")) @Valid @RequestParam(value = "referer", required = false, defaultValue = "http://dev.sirqul.com/resetpassword") referer: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send Validation Request",
        operationId = "requestValidateAccount",
        description = """Send an email to validate a user's account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/requestValidateAccount"
        value = [PATH_REQUEST_VALIDATE_ACCOUNT],
        produces = ["*/*"]
    )
    fun requestValidateAccount(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Accounts",
        operationId = "searchAccounts",
        description = """Search for account profiles.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ProfileResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/account/profile/search"
        value = [PATH_SEARCH_ACCOUNTS],
        produces = ["*/*"]
    )
    fun searchAccounts(
        @NotNull @Parameter(description = "The id of the account requesting", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The keyword for for querying the account") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the latitude") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the radius", schema = Schema(defaultValue = "5.0")) @Valid @RequestParam(value = "radius", required = false, defaultValue = "5.0") radius: kotlin.Double,
        @Parameter(description = "the user's gender", schema = Schema(allowableValues = ["MALE", "FEMALE", "ANY"])) @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "the user's Game Experience", schema = Schema(allowableValues = ["ANY", "NEW", "BEGINNER", "INTERMEDIATE", "EXPERT"])) @Valid @RequestParam(value = "gameExperience", required = false) gameExperience: kotlin.String?,
        @Parameter(description = "the user's age") @Valid @RequestParam(value = "age", required = false) age: kotlin.Int?,
        @Parameter(description = "the user's Category Ids") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Return Nulls", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "returnNulls", required = false, defaultValue = "true") returnNulls: kotlin.Boolean,
        @Parameter(description = "A comma separated list of ProfileFilters for filtering the returned response data", schema = Schema(defaultValue = "PROFILE")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE") responseFilters: kotlin.String,
        @Parameter(description = "A comma separated list of PurchaseType", schema = Schema(defaultValue = "SIRQUL")) @Valid @RequestParam(value = "purchaseType", required = false, defaultValue = "SIRQUL") purchaseType: kotlin.String,
        @Parameter(description = "The field to sort by", schema = Schema(defaultValue = "id")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "id") sortField: kotlin.String,
        @Parameter(description = "The order to return the results. Default is false, which will return the results in ascending order.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The index into the record set to start with.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The total number of record to return.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active results. Default is false.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<ProfileResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login Account (Encrypted Username)",
        operationId = "secureLogin",
        description = """ogin with encrypted user-name and password.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/login/validate"
        value = [PATH_SECURE_LOGIN],
        produces = ["*/*"]
    )
    fun secureLogin(
        @NotNull @Parameter(description = "The user's encrypted email address they used to sign-up", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "The encrypted password", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "gameType", required = true) gameType: kotlin.String,
        @Parameter(description = "The device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "Charset Name", schema = Schema(defaultValue = "UTF-8")) @Valid @RequestParam(value = "charsetName", required = false, defaultValue = "UTF-8") charsetName: kotlin.String,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Return Profile", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnProfile", required = false, defaultValue = "false") returnProfile: kotlin.Boolean,
        @Parameter(description = "A comma separated list of ProfileFilters for filtering the returned response data", schema = Schema(defaultValue = "PROFILE")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE") responseFilters: kotlin.String
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Account (Encrypted Username)",
        operationId = "secureSignup",
        description = """Create a new account by role (with encrypted user-name and password)""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileInfoResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/create/validate"
        value = [PATH_SECURE_SIGNUP],
        produces = ["*/*"]
    )
    fun secureSignup(
        @NotNull @Parameter(description = "The device id", required = true) @Valid @RequestParam(value = "deviceId", required = true) deviceId: kotlin.String,
        @NotNull @Parameter(description = "The encrypted email of the user, this is what will be used when they login", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "The encrypted password of the user", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @Parameter(description = "The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "the inviteToken that the referrer use for this account to sign up") @Valid @RequestParam(value = "inviteToken", required = false) inviteToken: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the prefix of the user's name") @Valid @RequestParam(value = "prefixName", required = false) prefixName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's first name") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's middle name") @Valid @RequestParam(value = "middleName", required = false) middleName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the user's last name") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "If the parameter 'name' is empty or not present, this field will be used to set the suffix of the user's name") @Valid @RequestParam(value = "suffixName", required = false) suffixName: kotlin.String?,
        @Parameter(description = "Title") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "Device Id Type") @Valid @RequestParam(value = "deviceIdType", required = false) deviceIdType: kotlin.String?,
        @Parameter(description = "The user's contact email address (NOT the username) which is also used for email validation") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "The asset id to set the user's profile image") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "the user's address") @Valid @RequestParam(value = "address", required = false) address: kotlin.String?,
        @Parameter(description = "The street zipcode of the user's contact location") @Valid @RequestParam(value = "zipcode", required = false) zipcode: kotlin.String?,
        @Parameter(description = "The gender of the user AudienceGender") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The birthday date of the user in milliseconds") @Valid @RequestParam(value = "birthday", required = false) birthday: kotlin.Long?,
        @Parameter(description = "the user's home phone number") @Valid @RequestParam(value = "homePhone", required = false) homePhone: kotlin.String?,
        @Parameter(description = "the user's cell phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "the user's Cell Phone Carrier") @Valid @RequestParam(value = "cellPhoneCarrier", required = false) cellPhoneCarrier: kotlin.String?,
        @Parameter(description = "the user's Business Phone Number") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST", schema = Schema(defaultValue = "MEMBER")) @Valid @RequestParam(value = "role", required = false, defaultValue = "MEMBER") role: kotlin.String,
        @Parameter(description = "Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK") @Valid @RequestParam(value = "platforms", required = false) platforms: kotlin.String?,
        @Parameter(description = "Search tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "About Us information") @Valid @RequestParam(value = "aboutUs", required = false) aboutUs: kotlin.String?,
        @Parameter(description = "Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @Valid @RequestParam(value = "gameExperience", required = false) gameExperience: kotlin.String?,
        @Parameter(description = "A list of category ids that represent interests and associations") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The user's hometown") @Valid @RequestParam(value = "hometown", required = false) hometown: kotlin.String?,
        @Parameter(description = "The user's height") @Valid @RequestParam(value = "height", required = false) height: kotlin.String?,
        @Parameter(description = "The user's height in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "heightIndex", required = false) heightIndex: kotlin.Int?,
        @Parameter(description = "The user's ethnicity") @Valid @RequestParam(value = "ethnicity", required = false) ethnicity: kotlin.String?,
        @Parameter(description = "The user's body type") @Valid @RequestParam(value = "bodyType", required = false) bodyType: kotlin.String?,
        @Parameter(description = "The user's maritial status") @Valid @RequestParam(value = "maritalStatus", required = false) maritalStatus: kotlin.String?,
        @Parameter(description = "The user's children status") @Valid @RequestParam(value = "children", required = false) children: kotlin.String?,
        @Parameter(description = "The user's religion") @Valid @RequestParam(value = "religion", required = false) religion: kotlin.String?,
        @Parameter(description = "The user's education") @Valid @RequestParam(value = "education", required = false) education: kotlin.String?,
        @Parameter(description = "The user's education in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "educationIndex", required = false) educationIndex: kotlin.Int?,
        @Parameter(description = "The user's smoke status") @Valid @RequestParam(value = "smoke", required = false) smoke: kotlin.String?,
        @Parameter(description = "The user's drink status") @Valid @RequestParam(value = "drink", required = false) drink: kotlin.String?,
        @Parameter(description = "The user's companionship status") @Valid @RequestParam(value = "companionship", required = false) companionship: kotlin.String?,
        @Parameter(description = "The user's companionship index") @Valid @RequestParam(value = "companionshipIndex", required = false) companionshipIndex: kotlin.Int?,
        @Parameter(description = "The preferred minimum age in the account location search") @Valid @RequestParam(value = "preferredMinAge", required = false) preferredMinAge: kotlin.Int?,
        @Parameter(description = "The preferred maximum age in the account location search") @Valid @RequestParam(value = "preferredMaxAge", required = false) preferredMaxAge: kotlin.Int?,
        @Parameter(description = "The preferred minimum height in the account location search") @Valid @RequestParam(value = "preferredMinHeight", required = false) preferredMinHeight: kotlin.Int?,
        @Parameter(description = "The preferred maximum height in the account location search") @Valid @RequestParam(value = "preferredMaxHeight", required = false) preferredMaxHeight: kotlin.Int?,
        @Parameter(description = "The preferred gender in the account location search") @Valid @RequestParam(value = "preferredGender", required = false) preferredGender: kotlin.String?,
        @Parameter(description = "The preferred education in the account location search") @Valid @RequestParam(value = "preferredEducation", required = false) preferredEducation: kotlin.String?,
        @Parameter(description = "The preferred education in a numerical value that can be used for ordering/searching") @Valid @RequestParam(value = "preferredEducationIndex", required = false) preferredEducationIndex: kotlin.Int?,
        @Parameter(description = "The preferred body type in the account location search") @Valid @RequestParam(value = "preferredBodyType", required = false) preferredBodyType: kotlin.String?,
        @Parameter(description = "The preferred ethnicity in the account location search") @Valid @RequestParam(value = "preferredEthnicity", required = false) preferredEthnicity: kotlin.String?,
        @Parameter(description = "The preferred education in the account location search") @Valid @RequestParam(value = "preferredLocation", required = false) preferredLocation: kotlin.String?,
        @Parameter(description = "The preferred location range in the account location search") @Valid @RequestParam(value = "preferredLocationRange", required = false) preferredLocationRange: kotlin.Double?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Accepted Terms", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "acceptedTerms", required = false, defaultValue = "true") acceptedTerms: kotlin.Boolean,
        @Parameter(description = "Charset Name", schema = Schema(defaultValue = "UTF-8")) @Valid @RequestParam(value = "charsetName", required = false, defaultValue = "UTF-8") charsetName: kotlin.String,
        @Parameter(description = "Game Type") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "App Version") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "Response Type") @Valid @RequestParam(value = "responseType", required = false) responseType: kotlin.String?
    ): ResponseEntity<ProfileInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Account Active Status",
        operationId = "updateActveStatus",
        description = """Activate or deactivate an account (requires appropriate permissions).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/active/update"
        value = [PATH_UPDATE_ACTVE_STATUS],
        produces = ["*/*"]
    )
    fun updateActveStatus(
        @NotNull @Parameter(description = "the account id of the user (deviceId or accountId required)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)", required = true) @Valid @RequestParam(value = "connectionAccountId", required = true) connectionAccountId: kotlin.Long,
        @NotNull @Parameter(description = "true will activate the user and false will deactivate", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the application key that the user belongs to") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Location",
        operationId = "updateLocation",
        description = """Update the account location""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/location/update"
        value = [PATH_UPDATE_LOCATION],
        produces = ["*/*"]
    )
    fun updateLocation(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The time of the update") @Valid @RequestParam(value = "clientTime", required = false) clientTime: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Account Settings",
        operationId = "updateSettings",
        description = """Update the account settings for a user""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = UserSettingsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/settings/update"
        value = [PATH_UPDATE_SETTINGS],
        produces = ["*/*"]
    )
    fun updateSettings(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The notifications to be blocked") @Valid @RequestParam(value = "blockedNotifications", required = false) blockedNotifications: kotlin.String?,
        @Parameter(description = "How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)") @Valid @RequestParam(value = "suggestionMethod", required = false) suggestionMethod: kotlin.String?,
        @Parameter(description = "How many suggestions to receive per time frame") @Valid @RequestParam(value = "suggestionCount", required = false) suggestionCount: kotlin.Int?,
        @Parameter(description = "The time frame in seconds, 3600 would be a 1 hour time frame") @Valid @RequestParam(value = "suggestionTimeFrame", required = false) suggestionTimeFrame: kotlin.Int?,
        @Parameter(description = "Show Others Exact Location") @Valid @RequestParam(value = "showOthersExactLocation", required = false) showOthersExactLocation: kotlin.Boolean?,
        @Parameter(description = "Show As Zipcode") @Valid @RequestParam(value = "showAsZipcode", required = false) showAsZipcode: kotlin.Boolean?,
        @Parameter(description = "Show Exact Location") @Valid @RequestParam(value = "showExactLocation", required = false) showExactLocation: kotlin.Boolean?,
        @Parameter(description = "Show favorites") @Valid @RequestParam(value = "favoriteVisibility", required = false) favoriteVisibility: kotlin.String?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<UserSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Save Validation Status",
        operationId = "validateAccountSignup",
        description = """Validate the account's email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AccountLoginResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/validateAccountSignup"
        value = [PATH_VALIDATE_ACCOUNT_SIGNUP],
        produces = ["*/*"]
    )
    fun validateAccountSignup(
        @NotNull @Parameter(description = "The token associated with the account to update, good for 24 hours", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String
    ): ResponseEntity<AccountLoginResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Validate Password Reset Token",
        operationId = "validatePasswordReset",
        description = """Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/account/validatepasswordreset"
        value = [PATH_VALIDATE_PASSWORD_RESET],
        produces = ["*/*"]
    )
    fun validatePasswordReset(
        @NotNull @Parameter(description = "The token associated with the account to update, good for 24 hours", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ACCOUNT_LOCATION_SEARCH: String = "/account/search"
        const val PATH_BLOCK_ACCOUNT: String = "/account/block"
        const val PATH_CREATE_ACCOUNT: String = "/account/create"
        const val PATH_EDIT_ACCOUNT: String = "/account/profile/update"
        const val PATH_EDIT_USERNAME: String = "/account/username/update"
        const val PATH_GET_ACCOUNT: String = "/account/profile/get"
        const val PATH_GET_LOCATION_BY_TRILATERATION: String = "/account/location/trilaterate"
        const val PATH_GET_PROFILE_ASSETS: String = "/account/profile/assets"
        const val PATH_GET_REFERRAL_LIST: String = "/account/referral/list"
        const val PATH_GET_SETTINGS: String = "/account/settings/get"
        const val PATH_LOGIN_DELEGATE: String = "/account/login/delegate"
        const val PATH_LOGIN_GENERAL: String = "/account/login"
        const val PATH_LOGIN_USERNAME: String = "/account/get"
        const val PATH_LOGOUT: String = "/account/logout"
        const val PATH_MERGE_ACCOUNT: String = "/account/merge"
        const val PATH_PASSWORD_CHANGE: String = "/account/passwordchange"
        const val PATH_PASSWORD_RESET: String = "/account/passwordreset"
        const val PATH_REQUEST_PASSWORD_RESET: String = "/account/requestpasswordreset"
        const val PATH_REQUEST_VALIDATE_ACCOUNT: String = "/account/requestValidateAccount"
        const val PATH_SEARCH_ACCOUNTS: String = "/account/profile/search"
        const val PATH_SECURE_LOGIN: String = "/account/login/validate"
        const val PATH_SECURE_SIGNUP: String = "/account/create/validate"
        const val PATH_UPDATE_ACTVE_STATUS: String = "/account/active/update"
        const val PATH_UPDATE_LOCATION: String = "/account/location/update"
        const val PATH_UPDATE_SETTINGS: String = "/account/settings/update"
        const val PATH_VALIDATE_ACCOUNT_SIGNUP: String = "/account/validateAccountSignup"
        const val PATH_VALIDATE_PASSWORD_RESET: String = "/account/validatepasswordreset"
    }
}
