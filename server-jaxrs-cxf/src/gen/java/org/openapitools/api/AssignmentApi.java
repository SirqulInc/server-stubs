package org.openapitools.api;

import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;

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
@Path("/api/{version}/assignment")
@Api(value = "/", description = "")
public interface AssignmentApi  {

    /**
     * Search Assignment Assignees
     *
     * Search for avaiable users for creating or updating assignment.
     *
     */
    @GET
    @Path("/assignee/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Assignment Assignees", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List") })
    public List<AccountMiniResponse> assigmentAssigneeAccountSearch(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("keyword") String keyword);

    /**
     * Create Assignment
     *
     * Create an assignment.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Assignment", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public AssignmentResponse assignmentCreate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("assigneeAccountId") @NotNull Long assigneeAccountId, @QueryParam("description") String description, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("tags") String tags, @QueryParam("active") Boolean active);

    /**
     * Delete Assignment
     *
     * Delete an assignment.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Assignment", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse assignmentDelete(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentId") @NotNull Long assignmentId);

    /**
     * Get Assignment
     *
     * Get the details of an assignment.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Assignment", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public AssignmentResponse assignmentGet(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentId") @NotNull Long assignmentId);

    /**
     * Search Assignments
     *
     * Search for assignments by the given parameters.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Assignments", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class, responseContainer = "List") })
    public List<AssignmentResponse> assignmentSearch(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("creatorAccountId") Long creatorAccountId, @QueryParam("assigneeAccountIds") String assigneeAccountIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("currentStatusType") String currentStatusType, @QueryParam("keyword") String keyword);

    /**
     * Create Assignment Status
     *
     * Create an assignment status.
     *
     */
    @POST
    @Path("/status/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Assignment Status", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public AssignmentStatusResponse assignmentStatusCreate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentId") @NotNull Long assignmentId, @QueryParam("scheduledNotificationId") Long scheduledNotificationId, @QueryParam("toDo") String toDo, @QueryParam("connection") String connection, @QueryParam("method") String method, @QueryParam("status") String status, @QueryParam("closure") String closure, @QueryParam("message") String message, @QueryParam("followUp") Long followUp, @QueryParam("active") Boolean active);

    /**
     * Deletes Assignment Status
     *
     * Deletes an assignment status.
     *
     */
    @POST
    @Path("/status/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Deletes Assignment Status", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse assignmentStatusDelete(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentStatusId") @NotNull Long assignmentStatusId);

    /**
     * Get Assignment Status
     *
     * Get an assignment status.
     *
     */
    @GET
    @Path("/status/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Assignment Status", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public AssignmentStatusResponse assignmentStatusGet(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentStatusId") @NotNull Long assignmentStatusId);

    /**
     * Search Assignment Statuses
     *
     * Search on assignment statuses.
     *
     */
    @GET
    @Path("/status/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Assignment Statuses", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class, responseContainer = "List") })
    public List<AssignmentStatusResponse> assignmentStatusSearch(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("assignmentId") Long assignmentId, @QueryParam("creatorAccountId") Long creatorAccountId, @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("statusType") String statusType, @QueryParam("keyword") String keyword);

    /**
     * Update Assignment Status
     *
     * Updates an assignment status.
     *
     */
    @POST
    @Path("/status/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Assignment Status", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public AssignmentStatusResponse assignmentStatusUpdate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentStatusId") @NotNull Long assignmentStatusId, @QueryParam("scheduledNotificationId") Long scheduledNotificationId, @QueryParam("toDo") String toDo, @QueryParam("connection") String connection, @QueryParam("method") String method, @QueryParam("status") String status, @QueryParam("closure") String closure, @QueryParam("message") String message, @QueryParam("followUp") Long followUp, @QueryParam("active") Boolean active);

    /**
     * Update Assignment
     *
     * Updates an assignment.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Assignment", tags={ "Assignment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public AssignmentResponse assignmentUpdate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("assignmentId") @NotNull Long assignmentId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("tags") String tags, @QueryParam("active") Boolean active);
}
