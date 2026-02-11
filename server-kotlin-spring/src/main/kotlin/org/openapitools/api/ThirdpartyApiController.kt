package org.openapitools.api

import org.openapitools.model.ProfileResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.ThirdPartyCredentialResponse
import org.openapitools.model.ThirdPartyNetworkResponse
import org.openapitools.model.ThirdPartyNetworkShortResponse
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
class ThirdpartyApiController() {

    @Operation(
        summary = "Create Credential",
        operationId = "createCredential",
        description = """This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account. 

The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user's third-party login credentials for the user with the same thirdPartyId and networkUID combination. 

 The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/credential/create"
        value = [PATH_CREATE_CREDENTIAL],
        produces = ["*/*"]
    )
    fun createCredential(
        @NotNull @Parameter(description = "the third party user account id", required = true) @Valid @RequestParam(value = "thirdPartyId", required = true) thirdPartyId: kotlin.String,
        @NotNull @Parameter(description = "the access token to authenticate with (ex: username or fb token or phone number)", required = true) @Valid @RequestParam(value = "thirdPartyToken", required = true) thirdPartyToken: kotlin.String,
        @NotNull @Parameter(description = "the access provider to authenticate against", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the unique id of the account that needs authenticating (optional for PHONE_V2)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the session id for the request") @Valid @RequestParam(value = "sessionId", required = false) sessionId: kotlin.String?,
        @Parameter(description = "the third party user's display name") @Valid @RequestParam(value = "thirdPartyName", required = false) thirdPartyName: kotlin.String?,
        @Parameter(description = "optional email address associated with the third party account") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "when true will error out if can't find any accounts matching (signin only)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "signinOnlyMode", required = false, defaultValue = "false") signinOnlyMode: kotlin.Boolean,
        @Parameter(description = "this determines how much of the profile should be returned, see ProfileFilters") @Valid @RequestParam(value = "responseFilters", required = false) responseFilters: kotlin.String?,
        @Parameter(description = "the latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "optional refresh token for the third party") @Valid @RequestParam(value = "thirdPartyRefreshToken", required = false) thirdPartyRefreshToken: kotlin.String?,
        @Parameter(description = "audience ids to add to the account") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "audience ids to remove from the account") @Valid @RequestParam(value = "audienceIdsToRemove", required = false) audienceIdsToRemove: kotlin.String?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Network",
        operationId = "createNetwork",
        description = """Creates a custom third party network.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ThirdPartyNetworkResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/network/create"
        value = [PATH_CREATE_NETWORK],
        produces = ["*/*"]
    )
    fun createNetwork(
        @NotNull @Parameter(description = "The account id making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the network", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "Whether the network uses introspection calls", required = true) @Valid @RequestParam(value = "enableIntrospection", required = true) enableIntrospection: kotlin.Boolean,
        @Parameter(description = "The description of the network") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "HTTP method to use for introspection calls (e.g., GET, POST)") @Valid @RequestParam(value = "introspectionMethod", required = false) introspectionMethod: kotlin.String?,
        @Parameter(description = "The HTTP URL of the introspection call") @Valid @RequestParam(value = "introspectionURL", required = false) introspectionURL: kotlin.String?,
        @Parameter(description = "The parameters of the introspection call") @Valid @RequestParam(value = "introspectionParams", required = false) introspectionParams: kotlin.String?,
        @Parameter(description = "Required response params") @Valid @RequestParam(value = "requiredRootField", required = false) requiredRootField: kotlin.String?,
        @Parameter(description = "Whether this network uses MFA") @Valid @RequestParam(value = "enableMFA", required = false) enableMFA: kotlin.Boolean?,
        @Parameter(description = "Size of the MFA token") @Valid @RequestParam(value = "sizeMFA", required = false) sizeMFA: kotlin.Int?,
        @Parameter(description = "Shelf life (seconds) of the MFA token") @Valid @RequestParam(value = "shelfLifeMFA", required = false) shelfLifeMFA: kotlin.Int?,
        @Parameter(description = "OAuth token endpoint URL") @Valid @RequestParam(value = "oauthTokenURL", required = false) oauthTokenURL: kotlin.String?,
        @Parameter(description = "OAuth private key file (multipart)") @Valid @RequestParam(value = "oauthPrivateKey", required = false) oauthPrivateKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "OAuth public key file (multipart)") @Valid @RequestParam(value = "oauthPublicKey", required = false) oauthPublicKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "OAuth client id") @Valid @RequestParam(value = "oauthClientId", required = false) oauthClientId: kotlin.String?,
        @Parameter(description = "OAuth secret key") @Valid @RequestParam(value = "oauthSecretKey", required = false) oauthSecretKey: kotlin.String?,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.String?
    ): ResponseEntity<ThirdPartyNetworkResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Credential",
        operationId = "deleteCredential",
        description = """Delete a third party network on a Sirqul account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/credential/delete"
        value = [PATH_DELETE_CREDENTIAL],
        produces = ["*/*"]
    )
    fun deleteCredential(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The third party network identifier", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String,
        @NotNull @Parameter(description = "The third party user id", required = true) @Valid @RequestParam(value = "thirdPartyId", required = true) thirdPartyId: kotlin.String,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Network",
        operationId = "deleteNetwork",
        description = """Marks a custom third party network as deleted. Only the network owners and managers have access to this.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/network/delete"
        value = [PATH_DELETE_NETWORK],
        produces = ["*/*"]
    )
    fun deleteNetwork(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The unique identifier for the third party network defined by Sirqul", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Credential",
        operationId = "getCredential",
        description = """Gets the account information given a third party token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/credential/get"
        value = [PATH_GET_CREDENTIAL],
        produces = ["*/*"]
    )
    fun getCredential(
        @NotNull @Parameter(description = "the access provider to authenticate against", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the unique account id of a specific account that will be bound to the third-party credentials") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the session id for the request") @Valid @RequestParam(value = "sessionId", required = false) sessionId: kotlin.String?,
        @Parameter(description = "the third-party credentials id from the response of the credential/create step") @Valid @RequestParam(value = "thirdPartyCredentialId", required = false) thirdPartyCredentialId: kotlin.Long?,
        @Parameter(description = "the access token to authenticate with") @Valid @RequestParam(value = "thirdPartyToken", required = false) thirdPartyToken: kotlin.String?,
        @Parameter(description = "the secret code to authenticate with (used for MFA)") @Valid @RequestParam(value = "thirdPartySecret", required = false) thirdPartySecret: kotlin.String?,
        @Parameter(description = "flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "createNewAccount", required = false, defaultValue = "false") createNewAccount: kotlin.Boolean,
        @Parameter(description = "this determines how much of the profile should be returned, see ProfileFilters") @Valid @RequestParam(value = "responseFilters", required = false) responseFilters: kotlin.String?,
        @Parameter(description = "the latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "audience ids to add to the account") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "audience ids to remove from the account") @Valid @RequestParam(value = "audienceIdsToRemove", required = false) audienceIdsToRemove: kotlin.String?,
        @Parameter(description = "account id of the referrer (inviter-invitee relationship)") @Valid @RequestParam(value = "referralAccountId", required = false) referralAccountId: kotlin.Long?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Network",
        operationId = "getNetwork",
        description = """Get the details of a third party network. Only the network owners and managers have access to this.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ThirdPartyNetworkResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/thirdparty/network/get"
        value = [PATH_GET_NETWORK],
        produces = ["*/*"]
    )
    fun getNetwork(
        @NotNull @Parameter(description = "The account id making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The unique identifier for the third party network defined by Sirqul", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String
    ): ResponseEntity<ThirdPartyNetworkResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Credentials",
        operationId = "searchCredentials",
        description = """Search on a user's linked third party networks.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ThirdPartyCredentialResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/thirdparty/credential/search"
        value = [PATH_SEARCH_CREDENTIALS],
        produces = ["*/*"]
    )
    fun searchCredentials(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The keyword used to search on the third party name and network string") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The network UID to filter results with") @Valid @RequestParam(value = "networkUID", required = false) networkUID: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "The start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit of the pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<List<ThirdPartyCredentialResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Networks",
        operationId = "searchNetworks",
        description = """Search on supported third party networks and custom networks from external users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ThirdPartyNetworkShortResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/thirdparty/network/search"
        value = [PATH_SEARCH_NETWORKS],
        produces = ["*/*"]
    )
    fun searchNetworks(
        @NotNull @Parameter(description = "The account id making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY", "NAME", "DESCRIPTION"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the search results", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The keyword used to search on the network name and description fields") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Determines whether to only return applications that the user has access to") @Valid @RequestParam(value = "filterBillable", required = false) filterBillable: kotlin.Boolean?
    ): ResponseEntity<List<ThirdPartyNetworkShortResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send MFA Challenge",
        operationId = "sendMFAChallenge",
        description = """Sends an MFA challenge (SMS or Email) for networks with MFA enabled.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/credential/mfa/send"
        value = [PATH_SEND_MFA_CHALLENGE],
        produces = ["*/*"]
    )
    fun sendMFAChallenge(
        @NotNull @Parameter(description = "the third party network provider that has MFA enabled", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the access token to authenticate with") @Valid @RequestParam(value = "thirdPartyToken", required = false) thirdPartyToken: kotlin.String?,
        @Parameter(description = "optional id of the existing third party credential") @Valid @RequestParam(value = "thirdPartyCredentialId", required = false) thirdPartyCredentialId: kotlin.Long?,
        @Parameter(description = "the unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Credential",
        operationId = "updateCredential",
        description = """Updates a third-party login for an account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/credential/update"
        value = [PATH_UPDATE_CREDENTIAL],
        produces = ["*/*"]
    )
    fun updateCredential(
        @NotNull @Parameter(description = "the access provider to authenticate against", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String,
        @NotNull @Parameter(description = "the third party user account id", required = true) @Valid @RequestParam(value = "thirdPartyId", required = true) thirdPartyId: kotlin.String,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the third party user name") @Valid @RequestParam(value = "thirdPartyName", required = false) thirdPartyName: kotlin.String?,
        @Parameter(description = "the access token to authenticate with (ex: username or fb token)") @Valid @RequestParam(value = "thirdPartyToken", required = false) thirdPartyToken: kotlin.String?,
        @Parameter(description = "this determines how much of the profile should be returned, see ProfileFilters") @Valid @RequestParam(value = "responseFilters", required = false) responseFilters: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "optional refresh token for the third party") @Valid @RequestParam(value = "thirdPartyRefreshToken", required = false) thirdPartyRefreshToken: kotlin.String?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Network",
        operationId = "updateNetwork",
        description = """Updates a custom third party network. Only the network owners and managers have access to this.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ThirdPartyNetworkResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/thirdparty/network/update"
        value = [PATH_UPDATE_NETWORK],
        produces = ["*/*"]
    )
    fun updateNetwork(
        @NotNull @Parameter(description = "The account id making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The unique identifier for the third party network defined by Sirqul", required = true) @Valid @RequestParam(value = "networkUID", required = true) networkUID: kotlin.String,
        @Parameter(description = "The name of the network") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the network") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "Whether the network uses introspection calls") @Valid @RequestParam(value = "enableIntrospection", required = false) enableIntrospection: kotlin.Boolean?,
        @Parameter(description = "HTTP method to use for introspection calls (e.g., GET, POST)") @Valid @RequestParam(value = "introspectionMethod", required = false) introspectionMethod: kotlin.String?,
        @Parameter(description = "The HTTP URL of the introspection call") @Valid @RequestParam(value = "introspectionURL", required = false) introspectionURL: kotlin.String?,
        @Parameter(description = "The parameters of the introspection call") @Valid @RequestParam(value = "introspectionParams", required = false) introspectionParams: kotlin.String?,
        @Parameter(description = "Required response params") @Valid @RequestParam(value = "requiredRootField", required = false) requiredRootField: kotlin.String?,
        @Parameter(description = "Whether this network uses MFA") @Valid @RequestParam(value = "enableMFA", required = false) enableMFA: kotlin.Boolean?,
        @Parameter(description = "Size of the MFA token") @Valid @RequestParam(value = "sizeMFA", required = false) sizeMFA: kotlin.Int?,
        @Parameter(description = "Shelf life (seconds) of the MFA token") @Valid @RequestParam(value = "shelfLifeMFA", required = false) shelfLifeMFA: kotlin.Int?,
        @Parameter(description = "OAuth token endpoint URL") @Valid @RequestParam(value = "oauthTokenURL", required = false) oauthTokenURL: kotlin.String?,
        @Parameter(description = "OAuth private key file (multipart)") @Valid @RequestParam(value = "oauthPrivateKey", required = false) oauthPrivateKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "OAuth public key file (multipart)") @Valid @RequestParam(value = "oauthPublicKey", required = false) oauthPublicKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "OAuth client id") @Valid @RequestParam(value = "oauthClientId", required = false) oauthClientId: kotlin.String?,
        @Parameter(description = "OAuth secret key") @Valid @RequestParam(value = "oauthSecretKey", required = false) oauthSecretKey: kotlin.String?,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.String?
    ): ResponseEntity<ThirdPartyNetworkResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_CREDENTIAL: String = "/thirdparty/credential/create"
        const val PATH_CREATE_NETWORK: String = "/thirdparty/network/create"
        const val PATH_DELETE_CREDENTIAL: String = "/thirdparty/credential/delete"
        const val PATH_DELETE_NETWORK: String = "/thirdparty/network/delete"
        const val PATH_GET_CREDENTIAL: String = "/thirdparty/credential/get"
        const val PATH_GET_NETWORK: String = "/thirdparty/network/get"
        const val PATH_SEARCH_CREDENTIALS: String = "/thirdparty/credential/search"
        const val PATH_SEARCH_NETWORKS: String = "/thirdparty/network/search"
        const val PATH_SEND_MFA_CHALLENGE: String = "/thirdparty/credential/mfa/send"
        const val PATH_UPDATE_CREDENTIAL: String = "/thirdparty/credential/update"
        const val PATH_UPDATE_NETWORK: String = "/thirdparty/network/update"
    }
}
