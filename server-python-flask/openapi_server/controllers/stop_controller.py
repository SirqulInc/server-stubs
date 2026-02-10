import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.stop import Stop  # noqa: E501
from openapi_server import util


def get_stop(version, id):  # noqa: E501
    """Get Stop

    Get an existing stop # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the stop to get
    :type id: int

    :rtype: Union[Stop, Tuple[Stop, int], Tuple[Stop, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_stop(version, id, body=None):  # noqa: E501
    """Update Stop

    Update an existing stop # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the stop to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Stop, Tuple[Stop, int], Tuple[Stop, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Stop.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
