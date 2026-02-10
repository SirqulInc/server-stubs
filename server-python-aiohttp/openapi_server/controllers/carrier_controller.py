from typing import List, Dict
from aiohttp import web

from openapi_server.models.cell_carrier_response import CellCarrierResponse
from openapi_server import util


async def search_carriers(request: web.Request, version, keyword=None, descending=None, start=None, limit=None, active_only=None) -> web.Response:
    """Search Carriers

    Search on supported mobile telephone carriers that can be used to send SMS notifications via email.

    :param version: 
    :type version: 
    :param keyword: The keyword to search on
    :type keyword: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Determines whether to return inactive results
    :type active_only: bool

    """
    return web.Response(status=200)
