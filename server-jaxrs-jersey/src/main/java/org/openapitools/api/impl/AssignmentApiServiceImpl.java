package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentApiServiceImpl extends AssignmentApiService {
    @Override
    public Response assigmentAssigneeAccountSearch( @NotNull Long accountId, String keyword, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentCreate( @NotNull Long accountId,  @NotNull String name,  @NotNull Long assigneeAccountId, String description, Long retailerLocationId, String tags, Boolean active, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentDelete( @NotNull Long accountId,  @NotNull Long assignmentId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentGet( @NotNull Long accountId,  @NotNull Long assignmentId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentSearch( @NotNull Long accountId,  @NotNull String sortField,  @NotNull Boolean descending,  @NotNull Boolean activeOnly,  @NotNull Integer start,  @NotNull Integer limit, Long creatorAccountId, String assigneeAccountIds, String retailerLocationIds, String currentStatusType, String keyword, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentStatusCreate( @NotNull Long accountId,  @NotNull Long assignmentId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentStatusDelete( @NotNull Long accountId,  @NotNull Long assignmentStatusId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentStatusGet( @NotNull Long accountId,  @NotNull Long assignmentStatusId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentStatusSearch( @NotNull Long accountId,  @NotNull String sortField,  @NotNull Boolean descending,  @NotNull Boolean activeOnly,  @NotNull Integer start,  @NotNull Integer limit, Long assignmentId, Long creatorAccountId, Long assigneeAccountId, Long retailerLocationId, String statusType, String keyword, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentStatusUpdate( @NotNull Long accountId,  @NotNull Long assignmentStatusId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assignmentUpdate( @NotNull Long accountId,  @NotNull Long assignmentId, String name, String description, Long assigneeAccountId, Long retailerLocationId, String tags, Boolean active, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
