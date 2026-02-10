import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.route_settings import RouteSettings  # noqa: E501
from openapi_server import util


def create_route_settings(version, body=None):  # noqa: E501
    """Create Route Setting

    Create a new route setting # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[RouteSettings, Tuple[RouteSettings, int], Tuple[RouteSettings, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = RouteSettings.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_route_settings(version, route_settings_id):  # noqa: E501
    """Delete Route Setting

    Delete an existing route setting # noqa: E501

    :param version: 
    :type version: 
    :param route_settings_id: the id of the route setting to delete
    :type route_settings_id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_route_settings(version, route_settings_id):  # noqa: E501
    """Get Route Setting

    Get an existing route settings # noqa: E501

    :param version: 
    :type version: 
    :param route_settings_id: the id of the route settings to get
    :type route_settings_id: int

    :rtype: Union[RouteSettings, Tuple[RouteSettings, int], Tuple[RouteSettings, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_route_settings(version, sort_field, descending, start, limit, active_only, hub_id=None, program_id=None, keyword=None):  # noqa: E501
    """Search Route Settings

    Search for route settings # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param hub_id: The service hub that the route belongs under
    :type hub_id: int
    :param program_id: The program that the route belongs under
    :type program_id: int
    :param keyword: The keyword to search for the route
    :type keyword: str

    :rtype: Union[List[RouteSettings], Tuple[List[RouteSettings], int], Tuple[List[RouteSettings], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_route_settings(version, route_settings_id, body=None):  # noqa: E501
    """Update Route Setting

    Update an existing route setting # noqa: E501

    :param version: 
    :type version: 
    :param route_settings_id: the id of the route settings to update
    :type route_settings_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[RouteSettings, Tuple[RouteSettings, int], Tuple[RouteSettings, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = RouteSettings.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
