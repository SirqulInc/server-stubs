package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
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
@Path("/api/{version}/notification")
@Api(value = "/", description = "")
public interface NotificationApi  {

    /**
     * Create Notification Template
     *
     * Create a notification template. Developers will only be able to create notification templates for their own applications.
     *
     */
    @POST
    @Path("/template/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Notification Template", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public NotificationTemplateResponse createNotificationTemplate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("conduit") @NotNull String conduit, @QueryParam("title") @NotNull String title, @QueryParam("body") @NotNull String body, @QueryParam("appKey") String appKey, @QueryParam("event") String event, @QueryParam("tags") String tags);

    /**
     * Create or update blocked notification settings
     *
     * Create or update blocked notification settings
     *
     */
    @POST
    @Path("/blocked/batch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create or update blocked notification settings", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class) })
    public BlockedNotificationResponse createOrUpdateBlockedNotifications(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("data") @NotNull String data, @QueryParam("accountId") Long accountId);

    /**
     * Delete Notification Template
     *
     * Deletes a notification template. Developers will only be able to delete notification templates for their own applications.
     *
     */
    @POST
    @Path("/template/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Notification Template", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public NotificationTemplateResponse deleteNotificationTemplate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("notificationTemplateId") @NotNull Long notificationTemplateId);

    /**
     * Get Notification Template
     *
     * Get the details of a notification template. Developers will only be able to see notification templates for their own applications.
     *
     */
    @GET
    @Path("/template/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Notification Template", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public NotificationTemplateResponse getNotificationTemplate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("notificationTemplateId") @NotNull Long notificationTemplateId);

    /**
     * Get Notifications
     *
     * Get a list of notifications for a user. If the \&quot;markAsRead\&quot; parameter is set to true, the returned notifications will be marked as \&quot;read\&quot; after the response has been sent. By default, read messages will not be returned, so to see read messages, set \&quot;returnReadMessages\&quot; to true.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Notifications", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationMessageListResponse.class) })
    public NotificationMessageListResponse getNotifications(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("appKey") String appKey, @QueryParam("eventType") String eventType, @QueryParam("contentIds") String contentIds, @QueryParam("contentTypes") String contentTypes, @QueryParam("parentIds") String parentIds, @QueryParam("parentTypes") String parentTypes, @QueryParam("actionCategory") String actionCategory, @QueryParam("conduits") String conduits, @QueryParam("keyword") String keyword, @QueryParam("returnReadMessages") Boolean returnReadMessages, @QueryParam("markAsRead") Boolean markAsRead, @QueryParam("fromDate") Long fromDate, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnSent") Boolean returnSent, @QueryParam("ignoreFlagged") Boolean ignoreFlagged, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Register Notification Token
     *
     * Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.
     *
     */
    @POST
    @Path("/token")
    @Produces({ "*/*" })
    @ApiOperation(value = "Register Notification Token", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse registerNotificationToken(@PathParam("version") BigDecimal version, @QueryParam("token") @NotNull String token, @QueryParam("pushType") @NotNull String pushType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("environment") String environment, @QueryParam("appKey") String appKey, @QueryParam("gameType") String gameType, @QueryParam("active") Boolean active, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search on the user&#39;s blocked notification settings
     *
     * Search on the user&#39;s blocked notification settings
     *
     */
    @GET
    @Path("/blocked/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search on the user's blocked notification settings", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class) })
    public BlockedNotificationResponse searchBlockedNotifications(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("accountId") Long accountId, @QueryParam("searchTags") String searchTags, @QueryParam("events") String events, @QueryParam("conduits") String conduits, @QueryParam("customTypes") String customTypes, @QueryParam("contentTypes") String contentTypes, @QueryParam("contentIds") String contentIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Search Notification Templates
     *
     * Search for notification templates on owned applications.
     *
     */
    @GET
    @Path("/template/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Notification Templates", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public NotificationTemplateResponse searchNotificationTemplate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("appKey") String appKey, @QueryParam("event") String event, @QueryParam("conduit") String conduit, @QueryParam("globalOnly") Boolean globalOnly, @QueryParam("reservedOnly") Boolean reservedOnly, @QueryParam("keyword") String keyword);

    /**
     * Search for Recipients
     *
     * Search for application users to send notifications.
     *
     */
    @GET
    @Path("/recipient/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search for Recipients", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponse.class, responseContainer = "List") })
    public List<NotificationRecipientResponse> searchRecipients(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull String sortField, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("conduit") String conduit, @QueryParam("keyword") String keyword, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("recipientAccountIds") String recipientAccountIds, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Search for Recipients (Counts/Grouped)
     *
     * Search for application users to send notifications (count/grouped variant).
     *
     */
    @GET
    @Path("/recipient/search/count")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search for Recipients (Counts/Grouped)", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponseListResponse.class) })
    public NotificationRecipientResponseListResponse searchRecipientsCount(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("conduit") String conduit, @QueryParam("keyword") String keyword, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Send Batch Notifications
     *
     * Send notifications to all users of an application. Only someone with permissions to the application can do this.
     *
     */
    @POST
    @Path("/batch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Send Batch Notifications", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse sendBatchNotifications(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("customMessage") @NotNull String customMessage, @QueryParam("conduit") String conduit, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType);

    /**
     * Send Custom Notifications
     *
     * Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.
     *
     */
    @POST
    @Path("/custom")
    @Produces({ "*/*" })
    @ApiOperation(value = "Send Custom Notifications", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse sendCustomNotifications(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("appKey") String appKey, @QueryParam("gameType") String gameType, @QueryParam("conduit") String conduit, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("actionCategory") String actionCategory, @QueryParam("subject") String subject, @QueryParam("customMessage") String customMessage, @QueryParam("friendOnlyAPNS") Boolean friendOnlyAPNS, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Update Notification Template
     *
     * Update a notification template. Developers will only be able to update notification templates for their own applications.
     *
     */
    @POST
    @Path("/template/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Notification Template", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public NotificationTemplateResponse updateNotificationTemplate(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("notificationTemplateId") @NotNull Long notificationTemplateId, @QueryParam("title") String title, @QueryParam("body") String body, @QueryParam("tags") String tags);
}
