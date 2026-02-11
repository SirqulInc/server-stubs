package org.openapitools.api

import org.openapitools.model.SirqulResponse
import org.openapitools.model.TaskResponse
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
class TaskApiController() {

    @Operation(
        summary = "Create Task",
        operationId = "createTask",
        description = """Create a Task""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TaskResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/task/create"
        value = [PATH_CREATE_TASK],
        produces = ["*/*"]
    )
    fun createTask(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the task", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The application to target") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Client defined identifier for grouping tasks") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "The URL for making an HTTP call") @Valid @RequestParam(value = "endpointURL", required = false) endpointURL: kotlin.String?,
        @Parameter(description = "The parameters for making an HTTP call") @Valid @RequestParam(value = "payload", required = false) payload: kotlin.String?,
        @Parameter(description = "The date and time of the task") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "The starting date of the task") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The ending date of the task") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The cron expression that represents the task's schedule") @Valid @RequestParam(value = "cronExpression", required = false) cronExpression: kotlin.String?,
        @Parameter(description = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the Task is active or not (inactive Tasks are not processed)", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "active", required = false, defaultValue = "true") active: kotlin.Boolean
    ): ResponseEntity<TaskResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Task",
        operationId = "deleteTask",
        description = """Delete a Task""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/task/delete"
        value = [PATH_DELETE_TASK],
        produces = ["*/*"]
    )
    fun deleteTask(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the Task to delete.", required = true) @Valid @RequestParam(value = "taskId", required = true) taskId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Task",
        operationId = "getTask",
        description = """Get a Task""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TaskResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/task/get"
        value = [PATH_GET_TASK],
        produces = ["*/*"]
    )
    fun getTask(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the Task to return.", required = true) @Valid @RequestParam(value = "taskId", required = true) taskId: kotlin.Long
    ): ResponseEntity<TaskResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tasks",
        operationId = "searchTasks",
        description = """Search on Tasks""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = TaskResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/task/search"
        value = [PATH_SEARCH_TASKS],
        produces = ["*/*"]
    )
    fun searchTasks(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Filter results by a grouping identifier defined by the client") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user''s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks ", schema = Schema(defaultValue = "MINE")) @Valid @RequestParam(value = "filter", required = false, defaultValue = "MINE") filter: kotlin.String,
        @Parameter(description = "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE", schema = Schema(defaultValue = "NEW,ERROR,COMPLETE,PROCESSING")) @Valid @RequestParam(value = "statuses", required = false, defaultValue = "NEW,ERROR,COMPLETE,PROCESSING") statuses: kotlin.String,
        @Parameter(description = "Template Types") @Valid @RequestParam(value = "templateTypes", required = false) templateTypes: kotlin.String?,
        @Parameter(description = "Filter the list by a specific application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Keyword search on the task names.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE", schema = Schema(defaultValue = "CREATED")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "CREATED") sortField: kotlin.String,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "Start the result set at some index.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "Limit the result to some number.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active results", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<TaskResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Task",
        operationId = "updateTask",
        description = """Update a Task""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TaskResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/task/update"
        value = [PATH_UPDATE_TASK],
        produces = ["*/*"]
    )
    fun updateTask(
        @NotNull @Parameter(description = "Task Id", required = true) @Valid @RequestParam(value = "taskId", required = true) taskId: kotlin.Long,
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The name of the task") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The application to target") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Client defined identifier for grouping tasks") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "The URL for making an HTTP call") @Valid @RequestParam(value = "endpointURL", required = false) endpointURL: kotlin.String?,
        @Parameter(description = "The parameters for making an HTTP call") @Valid @RequestParam(value = "payload", required = false) payload: kotlin.String?,
        @Parameter(description = "The date and time of the task") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "The starting date of the task") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The ending date of the task") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The cron expression that represents the task's schedule") @Valid @RequestParam(value = "cronExpression", required = false) cronExpression: kotlin.String?,
        @Parameter(description = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the Task is active or not (inactive Tasks are not processed)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<TaskResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_TASK: String = "/task/create"
        const val PATH_DELETE_TASK: String = "/task/delete"
        const val PATH_GET_TASK: String = "/task/get"
        const val PATH_SEARCH_TASKS: String = "/task/search"
        const val PATH_UPDATE_TASK: String = "/task/update"
    }
}
