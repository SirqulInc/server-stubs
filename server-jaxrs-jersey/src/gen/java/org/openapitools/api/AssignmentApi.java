package org.openapitools.api;

import org.openapitools.api.AssignmentApiService;
import org.openapitools.api.factories.AssignmentApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/assignment")


@io.swagger.annotations.Api(description = "the assignment API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentApi  {
   private final AssignmentApiService delegate;

   public AssignmentApi(@Context ServletConfig servletContext) {
      AssignmentApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AssignmentApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AssignmentApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AssignmentApiServiceFactory.getAssignmentApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/assignee/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignment Assignees", notes = "Search for avaiable users for creating or updating assignment.", response = AccountMiniResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List")
    })
    public Response assigmentAssigneeAccountSearch(@ApiParam(value = "The account id sending the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The keyword to filter the returned results") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assigmentAssigneeAccountSearch(accountId, keyword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Assignment", notes = "Create an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class)
    })
    public Response assignmentCreate(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the name for the assignment", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "the account id to assign to", required = true) @QueryParam("assigneeAccountId") @NotNull  Long assigneeAccountId,@ApiParam(value = "the desciprtion for the assignment") @QueryParam("description")  String description,@ApiParam(value = "the retailer location id") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "the tags") @QueryParam("tags")  String tags,@ApiParam(value = "determines whether the assignment is active or inactive") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentCreate(accountId, name, assigneeAccountId, description, retailerLocationId, tags, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Assignment", notes = "Delete an assignment.", response = SirqulResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response assignmentDelete(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment id", required = true) @QueryParam("assignmentId") @NotNull  Long assignmentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentDelete(accountId, assignmentId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Assignment", notes = "Get the details of an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class)
    })
    public Response assignmentGet(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment id", required = true) @QueryParam("assignmentId") @NotNull  Long assignmentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentGet(accountId, assignmentId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignments", notes = "Search for assignments by the given parameters.", response = AssignmentResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class, responseContainer = "List")
    })
    public Response assignmentSearch(@ApiParam(value = "the account sending the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "sort by table field", required = true, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, STATUSES") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "return results in descending order or not", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "return active results only or not", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The record to begin the return set on", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The number of records to return", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the creator of the assignment") @QueryParam("creatorAccountId")  Long creatorAccountId,@ApiParam(value = "filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.") @QueryParam("assigneeAccountIds")  String assigneeAccountIds,@ApiParam(value = "filter results by retailer locations") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "filter results by assignment status", allowableValues="NEW, IN_PROGRESS, SUBSCRIBED, ARCHIVED") @QueryParam("currentStatusType")  String currentStatusType,@ApiParam(value = "filter results by keyword search that matches the assignee, creator, or retailer location name") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentSearch(accountId, sortField, descending, activeOnly, start, limit, creatorAccountId, assigneeAccountIds, retailerLocationIds, currentStatusType, keyword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/status/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Assignment Status", notes = "Create an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class)
    })
    public Response assignmentStatusCreate(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment id", required = true) @QueryParam("assignmentId") @NotNull  Long assignmentId,@ApiParam(value = "the scheduled notification id for reminders") @QueryParam("scheduledNotificationId")  Long scheduledNotificationId,@ApiParam(value = "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT", allowableValues="SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT") @QueryParam("toDo")  String toDo,@ApiParam(value = "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED", allowableValues="INITIAL, FOLLOW_UP, DECLINED") @QueryParam("connection")  String connection,@ApiParam(value = "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL", allowableValues="PHONE, SITE_VISIT, EMAIL") @QueryParam("method")  String method,@ApiParam(value = "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED", allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED") @QueryParam("status")  String status,@ApiParam(value = "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB", allowableValues="PHONE, SITE_VISIT, PHONE_SITE, WEB") @QueryParam("closure")  String closure,@ApiParam(value = "the message from the assignee") @QueryParam("message")  String message,@ApiParam(value = "the date to follow up by") @QueryParam("followUp")  Long followUp,@ApiParam(value = "determines whether the assignment status is active or inactive") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentStatusCreate(accountId, assignmentId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/status/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Deletes Assignment Status", notes = "Deletes an assignment status.", response = SirqulResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response assignmentStatusDelete(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment status id", required = true) @QueryParam("assignmentStatusId") @NotNull  Long assignmentStatusId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentStatusDelete(accountId, assignmentStatusId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/status/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Assignment Status", notes = "Get an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class)
    })
    public Response assignmentStatusGet(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment status id", required = true) @QueryParam("assignmentStatusId") @NotNull  Long assignmentStatusId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentStatusGet(accountId, assignmentStatusId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/status/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignment Statuses", notes = "Search on assignment statuses.", response = AssignmentStatusResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class, responseContainer = "List")
    })
    public Response assignmentStatusSearch(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP", required = true, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "determines whether to only return active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "the start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the assignment id") @QueryParam("assignmentId")  Long assignmentId,@ApiParam(value = "filter results by the account who created the status") @QueryParam("creatorAccountId")  Long creatorAccountId,@ApiParam(value = "filter results by the assignee account") @QueryParam("assigneeAccountId")  Long assigneeAccountId,@ApiParam(value = "filter results by by retailer location") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "filter results by the status type", allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED") @QueryParam("statusType")  String statusType,@ApiParam(value = "filter results by keyword search") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentStatusSearch(accountId, sortField, descending, activeOnly, start, limit, assignmentId, creatorAccountId, assigneeAccountId, retailerLocationId, statusType, keyword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/status/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Assignment Status", notes = "Updates an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class)
    })
    public Response assignmentStatusUpdate(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment status id", required = true) @QueryParam("assignmentStatusId") @NotNull  Long assignmentStatusId,@ApiParam(value = "the scheduled notification id for reminders") @QueryParam("scheduledNotificationId")  Long scheduledNotificationId,@ApiParam(value = "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT", allowableValues="SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT") @QueryParam("toDo")  String toDo,@ApiParam(value = "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED", allowableValues="INITIAL, FOLLOW_UP, DECLINED") @QueryParam("connection")  String connection,@ApiParam(value = "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL", allowableValues="PHONE, SITE_VISIT, EMAIL") @QueryParam("method")  String method,@ApiParam(value = "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED", allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED") @QueryParam("status")  String status,@ApiParam(value = "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB", allowableValues="PHONE, SITE_VISIT, PHONE_SITE, WEB") @QueryParam("closure")  String closure,@ApiParam(value = "the message from the assignee") @QueryParam("message")  String message,@ApiParam(value = "the date to follow up by") @QueryParam("followUp")  Long followUp,@ApiParam(value = "determines whether the assignment status is active or inactive") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentStatusUpdate(accountId, assignmentStatusId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Assignment", notes = "Updates an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class)
    })
    public Response assignmentUpdate(@ApiParam(value = "the user account id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the assignment id", required = true) @QueryParam("assignmentId") @NotNull  Long assignmentId,@ApiParam(value = "the name of the assignment") @QueryParam("name")  String name,@ApiParam(value = "the description of the assignment") @QueryParam("description")  String description,@ApiParam(value = "the account id to assign to") @QueryParam("assigneeAccountId")  Long assigneeAccountId,@ApiParam(value = "the retailer location id") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "the tags") @QueryParam("tags")  String tags,@ApiParam(value = "determines whether the assignment is active or inactive") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignmentUpdate(accountId, assignmentId, name, description, assigneeAccountId, retailerLocationId, tags, active, securityContext);
    }
}
