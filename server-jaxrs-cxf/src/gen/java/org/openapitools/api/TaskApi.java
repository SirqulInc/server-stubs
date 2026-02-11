package org.openapitools.api;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TaskResponse;

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
@Path("/task")
@Api(value = "/", description = "")
public interface TaskApi  {

    /**
     * Create Task
     *
     * Create a Task
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Task", tags={ "Task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public TaskResponse createTask(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("visibility") String visibility, @QueryParam("active") @DefaultValue("true")Boolean active);

    /**
     * Delete Task
     *
     * Delete a Task
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Task", tags={ "Task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteTask(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("taskId") @NotNull Long taskId);

    /**
     * Get Task
     *
     * Get a Task
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Task", tags={ "Task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public TaskResponse getTask(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("taskId") @NotNull Long taskId);

    /**
     * Search Tasks
     *
     * Search on Tasks
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tasks", tags={ "Task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class, responseContainer = "List") })
    public List<TaskResponse> searchTasks(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("groupingId") String groupingId, @QueryParam("filter") @DefaultValue("MINE")String filter, @QueryParam("statuses") @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING")String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") @DefaultValue("CREATED")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly);

    /**
     * Update Task
     *
     * Update a Task
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Task", tags={ "Task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public TaskResponse updateTask(@QueryParam("taskId") @NotNull Long taskId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active);
}
