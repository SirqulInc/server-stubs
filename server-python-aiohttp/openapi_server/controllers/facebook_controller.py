from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.token_response import TokenResponse
from openapi_server import util


async def get_token(request: web.Request, device_id=None, account_id=None, latitude=None, longitude=None) -> web.Response:
    """Get Facebook Token

    Gets a user&#39;s Facebook token.

    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: used to update the user&#39;s current location
    :type latitude: float
    :param longitude: used to update the user&#39;s current location
    :type longitude: float

    """
    return web.Response(status=200)


async def graph_interface(request: web.Request, event, device_id=None, account_id=None, permissionable_type=None, permissionable_id=None, asset_id=None, game_type=None, app_key=None, latitude=None, longitude=None) -> web.Response:
    """Post to Facebook

    Make Facebook posts on behalf of the user.

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

    """
    return web.Response(status=200)
