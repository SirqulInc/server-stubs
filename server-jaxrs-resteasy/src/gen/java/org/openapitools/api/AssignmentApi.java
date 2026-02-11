package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AssignmentApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/assignment")


@io.swagger.annotations.Api(description = "the assignment API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentApi  {

    @Inject AssignmentApiService service;

    @GET
    @Path("/assignee/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignment Assignees", notes = "Search for avaiable users for creating or updating assignment.", response = AccountMiniResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List") })
    public Response assigmentAssigneeAccountSearch( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assigmentAssigneeAccountSearch(accountId,keyword,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Assignment", notes = "Create an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public Response assignmentCreate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("description") String description, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("tags") String tags, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentCreate(accountId,name,assigneeAccountId,description,retailerLocationId,tags,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Assignment", notes = "Delete an assignment.", response = SirqulResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assignmentDelete( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentDelete(accountId,assignmentId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Assignment", notes = "Get the details of an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public Response assignmentGet( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentGet(accountId,assignmentId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignments", notes = "Search for assignments by the given parameters.", response = AssignmentResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class, responseContainer = "List") })
    public Response assignmentSearch( @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, STATUSES" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("creatorAccountId") Long creatorAccountId, @QueryParam("assigneeAccountIds") String assigneeAccountIds, @QueryParam("retailerLocationIds") String retailerLocationIds,, allowableValues="NEW, IN_PROGRESS, SUBSCRIBED, ARCHIVED" @QueryParam("currentStatusType") String currentStatusType, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentSearch(accountId,sortField,descending,activeOnly,start,limit,creatorAccountId,assigneeAccountIds,retailerLocationIds,currentStatusType,keyword,securityContext);
    }
    @POST
    @Path("/status/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Assignment Status", notes = "Create an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public Response assignmentStatusCreate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId, @QueryParam("scheduledNotificationId") Long scheduledNotificationId,, allowableValues="SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT" @QueryParam("toDo") String toDo,, allowableValues="INITIAL, FOLLOW_UP, DECLINED" @QueryParam("connection") String connection,, allowableValues="PHONE, SITE_VISIT, EMAIL" @QueryParam("method") String method,, allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED" @QueryParam("status") String status,, allowableValues="PHONE, SITE_VISIT, PHONE_SITE, WEB" @QueryParam("closure") String closure, @QueryParam("message") String message, @QueryParam("followUp") Long followUp, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusCreate(accountId,assignmentId,scheduledNotificationId,toDo,connection,method,status,closure,message,followUp,active,securityContext);
    }
    @POST
    @Path("/status/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Deletes Assignment Status", notes = "Deletes an assignment status.", response = SirqulResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assignmentStatusDelete( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentStatusId") Long assignmentStatusId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusDelete(accountId,assignmentStatusId,securityContext);
    }
    @GET
    @Path("/status/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Assignment Status", notes = "Get an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public Response assignmentStatusGet( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentStatusId") Long assignmentStatusId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusGet(accountId,assignmentStatusId,securityContext);
    }
    @GET
    @Path("/status/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignment Statuses", notes = "Search on assignment statuses.", response = AssignmentStatusResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class, responseContainer = "List") })
    public Response assignmentStatusSearch( @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("assignmentId") Long assignmentId, @QueryParam("creatorAccountId") Long creatorAccountId, @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED" @QueryParam("statusType") String statusType, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusSearch(accountId,sortField,descending,activeOnly,start,limit,assignmentId,creatorAccountId,assigneeAccountId,retailerLocationId,statusType,keyword,securityContext);
    }
    @POST
    @Path("/status/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Assignment Status", notes = "Updates an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public Response assignmentStatusUpdate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentStatusId") Long assignmentStatusId, @QueryParam("scheduledNotificationId") Long scheduledNotificationId,, allowableValues="SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT" @QueryParam("toDo") String toDo,, allowableValues="INITIAL, FOLLOW_UP, DECLINED" @QueryParam("connection") String connection,, allowableValues="PHONE, SITE_VISIT, EMAIL" @QueryParam("method") String method,, allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED" @QueryParam("status") String status,, allowableValues="PHONE, SITE_VISIT, PHONE_SITE, WEB" @QueryParam("closure") String closure, @QueryParam("message") String message, @QueryParam("followUp") Long followUp, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusUpdate(accountId,assignmentStatusId,scheduledNotificationId,toDo,connection,method,status,closure,message,followUp,active,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Assignment", notes = "Updates an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public Response assignmentUpdate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("tags") String tags, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentUpdate(accountId,assignmentId,name,description,assigneeAccountId,retailerLocationId,tags,active,securityContext);
    }
}
