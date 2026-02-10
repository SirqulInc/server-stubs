import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bid_response import BidResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_bid(version, biddable_type, biddable_id, amount_per_view, amount_per_action, budget_amount, budget_schedule, device_id=None, account_id=None):  # noqa: E501
    """Create Bid

    Creates a bid on a biddable object # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[BidResponse, Tuple[BidResponse, int], Tuple[BidResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_bid(version, bid_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Bid

    Deleted a bid on a biddable object # noqa: E501

    :param version: 
    :type version: 
    :param bid_id: The bid id
    :type bid_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bid(version, bid_id, device_id=None, account_id=None):  # noqa: E501
    """Get Bid

    Get the bid details of a biddable object # noqa: E501

    :param version: 
    :type version: 
    :param bid_id: The bid id
    :type bid_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[BidResponse, Tuple[BidResponse, int], Tuple[BidResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_bid(version, bid_id, device_id=None, account_id=None, amount_per_view=None, amount_per_action=None, budget_amount=None, budget_schedule=None):  # noqa: E501
    """Update Bid

    Updates a bid on a biddable object # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[BidResponse, Tuple[BidResponse, int], Tuple[BidResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
