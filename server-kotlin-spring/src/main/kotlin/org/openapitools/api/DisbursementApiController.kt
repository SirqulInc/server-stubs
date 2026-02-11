package org.openapitools.api

import org.openapitools.model.DisbursementResponse
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
class DisbursementApiController() {

    @Operation(
        summary = "Check Disbursements",
        operationId = "checkDisbursements",
        description = """Checks the status of a captured disbrusement to see if it has been settled.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = DisbursementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/disbursement/check"
        value = [PATH_CHECK_DISBURSEMENTS],
        produces = ["*/*"]
    )
    fun checkDisbursements(
        @NotNull @Parameter(description = "the ID of the disbursement being checked on", required = true) @Valid @RequestParam(value = "disbursementId", required = true) disbursementId: kotlin.Long
    ): ResponseEntity<DisbursementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Disbursement",
        operationId = "createDisbursement",
        description = """Creates a Disbursement for sending money to a retailer""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = DisbursementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/disbursement/create"
        value = [PATH_CREATE_DISBURSEMENT],
        produces = ["*/*"]
    )
    fun createDisbursement(
        @NotNull @Parameter(description = "the ID of the logging in user (must be an EXECUTIVE account)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the account receiving the disbursement", required = true) @Valid @RequestParam(value = "receiverAccountId", required = true) receiverAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the original sender account", required = true) @Valid @RequestParam(value = "originalSenderAccountId", required = true) originalSenderAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the dollar amount of the disbursement", required = true) @Valid @RequestParam(value = "amount", required = true) amount: java.math.BigDecimal,
        @NotNull @Parameter(description = "the provider (e.g. Authorize.net, Bill.com, etc.)", required = true, schema = Schema(allowableValues = ["AUTHORIZE_NET", "AMAZON_FPS", "BILL_COM"])) @Valid @RequestParam(value = "provider", required = true) provider: kotlin.String,
        @Parameter(description = "the date that the disbursement is scheduled to go out to the payment provider") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "a title given for the disbursement") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "a comment that could be made for a disbursement") @Valid @RequestParam(value = "comment", required = false) comment: kotlin.String?,
        @Parameter(description = "external ID, which can be used as a way to reference the disbursement") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "This is for specifying parameters to make an http callback request for validating that the disbursement is valid") @Valid @RequestParam(value = "introspectionParams", required = false) introspectionParams: kotlin.String?
    ): ResponseEntity<DisbursementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Disbursement",
        operationId = "getDisbursement",
        description = """Get Disbursement details""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = DisbursementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/disbursement/get"
        value = [PATH_GET_DISBURSEMENT],
        produces = ["*/*"]
    )
    fun getDisbursement(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the disbursement", required = true) @Valid @RequestParam(value = "disbursementId", required = true) disbursementId: kotlin.Long
    ): ResponseEntity<DisbursementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Disbursements",
        operationId = "searchDisbursements",
        description = """Search Disbursements""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = DisbursementResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/disbursement/search"
        value = [PATH_SEARCH_DISBURSEMENTS],
        produces = ["*/*"]
    )
    fun searchDisbursements(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "filter results by the id of the account receiving the disbursement") @Valid @RequestParam(value = "receiverAccountId", required = false) receiverAccountId: kotlin.Long?,
        @Parameter(description = "comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED") @Valid @RequestParam(value = "statuses", required = false) statuses: kotlin.String?,
        @Parameter(description = "comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM") @Valid @RequestParam(value = "providers", required = false) providers: kotlin.String?,
        @Parameter(description = "the date for searching disbursements before it has been processed") @Valid @RequestParam(value = "beforeDate", required = false) beforeDate: kotlin.Long?,
        @Parameter(description = "the date for searching disbursements before it has been processed") @Valid @RequestParam(value = "afterDate", required = false) afterDate: kotlin.Long?,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit per result set for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "search on disbursements that are active only", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean,
        @Parameter(description = "search results by this external ID (that can be used to reference the disbursement)") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?
    ): ResponseEntity<List<DisbursementResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Disbursement",
        operationId = "updateDisbursement",
        description = """Update Disbursement""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = DisbursementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/disbursement/update"
        value = [PATH_UPDATE_DISBURSEMENT],
        produces = ["*/*"]
    )
    fun updateDisbursement(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the disbursement being updated", required = true) @Valid @RequestParam(value = "disbursementId", required = true) disbursementId: kotlin.Long,
        @Parameter(description = "the disbursement dollar amount being updated") @Valid @RequestParam(value = "amount", required = false) amount: java.math.BigDecimal?,
        @Parameter(description = "the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)", schema = Schema(allowableValues = ["AUTHORIZE_NET", "AMAZON_FPS", "BILL_COM"])) @Valid @RequestParam(value = "provider", required = false) provider: kotlin.String?,
        @Parameter(description = "the date that the disbursement is scheduled to go out to the payment provider") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "the title given to the disbursement") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "a comment that can be made on a disbursement") @Valid @RequestParam(value = "comment", required = false) comment: kotlin.String?,
        @Parameter(description = "an external ID that can be used to reference the disbursement") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "determines whether to try sending the disbursement again in the case of a previous failure") @Valid @RequestParam(value = "retry", required = false) retry: kotlin.Boolean?,
        @Parameter(description = "for specifying parameters to make an http callback request for validating that the disbursement is valid") @Valid @RequestParam(value = "introspectionParams", required = false) introspectionParams: kotlin.String?
    ): ResponseEntity<DisbursementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CHECK_DISBURSEMENTS: String = "/disbursement/check"
        const val PATH_CREATE_DISBURSEMENT: String = "/disbursement/create"
        const val PATH_GET_DISBURSEMENT: String = "/disbursement/get"
        const val PATH_SEARCH_DISBURSEMENTS: String = "/disbursement/search"
        const val PATH_UPDATE_DISBURSEMENT: String = "/disbursement/update"
    }
}
