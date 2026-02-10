import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.shipment_batch import ShipmentBatch  # noqa: E501
from openapi_server.models.shipment_import_status import ShipmentImportStatus  # noqa: E501
from openapi_server import util


def create_shipment_batch(version, body=None):  # noqa: E501
    """Create Shipment Batch

    Create a new shipment batch # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[ShipmentBatch, Tuple[ShipmentBatch, int], Tuple[ShipmentBatch, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = ShipmentBatch.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_shipment_batch(version, batch_id):  # noqa: E501
    """Delete Shipment Batch

    Search for shipment batches # noqa: E501

    :param version: 
    :type version: 
    :param batch_id: the id of the shipment batch to delete
    :type batch_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_shipment_batch(version, batch_id):  # noqa: E501
    """Get Shipment Batch

    Get an existing shipment batch # noqa: E501

    :param version: 
    :type version: 
    :param batch_id: the id of the shipment batch to get
    :type batch_id: int

    :rtype: Union[ShipmentBatch, Tuple[ShipmentBatch, int], Tuple[ShipmentBatch, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_shipment_batch_status(version, batch_id, account_id, sort_field, descending, start, limit, valid=None, started=None, completed=None, has_shipment=None, has_route=None, keyword=None):  # noqa: E501
    """Get Shipment Batch Status

    Get the import status list of the import shipment batch # noqa: E501

    :param version: 
    :type version: 
    :param batch_id: The id of the requested shipment batch
    :type batch_id: int
    :param account_id: the id of the logged in user
    :type account_id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param valid: Valid import status only or not
    :type valid: bool
    :param started: Started import status only
    :type started: bool
    :param completed: Completed import status only
    :type completed: bool
    :param has_shipment: Has shipment associate to the status
    :type has_shipment: bool
    :param has_route: Has route associate to the status
    :type has_route: bool
    :param keyword: The keyword to search for
    :type keyword: str

    :rtype: Union[List[ShipmentImportStatus], Tuple[List[ShipmentImportStatus], int], Tuple[List[ShipmentImportStatus], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_shipment_batch(version, hub_id, sort_field, descending, start, limit):  # noqa: E501
    """Search Shipment Batch

    Search for shipment batches # noqa: E501

    :param version: 
    :type version: 
    :param hub_id: The associated service hub
    :type hub_id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    :rtype: Union[List[ShipmentBatch], Tuple[List[ShipmentBatch], int], Tuple[List[ShipmentBatch], int, Dict[str, str]]
    """
    return 'do some magic!'
