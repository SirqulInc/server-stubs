from typing import List, Dict
from aiohttp import web

from openapi_server.models.route_settings import RouteSettings
from openapi_server import util


async def create_route_settings(request: web.Request, body=None) -> web.Response:
    """Create Route Setting

    Create a new route setting

    :param body: 
    :type body: dict | bytes

    """
    body = RouteSettings.from_dict(body)
    return web.Response(status=200)


async def delete_route_settings(request: web.Request, route_settings_id) -> web.Response:
    """Delete Route Setting

    Delete an existing route setting

    :param route_settings_id: the id of the route setting to delete
    :type route_settings_id: int

    """
    return web.Response(status=200)


async def get_route_settings(request: web.Request, route_settings_id) -> web.Response:
    """Get Route Setting

    Get an existing route settings

    :param route_settings_id: the id of the route settings to get
    :type route_settings_id: int

    """
    return web.Response(status=200)


async def search_route_settings(request: web.Request, sort_field, descending, start, limit, active_only, hub_id=None, program_id=None, keyword=None) -> web.Response:
    """Search Route Settings

    Search for route settings

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

    """
    return web.Response(status=200)


async def update_route_settings(request: web.Request, route_settings_id, body=None) -> web.Response:
    """Update Route Setting

    Update an existing route setting

    :param route_settings_id: the id of the route settings to update
    :type route_settings_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = RouteSettings.from_dict(body)
    return web.Response(status=200)
