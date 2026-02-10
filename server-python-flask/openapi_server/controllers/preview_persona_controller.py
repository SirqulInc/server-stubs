import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.preview_persona_response import PreviewPersonaResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_persona(version, account_id, title, preview_accounts=None, _date=None, age=None, gender=None, game_experience_level=None, latitude=None, longitude=None):  # noqa: E501
    """Create Persona

    Creates a new persona. If the given params are null those attributes will be override by null. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account ID of the user
    :type account_id: int
    :param title: the title of the persona
    :type title: str
    :param preview_accounts: the accounts that are able to preview from this persona
    :type preview_accounts: str
    :param _date: the sepcified date that this persona is viewing the app
    :type _date: int
    :param age: the specified age of this persona
    :type age: int
    :param gender: the specified gender of this persona
    :type gender: str
    :param game_experience_level: the specified experience level of the persona
    :type game_experience_level: str
    :param latitude: the specified latitude of the persona
    :type latitude: float
    :param longitude: the specified longitude of the persona
    :type longitude: float

    :rtype: Union[PreviewPersonaResponse, Tuple[PreviewPersonaResponse, int], Tuple[PreviewPersonaResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_persona(version, account_id, persona_id):  # noqa: E501
    """Delete Persona

    Mark the persona for deletion. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param persona_id: the id of the persona to delete
    :type persona_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_persona_list(version, account_id, persona_id):  # noqa: E501
    """Get Persona

    Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account ID of the user
    :type account_id: int
    :param persona_id: the persona ID of the persona
    :type persona_id: int

    :rtype: Union[PreviewPersonaResponse, Tuple[PreviewPersonaResponse, int], Tuple[PreviewPersonaResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_persona(version, account_id, start, limit):  # noqa: E501
    """Search Personas

    Search for persona that the account owns by the given account ID. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account ID of the user
    :type account_id: int
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination (There is a hard limit of 100)
    :type limit: int

    :rtype: Union[PreviewPersonaResponse, Tuple[PreviewPersonaResponse, int], Tuple[PreviewPersonaResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_persona(version, account_id, persona_id, title=None, preview_accounts=None, active=None, _date=None, age=None, gender=None, game_experience_level=None, latitude=None, longitude=None):  # noqa: E501
    """Update Persona

    Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account ID of the user
    :type account_id: int
    :param persona_id: the persona ID of the persona to update
    :type persona_id: int
    :param title: the title of the persona
    :type title: str
    :param preview_accounts: the accounts that are able to preview from this persona
    :type preview_accounts: str
    :param active: the status of the persona, there can only be one active persona per account
    :type active: bool
    :param _date: the sepcified date that this persona is viewing the app
    :type _date: int
    :param age: the specified age of this persona
    :type age: int
    :param gender: the specified gender of this persona
    :type gender: str
    :param game_experience_level: the specified experience level of the persona
    :type game_experience_level: str
    :param latitude: the specified latitude of the persona
    :type latitude: float
    :param longitude: the specified longitude of the persona
    :type longitude: float

    :rtype: Union[PreviewPersonaResponse, Tuple[PreviewPersonaResponse, int], Tuple[PreviewPersonaResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
