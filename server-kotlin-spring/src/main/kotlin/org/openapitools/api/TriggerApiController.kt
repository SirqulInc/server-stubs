package org.openapitools.api

import org.openapitools.model.SirqulResponse
import org.openapitools.model.TriggerResponse
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
class TriggerApiController() {

    @Operation(
        summary = "Create Trigger",
        operationId = "createTrigger",
        description = """Create a trigger""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TriggerResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trigger/create"
        value = [PATH_CREATE_TRIGGER],
        produces = ["*/*"]
    )
    fun createTrigger(
        @NotNull @Parameter(description = "The logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the trigger", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The application to target") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Client defined identifier for grouping triggers") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "The URL for making an HTTP call") @Valid @RequestParam(value = "endpointURL", required = false) endpointURL: kotlin.String?,
        @Parameter(description = "The parameters for making an HTTP call") @Valid @RequestParam(value = "payload", required = false) payload: kotlin.String?,
        @Parameter(description = "The date and time of the next trigger") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "The starting date of the trigger") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The ending date of the trigger") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The cron expression that represents the trigger's schedule") @Valid @RequestParam(value = "cronExpression", required = false) cronExpression: kotlin.String?,
        @Parameter(description = "Json input representing conditional logic that has to be met before running the trigger") @Valid @RequestParam(value = "conditionalInput", required = false) conditionalInput: kotlin.String?,
        @Parameter(description = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the Trigger is active or not (inactive Triggers are not processed)", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "active", required = false, defaultValue = "true") active: kotlin.Boolean
    ): ResponseEntity<TriggerResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Trigger",
        operationId = "deleteTrigger",
        description = """Mark a trigger as deleted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trigger/delete"
        value = [PATH_DELETE_TRIGGER],
        produces = ["*/*"]
    )
    fun deleteTrigger(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the trigger to delete.", required = true) @Valid @RequestParam(value = "triggerId", required = true) triggerId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Trigger",
        operationId = "getTrigger",
        description = """Get a trigger""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TriggerResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trigger/get"
        value = [PATH_GET_TRIGGER],
        produces = ["*/*"]
    )
    fun getTrigger(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the Trigger to return.", required = true) @Valid @RequestParam(value = "triggerId", required = true) triggerId: kotlin.Long
    ): ResponseEntity<TriggerResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Triggers",
        operationId = "searchTriggers",
        description = """Search for triggers""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = TriggerResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trigger/search"
        value = [PATH_SEARCH_TRIGGERS],
        produces = ["*/*"]
    )
    fun searchTriggers(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Filter results by a grouping identifier defined by the client") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "A comma separated list of filters. * MINE - Return triggers that the user has created * SHARED - Return triggers that have been shared to the user * FOLLOWER - Return triggers that have been created by the user''s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return triggers that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC triggers that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC triggers regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all triggers that the user has liked * FEATURED - Return all triggers that have been featured * PENDING - Return all pending triggers ", schema = Schema(defaultValue = "MINE")) @Valid @RequestParam(value = "filter", required = false, defaultValue = "MINE") filter: kotlin.String,
        @Parameter(description = "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE", schema = Schema(defaultValue = "NEW,ERROR,COMPLETE,PROCESSING")) @Valid @RequestParam(value = "statuses", required = false, defaultValue = "NEW,ERROR,COMPLETE,PROCESSING") statuses: kotlin.String,
        @Parameter(description = "Template Types") @Valid @RequestParam(value = "templateTypes", required = false) templateTypes: kotlin.String?,
        @Parameter(description = "Filter the list by a specific application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Keyword search on the trigger names.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE", schema = Schema(defaultValue = "CREATED")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "CREATED") sortField: kotlin.String,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "Start the result set at some index.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "Limit the result to some number.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active results", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<TriggerResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Trigger",
        operationId = "updateTrigger",
        description = """Update a trigger""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TriggerResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trigger/update"
        value = [PATH_UPDATE_TRIGGER],
        produces = ["*/*"]
    )
    fun updateTrigger(
        @NotNull @Parameter(description = "The trigger to update", required = true) @Valid @RequestParam(value = "triggerId", required = true) triggerId: kotlin.Long,
        @NotNull @Parameter(description = "The logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The name of the trigger") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The application to target") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Client defined identifier for grouping triggers") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "The URL for making an HTTP call") @Valid @RequestParam(value = "endpointURL", required = false) endpointURL: kotlin.String?,
        @Parameter(description = "The parameters for making an HTTP call") @Valid @RequestParam(value = "payload", required = false) payload: kotlin.String?,
        @Parameter(description = "The date and time of the next trigger") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "The starting date of the trigger") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The ending date of the trigger") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The cron expression that represents the trigger's schedule") @Valid @RequestParam(value = "cronExpression", required = false) cronExpression: kotlin.String?,
        @Parameter(description = "Json input representing conditional logic that has to be met before running the trigger") @Valid @RequestParam(value = "conditionalInput", required = false) conditionalInput: kotlin.String?,
        @Parameter(description = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the Trigger is active or not (inactive Triggers are not processed)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<TriggerResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_TRIGGER: String = "/trigger/create"
        const val PATH_DELETE_TRIGGER: String = "/trigger/delete"
        const val PATH_GET_TRIGGER: String = "/trigger/get"
        const val PATH_SEARCH_TRIGGERS: String = "/trigger/search"
        const val PATH_UPDATE_TRIGGER: String = "/trigger/update"
    }
}
