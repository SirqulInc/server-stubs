from typing import List, Dict
from aiohttp import web

from openapi_server.models.import_statuses import ImportStatuses
from openapi_server.models.orders import Orders
from openapi_server.models.shipment_order import ShipmentOrder
from openapi_server import util


async def get_optimization_result(request: web.Request, batch_id, start, limit) -> web.Response:
    """Get Optimization Result

    Get the results of the import batch.

    :param batch_id: The batchID for getting the import status of.
    :type batch_id: str
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    """
    return web.Response(status=200)


async def request_optimization(request: web.Request, body=None) -> web.Response:
    """Request Optimization

    Request and upload of shipment orders and create ShipmentImportBatch for optimization.

    :param body: 
    :type body: dict | bytes

    """
    body = Orders.from_dict(body)
    return web.Response(status=200)
