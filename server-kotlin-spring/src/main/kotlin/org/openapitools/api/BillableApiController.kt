package org.openapitools.api

import org.openapitools.model.BillableEntityResponse
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
class BillableApiController() {

    @Operation(
        summary = "Create Billable",
        operationId = "createBillableEntity",
        description = """reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BillableEntityResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/billable/create"
        value = [PATH_CREATE_BILLABLE_ENTITY],
        produces = ["*/*"]
    )
    fun createBillableEntity(
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the entity responsible for billing ") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The street address of the billable entity") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box) ") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the billable entity") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the billable entity") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the billable entity") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "The business phone of the billable entity") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "Authorize Net Api Key") @Valid @RequestParam(value = "authorizeNetApiKey", required = false) authorizeNetApiKey: kotlin.String?,
        @Parameter(description = "Authorize Net Transaction Key") @Valid @RequestParam(value = "authorizeNetTransactionKey", required = false) authorizeNetTransactionKey: kotlin.String?
    ): ResponseEntity<BillableEntityResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Billable",
        operationId = "deleteBillableEntity",
        description = """Mark the billable as deleted""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/billable/delete"
        value = [PATH_DELETE_BILLABLE_ENTITY],
        produces = ["*/*"]
    )
    fun deleteBillableEntity(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the delete, must have rights to edit the billable entity.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Billable",
        operationId = "getBillableEntity",
        description = """Used to determine the associated BillableEntity of an account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BillableEntityResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/billable/get"
        value = [PATH_GET_BILLABLE_ENTITY],
        produces = ["*/*"]
    )
    fun getBillableEntity(
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Determines whether to include the retailer dash board counts into the response", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeCounts", required = false, defaultValue = "false") includeCounts: kotlin.Boolean,
        @Parameter(description = "Whether to enable payments or not", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "includePayments", required = false, defaultValue = "true") includePayments: kotlin.Boolean
    ): ResponseEntity<BillableEntityResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Billable",
        operationId = "updateBillableEntity",
        description = """Updates the billable record for an account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BillableEntityResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/billable/update"
        value = [PATH_UPDATE_BILLABLE_ENTITY],
        produces = ["*/*"]
    )
    fun updateBillableEntity(
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the entity responsible for billing ") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The street address of the billable entity") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box) ") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the billable entity") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the billable entity") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the billable entity") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "The business phone of the billable entity") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension of the billable entity") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "Authorize Net Api Key of the billable entity") @Valid @RequestParam(value = "authorizeNetApiKey", required = false) authorizeNetApiKey: kotlin.String?,
        @Parameter(description = "Authorize Net Transaction Key of the billable entity") @Valid @RequestParam(value = "authorizeNetTransactionKey", required = false) authorizeNetTransactionKey: kotlin.String?
    ): ResponseEntity<BillableEntityResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_BILLABLE_ENTITY: String = "/billable/create"
        const val PATH_DELETE_BILLABLE_ENTITY: String = "/billable/delete"
        const val PATH_GET_BILLABLE_ENTITY: String = "/billable/get"
        const val PATH_UPDATE_BILLABLE_ENTITY: String = "/billable/update"
    }
}
