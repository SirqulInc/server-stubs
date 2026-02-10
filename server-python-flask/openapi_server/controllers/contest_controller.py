import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.album_contest_list_response import AlbumContestListResponse  # noqa: E501
from openapi_server.models.album_contest_response import AlbumContestResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def add_or_update_album_contest(version, public_read, public_write, public_delete, public_add, visibility, include_friend_group, device_id=None, account_id=None, game_type=None, app_key=None, contest_type=None, album_contest_id=None, title=None, description=None, album_id1=None, remove_album1=None, album_id2=None, remove_album2=None, start_date=None, end_date=None, location_description=None, connection_ids_to_add=None, connection_group_ids_to_add=None, latitude=None, longitude=None):  # noqa: E501
    """Create or Update Contest

    Creates or updates a contest. # noqa: E501

    :param version: 
    :type version: 
    :param public_read: determines whether the contest&#39;s participants has read permissions
    :type public_read: bool
    :param public_write: determines whether the contest&#39;s participants has write permissions
    :type public_write: bool
    :param public_delete: determines whether the contest&#39;s participants has delete permissions
    :type public_delete: bool
    :param public_add: determines whether the contest&#39;s participants has add permissions
    :type public_add: bool
    :param visibility: the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    :type visibility: str
    :param include_friend_group: determines whether to include all friends as participants
    :type include_friend_group: bool
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: This parameter is deprecated. the application key
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param contest_type: a custom field used for aggregation and searching
    :type contest_type: str
    :param album_contest_id: the album contest ID for updating (don&#39;t pass in if creating)
    :type album_contest_id: int
    :param title: the title of the contest
    :type title: str
    :param description: the description of the contest
    :type description: str
    :param album_id1: the album ID for the first album
    :type album_id1: int
    :param remove_album1: removes album1 from the contest
    :type remove_album1: bool
    :param album_id2: the album ID for the second album
    :type album_id2: int
    :param remove_album2: removes album2 from the contest
    :type remove_album2: bool
    :param start_date: the start date of the contest (time-stamp in milliseconds)
    :type start_date: int
    :param end_date: the end date of the contest (time-stamp in milliseconds)
    :type end_date: int
    :param location_description: the location description of the contest taking place
    :type location_description: str
    :param connection_ids_to_add: comma separated list of connection IDs
    :type connection_ids_to_add: str
    :param connection_group_ids_to_add: comma separated list of connection group IDs
    :type connection_group_ids_to_add: str
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[AlbumContestResponse, Tuple[AlbumContestResponse, int], Tuple[AlbumContestResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def approve_album_contest(version, album_contest_id, approval_status, device_id=None, account_id=None):  # noqa: E501
    """Approve Contest

    Sets the approval status of a contest. # noqa: E501

    :param version: 
    :type version: 
    :param album_contest_id: The ID of the album contest
    :type album_contest_id: int
    :param approval_status: The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    :type approval_status: str
    :param device_id: A unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_contest(version, album_contest_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Contest

    Deletes a contest. # noqa: E501

    :param version: 
    :type version: 
    :param album_contest_id: the album contest ID
    :type album_contest_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_album_contest(version, album_contest_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Contest

    Gets the contest object including the likes and notes # noqa: E501

    :param version: 
    :type version: 
    :param album_contest_id: the album contest ID
    :type album_contest_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[AlbumContestResponse, Tuple[AlbumContestResponse, int], Tuple[AlbumContestResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_album_contests(version, filter, sort_field, descending, start, limit, device_id=None, account_id=None, game_type=None, app_key=None, app_type=None, contest_type=None, owner_id=None, q=None, keyword=None, i=None, l=None, date_created=None, latitude=None, longitude=None):  # noqa: E501
    """Search Contests

    Searches on contests. # noqa: E501

    :param version: 
    :type version: 
    :param filter: a comma separated list of Ownership
    :type filter: str
    :param sort_field: the field to sort by. See AlbumContestApiMap
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination (there is a hard limit of 30)
    :type limit: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param app_type: the application type
    :type app_type: str
    :param contest_type: filter contests with this contest type
    :type contest_type: str
    :param owner_id: search on contests that have been created by this account (that the user has permissions to)
    :type owner_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: keyword search string
    :type keyword: str
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param date_created: filter on items that have been created before this date
    :type date_created: int
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[AlbumContestListResponse, Tuple[AlbumContestListResponse, int], Tuple[AlbumContestListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def vote_on_album_contest(version, album_contest_id, album_id, device_id=None, account_id=None, contest_type=None, latitude=None, longitude=None):  # noqa: E501
    """Vote on Contest

    Vote on a collection in a contest. # noqa: E501

    :param version: 
    :type version: 
    :param album_contest_id: the album contest ID
    :type album_contest_id: int
    :param album_id: the ID of the album to vote on
    :type album_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param contest_type: a custom field used for aggregation and searching
    :type contest_type: str
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[AlbumContestResponse, Tuple[AlbumContestResponse, int], Tuple[AlbumContestResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
