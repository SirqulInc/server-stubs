import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.user_permissions_response import UserPermissionsResponse  # noqa: E501
from openapi_server import util


def add_users_to_permissionable(version, permissionable_type, permissionable_id, device_id=None, account_id=None, read=None, write=None, delete=None, add=None, connection_ids=None, connection_account_ids=None, connection_group_ids=None, pending=None, admin=None, include_friend_group=None, latitude=None, longitude=None, audience_ids=None):  # noqa: E501
    """Add User

    Adds a user to a permissionable object. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def approve_permissionable(version, permissionable_type, permissionable_id, device_id=None, account_id=None, approval_status=None):  # noqa: E501
    """Approve Permissionable

    Sets the approval status of a permissionable object. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def leave_from_permissionable(version, permissionable_type, permissionable_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Leave

    Used when the user wants to leave from someone else&#39;s permissionable object # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_users_from_permissionable(version, permissionable_type, permissionable_id, device_id=None, account_id=None, connection_ids=None, connection_account_ids=None, connection_group_ids=None, remove_friend_group=None, latitude=None, longitude=None, audience_ids=None):  # noqa: E501
    """Remove User

    Used to remove someone (assuming they have permission) from a permissionable object # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_permissionables(version, device_id=None, account_id=None, connection_account_id=None, connection_account_ids=None, permissionable_type=None, permissionable_id=None, keyword=None, sort_field=None, descending=None, pending=None, admin=None, start=None, limit=None):  # noqa: E501
    """Search Permissionables

    Search on UserPermissions # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[List[UserPermissionsResponse], Tuple[List[UserPermissionsResponse], int], Tuple[List[UserPermissionsResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_permissionables_following_distance(version, latitude, longitude, device_id=None, account_id=None, connection_account_id=None, connection_account_ids=None, permissionable_type=None, permissionable_id=None, search_range=None, keyword=None, pending=None, admin=None, start=None, limit=None):  # noqa: E501
    """Search Permissionables by Distnace

    Search on UserPermissions by distance # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[List[UserPermissionsResponse], Tuple[List[UserPermissionsResponse], int], Tuple[List[UserPermissionsResponse], int, Dict[str, str]]
    """
    return 'do some magic!'
