package org.openapitools.api

import org.openapitools.model.Account
import org.openapitools.model.CargoType
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
class CargoApiController() {

    @Operation(
        summary = "Create Dependent",
        operationId = "create",
        description = """Create dependent of the account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/cargo/dependent/{accountId}"
        value = [PATH_CREATE],
        produces = ["*/*"]
    )
    fun create(
        @Parameter(description = "the id of the parent account to create a dependent for", required = true) @PathVariable("accountId") accountId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Account?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Cargo Type",
        operationId = "createCargoType",
        description = """Create new cargo type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CargoType::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/cargo/type"
        value = [PATH_CREATE_CARGO_TYPE],
        produces = ["*/*"]
    )
    fun createCargoType(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: CargoType?
    ): ResponseEntity<CargoType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Cargo Type",
        operationId = "deleteCargoType",
        description = """Delete a type of cargo""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/cargo/type/{cargoTypeId}"
        value = [PATH_DELETE_CARGO_TYPE]
    )
    fun deleteCargoType(
        @Parameter(description = "the ID of the cargo type", required = true) @PathVariable("cargoTypeId") cargoTypeId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Cargo Type",
        operationId = "getCargoType",
        description = """Get an existing cargo type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CargoType::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/cargo/type/{cargoTypeId}"
        value = [PATH_GET_CARGO_TYPE],
        produces = ["*/*"]
    )
    fun getCargoType(
        @Parameter(description = "the cargo type ID", required = true) @PathVariable("cargoTypeId") cargoTypeId: kotlin.Long
    ): ResponseEntity<CargoType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get dependent list of an account",
        operationId = "getDependents",
        description = """Get the dependent list of an account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/cargo/dependent/{accountId}"
        value = [PATH_GET_DEPENDENTS],
        produces = ["*/*"]
    )
    fun getDependents(
        @Parameter(description = "the id of the parent account to get a list of dependents", required = true) @PathVariable("accountId") accountId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Dependent",
        operationId = "removeDependent",
        description = """Delete the Dependent""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/cargo/dependent/{accountId}"
        value = [PATH_REMOVE_DEPENDENT]
    )
    fun removeDependent(
        @Parameter(description = "the id of the parent account tied to the dependent", required = true) @PathVariable("accountId") accountId: kotlin.Long,
        @Parameter(description = "the id of the dependent to delete", required = true) @PathVariable("dependentId") dependentId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Cargo Type",
        operationId = "searchCargoTypes",
        description = """Search for types of cargo""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = CargoType::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/cargo/type"
        value = [PATH_SEARCH_CARGO_TYPES],
        produces = ["*/*"]
    )
    fun searchCargoTypes(
        @NotNull @Parameter(description = "the sort field to use for the cargo type", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "if the cargo type should be should be in descending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "the start of the search", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit of the search", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "if search should be on active only", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "the id of the retailer location") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "the ID of the hub") @Valid @RequestParam(value = "hubId", required = false) hubId: kotlin.Long?
    ): ResponseEntity<List<CargoType>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Cargo Type",
        operationId = "updateCargoType",
        description = """Update an existing cargo type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CargoType::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/cargo/type/{cargoTypeId}"
        value = [PATH_UPDATE_CARGO_TYPE],
        produces = ["*/*"]
    )
    fun updateCargoType(
        @Parameter(description = "the ID of the cargo type", required = true) @PathVariable("cargoTypeId") cargoTypeId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: CargoType?
    ): ResponseEntity<CargoType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE: String = "/cargo/dependent/{accountId}"
        const val PATH_CREATE_CARGO_TYPE: String = "/cargo/type"
        const val PATH_DELETE_CARGO_TYPE: String = "/cargo/type/{cargoTypeId}"
        const val PATH_GET_CARGO_TYPE: String = "/cargo/type/{cargoTypeId}"
        const val PATH_GET_DEPENDENTS: String = "/cargo/dependent/{accountId}"
        const val PATH_REMOVE_DEPENDENT: String = "/cargo/dependent/{accountId}"
        const val PATH_SEARCH_CARGO_TYPES: String = "/cargo/type"
        const val PATH_UPDATE_CARGO_TYPE: String = "/cargo/type/{cargoTypeId}"
    }
}
