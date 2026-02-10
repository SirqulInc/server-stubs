from typing import List, Dict
from aiohttp import web

from openapi_server.models.billable_entity_response import BillableEntityResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_billable_entity(request: web.Request, version, device_id=None, account_id=None, name=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, business_phone=None, business_phone_ext=None, authorize_net_api_key=None, authorize_net_transaction_key=None) -> web.Response:
    """Create Billable

    reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity

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

    """
    return web.Response(status=200)


async def delete_billable_entity(request: web.Request, version, device_id=None, account_id=None) -> web.Response:
    """Delete Billable

    Mark the billable as deleted

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the delete, must have rights to edit the billable entity.
    :type account_id: int

    """
    return web.Response(status=200)


async def get_billable_entity(request: web.Request, version, device_id=None, account_id=None, include_counts=None, include_payments=None) -> web.Response:
    """Get Billable

    Used to determine the associated BillableEntity of an account

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

    """
    return web.Response(status=200)


async def update_billable_entity(request: web.Request, version, device_id=None, account_id=None, name=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, business_phone=None, business_phone_ext=None, authorize_net_api_key=None, authorize_net_transaction_key=None) -> web.Response:
    """Update Billable

    Updates the billable record for an account

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

    """
    return web.Response(status=200)
