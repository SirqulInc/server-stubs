import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.shipment import Shipment  # noqa: E501
from openapi_server import util


def cancel_shipment(version, id):  # noqa: E501
    """Cancel Shipment

    Remove shipment from route # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the shipment to cancel
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_shipment(version, body=None):  # noqa: E501
    """Create Shipment

    Create new shipment # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Shipment, Tuple[Shipment, int], Tuple[Shipment, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Shipment.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_shipment(version, id):  # noqa: E501
    """Delete Shipment

    Delete an existing shipment # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the shipment to delete
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_shipment(version, id):  # noqa: E501
    """Get Shipment

    Get an existing shipment # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the shipment to get
    :type id: int

    :rtype: Union[Shipment, Tuple[Shipment, int], Tuple[Shipment, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_shipments(version, sort_field, descending, start, limit, active_only, owner_id=None, rider_id=None, route_id=None):  # noqa: E501
    """Search Shipments

    Search for shipments # noqa: E501

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
    :param owner_id: The owner of the shipment
    :type owner_id: int
    :param rider_id: The rider associate to this shipment
    :type rider_id: int
    :param route_id: The route associate to this shipment
    :type route_id: int

    :rtype: Union[List[Shipment], Tuple[List[Shipment], int], Tuple[List[Shipment], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_shipment(version, id, body=None):  # noqa: E501
    """Update Shipment

    Update an existing shipment # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the shipment to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Shipment, Tuple[Shipment, int], Tuple[Shipment, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Shipment.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_shipment_status(version, id, body=None):  # noqa: E501
    """Uupdate Shipment Status

    Update status of an existing shipment # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the shipment to update status
    :type id: int
    :param body: 
    :type body: Dict[str, bool]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    body = body
    return 'do some magic!'
