import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.billable_entity_response import BillableEntityResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_billable_entity(version, device_id=None, account_id=None, name=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, business_phone=None, business_phone_ext=None, authorize_net_api_key=None, authorize_net_transaction_key=None):  # noqa: E501
    """Create Billable

    reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param name: The name of the entity responsible for billing 
    :type name: str
    :param street_address: The street address of the billable entity
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box) 
    :type street_address2: str
    :param city: The city of the billable entity
    :type city: str
    :param state: The state of the billable entity
    :type state: str
    :param postal_code: The postal code of the billable entity
    :type postal_code: str
    :param business_phone: The business phone of the billable entity
    :type business_phone: str
    :param business_phone_ext: The business phone extension
    :type business_phone_ext: str
    :param authorize_net_api_key: Authorize Net Api Key
    :type authorize_net_api_key: str
    :param authorize_net_transaction_key: Authorize Net Transaction Key
    :type authorize_net_transaction_key: str

    :rtype: Union[BillableEntityResponse, Tuple[BillableEntityResponse, int], Tuple[BillableEntityResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_billable_entity(version, device_id=None, account_id=None):  # noqa: E501
    """Delete Billable

    Mark the billable as deleted # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the delete, must have rights to edit the billable entity.
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_billable_entity(version, device_id=None, account_id=None, include_counts=None, include_payments=None):  # noqa: E501
    """Get Billable

    Used to determine the associated BillableEntity of an account # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param include_counts: Determines whether to include the retailer dash board counts into the response
    :type include_counts: bool
    :param include_payments: Whether to enable payments or not
    :type include_payments: bool

    :rtype: Union[BillableEntityResponse, Tuple[BillableEntityResponse, int], Tuple[BillableEntityResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_billable_entity(version, device_id=None, account_id=None, name=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, business_phone=None, business_phone_ext=None, authorize_net_api_key=None, authorize_net_transaction_key=None):  # noqa: E501
    """Update Billable

    Updates the billable record for an account # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.
    :type account_id: int
    :param name: The name of the entity responsible for billing 
    :type name: str
    :param street_address: The street address of the billable entity
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box) 
    :type street_address2: str
    :param city: The city of the billable entity
    :type city: str
    :param state: The state of the billable entity
    :type state: str
    :param postal_code: The postal code of the billable entity
    :type postal_code: str
    :param business_phone: The business phone of the billable entity
    :type business_phone: str
    :param business_phone_ext: The business phone extension of the billable entity
    :type business_phone_ext: str
    :param authorize_net_api_key: Authorize Net Api Key of the billable entity
    :type authorize_net_api_key: str
    :param authorize_net_transaction_key: Authorize Net Transaction Key of the billable entity
    :type authorize_net_transaction_key: str

    :rtype: Union[BillableEntityResponse, Tuple[BillableEntityResponse, int], Tuple[BillableEntityResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
