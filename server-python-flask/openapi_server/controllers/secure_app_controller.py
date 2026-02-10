import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.payment_request import PaymentRequest  # noqa: E501
from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_secure_application(version, account_id, app_key, key_cert, trust_store, username, password, active=None, biometric_type=None, biometric_position=None, biometric_position2=None):  # noqa: E501
    """Create Secure Application

    Create a secure application record. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The unique id of the user making the request
    :type account_id: int
    :param app_key: The application to secure
    :type app_key: str
    :param key_cert: 
    :type key_cert: str
    :param trust_store: 
    :type trust_store: str
    :param username: 
    :type username: str
    :param password: 
    :type password: str
    :param active: 
    :type active: bool
    :param biometric_type: The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL
    :type biometric_type: str
    :param biometric_position: The position for the biometric file uploaded
    :type biometric_position: str
    :param biometric_position2: The position for each the biometric2 file uploaded
    :type biometric_position2: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_secure_application(version, account_id, app_key):  # noqa: E501
    """Delete Secure Application

    Delete a secure application record. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The unique id of the user making the request
    :type account_id: int
    :param app_key: The application to secure
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def login_secure(version, app_key, biometric_file, device_id=None, biometric_file2=None, age_restriction=None, return_profile=None, response_filters=None, latitude=None, longitude=None):  # noqa: E501
    """Login Clear

    Login via Clear.me. Creates a new account if logging in for the first time. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application making the request, defines what type and position is required to make a secure login the request.
    :type app_key: str
    :param biometric_file: The data file used to perform authentication
    :type biometric_file: str
    :param device_id: The unique id of the device making the request
    :type device_id: str
    :param biometric_file2: The data file used to perform authentication
    :type biometric_file2: str
    :param age_restriction: Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    :type age_restriction: int
    :param return_profile: Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse
    :type return_profile: bool
    :param response_filters: If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters
    :type response_filters: str
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def purchase_secure(version, body):  # noqa: E501
    """Purchase Clear

    Purchase via Clear.me. Creates a new account if purchasing for the first time. # noqa: E501

    :param version: 
    :type version: 
    :param body: The payment request object
    :type body: dict | bytes

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = PaymentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reset_secure(version, account_id, app_key):  # noqa: E501
    """Rest Secure Application

    Reset a secure application client. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The unique id of the user making the request
    :type account_id: int
    :param app_key: The application to secure
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_secure_application(version, account_id, app_key, active=None, key_cert=None, trust_store=None, username=None, password=None, biometric_type=None, biometric_position=None, biometric_position2=None):  # noqa: E501
    """Update Secure Application

    Update a secure application record. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The unique id of the user making the request
    :type account_id: int
    :param app_key: The application to secure
    :type app_key: str
    :param active: 
    :type active: bool
    :param key_cert: 
    :type key_cert: str
    :param trust_store: 
    :type trust_store: str
    :param username: 
    :type username: str
    :param password: 
    :type password: str
    :param biometric_type: The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL
    :type biometric_type: str
    :param biometric_position: The position for the biometric file uploaded
    :type biometric_position: str
    :param biometric_position2: The position for each the biometric2 file uploaded
    :type biometric_position2: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
