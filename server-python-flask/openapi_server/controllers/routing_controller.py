import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.routing_list_response import RoutingListResponse  # noqa: E501
from openapi_server import util


def compute_routing(version, data):  # noqa: E501
    """Compute Route

    This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off.  # noqa: E501

    :param version: 
    :type version: 
    :param data: Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest
    :type data: str

    :rtype: Union[RoutingListResponse, Tuple[RoutingListResponse, int], Tuple[RoutingListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
