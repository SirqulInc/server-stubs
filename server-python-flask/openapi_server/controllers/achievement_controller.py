import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.achievement_progress_response import AchievementProgressResponse  # noqa: E501
from openapi_server.models.achievement_response import AchievementResponse  # noqa: E501
from openapi_server.models.achievement_short_response import AchievementShortResponse  # noqa: E501
from openapi_server.models.achievement_tier_response import AchievementTierResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def api_version_achievement_tier_search_post(version, device_id=None, account_id=None, app_key=None, keyword=None, achievement_type=None, rank_type=None, sort_field=None, descending=None, descending_goal=None, start=None, limit=None):  # noqa: E501
    """Searches an Achievement Tier

    Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param keyword: the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)
    :type keyword: str
    :param achievement_type: filter results by achievementType (these are exact case sensitive matches)
    :type achievement_type: int
    :param rank_type: filter results by the rankType (these are the exact case sensitive matches)
    :type rank_type: str
    :param sort_field: the field to sort by. See {@link AchievementApiMap}
    :type sort_field: str
    :param descending: determines whether the sort list is in descending or ascending order (of the achievement)
    :type descending: bool
    :param descending_goal: determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)
    :type descending_goal: bool
    :param start: The start of the index for pagination
    :type start: int
    :param limit: the limit for pagination (has a hard limit of 1000)
    :type limit: int

    :rtype: Union[AchievementTierResponse, Tuple[AchievementTierResponse, int], Tuple[AchievementTierResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_achievement(version, app_key, title, device_id=None, account_id=None, analytics_tag=None, description=None, rank_type=None, rank_increment=None, min_increment=None, max_increment=None, validate=None, active=None, trigger_definition=None):  # noqa: E501
    """Create Achievement

    Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: the application key the achievement is for
    :type app_key: str
    :param title: the title of the achievement (255 character limit)
    :type title: str
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param analytics_tag: the analytics tag that will trigger when a user&#39;s achievement count gets updated
    :type analytics_tag: str
    :param description: the description of the achievement
    :type description: str
    :param rank_type: the rank type for updating leader boards
    :type rank_type: str
    :param rank_increment: determines how much the rank count is incremented
    :type rank_increment: int
    :param min_increment: restrict scores to be above or equal to this minimum value
    :type min_increment: int
    :param max_increment: restrict scores to be below or equal to this maximum value
    :type max_increment: int
    :param validate: determines whether the customId on analytics are used to validate a user&#39;s achievement progress.
    :type validate: bool
    :param active: achievement is active or inactive
    :type active: bool
    :param trigger_definition: if provided will define what triggers to run after a tier is completed
    :type trigger_definition: str

    :rtype: Union[AchievementResponse, Tuple[AchievementResponse, int], Tuple[AchievementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_achievement_tier(version, achievement_id, score_all_instances, device_id=None, account_id=None, icon=None, icon_asset_id=None, title=None, description=None, goal_count=None, mission_id=None, game_id=None, pack_id=None, game_level_id=None, game_object_id=None):  # noqa: E501
    """Create Achievement Tier

    Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param achievement_id: the achievement id for adding a new tier
    :type achievement_id: int
    :param score_all_instances: score all instances
    :type score_all_instances: bool
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param icon: achievement tier icon image file
    :type icon: str
    :param icon_asset_id: the icon assetId, if icon is provided, icon will overrule
    :type icon_asset_id: int
    :param title: the title of the achievement tier
    :type title: str
    :param description: the description of the achievement tier
    :type description: str
    :param goal_count: the count requirement for completing the achievement tier
    :type goal_count: int
    :param mission_id: The ID of the mission to associate with the achievement
    :type mission_id: int
    :param game_id: The ID of the game to associate with the achievement
    :type game_id: int
    :param pack_id: The ID of the pack to associate with the achievement
    :type pack_id: int
    :param game_level_id: The ID of the game level to associate with the achievement
    :type game_level_id: int
    :param game_object_id: The ID of the game object to associate with the achievement
    :type game_object_id: int

    :rtype: Union[AchievementTierResponse, Tuple[AchievementTierResponse, int], Tuple[AchievementTierResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_achievement(version, achievement_id, account_id=None):  # noqa: E501
    """Delete Achievement

    Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for. # noqa: E501

    :param version: 
    :type version: 
    :param achievement_id: The ID of the achievement
    :type achievement_id: int
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_achievement_tier(version, achievement_tier_id, account_id=None):  # noqa: E501
    """Delete Achievement Tier

    Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for. # noqa: E501

    :param version: 
    :type version: 
    :param achievement_tier_id: the achievement id for deletion
    :type achievement_tier_id: int
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_achievement(version, achievement_id, device_id=None, account_id=None, achievement_type=None):  # noqa: E501
    """Get Achievement

    Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param achievement_id: The ID of the achievement
    :type achievement_id: int
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param achievement_type: achievementType
    :type achievement_type: str

    :rtype: Union[AchievementTierResponse, Tuple[AchievementTierResponse, int], Tuple[AchievementTierResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_achievement_tier(version, account_id, achievement_tier_id):  # noqa: E501
    """Gets an achievement tier

    Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param achievement_tier_id: the achievement tier id that is being retrieved
    :type achievement_tier_id: int

    :rtype: Union[AchievementTierResponse, Tuple[AchievementTierResponse, int], Tuple[AchievementTierResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_achievements(version, return_nulls, app_key, include_undiscovered, device_id=None, account_id=None, connection_account_email=None, connection_account_id=None, rank_type=None, achievement_type=None, latitude=None, longitude=None):  # noqa: E501
    """Get Achievement Progress

    Gets a list of user achievements. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: determines whether to return null fields in the response
    :type return_nulls: bool
    :param app_key: the application key for filtering results by application
    :type app_key: str
    :param include_undiscovered: determines whether to return achievements that the user has not discovered yet
    :type include_undiscovered: bool
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_email: the email of the account to view achievements
    :type connection_account_email: str
    :param connection_account_id: the id of the account to view achievements
    :type connection_account_id: int
    :param rank_type: filter results by achievement rankType
    :type rank_type: str
    :param achievement_type: filter results by achievement type
    :type achievement_type: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[List[AchievementProgressResponse], Tuple[List[AchievementProgressResponse], int], Tuple[List[AchievementProgressResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def list_achievement_tags(version, app_key=None):  # noqa: E501
    """List Achievement Tags

    List achievement tags by application # noqa: E501

    :param version: 
    :type version: 
    :param app_key: filter results by application key
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_achievements(version, sort_field, descending, start, limit, active_only, device_id=None, account_id=None, app_key=None, keyword=None, achievement_type=None, rank_type=None):  # noqa: E501
    """List Achievements

    List achievements by billable. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: the field to sort by. See AchievementApiMap
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination (has a hard limit of 1000)
    :type limit: int
    :param active_only: Filter results to only return active achievements
    :type active_only: bool
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param keyword: the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)
    :type keyword: str
    :param achievement_type: filter results by the achievementType (these are exact case sensitive matches)
    :type achievement_type: str
    :param rank_type: filter results by the rankType (these are exact case sensitive matches)
    :type rank_type: str

    :rtype: Union[List[AchievementShortResponse], Tuple[List[AchievementShortResponse], int], Tuple[List[AchievementShortResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_achievements(version, app_key, sort_field, descending, include_tiers, include_inactive_tiers, start, limit, device_id=None, account_id=None, keyword=None, achievement_type=None, rank_type=None):  # noqa: E501
    """Search Achievements

    Searches achievements by application for consumers. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: the application key
    :type app_key: str
    :param sort_field: the field to sort by. See AchievementApiMap
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param include_tiers: return tiers, only applicable for version &gt;3.18
    :type include_tiers: bool
    :param include_inactive_tiers: return inactive tiers, only applicable when includeTiers is true, only applicable for version &gt;3.18
    :type include_inactive_tiers: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination (has a hard limit of 1000)
    :type limit: int
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param keyword: the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)
    :type keyword: str
    :param achievement_type: filter results by the achievementType (these are exact case sensitive matches)
    :type achievement_type: str
    :param rank_type: filter results by the rankType (these are exact case sensitive matches)
    :type rank_type: str

    :rtype: Union[List[AchievementShortResponse], Tuple[List[AchievementShortResponse], int], Tuple[List[AchievementShortResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_achievement(version, device_id=None, account_id=None, achievement_id=None, analytics_tag=None, title=None, description=None, rank_type=None, rank_increment=None, min_increment=None, null_min_increment=None, max_increment=None, null_max_increment=None, validate=None, active=None, trigger_definition=None):  # noqa: E501
    """Update Achievement

    Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param achievement_id: the achievement ID for updating an existing achievement
    :type achievement_id: int
    :param analytics_tag: the analytics tag that will trigger when a user&#39;s achievement count gets updated
    :type analytics_tag: str
    :param title: the title of the achievement (255 character limit)
    :type title: str
    :param description: the description of the achievement
    :type description: str
    :param rank_type: the rank type for updating leader boards
    :type rank_type: str
    :param rank_increment: determines how much the rank count is incremented
    :type rank_increment: int
    :param min_increment: restrict scores to be above or equal to this minimum value
    :type min_increment: int
    :param null_min_increment: enable to ignore usage of minIncrement
    :type null_min_increment: bool
    :param max_increment: restrict scores to be below or equal to this maximum value
    :type max_increment: int
    :param null_max_increment: enable to ignore usage of maxIncrement
    :type null_max_increment: bool
    :param validate: determines whether the customId on analytics are used to validate a user&#39;s achievement progress.
    :type validate: bool
    :param active: if it&#39;s active or inactive
    :type active: bool
    :param trigger_definition: if provided will define what triggers to run after a tier is completed
    :type trigger_definition: str

    :rtype: Union[AchievementResponse, Tuple[AchievementResponse, int], Tuple[AchievementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_achievement_tier(version, achievement_tier_id, device_id=None, account_id=None, icon=None, icon_asset_id=None, title=None, description=None, goal_count=None, mission_id=None, game_id=None, pack_id=None, game_level_id=None, game_object_id=None, score_all_instances=None):  # noqa: E501
    """Update Achievement Tier

    Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. # noqa: E501

    :param version: 
    :type version: 
    :param achievement_tier_id: the achievement tier id for updating
    :type achievement_tier_id: int
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param icon: achievement tier icon image file
    :type icon: str
    :param icon_asset_id: the icon assetId, if icon is provided, icon will overrule
    :type icon_asset_id: int
    :param title: the title of the achievement tier
    :type title: str
    :param description: the description of the achievement tier
    :type description: str
    :param goal_count: the count requirement for completing the achievement tier
    :type goal_count: int
    :param mission_id: The ID of the mission to associate with the achievement
    :type mission_id: int
    :param game_id: The ID of the game to associate with the achievement
    :type game_id: int
    :param pack_id: The ID of the pack to associate with the achievement
    :type pack_id: int
    :param game_level_id: The ID of the game level to associate with the achievement
    :type game_level_id: int
    :param game_object_id: The ID of the game object to associate with the achievement
    :type game_object_id: int
    :param score_all_instances: score all instances
    :type score_all_instances: bool

    :rtype: Union[AchievementTierResponse, Tuple[AchievementTierResponse, int], Tuple[AchievementTierResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_user_achievement(version, account_id, achievement_id=None, tag=None, custom_id=None, increment=None, start_date=None, end_date=None, return_progress=None):  # noqa: E501
    """Update Achievement Progress

    Update user achievement progress. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param achievement_id: the achievement id (achievementId or tag required)
    :type achievement_id: int
    :param tag: the analytic tag to identify an achievement (achievementId or tag required)
    :type tag: str
    :param custom_id: a custom identifier used for validation
    :type custom_id: int
    :param increment: the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement&#39;s rankIncrement value)
    :type increment: int
    :param start_date: a custom start date that the client can set (not yet used in server logic)
    :type start_date: int
    :param end_date: a custom end date that the client can set (not yet used in server logic)
    :type end_date: int
    :param return_progress: determines whether to return the achievement progress response
    :type return_progress: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
