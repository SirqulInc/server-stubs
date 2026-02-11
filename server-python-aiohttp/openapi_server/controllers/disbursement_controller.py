from typing import List, Dict
from aiohttp import web

from openapi_server.models.disbursement_response import DisbursementResponse
from openapi_server import util


async def check_disbursements(request: web.Request, disbursement_id) -> web.Response:
    """Check Disbursements

    Checks the status of a captured disbrusement to see if it has been settled.

    :param disbursement_id: the ID of the disbursement being checked on
    :type disbursement_id: int

    """
    return web.Response(status=200)


async def create_disbursement(request: web.Request, account_id, receiver_account_id, original_sender_account_id, amount, provider, scheduled_date=None, title=None, comment=None, external_id=None, introspection_params=None) -> web.Response:
    """Create Disbursement

    Creates a Disbursement for sending money to a retailer

    :param account_id: the ID of the logging in user (must be an EXECUTIVE account)
    :type account_id: int
    :param receiver_account_id: the ID of the account receiving the disbursement
    :type receiver_account_id: int
    :param original_sender_account_id: the ID of the original sender account
    :type original_sender_account_id: int
    :param amount: the dollar amount of the disbursement
    :type amount: 
    :param provider: the provider (e.g. Authorize.net, Bill.com, etc.)
    :type provider: str
    :param scheduled_date: the date that the disbursement is scheduled to go out to the payment provider
    :type scheduled_date: int
    :param title: a title given for the disbursement
    :type title: str
    :param comment: a comment that could be made for a disbursement
    :type comment: str
    :param external_id: external ID, which can be used as a way to reference the disbursement
    :type external_id: str
    :param introspection_params: This is for specifying parameters to make an http callback request for validating that the disbursement is valid
    :type introspection_params: str

    """
    return web.Response(status=200)


async def get_disbursement(request: web.Request, account_id, disbursement_id) -> web.Response:
    """Get Disbursement

    Get Disbursement details

    :param account_id: The logged in user.
    :type account_id: int
    :param disbursement_id: the id of the disbursement
    :type disbursement_id: int

    """
    return web.Response(status=200)


async def search_disbursements(request: web.Request, account_id, receiver_account_id=None, statuses=None, providers=None, before_date=None, after_date=None, start=None, limit=None, active_only=None, external_id=None) -> web.Response:
    """Search Disbursements

    Search Disbursements

    :param account_id: the id of the logged in user
    :type account_id: int
    :param receiver_account_id: filter results by the id of the account receiving the disbursement
    :type receiver_account_id: int
    :param statuses: comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED
    :type statuses: str
    :param providers: comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM
    :type providers: str
    :param before_date: the date for searching disbursements before it has been processed
    :type before_date: int
    :param after_date: the date for searching disbursements before it has been processed
    :type after_date: int
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit per result set for pagination
    :type limit: int
    :param active_only: search on disbursements that are active only
    :type active_only: bool
    :param external_id: search results by this external ID (that can be used to reference the disbursement)
    :type external_id: str

    """
    return web.Response(status=200)


async def update_disbursement(request: web.Request, account_id, disbursement_id, amount=None, provider=None, scheduled_date=None, title=None, comment=None, external_id=None, retry=None, introspection_params=None) -> web.Response:
    """Update Disbursement

    Update Disbursement

    :param account_id: the id of the logged in user
    :type account_id: int
    :param disbursement_id: the id of the disbursement being updated
    :type disbursement_id: int
    :param amount: the disbursement dollar amount being updated
    :type amount: 
    :param provider: the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)
    :type provider: str
    :param scheduled_date: the date that the disbursement is scheduled to go out to the payment provider
    :type scheduled_date: int
    :param title: the title given to the disbursement
    :type title: str
    :param comment: a comment that can be made on a disbursement
    :type comment: str
    :param external_id: an external ID that can be used to reference the disbursement
    :type external_id: str
    :param retry: determines whether to try sending the disbursement again in the case of a previous failure
    :type retry: bool
    :param introspection_params: for specifying parameters to make an http callback request for validating that the disbursement is valid
    :type introspection_params: str

    """
    return web.Response(status=200)
