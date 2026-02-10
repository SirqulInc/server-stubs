import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.wrapped_proxy_item_response import WrappedProxyItemResponse  # noqa: E501
from openapi_server import util


def image_generation(version, account_id, post_body, return_raw_response=None):  # noqa: E501
    """Generate images with OpenAI

    Generate images with OpenAI. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param post_body: Post Body Parameters
    :type post_body: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[WrappedProxyItemResponse, Tuple[WrappedProxyItemResponse, int], Tuple[WrappedProxyItemResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
