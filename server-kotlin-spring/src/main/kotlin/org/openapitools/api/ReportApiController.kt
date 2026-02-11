package org.openapitools.api

import org.openapitools.model.RegionLegSummary
import org.openapitools.model.ReportBatchResponse
import org.openapitools.model.ReportRegionLegSummaryBatchResponse
import org.openapitools.model.ReportResponse
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
class ReportApiController() {

    @Operation(
        summary = "Create Offline Report",
        operationId = "createBatch",
        description = """Create an entry for the batch for offline report""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ReportBatchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/report/batch/create"
        value = [PATH_CREATE_BATCH],
        produces = ["*/*"]
    )
    fun createBatch(
        @NotNull @Parameter(description = "The account id of the user for passing account related params", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the status of the report", required = true, schema = Schema(allowableValues = ["NEW", "ERROR", "COMPLETE", "PARSE_ERROR", "PROCESSING", "DUPLICATE", "SAVEONLY"])) @Valid @RequestParam(value = "status", required = true) status: kotlin.String,
        @NotNull @Parameter(description = "the limit on how much you can preview of the batch report", required = true) @Valid @RequestParam(value = "previewLimit", required = true) previewLimit: kotlin.Int,
        @Parameter(description = "The application key for passing application related params") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "endpoint", required = false) endpoint: kotlin.String?,
        @Parameter(description = "a json structure list of the parameter values, example: ```json {   \"string\":\"value\",    \"number\":3.345,   \"date\":\"2014-05-01 00:00:00\" } ``` ") @Valid @RequestParam(value = "parameters", required = false) parameters: kotlin.String?,
        @Parameter(description = "name of the batch report") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "the start date of the batch report") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date of the batch report") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the description of the batch report") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "pageUrl", required = false) pageUrl: kotlin.String?
    ): ResponseEntity<ReportBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Offline Report",
        operationId = "createRegionLegSummaryBatch",
        description = """Create an entry for the batch for offline report""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ReportRegionLegSummaryBatchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/report/region/summary/batch"
        value = [PATH_CREATE_REGION_LEG_SUMMARY_BATCH],
        produces = ["*/*"]
    )
    fun createRegionLegSummaryBatch(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.collections.List<RegionLegSummary>?
    ): ResponseEntity<ReportRegionLegSummaryBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Offline Report",
        operationId = "deleteBatch",
        description = """Deletes a batch report.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/report/batch/delete"
        value = [PATH_DELETE_BATCH],
        produces = ["*/*"]
    )
    fun deleteBatch(
        @NotNull @Parameter(description = "the id of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the batch to delete", required = true) @Valid @RequestParam(value = "batchId", required = true) batchId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offline Report",
        operationId = "getReportBatch",
        description = """Checks status of batch report.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ReportBatchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/report/batch/get"
        value = [PATH_GET_REPORT_BATCH],
        produces = ["*/*"]
    )
    fun getReportBatch(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "returned by /report/batch/create", required = true) @Valid @RequestParam(value = "batchId", required = true) batchId: kotlin.Long,
        @NotNull @Parameter(description = "whether to return all batch results or not", required = true) @Valid @RequestParam(value = "allResults", required = true) allResults: kotlin.Boolean
    ): ResponseEntity<ReportBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Run Report",
        operationId = "runReport",
        description = """ This endpoint allows you to run a set of predefined reports that can be used to understand your users' behavior as well as trends within your application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ReportResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/report/run"
        value = [PATH_RUN_REPORT],
        produces = ["*/*"]
    )
    fun runReport(
        @NotNull @Parameter(description = "If true then descending order, false is ascending", required = true) @Valid @RequestParam(value = "desc", required = true) desc: kotlin.Boolean,
        @Parameter(description = "The account id of the user for passing account related params") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The named identifier of the query") @Valid @RequestParam(value = "query", required = false) query: kotlin.String?,
        @Parameter(description = "Parameter values used in the query in JSON format, example: ```json {   \"string\":\"value\",    \"number\":3.345,   \"date\":\"2014-05-01 00:00:00\" } ``` ") @Valid @RequestParam(value = "parameters", required = false) parameters: kotlin.String?,
        @Parameter(description = "The order to use, must be a column name (see response results for list of column names)") @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,
        @Parameter(description = "The start of the pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "The limit of the pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Long?,
        @Parameter(description = "Determines what response format to return. Options are: JSON or CSV", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?
    ): ResponseEntity<ReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Offline Reports",
        operationId = "searchBatch",
        description = """Retrieves batches for a user..""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ReportBatchResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/report/batch/search"
        value = [PATH_SEARCH_BATCH],
        produces = ["*/*"]
    )
    fun searchBatch(
        @NotNull @Parameter(description = "the id of the account logged in", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the start of the index and/or pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit of the index and/or pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the names of the report batch to search on") @Valid @RequestParam(value = "names", required = false) names: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the report batch status", schema = Schema(allowableValues = ["NEW", "ERROR", "COMPLETE", "PARSE_ERROR", "PROCESSING", "DUPLICATE", "SAVEONLY"])) @Valid @RequestParam(value = "status", required = false) status: kotlin.String?,
        @Parameter(description = "the global app to search on") @Valid @RequestParam(value = "globalAppSearch", required = false) globalAppSearch: kotlin.Boolean?,
        @Parameter(description = "the start date of the report batch to search on") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date of the report batch to search on") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?
    ): ResponseEntity<List<ReportBatchResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_BATCH: String = "/report/batch/create"
        const val PATH_CREATE_REGION_LEG_SUMMARY_BATCH: String = "/report/region/summary/batch"
        const val PATH_DELETE_BATCH: String = "/report/batch/delete"
        const val PATH_GET_REPORT_BATCH: String = "/report/batch/get"
        const val PATH_RUN_REPORT: String = "/report/run"
        const val PATH_SEARCH_BATCH: String = "/report/batch/search"
    }
}
