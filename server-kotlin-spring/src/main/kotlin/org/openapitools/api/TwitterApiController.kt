package org.openapitools.api

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
class TwitterApiController() {

    @Operation(
        summary = "Authorize Twitter",
        operationId = "authorizeTwitter",
        description = """Makes an authorization call to twitter for a user to login and allow any app permissions.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/twitter/authorize"
        value = [PATH_AUTHORIZE_TWITTER],
        produces = ["*/*"]
    )
    fun authorizeTwitter(
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login Twitter",
        operationId = "loginTwitter",
        description = """Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/twitter/login"
        value = [PATH_LOGIN_TWITTER],
        produces = ["*/*"]
    )
    fun loginTwitter(
        @NotNull @Parameter(description = "The access token", required = true) @Valid @RequestParam(value = "accessToken", required = true) accessToken: kotlin.String,
        @NotNull @Parameter(description = "The secret access token", required = true) @Valid @RequestParam(value = "accessTokenSecret", required = true) accessTokenSecret: kotlin.String,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "a comma separated list of ProfileFilters for filtering the returned response data", required = true) @Valid @RequestParam(value = "responseFilters", required = true) responseFilters: kotlin.String,
        @Parameter(description = "The device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_AUTHORIZE_TWITTER: String = "/twitter/authorize"
        const val PATH_LOGIN_TWITTER: String = "/twitter/login"
    }
}
