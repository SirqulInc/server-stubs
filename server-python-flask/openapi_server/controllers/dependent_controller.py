import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account import Account  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create(version, account_id, body=None):  # noqa: E501
    """Create Dependent

    Create dependent of the account # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the parent account to create a dependent for
    :type account_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Account.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_dependents(version, account_id):  # noqa: E501
    """Get dependent list of an account

    Get the dependent list of an account # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the parent account to get a list of dependents
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_dependent(version, account_id, dependent_id):  # noqa: E501
    """Delete Dependent

    Delete the Dependent # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the parent account tied to the dependent
    :type account_id: int
    :param dependent_id: the id of the dependent to delete
    :type dependent_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
