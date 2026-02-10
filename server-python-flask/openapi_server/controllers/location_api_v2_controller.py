import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.location import Location  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_location_v2(version, body=None):  # noqa: E501
    """Create new location

    Create a new location from a real object location. # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Location.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_location_v2(version, id, body=None):  # noqa: E501
    """Update an existing location

    Update an existing location # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the location to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Location.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
