from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_stripe_checkout_session(request: web.Request, version, app_key, stripe_parameters) -> web.Response:
    """Create Stripe Checkout Session

    Create a Stripe checkout session

    :param version: 
    :type version: 
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param stripe_parameters: Stripe Parameters
    :type stripe_parameters: str

    """
    return web.Response(status=200)
