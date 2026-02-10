import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def authorize_twitter(version, app_key):  # noqa: E501
    """Authorize Twitter

    Makes an authorization call to twitter for a user to login and allow any app permissions. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: the application key
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def login_twitter(version, access_token, access_token_secret, app_key, response_filters, device_id=None, latitude=None, longitude=None):  # noqa: E501
    """Login Twitter

    Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
