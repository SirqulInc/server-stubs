from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def run_workflow(request: web.Request, account_id, workflow_id, sku_id=None, version_code=None, parameters=None) -> web.Response:
    """Run Workflow

    Runs a published executable workflow

    :param account_id: the account ID of the user
    :type account_id: int
    :param workflow_id: the workflow to run
    :type workflow_id: int
    :param sku_id: this runs a particular sku on the workflow
    :type sku_id: int
    :param version_code: this runs a particular sku version on the workflow
    :type version_code: int
    :param parameters: Override parameters in JSON format. Example: &#x60;&#x60;&#x60;json {   \&quot;arguments_81\&quot;: { \&quot;filter\&quot;: \&quot;PUBLIC\&quot; },   \&quot;arguments_87\&quot;: { \&quot;tag\&quot;: \&quot;custom_tag\&quot; } } &#x60;&#x60;&#x60; 
    :type parameters: str

    """
    return web.Response(status=200)
