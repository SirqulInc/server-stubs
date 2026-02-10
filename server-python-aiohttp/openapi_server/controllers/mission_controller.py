from typing import List, Dict
from aiohttp import web

from openapi_server.models.mission_format_response import MissionFormatResponse
from openapi_server.models.mission_response import MissionResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_mission(request: web.Request, version, account_id, title, description=None, sub_type=None, start_date=None, end_date=None, active=None, game_level_ids=None, creative_ids=None, audience_ids=None, mission_task=None, format_type=None, offer_id=None, balance=None, advanced_reporting=None, allocate_tickets=None, ticket_count=None, ticket_type=None, points=None, meta_data=None, application_ids=None, devices=None, device_ids=None, device_versions=None, locations=None, radius=None) -> web.Response:
    """Create Mission

    Create a user defined mission.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param title: The title of the mission
    :type title: str
    :param description: The description of the mission
    :type description: str
    :param sub_type: Custom string client apps can use for searching/filtering missions
    :type sub_type: str
    :param start_date: The date/time to start the mission, send 0 to unset
    :type start_date: int
    :param end_date: The date/time to end the mission, send 0 to unset
    :type end_date: int
    :param active: Activate/deactivate the mission
    :type active: bool
    :param game_level_ids: the game level ids to include in the mission, comma separated
    :type game_level_ids: str
    :param creative_ids: creatives to associate with the mission
    :type creative_ids: str
    :param audience_ids: audiences to associate with the mission
    :type audience_ids: str
    :param mission_task: This parameter is deprecated.
    :type mission_task: str
    :param format_type: The string identifier for a mission format (this is not the missionFormatId)
    :type format_type: str
    :param offer_id: The offerId to give as a reward
    :type offer_id: int
    :param balance: Set the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.
    :type balance: float
    :param advanced_reporting: Flag to mark the mission as eligible for advanced reporting
    :type advanced_reporting: bool
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed missions
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int
    :param meta_data: external custom client defined data
    :type meta_data: str
    :param application_ids: Comma separated list of application ids
    :type application_ids: str
    :param devices: Deprecated parameter for device names
    :type devices: str
    :param device_ids: Comma separated list of device ids
    :type device_ids: str
    :param device_versions: Comma separated list of device version ranges
    :type device_versions: str
    :param locations: List of lat/long pairs for mission locations
    :type locations: str
    :param radius: Comma separated list of radii for locations
    :type radius: str

    """
    return web.Response(status=200)


async def delete_mission(request: web.Request, version, account_id, mission_id) -> web.Response:
    """Delete Mission

    Delete a mission.

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param mission_id: the id of the mission to delete
    :type mission_id: int

    """
    return web.Response(status=200)


async def find_missions(request: web.Request, version, app_key, suffix=None, type=None, account_id=None, app_version=None, latitude=None, longitude=None, device=None, device_identifier=None, device_version=None, start=None, limit=None, include_game_data=None, include_audiences=None, allocates_tickets=None, randomize=None, targeted_ads_only=None, mission_ids=None, audience_operator=None) -> web.Response:
    """Find Missions

    Get a set of ad filtered by the parameters provided.

    :param version: 
    :type version: 
    :param app_key: The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.
    :type app_key: str
    :param suffix: The type of mission to get, possible values are: click_banner, click_leaderboard, click_skyscraper, click_full, click_video, or click_zip
    :type suffix: str
    :param type: The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.
    :type type: str
    :param account_id: The logged in user.
    :type account_id: int
    :param app_version: The version of the application, will not return levels newer than the appVersion.
    :type app_version: str
    :param latitude: The current location of the requesting device
    :type latitude: float
    :param longitude: The current location of the requesting device
    :type longitude: float
    :param device: Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.
    :type device: str
    :param device_identifier: The device ID of the requesting device, use /audience/devices for list
    :type device_identifier: int
    :param device_version: The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.
    :type device_version: str
    :param start: The index into the record set to start with.
    :type start: int
    :param limit: The total number of record to return.
    :type limit: int
    :param include_game_data: Include the game level data with the mission.
    :type include_game_data: bool
    :param include_audiences: If true then return the audience data in the response. Default is false.
    :type include_audiences: bool
    :param allocates_tickets: If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.
    :type allocates_tickets: bool
    :param randomize: return a random set of results, default is true. If false returns in natural order.
    :type randomize: bool
    :param targeted_ads_only: return only ads targeted to the specific app, no global ads.
    :type targeted_ads_only: bool
    :param mission_ids: return only ads from the specified campaigns.
    :type mission_ids: str
    :param audience_operator: will return the items that have at least 1 or all of their audiences exist in the logged in user’s audiences, depending if the value is OR or AND
    :type audience_operator: str

    """
    return web.Response(status=200)


async def get_mission(request: web.Request, version, account_id, mission_id, return_creative=None) -> web.Response:
    """Get Mission

    Get a mission.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param mission_id: The id of the mission to return.
    :type mission_id: int
    :param return_creative: Return creatives associated with the mission when true
    :type return_creative: bool

    """
    return web.Response(status=200)


