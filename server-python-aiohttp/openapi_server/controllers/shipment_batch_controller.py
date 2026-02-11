from typing import List, Dict
from aiohttp import web

from openapi_server.models.shipment_batch import ShipmentBatch
from openapi_server.models.shipment_import_status import ShipmentImportStatus
from openapi_server import util


async def create_shipment_batch(request: web.Request, body=None) -> web.Response:
    """Create Shipment Batch

    Create a new shipment batch

    :param body: 
    :type body: dict | bytes

    """
    body = ShipmentBatch.from_dict(body)
    return web.Response(status=200)


async def delete_shipment_batch(request: web.Request, batch_id) -> web.Response:
    """Delete Shipment Batch

    Search for shipment batches

    :param batch_id: the id of the shipment batch to delete
    :type batch_id: int

    """
    return web.Response(status=200)


async def get_shipment_batch(request: web.Request, batch_id) -> web.Response:
    """Get Shipment Batch

    Get an existing shipment batch

    :param batch_id: the id of the shipment batch to get
    :type batch_id: int

    """
    return web.Response(status=200)


async def get_shipment_batch_status(request: web.Request, batch_id, account_id, sort_field, descending, start, limit, valid=None, started=None, completed=None, has_shipment=None, has_route=None, keyword=None) -> web.Response:
    """Get Shipment Batch Status

    Get the import status list of the import shipment batch

    :param batch_id: The id of the requested shipment batch
    :type batch_id: int
    :param account_id: the id of the logged in user
    :type account_id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param valid: Valid import status only or not
    :type valid: bool
    :param started: Started import status only
    :type started: bool
    :param completed: Completed import status only
    :type completed: bool
    :param has_shipment: Has shipment associate to the status
    :type has_shipment: bool
    :param has_route: Has route associate to the status
    :type has_route: bool
    :param keyword: The keyword to search for
    :type keyword: str

    """
    return web.Response(status=200)


async def search_shipment_batch(request: web.Request, hub_id, sort_field, descending, start, limit) -> web.Response:
    """Search Shipment Batch

    Search for shipment batches

    :param hub_id: The associated service hub
    :type hub_id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    """
    return web.Response(status=200)
