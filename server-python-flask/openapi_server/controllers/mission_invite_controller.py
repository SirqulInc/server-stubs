import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.mission_response import MissionResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_mission_invite(version, device_id=None, account_id=None, mission_id=None, join_code=None, include_game_data=None):  # noqa: E501
    """Create Mission Invite

    Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param mission_id: The mission to find the invite for.
    :type mission_id: int
    :param join_code: code to be entered for user to join the mission
    :type join_code: str
    :param include_game_data: Include the game level data with the mission.
    :type include_game_data: bool

    :rtype: Union[MissionResponse, Tuple[MissionResponse, int], Tuple[MissionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_mission_invite(version, device_id=None, account_id=None, mission_id=None, mission_invite_id=None, include_game_data=None):  # noqa: E501
    """Delete Mission Invite

    Update the mission invite status to quit. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param mission_id: The mission to find the invite for (missionId or missionInviteId requried).
    :type mission_id: int
    :param mission_invite_id: The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    :type mission_invite_id: int
    :param include_game_data: Include the game level data with the mission.
    :type include_game_data: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_mission_invite(version, device_id=None, account_id=None, mission_id=None, mission_invite_id=None, include_game_data=None, include_scores=None):  # noqa: E501
    """Get Mission Invite

    Get the mission invite. An account can only be invited to a mission one time. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param mission_id: The mission to find the invite for (missionId or missionInviteId requried).
    :type mission_id: int
    :param mission_invite_id: The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    :type mission_invite_id: int
    :param include_game_data: Include the game level data with the mission.
    :type include_game_data: bool
    :param include_scores: include the scores with the mission
    :type include_scores: str

    :rtype: Union[MissionResponse, Tuple[MissionResponse, int], Tuple[MissionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_mission_invites(version, device_id=None, account_id=None, app_key=None, app_version=None, mission_id=None, status=None, last_updated=None, start=None, limit=None, keyword=None, mission_types=None, filter_by_billable=None, include_game_data=None):  # noqa: E501
    """Search Mission Invites

    Get a list of mission invites that the account has. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param app_key: the app to retrieve the data for, use your application key.
    :type app_key: str
    :param app_version: the application version, used to version the game level data
    :type app_version: str
    :param mission_id: the mission id to filter on
    :type mission_id: int
    :param status: The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}
    :type status: str
    :param last_updated: Only return invites that have been updated since this date/time (long)
    :type last_updated: int
    :param start: The index into the record set to start with.
    :type start: int
    :param limit: The total number of record to return.
    :type limit: int
    :param keyword: the keyword to search on
    :type keyword: str
    :param mission_types: 
    :type mission_types: str
    :param filter_by_billable: filter results by the account&#39;s billable
    :type filter_by_billable: bool
    :param include_game_data: Include the game level data with the mission.
    :type include_game_data: bool

    :rtype: Union[List[MissionResponse], Tuple[List[MissionResponse], int], Tuple[List[MissionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_mission_invite(version, device_id=None, account_id=None, app_key=None, mission_id=None, mission_invite_id=None, pack_id=None, game_level_id=None, status=None, permissionable_type=None, permissionable_id=None, include_game_data=None):  # noqa: E501
    """Update Mission Invite

    Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required).
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required).
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param mission_id: The mission to find the invite for (missionId or missionInviteId requried).
    :type mission_id: int
    :param mission_invite_id: The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    :type mission_invite_id: int
    :param pack_id: the pack id to find the invite for
    :type pack_id: int
    :param game_level_id: the game level id to find the invite for
    :type game_level_id: int
    :param status: The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}
    :type status: str
    :param permissionable_type: This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}
    :type permissionable_type: str
    :param permissionable_id: The id of the content being submitted.
    :type permissionable_id: int
    :param include_game_data: Include the game level data with the mission.
    :type include_game_data: bool

    :rtype: Union[MissionResponse, Tuple[MissionResponse, int], Tuple[MissionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
