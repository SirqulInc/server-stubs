from typing import List, Dict
from aiohttp import web

from openapi_server.models.payment_request import PaymentRequest
from openapi_server.models.profile_response import ProfileResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_secure_application(request: web.Request, version, account_id, app_key, key_cert, trust_store, username, password, active=None, biometric_type=None, biometric_position=None, biometric_position2=None) -> web.Response:
    """Create Secure Application

    Create a secure application record.

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

    """
    return web.Response(status=200)


async def delete_secure_application(request: web.Request, version, account_id, app_key) -> web.Response:
    """Delete Secure Application

    Delete a secure application record.

    :param version: 
    :type version: 
    :param account_id: The unique id of the user making the request
    :type account_id: int
    :param app_key: The application to secure
    :type app_key: str

    """
    return web.Response(status=200)


async def login_secure(request: web.Request, version, app_key, biometric_file, device_id=None, biometric_file2=None, age_restriction=None, return_profile=None, response_filters=None, latitude=None, longitude=None) -> web.Response:
    """Login Clear

    Login via Clear.me. Creates a new account if logging in for the first time.

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

    """
    return web.Response(status=200)


async def purchase_secure(request: web.Request, version, body) -> web.Response:
    """Purchase Clear

    Purchase via Clear.me. Creates a new account if purchasing for the first time.

    :param version: 
    :type version: 
    :param body: The payment request object
    :type body: dict | bytes

    """
    body = PaymentRequest.from_dict(body)
    return web.Response(status=200)


async def reset_secure(request: web.Request, version, account_id, app_key) -> web.Response:
    """Rest Secure Application

    Reset a secure application client.

    :param version: 
    :type version: 
    :param account_id: The unique id of the user making the request
    :type account_id: int
    :param app_key: The application to secure
    :type app_key: str

    """
    return web.Response(status=200)


async def update_secure_application(request: web.Request, version, account_id, app_key, active=None, key_cert=None, trust_store=None, username=None, password=None, biometric_type=None, biometric_position=None, biometric_position2=None) -> web.Response:
    """Update Secure Application

    Update a secure application record.

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

    """
    return web.Response(status=200)
