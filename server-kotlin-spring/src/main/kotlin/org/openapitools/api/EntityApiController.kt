package org.openapitools.api

import org.openapitools.model.ActivityResponse
import org.openapitools.model.EntityReference
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
class EntityApiController() {

    @Operation(
        summary = "Create an entity reference.",
        operationId = "createEntityReference",
        description = """Creates a reference for an entity for syncing data between servers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ActivityResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/entity/reference"
        value = [PATH_CREATE_ENTITY_REFERENCE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createEntityReference(
        @Parameter(description = "The entity reference object", required = true) @Valid @RequestBody body: EntityReference
    ): ResponseEntity<ActivityResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_ENTITY_REFERENCE: String = "/entity/reference"
    }
}
