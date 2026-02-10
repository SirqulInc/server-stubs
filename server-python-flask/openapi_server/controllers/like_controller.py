import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.likable_response import LikableResponse  # noqa: E501
from openapi_server.models.search_response import SearchResponse  # noqa: E501
from openapi_server import util


def register_like(version, likable_type, likable_id, device_id=None, account_id=None, permissionable_type=None, permissionable_id=None, like=None, app=None, game_type=None, app_key=None, latitude=None, longitude=None):  # noqa: E501
    """Create Like

    Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one. # noqa: E501

    :param version: 
    :type version: 
    :param likable_type: The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    :type likable_type: str
    :param likable_id: The id of the likable object
    :type likable_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param permissionable_type: This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    :type permissionable_type: str
    :param permissionable_id: The id of the permissionable object (for sending group notifications)
    :type permissionable_id: int
    :param like: determines whether the user likes or dislikes the object
    :type like: bool
    :param app: This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.
    :type app: str
    :param game_type: This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float

    :rtype: Union[LikableResponse, Tuple[LikableResponse, int], Tuple[LikableResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_like(version, likable_type, likable_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Like

    Removes a like. This will make the user \&quot;neutral\&quot;. # noqa: E501

    :param version: 
    :type version: 
    :param likable_type: The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    :type likable_type: str
    :param likable_id: The id of the likable object
    :type likable_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float

    :rtype: Union[LikableResponse, Tuple[LikableResponse, int], Tuple[LikableResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_likes(version, likable_type, likable_id, device_id=None, account_id=None, connection_account_ids=None, sort_field=None, descending=None, updated_since=None, updated_before=None, start=None, limit=None):  # noqa: E501
    """Search Likes

    Search for likes on a likable object. # noqa: E501

    :param version: 
    :type version: 
    :param likable_type: The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    :type likable_type: str
    :param likable_id: The id of the likable object
    :type likable_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param connection_account_ids: Comma separated list of account IDs for filtering on users
    :type connection_account_ids: str
    :param sort_field: The field to sort by. Possible values include: ID
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param updated_since: return items that have been updated since this date (time-stamp in milliseconds)
    :type updated_since: int
    :param updated_before: return items that have been updated before this date (time-stamp in milliseconds)
    :type updated_before: int
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[SearchResponse, Tuple[SearchResponse, int], Tuple[SearchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
