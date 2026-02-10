from typing import List, Dict
from aiohttp import web

from openapi_server.models.game_response import GameResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_game(request: web.Request, version, account_id=None, app_key=None, title=None, description=None, meta_data=None, pack_ids=None, include_game_data=None) -> web.Response:
    """Create a Game

    Create a Game.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The game application key to save the level for.
    :type app_key: str
    :param title: Title of the game.
    :type title: str
    :param description: Description of the game.
    :type description: str
    :param meta_data: metaData of the Game.
    :type meta_data: str
    :param pack_ids: comma separated String of pack Ids that will associate with the game.
    :type pack_ids: str
    :param include_game_data: Show more details in response.
    :type include_game_data: bool

    """
    return web.Response(status=200)


async def delete_game(request: web.Request, version, account_id, game_id) -> web.Response:
    """Delete a Game

    Delete a game.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param game_id: the updating game&#39;s id.
    :type game_id: int

    """
    return web.Response(status=200)


async def get_game(request: web.Request, version, account_id, game_id, include_game_data=None) -> web.Response:
    """Get a Game by id

    Get a Game by id.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param game_id: the updating game&#39;s id.
    :type game_id: int
    :param include_game_data: If true include the game level data, otherwise don&#39;t. default is false.
    :type include_game_data: bool

    """
    return web.Response(status=200)


async def search_games(request: web.Request, version, account_id, app_key, start, limit, keyword=None, app_version=None, include_game_data=None, include_inactive=None) -> web.Response:
    """Search a Game

    Get a list of games for an application, just those the account has permissions to view.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number.
    :type limit: int
    :param keyword: Match the keyword to the owner name or level name.
    :type keyword: str
    :param app_version: The maximum version of the level to return.
    :type app_version: str
    :param include_game_data: more details in response
    :type include_game_data: bool
    :param include_inactive: more details in response
    :type include_inactive: bool

    """
    return web.Response(status=200)


async def update_game(request: web.Request, version, account_id=None, game_id=None, app_key=None, title=None, description=None, meta_data=None, pack_ids=None, include_game_data=None) -> web.Response:
    """Update a Game

    Update a Game

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param game_id: the updating game&#39;s id
    :type game_id: int
    :param app_key: The game application key to save the level for.
    :type app_key: str
    :param title: Title of the Game.
    :type title: str
    :param description: Description of the Game.
    :type description: str
    :param meta_data: metaData of the Game.
    :type meta_data: str
    :param pack_ids: comma separated String of pack Ids that will associate with the game.
    :type pack_ids: str
    :param include_game_data: show more details in response.
    :type include_game_data: bool

    """
    return web.Response(status=200)
