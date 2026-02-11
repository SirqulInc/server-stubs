from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.wordz_word_response import WordzWordResponse
from openapi_server import util


async def create_word(request: web.Request, account_id, word, definition, active, allocate_tickets, ticket_count, asset_id=None, ticket_type=None, points=None) -> web.Response:
    """Create Word

    Create a word by the given params.

    :param account_id: The logged in user.
    :type account_id: int
    :param word: The text of the word.
    :type word: str
    :param definition: The definition of the word.
    :type definition: str
    :param active: If true set the word to active. Default to false.
    :type active: bool
    :param allocate_tickets: If true then scoring will give tickets. Default to false.
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param asset_id: The asset id of the word.
    :type asset_id: int
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int

    """
    return web.Response(status=200)


async def delete_word(request: web.Request, word_id, account_id) -> web.Response:
    """Delete Word

    Delete a word by the given id. The accountId given needs to be the owner or executive to delete.

    :param word_id: The id of the word to delete.
    :type word_id: int
    :param account_id: The account vor validating permission
    :type account_id: int

    """
    return web.Response(status=200)


async def get_word(request: web.Request, word_id, account_id) -> web.Response:
    """Get Word

    Get a word by the given id.

    :param word_id: The id of the word to get.
    :type word_id: int
    :param account_id: The logged in user.
    :type account_id: int

    """
    return web.Response(status=200)


async def get_words(request: web.Request, account_id, sort_field, descending, active_only, start, limit, keyword=None) -> web.Response:
    """Search Words

    Search for words by the given params.

    :param account_id: The logged in user.
    :type account_id: int
    :param sort_field: The column to sort the search on
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param active_only: Return only active results if set to true.
    :type active_only: bool
    :param start: The record to begin the return set on.
    :type start: int
    :param limit: The number of records to return.
    :type limit: int
    :param keyword: The keyword for searching words with matching definition or word text.
    :type keyword: str

    """
    return web.Response(status=200)


async def update_word(request: web.Request, word_id, account_id, ticket_count, word_text=None, definition=None, asset_id=None, active=None, allocate_tickets=None, ticket_type=None, points=None) -> web.Response:
    """Update Word

    Update a word by the given params.

    :param word_id: The id of the word to update.
    :type word_id: int
    :param account_id: The logged in user.
    :type account_id: int
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param word_text: The text for the word
    :type word_text: str
    :param definition: The definition of the word.
    :type definition: str
    :param asset_id: The asset id of the word.
    :type asset_id: int
    :param active: If true set the word to active.
    :type active: bool
    :param allocate_tickets: If true then scoring will give tickets.
    :type allocate_tickets: bool
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int

    """
    return web.Response(status=200)
