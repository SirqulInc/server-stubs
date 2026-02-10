import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.pathing_response import PathingResponse  # noqa: E501
from openapi_server import util


def compute_path(version, data, units, reduce_path, directions):  # noqa: E501
    """Calculate Path

    Calculates the shortest path from point to point on a grid # noqa: E501

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

    :rtype: Union[PathingResponse, Tuple[PathingResponse, int], Tuple[PathingResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
