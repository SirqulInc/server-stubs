package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentApiServiceImpl implements AssignmentApiService {
      public Response assigmentAssigneeAccountSearch(Long accountId,String keyword,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentCreate(Long accountId,String name,Long assigneeAccountId,String description,Long retailerLocationId,String tags,Boolean active,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentDelete(Long accountId,Long assignmentId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentGet(Long accountId,Long assignmentId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentSearch(Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,Long creatorAccountId,String assigneeAccountIds,String retailerLocationIds,String currentStatusType,String keyword,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentStatusCreate(Long accountId,Long assignmentId,Long scheduledNotificationId,String toDo,String connection,String method,String status,String closure,String message,Long followUp,Boolean active,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentStatusDelete(Long accountId,Long assignmentStatusId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentStatusGet(Long accountId,Long assignmentStatusId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentStatusSearch(Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,Long assignmentId,Long creatorAccountId,Long assigneeAccountId,Long retailerLocationId,String statusType,String keyword,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentStatusUpdate(Long accountId,Long assignmentStatusId,Long scheduledNotificationId,String toDo,String connection,String method,String status,String closure,String message,Long followUp,Boolean active,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignmentUpdate(Long accountId,Long assignmentId,String name,String description,Long assigneeAccountId,Long retailerLocationId,String tags,Boolean active,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
