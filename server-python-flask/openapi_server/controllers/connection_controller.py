import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.connection_group_response import ConnectionGroupResponse  # noqa: E501
from openapi_server.models.connection_info_response import ConnectionInfoResponse  # noqa: E501
from openapi_server.models.connection_list_response import ConnectionListResponse  # noqa: E501
from openapi_server.models.connection_response import ConnectionResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def add_connection_to_group(version, return_nulls, group_id, device_id=None, account_id=None, connection_id=None, connection_account_id=None, pending_id=None, latitude=None, longitude=None):  # noqa: E501
    """Add Connection

    Adds a connection to a group. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param group_id: the group id
    :type group_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_id: the connection id
    :type connection_id: int
    :param connection_account_id: the connection account id
    :type connection_account_id: int
    :param pending_id: the pending id
    :type pending_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def add_connections_to_group(version, connection_group_id, device_id=None, account_id=None, connection_ids=None, connection_account_ids=None, latitude=None, longitude=None):  # noqa: E501
    """Add Connections

    Adds a list of connections to a group. # noqa: E501

    :param version: 
    :type version: 
    :param connection_group_id: the connection group ID
    :type connection_group_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_ids: comma separated list of connection ids
    :type connection_ids: str
    :param connection_account_ids: comma separated list of connection account ids
    :type connection_account_ids: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def add_sub_groups(version, return_nulls, group_id, sub_group_ids, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Add Connection Groups

    Add sub groups to a group. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param group_id: the parent group id
    :type group_id: int
    :param sub_group_ids: comma separated list of group IDs to add to the parent group
    :type sub_group_ids: str
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[ConnectionGroupResponse, Tuple[ConnectionGroupResponse, int], Tuple[ConnectionGroupResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_or_update_connection(version, device_id=None, account_id=None, connection_id=None, connection_account_id=None, pending_id=None, group_id=None, game_type=None, app_key=None, is_trusted=None, ignore_friend_request=None, is_contact=None, is_blocked=None, is_following=None, connection_response=None):  # noqa: E501
    """Create or Update Connection

    Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_id: the connection id for editing
    :type connection_id: int
    :param connection_account_id: the connection account id (i.e. the account id of another user)
    :type connection_account_id: int
    :param pending_id: the pending id (usually for people who do not have a Sirqul account but are already friends via other third party apps)
    :type pending_id: int
    :param group_id: optional group id if the user wants to add this person into a group
    :type group_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param is_trusted: determines whether the user is trusting this account
    :type is_trusted: bool
    :param ignore_friend_request: determines whether the user has set to ignore the user&#39;s friend request
    :type ignore_friend_request: bool
    :param is_contact: determines whether the user is a contact of this account
    :type is_contact: bool
    :param is_blocked: determines whether the user is blocking this account
    :type is_blocked: bool
    :param is_following: determines whether the user is following this account
    :type is_following: bool
    :param connection_response: whether to return the connection response or not
    :type connection_response: bool

    :rtype: Union[ConnectionResponse, Tuple[ConnectionResponse, int], Tuple[ConnectionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_or_update_group(version, return_nulls, device_id=None, account_id=None, name=None, group_id=None, asset_id=None, connections=None, description=None, can_view_profile_info=None, can_view_game_info=None, can_view_friend_info=None, active=None, latitude=None, longitude=None):  # noqa: E501
    """Create or Update Connection Group

    Creates a new private group. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param name: the name of the group
    :type name: str
    :param group_id: the group id to update a group (don&#39;t pass anything in if you want to create a new group)
    :type group_id: int
    :param asset_id: the asset to attach to the group
    :type asset_id: int
    :param connections: comma separated list of connection IDs
    :type connections: str
    :param description: the description of the group
    :type description: str
    :param can_view_profile_info: determines whether the connections in the group can see the user&#39;s profile info
    :type can_view_profile_info: bool
    :param can_view_game_info: determines whether the connections in the group can see the user&#39;s game info
    :type can_view_game_info: bool
    :param can_view_friend_info: determines whether the connections in the group can see the user&#39;s friends/connections
    :type can_view_friend_info: bool
    :param active: Sets whether the connection group is active or inactive
    :type active: bool
    :param latitude: the latitude of the group
    :type latitude: float
    :param longitude: the longitude of the group
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def follow_accept(version, account_id, connection_account_id, app_key):  # noqa: E501
    """Accept Follow Request

    Accept someone&#39;s follow request. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param connection_account_id: the account ID of the user who initiated the follow
    :type connection_account_id: int
    :param app_key: the application key for sending notifications
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def follow_reject(version, account_id, connection_account_id, app_key):  # noqa: E501
    """Reject Follow Request

    Reject someone&#39;s follow request or remove them as a follower. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param connection_account_id: the account ID of the user who initiated the follow
    :type connection_account_id: int
    :param app_key: the application key for sending notifications
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def follow_remove(version, account_id, connection_account_id, app_key):  # noqa: E501
    """Remove Follower / Unfollow

    Unfollow someone you are following or remove them as a follower. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param connection_account_id: the account ID of the user who you want to unfollow
    :type connection_account_id: int
    :param app_key: the application key for sending notifications
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def follow_request(version, account_id, connection_account_id, app_key, approval_needed=None):  # noqa: E501
    """Send Follow Request

    Send a request to follow someone. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param connection_account_id: the account ID of the user who you want to follow
    :type connection_account_id: int
    :param app_key: the application key for sending notifications
    :type app_key: str
    :param approval_needed: determines if the other user needs to confirm the follow request
    :type approval_needed: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def friend_accept(version, friend_account_id, notify_friend, device_id=None, account_id=None, game_type=None, app_key=None, notification_message=None):  # noqa: E501
    """Accept Friend

    Accept a friend request and optionally sends a notification. # noqa: E501

    :param version: 
    :type version: 
    :param friend_account_id: the friend&#39;s account id
    :type friend_account_id: int
    :param notify_friend: determines whether to send a notification to the afflicting party
    :type notify_friend: bool
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param notification_message: optional message to send in a notification
    :type notification_message: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def friend_reject(version, friend_account_id, device_id=None, account_id=None, game_type=None, app_key=None, notify_friend=None, notification_message=None):  # noqa: E501
    """Decline Friend

    Request a friend request and optionally sends a notification. # noqa: E501

    :param version: 
    :type version: 
    :param friend_account_id: the friend&#39;s account id
    :type friend_account_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param notify_friend: determines whether to send a notification to the afflicting party
    :type notify_friend: bool
    :param notification_message: optional message to send in a notification
    :type notification_message: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def friend_remove(version, friend_account_id, device_id=None, account_id=None, notify_friend=None, remove_from_groups=None):  # noqa: E501
    """Delete Friend

    Removes a friend from the user&#39;s friends list. # noqa: E501

    :param version: 
    :type version: 
    :param friend_account_id: the account ID of the friend to remove
    :type friend_account_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param notify_friend: optionally notifies the connection that they have been removed as a friend
    :type notify_friend: bool
    :param remove_from_groups: optionally removes the connection from the user&#39;s groups
    :type remove_from_groups: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def friend_request(version, friend_account_id, device_id=None, account_id=None, game_type=None, app_key=None, notification_message=None):  # noqa: E501
    """Request Friend

    Sends a friend request notification to another user. # noqa: E501

    :param version: 
    :type version: 
    :param friend_account_id: the friend&#39;s account id
    :type friend_account_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param notification_message: optional message to send in a notification
    :type notification_message: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_connection_sent_friend_requests(version, device_id=None, account_id=None):  # noqa: E501
    """Get Sent Friend Requests

    Gets the connection sent friend requests. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the ID of the device
    :type device_id: str
    :param account_id: the id of the account
    :type account_id: int

    :rtype: Union[ConnectionListResponse, Tuple[ConnectionListResponse, int], Tuple[ConnectionListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_connections(version, return_nulls, filter, sort_field, descending, start, limit, device_id=None, account_id=None, connection_account_id=None, q=None, keyword=None, i=None, l=None, latitude=None, longitude=None):  # noqa: E501
    """Search Connections

    Gets the connections. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param filter: a comma separated list of ConnectionApiMap. (NOTE on FOLLOWER vs FOLLOWING: FOLLOWER will get me a list of followers, FOLLOWING will get me a list of people I am following)
    :type filter: str
    :param sort_field: sorts the response list by ConnectionApiMap
    :type sort_field: str
    :param descending: sorts the response list by descending order if true
    :type descending: bool
    :param start: start index of the pagination
    :type start: int
    :param limit: limit of the pagination
    :type limit: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: optional parameter to search on other account&#39;s connections
    :type connection_account_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: an optional keyword to search on, this parameter is ignored if empty
    :type keyword: str
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[ConnectionListResponse, Tuple[ConnectionListResponse, int], Tuple[ConnectionListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_group_details(version, combine_connections, device_id=None, account_id=None, group_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Connection Group

     # noqa: E501

    :param version: 
    :type version: 
    :param combine_connections: whether to combine connections or not
    :type combine_connections: bool
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param group_id: the group id
    :type group_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[ConnectionGroupResponse, Tuple[ConnectionGroupResponse, int], Tuple[ConnectionGroupResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def group_search(version, sort_field, descending, active_only, start, limit, device_id=None, account_id=None, latitude=None, longitude=None, keyword=None):  # noqa: E501
    """Search Connection Groups

    Gets a user&#39;s private groups and default groups. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: the field to sort by
    :type sort_field: str
    :param descending: whether to return results in descending or ascending order
    :type descending: bool
    :param active_only: to search on active only or not
    :type active_only: bool
    :param start: The start of the pagination
    :type start: int
    :param limit: the limit of the pagination
    :type limit: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param keyword: keyword search string
    :type keyword: str

    :rtype: Union[List[ConnectionInfoResponse], Tuple[List[ConnectionInfoResponse], int], Tuple[List[ConnectionInfoResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_connection_from_group(version, return_nulls, group_id, device_id=None, account_id=None, connection_id=None, connection_account_id=None, pending_id=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Connection

    Removes the connection from group. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param group_id: the group id
    :type group_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_id: the connection id
    :type connection_id: int
    :param connection_account_id: the connection account id
    :type connection_account_id: int
    :param pending_id: the pending id
    :type pending_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_connections_from_group(version, connection_group_id, device_id=None, account_id=None, connection_ids=None, connection_account_ids=None, latitude=None, longitude=None):  # noqa: E501
    """Remove Connections

    Remove a list of connections from a group. # noqa: E501

    :param version: 
    :type version: 
    :param connection_group_id: connection group id
    :type connection_group_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_ids: comma separated list of connection ids
    :type connection_ids: str
    :param connection_account_ids: comma separated list of connection account ids
    :type connection_account_ids: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_group(version, return_nulls, group_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Connection Group

    Remove a user&#39;s group. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param group_id: the group id
    :type group_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_sub_groups(version, return_nulls, group_id, sub_group_ids, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Remove Connection Groups

    Remove sub groups from a group # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param group_id: the parent group id
    :type group_id: int
    :param sub_group_ids: comma separated list of group IDs to remove from the parent group
    :type sub_group_ids: str
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_connections(version, return_nulls, start, limit, device_id=None, account_id=None, q=None, keyword=None, latitude=None, longitude=None, game_type=None, app_key=None, i=None, l=None, sort_field=None, has_location=None):  # noqa: E501
    """Search Possible Connections

    Search for accounts that the user may not have a connection with. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: return all json attributes if true. defualt is true.
    :type return_nulls: bool
    :param start: start index of the pagination
    :type start: int
    :param limit: limit of the pagination
    :type limit: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id (deviceId or accountId required)
    :type account_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: keyword to search on, optional and this parameter is ignored if empt
    :type keyword: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the public application key, if provided only looks for users of that application
    :type app_key: str
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param sort_field: the field to sort on
    :type sort_field: str
    :param has_location: whether the search has location or not
    :type has_location: bool

    :rtype: Union[ConnectionListResponse, Tuple[ConnectionListResponse, int], Tuple[ConnectionListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
