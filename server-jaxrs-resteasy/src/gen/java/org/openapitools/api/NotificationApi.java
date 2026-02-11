package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.NotificationApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
import org.openapitools.model.ScheduledNotificationFullResponse;
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

@Path("/notification")


@io.swagger.annotations.Api(description = "the notification API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationApi  {

    @Inject NotificationApiService service;

    @POST
    @Path("/template/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Notification Template", notes = "Create a notification template. Developers will only be able to create notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response createNotificationTemplate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("conduit") String conduit, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("body") String body, @QueryParam("appKey") String appKey, @QueryParam("event") String event, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createNotificationTemplate(accountId,conduit,title,body,appKey,event,tags,securityContext);
    }
    @POST
    @Path("/blocked/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or update blocked notification settings", notes = "Create or update blocked notification settings", response = BlockedNotificationResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class) })
    public Response createOrUpdateBlockedNotifications( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("data") String data, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrUpdateBlockedNotifications(appKey,data,accountId,securityContext);
    }
    @POST
    @Path("/schedule/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Scheduled Notification", notes = "This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response createScheduledNotification( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("type") String type, @NotNull @QueryParam("message") String message, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("albumIds") String albumIds, @QueryParam("reportId") Long reportId, @QueryParam("reportParams") String reportParams, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("cronType") String cronType, @QueryParam("metaData") String metaData, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("templateType") String templateType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("sendNow") Boolean sendNow, @DefaultValue("CUSTOM") @QueryParam("eventType") String eventType, @QueryParam("deepLinkURI") String deepLinkURI, @QueryParam("sendToAll") Boolean sendToAll,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createScheduledNotification(accountId,name,type,message,contentId,contentName,contentType,parentId,parentType,appKey,groupingId,connectionGroupIds,connectionAccountIds,audienceId,audienceIds,albumIds,reportId,reportParams,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,cronType,metaData,conditionalInput,templateType,visibility,active,sendNow,eventType,deepLinkURI,sendToAll,securityContext);
    }
    @POST
    @Path("/template/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Notification Template", notes = "Deletes a notification template. Developers will only be able to delete notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response deleteNotificationTemplate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("notificationTemplateId") Long notificationTemplateId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNotificationTemplate(accountId,notificationTemplateId,securityContext);
    }
    @POST
    @Path("/schedule/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Scheduled Notification", notes = "This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response deleteScheduledNotification( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("scheduledNotificationId") Long scheduledNotificationId, @QueryParam("deleteByGroupingId") Boolean deleteByGroupingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteScheduledNotification(accountId,scheduledNotificationId,deleteByGroupingId,securityContext);
    }
    @GET
    @Path("/template/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Notification Template", notes = "Get the details of a notification template. Developers will only be able to see notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response getNotificationTemplate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("notificationTemplateId") Long notificationTemplateId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNotificationTemplate(accountId,notificationTemplateId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Notifications", notes = "Get a list of notifications for a user. If the \"markAsRead\" parameter is set to true, the returned notifications will be marked as \"read\" after the response has been sent. By default, read messages will not be returned, so to see read messages, set \"returnReadMessages\" to true.", response = NotificationMessageListResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationMessageListResponse.class) })
    public Response getNotifications( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("appKey") String appKey, @QueryParam("eventType") String eventType, @QueryParam("contentIds") String contentIds, @QueryParam("contentTypes") String contentTypes, @QueryParam("parentIds") String parentIds, @QueryParam("parentTypes") String parentTypes, @QueryParam("actionCategory") String actionCategory, @QueryParam("conduits") String conduits, @QueryParam("keyword") String keyword, @QueryParam("returnReadMessages") Boolean returnReadMessages, @QueryParam("markAsRead") Boolean markAsRead, @QueryParam("fromDate") Long fromDate, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnSent") Boolean returnSent, @QueryParam("ignoreFlagged") Boolean ignoreFlagged, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNotifications(deviceId,accountId,connectionAccountId,appKey,eventType,contentIds,contentTypes,parentIds,parentTypes,actionCategory,conduits,keyword,returnReadMessages,markAsRead,fromDate,latitude,longitude,returnSent,ignoreFlagged,start,limit,securityContext);
    }
    @GET
    @Path("/schedule/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Scheduled Notification", notes = "Get a ScheduledNotification", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response getScheduledNotification( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("scheduledNotificationId") Long scheduledNotificationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getScheduledNotification(accountId,scheduledNotificationId,securityContext);
    }
    @POST
    @Path("/token")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Register Notification Token", notes = "Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response registerNotificationToken( @NotNull @QueryParam("token") String token, @NotNull, allowableValues="APNS, GCM, BAIDU, XGPUSH, JPUSH" @QueryParam("pushType") String pushType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("environment") String environment, @QueryParam("appKey") String appKey, @QueryParam("gameType") String gameType, @QueryParam("active") Boolean active, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.registerNotificationToken(token,pushType,deviceId,accountId,environment,appKey,gameType,active,latitude,longitude,securityContext);
    }
    @POST
    @Path("/schedule/generate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Generate Schedule Notifications", notes = "Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.", response = SirqulResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response scheduleNotificationListings( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("reportName") String reportName, @NotNull @QueryParam("message") String message, @NotNull @QueryParam("offset") Integer offset, @NotNull @QueryParam("recipientReportId") Long recipientReportId, @QueryParam("reportParams") String reportParams, @QueryParam("type") String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.scheduleNotificationListings(accountId,appKey,reportName,message,offset,recipientReportId,reportParams,type,securityContext);
    }
    @GET
    @Path("/blocked/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search on the user's blocked notification settings", notes = "Search on the user's blocked notification settings", response = BlockedNotificationResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class) })
    public Response searchBlockedNotifications( @NotNull @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("searchTags") String searchTags, @QueryParam("events") String events, @QueryParam("conduits") String conduits, @QueryParam("customTypes") String customTypes, @QueryParam("contentTypes") String contentTypes, @QueryParam("contentIds") String contentIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchBlockedNotifications(appKey,accountId,searchTags,events,conduits,customTypes,contentTypes,contentIds,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/template/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Notification Templates", notes = "Search for notification templates on owned applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response searchNotificationTemplate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("appKey") String appKey, @QueryParam("event") String event, @QueryParam("conduit") String conduit, @QueryParam("globalOnly") Boolean globalOnly, @QueryParam("reservedOnly") Boolean reservedOnly, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchNotificationTemplate(accountId,sortField,descending,start,limit,appKey,event,conduit,globalOnly,reservedOnly,keyword,securityContext);
    }
    @GET
    @Path("/recipient/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Recipients", notes = "Search for application users to send notifications.", response = NotificationRecipientResponse.class, responseContainer = "List", tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponse.class, responseContainer = "List") })
    public Response searchRecipients( @NotNull, allowableValues="ID, HAS_SMS, HAS_EMAIL, HAS_APNS, HAS_GCM, APPLICATION_ID, APPLICATION_NAME, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_TYPE" @QueryParam("sortField") String sortField, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("conduit") String conduit, @QueryParam("keyword") String keyword, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("recipientAccountIds") String recipientAccountIds, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRecipients(sortField,deviceId,accountId,appKey,conduit,keyword,audienceId,audienceIds,connectionGroupIds,recipientAccountIds,descending,start,limit,securityContext);
    }
    @GET
    @Path("/recipient/search/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Recipients (Counts/Grouped)", notes = "Search for application users to send notifications (count/grouped variant).", response = NotificationRecipientResponseListResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponseListResponse.class) })
    public Response searchRecipientsCount( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("conduit") String conduit, @QueryParam("keyword") String keyword, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRecipientsCount(deviceId,accountId,appKey,conduit,keyword,audienceId,audienceIds,connectionGroupIds,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/schedule/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Scheduled Notifications", notes = "This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response searchScheduledNotifications( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("groupingId") String groupingId, @QueryParam("audienceId") Long audienceId, @QueryParam("filter") String filter, @QueryParam("types") String types, @QueryParam("contentIds") String contentIds, @QueryParam("contentTypes") String contentTypes, @QueryParam("parentIds") String parentIds, @QueryParam("parentTypes") String parentTypes, @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("groupByGroupingId") Boolean groupByGroupingId, @QueryParam("returnAudienceAccountCount") Boolean returnAudienceAccountCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchScheduledNotifications(accountId,groupingId,audienceId,filter,types,contentIds,contentTypes,parentIds,parentTypes,statuses,templateTypes,appKey,keyword,sortField,descending,start,limit,activeOnly,groupByGroupingId,returnAudienceAccountCount,securityContext);
    }
    @POST
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Batch Notifications", notes = "Send notifications to all users of an application. Only someone with permissions to the application can do this.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendBatchNotifications( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("customMessage") String customMessage, @QueryParam("conduit") String conduit, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendBatchNotifications(accountId,appKey,customMessage,conduit,contentId,contentName,contentType,parentId,parentType,securityContext);
    }
    @POST
    @Path("/custom")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Custom Notifications", notes = "Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendCustomNotifications( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("appKey") String appKey, @QueryParam("gameType") String gameType, @QueryParam("conduit") String conduit, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("actionCategory") String actionCategory, @QueryParam("subject") String subject, @QueryParam("customMessage") String customMessage, @QueryParam("friendOnlyAPNS") Boolean friendOnlyAPNS, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendCustomNotifications(deviceId,accountId,receiverAccountIds,includeFriendGroup,appKey,gameType,conduit,contentId,contentName,contentType,parentId,parentType,actionCategory,subject,customMessage,friendOnlyAPNS,latitude,longitude,securityContext);
    }
    @POST
    @Path("/template/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Notification Template", notes = "Update a notification template. Developers will only be able to update notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response updateNotificationTemplate( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("notificationTemplateId") Long notificationTemplateId, @QueryParam("title") String title, @QueryParam("body") String body, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateNotificationTemplate(accountId,notificationTemplateId,title,body,tags,securityContext);
    }
    @POST
    @Path("/schedule/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Scheduled Notification", notes = "This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response updateScheduledNotification( @NotNull @QueryParam("scheduledNotificationId") Long scheduledNotificationId, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("type") String type, @QueryParam("message") String message, @QueryParam("payload") String payload, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("albumIds") String albumIds, @QueryParam("reportId") Long reportId, @QueryParam("reportParams") String reportParams, @QueryParam("endpointURL") String endpointURL, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("cronType") String cronType, @QueryParam("metaData") String metaData, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("templateType") String templateType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("errorMessage") String errorMessage, @QueryParam("status") String status, @QueryParam("updateByGroupingId") Boolean updateByGroupingId, @QueryParam("sendNow") Boolean sendNow, @DefaultValue("CUSTOM") @QueryParam("eventType") String eventType, @QueryParam("deepLinkURI") String deepLinkURI, @QueryParam("sendToAll") Boolean sendToAll,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateScheduledNotification(scheduledNotificationId,accountId,name,type,message,payload,contentId,contentName,contentType,parentId,parentType,appKey,groupingId,connectionGroupIds,connectionAccountIds,audienceId,audienceIds,albumIds,reportId,reportParams,endpointURL,scheduledDate,startDate,endDate,cronExpression,cronType,metaData,conditionalInput,templateType,visibility,active,errorMessage,status,updateByGroupingId,sendNow,eventType,deepLinkURI,sendToAll,securityContext);
    }
}
