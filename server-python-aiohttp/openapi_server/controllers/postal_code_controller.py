from typing import List, Dict
from aiohttp import web

from openapi_server.models.postal_code_response import PostalCodeResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_postal_code(request: web.Request, version, account_id, code, latitude, longitude, state_code=None, city=None, active=None) -> web.Response:
    """Create Postal Code

    Create a Postal Code

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param code: the postal code
    :type code: str
    :param latitude: the latitude of the postal code
    :type latitude: float
    :param longitude: the longitude of the postal code
    :type longitude: float
    :param state_code: the state code (e.g WA, WV, WI) that the postal code is located
    :type state_code: str
    :param city: the city that the postal code is located
    :type city: str
    :param active: whether the postal code created should be active or inactive
    :type active: bool

    """
    return web.Response(status=200)


async def delete_postal_code(request: web.Request, version, account_id, postal_code_id) -> web.Response:
    """Delete Postal Code

    Delete a Postal Code

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param postal_code_id: the id of the postal code to delete
    :type postal_code_id: int

    """
    return web.Response(status=200)


async def get_postal_code(request: web.Request, version, postal_code_id) -> web.Response:
    """Get Postal Code

    Get a Postal Code

    :param version: 
    :type version: 
    :param postal_code_id: the id of the postal code to get
    :type postal_code_id: int

    """
    return web.Response(status=200)


async def get_postal_codes(request: web.Request, version, sort_field, descending, latitude=None, longitude=None, keyword=None, miles=None, start=None, limit=None) -> web.Response:
    """Search Postal Codes

    Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.

    :param version: 
    :type version: 
    :param sort_field: the field to sort the results on
    :type sort_field: str
    :param descending: whether to order results in ascending or descending order
    :type descending: bool
    :param latitude: the latitude of the postal code to search on
    :type latitude: float
    :param longitude: the longitude of the postal code to search on
    :type longitude: float
    :param keyword: the keyword of the postal code to search on
    :type keyword: str
    :param miles: how far (in miles) to search on for the postal code
    :type miles: float
    :param start: the start of the index and/or pagination
    :type start: int
    :param limit: the limit of the index and/or pagination
    :type limit: int

    """
    return web.Response(status=200)


async def update_postal_code(request: web.Request, version, account_id, postal_code_id, code=None, latitude=None, longitude=None, state_code=None, city=None, active=None) -> web.Response:
    """Update Postal Code

    Update a Postal Code

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param postal_code_id: the id of the postal code to update
    :type postal_code_id: int
    :param code: the postal code to update
    :type code: str
    :param latitude: the latitude of the postal code
    :type latitude: float
    :param longitude: the longitude of the postal code
    :type longitude: float
    :param state_code: the state code (e.g. WA, WI, WY) where the postal code is located
    :type state_code: str
    :param city: the city where the postal code is located
    :type city: str
    :param active: whether the postal code is active or inactive
    :type active: bool

    """
    return web.Response(status=200)
