from typing import List, Dict
from aiohttp import web

from openapi_server.models.twi_ml_response import TwiMLResponse
from openapi_server import util


async def sms_buy_offer(request: web.Request, version, app_key, body, _from, currency_type) -> web.Response:
    """Buy Offer by SMS

    Recieve an SMS payload from Twillio to purchase an offer.

    :param version: 
    :type version: 
    :param app_key: the application key
    :type app_key: str
    :param body: the message of the text
    :type body: str
    :param _from: the sender of the sms
    :type _from: str
    :param currency_type: the type of currency
    :type currency_type: str

    """
    return web.Response(status=200)
