package org.openapitools.api

import org.openapitools.model.BlockedNotificationResponse
import org.openapitools.model.NotificationMessageListResponse
import org.openapitools.model.NotificationRecipientResponse
import org.openapitools.model.NotificationRecipientResponseListResponse
import org.openapitools.model.NotificationTemplateResponse
import org.openapitools.model.ScheduledNotificationFullResponse
import org.openapitools.model.SirqulResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class NotificationApiController() {

    @Operation(
        summary = "Create Notification Template",
        operationId = "createNotificationTemplate",
        description = """Create a notification template. Developers will only be able to create notification templates for their own applications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationTemplateResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/template/create"
        value = [PATH_CREATE_NOTIFICATION_TEMPLATE],
        produces = ["*/*"]
    )
    fun createNotificationTemplate(
        @NotNull @Parameter(description = "The account ID of the user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.", required = true) @Valid @RequestParam(value = "conduit", required = true) conduit: kotlin.String,
        @NotNull @Parameter(description = "title of the notification template", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @NotNull @Parameter(description = "body of the notification template", required = true) @Valid @RequestParam(value = "body", required = true) body: kotlin.String,
        @Parameter(description = "Filter results by application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Filter results by event.") @Valid @RequestParam(value = "event", required = false) event: kotlin.String?,
        @Parameter(description = "tags associated with the note template") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?
    ): ResponseEntity<NotificationTemplateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create or update blocked notification settings",
        operationId = "createOrUpdateBlockedNotifications",
        description = """Create or update blocked notification settings""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BlockedNotificationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/blocked/batch"
        value = [PATH_CREATE_OR_UPDATE_BLOCKED_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun createOrUpdateBlockedNotifications(
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "batch data payload (application specific)", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String,
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<BlockedNotificationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Scheduled Notification",
        operationId = "createScheduledNotification",
        description = """This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScheduledNotificationFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/schedule/create"
        value = [PATH_CREATE_SCHEDULED_NOTIFICATION],
        produces = ["*/*"]
    )
    fun createScheduledNotification(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the scheduled notification", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages", required = true) @Valid @RequestParam(value = "type", required = true) type: kotlin.String,
        @NotNull @Parameter(description = "The message to send", required = true) @Valid @RequestParam(value = "message", required = true) message: kotlin.String,
        @Parameter(description = "The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "contentId", required = false) contentId: kotlin.Long?,
        @Parameter(description = "The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "contentName", required = false) contentName: kotlin.String?,
        @Parameter(description = "The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "contentType", required = false) contentType: kotlin.String?,
        @Parameter(description = "The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "parentId", required = false) parentId: kotlin.Long?,
        @Parameter(description = "The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "parentType", required = false) parentType: kotlin.String?,
        @Parameter(description = "The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "The connection accounts to use to generate the list of recipients (comma separated list of user account ids)") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. The audience used to generate the list of recipients") @Valid @RequestParam(value = "audienceId", required = false) audienceId: kotlin.Long?,
        @Parameter(description = "The audiences used to generate the list of recipients (comma separated list of audience IDs)") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "The album ids to associate with the scheduled notification (comma separated list of album IDs)") @Valid @RequestParam(value = "albumIds", required = false) albumIds: kotlin.String?,
        @Parameter(description = "The report used to generate the the list of recipients") @Valid @RequestParam(value = "reportId", required = false) reportId: kotlin.Long?,
        @Parameter(description = "The parameters to supply to the report used to generate the the list of recipients") @Valid @RequestParam(value = "reportParams", required = false) reportParams: kotlin.String?,
        @Parameter(description = "The URL for making an HTTP call") @Valid @RequestParam(value = "endpointURL", required = false) endpointURL: kotlin.String?,
        @Parameter(description = "The parameters for making an HTTP call") @Valid @RequestParam(value = "payload", required = false) payload: kotlin.String?,
        @Parameter(description = "The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.") @Valid @RequestParam(value = "cronExpression", required = false) cronExpression: kotlin.String?,
        @Parameter(description = "The cron expression type: UNIX, CRON4J, QUARTZ") @Valid @RequestParam(value = "cronType", required = false) cronType: kotlin.String?,
        @Parameter(description = "Additional metadata for the scheduled notification") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Json input representing conditional logic that has to be met before running the scheduled notification") @Valid @RequestParam(value = "conditionalInput", required = false) conditionalInput: kotlin.String?,
        @Parameter(description = "This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered") @Valid @RequestParam(value = "templateType", required = false) templateType: kotlin.String?,
        @Parameter(description = "Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule. The default value is 'true'.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "sendNow", required = false) sendNow: kotlin.Boolean?,
        @Parameter(description = "Sets the event type for the notification", schema = Schema(defaultValue = "CUSTOM")) @Valid @RequestParam(value = "eventType", required = false, defaultValue = "CUSTOM") eventType: kotlin.String,
        @Parameter(description = "The payload deep link URI that can be used by the client app to direct users to a screen in the app") @Valid @RequestParam(value = "deepLinkURI", required = false) deepLinkURI: kotlin.String?,
        @Parameter(description = "Determines whether to send to all users of the app if set to true for push notifications (appKey is required)") @Valid @RequestParam(value = "sendToAll", required = false) sendToAll: kotlin.Boolean?
    ): ResponseEntity<ScheduledNotificationFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Notification Template",
        operationId = "deleteNotificationTemplate",
        description = """Deletes a notification template. Developers will only be able to delete notification templates for their own applications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationTemplateResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/template/delete"
        value = [PATH_DELETE_NOTIFICATION_TEMPLATE],
        produces = ["*/*"]
    )
    fun deleteNotificationTemplate(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the notification template to delete", required = true) @Valid @RequestParam(value = "notificationTemplateId", required = true) notificationTemplateId: kotlin.Long
    ): ResponseEntity<NotificationTemplateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Scheduled Notification",
        operationId = "deleteScheduledNotification",
        description = """This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScheduledNotificationFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/schedule/delete"
        value = [PATH_DELETE_SCHEDULED_NOTIFICATION],
        produces = ["*/*"]
    )
    fun deleteScheduledNotification(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the scheduled notification to delete", required = true) @Valid @RequestParam(value = "scheduledNotificationId", required = true) scheduledNotificationId: kotlin.Long,
        @Parameter(description = "If set to true, also deletes Scheduled Notifications under the same account with the same groupingId.") @Valid @RequestParam(value = "deleteByGroupingId", required = false) deleteByGroupingId: kotlin.Boolean?
    ): ResponseEntity<ScheduledNotificationFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Notification Template",
        operationId = "getNotificationTemplate",
        description = """Get the details of a notification template. Developers will only be able to see notification templates for their own applications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationTemplateResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/template/get"
        value = [PATH_GET_NOTIFICATION_TEMPLATE],
        produces = ["*/*"]
    )
    fun getNotificationTemplate(
        @NotNull @Parameter(description = "the id of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the notification template to get", required = true) @Valid @RequestParam(value = "notificationTemplateId", required = true) notificationTemplateId: kotlin.Long
    ): ResponseEntity<NotificationTemplateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Notifications",
        operationId = "getNotifications",
        description = """Get a list of notifications for a user. If the "markAsRead" parameter is set to true, the returned notifications will be marked as "read" after the response has been sent. By default, read messages will not be returned, so to see read messages, set "returnReadMessages" to true.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationMessageListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/search"
        value = [PATH_GET_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun getNotifications(
        @Parameter(description = "the unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the account id used to view another person's notifications") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "the application key to filter messages by application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "comma separated list of EVENTS. Filters search results to only include these events. Don't include this parameter or pass in an empty string to return all event types.") @Valid @RequestParam(value = "eventType", required = false) eventType: kotlin.String?,
        @Parameter(description = "comma separated list of content ids to search notifications on") @Valid @RequestParam(value = "contentIds", required = false) contentIds: kotlin.String?,
        @Parameter(description = "comma separated list of content types to search notifications on") @Valid @RequestParam(value = "contentTypes", required = false) contentTypes: kotlin.String?,
        @Parameter(description = "comma separated list of parent ids to search notifications on") @Valid @RequestParam(value = "parentIds", required = false) parentIds: kotlin.String?,
        @Parameter(description = "comma separated list of parent types to search notifications on") @Valid @RequestParam(value = "parentTypes", required = false) parentTypes: kotlin.String?,
        @Parameter(description = "Action category used to filter notifications") @Valid @RequestParam(value = "actionCategory", required = false) actionCategory: kotlin.String?,
        @Parameter(description = "comma separated list of conduits to search notifications on") @Valid @RequestParam(value = "conduits", required = false) conduits: kotlin.String?,
        @Parameter(description = "search notifications via keyword") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "if set to true, will return notifications that have been marked as read") @Valid @RequestParam(value = "returnReadMessages", required = false) returnReadMessages: kotlin.Boolean?,
        @Parameter(description = "if set to true, the returned notifications will be marked as \\\"read\\\" after the response has been sent") @Valid @RequestParam(value = "markAsRead", required = false) markAsRead: kotlin.Boolean?,
        @Parameter(description = "filter notifications from this date") @Valid @RequestParam(value = "fromDate", required = false) fromDate: kotlin.Long?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "whether to include notifications sent by the requester in the response") @Valid @RequestParam(value = "returnSent", required = false) returnSent: kotlin.Boolean?,
        @Parameter(description = "whether to ignore flagged notifications") @Valid @RequestParam(value = "ignoreFlagged", required = false) ignoreFlagged: kotlin.Boolean?,
        @Parameter(description = "start of the pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "limit of the pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<NotificationMessageListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Scheduled Notification",
        operationId = "getScheduledNotification",
        description = """Get a ScheduledNotification""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScheduledNotificationFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/schedule/get"
        value = [PATH_GET_SCHEDULED_NOTIFICATION],
        produces = ["*/*"]
    )
    fun getScheduledNotification(
        @NotNull @Parameter(description = "the id of the account logged in", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the scheduled notification to get", required = true) @Valid @RequestParam(value = "scheduledNotificationId", required = true) scheduledNotificationId: kotlin.Long
    ): ResponseEntity<ScheduledNotificationFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Register Notification Token",
        operationId = "registerNotificationToken",
        description = """Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/token"
        value = [PATH_REGISTER_NOTIFICATION_TOKEN],
        produces = ["*/*"]
    )
    fun registerNotificationToken(
        @NotNull @Parameter(description = "A token that is generated by the device to sign requests for the notification service providers", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,
        @NotNull @Parameter(description = "The type of push notification. Possible values include: APNS, GCM", required = true, schema = Schema(allowableValues = ["APNS", "GCM", "BAIDU", "XGPUSH", "JPUSH"])) @Valid @RequestParam(value = "pushType", required = true) pushType: kotlin.String,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Determines if the token is a DEVELOPMENT or PRODUCTION token") @Valid @RequestParam(value = "environment", required = false) environment: kotlin.String?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "This parameter is deprecated (use appKey instead)") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "Sets whether the token is active or not (non-active tokens are not used)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Generate Schedule Notifications",
        operationId = "scheduleNotificationListings",
        description = """Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/schedule/generate"
        value = [PATH_SCHEDULE_NOTIFICATION_LISTINGS],
        produces = ["*/*"]
    )
    fun scheduleNotificationListings(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application to target", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the report used to identify events. The report must return columns named: id, name, date, params, and type otherwise it will fail", required = true) @Valid @RequestParam(value = "reportName", required = true) reportName: kotlin.String,
        @NotNull @Parameter(description = "The message to be sent to the recipients. If you set %name% the report row name value will be swapped in. If you set %time% or %date% the report row start date/time value will be swapped in", required = true) @Valid @RequestParam(value = "message", required = true) message: kotlin.String,
        @NotNull @Parameter(description = "Time in munites before the event starts to notify recipients", required = true) @Valid @RequestParam(value = "offset", required = true) offset: kotlin.Int,
        @NotNull @Parameter(description = "The report id used to generate the recipient list", required = true) @Valid @RequestParam(value = "recipientReportId", required = true) recipientReportId: kotlin.Long,
        @Parameter(description = "The parameters of the report used to identify events in a json structure, example: ```json {   \"string\": \"value\",   \"number\": 3.345,   \"date\": \"2014-05-01 00:00:00\" } ``` ") @Valid @RequestParam(value = "reportParams", required = false) reportParams: kotlin.String?,
        @Parameter(description = "The type of scheduled notification; supported values are: MOBILE_NOTIFICATION") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search on the user's blocked notification settings",
        operationId = "searchBlockedNotifications",
        description = """Search on the user's blocked notification settings""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = BlockedNotificationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/blocked/search"
        value = [PATH_SEARCH_BLOCKED_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun searchBlockedNotifications(
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "search tags to filter results") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "events to filter by (comma separated)") @Valid @RequestParam(value = "events", required = false) events: kotlin.String?,
        @Parameter(description = "conduits to filter by (comma separated)") @Valid @RequestParam(value = "conduits", required = false) conduits: kotlin.String?,
        @Parameter(description = "custom types to filter by (comma separated)") @Valid @RequestParam(value = "customTypes", required = false) customTypes: kotlin.String?,
        @Parameter(description = "content types to filter by (comma separated)") @Valid @RequestParam(value = "contentTypes", required = false) contentTypes: kotlin.String?,
        @Parameter(description = "content ids to filter by (comma separated)") @Valid @RequestParam(value = "contentIds", required = false) contentIds: kotlin.String?,
        @Parameter(description = "sort field for results") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "whether to sort descending") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "start of the pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "limit of the pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<BlockedNotificationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Notification Templates",
        operationId = "searchNotificationTemplate",
        description = """Search for notification templates on owned applications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationTemplateResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/template/search"
        value = [PATH_SEARCH_NOTIFICATION_TEMPLATE],
        produces = ["*/*"]
    )
    fun searchNotificationTemplate(
        @NotNull @Parameter(description = "The account ID of the user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name ('global' templates will not have an application and will be returned last if 'descending' is set to false.", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Specified whether the results are returned in descending or ascending order.", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start of the pagination.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit of the pagination.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "Filter results by application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Filter results by event.") @Valid @RequestParam(value = "event", required = false) event: kotlin.String?,
        @Parameter(description = "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @Valid @RequestParam(value = "conduit", required = false) conduit: kotlin.String?,
        @Parameter(description = "Returns only templates that have been reserved for system use on all applications (only for admin accounts).") @Valid @RequestParam(value = "globalOnly", required = false) globalOnly: kotlin.Boolean?,
        @Parameter(description = "Returns only templates that use reserved events.") @Valid @RequestParam(value = "reservedOnly", required = false) reservedOnly: kotlin.Boolean?,
        @Parameter(description = "Filter results by keyword on the title, tags.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<NotificationTemplateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search for Recipients",
        operationId = "searchRecipients",
        description = """Search for application users to send notifications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = NotificationRecipientResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/recipient/search"
        value = [PATH_SEARCH_RECIPIENTS],
        produces = ["*/*"]
    )
    fun searchRecipients(
        @NotNull @Parameter(description = "The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}", required = true, schema = Schema(allowableValues = ["ID", "HAS_SMS", "HAS_EMAIL", "HAS_APNS", "HAS_GCM", "APPLICATION_ID", "APPLICATION_NAME", "ACCOUNT_ID", "ACCOUNT_USERNAME", "ACCOUNT_DISPLAY", "ACCOUNT_TYPE"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @Parameter(description = "the unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @Valid @RequestParam(value = "conduit", required = false) conduit: kotlin.String?,
        @Parameter(description = "search by keyword on user's display name and email") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. filter results by audience") @Valid @RequestParam(value = "audienceId", required = false) audienceId: kotlin.Long?,
        @Parameter(description = "filter results by audiences (comma separated list of audience ids)") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "filter results by connection groups (comma separated list of connection group ids)") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "filter results by accounts (comma separated list of account ids)") @Valid @RequestParam(value = "recipientAccountIds", required = false) recipientAccountIds: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "start of the pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "limit of the pagination (hard limit of 1000)") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<NotificationRecipientResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search for Recipients (Counts/Grouped)",
        operationId = "searchRecipientsCount",
        description = """Search for application users to send notifications (count/grouped variant).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationRecipientResponseListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/recipient/search/count"
        value = [PATH_SEARCH_RECIPIENTS_COUNT],
        produces = ["*/*"]
    )
    fun searchRecipientsCount(
        @Parameter(description = "the unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @Valid @RequestParam(value = "conduit", required = false) conduit: kotlin.String?,
        @Parameter(description = "search by keyword on user's display name and email") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. filter results by audience") @Valid @RequestParam(value = "audienceId", required = false) audienceId: kotlin.Long?,
        @Parameter(description = "filter results by audiences (comma separated list of audience ids)") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "filter results by connection groups (comma separated list of connection group ids)") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "The field to sort by (see API docs for allowed values).") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "start of the pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "limit of the pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<NotificationRecipientResponseListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Scheduled Notifications",
        operationId = "searchScheduledNotifications",
        description = """This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.

In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScheduledNotificationFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/notification/schedule/search"
        value = [PATH_SEARCH_SCHEDULED_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun searchScheduledNotifications(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Filter results by a grouping identifier defined by the client") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "Filter results by audience") @Valid @RequestParam(value = "audienceId", required = false) audienceId: kotlin.Long?,
        @Parameter(description = "a comma separated list of filters: MINE - Return scheduled notifications that the user has created. SHARED - Return scheduled notifications that have been shared to the user via addUsersToPermissionable. FOLLOWER - Return scheduled notifications that have been created by the users followers (the content needs to have been APPROVED or FEATURED). FOLLOWING - Return scheduled notifications that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). PUBLIC - Return all PUBLIC scheduled notifications that have been APPROVED or FEATURED. ALL_PUBLIC - Return all PUBLIC scheduled notifications regardless of whether they are approved or not (ignores the approval status). LIKED - Return all scheduled notifications that the user has liked. FEATURED - Return all scheduled notifications that have been featured. PENDING - Return all pending scheduled notifications.") @Valid @RequestParam(value = "filter", required = false) filter: kotlin.String?,
        @Parameter(description = "Filter results by notification types (comma separated list). Values include: HTTP, EMAIL, SMS, MOBILE_NOTIFICATION") @Valid @RequestParam(value = "types", required = false) types: kotlin.String?,
        @Parameter(description = "search using content IDs") @Valid @RequestParam(value = "contentIds", required = false) contentIds: kotlin.String?,
        @Parameter(description = "search using content types") @Valid @RequestParam(value = "contentTypes", required = false) contentTypes: kotlin.String?,
        @Parameter(description = "search using parent IDs") @Valid @RequestParam(value = "parentIds", required = false) parentIds: kotlin.String?,
        @Parameter(description = "search using parent types") @Valid @RequestParam(value = "parentTypes", required = false) parentTypes: kotlin.String?,
        @Parameter(description = "Filter results by status (comma separated list). Possible values include: NEW - scheduled to run ERROR - encountered an error during processing COMPLETE - processing has completed and it is no longer scheduled to run PROCESSING - currently processing/sending") @Valid @RequestParam(value = "statuses", required = false) statuses: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "templateTypes", required = false) templateTypes: kotlin.String?,
        @Parameter(description = "Filter the list by a specific application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Keyword search on the scheduled notification names.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The field to sort by. Possible values include: ID - order by the scheduledNotificationId CREATED - order by the timestamp it was created UPDATED - order by the timestamp it was last updated ACTIVE - order by whether it is active or inactive NAME - order by the scheduled notification name SCHEDULED_DATE - order by the next scheduled date START_DATE - order by the start date END_DATE - order by the end date") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Start the result set at some index.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "Limit the result to some number.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Determines whether to return only active results") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "Determines whether to group results with the same groupingId together.") @Valid @RequestParam(value = "groupByGroupingId", required = false) groupByGroupingId: kotlin.Boolean?,
        @Parameter(description = "If true, include audience account counts in the response") @Valid @RequestParam(value = "returnAudienceAccountCount", required = false) returnAudienceAccountCount: kotlin.Boolean?
    ): ResponseEntity<ScheduledNotificationFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send Batch Notifications",
        operationId = "sendBatchNotifications",
        description = """Send notifications to all users of an application. Only someone with permissions to the application can do this.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/batch"
        value = [PATH_SEND_BATCH_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun sendBatchNotifications(
        @NotNull @Parameter(description = "The account id of the application owner/manager", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Message string that will be displayed in on the notification", required = true) @Valid @RequestParam(value = "customMessage", required = true) customMessage: kotlin.String,
        @Parameter(description = "The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @Valid @RequestParam(value = "conduit", required = false) conduit: kotlin.String?,
        @Parameter(description = "Default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "contentId", required = false) contentId: kotlin.Long?,
        @Parameter(description = "Default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "contentName", required = false) contentName: kotlin.String?,
        @Parameter(description = "Default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "contentType", required = false) contentType: kotlin.String?,
        @Parameter(description = "Default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "parentId", required = false) parentId: kotlin.Long?,
        @Parameter(description = "Default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "parentType", required = false) parentType: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send Custom Notifications",
        operationId = "sendCustomNotifications",
        description = """Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/custom"
        value = [PATH_SEND_CUSTOM_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun sendCustomNotifications(
        @Parameter(description = "the unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "comma separated list of account IDs that will receive the notification") @Valid @RequestParam(value = "receiverAccountIds", required = false) receiverAccountIds: kotlin.String?,
        @Parameter(description = "determines whether to send to all of the user's friends, this flag must be true or receiverAccountIds must not be empty") @Valid @RequestParam(value = "includeFriendGroup", required = false) includeFriendGroup: kotlin.Boolean?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.") @Valid @RequestParam(value = "conduit", required = false) conduit: kotlin.String?,
        @Parameter(description = "default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "contentId", required = false) contentId: kotlin.Long?,
        @Parameter(description = "default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "contentName", required = false) contentName: kotlin.String?,
        @Parameter(description = "default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "contentType", required = false) contentType: kotlin.String?,
        @Parameter(description = "default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "parentId", required = false) parentId: kotlin.Long?,
        @Parameter(description = "default notification pay-load field (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "parentType", required = false) parentType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "actionCategory", required = false) actionCategory: kotlin.String?,
        @Parameter(description = "the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)") @Valid @RequestParam(value = "subject", required = false) subject: kotlin.String?,
        @Parameter(description = "message string that will be displayed in on the notification") @Valid @RequestParam(value = "customMessage", required = false) customMessage: kotlin.String?,
        @Parameter(description = "only sends APNS to people who are friends of the user (still saves the notification message for feed polling)") @Valid @RequestParam(value = "friendOnlyAPNS", required = false) friendOnlyAPNS: kotlin.Boolean?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Notification Template",
        operationId = "updateNotificationTemplate",
        description = """Update a notification template. Developers will only be able to update notification templates for their own applications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NotificationTemplateResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/template/update"
        value = [PATH_UPDATE_NOTIFICATION_TEMPLATE],
        produces = ["*/*"]
    )
    fun updateNotificationTemplate(
        @NotNull @Parameter(description = "The account ID of the user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The notification template ID to update.", required = true) @Valid @RequestParam(value = "notificationTemplateId", required = true) notificationTemplateId: kotlin.Long,
        @Parameter(description = "The title of the message (this would become the subject title for emails). There is a 191 character limit.") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The body of the message.") @Valid @RequestParam(value = "body", required = false) body: kotlin.String?,
        @Parameter(description = "The search tags on the template used during search queries.") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?
    ): ResponseEntity<NotificationTemplateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Scheduled Notification",
        operationId = "updateScheduledNotification",
        description = """This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.

Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ScheduledNotificationFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/notification/schedule/update"
        value = [PATH_UPDATE_SCHEDULED_NOTIFICATION],
        produces = ["*/*"]
    )
    fun updateScheduledNotification(
        @NotNull @Parameter(description = "The id of scheduled notification to update", required = true) @Valid @RequestParam(value = "scheduledNotificationId", required = true) scheduledNotificationId: kotlin.Long,
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The name of the scheduled notification") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "The message to send") @Valid @RequestParam(value = "message", required = false) message: kotlin.String?,
        @Parameter(description = "The parameters for making an HTTP call") @Valid @RequestParam(value = "payload", required = false) payload: kotlin.String?,
        @Parameter(description = "The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "contentId", required = false) contentId: kotlin.Long?,
        @Parameter(description = "The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "contentName", required = false) contentName: kotlin.String?,
        @Parameter(description = "The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "contentType", required = false) contentType: kotlin.String?,
        @Parameter(description = "The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "parentId", required = false) parentId: kotlin.Long?,
        @Parameter(description = "The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.") @Valid @RequestParam(value = "parentType", required = false) parentType: kotlin.String?,
        @Parameter(description = "The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)") @Valid @RequestParam(value = "connectionGroupIds", required = false) connectionGroupIds: kotlin.String?,
        @Parameter(description = "The connection accounts to use to generate the list of recipients (comma separated list of user account ids)") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. The audience used to generate the list of recipients") @Valid @RequestParam(value = "audienceId", required = false) audienceId: kotlin.Long?,
        @Parameter(description = "The audiences used to generate the list of recipients (comma separated list of audience IDs)") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "The album ids to associate with the scheduled notification (comma separated list of album IDs)") @Valid @RequestParam(value = "albumIds", required = false) albumIds: kotlin.String?,
        @Parameter(description = "The report used to generate the the list of recipients") @Valid @RequestParam(value = "reportId", required = false) reportId: kotlin.Long?,
        @Parameter(description = "The parameters to supply to the report used to generate the the list of recipients") @Valid @RequestParam(value = "reportParams", required = false) reportParams: kotlin.String?,
        @Parameter(description = "The URL for making an HTTP call") @Valid @RequestParam(value = "endpointURL", required = false) endpointURL: kotlin.String?,
        @Parameter(description = "The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.") @Valid @RequestParam(value = "scheduledDate", required = false) scheduledDate: kotlin.Long?,
        @Parameter(description = "The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.") @Valid @RequestParam(value = "cronExpression", required = false) cronExpression: kotlin.String?,
        @Parameter(description = "The cron expression type: UNIX, CRON4J, QUARTZ") @Valid @RequestParam(value = "cronType", required = false) cronType: kotlin.String?,
        @Parameter(description = "Additional metadata for the scheduled notification") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Json input representing conditional logic that has to be met before running the scheduled notification") @Valid @RequestParam(value = "conditionalInput", required = false) conditionalInput: kotlin.String?,
        @Parameter(description = "This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered") @Valid @RequestParam(value = "templateType", required = false) templateType: kotlin.String?,
        @Parameter(description = "Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "the error message associated with the scheduled notification") @Valid @RequestParam(value = "errorMessage", required = false) errorMessage: kotlin.String?,
        @Parameter(description = "the status of the scheduled notification") @Valid @RequestParam(value = "status", required = false) status: kotlin.String?,
        @Parameter(description = "also updates ScheduledNotifications with the same groupingId and account") @Valid @RequestParam(value = "updateByGroupingId", required = false) updateByGroupingId: kotlin.Boolean?,
        @Parameter(description = "whether to send the scheduled notification now or not") @Valid @RequestParam(value = "sendNow", required = false) sendNow: kotlin.Boolean?,
        @Parameter(description = "Sets the event type for the notification", schema = Schema(defaultValue = "CUSTOM")) @Valid @RequestParam(value = "eventType", required = false, defaultValue = "CUSTOM") eventType: kotlin.String,
        @Parameter(description = "The payload deep link URI that can be used by the client app to direct users to a screen in the app") @Valid @RequestParam(value = "deepLinkURI", required = false) deepLinkURI: kotlin.String?,
        @Parameter(description = "Determines whether to send to all users of the app if set to true for push notifications (appKey is required)") @Valid @RequestParam(value = "sendToAll", required = false) sendToAll: kotlin.Boolean?
    ): ResponseEntity<ScheduledNotificationFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_NOTIFICATION_TEMPLATE: String = "/notification/template/create"
        const val PATH_CREATE_OR_UPDATE_BLOCKED_NOTIFICATIONS: String = "/notification/blocked/batch"
        const val PATH_CREATE_SCHEDULED_NOTIFICATION: String = "/notification/schedule/create"
        const val PATH_DELETE_NOTIFICATION_TEMPLATE: String = "/notification/template/delete"
        const val PATH_DELETE_SCHEDULED_NOTIFICATION: String = "/notification/schedule/delete"
        const val PATH_GET_NOTIFICATION_TEMPLATE: String = "/notification/template/get"
        const val PATH_GET_NOTIFICATIONS: String = "/notification/search"
        const val PATH_GET_SCHEDULED_NOTIFICATION: String = "/notification/schedule/get"
        const val PATH_REGISTER_NOTIFICATION_TOKEN: String = "/notification/token"
        const val PATH_SCHEDULE_NOTIFICATION_LISTINGS: String = "/notification/schedule/generate"
        const val PATH_SEARCH_BLOCKED_NOTIFICATIONS: String = "/notification/blocked/search"
        const val PATH_SEARCH_NOTIFICATION_TEMPLATE: String = "/notification/template/search"
        const val PATH_SEARCH_RECIPIENTS: String = "/notification/recipient/search"
        const val PATH_SEARCH_RECIPIENTS_COUNT: String = "/notification/recipient/search/count"
        const val PATH_SEARCH_SCHEDULED_NOTIFICATIONS: String = "/notification/schedule/search"
        const val PATH_SEND_BATCH_NOTIFICATIONS: String = "/notification/batch"
        const val PATH_SEND_CUSTOM_NOTIFICATIONS: String = "/notification/custom"
        const val PATH_UPDATE_NOTIFICATION_TEMPLATE: String = "/notification/template/update"
        const val PATH_UPDATE_SCHEDULED_NOTIFICATION: String = "/notification/schedule/update"
    }
}
