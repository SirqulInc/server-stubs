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
class PermissionableApiController() {

    @Operation(
        summary = "Approve Permissionable",
        operationId = "approvePermissionable",
        description = """Sets the approval status of a permissionable object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/permissionable/approve"
        value = [PATH_APPROVE_PERMISSIONABLE],
        produces = ["*/*"]
    )
    fun approvePermissionable(
        @NotNull @Parameter(description = "The permissionable type of the object", required = true, schema = Schema(allowableValues = ["ACCOUNT", "GAMELEVEL", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "SCHEDULED_NOTIFICATION", "TASK", "TRIGGER"])) @Valid @RequestParam(value = "permissionableType", required = true) permissionableType: kotlin.String,
        @NotNull @Parameter(description = "The id of the permissionable object", required = true) @Valid @RequestParam(value = "permissionableId", required = true) permissionableId: kotlin.Long,
        @Parameter(description = "A unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}", schema = Schema(allowableValues = ["PENDING", "REJECTED", "APPROVED", "FEATURED"], defaultValue = "APPROVED")) @Valid @RequestParam(value = "approvalStatus", required = false, defaultValue = "APPROVED") approvalStatus: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_APPROVE_PERMISSIONABLE: String = "/permissionable/approve"
    }
}
