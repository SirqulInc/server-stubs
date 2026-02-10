from typing import List, Dict
from aiohttp import web

from openapi_server.models.vehicle_type import VehicleType
from openapi_server import util


async def create_vehicle_type(request: web.Request, version, vehicle_type, body=None) -> web.Response:
    """Create Vehicle Type

    Create a new vehicle type

    :param version: 
    :type version: 
    :param vehicle_type: A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle_type: str
    :param body: 
    :type body: dict | bytes

    """
    body = VehicleType.from_dict(body)
    return web.Response(status=200)


async def delete_vehicle_type(request: web.Request, version, vehicle_type_id) -> web.Response:
    """Delete Vehicle Type

    Delete a vehicle type

    :param version: 
    :type version: 
    :param vehicle_type_id: The id of the requested vehicle type
    :type vehicle_type_id: int

    """
    return web.Response(status=200)


async def get_vehicle_type(request: web.Request, version, vehicle_type_id) -> web.Response:
    """Get Vehicle Type

    Get a vehicle type

    :param version: 
    :type version: 
    :param vehicle_type_id: The id of the requested vehicle type
    :type vehicle_type_id: int

    """
    return web.Response(status=200)


async def search_vehicle_types(request: web.Request, version, sort_field, descending, start, limit, active_only, retailer_id=None, hub_id=None) -> web.Response:
    """Search Vehicle Type

    Search for types of vehicles

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

    """
    return web.Response(status=200)


async def update_vehicle_type(request: web.Request, version, vehicle_type_id, vehicle_type, body=None) -> web.Response:
    """Update Vehicle Type

    Update a vehicle type

    :param version: 
    :type version: 
    :param vehicle_type_id: The id of the vehicle type to update
    :type vehicle_type_id: int
    :param vehicle_type: The new data for the vehicle type to update to. A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle_type: str
    :param body: 
    :type body: dict | bytes

    """
    body = VehicleType.from_dict(body)
    return web.Response(status=200)
