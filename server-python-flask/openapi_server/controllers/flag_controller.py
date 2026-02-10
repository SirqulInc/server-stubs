import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.count_response import CountResponse  # noqa: E501
from openapi_server.models.flag_response import FlagResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_flag(version, flagable_type, flagable_id, device_id=None, account_id=None, flag_description=None, latitude=None, longitude=None):  # noqa: E501
    """Create Flag

    Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors # noqa: E501

    :param version: 
    :type version: 
    :param flagable_type: The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}
    :type flagable_type: str
    :param flagable_id: The flagable object id
    :type flagable_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param flag_description: An optional description of why is it being flagged
    :type flag_description: str
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_flag(version, device_id=None, account_id=None, item_being_flagged_type=None, item_being_flagged_id=None, flagable_type=None, flagable_id=None):  # noqa: E501
    """Delete Flag

    Deletes a flag. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param item_being_flagged_type: This parameter is deprecated.
    :type item_being_flagged_type: str
    :param item_being_flagged_id: This parameter is deprecated.
    :type item_being_flagged_id: int
    :param flagable_type: The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    :type flagable_type: str
    :param flagable_id: The flagable object id
    :type flagable_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_flag(version, flagable_type, flagable_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Flag

    Gets the details on whether the user has flagged a particular flagable object. # noqa: E501

    :param version: 
    :type version: 
    :param flagable_type: The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}
    :type flagable_type: str
    :param flagable_id: The flagable object id
    :type flagable_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float

    :rtype: Union[FlagResponse, Tuple[FlagResponse, int], Tuple[FlagResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_flag_threshold(version, item_being_flagged_type, app_key):  # noqa: E501
    """Get Flag Threshold

    Get the flag threshold value on an object type for a particular application. # noqa: E501

    :param version: 
    :type version: 
    :param item_being_flagged_type: The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    :type item_being_flagged_type: str
    :param app_key: The application key
    :type app_key: str

    :rtype: Union[CountResponse, Tuple[CountResponse, int], Tuple[CountResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_flag_threshold(version, item_being_flagged_type, threshold, app_key, device_id=None, account_id=None):  # noqa: E501
    """Update Flag Threshold

    Update the flag threshold on an object type for a particular application. # noqa: E501

    :param version: 
    :type version: 
    :param item_being_flagged_type: The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    :type item_being_flagged_type: str
    :param threshold: The threshold value
    :type threshold: int
    :param app_key: The application key
    :type app_key: str
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int

    :rtype: Union[CountResponse, Tuple[CountResponse, int], Tuple[CountResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
