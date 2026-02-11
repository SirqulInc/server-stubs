from typing import List, Dict
from aiohttp import web

from openapi_server.models.wrapped_proxy_item_response import WrappedProxyItemResponse
from openapi_server import util


async def image_generation(request: web.Request, account_id, post_body, return_raw_response=None) -> web.Response:
    """Generate images with OpenAI

    Generate images with OpenAI.

    :param account_id: Sirqul Account Id
    :type account_id: int
    :param post_body: Post Body Parameters
    :type post_body: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)
