import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.game_level_list_response import GameLevelListResponse  # noqa: E501
from openapi_server.models.game_level_response import GameLevelResponse  # noqa: E501
from openapi_server.models.question_response import QuestionResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.wordz_word_response import WordzWordResponse  # noqa: E501
from openapi_server import util


def create_game_level(version, account_id, name, game_data, game_data_suffix, app_key=None, description=None, difficulty=None, app_version=None, asset_image_id=None, asset_icon_id=None, visibility=None, friend_group=None, connection_ids=None, connection_group_ids=None, balance=None, active=None, allocate_tickets=None, ticket_count=None, ticket_type=None, points=None, tutorial_title=None, tutorial_message=None, tutorial_alignment=None, tutorial_image_asset_id=None, offer_id=None, meta_data=None):  # noqa: E501
    """Create Game Level

    Create a game level. Currently does NOT support game objects. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the level.
    :type name: str
    :param game_data: The game level data: xml, json, or other text based format.
    :type game_data: str
    :param game_data_suffix: The game level data format type.
    :type game_data_suffix: str
    :param app_key: The game application key to save the level for.
    :type app_key: str
    :param description: The description of the level.
    :type description: str
    :param difficulty: The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.
    :type difficulty: str
    :param app_version: The version number of the application required to correctly load/play the level.
    :type app_version: str
    :param asset_image_id: The asset Id of the level image.
    :type asset_image_id: int
    :param asset_icon_id: The asset Id of the level icon.
    :type asset_icon_id: int
    :param visibility: Is the level visible to others, possible values are: PUBLIC, PRIVATE.
    :type visibility: str
    :param friend_group: Make the level be readable by all friends.
    :type friend_group: bool
    :param connection_ids: Make the level be readable by connections in this list.
    :type connection_ids: str
    :param connection_group_ids: Make the level be readable by connection groups in this list.
    :type connection_group_ids: str
    :param balance: Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    :type balance: float
    :param active: If true set the game level as active. Default is false.
    :type active: bool
    :param allocate_tickets: If true then scoring will give tickets. Default is false.
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a level
    :type points: int
    :param tutorial_title: Title of the tutorial.
    :type tutorial_title: str
    :param tutorial_message: Message of the tutotrial.
    :type tutorial_message: str
    :param tutorial_alignment: Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY
    :type tutorial_alignment: str
    :param tutorial_image_asset_id: Asset id of the tutorial image.
    :type tutorial_image_asset_id: int
    :param offer_id: id of the offer
    :type offer_id: int
    :param meta_data: external custom client defined data
    :type meta_data: str

    :rtype: Union[GameLevelResponse, Tuple[GameLevelResponse, int], Tuple[GameLevelResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_game_level(version, account_id, level_id):  # noqa: E501
    """Delete Game Level

    Delete a game level. The level and account must be valid and have the appropirate permissions to view the content. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param level_id: The id of the level to return.
    :type level_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_game_level(version, account_id, level_id, include_game_data=None):  # noqa: E501
    """Get Game Level

    Get a game level. The level and account must be valid and have the appropirate permissions to view the content. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param level_id: The id of the level to return.
    :type level_id: int
    :param include_game_data: If true include the game level data, otherwise don&#39;t. default is false.
    :type include_game_data: bool

    :rtype: Union[GameLevelResponse, Tuple[GameLevelResponse, int], Tuple[GameLevelResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_game_levels_by_application(version, account_id, app_key, keyword=None, sort_field=None, descending=None, start=None, limit=None, app_version=None, include_game_data=None, filters=None):  # noqa: E501
    """Search Game Levels

    Get a list of levels for an application, just those the account has permissions to view. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param keyword: Match the keyword to the owner name or level name.
    :type keyword: str
    :param sort_field: what field to sort on
    :type sort_field: str
    :param descending: whether to return levels in ascending or descending order
    :type descending: bool
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number.
    :type limit: int
    :param app_version: The maximum version of the level to return.
    :type app_version: str
    :param include_game_data: If true include the game level data, otherwise don&#39;t. default is false.
    :type include_game_data: bool
    :param filters: 
    :type filters: str

    :rtype: Union[GameLevelListResponse, Tuple[GameLevelListResponse, int], Tuple[GameLevelListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_game_levels_by_billable_entity(version, account_id, app_key=None, keyword=None, sort_field=None, descending=None, active_only=None, start=None, limit=None):  # noqa: E501
    """Search Game Level by Billable Entity

    Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param sort_field: The column to sort the search on
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param active_only: Return only active results
    :type active_only: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int

    :rtype: Union[GameLevelResponse, Tuple[GameLevelResponse, int], Tuple[GameLevelResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_questions_in_level(version, level_id, account_id):  # noqa: E501
    """Get Level Questions

    Get questions within a level. # noqa: E501

    :param version: 
    :type version: 
    :param level_id: the id of the level to get questions from
    :type level_id: int
    :param account_id: the id of the logged in user
    :type account_id: int

    :rtype: Union[QuestionResponse, Tuple[QuestionResponse, int], Tuple[QuestionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_words_in_level(version, level_id, account_id):  # noqa: E501
    """Get Level Words

    Get words within a level. # noqa: E501

    :param version: 
    :type version: 
    :param level_id: the id of the level to get words for
    :type level_id: int
    :param account_id: the id of the logged in user
    :type account_id: int

    :rtype: Union[WordzWordResponse, Tuple[WordzWordResponse, int], Tuple[WordzWordResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_game_level(version, account_id, level_id, app_key=None, name=None, description=None, difficulty=None, app_version=None, asset_image_id=None, asset_icon_id=None, game_data=None, game_data_suffix=None, visibility=None, friend_group=None, connection_ids=None, connection_group_ids=None, balance=None, active=None, allocate_tickets=None, ticket_count=None, ticket_type=None, points=None, tutorial_title=None, tutorial_message=None, tutorial_alignment=None, tutorial_image_asset_id=None, offer_id=None, meta_data=None):  # noqa: E501
    """Update Game Level

    Update a game level. Currently does NOT support game objects. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param level_id: If update then include the level Id.
    :type level_id: int
    :param app_key: The game application key to save the level for.
    :type app_key: str
    :param name: The name of the level.
    :type name: str
    :param description: The description of the level.
    :type description: str
    :param difficulty: The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.
    :type difficulty: str
    :param app_version: The version number of the applicatuion required to correctly load/play the level.
    :type app_version: str
    :param asset_image_id: The asset Id of the level image.
    :type asset_image_id: int
    :param asset_icon_id: The asset Id of the level icon.
    :type asset_icon_id: int
    :param game_data: The game level data: xml, json, or other texted based format.
    :type game_data: str
    :param game_data_suffix: The game level data format type.
    :type game_data_suffix: str
    :param visibility: Is the level visible to others, possible values are: PUBLIC, PRIVATE.
    :type visibility: str
    :param friend_group: Make the level be readable by all friends.
    :type friend_group: bool
    :param connection_ids: Make the level be readable by connections in this list.
    :type connection_ids: str
    :param connection_group_ids: Make the level be readable by connection groups in this list.
    :type connection_group_ids: str
    :param balance: Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    :type balance: float
    :param active: If true set the game level as active.
    :type active: bool
    :param allocate_tickets: If true then scoring will give tickets.
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a level
    :type points: int
    :param tutorial_title: Title of the tutorial.
    :type tutorial_title: str
    :param tutorial_message: Message of the tutorial.
    :type tutorial_message: str
    :param tutorial_alignment: Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY
    :type tutorial_alignment: str
    :param tutorial_image_asset_id: Asset id of the tutorial image.
    :type tutorial_image_asset_id: int
    :param offer_id: 
    :type offer_id: int
    :param meta_data: external custom client defined data
    :type meta_data: str

    :rtype: Union[GameLevelResponse, Tuple[GameLevelResponse, int], Tuple[GameLevelResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_questions_in_level(version, level_id, account_id, question_ids):  # noqa: E501
    """Update Level Questions

    Updates a level with question game objects. # noqa: E501

    :param version: 
    :type version: 
    :param level_id: the id of the level to update questions on
    :type level_id: int
    :param account_id: the id of the logged in user
    :type account_id: int
    :param question_ids: the IDs of the questions to update
    :type question_ids: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_words_in_level(version, level_id, account_id, word_ids):  # noqa: E501
    """Update Level Words

    Updates a level with word game objects. # noqa: E501

    :param version: 
    :type version: 
    :param level_id: the id of the level to update words for
    :type level_id: int
    :param account_id: the id of the logged in user
    :type account_id: int
    :param word_ids: the ids of the words to update for the level
    :type word_ids: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
