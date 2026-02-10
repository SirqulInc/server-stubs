import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.game_response import GameResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_game(version, account_id=None, app_key=None, title=None, description=None, meta_data=None, pack_ids=None, include_game_data=None):  # noqa: E501
    """Create a Game

    Create a Game. # noqa: E501

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

    :rtype: Union[GameResponse, Tuple[GameResponse, int], Tuple[GameResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_game(version, account_id, game_id):  # noqa: E501
    """Delete a Game

    Delete a game. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param game_id: the updating game&#39;s id.
    :type game_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_game(version, account_id, game_id, include_game_data=None):  # noqa: E501
    """Get a Game by id

    Get a Game by id. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param game_id: the updating game&#39;s id.
    :type game_id: int
    :param include_game_data: If true include the game level data, otherwise don&#39;t. default is false.
    :type include_game_data: bool

    :rtype: Union[GameResponse, Tuple[GameResponse, int], Tuple[GameResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_games(version, account_id, app_key, start, limit, keyword=None, app_version=None, include_game_data=None, include_inactive=None):  # noqa: E501
    """Search a Game

    Get a list of games for an application, just those the account has permissions to view. # noqa: E501

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

    :rtype: Union[GameResponse, Tuple[GameResponse, int], Tuple[GameResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_game(version, account_id=None, game_id=None, app_key=None, title=None, description=None, meta_data=None, pack_ids=None, include_game_data=None):  # noqa: E501
    """Update a Game

    Update a Game # noqa: E501

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

    :rtype: Union[GameResponse, Tuple[GameResponse, int], Tuple[GameResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
