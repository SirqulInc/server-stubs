from typing import List, Dict
from aiohttp import web

from openapi_server.models.service_hub import ServiceHub
from openapi_server import util


async def create_service_hub(request: web.Request, version, body=None) -> web.Response:
    """Create Service Hub

    Create new service hub

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    """
    body = ServiceHub.from_dict(body)
    return web.Response(status=200)


async def delete_service_hub(request: web.Request, version, id) -> web.Response:
    """Delete Service Hub

    Delete an existing service hub

    :param version: 
    :type version: 
    :param id: the id of the service hub to delete
    :type id: int

    """
    return web.Response(status=200)


async def get_service_hub(request: web.Request, version, id) -> web.Response:
    """Get Service Hub

    Get an existing service hub

    :param version: 
    :type version: 
    :param id: the id of the service hub to get
    :type id: int

    """
    return web.Response(status=200)


async def post_service_hub(request: web.Request, version, id, body=None) -> web.Response:
    """Update Service Hub

    Update an existing service hub

    :param version: 
    :type version: 
    :param id: the id of the service hub
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = ServiceHub.from_dict(body)
    return web.Response(status=200)


async def put_service_hub(request: web.Request, version, id, body=None) -> web.Response:
    """Update Service Hub

    Update an existing service hub

    :param version: 
    :type version: 
    :param id: the id of the service hub
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = ServiceHub.from_dict(body)
    return web.Response(status=200)


async def search_service_hubs(request: web.Request, version, sort_field, descending, start, limit, active_only, keyword=None, retailer_id=None) -> web.Response:
    """Search Service Hubs

    Search for service hubs.

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
    :param keyword: The keyword to search for
    :type keyword: str
    :param retailer_id: The retailer belongs to
    :type retailer_id: int

    """
    return web.Response(status=200)
