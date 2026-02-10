import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.offer_transaction_status_response import OfferTransactionStatusResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_offer_transaction_status(version, name, code, device_id=None, account_id=None, latitude=None, longitude=None, description=None, role=None, active=None, application_ids=None):  # noqa: E501
    """Create Offer Status

    Create an offer status record # noqa: E501

    :param version: 
    :type version: 
    :param name: The name of the status
    :type name: str
    :param code: The status code, must be unique 
    :type code: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float
    :param description: The description of the status
    :type description: str
    :param role: The actor that uses the status
    :type role: str
    :param active: The active status
    :type active: bool
    :param application_ids: The applications to associate the status with, if null then for all.
    :type application_ids: str

    :rtype: Union[OfferTransactionStatusResponse, Tuple[OfferTransactionStatusResponse, int], Tuple[OfferTransactionStatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_offer_transaction_status(version, status_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Offer Status

    Mark an offer status record as deleted # noqa: E501

    :param version: 
    :type version: 
    :param status_id: The id of the record to delete
    :type status_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_transaction_status(version, status_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Offer Status

    Get an offer status record # noqa: E501

    :param version: 
    :type version: 
    :param status_id: The id of the record to get 
    :type status_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[OfferTransactionStatusResponse, Tuple[OfferTransactionStatusResponse, int], Tuple[OfferTransactionStatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_offer_transaction_statuses(version, device_id=None, account_id=None, latitude=None, longitude=None, keyword=None, role=None, app_key=None, sort_field=None, descending=None, start=None, limit=None, include_inactive=None):  # noqa: E501
    """Search Offer Status

    Search for the available offer statuses # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float
    :param keyword: Search the name and description fields
    :type keyword: str
    :param role: The actors role, possible values are: CUSTOMER, RETAILER, or ANY
    :type role: str
    :param app_key: The application making the request
    :type app_key: str
    :param sort_field: The field to sort on, possible values are: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE
    :type sort_field: str
    :param descending: Determines whether the results are in descending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param include_inactive: If true include inactive items
    :type include_inactive: bool

    :rtype: Union[List[OfferTransactionStatusResponse], Tuple[List[OfferTransactionStatusResponse], int], Tuple[List[OfferTransactionStatusResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_offer_transaction_status(version, device_id=None, account_id=None, latitude=None, longitude=None, status_id=None, name=None, description=None, code=None, role=None, active=None, application_ids=None):  # noqa: E501
    """Update Offer Status

    Update an offer status record # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float
    :param status_id: The id of the record to update 
    :type status_id: int
    :param name: The name of th status
    :type name: str
    :param description: The description of the status
    :type description: str
    :param code: The status code, must be unique 
    :type code: int
    :param role: The actor that uses the status
    :type role: str
    :param active: The active status
    :type active: bool
    :param application_ids: The applications to associate the status with, if null then for all.
    :type application_ids: str

    :rtype: Union[OfferTransactionStatusResponse, Tuple[OfferTransactionStatusResponse, int], Tuple[OfferTransactionStatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
