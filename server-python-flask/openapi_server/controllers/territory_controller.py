import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.territory_response import TerritoryResponse  # noqa: E501
from openapi_server import util


def create_territory(version, account_id, name, active=None):  # noqa: E501
    """Create Territory

    Creates a territory. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the territory
    :type name: str
    :param active: If true set the game level as active. Default is true.
    :type active: bool

    :rtype: Union[TerritoryResponse, Tuple[TerritoryResponse, int], Tuple[TerritoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_territory(version, account_id, territory_id):  # noqa: E501
    """Delete Territory

    Deletes a territory. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param territory_id: the id of the territory to delete
    :type territory_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_territory(version, territory_id):  # noqa: E501
    """Get Territory

    Get a territory. # noqa: E501

    :param version: 
    :type version: 
    :param territory_id: the id of the territory to get
    :type territory_id: int

    :rtype: Union[TerritoryResponse, Tuple[TerritoryResponse, int], Tuple[TerritoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_territories(version, sort_field, descending, keyword=None, start=None, limit=None):  # noqa: E501
    """Search Territories

    Searches on territories. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param keyword: Return results that match this keyword.
    :type keyword: str
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    :rtype: Union[List[TerritoryResponse], Tuple[List[TerritoryResponse], int], Tuple[List[TerritoryResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_territory(version, account_id, territory_id, name=None, active=None):  # noqa: E501
    """Update Territory

    Updates a territory. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param territory_id: the id of the territory to update
    :type territory_id: int
    :param name: The name of the territory
    :type name: str
    :param active: If true set the game level as active.
    :type active: bool

    :rtype: Union[TerritoryResponse, Tuple[TerritoryResponse, int], Tuple[TerritoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
