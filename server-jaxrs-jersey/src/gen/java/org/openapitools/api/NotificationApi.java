package org.openapitools.api;

import org.openapitools.api.NotificationApiService;
import org.openapitools.api.factories.NotificationApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/notification")


@io.swagger.annotations.Api(description = "the notification API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationApi  {
   private final NotificationApiService delegate;

   public NotificationApi(@Context ServletConfig servletContext) {
      NotificationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("NotificationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (NotificationApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = NotificationApiServiceFactory.getNotificationApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/template/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Notification Template", notes = "Create a notification template. Developers will only be able to create notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class)
    })
    public Response createNotificationTemplate(@ApiParam(value = "The account ID of the user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.", required = true) @QueryParam("conduit") @NotNull  String conduit,@ApiParam(value = "title of the notification template", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "body of the notification template", required = true) @QueryParam("body") @NotNull  String body,@ApiParam(value = "Filter results by application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Filter results by event.") @QueryParam("event")  String event,@ApiParam(value = "tags associated with the note template") @QueryParam("tags")  String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createNotificationTemplate(accountId, conduit, title, body, appKey, event, tags, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/blocked/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or update blocked notification settings", notes = "Create or update blocked notification settings", response = BlockedNotificationResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class)
    })
    public Response createOrUpdateBlockedNotifications(@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "batch data payload (application specific)", required = true) @QueryParam("data") @NotNull  String data,@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrUpdateBlockedNotifications(appKey, data, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/schedule/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Scheduled Notification", notes = "This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class)
    })
    public Response createScheduledNotification(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the scheduled notification", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages", required = true) @QueryParam("type") @NotNull  String type,@ApiParam(value = "The message to send", required = true) @QueryParam("message") @NotNull  String message,@ApiParam(value = "The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("contentId")  Long contentId,@ApiParam(value = "The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("contentName")  String contentName,@ApiParam(value = "The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("contentType")  String contentType,@ApiParam(value = "The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("parentId")  Long parentId,@ApiParam(value = "The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("parentType")  String parentType,@ApiParam(value = "The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "The connection accounts to use to generate the list of recipients (comma separated list of user account ids)") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "This parameter is deprecated. The audience used to generate the list of recipients") @QueryParam("audienceId")  Long audienceId,@ApiParam(value = "The audiences used to generate the list of recipients (comma separated list of audience IDs)") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "The album ids to associate with the scheduled notification (comma separated list of album IDs)") @QueryParam("albumIds")  String albumIds,@ApiParam(value = "The report used to generate the the list of recipients") @QueryParam("reportId")  Long reportId,@ApiParam(value = "The parameters to supply to the report used to generate the the list of recipients") @QueryParam("reportParams")  String reportParams,@ApiParam(value = "The URL for making an HTTP call") @QueryParam("endpointURL")  String endpointURL,@ApiParam(value = "The parameters for making an HTTP call") @QueryParam("payload")  String payload,@ApiParam(value = "The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.") @QueryParam("cronExpression")  String cronExpression,@ApiParam(value = "The cron expression type: UNIX, CRON4J, QUARTZ") @QueryParam("cronType")  String cronType,@ApiParam(value = "Additional metadata for the scheduled notification") @QueryParam("metaData")  String metaData,@ApiParam(value = "Json input representing conditional logic that has to be met before running the scheduled notification") @QueryParam("conditionalInput")  String conditionalInput,@ApiParam(value = "This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered") @QueryParam("templateType")  String templateType,@ApiParam(value = "Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule. The default value is 'true'.") @QueryParam("active")  Boolean active,@ApiParam(value = "") @QueryParam("sendNow")  Boolean sendNow,@ApiParam(value = "Sets the event type for the notification", defaultValue = "CUSTOM") @DefaultValue("CUSTOM") @QueryParam("eventType")  String eventType,@ApiParam(value = "The payload deep link URI that can be used by the client app to direct users to a screen in the app") @QueryParam("deepLinkURI")  String deepLinkURI,@ApiParam(value = "Determines whether to send to all users of the app if set to true for push notifications (appKey is required)") @QueryParam("sendToAll")  Boolean sendToAll,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createScheduledNotification(accountId, name, type, message, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, sendNow, eventType, deepLinkURI, sendToAll, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/template/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Notification Template", notes = "Deletes a notification template. Developers will only be able to delete notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class)
    })
    public Response deleteNotificationTemplate(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the notification template to delete", required = true) @QueryParam("notificationTemplateId") @NotNull  Long notificationTemplateId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteNotificationTemplate(accountId, notificationTemplateId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/schedule/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Scheduled Notification", notes = "This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class)
    })
    public Response deleteScheduledNotification(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the scheduled notification to delete", required = true) @QueryParam("scheduledNotificationId") @NotNull  Long scheduledNotificationId,@ApiParam(value = "If set to true, also deletes Scheduled Notifications under the same account with the same groupingId.") @QueryParam("deleteByGroupingId")  Boolean deleteByGroupingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteScheduledNotification(accountId, scheduledNotificationId, deleteByGroupingId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/template/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Notification Template", notes = "Get the details of a notification template. Developers will only be able to see notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class)
    })
    public Response getNotificationTemplate(@ApiParam(value = "the id of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the notification template to get", required = true) @QueryParam("notificationTemplateId") @NotNull  Long notificationTemplateId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNotificationTemplate(accountId, notificationTemplateId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Notifications", notes = "Get a list of notifications for a user. If the \"markAsRead\" parameter is set to true, the returned notifications will be marked as \"read\" after the response has been sent. By default, read messages will not be returned, so to see read messages, set \"returnReadMessages\" to true.", response = NotificationMessageListResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationMessageListResponse.class)
    })
    public Response getNotifications(@ApiParam(value = "the unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the account id used to view another person's notifications") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "the application key to filter messages by application") @QueryParam("appKey")  String appKey,@ApiParam(value = "comma separated list of EVENTS. Filters search results to only include these events. Don't include this parameter or pass in an empty string to return all event types.") @QueryParam("eventType")  String eventType,@ApiParam(value = "comma separated list of content ids to search notifications on") @QueryParam("contentIds")  String contentIds,@ApiParam(value = "comma separated list of content types to search notifications on") @QueryParam("contentTypes")  String contentTypes,@ApiParam(value = "comma separated list of parent ids to search notifications on") @QueryParam("parentIds")  String parentIds,@ApiParam(value = "comma separated list of parent types to search notifications on") @QueryParam("parentTypes")  String parentTypes,@ApiParam(value = "Action category used to filter notifications") @QueryParam("actionCategory")  String actionCategory,@ApiParam(value = "comma separated list of conduits to search notifications on") @QueryParam("conduits")  String conduits,@ApiParam(value = "search notifications via keyword") @QueryParam("keyword")  String keyword,@ApiParam(value = "if set to true, will return notifications that have been marked as read") @QueryParam("returnReadMessages")  Boolean returnReadMessages,@ApiParam(value = "if set to true, the returned notifications will be marked as \\\"read\\\" after the response has been sent") @QueryParam("markAsRead")  Boolean markAsRead,@ApiParam(value = "filter notifications from this date") @QueryParam("fromDate")  Long fromDate,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "whether to include notifications sent by the requester in the response") @QueryParam("returnSent")  Boolean returnSent,@ApiParam(value = "whether to ignore flagged notifications") @QueryParam("ignoreFlagged")  Boolean ignoreFlagged,@ApiParam(value = "start of the pagination") @QueryParam("start")  Integer start,@ApiParam(value = "limit of the pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNotifications(deviceId, accountId, connectionAccountId, appKey, eventType, contentIds, contentTypes, parentIds, parentTypes, actionCategory, conduits, keyword, returnReadMessages, markAsRead, fromDate, latitude, longitude, returnSent, ignoreFlagged, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/schedule/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Scheduled Notification", notes = "Get a ScheduledNotification", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class)
    })
    public Response getScheduledNotification(@ApiParam(value = "the id of the account logged in", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the scheduled notification to get", required = true) @QueryParam("scheduledNotificationId") @NotNull  Long scheduledNotificationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getScheduledNotification(accountId, scheduledNotificationId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/token")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Register Notification Token", notes = "Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response registerNotificationToken(@ApiParam(value = "A token that is generated by the device to sign requests for the notification service providers", required = true) @QueryParam("token") @NotNull  String token,@ApiParam(value = "The type of push notification. Possible values include: APNS, GCM", required = true, allowableValues="APNS, GCM, BAIDU, XGPUSH, JPUSH") @QueryParam("pushType") @NotNull  String pushType,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Determines if the token is a DEVELOPMENT or PRODUCTION token") @QueryParam("environment")  String environment,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "This parameter is deprecated (use appKey instead)") @QueryParam("gameType")  String gameType,@ApiParam(value = "Sets whether the token is active or not (non-active tokens are not used)") @QueryParam("active")  Boolean active,@ApiParam(value = "Latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.registerNotificationToken(token, pushType, deviceId, accountId, environment, appKey, gameType, active, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/schedule/generate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Generate Schedule Notifications", notes = "Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.", response = SirqulResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response scheduleNotificationListings(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application to target", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the report used to identify events. The report must return columns named: id, name, date, params, and type otherwise it will fail", required = true) @QueryParam("reportName") @NotNull  String reportName,@ApiParam(value = "The message to be sent to the recipients. If you set %name% the report row name value will be swapped in. If you set %time% or %date% the report row start date/time value will be swapped in", required = true) @QueryParam("message") @NotNull  String message,@ApiParam(value = "Time in munites before the event starts to notify recipients", required = true) @QueryParam("offset") @NotNull  Integer offset,@ApiParam(value = "The report id used to generate the recipient list", required = true) @QueryParam("recipientReportId") @NotNull  Long recipientReportId,@ApiParam(value = "The parameters of the report used to identify events in a json structure, example: ```json {   \"string\": \"value\",   \"number\": 3.345,   \"date\": \"2014-05-01 00:00:00\" } ``` ") @QueryParam("reportParams")  String reportParams,@ApiParam(value = "The type of scheduled notification; supported values are: MOBILE_NOTIFICATION") @QueryParam("type")  String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.scheduleNotificationListings(accountId, appKey, reportName, message, offset, recipientReportId, reportParams, type, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/blocked/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search on the user's blocked notification settings", notes = "Search on the user's blocked notification settings", response = BlockedNotificationResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class)
    })
    public Response searchBlockedNotifications(@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "search tags to filter results") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "events to filter by (comma separated)") @QueryParam("events")  String events,@ApiParam(value = "conduits to filter by (comma separated)") @QueryParam("conduits")  String conduits,@ApiParam(value = "custom types to filter by (comma separated)") @QueryParam("customTypes")  String customTypes,@ApiParam(value = "content types to filter by (comma separated)") @QueryParam("contentTypes")  String contentTypes,@ApiParam(value = "content ids to filter by (comma separated)") @QueryParam("contentIds")  String contentIds,@ApiParam(value = "sort field for results") @QueryParam("sortField")  String sortField,@ApiParam(value = "whether to sort descending") @QueryParam("descending")  Boolean descending,@ApiParam(value = "start of the pagination") @QueryParam("start")  Integer start,@ApiParam(value = "limit of the pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchBlockedNotifications(appKey, accountId, searchTags, events, conduits, customTypes, contentTypes, contentIds, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/template/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Notification Templates", notes = "Search for notification templates on owned applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class)
    })
    public Response searchNotificationTemplate(@ApiParam(value = "The account ID of the user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name ('global' templates will not have an application and will be returned last if 'descending' is set to false.", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Specified whether the results are returned in descending or ascending order.", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start of the pagination.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit of the pagination.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Filter results by application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Filter results by event.") @QueryParam("event")  String event,@ApiParam(value = "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @QueryParam("conduit")  String conduit,@ApiParam(value = "Returns only templates that have been reserved for system use on all applications (only for admin accounts).") @QueryParam("globalOnly")  Boolean globalOnly,@ApiParam(value = "Returns only templates that use reserved events.") @QueryParam("reservedOnly")  Boolean reservedOnly,@ApiParam(value = "Filter results by keyword on the title, tags.") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchNotificationTemplate(accountId, sortField, descending, start, limit, appKey, event, conduit, globalOnly, reservedOnly, keyword, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/recipient/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Recipients", notes = "Search for application users to send notifications.", response = NotificationRecipientResponse.class, responseContainer = "List", tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponse.class, responseContainer = "List")
    })
    public Response searchRecipients(@ApiParam(value = "The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}", required = true, allowableValues="ID, HAS_SMS, HAS_EMAIL, HAS_APNS, HAS_GCM, APPLICATION_ID, APPLICATION_NAME, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_TYPE") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "the unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.") @QueryParam("appKey")  String appKey,@ApiParam(value = "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @QueryParam("conduit")  String conduit,@ApiParam(value = "search by keyword on user's display name and email") @QueryParam("keyword")  String keyword,@ApiParam(value = "This parameter is deprecated. filter results by audience") @QueryParam("audienceId")  Long audienceId,@ApiParam(value = "filter results by audiences (comma separated list of audience ids)") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "filter results by connection groups (comma separated list of connection group ids)") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "filter results by accounts (comma separated list of account ids)") @QueryParam("recipientAccountIds")  String recipientAccountIds,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "start of the pagination") @QueryParam("start")  Integer start,@ApiParam(value = "limit of the pagination (hard limit of 1000)") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRecipients(sortField, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, recipientAccountIds, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/recipient/search/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Recipients (Counts/Grouped)", notes = "Search for application users to send notifications (count/grouped variant).", response = NotificationRecipientResponseListResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponseListResponse.class)
    })
    public Response searchRecipientsCount(@ApiParam(value = "the unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.") @QueryParam("appKey")  String appKey,@ApiParam(value = "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @QueryParam("conduit")  String conduit,@ApiParam(value = "search by keyword on user's display name and email") @QueryParam("keyword")  String keyword,@ApiParam(value = "This parameter is deprecated. filter results by audience") @QueryParam("audienceId")  Long audienceId,@ApiParam(value = "filter results by audiences (comma separated list of audience ids)") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "filter results by connection groups (comma separated list of connection group ids)") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "The field to sort by (see API docs for allowed values).") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "start of the pagination") @QueryParam("start")  Integer start,@ApiParam(value = "limit of the pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRecipientsCount(deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/schedule/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Scheduled Notifications", notes = "This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class)
    })
    public Response searchScheduledNotifications(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Filter results by a grouping identifier defined by the client") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "Filter results by audience") @QueryParam("audienceId")  Long audienceId,@ApiParam(value = "a comma separated list of filters: MINE - Return scheduled notifications that the user has created. SHARED - Return scheduled notifications that have been shared to the user via addUsersToPermissionable. FOLLOWER - Return scheduled notifications that have been created by the users followers (the content needs to have been APPROVED or FEATURED). FOLLOWING - Return scheduled notifications that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). PUBLIC - Return all PUBLIC scheduled notifications that have been APPROVED or FEATURED. ALL_PUBLIC - Return all PUBLIC scheduled notifications regardless of whether they are approved or not (ignores the approval status). LIKED - Return all scheduled notifications that the user has liked. FEATURED - Return all scheduled notifications that have been featured. PENDING - Return all pending scheduled notifications.") @QueryParam("filter")  String filter,@ApiParam(value = "Filter results by notification types (comma separated list). Values include: HTTP, EMAIL, SMS, MOBILE_NOTIFICATION") @QueryParam("types")  String types,@ApiParam(value = "search using content IDs") @QueryParam("contentIds")  String contentIds,@ApiParam(value = "search using content types") @QueryParam("contentTypes")  String contentTypes,@ApiParam(value = "search using parent IDs") @QueryParam("parentIds")  String parentIds,@ApiParam(value = "search using parent types") @QueryParam("parentTypes")  String parentTypes,@ApiParam(value = "Filter results by status (comma separated list). Possible values include: NEW - scheduled to run ERROR - encountered an error during processing COMPLETE - processing has completed and it is no longer scheduled to run PROCESSING - currently processing/sending") @QueryParam("statuses")  String statuses,@ApiParam(value = "") @QueryParam("templateTypes")  String templateTypes,@ApiParam(value = "Filter the list by a specific application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Keyword search on the scheduled notification names.") @QueryParam("keyword")  String keyword,@ApiParam(value = "The field to sort by. Possible values include: ID - order by the scheduledNotificationId CREATED - order by the timestamp it was created UPDATED - order by the timestamp it was last updated ACTIVE - order by whether it is active or inactive NAME - order by the scheduled notification name SCHEDULED_DATE - order by the next scheduled date START_DATE - order by the start date END_DATE - order by the end date") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Start the result set at some index.") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number.") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active results") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Determines whether to group results with the same groupingId together.") @QueryParam("groupByGroupingId")  Boolean groupByGroupingId,@ApiParam(value = "If true, include audience account counts in the response") @QueryParam("returnAudienceAccountCount")  Boolean returnAudienceAccountCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchScheduledNotifications(accountId, groupingId, audienceId, filter, types, contentIds, contentTypes, parentIds, parentTypes, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly, groupByGroupingId, returnAudienceAccountCount, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Batch Notifications", notes = "Send notifications to all users of an application. Only someone with permissions to the application can do this.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response sendBatchNotifications(@ApiParam(value = "The account id of the application owner/manager", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Message string that will be displayed in on the notification", required = true) @QueryParam("customMessage") @NotNull  String customMessage,@ApiParam(value = "The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @QueryParam("conduit")  String conduit,@ApiParam(value = "Default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("contentId")  Long contentId,@ApiParam(value = "Default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("contentName")  String contentName,@ApiParam(value = "Default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("contentType")  String contentType,@ApiParam(value = "Default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("parentId")  Long parentId,@ApiParam(value = "Default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("parentType")  String parentType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendBatchNotifications(accountId, appKey, customMessage, conduit, contentId, contentName, contentType, parentId, parentType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/custom")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Custom Notifications", notes = "Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response sendCustomNotifications(@ApiParam(value = "the unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "comma separated list of account IDs that will receive the notification") @QueryParam("receiverAccountIds")  String receiverAccountIds,@ApiParam(value = "determines whether to send to all of the user's friends, this flag must be true or receiverAccountIds must not be empty") @QueryParam("includeFriendGroup")  Boolean includeFriendGroup,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @QueryParam("conduit")  String conduit,@ApiParam(value = "default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("contentId")  Long contentId,@ApiParam(value = "default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("contentName")  String contentName,@ApiParam(value = "default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("contentType")  String contentType,@ApiParam(value = "default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("parentId")  Long parentId,@ApiParam(value = "default notification pay-load field (usage is dependent on the app and the type of event)") @QueryParam("parentType")  String parentType,@ApiParam(value = "") @QueryParam("actionCategory")  String actionCategory,@ApiParam(value = "the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)") @QueryParam("subject")  String subject,@ApiParam(value = "message string that will be displayed in on the notification") @QueryParam("customMessage")  String customMessage,@ApiParam(value = "only sends APNS to people who are friends of the user (still saves the notification message for feed polling)") @QueryParam("friendOnlyAPNS")  Boolean friendOnlyAPNS,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendCustomNotifications(deviceId, accountId, receiverAccountIds, includeFriendGroup, appKey, gameType, conduit, contentId, contentName, contentType, parentId, parentType, actionCategory, subject, customMessage, friendOnlyAPNS, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/template/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Notification Template", notes = "Update a notification template. Developers will only be able to update notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class)
    })
    public Response updateNotificationTemplate(@ApiParam(value = "The account ID of the user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The notification template ID to update.", required = true) @QueryParam("notificationTemplateId") @NotNull  Long notificationTemplateId,@ApiParam(value = "The title of the message (this would become the subject title for emails). There is a 191 character limit.") @QueryParam("title")  String title,@ApiParam(value = "The body of the message.") @QueryParam("body")  String body,@ApiParam(value = "The search tags on the template used during search queries.") @QueryParam("tags")  String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateNotificationTemplate(accountId, notificationTemplateId, title, body, tags, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/schedule/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Scheduled Notification", notes = "This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class)
    })
    public Response updateScheduledNotification(@ApiParam(value = "The id of scheduled notification to update", required = true) @QueryParam("scheduledNotificationId") @NotNull  Long scheduledNotificationId,@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the scheduled notification") @QueryParam("name")  String name,@ApiParam(value = "The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages") @QueryParam("type")  String type,@ApiParam(value = "The message to send") @QueryParam("message")  String message,@ApiParam(value = "The parameters for making an HTTP call") @QueryParam("payload")  String payload,@ApiParam(value = "The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("contentId")  Long contentId,@ApiParam(value = "The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("contentName")  String contentName,@ApiParam(value = "The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("contentType")  String contentType,@ApiParam(value = "The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("parentId")  Long parentId,@ApiParam(value = "The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @QueryParam("parentType")  String parentType,@ApiParam(value = "The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "The connection accounts to use to generate the list of recipients (comma separated list of user account ids)") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "This parameter is deprecated. The audience used to generate the list of recipients") @QueryParam("audienceId")  Long audienceId,@ApiParam(value = "The audiences used to generate the list of recipients (comma separated list of audience IDs)") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "The album ids to associate with the scheduled notification (comma separated list of album IDs)") @QueryParam("albumIds")  String albumIds,@ApiParam(value = "The report used to generate the the list of recipients") @QueryParam("reportId")  Long reportId,@ApiParam(value = "The parameters to supply to the report used to generate the the list of recipients") @QueryParam("reportParams")  String reportParams,@ApiParam(value = "The URL for making an HTTP call") @QueryParam("endpointURL")  String endpointURL,@ApiParam(value = "The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.") @QueryParam("cronExpression")  String cronExpression,@ApiParam(value = "The cron expression type: UNIX, CRON4J, QUARTZ") @QueryParam("cronType")  String cronType,@ApiParam(value = "Additional metadata for the scheduled notification") @QueryParam("metaData")  String metaData,@ApiParam(value = "Json input representing conditional logic that has to be met before running the scheduled notification") @QueryParam("conditionalInput")  String conditionalInput,@ApiParam(value = "This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered") @QueryParam("templateType")  String templateType,@ApiParam(value = "Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule.") @QueryParam("active")  Boolean active,@ApiParam(value = "the error message associated with the scheduled notification") @QueryParam("errorMessage")  String errorMessage,@ApiParam(value = "the status of the scheduled notification") @QueryParam("status")  String status,@ApiParam(value = "also updates ScheduledNotifications with the same groupingId and account") @QueryParam("updateByGroupingId")  Boolean updateByGroupingId,@ApiParam(value = "whether to send the scheduled notification now or not") @QueryParam("sendNow")  Boolean sendNow,@ApiParam(value = "Sets the event type for the notification", defaultValue = "CUSTOM") @DefaultValue("CUSTOM") @QueryParam("eventType")  String eventType,@ApiParam(value = "The payload deep link URI that can be used by the client app to direct users to a screen in the app") @QueryParam("deepLinkURI")  String deepLinkURI,@ApiParam(value = "Determines whether to send to all users of the app if set to true for push notifications (appKey is required)") @QueryParam("sendToAll")  Boolean sendToAll,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateScheduledNotification(scheduledNotificationId, accountId, name, type, message, payload, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, errorMessage, status, updateByGroupingId, sendNow, eventType, deepLinkURI, sendToAll, securityContext);
    }
}
