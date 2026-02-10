import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.rank_full_response import RankFullResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def get_historical_rankings(version, app_key, rank_type, start_date, end_date, device_id=None, account_id=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search Historical Rankings

    Get historical leaderboard rankings by time-frame. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: the application key for filtering results by application
    :type app_key: str
    :param rank_type: the rank type to return
    :type rank_type: str
    :param start_date: timestamp in milliseconds to filter results with
    :type start_date: int
    :param end_date: timestamp in milliseconds to filter results with
    :type end_date: int
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user
    :type account_id: int
    :param sort_field: determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST
    :type sort_field: str
    :param descending: determines whether to return results in ascending or descending order
    :type descending: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[RankFullResponse, Tuple[RankFullResponse, int], Tuple[RankFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_rankings(version, device_id=None, account_id=None, game_type=None, app_key=None, q=None, keyword=None, rank_type=None, leaderboard_mode=None, within_account_ids=None, return_user_rank=None, album_id=None, audience_id=None, sort_field=None, descending=None, i=None, start=None, l=None, limit=None):  # noqa: E501
    """Search Rankings

    Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: This parameter is deprecated.
    :type game_type: str
    :param app_key: the application key for filtering results by application (required for non-EXECUTIVE users)
    :type app_key: str
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: keyword to search for
    :type keyword: str
    :param rank_type: a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS
    :type rank_type: str
    :param leaderboard_mode: the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId
    :type leaderboard_mode: str
    :param within_account_ids: comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.
    :type within_account_ids: str
    :param return_user_rank: determines whether to return the user&#39;s current rank in the response. This can be turned off for sequential paginated requests.
    :type return_user_rank: bool
    :param album_id: album id to use when performing CUSTOM filters
    :type album_id: int
    :param audience_id: audience id to use when performing CUSTOM filters
    :type audience_id: int
    :param sort_field: determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score
    :type sort_field: str
    :param descending: determines whether to return results in ascending or descending order
    :type descending: bool
    :param i: This parameter is deprecated.
    :type i: int
    :param start: the start index for pagination
    :type start: int
    :param l: This parameter is deprecated.
    :type l: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[RankFullResponse, Tuple[RankFullResponse, int], Tuple[RankFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_rank(version, device_id=None, account_id=None, app_key=None, rank_type=None, return_user_rank=None, leaderboard_mode=None, sort_field=None, keyword=None, descending=None, start=None, limit=None):  # noqa: E501
    """Get Personal Rankings

    Returns the user&#39;s ranks for one or more rank types and modes. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user
    :type account_id: int
    :param app_key: the application key for filtering results by application (required)
    :type app_key: str
    :param rank_type: pass in all rankTypes and children rankTypes
    :type rank_type: str
    :param return_user_rank: determines whether to return the user&#39;s current rank in the response, for each rankType
    :type return_user_rank: bool
    :param leaderboard_mode: the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM
    :type leaderboard_mode: str
    :param sort_field: determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST
    :type sort_field: str
    :param keyword: keyword to search for (on rankType)
    :type keyword: str
    :param descending: determines whether to return results in descending order
    :type descending: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def override_user_rank(version, account_id, owner_account_id, app_key, rank_type, total_score=None, total_count=None, total_time=None, daily_score=None, daily_count=None, daily_time=None, weekly_score=None, weekly_count=None, weekly_time=None, monthly_score=None, monthly_count=None, monthly_time=None, top_score=None, lowest_score=None, streak_count=None, streak_best_count=None, start_date=None, end_date=None):  # noqa: E501
    """Override User Rank

    Allows an admin of an application to override a user&#39;s scores for a leaderboard. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the logged in user&#39;s account id (must have permissions to manage data for the application)
    :type account_id: int
    :param owner_account_id: the end user&#39;s account id to override
    :type owner_account_id: int
    :param app_key: the application key the leaderboard is for
    :type app_key: str
    :param rank_type: the rankType of the leaderboard
    :type rank_type: str
    :param total_score: the total score to update
    :type total_score: int
    :param total_count: the total count to update
    :type total_count: int
    :param total_time: the total time to update
    :type total_time: int
    :param daily_score: the daily score to update
    :type daily_score: int
    :param daily_count: the daily count to update
    :type daily_count: int
    :param daily_time: the daily time to update
    :type daily_time: int
    :param weekly_score: the weekly score to update
    :type weekly_score: int
    :param weekly_count: the weekly count to update
    :type weekly_count: int
    :param weekly_time: the weekly time to update
    :type weekly_time: int
    :param monthly_score: the monthly score to update
    :type monthly_score: int
    :param monthly_count: the monthly count to update
    :type monthly_count: int
    :param monthly_time: the monthly time to update
    :type monthly_time: int
    :param top_score: the top score to update
    :type top_score: int
    :param lowest_score: the lowest score to update
    :type lowest_score: int
    :param streak_count: the streak count to update
    :type streak_count: int
    :param streak_best_count: the best streak count to update
    :type streak_best_count: int
    :param start_date: the start date to update
    :type start_date: int
    :param end_date: the end date to update
    :type end_date: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_rankings(version, account_id, app_key, rank_type, increment=None, time_increment=None, tag=None, start_date=None, end_date=None, update_global=None, create_leaderboard=None):  # noqa: E501
    """Update Ranking

    Update the rank value  # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param app_key: the application key for filtering results by application
    :type app_key: str
    :param rank_type: a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS
    :type rank_type: str
    :param increment: the value to increment
    :type increment: int
    :param time_increment: the time value to increment
    :type time_increment: int
    :param tag: the analytic tag for this achievement (used to validate scores)
    :type tag: str
    :param start_date: custom date you can save along with the score for the user
    :type start_date: int
    :param end_date: custom date you can save along with the score for the user
    :type end_date: int
    :param update_global: update the global rankings if true, default is false
    :type update_global: bool
    :param create_leaderboard: create the leaderboard if it does not exist (default false)
    :type create_leaderboard: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
