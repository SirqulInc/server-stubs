package org.openapitools.api

import org.openapitools.model.TwiMLResponse
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
class SmsApiController() {

    @Operation(
        summary = "Buy Offer by SMS",
        operationId = "smsBuyOffer",
        description = """Recieve an SMS payload from Twillio to purchase an offer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TwiMLResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/sms/buyoffer/{appKey}"
        value = [PATH_SMS_BUY_OFFER],
        produces = ["application/xml"]
    )
    fun smsBuyOffer(
        @Parameter(description = "the application key", required = true) @PathVariable("appKey") appKey: kotlin.String,
        @NotNull @Parameter(description = "the message of the text", required = true) @Valid @RequestParam(value = "Body", required = true) body: kotlin.String,
        @NotNull @Parameter(description = "the sender of the sms", required = true) @Valid @RequestParam(value = "From", required = true) from: kotlin.String,
        @NotNull @Parameter(description = "the type of currency", required = true) @Valid @RequestParam(value = "currencyType", required = true) currencyType: kotlin.String
    ): ResponseEntity<TwiMLResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_SMS_BUY_OFFER: String = "/sms/buyoffer/{appKey}"
    }
}
