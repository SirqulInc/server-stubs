package org.openapitools.api

import org.openapitools.model.WrappedProxyItemResponse
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
class OpenaiApiController() {

    @Operation(
        summary = "Generate images with OpenAI",
        operationId = "imageGeneration",
        description = """Generate images with OpenAI.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WrappedProxyItemResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/openai/v1/images/generations"
        value = [PATH_IMAGE_GENERATION],
        produces = ["*/*"]
    )
    fun imageGeneration(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Post Body Parameters", required = true) @Valid @RequestParam(value = "postBody", required = true) postBody: kotlin.String,
        @Parameter(description = "Return raw response") @Valid @RequestParam(value = "returnRawResponse", required = false) returnRawResponse: kotlin.Boolean?
    ): ResponseEntity<WrappedProxyItemResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_IMAGE_GENERATION: String = "/openai/v1/images/generations"
    }
}
