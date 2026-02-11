package org.openapitools.api

import org.openapitools.model.ApplicationUsageResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.SubscriptionPlanResponse
import org.openapitools.model.SubscriptionResponse
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
class SubscriptionApiController() {

    @Operation(
        summary = "Create Subscription",
        operationId = "createSubscription",
        description = """Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SubscriptionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/subscription/create"
        value = [PATH_CREATE_SUBSCRIPTION],
        produces = ["*/*"]
    )
    fun createSubscription(
        @NotNull @Parameter(description = "The account used to perform the create, must be the responsible manager", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The plan to subscribe to, if null use default plan") @Valid @RequestParam(value = "planId", required = false) planId: kotlin.Long?,
        @Parameter(description = "Set a promo code for a discount.") @Valid @RequestParam(value = "promoCode", required = false) promoCode: kotlin.String?
    ): ResponseEntity<SubscriptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Subscription",
        operationId = "deleteSubscription",
        description = """Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/subscription/delete"
        value = [PATH_DELETE_SUBSCRIPTION],
        produces = ["*/*"]
    )
    fun deleteSubscription(
        @NotNull @Parameter(description = "The account used to perform the delete, must be the responsible manager", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Subscription",
        operationId = "getSubscription",
        description = """Use the accountId to determine the associated BillableEntity.  Then get the subscription.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SubscriptionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/subscription/get"
        value = [PATH_GET_SUBSCRIPTION],
        produces = ["*/*"]
    )
    fun getSubscription(
        @NotNull @Parameter(description = "The account used to perform the lookup", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<SubscriptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Subscription Plan",
        operationId = "getSubscriptionPlan",
        description = """Get the matched subscription plan""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SubscriptionPlanResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/subscription/plan/get"
        value = [PATH_GET_SUBSCRIPTION_PLAN],
        produces = ["*/*"]
    )
    fun getSubscriptionPlan(
        @NotNull @Parameter(description = "The ID of the plan to get", required = true) @Valid @RequestParam(value = "planId", required = true) planId: kotlin.Long
    ): ResponseEntity<SubscriptionPlanResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Subscription Plans",
        operationId = "getSubscriptionPlans",
        description = """Get the matched subscription plan""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = SubscriptionPlanResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/subscription/plan/list"
        value = [PATH_GET_SUBSCRIPTION_PLANS],
        produces = ["*/*"]
    )
    fun getSubscriptionPlans(
        @Parameter(description = "Include visible only (true), hidden only (false), or all (null)") @Valid @RequestParam(value = "visible", required = false) visible: kotlin.Boolean?,
        @Parameter(description = "The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?
    ): ResponseEntity<List<SubscriptionPlanResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Subscription Usage",
        operationId = "getSubscriptionUsage",
        description = """Use the accountId to determine the associated BillableEntity.  Then get the application usage.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationUsageResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/subscription/usage/get"
        value = [PATH_GET_SUBSCRIPTION_USAGE],
        produces = ["*/*"]
    )
    fun getSubscriptionUsage(
        @NotNull @Parameter(description = "The account used to perform the lookup", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Get for just 1 application instead of the BillableEntity") @Valid @RequestParam(value = "applicationId", required = false) applicationId: kotlin.Long?,
        @Parameter(description = "The start time frame") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "The end time frame") @Valid @RequestParam(value = "end", required = false) end: kotlin.Long?
    ): ResponseEntity<ApplicationUsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Subscription",
        operationId = "updateSubscription",
        description = """Updates the subscription for the billable entity for an account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SubscriptionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/subscription/update"
        value = [PATH_UPDATE_SUBSCRIPTION],
        produces = ["*/*"]
    )
    fun updateSubscription(
        @NotNull @Parameter(description = "The account used to perform the update, must be the responsible manager", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The plan to subscribe to") @Valid @RequestParam(value = "planId", required = false) planId: kotlin.Long?,
        @Parameter(description = "Set a promo code for a discount.") @Valid @RequestParam(value = "promoCode", required = false) promoCode: kotlin.String?,
        @Parameter(description = "Set active status") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<SubscriptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_SUBSCRIPTION: String = "/subscription/create"
        const val PATH_DELETE_SUBSCRIPTION: String = "/subscription/delete"
        const val PATH_GET_SUBSCRIPTION: String = "/subscription/get"
        const val PATH_GET_SUBSCRIPTION_PLAN: String = "/subscription/plan/get"
        const val PATH_GET_SUBSCRIPTION_PLANS: String = "/subscription/plan/list"
        const val PATH_GET_SUBSCRIPTION_USAGE: String = "/subscription/usage/get"
        const val PATH_UPDATE_SUBSCRIPTION: String = "/subscription/update"
    }
}
