package org.openapitools.api;

import org.openapitools.api.TriggerApiService;
import org.openapitools.api.factories.TriggerApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TriggerResponse;

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

@Path("/trigger")


@io.swagger.annotations.Api(description = "the trigger API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TriggerApi  {
   private final TriggerApiService delegate;

   public TriggerApi(@Context ServletConfig servletContext) {
      TriggerApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TriggerApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TriggerApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TriggerApiServiceFactory.getTriggerApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trigger", notes = "Create a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class)
    })
    public Response createTrigger(@ApiParam(value = "The logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the trigger", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The application to target") @QueryParam("appKey")  String appKey,@ApiParam(value = "Client defined identifier for grouping triggers") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "The URL for making an HTTP call") @QueryParam("endpointURL")  String endpointURL,@ApiParam(value = "The parameters for making an HTTP call") @QueryParam("payload")  String payload,@ApiParam(value = "The date and time of the next trigger") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "The starting date of the trigger") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The ending date of the trigger") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The cron expression that represents the trigger's schedule") @QueryParam("cronExpression")  String cronExpression,@ApiParam(value = "Json input representing conditional logic that has to be met before running the trigger") @QueryParam("conditionalInput")  String conditionalInput,@ApiParam(value = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "Sets whether the Trigger is active or not (inactive Triggers are not processed)", defaultValue = "true") @DefaultValue("true") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTrigger(accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Trigger", notes = "Mark a trigger as deleted.", response = SirqulResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteTrigger(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the trigger to delete.", required = true) @QueryParam("triggerId") @NotNull  Long triggerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTrigger(accountId, triggerId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trigger", notes = "Get a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class)
    })
    public Response getTrigger(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the Trigger to return.", required = true) @QueryParam("triggerId") @NotNull  Long triggerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTrigger(accountId, triggerId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Triggers", notes = "Search for triggers", response = TriggerResponse.class, responseContainer = "List", tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class, responseContainer = "List")
    })
    public Response searchTriggers(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Filter results by a grouping identifier defined by the client") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "A comma separated list of filters. * MINE - Return triggers that the user has created * SHARED - Return triggers that have been shared to the user * FOLLOWER - Return triggers that have been created by the user''s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return triggers that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC triggers that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC triggers regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all triggers that the user has liked * FEATURED - Return all triggers that have been featured * PENDING - Return all pending triggers ", defaultValue = "MINE") @DefaultValue("MINE") @QueryParam("filter")  String filter,@ApiParam(value = "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE", defaultValue = "NEW,ERROR,COMPLETE,PROCESSING") @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING") @QueryParam("statuses")  String statuses,@ApiParam(value = "Template Types") @QueryParam("templateTypes")  String templateTypes,@ApiParam(value = "Filter the list by a specific application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Keyword search on the trigger names.") @QueryParam("keyword")  String keyword,@ApiParam(value = "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE", defaultValue = "CREATED") @DefaultValue("CREATED") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Start the result set at some index.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active results", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchTriggers(accountId, groupingId, filter, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trigger", notes = "Update a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class)
    })
    public Response updateTrigger(@ApiParam(value = "The trigger to update", required = true) @QueryParam("triggerId") @NotNull  Long triggerId,@ApiParam(value = "The logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the trigger") @QueryParam("name")  String name,@ApiParam(value = "The application to target") @QueryParam("appKey")  String appKey,@ApiParam(value = "Client defined identifier for grouping triggers") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "The URL for making an HTTP call") @QueryParam("endpointURL")  String endpointURL,@ApiParam(value = "The parameters for making an HTTP call") @QueryParam("payload")  String payload,@ApiParam(value = "The date and time of the next trigger") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "The starting date of the trigger") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The ending date of the trigger") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The cron expression that represents the trigger's schedule") @QueryParam("cronExpression")  String cronExpression,@ApiParam(value = "Json input representing conditional logic that has to be met before running the trigger") @QueryParam("conditionalInput")  String conditionalInput,@ApiParam(value = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "Sets whether the Trigger is active or not (inactive Triggers are not processed)") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTrigger(triggerId, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active, securityContext);
    }
}
