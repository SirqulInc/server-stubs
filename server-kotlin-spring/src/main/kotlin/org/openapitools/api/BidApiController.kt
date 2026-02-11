package org.openapitools.api

import org.openapitools.model.BidResponse
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
class BidApiController() {

    @Operation(
        summary = "Create Bid",
        operationId = "createBid",
        description = """Creates a bid on a biddable object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BidResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/bid/create"
        value = [PATH_CREATE_BID],
        produces = ["*/*"]
    )
    fun createBid(
        @NotNull @Parameter(description = "A biddable object type. Possible values include: CREATIVE (ads).", required = true) @Valid @RequestParam(value = "biddableType", required = true) biddableType: kotlin.String,
        @NotNull @Parameter(description = "The id of the biddable object", required = true) @Valid @RequestParam(value = "biddableId", required = true) biddableId: kotlin.Long,
        @NotNull @Parameter(description = "The bid amount for views. For ads, this is the amount that will be taken for each impression.", required = true) @Valid @RequestParam(value = "amountPerView", required = true) amountPerView: kotlin.Double,
        @NotNull @Parameter(description = "The bid amount for actions. For ads, this is the amount that will be taken for each click.", required = true) @Valid @RequestParam(value = "amountPerAction", required = true) amountPerAction: kotlin.Double,
        @NotNull @Parameter(description = "The allocated budget amount that will be used", required = true) @Valid @RequestParam(value = "budgetAmount", required = true) budgetAmount: kotlin.Double,
        @NotNull @Parameter(description = "The schedule for when the allocated budget amount is reset", required = true) @Valid @RequestParam(value = "budgetSchedule", required = true) budgetSchedule: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<BidResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Bid",
        operationId = "deleteBid",
        description = """Deleted a bid on a biddable object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/bid/delete"
        value = [PATH_DELETE_BID],
        produces = ["*/*"]
    )
    fun deleteBid(
        @NotNull @Parameter(description = "The bid id", required = true) @Valid @RequestParam(value = "bidId", required = true) bidId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Bid",
        operationId = "getBid",
        description = """Get the bid details of a biddable object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BidResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/bid/get"
        value = [PATH_GET_BID],
        produces = ["*/*"]
    )
    fun getBid(
        @NotNull @Parameter(description = "The bid id", required = true) @Valid @RequestParam(value = "bidId", required = true) bidId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<BidResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Bid",
        operationId = "updateBid",
        description = """Updates a bid on a biddable object""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BidResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/bid/update"
        value = [PATH_UPDATE_BID],
        produces = ["*/*"]
    )
    fun updateBid(
        @NotNull @Parameter(description = "The bid id", required = true) @Valid @RequestParam(value = "bidId", required = true) bidId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The bid amount for views. For ads, this is the amount that will be taken for each impression.") @Valid @RequestParam(value = "amountPerView", required = false) amountPerView: kotlin.Double?,
        @Parameter(description = "The bid amount for actions. For ads, this is the amount that will be taken for each click.") @Valid @RequestParam(value = "amountPerAction", required = false) amountPerAction: kotlin.Double?,
        @Parameter(description = "The allocated budget amount that will be used") @Valid @RequestParam(value = "budgetAmount", required = false) budgetAmount: kotlin.Double?,
        @Parameter(description = "The schedule for when the allocated budget amount is reset") @Valid @RequestParam(value = "budgetSchedule", required = false) budgetSchedule: kotlin.String?
    ): ResponseEntity<BidResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_BID: String = "/bid/create"
        const val PATH_DELETE_BID: String = "/bid/delete"
        const val PATH_GET_BID: String = "/bid/get"
        const val PATH_UPDATE_BID: String = "/bid/update"
    }
}
