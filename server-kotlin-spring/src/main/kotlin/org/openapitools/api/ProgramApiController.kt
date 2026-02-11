package org.openapitools.api

import org.openapitools.model.Program
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
class ProgramApiController() {

    @Operation(
        summary = "Create Program",
        operationId = "createProgram",
        description = """Create a new program""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Program::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/program"
        value = [PATH_CREATE_PROGRAM],
        produces = ["*/*"]
    )
    fun createProgram(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Program?
    ): ResponseEntity<Program> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Program",
        operationId = "deleteProgram",
        description = """Delete an existing program""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/program/{id}"
        value = [PATH_DELETE_PROGRAM]
    )
    fun deleteProgram(
        @Parameter(description = "the id of the program", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Program",
        operationId = "getProgram",
        description = """Get an existing program""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Program::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/program/{id}"
        value = [PATH_GET_PROGRAM],
        produces = ["*/*"]
    )
    fun getProgram(
        @Parameter(description = "the id of the program", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Program> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Program",
        operationId = "postProgram",
        description = """Update an existing program""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Program::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/program/{id}"
        value = [PATH_POST_PROGRAM],
        produces = ["*/*"]
    )
    fun postProgram(
        @Parameter(description = "the id of the program", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Program?
    ): ResponseEntity<Program> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Program",
        operationId = "putProgram",
        description = """Update an existing program""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Program::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/program/{id}"
        value = [PATH_PUT_PROGRAM],
        produces = ["*/*"]
    )
    fun putProgram(
        @Parameter(description = "the id of the program", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Program?
    ): ResponseEntity<Program> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Programs",
        operationId = "searchPrograms",
        description = """Search for programs""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Program::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/program"
        value = [PATH_SEARCH_PROGRAMS],
        produces = ["*/*"]
    )
    fun searchPrograms(
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The keyword to filter results by") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<Program>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_PROGRAM: String = "/program"
        const val PATH_DELETE_PROGRAM: String = "/program/{id}"
        const val PATH_GET_PROGRAM: String = "/program/{id}"
        const val PATH_POST_PROGRAM: String = "/program/{id}"
        const val PATH_PUT_PROGRAM: String = "/program/{id}"
        const val PATH_SEARCH_PROGRAMS: String = "/program"
    }
}
