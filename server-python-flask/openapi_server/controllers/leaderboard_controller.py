import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.leaderboard_response import LeaderboardResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_leaderboard(version, account_id=None, app_key=None, rank_type=None, leaderboard_mode=None, icon_media=None, icon_asset_id=None, banner_media=None, banner_asset_id=None, limitation=None, sort_field=None, title=None, description=None, meta_data=None):  # noqa: E501
    """Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation

    Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user creating the leaderboard.
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param rank_type: a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS
    :type rank_type: str
    :param leaderboard_mode: the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword
    :type leaderboard_mode: str
    :param icon_media: a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)
    :type icon_media: str
    :param icon_asset_id: The asset ID to set the leaderboard icon
    :type icon_asset_id: int
    :param banner_media: a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)
    :type banner_media: str
    :param banner_asset_id: The asset ID to set the leaderboard banner
    :type banner_asset_id: int
    :param limitation: limit number of rankings for each leaderboard
    :type limitation: int
    :param sort_field: determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST
    :type sort_field: str
    :param title: leaderboard&#39;s title
    :type title: str
    :param description: leaderboard&#39;s description
    :type description: str
    :param meta_data: custom meta data for the leaderboard
    :type meta_data: str

    :rtype: Union[LeaderboardResponse, Tuple[LeaderboardResponse, int], Tuple[LeaderboardResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_leaderboard(version, leaderboard_id, account_id=None):  # noqa: E501
    """Delete the Leader Board

    Removes a leader board id. # noqa: E501

    :param version: 
    :type version: 
    :param leaderboard_id: The leaderboard id to delete.
    :type leaderboard_id: int
    :param account_id: The account id of the user making the request.
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_leaderboard(version, leaderboard_id, account_id=None, include_full_ranking_list=None):  # noqa: E501
    """Read a leaderboard by id and retrieve the matching ranking list

    Read a leaderboard by id and retrieve the matching ranking list # noqa: E501

    :param version: 
    :type version: 
    :param leaderboard_id: The leaderboard id.
    :type leaderboard_id: int
    :param account_id: A valid account.
    :type account_id: int
    :param include_full_ranking_list: set to true if need to return the leaderboard&#39;s full ranking list
    :type include_full_ranking_list: bool

    :rtype: Union[LeaderboardResponse, Tuple[LeaderboardResponse, int], Tuple[LeaderboardResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_leaderboards(version, account_id=None, app_key=None, global_only=None, keyword=None, leaderboard_ids=None, rank_types=None, sort_field=None, descending=None, include_inactive=None, include_app_response=None, start=None, limit=None):  # noqa: E501
    """Search leaderboard and retrieve the matching ranking list

    Search leaderboard and retrieve the matching ranking list # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user requesting the search.
    :type account_id: int
    :param app_key: The application key.
    :type app_key: str
    :param global_only: only include global leaderboards (this overrides the appKey filter)
    :type global_only: bool
    :param keyword: keyword to search by title
    :type keyword: str
    :param leaderboard_ids: comma separated list of leaderboard ids to filter results with
    :type leaderboard_ids: str
    :param rank_types: comma separated list of rankType to filter results with
    :type rank_types: str
    :param sort_field: sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param include_inactive: include inactive in the result
    :type include_inactive: bool
    :param include_app_response: determines whether to include the application response for each leaderboard
    :type include_app_response: bool
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number.
    :type limit: int

    :rtype: Union[LeaderboardResponse, Tuple[LeaderboardResponse, int], Tuple[LeaderboardResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_leaderboard(version, leaderboard_id, account_id=None, app_key=None, rank_type=None, leaderboard_mode=None, sort_field=None, icon_media=None, icon_asset_id=None, banner_media=None, banner_asset_id=None, limitation=None, active=None, title=None, description=None, meta_data=None):  # noqa: E501
    """Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation

    Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation # noqa: E501

    :param version: 
    :type version: 
    :param leaderboard_id: The leaderboard id to update.
    :type leaderboard_id: int
    :param account_id: The account id of the user updating the leaderboard.
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param rank_type: a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.
    :type rank_type: str
    :param leaderboard_mode: the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM
    :type leaderboard_mode: str
    :param sort_field: determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST
    :type sort_field: str
    :param icon_media: a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)
    :type icon_media: str
    :param icon_asset_id: The asset ID to set the leaderboard icon
    :type icon_asset_id: int
    :param banner_media: a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)
    :type banner_media: str
    :param banner_asset_id: The asset ID to set the leaderboard banner
    :type banner_asset_id: int
    :param limitation: limit number of rankings for each leaderboard
    :type limitation: int
    :param active: Whether the leaderboard is active
    :type active: bool
    :param title: leaderboard&#39;s title
    :type title: str
    :param description: leaderboard&#39;s description
    :type description: str
    :param meta_data: custom meta data for the leaderboard
    :type meta_data: str

    :rtype: Union[LeaderboardResponse, Tuple[LeaderboardResponse, int], Tuple[LeaderboardResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
