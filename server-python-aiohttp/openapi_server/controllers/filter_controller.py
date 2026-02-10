from typing import List, Dict
from aiohttp import web

from openapi_server.models.filter_response import FilterResponse
from openapi_server.models.filter_tree_response import FilterTreeResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_filter(request: web.Request, version, account_id, name, app_key=None, parent_filter_id=None, description=None, external_id=None, external_type=None, active=None, meta_data=None) -> web.Response:
    """Create Filter

    Create a filter

    :param version: 
    :type version: 
    :param account_id: The account id of the user (must have permissions to the target application)
    :type account_id: int
    :param name: The name of the filter
    :type name: str
    :param app_key: The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)
    :type app_key: str
    :param parent_filter_id: The ID of the parent filter, if not provided then the parent filter will be null
    :type parent_filter_id: int
    :param description: The description of the filter
    :type description: str
    :param external_id: A string identifier used by client applications to store external information
    :type external_id: str
    :param external_type: A string type used by client applications to store external information
    :type external_type: str
    :param active: Sets whether the filter is active or inactive (hidden from consumers)
    :type active: bool
    :param meta_data: external custom client defined data
    :type meta_data: str

    """
    return web.Response(status=200)


async def delete_filter(request: web.Request, version, account_id, filter_id) -> web.Response:
    """Delete Filter

    Delete a filter.

    :param version: 
    :type version: 
    :param account_id: The account id of the user (must have permissions to the filter&#39;s assigned application)
    :type account_id: int
    :param filter_id: The ID of the filter to delete
    :type filter_id: int

    """
    return web.Response(status=200)


async def get_filter(request: web.Request, version, filter_id) -> web.Response:
    """Get Filter

    Get the details of a specific filter. Recursively include all child filters and their children.

    :param version: 
    :type version: 
    :param filter_id: the id of the filter to get
    :type filter_id: int

    """
    return web.Response(status=200)


async def search_filters(request: web.Request, version, account_id=None, keyword=None, app_key=None, response_group=None, root_only=None, sort_field=None, descending=None, start=None, limit=None, active_only=None) -> web.Response:
    """Search Filters

    Search for filters.

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param keyword: The string to search on
    :type keyword: str
    :param app_key: the appKey of the application to retrieve filters for
    :type app_key: str
    :param response_group: The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    :type response_group: str
    :param root_only: Restrict the search to only those filters with no parent filter assigned.
    :type root_only: bool
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param active_only: Determines whether to return only active categories
    :type active_only: bool

    """
    return web.Response(status=200)


async def update_filter(request: web.Request, version, account_id, filter_id, parent_filter_id=None, name=None, description=None, external_id=None, external_type=None, active=None, meta_data=None) -> web.Response:
    """Update Filter

    Update a filter.

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param filter_id: The ID of the filter to edit
    :type filter_id: int
    :param parent_filter_id: The ID of the parent filter, if not provided then the parent filter will be null
    :type parent_filter_id: int
    :param name: The name of the filter
    :type name: str
    :param description: The description of the filter
    :type description: str
    :param external_id: A string identifier used by client applications to store external information
    :type external_id: str
    :param external_type: A string type used by client applications to store external information
    :type external_type: str
    :param active: Sets whether the filter is active or inactive (hidden from consumers)
    :type active: bool
    :param meta_data: external custom client defined data
    :type meta_data: str

    """
    return web.Response(status=200)
