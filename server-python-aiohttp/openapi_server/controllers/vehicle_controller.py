from typing import List, Dict
from aiohttp import web

from openapi_server.models.vehicle import Vehicle
from openapi_server import util


async def create_vehicle(request: web.Request, vehicle, body=None) -> web.Response:
    """Create Vehicle

    Create new vehicle

    :param vehicle: A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle: str
    :param body: 
    :type body: dict | bytes

    """
    body = Vehicle.from_dict(body)
    return web.Response(status=200)


async def delete_vehicle(request: web.Request, id) -> web.Response:
    """Delete Vehicle

    Delete an existing vehicle

    :param id: The id of the vehicle to delete
    :type id: int

    """
    return web.Response(status=200)


async def get_vehicle(request: web.Request, id) -> web.Response:
    """Get Vehicle

    Get an existing vehicle

    :param id: The id of the vehicle requested
    :type id: int

    """
    return web.Response(status=200)


async def search_vehicle(request: web.Request, hub_id, sort_field, descending, start, limit, active_only, keyword=None) -> web.Response:
    """Search Vehicle

    Search for vehicles

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

    """
    return web.Response(status=200)


async def update_vehicle(request: web.Request, id, vehicle, body=None) -> web.Response:
    """Update Vehicle

    Update an existing vehicle

    :param id: The id of the vehicle to update
    :type id: int
    :param vehicle: A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    :type vehicle: str
    :param body: 
    :type body: dict | bytes

    """
    body = Vehicle.from_dict(body)
    return web.Response(status=200)
