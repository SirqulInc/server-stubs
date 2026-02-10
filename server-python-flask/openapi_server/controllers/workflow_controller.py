import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def run_workflow(version, account_id, workflow_id, sku_id=None, version_code=None, parameters=None):  # noqa: E501
    """Run Workflow

    Runs a published executable workflow # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
