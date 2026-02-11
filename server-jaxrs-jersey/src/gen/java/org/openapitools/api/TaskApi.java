package org.openapitools.api;

import org.openapitools.api.TaskApiService;
import org.openapitools.api.factories.TaskApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TaskResponse;

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

@Path("/task")


@io.swagger.annotations.Api(description = "the task API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TaskApi  {
   private final TaskApiService delegate;

   public TaskApi(@Context ServletConfig servletContext) {
      TaskApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TaskApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TaskApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TaskApiServiceFactory.getTaskApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Task", notes = "Create a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class)
    })
    public Response createTask(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the task", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The application to target") @QueryParam("appKey")  String appKey,@ApiParam(value = "Client defined identifier for grouping tasks") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "The URL for making an HTTP call") @QueryParam("endpointURL")  String endpointURL,@ApiParam(value = "The parameters for making an HTTP call") @QueryParam("payload")  String payload,@ApiParam(value = "The date and time of the task") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "The starting date of the task") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The ending date of the task") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The cron expression that represents the task's schedule") @QueryParam("cronExpression")  String cronExpression,@ApiParam(value = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "Sets whether the Task is active or not (inactive Tasks are not processed)", defaultValue = "true") @DefaultValue("true") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTask(accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, visibility, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Task", notes = "Delete a Task", response = SirqulResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteTask(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the Task to delete.", required = true) @QueryParam("taskId") @NotNull  Long taskId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTask(accountId, taskId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Task", notes = "Get a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class)
    })
    public Response getTask(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the Task to return.", required = true) @QueryParam("taskId") @NotNull  Long taskId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTask(accountId, taskId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tasks", notes = "Search on Tasks", response = TaskResponse.class, responseContainer = "List", tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class, responseContainer = "List")
    })
    public Response searchTasks(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Filter results by a grouping identifier defined by the client") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user''s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks ", defaultValue = "MINE") @DefaultValue("MINE") @QueryParam("filter")  String filter,@ApiParam(value = "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE", defaultValue = "NEW,ERROR,COMPLETE,PROCESSING") @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING") @QueryParam("statuses")  String statuses,@ApiParam(value = "Template Types") @QueryParam("templateTypes")  String templateTypes,@ApiParam(value = "Filter the list by a specific application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Keyword search on the task names.") @QueryParam("keyword")  String keyword,@ApiParam(value = "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE", defaultValue = "CREATED") @DefaultValue("CREATED") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Start the result set at some index.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active results", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchTasks(accountId, groupingId, filter, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Task", notes = "Update a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class)
    })
    public Response updateTask(@ApiParam(value = "Task Id", required = true) @QueryParam("taskId") @NotNull  Long taskId,@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the task") @QueryParam("name")  String name,@ApiParam(value = "The application to target") @QueryParam("appKey")  String appKey,@ApiParam(value = "Client defined identifier for grouping tasks") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "The URL for making an HTTP call") @QueryParam("endpointURL")  String endpointURL,@ApiParam(value = "The parameters for making an HTTP call") @QueryParam("payload")  String payload,@ApiParam(value = "The date and time of the task") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "The starting date of the task") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The ending date of the task") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The cron expression that represents the task's schedule") @QueryParam("cronExpression")  String cronExpression,@ApiParam(value = "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "Sets whether the Task is active or not (inactive Tasks are not processed)") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTask(taskId, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, visibility, active, securityContext);
    }
}
