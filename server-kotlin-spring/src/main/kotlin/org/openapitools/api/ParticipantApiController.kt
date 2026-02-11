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
class ParticipantApiController() {

    @Operation(
        summary = "Process All Participant Feeds",
        operationId = "processAllParticipants",
        description = """Processes all supported participant feeds.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/participant/process/all"
        value = [PATH_PROCESS_ALL_PARTICIPANTS],
        produces = ["*/*"]
    )
    fun processAllParticipants(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Whether to use short name as the participant ID") @Valid @RequestParam(value = "useShortNameAsID", required = false) useShortNameAsID: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Process Participants Feed",
        operationId = "processParticipants",
        description = """Processes a participant feed or uploaded file for a specific league.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/participant/process"
        value = [PATH_PROCESS_PARTICIPANTS],
        produces = ["*/*"]
    )
    fun processParticipants(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The league identifier to process", required = true) @Valid @RequestParam(value = "league", required = true) league: kotlin.String,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Whether to use short name as the participant ID") @Valid @RequestParam(value = "useShortNameAsID", required = false) useShortNameAsID: kotlin.Boolean?,
        @Parameter(description = "Multipart file containing participant feed contents") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_PROCESS_ALL_PARTICIPANTS: String = "/participant/process/all"
        const val PATH_PROCESS_PARTICIPANTS: String = "/participant/process"
    }
}
