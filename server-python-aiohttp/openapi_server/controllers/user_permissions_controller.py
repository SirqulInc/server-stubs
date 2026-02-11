from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.user_permissions_response import UserPermissionsResponse
from openapi_server import util


async def add_users_to_permissionable(request: web.Request, permissionable_type, permissionable_id, device_id=None, account_id=None, read=None, write=None, delete=None, add=None, connection_ids=None, connection_account_ids=None, connection_group_ids=None, pending=None, admin=None, include_friend_group=None, latitude=None, longitude=None, audience_ids=None) -> web.Response:
    """Add User

    Adds a user to a permissionable object.

    :param permissionable_type: the permissionable type of the object
    :type permissionable_type: str
    :param permissionable_id: the id of the permissionable object
    :type permissionable_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param read: the read permission of the users/groups
    :type read: bool
    :param write: the write permission of the users/groups
    :type write: bool
    :param delete: the delete permission of the users/groups
    :type delete: bool
    :param add: the add permission of the users/groups
    :type add: bool
    :param connection_ids: a comma separated list of connection ids (NOT the account ids)
    :type connection_ids: str
    :param connection_account_ids: a comma separated list of account ids
    :type connection_account_ids: str
    :param connection_group_ids: a comma separated list of connection group ids (these are groups made by the user)
    :type connection_group_ids: str
    :param pending: sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)
    :type pending: bool
    :param admin: sets whether the added users will become admins or not
    :type admin: bool
    :param include_friend_group: flag to determine whether to include the built-in \&quot;friends\&quot; group
    :type include_friend_group: bool
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param audience_ids: comma separated list of audience ids. This is a feature only available to the permissionable&#39;s application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.
    :type audience_ids: str

    """
    return web.Response(status=200)


async def approve_permissionable(request: web.Request, permissionable_type, permissionable_id, device_id=None, account_id=None, approval_status=None) -> web.Response:
    """Approve Permissionable

    Sets the approval status of a permissionable object.

    :param permissionable_type: The permissionable type of the object
    :type permissionable_type: str
    :param permissionable_id: The id of the permissionable object
    :type permissionable_id: int
    :param device_id: A unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param approval_status: The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    :type approval_status: str

    """
    return web.Response(status=200)


async def leave_from_permissionable(request: web.Request, permissionable_type, permissionable_id, device_id=None, account_id=None, latitude=None, longitude=None) -> web.Response:
    """Leave

    Used when the user wants to leave from someone else&#39;s permissionable object

    :param permissionable_type: the permissionable type PermissionableType
    :type permissionable_type: str
    :param permissionable_id: the id of the permissionable object
    :type permissionable_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def remove_users_from_permissionable(request: web.Request, permissionable_type, permissionable_id, device_id=None, account_id=None, connection_ids=None, connection_account_ids=None, connection_group_ids=None, remove_friend_group=None, latitude=None, longitude=None, audience_ids=None) -> web.Response:
    """Remove User

    Used to remove someone (assuming they have permission) from a permissionable object

    :param permissionable_type: the permissionable type of the object
    :type permissionable_type: str
    :param permissionable_id: the id of the permissionable object
    :type permissionable_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_ids: a comma separated list of connection ids (NOT the account ids)
    :type connection_ids: str
    :param connection_account_ids: a comma separated list of account ids
    :type connection_account_ids: str
    :param connection_group_ids: a comma separated list of connection group ids (these are groups made by the user)
    :type connection_group_ids: str
    :param remove_friend_group: flag to determine whether to remove the built-in \&quot;friends\&quot; group
    :type remove_friend_group: bool
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param audience_ids: comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.
    :type audience_ids: str

    """
    return web.Response(status=200)


async def search_permissionables(request: web.Request, device_id=None, account_id=None, connection_account_id=None, connection_account_ids=None, permissionable_type=None, permissionable_id=None, keyword=None, sort_field=None, descending=None, pending=None, admin=None, start=None, limit=None) -> web.Response:
    """Search Permissionables

    Search on UserPermissions

    :param device_id: A unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: Filter results for a specific user account
    :type connection_account_id: int
    :param connection_account_ids: Comma separated list of account IDs to filter results with
    :type connection_account_ids: str
    :param permissionable_type: Filter user permissions by the permissionable object type
    :type permissionable_type: str
    :param permissionable_id: The id of the permissionable object to filter by
    :type permissionable_id: int
    :param keyword: Keyword to search within permissionable records
    :type keyword: str
    :param sort_field: Field to sort results on
    :type sort_field: str
    :param descending: Sort descending when true
    :type descending: bool
    :param pending: Return user permissions that are pending
    :type pending: bool
    :param admin: Return user permissions that are admins
    :type admin: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    """
    return web.Response(status=200)


async def search_permissionables_following_distance(request: web.Request, latitude, longitude, device_id=None, account_id=None, connection_account_id=None, connection_account_ids=None, permissionable_type=None, permissionable_id=None, search_range=None, keyword=None, pending=None, admin=None, start=None, limit=None) -> web.Response:
    """Search Permissionables by Distnace

    Search on UserPermissions by distance

    :param latitude: The latitude of the current account
    :type latitude: float
    :param longitude: The longitude of the current account
    :type longitude: float
    :param device_id: A unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: Filter results for a specific user account
    :type connection_account_id: int
    :param connection_account_ids: Comma separated list of account IDs to filter results with
    :type connection_account_ids: str
    :param permissionable_type: Filter user permissions by the permissionable object type
    :type permissionable_type: str
    :param permissionable_id: The id of the permissionable object to filter by
    :type permissionable_id: int
    :param search_range: The search range in miles
    :type search_range: float
    :param keyword: Keyword to search within permissionable records
    :type keyword: str
    :param pending: Return user permissions that are pending
    :type pending: bool
    :param admin: Return user permissions that are admins
    :type admin: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    """
    return web.Response(status=200)
