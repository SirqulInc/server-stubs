import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_stripe_checkout_session(version, app_key, stripe_parameters):  # noqa: E501
    """Create Stripe Checkout Session

    Create a Stripe checkout session # noqa: E501

    :param version: 
    :type version: 
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param stripe_parameters: Stripe Parameters
    :type stripe_parameters: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
