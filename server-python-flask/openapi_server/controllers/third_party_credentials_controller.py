import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.third_party_credential_response import ThirdPartyCredentialResponse  # noqa: E501
from openapi_server.models.third_party_network_response import ThirdPartyNetworkResponse  # noqa: E501
from openapi_server.models.third_party_network_short_response import ThirdPartyNetworkShortResponse  # noqa: E501
from openapi_server import util


def create_credential(version, third_party_id, third_party_token, network_uid, app_key, account_id=None, device_id=None, session_id=None, third_party_name=None, email_address=None, signin_only_mode=None, response_filters=None, latitude=None, longitude=None, meta_data=None, third_party_refresh_token=None, audience_ids_to_add=None, audience_ids_to_remove=None):  # noqa: E501
    """Create Credential

    This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user&#39;s third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password.  # noqa: E501

    :param version: 
    :type version: 
    :param third_party_id: the third party user account id
    :type third_party_id: str
    :param third_party_token: the access token to authenticate with (ex: username or fb token or phone number)
    :type third_party_token: str
    :param network_uid: the access provider to authenticate against
    :type network_uid: str
    :param app_key: the application key
    :type app_key: str
    :param account_id: the unique id of the account that needs authenticating (optional for PHONE_V2)
    :type account_id: int
    :param device_id: the unique id of the device making the request
    :type device_id: str
    :param session_id: the session id for the request
    :type session_id: str
    :param third_party_name: the third party user&#39;s display name
    :type third_party_name: str
    :param email_address: optional email address associated with the third party account
    :type email_address: str
    :param signin_only_mode: when true will error out if can&#39;t find any accounts matching (signin only)
    :type signin_only_mode: bool
    :param response_filters: this determines how much of the profile should be returned, see ProfileFilters
    :type response_filters: str
    :param latitude: the latitude of the user
    :type latitude: float
    :param longitude: the longitude of the user
    :type longitude: float
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param third_party_refresh_token: optional refresh token for the third party
    :type third_party_refresh_token: str
    :param audience_ids_to_add: audience ids to add to the account
    :type audience_ids_to_add: str
    :param audience_ids_to_remove: audience ids to remove from the account
    :type audience_ids_to_remove: str

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_network(version, account_id, name, enable_introspection, description=None, introspection_method=None, introspection_url=None, introspection_params=None, required_root_field=None, enable_mfa=None, size_mfa=None, shelf_life_mfa=None, oauth_token_url=None, oauth_private_key=None, oauth_public_key=None, oauth_client_id=None, oauth_secret_key=None, body=None):  # noqa: E501
    """Create Network

    Creates a custom third party network. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id making the request
    :type account_id: int
    :param name: The name of the network
    :type name: str
    :param enable_introspection: Whether the network uses introspection calls
    :type enable_introspection: bool
    :param description: The description of the network
    :type description: str
    :param introspection_method: HTTP method to use for introspection calls (e.g., GET, POST)
    :type introspection_method: str
    :param introspection_url: The HTTP URL of the introspection call
    :type introspection_url: str
    :param introspection_params: The parameters of the introspection call
    :type introspection_params: str
    :param required_root_field: Required response params
    :type required_root_field: str
    :param enable_mfa: Whether this network uses MFA
    :type enable_mfa: bool
    :param size_mfa: Size of the MFA token
    :type size_mfa: int
    :param shelf_life_mfa: Shelf life (seconds) of the MFA token
    :type shelf_life_mfa: int
    :param oauth_token_url: OAuth token endpoint URL
    :type oauth_token_url: str
    :param oauth_private_key: OAuth private key file (multipart)
    :type oauth_private_key: str
    :param oauth_public_key: OAuth public key file (multipart)
    :type oauth_public_key: str
    :param oauth_client_id: OAuth client id
    :type oauth_client_id: str
    :param oauth_secret_key: OAuth secret key
    :type oauth_secret_key: str
    :param body: 
    :type body: str

    :rtype: Union[ThirdPartyNetworkResponse, Tuple[ThirdPartyNetworkResponse, int], Tuple[ThirdPartyNetworkResponse, int, Dict[str, str]]
    """
    body = body
    return 'do some magic!'


def delete_credential(version, account_id, network_uid, third_party_id, app_key):  # noqa: E501
    """Delete Credential

    Delete a third party network on a Sirqul account. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param network_uid: The third party network identifier
    :type network_uid: str
    :param third_party_id: The third party user id
    :type third_party_id: str
    :param app_key: the application key
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_network(version, account_id, network_uid):  # noqa: E501
    """Delete Network

    Marks a custom third party network as deleted. Only the network owners and managers have access to this. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param network_uid: The unique identifier for the third party network defined by Sirqul
    :type network_uid: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_credential(version, network_uid, app_key, account_id=None, device_id=None, session_id=None, third_party_credential_id=None, third_party_token=None, third_party_secret=None, create_new_account=None, response_filters=None, latitude=None, longitude=None, audience_ids_to_add=None, audience_ids_to_remove=None, referral_account_id=None):  # noqa: E501
    """Get Credential

    Gets the account information given a third party token. # noqa: E501

    :param version: 
    :type version: 
    :param network_uid: the access provider to authenticate against
    :type network_uid: str
    :param app_key: the application key
    :type app_key: str
    :param account_id: the unique account id of a specific account that will be bound to the third-party credentials
    :type account_id: int
    :param device_id: the unique id of the device making the request
    :type device_id: str
    :param session_id: the session id for the request
    :type session_id: str
    :param third_party_credential_id: the third-party credentials id from the response of the credential/create step
    :type third_party_credential_id: int
    :param third_party_token: the access token to authenticate with
    :type third_party_token: str
    :param third_party_secret: the secret code to authenticate with (used for MFA)
    :type third_party_secret: str
    :param create_new_account: flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts
    :type create_new_account: bool
    :param response_filters: this determines how much of the profile should be returned, see ProfileFilters
    :type response_filters: str
    :param latitude: the latitude of the user
    :type latitude: float
    :param longitude: the longitude of the user
    :type longitude: float
    :param audience_ids_to_add: audience ids to add to the account
    :type audience_ids_to_add: str
    :param audience_ids_to_remove: audience ids to remove from the account
    :type audience_ids_to_remove: str
    :param referral_account_id: account id of the referrer (inviter-invitee relationship)
    :type referral_account_id: int

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_network(version, account_id, network_uid):  # noqa: E501
    """Get Network

    Get the details of a third party network. Only the network owners and managers have access to this. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id making the request
    :type account_id: int
    :param network_uid: The unique identifier for the third party network defined by Sirqul
    :type network_uid: str

    :rtype: Union[ThirdPartyNetworkResponse, Tuple[ThirdPartyNetworkResponse, int], Tuple[ThirdPartyNetworkResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_credentials(version, account_id, keyword=None, network_uid=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search Credentials

    Search on a user&#39;s linked third party networks. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param keyword: The keyword used to search on the third party name and network string
    :type keyword: str
    :param network_uid: The network UID to filter results with
    :type network_uid: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int

    :rtype: Union[List[ThirdPartyCredentialResponse], Tuple[List[ThirdPartyCredentialResponse], int], Tuple[List[ThirdPartyCredentialResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_networks(version, account_id, sort_field, descending, start, limit, active_only, keyword=None, filter_billable=None):  # noqa: E501
    """Search Networks

    Search on supported third party networks and custom networks from external users. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id making the request
    :type account_id: int
    :param sort_field: The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param keyword: The keyword used to search on the network name and description fields
    :type keyword: str
    :param filter_billable: Determines whether to only return applications that the user has access to
    :type filter_billable: bool

    :rtype: Union[List[ThirdPartyNetworkShortResponse], Tuple[List[ThirdPartyNetworkShortResponse], int], Tuple[List[ThirdPartyNetworkShortResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def send_mfa_challenge(version, network_uid, app_key, third_party_token=None, third_party_credential_id=None, device_id=None):  # noqa: E501
    """Send MFA Challenge

    Sends an MFA challenge (SMS or Email) for networks with MFA enabled. # noqa: E501

    :param version: 
    :type version: 
    :param network_uid: the third party network provider that has MFA enabled
    :type network_uid: str
    :param app_key: the application key
    :type app_key: str
    :param third_party_token: the access token to authenticate with
    :type third_party_token: str
    :param third_party_credential_id: optional id of the existing third party credential
    :type third_party_credential_id: int
    :param device_id: the unique id of the device making the request
    :type device_id: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_credential(version, network_uid, third_party_id, app_key, device_id=None, third_party_name=None, third_party_token=None, response_filters=None, meta_data=None, third_party_refresh_token=None):  # noqa: E501
    """Update Credential

    Updates a third-party login for an account. # noqa: E501

    :param version: 
    :type version: 
    :param network_uid: the access provider to authenticate against
    :type network_uid: str
    :param third_party_id: the third party user account id
    :type third_party_id: str
    :param app_key: the application key
    :type app_key: str
    :param device_id: the unique id of the device making the request
    :type device_id: str
    :param third_party_name: the third party user name
    :type third_party_name: str
    :param third_party_token: the access token to authenticate with (ex: username or fb token)
    :type third_party_token: str
    :param response_filters: this determines how much of the profile should be returned, see ProfileFilters
    :type response_filters: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param third_party_refresh_token: optional refresh token for the third party
    :type third_party_refresh_token: str

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_network(version, account_id, network_uid, name=None, description=None, enable_introspection=None, introspection_method=None, introspection_url=None, introspection_params=None, required_root_field=None, enable_mfa=None, size_mfa=None, shelf_life_mfa=None, oauth_token_url=None, oauth_private_key=None, oauth_public_key=None, oauth_client_id=None, oauth_secret_key=None, body=None):  # noqa: E501
    """Update Network

    Updates a custom third party network. Only the network owners and managers have access to this. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id making the request
    :type account_id: int
    :param network_uid: The unique identifier for the third party network defined by Sirqul
    :type network_uid: str
    :param name: The name of the network
    :type name: str
    :param description: The description of the network
    :type description: str
    :param enable_introspection: Whether the network uses introspection calls
    :type enable_introspection: bool
    :param introspection_method: HTTP method to use for introspection calls (e.g., GET, POST)
    :type introspection_method: str
    :param introspection_url: The HTTP URL of the introspection call
    :type introspection_url: str
    :param introspection_params: The parameters of the introspection call
    :type introspection_params: str
    :param required_root_field: Required response params
    :type required_root_field: str
    :param enable_mfa: Whether this network uses MFA
    :type enable_mfa: bool
    :param size_mfa: Size of the MFA token
    :type size_mfa: int
    :param shelf_life_mfa: Shelf life (seconds) of the MFA token
    :type shelf_life_mfa: int
    :param oauth_token_url: OAuth token endpoint URL
    :type oauth_token_url: str
    :param oauth_private_key: OAuth private key file (multipart)
    :type oauth_private_key: str
    :param oauth_public_key: OAuth public key file (multipart)
    :type oauth_public_key: str
    :param oauth_client_id: OAuth client id
    :type oauth_client_id: str
    :param oauth_secret_key: OAuth secret key
    :type oauth_secret_key: str
    :param body: 
    :type body: str

    :rtype: Union[ThirdPartyNetworkResponse, Tuple[ThirdPartyNetworkResponse, int], Tuple[ThirdPartyNetworkResponse, int, Dict[str, str]]
    """
    body = body
    return 'do some magic!'
