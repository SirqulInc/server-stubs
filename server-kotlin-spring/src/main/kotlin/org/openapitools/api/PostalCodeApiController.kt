package org.openapitools.api

import org.openapitools.model.PostalCodeResponse
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
class PostalCodeApiController() {

    @Operation(
        summary = "Create Postal Code",
        operationId = "createPostalCode",
        description = """Create a Postal Code""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PostalCodeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/postalCode/create"
        value = [PATH_CREATE_POSTAL_CODE],
        produces = ["*/*"]
    )
    fun createPostalCode(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the postal code", required = true) @Valid @RequestParam(value = "code", required = true) code: kotlin.String,
        @NotNull @Parameter(description = "the latitude of the postal code", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "the longitude of the postal code", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double,
        @Parameter(description = "the state code (e.g WA, WV, WI) that the postal code is located") @Valid @RequestParam(value = "stateCode", required = false) stateCode: kotlin.String?,
        @Parameter(description = "the city that the postal code is located") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "whether the postal code created should be active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<PostalCodeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Postal Code",
        operationId = "deletePostalCode",
        description = """Delete a Postal Code""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/postalCode/delete"
        value = [PATH_DELETE_POSTAL_CODE],
        produces = ["*/*"]
    )
    fun deletePostalCode(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the postal code to delete", required = true) @Valid @RequestParam(value = "postalCodeId", required = true) postalCodeId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Postal Code",
        operationId = "getPostalCode",
        description = """Get a Postal Code""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PostalCodeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/postalCode/get"
        value = [PATH_GET_POSTAL_CODE],
        produces = ["*/*"]
    )
    fun getPostalCode(
        @NotNull @Parameter(description = "the id of the postal code to get", required = true) @Valid @RequestParam(value = "postalCodeId", required = true) postalCodeId: kotlin.Long
    ): ResponseEntity<PostalCodeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Postal Codes",
        operationId = "getPostalCodes",
        description = """Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = PostalCodeResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/postalCode/search"
        value = [PATH_GET_POSTAL_CODES],
        produces = ["*/*"]
    )
    fun getPostalCodes(
        @NotNull @Parameter(description = "the field to sort the results on", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "whether to order results in ascending or descending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @Parameter(description = "the latitude of the postal code to search on") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the postal code to search on") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the keyword of the postal code to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "how far (in miles) to search on for the postal code") @Valid @RequestParam(value = "miles", required = false) miles: kotlin.Double?,
        @Parameter(description = "the start of the index and/or pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "the limit of the index and/or pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<PostalCodeResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Postal Code",
        operationId = "updatePostalCode",
        description = """Update a Postal Code""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PostalCodeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/postalCode/update"
        value = [PATH_UPDATE_POSTAL_CODE],
        produces = ["*/*"]
    )
    fun updatePostalCode(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the postal code to update", required = true) @Valid @RequestParam(value = "postalCodeId", required = true) postalCodeId: kotlin.Long,
        @Parameter(description = "the postal code to update") @Valid @RequestParam(value = "code", required = false) code: kotlin.String?,
        @Parameter(description = "the latitude of the postal code") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the postal code") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the state code (e.g. WA, WI, WY) where the postal code is located") @Valid @RequestParam(value = "stateCode", required = false) stateCode: kotlin.String?,
        @Parameter(description = "the city where the postal code is located") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "whether the postal code is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<PostalCodeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_POSTAL_CODE: String = "/postalCode/create"
        const val PATH_DELETE_POSTAL_CODE: String = "/postalCode/delete"
        const val PATH_GET_POSTAL_CODE: String = "/postalCode/get"
        const val PATH_GET_POSTAL_CODES: String = "/postalCode/search"
        const val PATH_UPDATE_POSTAL_CODE: String = "/postalCode/update"
    }
}
