import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.token_response import TokenResponse  # noqa: E501
from openapi_server import util


def get_token(version, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Facebook Token

    Gets a user&#39;s Facebook token. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: used to update the user&#39;s current location
    :type latitude: float
    :param longitude: used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[TokenResponse, Tuple[TokenResponse, int], Tuple[TokenResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def graph_interface(version, event, device_id=None, account_id=None, permissionable_type=None, permissionable_id=None, asset_id=None, game_type=None, app_key=None, latitude=None, longitude=None):  # noqa: E501
    """Post to Facebook

    Make Facebook posts on behalf of the user. # noqa: E501

    :param version: 
    :type version: 
    :param event: the type of Sirqul event {DOWNLOADED_APP, CHALLENGE, LEVEL_COMPLETED, LEVEL_CREATED}
    :type event: str
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param permissionable_type: for posting about information related to an object. Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    :type permissionable_type: str
    :param permissionable_id: the object id
    :type permissionable_id: int
    :param asset_id: used to include an asset on a Facebook post
    :type asset_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param latitude: used to update the user&#39;s current location
    :type latitude: float
    :param longitude: used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
