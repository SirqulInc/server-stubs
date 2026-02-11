package org.openapitools.api

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
class WorkflowApiController() {

    @Operation(
        summary = "Run Workflow",
        operationId = "runWorkflow",
        description = """Runs a published executable workflow""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/workflow/run"
        value = [PATH_RUN_WORKFLOW],
        produces = ["*/*"]
    )
    fun runWorkflow(
        @NotNull @Parameter(description = "the account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the workflow to run", required = true) @Valid @RequestParam(value = "workflowId", required = true) workflowId: kotlin.Long,
        @Parameter(description = "this runs a particular sku on the workflow") @Valid @RequestParam(value = "skuId", required = false) skuId: kotlin.Long?,
        @Parameter(description = "this runs a particular sku version on the workflow") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "Override parameters in JSON format. Example: ```json {   \"arguments_81\": { \"filter\": \"PUBLIC\" },   \"arguments_87\": { \"tag\": \"custom_tag\" } } ``` ") @Valid @RequestParam(value = "parameters", required = false) parameters: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_RUN_WORKFLOW: String = "/workflow/run"
    }
}
