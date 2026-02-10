import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.import_statuses import ImportStatuses  # noqa: E501
from openapi_server.models.orders import Orders  # noqa: E501
from openapi_server.models.shipment_order import ShipmentOrder  # noqa: E501
from openapi_server import util


def get_optimization_result(version, batch_id, start, limit):  # noqa: E501
    """Get Optimization Result

    Get the results of the import batch. # noqa: E501

    :param version: 
    :type version: 
    :param batch_id: The batchID for getting the import status of.
    :type batch_id: str
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    :rtype: Union[Dict[str, ShipmentOrder], Tuple[Dict[str, ShipmentOrder], int], Tuple[Dict[str, ShipmentOrder], int, Dict[str, str]]
    """
    return 'do some magic!'


def request_optimization(version, body=None):  # noqa: E501
    """Request Optimization

    Request and upload of shipment orders and create ShipmentImportBatch for optimization. # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[ImportStatuses, Tuple[ImportStatuses, int], Tuple[ImportStatuses, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Orders.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
