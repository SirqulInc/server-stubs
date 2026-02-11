from typing import List, Dict
from aiohttp import web

from openapi_server.models.bid_response import BidResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_bid(request: web.Request, biddable_type, biddable_id, amount_per_view, amount_per_action, budget_amount, budget_schedule, device_id=None, account_id=None) -> web.Response:
    """Create Bid

    Creates a bid on a biddable object

    :param biddable_type: A biddable object type. Possible values include: CREATIVE (ads).
    :type biddable_type: str
    :param biddable_id: The id of the biddable object
    :type biddable_id: int
    :param amount_per_view: The bid amount for views. For ads, this is the amount that will be taken for each impression.
    :type amount_per_view: float
    :param amount_per_action: The bid amount for actions. For ads, this is the amount that will be taken for each click.
    :type amount_per_action: float
    :param budget_amount: The allocated budget amount that will be used
    :type budget_amount: float
    :param budget_schedule: The schedule for when the allocated budget amount is reset
    :type budget_schedule: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    """
    return web.Response(status=200)


async def delete_bid(request: web.Request, bid_id, device_id=None, account_id=None) -> web.Response:
    """Delete Bid

    Deleted a bid on a biddable object

    :param bid_id: The bid id
    :type bid_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    """
    return web.Response(status=200)


async def get_bid(request: web.Request, bid_id, device_id=None, account_id=None) -> web.Response:
    """Get Bid

    Get the bid details of a biddable object

    :param bid_id: The bid id
    :type bid_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    """
    return web.Response(status=200)


async def update_bid(request: web.Request, bid_id, device_id=None, account_id=None, amount_per_view=None, amount_per_action=None, budget_amount=None, budget_schedule=None) -> web.Response:
    """Update Bid

    Updates a bid on a biddable object

    :param bid_id: The bid id
    :type bid_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param amount_per_view: The bid amount for views. For ads, this is the amount that will be taken for each impression.
    :type amount_per_view: float
    :param amount_per_action: The bid amount for actions. For ads, this is the amount that will be taken for each click.
    :type amount_per_action: float
    :param budget_amount: The allocated budget amount that will be used
    :type budget_amount: float
    :param budget_schedule: The schedule for when the allocated budget amount is reset
    :type budget_schedule: str

    """
    return web.Response(status=200)
