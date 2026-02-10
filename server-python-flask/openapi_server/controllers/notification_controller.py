import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.blocked_notification_response import BlockedNotificationResponse  # noqa: E501
from openapi_server.models.notification_message_list_response import NotificationMessageListResponse  # noqa: E501
from openapi_server.models.notification_recipient_response import NotificationRecipientResponse  # noqa: E501
from openapi_server.models.notification_recipient_response_list_response import NotificationRecipientResponseListResponse  # noqa: E501
from openapi_server.models.notification_template_response import NotificationTemplateResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_notification_template(version, account_id, conduit, title, body, app_key=None, event=None, tags=None):  # noqa: E501
    """Create Notification Template

    Create a notification template. Developers will only be able to create notification templates for their own applications. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account ID of the user.
    :type account_id: int
    :param conduit: Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    :type conduit: str
    :param title: title of the notification template
    :type title: str
    :param body: body of the notification template
    :type body: str
    :param app_key: Filter results by application.
    :type app_key: str
    :param event: Filter results by event.
    :type event: str
    :param tags: tags associated with the note template
    :type tags: str

    :rtype: Union[NotificationTemplateResponse, Tuple[NotificationTemplateResponse, int], Tuple[NotificationTemplateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_or_update_blocked_notifications(version, app_key, data, account_id=None):  # noqa: E501
    """Create or update blocked notification settings

    Create or update blocked notification settings # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key
    :type app_key: str
    :param data: batch data payload (application specific)
    :type data: str
    :param account_id: the account id of the user
    :type account_id: int

    :rtype: Union[BlockedNotificationResponse, Tuple[BlockedNotificationResponse, int], Tuple[BlockedNotificationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_notification_template(version, account_id, notification_template_id):  # noqa: E501
    """Delete Notification Template

    Deletes a notification template. Developers will only be able to delete notification templates for their own applications. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param notification_template_id: the id of the notification template to delete
    :type notification_template_id: int

    :rtype: Union[NotificationTemplateResponse, Tuple[NotificationTemplateResponse, int], Tuple[NotificationTemplateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notification_template(version, account_id, notification_template_id):  # noqa: E501
    """Get Notification Template

    Get the details of a notification template. Developers will only be able to see notification templates for their own applications. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account
    :type account_id: int
    :param notification_template_id: the id of the notification template to get
    :type notification_template_id: int

    :rtype: Union[NotificationTemplateResponse, Tuple[NotificationTemplateResponse, int], Tuple[NotificationTemplateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notifications(version, device_id=None, account_id=None, connection_account_id=None, app_key=None, event_type=None, content_ids=None, content_types=None, parent_ids=None, parent_types=None, action_category=None, conduits=None, keyword=None, return_read_messages=None, mark_as_read=None, from_date=None, latitude=None, longitude=None, return_sent=None, ignore_flagged=None, start=None, limit=None):  # noqa: E501
    """Get Notifications

    Get a list of notifications for a user. If the \&quot;markAsRead\&quot; parameter is set to true, the returned notifications will be marked as \&quot;read\&quot; after the response has been sent. By default, read messages will not be returned, so to see read messages, set \&quot;returnReadMessages\&quot; to true. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: the account id used to view another person&#39;s notifications
    :type connection_account_id: int
    :param app_key: the application key to filter messages by application
    :type app_key: str
    :param event_type: comma separated list of EVENTS. Filters search results to only include these events. Don&#39;t include this parameter or pass in an empty string to return all event types.
    :type event_type: str
    :param content_ids: comma separated list of content ids to search notifications on
    :type content_ids: str
    :param content_types: comma separated list of content types to search notifications on
    :type content_types: str
    :param parent_ids: comma separated list of parent ids to search notifications on
    :type parent_ids: str
    :param parent_types: comma separated list of parent types to search notifications on
    :type parent_types: str
    :param action_category: Action category used to filter notifications
    :type action_category: str
    :param conduits: comma separated list of conduits to search notifications on
    :type conduits: str
    :param keyword: search notifications via keyword
    :type keyword: str
    :param return_read_messages: if set to true, will return notifications that have been marked as read
    :type return_read_messages: bool
    :param mark_as_read: if set to true, the returned notifications will be marked as \\\&quot;read\\\&quot; after the response has been sent
    :type mark_as_read: bool
    :param from_date: filter notifications from this date
    :type from_date: int
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float
    :param return_sent: whether to include notifications sent by the requester in the response
    :type return_sent: bool
    :param ignore_flagged: whether to ignore flagged notifications
    :type ignore_flagged: bool
    :param start: start of the pagination
    :type start: int
    :param limit: limit of the pagination
    :type limit: int

    :rtype: Union[NotificationMessageListResponse, Tuple[NotificationMessageListResponse, int], Tuple[NotificationMessageListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def register_notification_token(version, token, push_type, device_id=None, account_id=None, environment=None, app_key=None, game_type=None, active=None, latitude=None, longitude=None):  # noqa: E501
    """Register Notification Token

    Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications. # noqa: E501

    :param version: 
    :type version: 
    :param token: A token that is generated by the device to sign requests for the notification service providers
    :type token: str
    :param push_type: The type of push notification. Possible values include: APNS, GCM
    :type push_type: str
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param environment: Determines if the token is a DEVELOPMENT or PRODUCTION token
    :type environment: str
    :param app_key: The application key
    :type app_key: str
    :param game_type: This parameter is deprecated (use appKey instead)
    :type game_type: str
    :param active: Sets whether the token is active or not (non-active tokens are not used)
    :type active: bool
    :param latitude: Latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_blocked_notifications(version, app_key, account_id=None, search_tags=None, events=None, conduits=None, custom_types=None, content_types=None, content_ids=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search on the user&#39;s blocked notification settings

    Search on the user&#39;s blocked notification settings # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key
    :type app_key: str
    :param account_id: the account id of the user
    :type account_id: int
    :param search_tags: search tags to filter results
    :type search_tags: str
    :param events: events to filter by (comma separated)
    :type events: str
    :param conduits: conduits to filter by (comma separated)
    :type conduits: str
    :param custom_types: custom types to filter by (comma separated)
    :type custom_types: str
    :param content_types: content types to filter by (comma separated)
    :type content_types: str
    :param content_ids: content ids to filter by (comma separated)
    :type content_ids: str
    :param sort_field: sort field for results
    :type sort_field: str
    :param descending: whether to sort descending
    :type descending: bool
    :param start: start of the pagination
    :type start: int
    :param limit: limit of the pagination
    :type limit: int

    :rtype: Union[BlockedNotificationResponse, Tuple[BlockedNotificationResponse, int], Tuple[BlockedNotificationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_notification_template(version, account_id, sort_field, descending, start, limit, app_key=None, event=None, conduit=None, global_only=None, reserved_only=None, keyword=None):  # noqa: E501
    """Search Notification Templates

    Search for notification templates on owned applications. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account ID of the user.
    :type account_id: int
    :param sort_field: Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name (&#39;global&#39; templates will not have an application and will be returned last if &#39;descending&#39; is set to false.
    :type sort_field: str
    :param descending: Specified whether the results are returned in descending or ascending order.
    :type descending: bool
    :param start: The start of the pagination.
    :type start: int
    :param limit: The limit of the pagination.
    :type limit: int
    :param app_key: Filter results by application.
    :type app_key: str
    :param event: Filter results by event.
    :type event: str
    :param conduit: Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    :type conduit: str
    :param global_only: Returns only templates that have been reserved for system use on all applications (only for admin accounts).
    :type global_only: bool
    :param reserved_only: Returns only templates that use reserved events.
    :type reserved_only: bool
    :param keyword: Filter results by keyword on the title, tags.
    :type keyword: str

    :rtype: Union[NotificationTemplateResponse, Tuple[NotificationTemplateResponse, int], Tuple[NotificationTemplateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_recipients(version, sort_field, device_id=None, account_id=None, app_key=None, conduit=None, keyword=None, audience_id=None, audience_ids=None, connection_group_ids=None, recipient_account_ids=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search for Recipients

    Search for application users to send notifications. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}
    :type sort_field: str
    :param device_id: the unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: filters results by application. If this is empty, will return all recipients for all applications that the user has access to.
    :type app_key: str
    :param conduit: the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    :type conduit: str
    :param keyword: search by keyword on user&#39;s display name and email
    :type keyword: str
    :param audience_id: This parameter is deprecated. filter results by audience
    :type audience_id: int
    :param audience_ids: filter results by audiences (comma separated list of audience ids)
    :type audience_ids: str
    :param connection_group_ids: filter results by connection groups (comma separated list of connection group ids)
    :type connection_group_ids: str
    :param recipient_account_ids: filter results by accounts (comma separated list of account ids)
    :type recipient_account_ids: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: start of the pagination
    :type start: int
    :param limit: limit of the pagination (hard limit of 1000)
    :type limit: int

    :rtype: Union[List[NotificationRecipientResponse], Tuple[List[NotificationRecipientResponse], int], Tuple[List[NotificationRecipientResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_recipients_count(version, device_id=None, account_id=None, app_key=None, conduit=None, keyword=None, audience_id=None, audience_ids=None, connection_group_ids=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search for Recipients (Counts/Grouped)

    Search for application users to send notifications (count/grouped variant). # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: filters results by application. If this is empty, will return all recipients for all applications that the user has access to.
    :type app_key: str
    :param conduit: the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    :type conduit: str
    :param keyword: search by keyword on user&#39;s display name and email
    :type keyword: str
    :param audience_id: This parameter is deprecated. filter results by audience
    :type audience_id: int
    :param audience_ids: filter results by audiences (comma separated list of audience ids)
    :type audience_ids: str
    :param connection_group_ids: filter results by connection groups (comma separated list of connection group ids)
    :type connection_group_ids: str
    :param sort_field: The field to sort by (see API docs for allowed values).
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: start of the pagination
    :type start: int
    :param limit: limit of the pagination
    :type limit: int

    :rtype: Union[NotificationRecipientResponseListResponse, Tuple[NotificationRecipientResponseListResponse, int], Tuple[NotificationRecipientResponseListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_batch_notifications(version, account_id, app_key, custom_message, conduit=None, content_id=None, content_name=None, content_type=None, parent_id=None, parent_type=None):  # noqa: E501
    """Send Batch Notifications

    Send notifications to all users of an application. Only someone with permissions to the application can do this. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the application owner/manager
    :type account_id: int
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param custom_message: Message string that will be displayed in on the notification
    :type custom_message: str
    :param conduit: The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    :type conduit: str
    :param content_id: Default notification pay-load field (usage is dependent on the app and the type of event)
    :type content_id: int
    :param content_name: Default notification pay-load field (usage is dependent on the app and the type of event)
    :type content_name: str
    :param content_type: Default notification pay-load field (usage is dependent on the app and the type of event)
    :type content_type: str
    :param parent_id: Default notification pay-load field (usage is dependent on the app and the type of event)
    :type parent_id: int
    :param parent_type: Default notification pay-load field (usage is dependent on the app and the type of event)
    :type parent_type: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_custom_notifications(version, device_id=None, account_id=None, receiver_account_ids=None, include_friend_group=None, app_key=None, game_type=None, conduit=None, content_id=None, content_name=None, content_type=None, parent_id=None, parent_type=None, action_category=None, subject=None, custom_message=None, friend_only_apns=None, latitude=None, longitude=None):  # noqa: E501
    """Send Custom Notifications

    Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param receiver_account_ids: comma separated list of account IDs that will receive the notification
    :type receiver_account_ids: str
    :param include_friend_group: determines whether to send to all of the user&#39;s friends, this flag must be true or receiverAccountIds must not be empty
    :type include_friend_group: bool
    :param app_key: the application key
    :type app_key: str
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param conduit: the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    :type conduit: str
    :param content_id: default notification pay-load field (usage is dependent on the app and the type of event)
    :type content_id: int
    :param content_name: default notification pay-load field (usage is dependent on the app and the type of event)
    :type content_name: str
    :param content_type: default notification pay-load field (usage is dependent on the app and the type of event)
    :type content_type: str
    :param parent_id: default notification pay-load field (usage is dependent on the app and the type of event)
    :type parent_id: int
    :param parent_type: default notification pay-load field (usage is dependent on the app and the type of event)
    :type parent_type: str
    :param action_category: 
    :type action_category: str
    :param subject: the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)
    :type subject: str
    :param custom_message: message string that will be displayed in on the notification
    :type custom_message: str
    :param friend_only_apns: only sends APNS to people who are friends of the user (still saves the notification message for feed polling)
    :type friend_only_apns: bool
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_notification_template(version, account_id, notification_template_id, title=None, body=None, tags=None):  # noqa: E501
    """Update Notification Template

    Update a notification template. Developers will only be able to update notification templates for their own applications. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account ID of the user.
    :type account_id: int
    :param notification_template_id: The notification template ID to update.
    :type notification_template_id: int
    :param title: The title of the message (this would become the subject title for emails). There is a 191 character limit.
    :type title: str
    :param body: The body of the message.
    :type body: str
    :param tags: The search tags on the template used during search queries.
    :type tags: str

    :rtype: Union[NotificationTemplateResponse, Tuple[NotificationTemplateResponse, int], Tuple[NotificationTemplateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
