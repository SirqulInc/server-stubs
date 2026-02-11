package org.openapitools.api

import org.openapitools.model.CsvImportResponse
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
class CsvimportApiController() {

    @Operation(
        summary = "Detail Status",
        operationId = "getStatusCSV",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/csvimport/batch/status/details"
        value = [PATH_GET_STATUS_CSV],
        produces = ["*/*"]
    )
    fun getStatusCSV(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the batch", required = true) @Valid @RequestParam(value = "batchId", required = true) batchId: kotlin.Long,
        @NotNull @Parameter(description = "The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL", required = true, schema = Schema(allowableValues = ["SUMMARY", "DETAILS", "ERRORS", "ALL"])) @Valid @RequestParam(value = "responseGroup", required = true) responseGroup: kotlin.String,
        @NotNull @Parameter(description = "the start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Long,
        @NotNull @Parameter(description = "the limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Status",
        operationId = "listStatusCSV",
        description = """Retrieves batches for a user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CsvImportResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/csvimport/batch/list"
        value = [PATH_LIST_STATUS_CSV],
        produces = ["*/*"]
    )
    fun listStatusCSV(
        @NotNull @Parameter(description = "the id of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int
    ): ResponseEntity<CsvImportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Batch Status",
        operationId = "statusCSV",
        description = """Checks status of batch upload.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CsvImportResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/csvimport/batch/status"
        value = [PATH_STATUS_CSV],
        produces = ["*/*"]
    )
    fun statusCSV(
        @NotNull @Parameter(description = "the id of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the batch to get its status", required = true) @Valid @RequestParam(value = "batchId", required = true) batchId: kotlin.Long
    ): ResponseEntity<CsvImportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Upload CSV",
        operationId = "uploadCSV",
        description = """Uploads a CSV import file.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CsvImportResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/csvimport/upload"
        value = [PATH_UPLOAD_CSV],
        produces = ["*/*"]
    )
    fun uploadCSV(
        @NotNull @Parameter(description = "the id of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS", required = true, schema = Schema(allowableValues = ["OFFERS", "RETAILERS", "RETAILERLOCATIONS", "CATEGORIES", "FILTERS"])) @Valid @RequestParam(value = "uploadType", required = true) uploadType: kotlin.String,
        @NotNull @Parameter(description = "the import file to reference", required = true) @Valid @RequestParam(value = "importFile", required = true) importFile: org.springframework.web.multipart.MultipartFile,
        @NotNull @Parameter(description = "the format of the file", required = true, schema = Schema(allowableValues = ["EXCEL", "MYSQL", "RFC4180", "TDF"])) @Valid @RequestParam(value = "fileFormat", required = true) fileFormat: kotlin.String,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<CsvImportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_STATUS_CSV: String = "/csvimport/batch/status/details"
        const val PATH_LIST_STATUS_CSV: String = "/csvimport/batch/list"
        const val PATH_STATUS_CSV: String = "/csvimport/batch/status"
        const val PATH_UPLOAD_CSV: String = "/csvimport/upload"
    }
}
