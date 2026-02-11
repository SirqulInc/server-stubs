from typing import List, Dict
from aiohttp import web

from openapi_server.models.stop import Stop
from openapi_server import util


async def get_stop(request: web.Request, id) -> web.Response:
    """Get Stop

    Get an existing stop

    :param id: the id of the stop to get
    :type id: int

    """
    return web.Response(status=200)


async def update_stop(request: web.Request, id, body=None) -> web.Response:
    """Update Stop

    Update an existing stop

    :param id: the id of the stop to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Stop.from_dict(body)
    return web.Response(status=200)
