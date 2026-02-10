from typing import List, Dict
from aiohttp import web

from openapi_server.models.account import Account
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create(request: web.Request, version, account_id, body=None) -> web.Response:
    """Create Dependent

    Create dependent of the account

    :param version: 
    :type version: 
    :param account_id: the id of the parent account to create a dependent for
    :type account_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Account.from_dict(body)
    return web.Response(status=200)


async def get_dependents(request: web.Request, version, account_id) -> web.Response:
    """Get dependent list of an account

    Get the dependent list of an account

    :param version: 
    :type version: 
    :param account_id: the id of the parent account to get a list of dependents
    :type account_id: int

    """
    return web.Response(status=200)


async def remove_dependent(request: web.Request, version, account_id, dependent_id) -> web.Response:
    """Delete Dependent

    Delete the Dependent

    :param version: 
    :type version: 
    :param account_id: the id of the parent account tied to the dependent
    :type account_id: int
    :param dependent_id: the id of the dependent to delete
    :type dependent_id: int

    """
    return web.Response(status=200)
