import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def get_retaokiler(version, retailer_id, active_only, keyword=None, sort_field=None, start=None, limit=None):  # noqa: E501
    """Get Retailer

    Gets a retailer. Only the owner and the employees of a retailer have access to view its information. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_id: the id of the retailer
    :type retailer_id: int
    :param active_only: whether to return results that are active only or all
    :type active_only: bool
    :param keyword: the keyword to search on to get retailer
    :type keyword: str
    :param sort_field: the field to sort on
    :type sort_field: str
    :param start: the start of the index and/or pagination
    :type start: int
    :param limit: the limit of the index and/or pagination
    :type limit: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
