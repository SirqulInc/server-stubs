package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TaskApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TaskResponse;

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

@Path("/task")


@io.swagger.annotations.Api(description = "the task API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TaskApi  {

    @Inject TaskApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Task", notes = "Create a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public Response createTask( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @DefaultValue("true") @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTask(accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,visibility,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Task", notes = "Delete a Task", response = SirqulResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTask( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("taskId") Long taskId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTask(accountId,taskId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Task", notes = "Get a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public Response getTask( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("taskId") Long taskId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTask(accountId,taskId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tasks", notes = "Search on Tasks", response = TaskResponse.class, responseContainer = "List", tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class, responseContainer = "List") })
    public Response searchTasks( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("groupingId") String groupingId, @DefaultValue("MINE") @QueryParam("filter") String filter, @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING") @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTasks(accountId,groupingId,filter,statuses,templateTypes,appKey,keyword,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Task", notes = "Update a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public Response updateTask( @NotNull @QueryParam("taskId") Long taskId, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTask(taskId,accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,visibility,active,securityContext);
    }
}
