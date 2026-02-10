import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.scheduled_notification_full_response import ScheduledNotificationFullResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_scheduled_notification(version, account_id, name, type, message, content_id=None, content_name=None, content_type=None, parent_id=None, parent_type=None, app_key=None, grouping_id=None, connection_group_ids=None, connection_account_ids=None, audience_id=None, audience_ids=None, album_ids=None, report_id=None, report_params=None, endpoint_url=None, payload=None, scheduled_date=None, start_date=None, end_date=None, cron_expression=None, cron_type=None, meta_data=None, conditional_input=None, template_type=None, visibility=None, active=None, send_now=None, event_type=None, deep_link_uri=None, send_to_all=None):  # noqa: E501
    """Create Scheduled Notification

    This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the scheduled notification
    :type name: str
    :param type: The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages
    :type type: str
    :param message: The message to send
    :type message: str
    :param content_id: The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type content_id: int
    :param content_name: The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type content_name: str
    :param content_type: The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type content_type: str
    :param parent_id: The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type parent_id: int
    :param parent_type: The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type parent_type: str
    :param app_key: The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.
    :type app_key: str
    :param grouping_id: Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.
    :type grouping_id: str
    :param connection_group_ids: The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)
    :type connection_group_ids: str
    :param connection_account_ids: The connection accounts to use to generate the list of recipients (comma separated list of user account ids)
    :type connection_account_ids: str
    :param audience_id: This parameter is deprecated. The audience used to generate the list of recipients
    :type audience_id: int
    :param audience_ids: The audiences used to generate the list of recipients (comma separated list of audience IDs)
    :type audience_ids: str
    :param album_ids: The album ids to associate with the scheduled notification (comma separated list of album IDs)
    :type album_ids: str
    :param report_id: The report used to generate the the list of recipients
    :type report_id: int
    :param report_params: The parameters to supply to the report used to generate the the list of recipients
    :type report_params: str
    :param endpoint_url: The URL for making an HTTP call
    :type endpoint_url: str
    :param payload: The parameters for making an HTTP call
    :type payload: str
    :param scheduled_date: The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.
    :type scheduled_date: int
    :param start_date: The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.
    :type start_date: int
    :param end_date: The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.
    :type end_date: int
    :param cron_expression: The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.
    :type cron_expression: str
    :param cron_type: The cron expression type: UNIX, CRON4J, QUARTZ
    :type cron_type: str
    :param meta_data: Additional metadata for the scheduled notification
    :type meta_data: str
    :param conditional_input: Json input representing conditional logic that has to be met before running the scheduled notification
    :type conditional_input: str
    :param template_type: This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered
    :type template_type: str
    :param visibility: Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    :type visibility: str
    :param active: Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule. The default value is &#39;true&#39;.
    :type active: bool
    :param send_now: 
    :type send_now: bool
    :param event_type: Sets the event type for the notification
    :type event_type: str
    :param deep_link_uri: The payload deep link URI that can be used by the client app to direct users to a screen in the app
    :type deep_link_uri: str
    :param send_to_all: Determines whether to send to all users of the app if set to true for push notifications (appKey is required)
    :type send_to_all: bool

    :rtype: Union[ScheduledNotificationFullResponse, Tuple[ScheduledNotificationFullResponse, int], Tuple[ScheduledNotificationFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_scheduled_notification(version, account_id, scheduled_notification_id, delete_by_grouping_id=None):  # noqa: E501
    """Delete Scheduled Notification

    This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param scheduled_notification_id: the id of the scheduled notification to delete
    :type scheduled_notification_id: int
    :param delete_by_grouping_id: If set to true, also deletes Scheduled Notifications under the same account with the same groupingId.
    :type delete_by_grouping_id: bool

    :rtype: Union[ScheduledNotificationFullResponse, Tuple[ScheduledNotificationFullResponse, int], Tuple[ScheduledNotificationFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_scheduled_notification(version, account_id, scheduled_notification_id):  # noqa: E501
    """Get Scheduled Notification

    Get a ScheduledNotification # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account logged in
    :type account_id: int
    :param scheduled_notification_id: the id of the scheduled notification to get
    :type scheduled_notification_id: int

    :rtype: Union[ScheduledNotificationFullResponse, Tuple[ScheduledNotificationFullResponse, int], Tuple[ScheduledNotificationFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def schedule_notification_listings(version, account_id, app_key, report_name, message, offset, recipient_report_id, report_params=None, type=None):  # noqa: E501
    """Generate Schedule Notifications

    Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The application to target
    :type app_key: str
    :param report_name: The name of the report used to identify events. The report must return columns named: id, name, date, params, and type otherwise it will fail
    :type report_name: str
    :param message: The message to be sent to the recipients. If you set %name% the report row name value will be swapped in. If you set %time% or %date% the report row start date/time value will be swapped in
    :type message: str
    :param offset: Time in munites before the event starts to notify recipients
    :type offset: int
    :param recipient_report_id: The report id used to generate the recipient list
    :type recipient_report_id: int
    :param report_params: The parameters of the report used to identify events in a json structure, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;: \&quot;value\&quot;,   \&quot;number\&quot;: 3.345,   \&quot;date\&quot;: \&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    :type report_params: str
    :param type: The type of scheduled notification; supported values are: MOBILE_NOTIFICATION
    :type type: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_scheduled_notifications(version, account_id, grouping_id=None, audience_id=None, filter=None, types=None, content_ids=None, content_types=None, parent_ids=None, parent_types=None, statuses=None, template_types=None, app_key=None, keyword=None, sort_field=None, descending=None, start=None, limit=None, active_only=None, group_by_grouping_id=None, return_audience_account_count=None):  # noqa: E501
    """Search Scheduled Notifications

    This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param grouping_id: Filter results by a grouping identifier defined by the client
    :type grouping_id: str
    :param audience_id: Filter results by audience
    :type audience_id: int
    :param filter: a comma separated list of filters: MINE - Return scheduled notifications that the user has created. SHARED - Return scheduled notifications that have been shared to the user via addUsersToPermissionable. FOLLOWER - Return scheduled notifications that have been created by the users followers (the content needs to have been APPROVED or FEATURED). FOLLOWING - Return scheduled notifications that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). PUBLIC - Return all PUBLIC scheduled notifications that have been APPROVED or FEATURED. ALL_PUBLIC - Return all PUBLIC scheduled notifications regardless of whether they are approved or not (ignores the approval status). LIKED - Return all scheduled notifications that the user has liked. FEATURED - Return all scheduled notifications that have been featured. PENDING - Return all pending scheduled notifications.
    :type filter: str
    :param types: Filter results by notification types (comma separated list). Values include: HTTP, EMAIL, SMS, MOBILE_NOTIFICATION
    :type types: str
    :param content_ids: search using content IDs
    :type content_ids: str
    :param content_types: search using content types
    :type content_types: str
    :param parent_ids: search using parent IDs
    :type parent_ids: str
    :param parent_types: search using parent types
    :type parent_types: str
    :param statuses: Filter results by status (comma separated list). Possible values include: NEW - scheduled to run ERROR - encountered an error during processing COMPLETE - processing has completed and it is no longer scheduled to run PROCESSING - currently processing/sending
    :type statuses: str
    :param template_types: 
    :type template_types: str
    :param app_key: Filter the list by a specific application
    :type app_key: str
    :param keyword: Keyword search on the scheduled notification names.
    :type keyword: str
    :param sort_field: The field to sort by. Possible values include: ID - order by the scheduledNotificationId CREATED - order by the timestamp it was created UPDATED - order by the timestamp it was last updated ACTIVE - order by whether it is active or inactive NAME - order by the scheduled notification name SCHEDULED_DATE - order by the next scheduled date START_DATE - order by the start date END_DATE - order by the end date
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number.
    :type limit: int
    :param active_only: Determines whether to return only active results
    :type active_only: bool
    :param group_by_grouping_id: Determines whether to group results with the same groupingId together.
    :type group_by_grouping_id: bool
    :param return_audience_account_count: If true, include audience account counts in the response
    :type return_audience_account_count: bool

    :rtype: Union[ScheduledNotificationFullResponse, Tuple[ScheduledNotificationFullResponse, int], Tuple[ScheduledNotificationFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_scheduled_notification(version, scheduled_notification_id, account_id, name=None, type=None, message=None, payload=None, content_id=None, content_name=None, content_type=None, parent_id=None, parent_type=None, app_key=None, grouping_id=None, connection_group_ids=None, connection_account_ids=None, audience_id=None, audience_ids=None, album_ids=None, report_id=None, report_params=None, endpoint_url=None, scheduled_date=None, start_date=None, end_date=None, cron_expression=None, cron_type=None, meta_data=None, conditional_input=None, template_type=None, visibility=None, active=None, error_message=None, status=None, update_by_grouping_id=None, send_now=None, event_type=None, deep_link_uri=None, send_to_all=None):  # noqa: E501
    """Update Scheduled Notification

    This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi. # noqa: E501

    :param version: 
    :type version: 
    :param scheduled_notification_id: The id of scheduled notification to update
    :type scheduled_notification_id: int
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the scheduled notification
    :type name: str
    :param type: The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages
    :type type: str
    :param message: The message to send
    :type message: str
    :param payload: The parameters for making an HTTP call
    :type payload: str
    :param content_id: The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type content_id: int
    :param content_name: The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type content_name: str
    :param content_type: The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type content_type: str
    :param parent_id: The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type parent_id: int
    :param parent_type: The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    :type parent_type: str
    :param app_key: The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.
    :type app_key: str
    :param grouping_id: Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.
    :type grouping_id: str
    :param connection_group_ids: The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)
    :type connection_group_ids: str
    :param connection_account_ids: The connection accounts to use to generate the list of recipients (comma separated list of user account ids)
    :type connection_account_ids: str
    :param audience_id: This parameter is deprecated. The audience used to generate the list of recipients
    :type audience_id: int
    :param audience_ids: The audiences used to generate the list of recipients (comma separated list of audience IDs)
    :type audience_ids: str
    :param album_ids: The album ids to associate with the scheduled notification (comma separated list of album IDs)
    :type album_ids: str
    :param report_id: The report used to generate the the list of recipients
    :type report_id: int
    :param report_params: The parameters to supply to the report used to generate the the list of recipients
    :type report_params: str
    :param endpoint_url: The URL for making an HTTP call
    :type endpoint_url: str
    :param scheduled_date: The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.
    :type scheduled_date: int
    :param start_date: The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.
    :type start_date: int
    :param end_date: The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.
    :type end_date: int
    :param cron_expression: The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.
    :type cron_expression: str
    :param cron_type: The cron expression type: UNIX, CRON4J, QUARTZ
    :type cron_type: str
    :param meta_data: Additional metadata for the scheduled notification
    :type meta_data: str
    :param conditional_input: Json input representing conditional logic that has to be met before running the scheduled notification
    :type conditional_input: str
    :param template_type: This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered
    :type template_type: str
    :param visibility: Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    :type visibility: str
    :param active: Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule.
    :type active: bool
    :param error_message: the error message associated with the scheduled notification
    :type error_message: str
    :param status: the status of the scheduled notification
    :type status: str
    :param update_by_grouping_id: also updates ScheduledNotifications with the same groupingId and account
    :type update_by_grouping_id: bool
    :param send_now: whether to send the scheduled notification now or not
    :type send_now: bool
    :param event_type: Sets the event type for the notification
    :type event_type: str
    :param deep_link_uri: The payload deep link URI that can be used by the client app to direct users to a screen in the app
    :type deep_link_uri: str
    :param send_to_all: Determines whether to send to all users of the app if set to true for push notifications (appKey is required)
    :type send_to_all: bool

    :rtype: Union[ScheduledNotificationFullResponse, Tuple[ScheduledNotificationFullResponse, int], Tuple[ScheduledNotificationFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
