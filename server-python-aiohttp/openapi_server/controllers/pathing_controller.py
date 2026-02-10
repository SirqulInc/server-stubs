from typing import List, Dict
from aiohttp import web

from openapi_server.models.pathing_response import PathingResponse
from openapi_server import util


async def compute_path(request: web.Request, version, data, units, reduce_path, directions) -> web.Response:
    """Calculate Path

    Calculates the shortest path from point to point on a grid

    :param version: 
    :type version: 
    :param data: the data to with start, end point and exclusion points
    :type data: str
    :param units: the system of measurement for directions: {METRIC, IMPERIAL}
    :type units: str
    :param reduce_path: determines whether to reduce the path to go in diagonal lines
    :type reduce_path: bool
    :param directions: determines whether to return text directions
    :type directions: bool

    """
    return web.Response(status=200)
