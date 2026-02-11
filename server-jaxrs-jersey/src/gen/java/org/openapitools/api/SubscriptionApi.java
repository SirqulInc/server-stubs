package org.openapitools.api;

import org.openapitools.api.SubscriptionApiService;
import org.openapitools.api.factories.SubscriptionApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/subscription")


@io.swagger.annotations.Api(description = "the subscription API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionApi  {
   private final SubscriptionApiService delegate;

   public SubscriptionApi(@Context ServletConfig servletContext) {
      SubscriptionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SubscriptionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SubscriptionApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = SubscriptionApiServiceFactory.getSubscriptionApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Subscription", notes = "Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class)
    })
    public Response createSubscription(@ApiParam(value = "The account used to perform the create, must be the responsible manager", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The plan to subscribe to, if null use default plan") @QueryParam("planId")  Long planId,@ApiParam(value = "Set a promo code for a discount.") @QueryParam("promoCode")  String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createSubscription(accountId, planId, promoCode, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Subscription", notes = "Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action", response = SirqulResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteSubscription(@ApiParam(value = "The account used to perform the delete, must be the responsible manager", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteSubscription(accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription", notes = "Use the accountId to determine the associated BillableEntity.  Then get the subscription.", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class)
    })
    public Response getSubscription(@ApiParam(value = "The account used to perform the lookup", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSubscription(accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/plan/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription Plan", notes = "Get the matched subscription plan", response = SubscriptionPlanResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class)
    })
    public Response getSubscriptionPlan(@ApiParam(value = "The ID of the plan to get", required = true) @QueryParam("planId") @NotNull  Long planId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSubscriptionPlan(planId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/plan/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Subscription Plans", notes = "Get the matched subscription plan", response = SubscriptionPlanResponse.class, responseContainer = "List", tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class, responseContainer = "List")
    })
    public Response getSubscriptionPlans(@ApiParam(value = "Include visible only (true), hidden only (false), or all (null)") @QueryParam("visible")  Boolean visible,@ApiParam(value = "The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER") @QueryParam("role")  String role,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSubscriptionPlans(visible, role, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/usage/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription Usage", notes = "Use the accountId to determine the associated BillableEntity.  Then get the application usage.", response = ApplicationUsageResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationUsageResponse.class)
    })
    public Response getSubscriptionUsage(@ApiParam(value = "The account used to perform the lookup", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Get for just 1 application instead of the BillableEntity") @QueryParam("applicationId")  Long applicationId,@ApiParam(value = "The start time frame") @QueryParam("start")  Long start,@ApiParam(value = "The end time frame") @QueryParam("end")  Long end,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSubscriptionUsage(accountId, applicationId, start, end, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Subscription", notes = "Updates the subscription for the billable entity for an account", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class)
    })
    public Response updateSubscription(@ApiParam(value = "The account used to perform the update, must be the responsible manager", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The plan to subscribe to") @QueryParam("planId")  Long planId,@ApiParam(value = "Set a promo code for a discount.") @QueryParam("promoCode")  String promoCode,@ApiParam(value = "Set active status") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateSubscription(accountId, planId, promoCode, active, securityContext);
    }
}
