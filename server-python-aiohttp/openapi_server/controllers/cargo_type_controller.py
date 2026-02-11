from typing import List, Dict
from aiohttp import web

from openapi_server.models.cargo_type import CargoType
from openapi_server import util


async def create_cargo_type(request: web.Request, body=None) -> web.Response:
    """Create Cargo Type

    Create new cargo type

    :param body: 
    :type body: dict | bytes

    """
    body = CargoType.from_dict(body)
    return web.Response(status=200)


async def delete_cargo_type(request: web.Request, cargo_type_id) -> web.Response:
    """Delete Cargo Type

    Delete a type of cargo

    :param cargo_type_id: the ID of the cargo type
    :type cargo_type_id: int

    """
    return web.Response(status=200)


async def get_cargo_type(request: web.Request, cargo_type_id) -> web.Response:
    """Get Cargo Type

    Get an existing cargo type

    :param cargo_type_id: the cargo type ID
    :type cargo_type_id: int

    """
    return web.Response(status=200)


async def search_cargo_types(request: web.Request, sort_field, descending, start, limit, active_only, retailer_id=None, hub_id=None) -> web.Response:
    """Search Cargo Type

    Search for types of cargo

    :param sort_field: the sort field to use for the cargo type
    :type sort_field: str
    :param descending: if the cargo type should be should be in descending order
    :type descending: bool
    :param start: the start of the search
    :type start: int
    :param limit: the limit of the search
    :type limit: int
    :param active_only: if search should be on active only
    :type active_only: bool
    :param retailer_id: the id of the retailer location
    :type retailer_id: int
    :param hub_id: the ID of the hub
    :type hub_id: int

    """
    return web.Response(status=200)


async def update_cargo_type(request: web.Request, cargo_type_id, body=None) -> web.Response:
    """Update Cargo Type

    Update an existing cargo type

    :param cargo_type_id: the ID of the cargo type
    :type cargo_type_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = CargoType.from_dict(body)
    return web.Response(status=200)
