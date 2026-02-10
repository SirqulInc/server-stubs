from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.territory_response import TerritoryResponse
from openapi_server import util


async def create_territory(request: web.Request, version, account_id, name, active=None) -> web.Response:
    """Create Territory

    Creates a territory.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the territory
    :type name: str
    :param active: If true set the game level as active. Default is true.
    :type active: bool

    """
    return web.Response(status=200)


async def delete_territory(request: web.Request, version, account_id, territory_id) -> web.Response:
    """Delete Territory

    Deletes a territory.

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param territory_id: the id of the territory to delete
    :type territory_id: int

    """
    return web.Response(status=200)


async def get_territory(request: web.Request, version, territory_id) -> web.Response:
    """Get Territory

    Get a territory.

    :param version: 
    :type version: 
    :param territory_id: the id of the territory to get
    :type territory_id: int

    """
    return web.Response(status=200)


async def search_territories(request: web.Request, version, sort_field, descending, keyword=None, start=None, limit=None) -> web.Response:
    """Search Territories

    Searches on territories.

    :param version: 
    :type version: 
    :param sort_field: the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param keyword: Return results that match this keyword.
    :type keyword: str
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    """
    return web.Response(status=200)


async def update_territory(request: web.Request, version, account_id, territory_id, name=None, active=None) -> web.Response:
    """Update Territory

    Updates a territory.

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param territory_id: the id of the territory to update
    :type territory_id: int
    :param name: The name of the territory
    :type name: str
    :param active: If true set the game level as active.
    :type active: bool

    """
    return web.Response(status=200)
