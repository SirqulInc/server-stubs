package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SubscriptionApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApplicationUsageResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/subscription")


@io.swagger.annotations.Api(description = "the subscription API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionApi  {

    @Inject SubscriptionApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Subscription", notes = "Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public Response createSubscription( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("planId") Long planId, @QueryParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSubscription(accountId,planId,promoCode,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Subscription", notes = "Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action", response = SirqulResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteSubscription( @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteSubscription(accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription", notes = "Use the accountId to determine the associated BillableEntity.  Then get the subscription.", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public Response getSubscription( @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscription(accountId,securityContext);
    }
    @GET
    @Path("/plan/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription Plan", notes = "Get the matched subscription plan", response = SubscriptionPlanResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class) })
    public Response getSubscriptionPlan( @NotNull @QueryParam("planId") Long planId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionPlan(planId,securityContext);
    }
    @GET
    @Path("/plan/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Subscription Plans", notes = "Get the matched subscription plan", response = SubscriptionPlanResponse.class, responseContainer = "List", tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class, responseContainer = "List") })
    public Response getSubscriptionPlans( @QueryParam("visible") Boolean visible, @QueryParam("role") String role,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionPlans(visible,role,securityContext);
    }
    @GET
    @Path("/usage/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription Usage", notes = "Use the accountId to determine the associated BillableEntity.  Then get the application usage.", response = ApplicationUsageResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationUsageResponse.class) })
    public Response getSubscriptionUsage( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("start") Long start, @QueryParam("end") Long end,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionUsage(accountId,applicationId,start,end,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Subscription", notes = "Updates the subscription for the billable entity for an account", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public Response updateSubscription( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("planId") Long planId, @QueryParam("promoCode") String promoCode, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSubscription(accountId,planId,promoCode,active,securityContext);
    }
}
