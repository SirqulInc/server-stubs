from typing import List, Dict
from aiohttp import web

from openapi_server.models.profile_response import ProfileResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def authorize_twitter(request: web.Request, app_key) -> web.Response:
    """Authorize Twitter

    Makes an authorization call to twitter for a user to login and allow any app permissions.

    :param app_key: the application key
    :type app_key: str

    """
    return web.Response(status=200)


async def login_twitter(request: web.Request, access_token, access_token_secret, app_key, response_filters, device_id=None, latitude=None, longitude=None) -> web.Response:
    """Login Twitter

    Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.

    :param access_token: The access token
    :type access_token: str
    :param access_token_secret: The secret access token
    :type access_token_secret: str
    :param app_key: The application key
    :type app_key: str
    :param response_filters: a comma separated list of ProfileFilters for filtering the returned response data
    :type response_filters: str
    :param device_id: The device id
    :type device_id: str
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)
