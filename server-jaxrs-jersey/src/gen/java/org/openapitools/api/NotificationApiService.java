package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class NotificationApiService {
    public abstract Response createNotificationTemplate( @NotNull Long accountId, @NotNull String conduit, @NotNull String title, @NotNull String body,String appKey,String event,String tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createOrUpdateBlockedNotifications( @NotNull String appKey, @NotNull String data,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createScheduledNotification( @NotNull Long accountId, @NotNull String name, @NotNull String type, @NotNull String message,Long contentId,String contentName,String contentType,Long parentId,String parentType,String appKey,String groupingId,String connectionGroupIds,String connectionAccountIds,Long audienceId,String audienceIds,String albumIds,Long reportId,String reportParams,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String cronType,String metaData,String conditionalInput,String templateType,String visibility,Boolean active,Boolean sendNow,String eventType,String deepLinkURI,Boolean sendToAll,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteNotificationTemplate( @NotNull Long accountId, @NotNull Long notificationTemplateId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteScheduledNotification( @NotNull Long accountId, @NotNull Long scheduledNotificationId,Boolean deleteByGroupingId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNotificationTemplate( @NotNull Long accountId, @NotNull Long notificationTemplateId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNotifications(String deviceId,Long accountId,Long connectionAccountId,String appKey,String eventType,String contentIds,String contentTypes,String parentIds,String parentTypes,String actionCategory,String conduits,String keyword,Boolean returnReadMessages,Boolean markAsRead,Long fromDate,Double latitude,Double longitude,Boolean returnSent,Boolean ignoreFlagged,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getScheduledNotification( @NotNull Long accountId, @NotNull Long scheduledNotificationId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response registerNotificationToken( @NotNull String token, @NotNull String pushType,String deviceId,Long accountId,String environment,String appKey,String gameType,Boolean active,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response scheduleNotificationListings( @NotNull Long accountId, @NotNull String appKey, @NotNull String reportName, @NotNull String message, @NotNull Integer offset, @NotNull Long recipientReportId,String reportParams,String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchBlockedNotifications( @NotNull String appKey,Long accountId,String searchTags,String events,String conduits,String customTypes,String contentTypes,String contentIds,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchNotificationTemplate( @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit,String appKey,String event,String conduit,Boolean globalOnly,Boolean reservedOnly,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchRecipients( @NotNull String sortField,String deviceId,Long accountId,String appKey,String conduit,String keyword,Long audienceId,String audienceIds,String connectionGroupIds,String recipientAccountIds,Boolean descending,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchRecipientsCount(String deviceId,Long accountId,String appKey,String conduit,String keyword,Long audienceId,String audienceIds,String connectionGroupIds,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchScheduledNotifications( @NotNull Long accountId,String groupingId,Long audienceId,String filter,String types,String contentIds,String contentTypes,String parentIds,String parentTypes,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean groupByGroupingId,Boolean returnAudienceAccountCount,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sendBatchNotifications( @NotNull Long accountId, @NotNull String appKey, @NotNull String customMessage,String conduit,Long contentId,String contentName,String contentType,Long parentId,String parentType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sendCustomNotifications(String deviceId,Long accountId,String receiverAccountIds,Boolean includeFriendGroup,String appKey,String gameType,String conduit,Long contentId,String contentName,String contentType,Long parentId,String parentType,String actionCategory,String subject,String customMessage,Boolean friendOnlyAPNS,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateNotificationTemplate( @NotNull Long accountId, @NotNull Long notificationTemplateId,String title,String body,String tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateScheduledNotification( @NotNull Long scheduledNotificationId, @NotNull Long accountId,String name,String type,String message,String payload,Long contentId,String contentName,String contentType,Long parentId,String parentType,String appKey,String groupingId,String connectionGroupIds,String connectionAccountIds,Long audienceId,String audienceIds,String albumIds,Long reportId,String reportParams,String endpointURL,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String cronType,String metaData,String conditionalInput,String templateType,String visibility,Boolean active,String errorMessage,String status,Boolean updateByGroupingId,Boolean sendNow,String eventType,String deepLinkURI,Boolean sendToAll,SecurityContext securityContext) throws NotFoundException;
}
