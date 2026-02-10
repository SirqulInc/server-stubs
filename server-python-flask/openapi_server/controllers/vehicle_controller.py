import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.vehicle import Vehicle  # noqa: E501
from openapi_server import util


def create_vehicle(version, vehicle, body=None):  # noqa: E501
    """Create Vehicle

    Create new vehicle # noqa: E501

    :param version: 
    :type version: 
    :param vehicle: A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Vehicle, Tuple[Vehicle, int], Tuple[Vehicle, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Vehicle.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_vehicle(version, id):  # noqa: E501
    """Delete Vehicle

    Delete an existing vehicle # noqa: E501

    :param version: 
    :type version: 
    :param id: The id of the vehicle to delete
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vehicle(version, id):  # noqa: E501
    """Get Vehicle

    Get an existing vehicle # noqa: E501

    :param version: 
    :type version: 
    :param id: The id of the vehicle requested
    :type id: int

    :rtype: Union[Vehicle, Tuple[Vehicle, int], Tuple[Vehicle, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_vehicle(version, hub_id, sort_field, descending, start, limit, active_only, keyword=None):  # noqa: E501
    """Search Vehicle

    Search for vehicles # noqa: E501

    :param version: 
    :type version: 
    :param hub_id: Filter by service hub
    :type hub_id: int
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
    :param keyword: The keyword to search for
    :type keyword: str

    :rtype: Union[List[Vehicle], Tuple[List[Vehicle], int], Tuple[List[Vehicle], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_vehicle(version, id, vehicle, body=None):  # noqa: E501
    """Update Vehicle

    Update an existing vehicle # noqa: E501

    :param version: 
    :type version: 
    :param id: The id of the vehicle to update
    :type id: int
    :param vehicle: A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Vehicle, Tuple[Vehicle, int], Tuple[Vehicle, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Vehicle.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
