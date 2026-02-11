from typing import List, Dict
from aiohttp import web

from openapi_server.models.routing_list_response import RoutingListResponse
from openapi_server import util


async def compute_routing(request: web.Request, data) -> web.Response:
    """Compute Route

    This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. 

    :param data: Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest
    :type data: str

    """
    return web.Response(status=200)
