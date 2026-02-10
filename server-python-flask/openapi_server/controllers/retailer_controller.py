import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_login_response import AccountLoginResponse  # noqa: E501
from openapi_server.models.retailer_full_response import RetailerFullResponse  # noqa: E501
from openapi_server.models.retailer_response import RetailerResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_retailer(version, name, device_id=None, account_id=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, country=None, business_phone=None, business_phone_ext=None, website=None, email=None, facebook_url=None, twitter_url=None, logo=None, logo_asset_id=None, picture1=None, picture1_asset_id=None, picture2=None, picture2_asset_id=None, category_ids=None, category_ids_to_add=None, category_ids_to_remove=None, filter_ids=None, latitude=None, longitude=None, meta_data=None, search_tags=None, retailer_type=None, visibility=None, create_default_location=None, response_format=None):  # noqa: E501
    """Create Retailer

    Create a retailer record. A billable entity must be created first before a retailer record can be made. # noqa: E501

    :param version: 
    :type version: 
    :param name: The name of the retailer
    :type name: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param street_address: The street address of the retailer
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the retailer
    :type city: str
    :param state: The state of the retailer
    :type state: str
    :param postal_code: The postal code of the retailer
    :type postal_code: str
    :param country: the country of the retailer
    :type country: str
    :param business_phone: The business phone number of the retailer
    :type business_phone: str
    :param business_phone_ext: The business phone extension of the retailer
    :type business_phone_ext: str
    :param website: The website of the retailer
    :type website: str
    :param email: The email of the retailer
    :type email: str
    :param facebook_url: The facebook URL of the retailer
    :type facebook_url: str
    :param twitter_url: The twitter URL of the retailer
    :type twitter_url: str
    :param logo: The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    :type logo: str
    :param logo_asset_id: The retailer logo asset id
    :type logo_asset_id: int
    :param picture1: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    :type picture1: str
    :param picture1_asset_id: An asset id
    :type picture1_asset_id: int
    :param picture2: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    :type picture2: str
    :param picture2_asset_id: An asset id
    :type picture2_asset_id: int
    :param category_ids: Comma separated list of category IDs used to filter retailers by categories
    :type category_ids: str
    :param category_ids_to_add: Comma separated list of category IDs to add to the retailer
    :type category_ids_to_add: str
    :param category_ids_to_remove: Comma separated list of category IDs to remove from the retailer
    :type category_ids_to_remove: str
    :param filter_ids: Comma separated list of filter IDs used to filter retailers
    :type filter_ids: str
    :param latitude: the latitude of the retailer
    :type latitude: float
    :param longitude: the longitude of the retailer
    :type longitude: float
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param search_tags: External custom search keywords
    :type search_tags: str
    :param retailer_type: External custom type identifier
    :type retailer_type: str
    :param visibility: 
    :type visibility: str
    :param create_default_location: Determines whether to create a default location using the retailer information
    :type create_default_location: bool
    :param response_format: The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    :type response_format: str

    :rtype: Union[RetailerFullResponse, Tuple[RetailerFullResponse, int], Tuple[RetailerFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_retailer(version, device_id=None, account_id=None, retailer_id=None):  # noqa: E501
    """Delete Retailer

    Set the deleted timestamp to current time. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the delete, must have rights to edit the retailer.
    :type account_id: int
    :param retailer_id: The ID of the retailer to be deleted
    :type retailer_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_retailer(version, retailer_id, device_id=None, account_id=None, include_counts=None):  # noqa: E501
    """Get Retailer

    Gets a retailer. Only the owner and the employees of a retailer have access to view its information. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_id: the ID of the retailer
    :type retailer_id: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param include_counts: Determines whether to include counts in the response (default true)
    :type include_counts: bool

    :rtype: Union[RetailerFullResponse, Tuple[RetailerFullResponse, int], Tuple[RetailerFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_retailers(version, visibility, sort_field, descending, start, limit, active_only, device_id=None, account_id=None, q=None, keyword=None, category_ids=None, filter_ids=None, i=None, l=None):  # noqa: E501
    """Search Retailers

    earches on retailers that the account has access to. # noqa: E501

    :param version: 
    :type version: 
    :param visibility: 
    :type visibility: str
    :param sort_field: The column to sort the search on
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param category_ids: the categories that the retailer is associated with
    :type category_ids: str
    :param filter_ids: the filters that the retailer is associated with
    :type filter_ids: str
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int

    :rtype: Union[List[RetailerResponse], Tuple[List[RetailerResponse], int], Tuple[List[RetailerResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def retailer_login_check(version, username, password, device_id=None, latitude=None, longitude=None, app_key=None):  # noqa: E501
    """Login Retailer

    Retailer login check. # noqa: E501

    :param version: 
    :type version: 
    :param username: the user&#39;s email address they used to sign-up
    :type username: str
    :param password: the password
    :type password: str
    :param device_id: the device id (optional)
    :type device_id: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param app_key: the application key
    :type app_key: str

    :rtype: Union[AccountLoginResponse, Tuple[AccountLoginResponse, int], Tuple[AccountLoginResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_retailer(version, retailer_id, device_id=None, account_id=None, name=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, country=None, business_phone=None, business_phone_ext=None, website=None, email=None, facebook_url=None, twitter_url=None, logo=None, logo_asset_id=None, picture1=None, picture1_asset_id=None, picture2=None, picture2_asset_id=None, category_ids=None, filter_ids=None, latitude=None, longitude=None, meta_data=None, search_tags=None, retailer_type=None, visibility=None, active=None, response_format=None):  # noqa: E501
    """Update Retailer

    Update a retailer record. Only the owner and the employees of the retailer have access to update its information. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_id: The ID of the retailer to update
    :type retailer_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param name: The name of the retailer
    :type name: str
    :param street_address: The street address of the retailer
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the retailer
    :type city: str
    :param state: The state of the retailer
    :type state: str
    :param postal_code: The postal code of the retailer
    :type postal_code: str
    :param country: the country of the retailer
    :type country: str
    :param business_phone: The business phone of the retailer
    :type business_phone: str
    :param business_phone_ext: The business phone extension of the retailer
    :type business_phone_ext: str
    :param website: The website of the retailer
    :type website: str
    :param email: The email of the retailer
    :type email: str
    :param facebook_url: The facebook URL of the retailer
    :type facebook_url: str
    :param twitter_url: The twitter URL of the retailer
    :type twitter_url: str
    :param logo: The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    :type logo: str
    :param logo_asset_id: The retailer logo asset id
    :type logo_asset_id: int
    :param picture1: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    :type picture1: str
    :param picture1_asset_id: An asset id
    :type picture1_asset_id: int
    :param picture2: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    :type picture2: str
    :param picture2_asset_id: An asset id
    :type picture2_asset_id: int
    :param category_ids: Comma separated list of category IDs used to filter retailers by categories
    :type category_ids: str
    :param filter_ids: Comma separated list of filter IDs used to filter retailers
    :type filter_ids: str
    :param latitude: the latitude of the retailer
    :type latitude: float
    :param longitude: the longitude of the retailer
    :type longitude: float
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param search_tags: External custom search keywords
    :type search_tags: str
    :param retailer_type: External custom type identifier
    :type retailer_type: str
    :param visibility: 
    :type visibility: str
    :param active: Sets whether the retailer is active or inactive (hidden from consumers)
    :type active: bool
    :param response_format: The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    :type response_format: str

    :rtype: Union[RetailerFullResponse, Tuple[RetailerFullResponse, int], Tuple[RetailerFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
