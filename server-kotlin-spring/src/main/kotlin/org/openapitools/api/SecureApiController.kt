package org.openapitools.api

import org.openapitools.model.PaymentRequest
import org.openapitools.model.ProfileResponse
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
class SecureApiController() {

    @Operation(
        summary = "Create Secure Application",
        operationId = "createSecureApplication",
        description = """Create a secure application record.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/secure/application/create"
        value = [PATH_CREATE_SECURE_APPLICATION],
        produces = ["*/*"]
    )
    fun createSecureApplication(
        @NotNull @Parameter(description = "The unique id of the user making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application to secure", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "keyCert", required = true) keyCert: org.springframework.web.multipart.MultipartFile,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "trustStore", required = true) trustStore: org.springframework.web.multipart.MultipartFile,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @Parameter(description = "", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "active", required = false, defaultValue = "true") active: kotlin.Boolean,
        @Parameter(description = "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL", schema = Schema(allowableValues = ["FINGERPRINT", "IRIS", "FACIAL"], defaultValue = "FACIAL")) @Valid @RequestParam(value = "biometricType", required = false, defaultValue = "FACIAL") biometricType: kotlin.String,
        @Parameter(description = "The position for the biometric file uploaded", schema = Schema(allowableValues = ["UNKNOWN", "LEFT_INDEX", "LEFT_MIDDLE", "LEFT_RING", "LEFT_LITTLE", "LEFT_THUMB", "RIGHT_INDEX", "RIGHT_MIDDLE", "RIGHT_RING", "RIGHT_LITTLE", "RIGHT_THUMB", "LEFT", "RIGHT"], defaultValue = "UNKNOWN")) @Valid @RequestParam(value = "biometricPosition", required = false, defaultValue = "UNKNOWN") biometricPosition: kotlin.String,
        @Parameter(description = "The position for each the biometric2 file uploaded", schema = Schema(allowableValues = ["UNKNOWN", "LEFT_INDEX", "LEFT_MIDDLE", "LEFT_RING", "LEFT_LITTLE", "LEFT_THUMB", "RIGHT_INDEX", "RIGHT_MIDDLE", "RIGHT_RING", "RIGHT_LITTLE", "RIGHT_THUMB", "LEFT", "RIGHT"], defaultValue = "UNKNOWN")) @Valid @RequestParam(value = "biometricPosition2", required = false, defaultValue = "UNKNOWN") biometricPosition2: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Secure Application",
        operationId = "deleteSecureApplication",
        description = """Delete a secure application record.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/secure/application/delete"
        value = [PATH_DELETE_SECURE_APPLICATION],
        produces = ["*/*"]
    )
    fun deleteSecureApplication(
        @NotNull @Parameter(description = "The unique id of the user making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application to secure", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login Clear",
        operationId = "loginSecure",
        description = """Login via Clear.me. Creates a new account if logging in for the first time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/secure/login"
        value = [PATH_LOGIN_SECURE],
        produces = ["*/*"]
    )
    fun loginSecure(
        @NotNull @Parameter(description = "The application making the request, defines what type and position is required to make a secure login the request.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The data file used to perform authentication", required = true) @Valid @RequestParam(value = "biometricFile", required = true) biometricFile: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The unique id of the device making the request") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The data file used to perform authentication") @Valid @RequestParam(value = "biometricFile2", required = false) biometricFile2: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "Checks user's birthday to see if they meet an age requirement. If the user is under age, an error message is returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "ageRestriction", required = false, defaultValue = "0") ageRestriction: kotlin.Int,
        @Parameter(description = "Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnProfile", required = false, defaultValue = "false") returnProfile: kotlin.Boolean,
        @Parameter(description = "If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters", schema = Schema(defaultValue = "PROFILE")) @Valid @RequestParam(value = "responseFilters", required = false, defaultValue = "PROFILE") responseFilters: kotlin.String,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Purchase Clear",
        operationId = "purchaseSecure",
        description = """Purchase via Clear.me. Creates a new account if purchasing for the first time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/secure/purchase"
        value = [PATH_PURCHASE_SECURE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun purchaseSecure(
        @Parameter(description = "The payment request object", required = true) @Valid @RequestBody body: PaymentRequest
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Rest Secure Application",
        operationId = "resetSecure",
        description = """Reset a secure application client.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/secure/application/reset"
        value = [PATH_RESET_SECURE],
        produces = ["*/*"]
    )
    fun resetSecure(
        @NotNull @Parameter(description = "The unique id of the user making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application to secure", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Secure Application",
        operationId = "updateSecureApplication",
        description = """Update a secure application record.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/secure/application/update"
        value = [PATH_UPDATE_SECURE_APPLICATION],
        produces = ["*/*"]
    )
    fun updateSecureApplication(
        @NotNull @Parameter(description = "The unique id of the user making the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application to secure", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "keyCert", required = false) keyCert: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "") @Valid @RequestParam(value = "trustStore", required = false) trustStore: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "") @Valid @RequestParam(value = "username", required = false) username: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "password", required = false) password: kotlin.String?,
        @Parameter(description = "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL", schema = Schema(allowableValues = ["FINGERPRINT", "IRIS", "FACIAL"])) @Valid @RequestParam(value = "biometricType", required = false) biometricType: kotlin.String?,
        @Parameter(description = "The position for the biometric file uploaded", schema = Schema(allowableValues = ["UNKNOWN", "LEFT_INDEX", "LEFT_MIDDLE", "LEFT_RING", "LEFT_LITTLE", "LEFT_THUMB", "RIGHT_INDEX", "RIGHT_MIDDLE", "RIGHT_RING", "RIGHT_LITTLE", "RIGHT_THUMB", "LEFT", "RIGHT"])) @Valid @RequestParam(value = "biometricPosition", required = false) biometricPosition: kotlin.String?,
        @Parameter(description = "The position for each the biometric2 file uploaded", schema = Schema(allowableValues = ["UNKNOWN", "LEFT_INDEX", "LEFT_MIDDLE", "LEFT_RING", "LEFT_LITTLE", "LEFT_THUMB", "RIGHT_INDEX", "RIGHT_MIDDLE", "RIGHT_RING", "RIGHT_LITTLE", "RIGHT_THUMB", "LEFT", "RIGHT"])) @Valid @RequestParam(value = "biometricPosition2", required = false) biometricPosition2: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_SECURE_APPLICATION: String = "/secure/application/create"
        const val PATH_DELETE_SECURE_APPLICATION: String = "/secure/application/delete"
        const val PATH_LOGIN_SECURE: String = "/secure/login"
        const val PATH_PURCHASE_SECURE: String = "/secure/purchase"
        const val PATH_RESET_SECURE: String = "/secure/application/reset"
        const val PATH_UPDATE_SECURE_APPLICATION: String = "/secure/application/update"
    }
}
