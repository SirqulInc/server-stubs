import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.program import Program  # noqa: E501
from openapi_server import util


def create_program(version, body=None):  # noqa: E501
    """Create Program

    Create a new program # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Program, Tuple[Program, int], Tuple[Program, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Program.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_program(version, id):  # noqa: E501
    """Delete Program

    Delete an existing program # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_program(version, id):  # noqa: E501
    """Get Program

    Get an existing program # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int

    :rtype: Union[Program, Tuple[Program, int], Tuple[Program, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_program(version, id, body=None):  # noqa: E501
    """Update Program

    Update an existing program # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Program, Tuple[Program, int], Tuple[Program, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Program.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_program(version, id, body=None):  # noqa: E501
    """Update Program

    Update an existing program # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the program
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Program, Tuple[Program, int], Tuple[Program, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Program.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def search_programs(version, sort_field, descending, start, limit, active_only, keyword=None):  # noqa: E501
    """Search Programs

    Search for programs # noqa: E501

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

    :rtype: Union[List[Program], Tuple[List[Program], int], Tuple[List[Program], int, Dict[str, str]]
    """
    return 'do some magic!'
