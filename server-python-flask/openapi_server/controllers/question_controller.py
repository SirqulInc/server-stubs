import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.question_response import QuestionResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_question(version, account_id, question, answers, active, allocate_tickets, ticket_count, tags=None, video_url=None, asset_id=None, ticket_type=None, points=None):  # noqa: E501
    """Create Question

    Create a question and related answers by the given params. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param question: the text of the question
    :type question: str
    :param answers: &#x60;&#x60;&#x60;json [   {     \&quot;text\&quot;: \&quot;1942\&quot;,     \&quot;image\&quot;: 123,     \&quot;videoURL\&quot;: \&quot;http://www.here.com\&quot;,     \&quot;correct\&quot;: true   },   {     \&quot;text\&quot;: \&quot;1943\&quot;,     \&quot;image\&quot;: 124,     \&quot;videoURL\&quot;: \&quot;http://www.there.com\&quot;,     \&quot;correct\&quot;: false   } ] &#x60;&#x60;&#x60; 
    :type answers: str
    :param active: If true set the question to active. Default to false.
    :type active: bool
    :param allocate_tickets: If true then scoring will give tickets. Default to false.
    :type allocate_tickets: bool
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param tags: The tags of the question for search.
    :type tags: str
    :param video_url: The video link for the question.
    :type video_url: str
    :param asset_id: The asset id of the question.
    :type asset_id: int
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int

    :rtype: Union[QuestionResponse, Tuple[QuestionResponse, int], Tuple[QuestionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_question(version, question_id, account_id):  # noqa: E501
    """Delete Question

    Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete. # noqa: E501

    :param version: 
    :type version: 
    :param question_id: the id of the question to delete
    :type question_id: int
    :param account_id: the id of the account that can execute this request
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_question(version, question_id, account_id):  # noqa: E501
    """Get Question

    Get a question by the given id. # noqa: E501

    :param version: 
    :type version: 
    :param question_id: the id of the question to get
    :type question_id: int
    :param account_id: the id of the account that can make this request
    :type account_id: int

    :rtype: Union[QuestionResponse, Tuple[QuestionResponse, int], Tuple[QuestionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_questions(version, account_id, sort_field, descending, active_only, start, limit, keyword=None):  # noqa: E501
    """Search Questions

    Search for questions by the given params. # noqa: E501

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
    :param keyword: The keyword for searching questions with matching tags or question text.
    :type keyword: str

    :rtype: Union[List[QuestionResponse], Tuple[List[QuestionResponse], int], Tuple[List[QuestionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_question(version, question_id, account_id, ticket_count, question=None, answers=None, tags=None, video_url=None, asset_id=None, active=None, allocate_tickets=None, ticket_type=None, points=None):  # noqa: E501
    """Update Question

    Update a question and related answers. # noqa: E501

    :param version: 
    :type version: 
    :param question_id: The id of the question to update.
    :type question_id: int
    :param account_id: The logged in user.
    :type account_id: int
    :param ticket_count: The number of tickets to reward
    :type ticket_count: int
    :param question: The text of the question.
    :type question: str
    :param answers: The json representations of answers for the question.
    :type answers: str
    :param tags: The tags of the question for search.
    :type tags: str
    :param video_url: The video link for the question.
    :type video_url: str
    :param asset_id: The asset id of the question.
    :type asset_id: int
    :param active: If true set the question to active.
    :type active: bool
    :param allocate_tickets: If true then scoring will give tickets.
    :type allocate_tickets: bool
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int

    :rtype: Union[QuestionResponse, Tuple[QuestionResponse, int], Tuple[QuestionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
