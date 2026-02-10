import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.vehicle_type import VehicleType  # noqa: E501
from openapi_server import util


def create_vehicle_type(version, vehicle_type, body=None):  # noqa: E501
    """Create Vehicle Type

    Create a new vehicle type # noqa: E501

    :param version: 
    :type version: 
    :param vehicle_type: A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle_type: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[VehicleType, Tuple[VehicleType, int], Tuple[VehicleType, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = VehicleType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_vehicle_type(version, vehicle_type_id):  # noqa: E501
    """Delete Vehicle Type

    Delete a vehicle type # noqa: E501

    :param version: 
    :type version: 
    :param vehicle_type_id: The id of the requested vehicle type
    :type vehicle_type_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vehicle_type(version, vehicle_type_id):  # noqa: E501
    """Get Vehicle Type

    Get a vehicle type # noqa: E501

    :param version: 
    :type version: 
    :param vehicle_type_id: The id of the requested vehicle type
    :type vehicle_type_id: int

    :rtype: Union[VehicleType, Tuple[VehicleType, int], Tuple[VehicleType, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_vehicle_types(version, sort_field, descending, start, limit, active_only, retailer_id=None, hub_id=None):  # noqa: E501
    """Search Vehicle Type

    Search for types of vehicles # noqa: E501

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
    :param retailer_id: Filter by retailer
    :type retailer_id: int
    :param hub_id: Filter by service hub
    :type hub_id: int

    :rtype: Union[List[VehicleType], Tuple[List[VehicleType], int], Tuple[List[VehicleType], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_vehicle_type(version, vehicle_type_id, vehicle_type, body=None):  # noqa: E501
    """Update Vehicle Type

    Update a vehicle type # noqa: E501

    :param version: 
    :type version: 
    :param vehicle_type_id: The id of the vehicle type to update
    :type vehicle_type_id: int
    :param vehicle_type: The new data for the vehicle type to update to. A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle_type: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[VehicleType, Tuple[VehicleType, int], Tuple[VehicleType, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = VehicleType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
