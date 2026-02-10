import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.activity_response import ActivityResponse  # noqa: E501
from openapi_server.models.entity_reference import EntityReference  # noqa: E501
from openapi_server import util


def create_entity_reference(version, body):  # noqa: E501
    """Create an entity reference.

    Creates a reference for an entity for syncing data between servers. # noqa: E501

    :param version: 
    :type version: 
    :param body: The entity reference object
    :type body: dict | bytes

    :rtype: Union[ActivityResponse, Tuple[ActivityResponse, int], Tuple[ActivityResponse, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = EntityReference.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
