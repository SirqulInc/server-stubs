import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.cargo_type import CargoType  # noqa: E501
from openapi_server import util


def create_cargo_type(version, body=None):  # noqa: E501
    """Create Cargo Type

    Create new cargo type # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[CargoType, Tuple[CargoType, int], Tuple[CargoType, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = CargoType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_cargo_type(version, cargo_type_id):  # noqa: E501
    """Delete Cargo Type

    Delete a type of cargo # noqa: E501

    :param version: 
    :type version: 
    :param cargo_type_id: the ID of the cargo type
    :type cargo_type_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_cargo_type(version, cargo_type_id):  # noqa: E501
    """Get Cargo Type

    Get an existing cargo type # noqa: E501

    :param version: 
    :type version: 
    :param cargo_type_id: the cargo type ID
    :type cargo_type_id: int

    :rtype: Union[CargoType, Tuple[CargoType, int], Tuple[CargoType, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_cargo_types(version, sort_field, descending, start, limit, active_only, retailer_id=None, hub_id=None):  # noqa: E501
    """Search Cargo Type

    Search for types of cargo # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: the sort field to use for the cargo type
    :type sort_field: str
    :param descending: if the cargo type should be should be in descending order
    :type descending: bool
    :param start: the start of the search
    :type start: int
    :param limit: the limit of the search
    :type limit: int
    :param active_only: if search should be on active only
    :type active_only: bool
    :param retailer_id: the id of the retailer location
    :type retailer_id: int
    :param hub_id: the ID of the hub
    :type hub_id: int

    :rtype: Union[List[CargoType], Tuple[List[CargoType], int], Tuple[List[CargoType], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_cargo_type(version, cargo_type_id, body=None):  # noqa: E501
    """Update Cargo Type

    Update an existing cargo type # noqa: E501

    :param version: 
    :type version: 
    :param cargo_type_id: the ID of the cargo type
    :type cargo_type_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[CargoType, Tuple[CargoType, int], Tuple[CargoType, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = CargoType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
