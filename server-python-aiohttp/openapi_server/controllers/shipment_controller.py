from typing import List, Dict
from aiohttp import web

from openapi_server.models.shipment import Shipment
from openapi_server import util


async def cancel_shipment(request: web.Request, id) -> web.Response:
    """Cancel Shipment

    Remove shipment from route

    :param id: the id of the shipment to cancel
    :type id: int

    """
    return web.Response(status=200)


async def create_shipment(request: web.Request, body=None) -> web.Response:
    """Create Shipment

    Create new shipment

    :param body: 
    :type body: dict | bytes

    """
    body = Shipment.from_dict(body)
    return web.Response(status=200)


async def delete_shipment(request: web.Request, id) -> web.Response:
    """Delete Shipment

    Delete an existing shipment

    :param id: the id of the shipment to delete
    :type id: int

    """
    return web.Response(status=200)


async def get_shipment(request: web.Request, id) -> web.Response:
    """Get Shipment

    Get an existing shipment

    :param id: the id of the shipment to get
    :type id: int

    """
    return web.Response(status=200)


async def search_shipments(request: web.Request, sort_field, descending, start, limit, active_only, owner_id=None, rider_id=None, route_id=None) -> web.Response:
    """Search Shipments

    Search for shipments

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
    :param owner_id: The owner of the shipment
    :type owner_id: int
    :param rider_id: The rider associate to this shipment
    :type rider_id: int
    :param route_id: The route associate to this shipment
    :type route_id: int

    """
    return web.Response(status=200)


async def update_shipment(request: web.Request, id, body=None) -> web.Response:
    """Update Shipment

    Update an existing shipment

    :param id: the id of the shipment to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Shipment.from_dict(body)
    return web.Response(status=200)


async def update_shipment_status(request: web.Request, id, body=None) -> web.Response:
    """Uupdate Shipment Status

    Update status of an existing shipment

    :param id: the id of the shipment to update status
    :type id: int
    :param body: 
    :type body: Dict[str, bool]

    """
    return web.Response(status=200)
