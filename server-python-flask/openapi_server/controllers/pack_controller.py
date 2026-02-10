import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.pack_response import PackResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_pack(version, account_id, title, pack_order, price, highest, allocate_tickets, ticket_count, description=None, search_tags=None, active=None, game_type=None, app_key=None, pack_type=None, sequence_type=None, background_id=None, image_id=None, start_date=None, end_date=None, author_override=None, price_type=None, game_level_ids=None, in_game=None, ticket_type=None, points=None):  # noqa: E501
    """Create Pack

    Create a pack. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param title: The title of the pack
    :type title: str
    :param pack_order: The order of the pack
    :type pack_order: int
    :param price: The price in tickets to purchase this pack
    :type price: int
    :param highest: The scoring is highest is best
    :type highest: bool
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed packs
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param description: The description of the pack
    :type description: str
    :param search_tags: The tags for searching the pack, comma separated
    :type search_tags: str
    :param active: Activate/deactivate the pack
    :type active: bool
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param pack_type: The type of the pack
    :type pack_type: str
    :param sequence_type: The type of game sequence of the pack
    :type sequence_type: str
    :param background_id: The background asset id of the pack
    :type background_id: int
    :param image_id: The image asset id of the pack
    :type image_id: int
    :param start_date: The date/time to start the pack, send 0 to unset
    :type start_date: int
    :param end_date: The date/time to end the pack, send 0 to unset
    :type end_date: int
    :param author_override: 
    :type author_override: str
    :param price_type: the type of ticket required to purchase this pack
    :type price_type: str
    :param game_level_ids: the game level ids to include in the pack, comma separated
    :type game_level_ids: str
    :param in_game: 
    :type in_game: bool
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a pack
    :type points: int

    :rtype: Union[PackResponse, Tuple[PackResponse, int], Tuple[PackResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_pack(version, account_id, pack_id):  # noqa: E501
    """Delete Pack

    Delete a pack. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param pack_id: the id of the pack to delete
    :type pack_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_pack(version, account_id, pack_id, include_game_data):  # noqa: E501
    """Get Pack

    Get a pack. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param pack_id: The id of the pack to return.
    :type pack_id: int
    :param include_game_data: If true include the game level data, otherwise don&#39;t. default is false.
    :type include_game_data: bool

    :rtype: Union[PackResponse, Tuple[PackResponse, int], Tuple[PackResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_packs(version, account_id, sort_field, descending, keyword=None, pack_type=None, start=None, limit=None, include_game_data=None, include_inactive=None, app_key=None):  # noqa: E501
    """Search Packs

    Search on packs. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param sort_field: The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param keyword: Keyword search on the pack name
    :type keyword: str
    :param pack_type: Filters results on pack type
    :type pack_type: str
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number.
    :type limit: int
    :param include_game_data: Determines whether to include game data in the results
    :type include_game_data: bool
    :param include_inactive: Determines whether to include inactive results
    :type include_inactive: bool
    :param app_key: The application to filter results on
    :type app_key: str

    :rtype: Union[List[PackResponse], Tuple[List[PackResponse], int], Tuple[List[PackResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_pack(version, account_id, pack_id, allocate_tickets, ticket_count, title=None, description=None, search_tags=None, active=None, game_type=None, app_key=None, pack_type=None, pack_order=None, sequence_type=None, background_id=None, image_id=None, start_date=None, end_date=None, author_override=None, price=None, price_type=None, game_level_ids=None, in_game=None, highest=None, ticket_type=None, points=None):  # noqa: E501
    """Update Pack

    Update a pack. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param pack_id: The id of the pack to update.
    :type pack_id: int
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed packs
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param title: The title of the pack
    :type title: str
    :param description: The description of the pack
    :type description: str
    :param search_tags: The tags for searching the pack, comma separated
    :type search_tags: str
    :param active: Activate/deactivate the pack
    :type active: bool
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param pack_type: The type of the pack
    :type pack_type: str
    :param pack_order: The order of the pack
    :type pack_order: int
    :param sequence_type: The type of game sequence of the pack
    :type sequence_type: str
    :param background_id: The background asset id of the pack
    :type background_id: int
    :param image_id: The image asset id of the pack
    :type image_id: int
    :param start_date: The date/time to start the pack, send 0 to unset
    :type start_date: int
    :param end_date: The date/time to end the pack, send 0 to unset
    :type end_date: int
    :param author_override: 
    :type author_override: str
    :param price: The price in tickets to purchase this pack
    :type price: int
    :param price_type: the type of ticket required to purchase this pack
    :type price_type: str
    :param game_level_ids: the game level ids to include in the pack, comma separated
    :type game_level_ids: str
    :param in_game: 
    :type in_game: bool
    :param highest: The scoring is highest is best
    :type highest: bool
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a pack
    :type points: int

    :rtype: Union[PackResponse, Tuple[PackResponse, int], Tuple[PackResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
