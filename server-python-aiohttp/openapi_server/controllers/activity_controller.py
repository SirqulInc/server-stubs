from typing import List, Dict
from aiohttp import web

from openapi_server.models.activity_response import ActivityResponse
from openapi_server.models.entity_reference import EntityReference
from openapi_server import util


async def create_entity_reference(request: web.Request, body) -> web.Response:
    """Create an entity reference.

    Creates a reference for an entity for syncing data between servers.

    :param body: The entity reference object
    :type body: dict | bytes

    """
    body = EntityReference.from_dict(body)
    return web.Response(status=200)