async def import_mission(request: web.Request, version, account_id, latitude, longitude, app_key, keyword=None, start=None, limit=None, ad_size=None) -> web.Response:
    """Import Mission

    Create a mission using a source item such as an offer location.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param latitude: The current location of the requesting device
    :type latitude: float
    :param longitude: The current location of the requesting device
    :type longitude: float
    :param app_key: the application key
    :type app_key: str
    :param keyword: the keyword of the mission
    :type keyword: str
    :param start: The starting index in the result set to return. Default is 0.
    :type start: int
    :param limit: The total number of records to return. Default is 20.
    :type limit: int
    :param ad_size: the size of the ad
    :type ad_size: str

    """
    return web.Response(status=200)


async def search_mission_formats(request: web.Request, version, start, limit, active_only) -> web.Response:
    """Search Mission Formats

    Searches on pre-defined mission formats

    :param version: 
    :type version: 
    :param start: The starting index in the result set to return. Default is 0.
    :type start: int
    :param limit: The total number of records to return. Default is 20.
    :type limit: int
    :param active_only: Determines whether to return only active results. Default is false.
    :type active_only: bool

    """
    return web.Response(status=200)


async def search_missions(request: web.Request, version, account_id, keyword=None, sub_type=None, start=None, limit=None, include_game_data=None, include_audiences=None, include_inactive=None, suffix=None, sort_field=None, descending=None) -> web.Response:
    """Search Missions

    Get the list missions available to the account.  

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param keyword: Filter by keyword
    :type keyword: str
    :param sub_type: Custom string client apps can use for searching/filtering missions
    :type sub_type: str
    :param start: The index into the record set to start with. Default is 0.
    :type start: int
    :param limit: The total number of record to return. Default is 20, maximum is 100.
    :type limit: int
    :param include_game_data: If true then return the game level data in the response. Default is false.
    :type include_game_data: bool
    :param include_audiences: If true then return the audience data in the response. Default is false.
    :type include_audiences: bool
    :param include_inactive: If true then include inactive missions. Default is false.
    :type include_inactive: bool
    :param suffix: A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml
    :type suffix: str
    :param sort_field: The field to sort the search on (for example TITLE)
    :type sort_field: str
    :param descending: Whether to sort in descending order (default true)
    :type descending: bool

    """
    return web.Response(status=200)


async def search_missions_by_billable_entity(request: web.Request, version, account_id, keyword=None, start=None, limit=None, include_game_data=None, include_audiences=None, include_inactive=None, suffix=None, sort_field=None, descending=None) -> web.Response:
    """Search Missions by Billable Entity

    Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param keyword: Filter by keyword
    :type keyword: str
    :param start: The index into the record set to start with. Default is 0.
    :type start: int
    :param limit: The total number of record to return. Default id 20.
    :type limit: int
    :param include_game_data: If true then return the game level data in the response. Default is false.
    :type include_game_data: bool
    :param include_audiences: If true then return the audience data in the response. Default is false.
    :type include_audiences: bool
    :param include_inactive: If true then include inactive missions. Default is false.
    :type include_inactive: bool
    :param suffix: A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml
    :type suffix: str
    :param sort_field: The field to sort the search on (for example TITLE)
    :type sort_field: str
    :param descending: Whether to sort in descending order (default true)
    :type descending: bool

    """
    return web.Response(status=200)


async def update_mission(request: web.Request, version, account_id, mission_id, title=None, description=None, sub_type=None, meta_data=None, start_date=None, end_date=None, active=None, game_level_ids=None, creative_ids=None, audience_ids=None, offer_id=None, balance=None, advanced_reporting=None, allocate_tickets=None, ticket_count=None, ticket_type=None, points=None, application_ids=None, devices=None, device_ids=None, device_versions=None, locations=None, radius=None) -> web.Response:
    """Update Mission

    Update a mission.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param mission_id: The id of the mission to update.
    :type mission_id: int
    :param title: The title of the mission
    :type title: str
    :param description: The description of the mission
    :type description: str
    :param sub_type: Custom string client apps can use for searching/filtering missions
    :type sub_type: str
    :param meta_data: external custom client defined data
    :type meta_data: str
    :param start_date: The date/time to start the mission, send 0 to unset
    :type start_date: int
    :param end_date: The date/time to end the mission, send 0 to unset
    :type end_date: int
    :param active: Activate/deactivate the mission
    :type active: bool
    :param game_level_ids: the game level ids to include in the mission, comma separated
    :type game_level_ids: str
    :param creative_ids: 
    :type creative_ids: str
    :param audience_ids: 
    :type audience_ids: str
    :param offer_id: The offerId to give as a reward
    :type offer_id: int
    :param balance: Replace the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.
    :type balance: float
    :param advanced_reporting: Flag to mark the mission as eligible for advanced reporting
    :type advanced_reporting: bool
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed missions
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int
    :param application_ids: Comma separated list of application ids
    :type application_ids: str
    :param devices: Deprecated parameter for device names
    :type devices: str
    :param device_ids: Comma separated list of device ids
    :type device_ids: str
    :param device_versions: Comma separated list of device version ranges
    :type device_versions: str
    :param locations: List of lat/long pairs for mission locations
    :type locations: str
    :param radius: Comma separated list of radii for locations
    :type radius: str

    """
    return web.Response(status=200)
