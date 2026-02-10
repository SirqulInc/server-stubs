import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def get_app_data(version, start, limit, device_id=None, account_id=None, game_type=None, include_game_data=None, q=None, keyword=None, sort_field=None, descending=None, i=None, l=None, game_object_count=None, filter=None, date_created=None, owner_id=None, mission_ids=None, game_ids=None, pack_ids=None, game_level_ids=None, app_version=None, include_higher_version_packs=None, include_higher_version_levels=None, response_groups=None, purchase_type=None):  # noqa: E501
    """Get App Data

    Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application. # noqa: E501

    :param version: 
    :type version: 
    :param start: start the search results at a record.
    :type start: int
    :param limit: limit the search results to some number.
    :type limit: int
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param game_type: the game to retrieve the data for, use your application key.
    :type game_type: str
    :param include_game_data: if true then include the game data blob, otherwise don&#39;t include.
    :type include_game_data: bool
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: query string used to filter the search results when looking for community and saved levels.
    :type keyword: str
    :param sort_field: how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.
    :type sort_field: str
    :param descending: order the search results descending or ascending when looking for community and saved levels.
    :type descending: bool
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param game_object_count: if true then include the game object count, otherwise don&#39;t include.
    :type game_object_count: bool
    :param filter: restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED
    :type filter: str
    :param date_created: restrict the search to items created less then date
    :type date_created: int
    :param owner_id: get levels owned by a particular account
    :type owner_id: int
    :param mission_ids: get missions by specified id, comman seperated list of long ids
    :type mission_ids: str
    :param game_ids: get games by specified id, comman seperated list of long ids
    :type game_ids: str
    :param pack_ids: get packs by specified id, comman seperated list of long ids
    :type pack_ids: str
    :param game_level_ids: get game levels by specified id, comman seperated list of long ids
    :type game_level_ids: str
    :param app_version: the application version, used to versin the game level data
    :type app_version: str
    :param include_higher_version_packs: default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.
    :type include_higher_version_packs: bool
    :param include_higher_version_levels: default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.
    :type include_higher_version_levels: bool
    :param response_groups: use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list 
    :type response_groups: str
    :param purchase_type: the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase 
    :type purchase_type: str

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_app_data(version, game_type, start, limit, data, device_id=None, account_id=None, include_game_data=None, q=None, keyword=None, sort_field=None, descending=None, i=None, l=None, game_object_count=None, filter=None, date_created=None, owner_id=None, mission_ids=None, game_ids=None, pack_ids=None, game_level_ids=None, app_version=None, include_higher_version_packs=None, include_higher_version_levels=None, response_groups=None, purchase_type=None):  # noqa: E501
    """Create App Data

    Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application # noqa: E501

    :param version: 
    :type version: 
    :param game_type: the game to retrieve the data for, use your application key.
    :type game_type: str
    :param start: start the search results at a record.
    :type start: int
    :param limit: limit the search results to some number.
    :type limit: int
    :param data: The analytic data AnalyticListResponse
    :type data: str
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param include_game_data: if true then include the game data blob, otherwise don&#39;t include.
    :type include_game_data: bool
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: query string used to filter the search results when looking for community and saved levels.
    :type keyword: str
    :param sort_field: how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.
    :type sort_field: str
    :param descending: order the search results descending or ascending when looking for community and saved levels.
    :type descending: bool
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param game_object_count: if true then include the game object count, otherwise don&#39;t include.
    :type game_object_count: bool
    :param filter: restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED
    :type filter: str
    :param date_created: restrict the search to items created less then date
    :type date_created: int
    :param owner_id: get levels owned by a particular account
    :type owner_id: int
    :param mission_ids: get missions by specified id, comman seperated list of long ids
    :type mission_ids: str
    :param game_ids: get games by specified id, comman seperated list of long ids
    :type game_ids: str
    :param pack_ids: get packs by specified id, comman seperated list of long ids
    :type pack_ids: str
    :param game_level_ids: get game levels by specified id, comman seperated list of long ids
    :type game_level_ids: str
    :param app_version: the application version, used to versin the game level data
    :type app_version: str
    :param include_higher_version_packs: default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.
    :type include_higher_version_packs: bool
    :param include_higher_version_levels: default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.
    :type include_higher_version_levels: bool
    :param response_groups: use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list 
    :type response_groups: str
    :param purchase_type: the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase 
    :type purchase_type: str

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def regen_app_data(version, account_id=None, app_key=None, build_version=None, api_version=None):  # noqa: E501
    """Regenerate App Data

    Regenerate the app data cache for apps # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param app_key: process a specific application, if null process all apps with caches
    :type app_key: str
    :param build_version: create a specific version, if null use current version. Be careful if processing all
    :type build_version: str
    :param api_version: create a specific version, if null use current version. Be careful if processing all
    :type api_version: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
