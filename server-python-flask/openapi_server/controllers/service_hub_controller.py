import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.service_hub import ServiceHub  # noqa: E501
from openapi_server import util


def create_service_hub(version, body=None):  # noqa: E501
    """Create Service Hub

    Create new service hub # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[ServiceHub, Tuple[ServiceHub, int], Tuple[ServiceHub, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = ServiceHub.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_service_hub(version, id):  # noqa: E501
    """Delete Service Hub

    Delete an existing service hub # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the service hub to delete
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_service_hub(version, id):  # noqa: E501
    """Get Service Hub

    Get an existing service hub # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the service hub to get
    :type id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_service_hub(version, id, body=None):  # noqa: E501
    """Update Service Hub

    Update an existing service hub # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the service hub
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[ServiceHub, Tuple[ServiceHub, int], Tuple[ServiceHub, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = ServiceHub.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_service_hub(version, id, body=None):  # noqa: E501
    """Update Service Hub

    Update an existing service hub # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the service hub
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[ServiceHub, Tuple[ServiceHub, int], Tuple[ServiceHub, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = ServiceHub.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def search_service_hubs(version, sort_field, descending, start, limit, active_only, keyword=None, retailer_id=None):  # noqa: E501
    """Search Service Hubs

    Search for service hubs. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param keyword: The keyword to search for
    :type keyword: str
    :param retailer_id: The retailer belongs to
    :type retailer_id: int

    :rtype: Union[List[ServiceHub], Tuple[List[ServiceHub], int], Tuple[List[ServiceHub], int, Dict[str, str]]
    """
    return 'do some magic!'
