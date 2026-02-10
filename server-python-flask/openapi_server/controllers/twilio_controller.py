import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.twi_ml_response import TwiMLResponse  # noqa: E501
from openapi_server import util


def sms_buy_offer(version, app_key, body, _from, currency_type):  # noqa: E501
    """Buy Offer by SMS

    Recieve an SMS payload from Twillio to purchase an offer. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: the application key
    :type app_key: str
    :param body: the message of the text
    :type body: str
    :param _from: the sender of the sms
    :type _from: str
    :param currency_type: the type of currency
    :type currency_type: str

    :rtype: Union[TwiMLResponse, Tuple[TwiMLResponse, int], Tuple[TwiMLResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
