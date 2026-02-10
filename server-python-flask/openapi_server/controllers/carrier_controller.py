import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.cell_carrier_response import CellCarrierResponse  # noqa: E501
from openapi_server import util


def search_carriers(version, keyword=None, descending=None, start=None, limit=None, active_only=None):  # noqa: E501
    """Search Carriers

    Search on supported mobile telephone carriers that can be used to send SMS notifications via email. # noqa: E501

    :param version: 
    :type version: 
    :param keyword: The keyword to search on
    :type keyword: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Determines whether to return inactive results
    :type active_only: bool

    :rtype: Union[List[CellCarrierResponse], Tuple[List[CellCarrierResponse], int], Tuple[List[CellCarrierResponse], int, Dict[str, str]]
    """
    return 'do some magic!'
