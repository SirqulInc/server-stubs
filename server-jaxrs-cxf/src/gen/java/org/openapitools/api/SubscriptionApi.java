package org.openapitools.api;

import org.openapitools.model.ApplicationUsageResponse;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/subscription")
@Api(value = "/", description = "")
public interface SubscriptionApi  {

    /**
     * Create Subscription
     *
     * Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Subscription", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public SubscriptionResponse createSubscription(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("planId") Long planId, @QueryParam("promoCode") String promoCode);

    /**
     * Delete Subscription
     *
     * Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Subscription", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteSubscription(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Subscription
     *
     * Use the accountId to determine the associated BillableEntity.  Then get the subscription.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Subscription", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public SubscriptionResponse getSubscription(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Subscription Plan
     *
     * Get the matched subscription plan
     *
     */
    @GET
    @Path("/plan/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Subscription Plan", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class) })
    public SubscriptionPlanResponse getSubscriptionPlan(@PathParam("version") BigDecimal version, @QueryParam("planId") @NotNull Long planId);

    /**
     * List Subscription Plans
     *
     * Get the matched subscription plan
     *
     */
    @GET
    @Path("/plan/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Subscription Plans", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class, responseContainer = "List") })
    public List<SubscriptionPlanResponse> getSubscriptionPlans(@PathParam("version") BigDecimal version, @QueryParam("visible") Boolean visible, @QueryParam("role") String role);

    /**
     * Get Subscription Usage
     *
     * Use the accountId to determine the associated BillableEntity.  Then get the application usage.
     *
     */
    @GET
    @Path("/usage/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Subscription Usage", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationUsageResponse.class) })
    public ApplicationUsageResponse getSubscriptionUsage(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("start") Long start, @QueryParam("end") Long end);

    /**
     * Update Subscription
     *
     * Updates the subscription for the billable entity for an account
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Subscription", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public SubscriptionResponse updateSubscription(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("planId") Long planId, @QueryParam("promoCode") String promoCode, @QueryParam("active") Boolean active);
}
