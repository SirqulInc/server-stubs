from typing import List, Dict
from aiohttp import web

from openapi_server.models.program import Program
from openapi_server import util


async def create_program(request: web.Request, version, body=None) -> web.Response:
    """Create Program

    Create a new program

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    """
    body = Program.from_dict(body)
    return web.Response(status=200)


async def delete_program(request: web.Request, version, id) -> web.Response:
    """Delete Program

    Delete an existing program

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int

    """
    return web.Response(status=200)


async def get_program(request: web.Request, version, id) -> web.Response:
    """Get Program

    Get an existing program

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int

    """
    return web.Response(status=200)


async def post_program(request: web.Request, version, id, body=None) -> web.Response:
    """Update Program

    Update an existing program

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Program.from_dict(body)
    return web.Response(status=200)


async def put_program(request: web.Request, version, id, body=None) -> web.Response:
    """Update Program

    Update an existing program

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Program.from_dict(body)
    return web.Response(status=200)


async def search_programs(request: web.Request, version, sort_field, descending, start, limit, active_only, keyword=None) -> web.Response:
    """Search Programs

    Search for programs

    :param version: 
    :type version: 
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param keyword: The keyword to filter results by
    :type keyword: str

    """
    return web.Response(status=200)
