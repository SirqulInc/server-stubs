import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def process_all_participants(version, account_id, app_key=None, use_short_name_as_id=None):  # noqa: E501
    """Process All Participant Feeds

    Processes all supported participant feeds. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param use_short_name_as_id: Whether to use short name as the participant ID
    :type use_short_name_as_id: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def process_participants(version, account_id, league, app_key=None, use_short_name_as_id=None, file=None):  # noqa: E501
    """Process Participants Feed

    Processes a participant feed or uploaded file for a specific league. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param league: The league identifier to process
    :type league: str
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param use_short_name_as_id: Whether to use short name as the participant ID
    :type use_short_name_as_id: bool
    :param file: Multipart file containing participant feed contents
    :type file: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
