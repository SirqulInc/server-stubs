package org.openapitools.api

import org.openapitools.model.AccountMiniResponse
import org.openapitools.model.AssignmentResponse
import org.openapitools.model.AssignmentStatusResponse
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
class AssignmentApiController() {

    @Operation(
        summary = "Search Assignment Assignees",
        operationId = "assigmentAssigneeAccountSearch",
        description = """Search for avaiable users for creating or updating assignment.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AccountMiniResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/assignment/assignee/search"
        value = [PATH_ASSIGMENT_ASSIGNEE_ACCOUNT_SEARCH],
        produces = ["*/*"]
    )
    fun assigmentAssigneeAccountSearch(
        @NotNull @Parameter(description = "The account id sending the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The keyword to filter the returned results") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<AccountMiniResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Assignment",
        operationId = "assignmentCreate",
        description = """Create an assignment.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssignmentResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/assignment/create"
        value = [PATH_ASSIGNMENT_CREATE],
        produces = ["*/*"]
    )
    fun assignmentCreate(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the name for the assignment", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "the account id to assign to", required = true) @Valid @RequestParam(value = "assigneeAccountId", required = true) assigneeAccountId: kotlin.Long,
        @Parameter(description = "the desciprtion for the assignment") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the retailer location id") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "the tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "determines whether the assignment is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<AssignmentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Assignment",
        operationId = "assignmentDelete",
        description = """Delete an assignment.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/assignment/delete"
        value = [PATH_ASSIGNMENT_DELETE],
        produces = ["*/*"]
    )
    fun assignmentDelete(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment id", required = true) @Valid @RequestParam(value = "assignmentId", required = true) assignmentId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Assignment",
        operationId = "assignmentGet",
        description = """Get the details of an assignment.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssignmentResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/assignment/get"
        value = [PATH_ASSIGNMENT_GET],
        produces = ["*/*"]
    )
    fun assignmentGet(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment id", required = true) @Valid @RequestParam(value = "assignmentId", required = true) assignmentId: kotlin.Long
    ): ResponseEntity<AssignmentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Assignments",
        operationId = "assignmentSearch",
        description = """Search for assignments by the given parameters.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AssignmentResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/assignment/search"
        value = [PATH_ASSIGNMENT_SEARCH],
        produces = ["*/*"]
    )
    fun assignmentSearch(
        @NotNull @Parameter(description = "the account sending the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "sort by table field", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ASSIGNEE_ID", "CREATOR_ID", "LOCATION_ID", "LOCATION_NAME", "CURRENT_STATUS", "CURRENT_STATUS_TYPE", "STATUSES"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "return results in descending order or not", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "return active results only or not", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "The record to begin the return set on", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The number of records to return", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the creator of the assignment") @Valid @RequestParam(value = "creatorAccountId", required = false) creatorAccountId: kotlin.Long?,
        @Parameter(description = "filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.") @Valid @RequestParam(value = "assigneeAccountIds", required = false) assigneeAccountIds: kotlin.String?,
        @Parameter(description = "filter results by retailer locations") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "filter results by assignment status", schema = Schema(allowableValues = ["NEW", "IN_PROGRESS", "SUBSCRIBED", "ARCHIVED"])) @Valid @RequestParam(value = "currentStatusType", required = false) currentStatusType: kotlin.String?,
        @Parameter(description = "filter results by keyword search that matches the assignee, creator, or retailer location name") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<AssignmentResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Assignment Status",
        operationId = "assignmentStatusCreate",
        description = """Create an assignment status.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssignmentStatusResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/assignment/status/create"
        value = [PATH_ASSIGNMENT_STATUS_CREATE],
        produces = ["*/*"]
    )
    fun assignmentStatusCreate(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment id", required = true) @Valid @RequestParam(value = "assignmentId", required = true) assignmentId: kotlin.Long,
        @Parameter(description = "the scheduled notification id for reminders") @Valid @RequestParam(value = "scheduledNotificationId", required = false) scheduledNotificationId: kotlin.Long?,
        @Parameter(description = "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT", schema = Schema(allowableValues = ["SITE_VISIT", "PHONE", "RECONTACT", "RENEWAL", "CREDIT"])) @Valid @RequestParam(value = "toDo", required = false) toDo: kotlin.String?,
        @Parameter(description = "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED", schema = Schema(allowableValues = ["INITIAL", "FOLLOW_UP", "DECLINED"])) @Valid @RequestParam(value = "connection", required = false) connection: kotlin.String?,
        @Parameter(description = "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL", schema = Schema(allowableValues = ["PHONE", "SITE_VISIT", "EMAIL"])) @Valid @RequestParam(value = "method", required = false) method: kotlin.String?,
        @Parameter(description = "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED", schema = Schema(allowableValues = ["ARCHIVED", "SUBSCRIBED", "UNSUBSCRIBED", "CONTACTED", "DECLINED", "NOT_CONTACTED"])) @Valid @RequestParam(value = "status", required = false) status: kotlin.String?,
        @Parameter(description = "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB", schema = Schema(allowableValues = ["PHONE", "SITE_VISIT", "PHONE_SITE", "WEB"])) @Valid @RequestParam(value = "closure", required = false) closure: kotlin.String?,
        @Parameter(description = "the message from the assignee") @Valid @RequestParam(value = "message", required = false) message: kotlin.String?,
        @Parameter(description = "the date to follow up by") @Valid @RequestParam(value = "followUp", required = false) followUp: kotlin.Long?,
        @Parameter(description = "determines whether the assignment status is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<AssignmentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Deletes Assignment Status",
        operationId = "assignmentStatusDelete",
        description = """Deletes an assignment status.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/assignment/status/delete"
        value = [PATH_ASSIGNMENT_STATUS_DELETE],
        produces = ["*/*"]
    )
    fun assignmentStatusDelete(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment status id", required = true) @Valid @RequestParam(value = "assignmentStatusId", required = true) assignmentStatusId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Assignment Status",
        operationId = "assignmentStatusGet",
        description = """Get an assignment status.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssignmentStatusResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/assignment/status/get"
        value = [PATH_ASSIGNMENT_STATUS_GET],
        produces = ["*/*"]
    )
    fun assignmentStatusGet(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment status id", required = true) @Valid @RequestParam(value = "assignmentStatusId", required = true) assignmentStatusId: kotlin.Long
    ): ResponseEntity<AssignmentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Assignment Statuses",
        operationId = "assignmentStatusSearch",
        description = """Search on assignment statuses.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AssignmentStatusResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/assignment/status/search"
        value = [PATH_ASSIGNMENT_STATUS_SEARCH],
        produces = ["*/*"]
    )
    fun assignmentStatusSearch(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ASSIGNEE_ID", "CREATOR_ID", "LOCATION_ID", "LOCATION_NAME", "CURRENT_STATUS", "CURRENT_STATUS_TYPE", "TODO", "CONNECTION", "METHOD", "STATUS", "CLOSURE", "MESSAGE", "FOLLOW_UP"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether to only return active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "the start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the assignment id") @Valid @RequestParam(value = "assignmentId", required = false) assignmentId: kotlin.Long?,
        @Parameter(description = "filter results by the account who created the status") @Valid @RequestParam(value = "creatorAccountId", required = false) creatorAccountId: kotlin.Long?,
        @Parameter(description = "filter results by the assignee account") @Valid @RequestParam(value = "assigneeAccountId", required = false) assigneeAccountId: kotlin.Long?,
        @Parameter(description = "filter results by by retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "filter results by the status type", schema = Schema(allowableValues = ["ARCHIVED", "SUBSCRIBED", "UNSUBSCRIBED", "CONTACTED", "DECLINED", "NOT_CONTACTED"])) @Valid @RequestParam(value = "statusType", required = false) statusType: kotlin.String?,
        @Parameter(description = "filter results by keyword search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<AssignmentStatusResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Assignment Status",
        operationId = "assignmentStatusUpdate",
        description = """Updates an assignment status.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssignmentStatusResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/assignment/status/update"
        value = [PATH_ASSIGNMENT_STATUS_UPDATE],
        produces = ["*/*"]
    )
    fun assignmentStatusUpdate(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment status id", required = true) @Valid @RequestParam(value = "assignmentStatusId", required = true) assignmentStatusId: kotlin.Long,
        @Parameter(description = "the scheduled notification id for reminders") @Valid @RequestParam(value = "scheduledNotificationId", required = false) scheduledNotificationId: kotlin.Long?,
        @Parameter(description = "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT", schema = Schema(allowableValues = ["SITE_VISIT", "PHONE", "RECONTACT", "RENEWAL", "CREDIT"])) @Valid @RequestParam(value = "toDo", required = false) toDo: kotlin.String?,
        @Parameter(description = "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED", schema = Schema(allowableValues = ["INITIAL", "FOLLOW_UP", "DECLINED"])) @Valid @RequestParam(value = "connection", required = false) connection: kotlin.String?,
        @Parameter(description = "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL", schema = Schema(allowableValues = ["PHONE", "SITE_VISIT", "EMAIL"])) @Valid @RequestParam(value = "method", required = false) method: kotlin.String?,
        @Parameter(description = "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED", schema = Schema(allowableValues = ["ARCHIVED", "SUBSCRIBED", "UNSUBSCRIBED", "CONTACTED", "DECLINED", "NOT_CONTACTED"])) @Valid @RequestParam(value = "status", required = false) status: kotlin.String?,
        @Parameter(description = "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB", schema = Schema(allowableValues = ["PHONE", "SITE_VISIT", "PHONE_SITE", "WEB"])) @Valid @RequestParam(value = "closure", required = false) closure: kotlin.String?,
        @Parameter(description = "the message from the assignee") @Valid @RequestParam(value = "message", required = false) message: kotlin.String?,
        @Parameter(description = "the date to follow up by") @Valid @RequestParam(value = "followUp", required = false) followUp: kotlin.Long?,
        @Parameter(description = "determines whether the assignment status is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<AssignmentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Assignment",
        operationId = "assignmentUpdate",
        description = """Updates an assignment.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssignmentResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/assignment/update"
        value = [PATH_ASSIGNMENT_UPDATE],
        produces = ["*/*"]
    )
    fun assignmentUpdate(
        @NotNull @Parameter(description = "the user account id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the assignment id", required = true) @Valid @RequestParam(value = "assignmentId", required = true) assignmentId: kotlin.Long,
        @Parameter(description = "the name of the assignment") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "the description of the assignment") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the account id to assign to") @Valid @RequestParam(value = "assigneeAccountId", required = false) assigneeAccountId: kotlin.Long?,
        @Parameter(description = "the retailer location id") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "the tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "determines whether the assignment is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<AssignmentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ASSIGMENT_ASSIGNEE_ACCOUNT_SEARCH: String = "/assignment/assignee/search"
        const val PATH_ASSIGNMENT_CREATE: String = "/assignment/create"
        const val PATH_ASSIGNMENT_DELETE: String = "/assignment/delete"
        const val PATH_ASSIGNMENT_GET: String = "/assignment/get"
        const val PATH_ASSIGNMENT_SEARCH: String = "/assignment/search"
        const val PATH_ASSIGNMENT_STATUS_CREATE: String = "/assignment/status/create"
        const val PATH_ASSIGNMENT_STATUS_DELETE: String = "/assignment/status/delete"
        const val PATH_ASSIGNMENT_STATUS_GET: String = "/assignment/status/get"
        const val PATH_ASSIGNMENT_STATUS_SEARCH: String = "/assignment/status/search"
        const val PATH_ASSIGNMENT_STATUS_UPDATE: String = "/assignment/status/update"
        const val PATH_ASSIGNMENT_UPDATE: String = "/assignment/update"
    }
}
