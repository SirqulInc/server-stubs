from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def process_all_participants(request: web.Request, account_id, app_key=None, use_short_name_as_id=None) -> web.Response:
    """Process All Participant Feeds

    Processes all supported participant feeds.

    :param account_id: The account id of the user
    :type account_id: int
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param use_short_name_as_id: Whether to use short name as the participant ID
    :type use_short_name_as_id: bool

    """
    return web.Response(status=200)


async def process_participants(request: web.Request, account_id, league, app_key=None, use_short_name_as_id=None, file=None) -> web.Response:
    """Process Participants Feed

    Processes a participant feed or uploaded file for a specific league.

    :param account_id: The account id of the user
    :type account_id: int
    :param league: The league identifier to process
    :type league: str
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param use_short_name_as_id: Whether to use short name as the participant ID
    :type use_short_name_as_id: bool
    :param file: Multipart file containing participant feed contents
    :type file: str

    """
    return web.Response(status=200)
