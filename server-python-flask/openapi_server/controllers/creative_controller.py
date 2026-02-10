import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.creative_response import CreativeResponse  # noqa: E501
from openapi_server.models.mission_response import MissionResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def add_preview(version, account_id, creative_id):  # noqa: E501
    """Add Preview

    Enable this ad for preview for this account. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account
    :type account_id: int
    :param creative_id: The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.
    :type creative_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def ads_find(version, app_key, randomize, targeted_ads_only, type=None, account_id=None, app_version=None, latitude=None, longitude=None, device=None, device_identifier=None, device_version=None, start=None, limit=None, include_audiences=None, allocates_tickets=None, mission_ids=None):  # noqa: E501
    """Find Missions

    Get a set of ad filtered by the parameters provided. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.
    :type app_key: str
    :param randomize: return a random set of results, default is true. If false returns in nature order.
    :type randomize: bool
    :param targeted_ads_only: return only ads targets to the specific app, no global ads.
    :type targeted_ads_only: bool
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
    :param include_audiences: If true then return the audience data in the response. Default is false.
    :type include_audiences: bool
    :param allocates_tickets: If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.
    :type allocates_tickets: bool
    :param mission_ids: return only ads from the specified campaigns.
    :type mission_ids: str

    :rtype: Union[List[MissionResponse], Tuple[List[MissionResponse], int], Tuple[List[MissionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def create_creative(version, account_id, name, active, wait_for_asset, description=None, asset_image_id=None, action=None, data=None, suffix=None, type=None, balance=None, reference_id=None, app_version=None, mission_id=None, offer_id=None):  # noqa: E501
    """Create Creative

    Create a creative # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the level.
    :type name: str
    :param active: If true set the game level as active. Default is false.
    :type active: bool
    :param wait_for_asset: determines whether the response will wait until the asset gets created
    :type wait_for_asset: bool
    :param description: The description of the level.
    :type description: str
    :param asset_image_id: The asset Id of the level image.
    :type asset_image_id: int
    :param action: This parameter is deprecated. deprecated use data field
    :type action: str
    :param data: The creative data, json based format depending on type. If not using action then data is required.
    :type data: str
    :param suffix: This parameter is deprecated. deprecated use type field
    :type suffix: str
    :param type: The type of creative. If not using suffix then type is required.
    :type type: str
    :param balance: Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    :type balance: float
    :param reference_id: if creative related so some other content provided the id
    :type reference_id: int
    :param app_version: The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.
    :type app_version: str
    :param mission_id: Assign the creative to a campaign for timing and audience matching.
    :type mission_id: int
    :param offer_id: the id of the offer
    :type offer_id: int

    :rtype: Union[CreativeResponse, Tuple[CreativeResponse, int], Tuple[CreativeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_creative(version, account_id, creative_id):  # noqa: E501
    """Delete Creative

    Delete a creative # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param creative_id: the id of the creative to delete
    :type creative_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_creative(version, account_id, creative_id):  # noqa: E501
    """Get Creative

    Get a creative # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param creative_id: the ID of the creative to get
    :type creative_id: int

    :rtype: Union[CreativeResponse, Tuple[CreativeResponse, int], Tuple[CreativeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_creatives_by_application(version, account_id, app_key, start, limit, mission_id=None, keyword=None):  # noqa: E501
    """Search Creatives

    Get a list of levels for an application, just those the account has permissions to view. # noqa: E501

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
    :param mission_id: Creatives contained in the provided mission.
    :type mission_id: int
    :param keyword: Match the keyword to the owner name or level name.
    :type keyword: str

    :rtype: Union[List[CreativeResponse], Tuple[List[CreativeResponse], int], Tuple[List[CreativeResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_preview(version, account_id, creative_id):  # noqa: E501
    """Remove Preview

    Remove this ad for preview for this account. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the ID of the logged in user
    :type account_id: int
    :param creative_id: the ID of the creative to remove preview
    :type creative_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_creative(version, account_id, creative_id, name=None, description=None, asset_image_id=None, action=None, data=None, suffix=None, type=None, balance=None, active=None, reference_id=None, app_version=None, mission_id=None):  # noqa: E501
    """Update Creative

    Update a creative # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param creative_id: the creative Id to upate.
    :type creative_id: int
    :param name: The name of the level.
    :type name: str
    :param description: The description of the level.
    :type description: str
    :param asset_image_id: The asset Id of the level image.
    :type asset_image_id: int
    :param action: This parameter is deprecated. deprecated use data field
    :type action: str
    :param data: The creative data, json based format depending on type
    :type data: str
    :param suffix: This parameter is deprecated. deprecated use type field
    :type suffix: str
    :param type: The type of creative.
    :type type: str
    :param balance: Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    :type balance: float
    :param active: If true set the game level as active. Default is false.
    :type active: bool
    :param reference_id: if creative related so some other content provided the id
    :type reference_id: int
    :param app_version: The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.
    :type app_version: str
    :param mission_id: Assign the creative to a campaign for timing and audience matching.
    :type mission_id: int

    :rtype: Union[CreativeResponse, Tuple[CreativeResponse, int], Tuple[CreativeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
