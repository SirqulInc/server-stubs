package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
import org.openapitools.model.ScheduledNotificationFullResponse;
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
public class NotificationApiServiceImpl implements NotificationApiService {
      public Response createNotificationTemplate(Long accountId,String conduit,String title,String body,String appKey,String event,String tags,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createOrUpdateBlockedNotifications(String appKey,String data,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createScheduledNotification(Long accountId,String name,String type,String message,Long contentId,String contentName,String contentType,Long parentId,String parentType,String appKey,String groupingId,String connectionGroupIds,String connectionAccountIds,Long audienceId,String audienceIds,String albumIds,Long reportId,String reportParams,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String cronType,String metaData,String conditionalInput,String templateType,String visibility,Boolean active,Boolean sendNow,String eventType,String deepLinkURI,Boolean sendToAll,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteNotificationTemplate(Long accountId,Long notificationTemplateId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteScheduledNotification(Long accountId,Long scheduledNotificationId,Boolean deleteByGroupingId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getNotificationTemplate(Long accountId,Long notificationTemplateId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getNotifications(String deviceId,Long accountId,Long connectionAccountId,String appKey,String eventType,String contentIds,String contentTypes,String parentIds,String parentTypes,String actionCategory,String conduits,String keyword,Boolean returnReadMessages,Boolean markAsRead,Long fromDate,Double latitude,Double longitude,Boolean returnSent,Boolean ignoreFlagged,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getScheduledNotification(Long accountId,Long scheduledNotificationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response registerNotificationToken(String token,String pushType,String deviceId,Long accountId,String environment,String appKey,String gameType,Boolean active,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response scheduleNotificationListings(Long accountId,String appKey,String reportName,String message,Integer offset,Long recipientReportId,String reportParams,String type,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchBlockedNotifications(String appKey,Long accountId,String searchTags,String events,String conduits,String customTypes,String contentTypes,String contentIds,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchNotificationTemplate(Long accountId,String sortField,Boolean descending,Integer start,Integer limit,String appKey,String event,String conduit,Boolean globalOnly,Boolean reservedOnly,String keyword,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchRecipients(String sortField,String deviceId,Long accountId,String appKey,String conduit,String keyword,Long audienceId,String audienceIds,String connectionGroupIds,String recipientAccountIds,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchRecipientsCount(String deviceId,Long accountId,String appKey,String conduit,String keyword,Long audienceId,String audienceIds,String connectionGroupIds,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchScheduledNotifications(Long accountId,String groupingId,Long audienceId,String filter,String types,String contentIds,String contentTypes,String parentIds,String parentTypes,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean groupByGroupingId,Boolean returnAudienceAccountCount,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response sendBatchNotifications(Long accountId,String appKey,String customMessage,String conduit,Long contentId,String contentName,String contentType,Long parentId,String parentType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response sendCustomNotifications(String deviceId,Long accountId,String receiverAccountIds,Boolean includeFriendGroup,String appKey,String gameType,String conduit,Long contentId,String contentName,String contentType,Long parentId,String parentType,String actionCategory,String subject,String customMessage,Boolean friendOnlyAPNS,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateNotificationTemplate(Long accountId,Long notificationTemplateId,String title,String body,String tags,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateScheduledNotification(Long scheduledNotificationId,Long accountId,String name,String type,String message,String payload,Long contentId,String contentName,String contentType,Long parentId,String parentType,String appKey,String groupingId,String connectionGroupIds,String connectionAccountIds,Long audienceId,String audienceIds,String albumIds,Long reportId,String reportParams,String endpointURL,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String cronType,String metaData,String conditionalInput,String templateType,String visibility,Boolean active,String errorMessage,String status,Boolean updateByGroupingId,Boolean sendNow,String eventType,String deepLinkURI,Boolean sendToAll,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
