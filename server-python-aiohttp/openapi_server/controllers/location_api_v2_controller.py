from typing import List, Dict
from aiohttp import web

from openapi_server.models.location import Location
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_location_v2(request: web.Request, version, body=None) -> web.Response:
    """Create new location

    Create a new location from a real object location.

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    """
    body = Location.from_dict(body)
    return web.Response(status=200)


async def update_location_v2(request: web.Request, version, id, body=None) -> web.Response:
    """Update an existing location

    Update an existing location

    :param version: 
    :type version: 
    :param id: the id of the location to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Location.from_dict(body)
    return web.Response(status=200)
