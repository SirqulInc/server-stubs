import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.wordz_word_response import WordzWordResponse  # noqa: E501
from openapi_server import util


def create_word(version, account_id, word, definition, active, allocate_tickets, ticket_count, asset_id=None, ticket_type=None, points=None):  # noqa: E501
    """Create Word

    Create a word by the given params. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[WordzWordResponse, Tuple[WordzWordResponse, int], Tuple[WordzWordResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_word(version, word_id, account_id):  # noqa: E501
    """Delete Word

    Delete a word by the given id. The accountId given needs to be the owner or executive to delete. # noqa: E501

    :param version: 
    :type version: 
    :param word_id: The id of the word to delete.
    :type word_id: int
    :param account_id: The account vor validating permission
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_word(version, word_id, account_id):  # noqa: E501
    """Get Word

    Get a word by the given id. # noqa: E501

    :param version: 
    :type version: 
    :param word_id: The id of the word to get.
    :type word_id: int
    :param account_id: The logged in user.
    :type account_id: int

    :rtype: Union[WordzWordResponse, Tuple[WordzWordResponse, int], Tuple[WordzWordResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_words(version, account_id, sort_field, descending, active_only, start, limit, keyword=None):  # noqa: E501
    """Search Words

    Search for words by the given params. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[List[WordzWordResponse], Tuple[List[WordzWordResponse], int], Tuple[List[WordzWordResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_word(version, word_id, account_id, ticket_count, word_text=None, definition=None, asset_id=None, active=None, allocate_tickets=None, ticket_type=None, points=None):  # noqa: E501
    """Update Word

    Update a word by the given params. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[WordzWordResponse, Tuple[WordzWordResponse, int], Tuple[WordzWordResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
