import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.retailer_location_response import RetailerLocationResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_retailer_location_consumer(version, app_key, name, device_id=None, account_id=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, country=None, business_phone=None, business_phone_ext=None, website=None, email=None, details_header=None, details_body=None, hours=None, tags=None, logo_asset_id=None, picture1_asset_id=None, picture2_asset_id=None, category_ids=None, filter_ids=None, meta_data=None, public_location=None, active=None, location_type=None, latitude=None, longitude=None):  # noqa: E501
    """Create Retailer Location (Consumer)

    Creates a location record for an application that can support crowd sourced locations. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: the application key
    :type app_key: str
    :param name: The name of the retailer location
    :type name: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param street_address: The street address of the retailer location
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the retailer location
    :type city: str
    :param state: The state of the retailer location
    :type state: str
    :param postal_code: The postal code of the retailer location
    :type postal_code: str
    :param country: the country of the retailer location
    :type country: str
    :param business_phone: The business phone
    :type business_phone: str
    :param business_phone_ext: The business phone extension
    :type business_phone_ext: str
    :param website: The website of the retailer location
    :type website: str
    :param email: The email of the retailer location
    :type email: str
    :param details_header: A brief description about the retailer location (255 character limit)
    :type details_header: str
    :param details_body: A detailed description about the retailer location
    :type details_body: str
    :param hours: The hours of operation
    :type hours: str
    :param tags: Custom string field for doing full-text searches
    :type tags: str
    :param logo_asset_id: The retailer location logo asset id
    :type logo_asset_id: int
    :param picture1_asset_id: An asset id
    :type picture1_asset_id: int
    :param picture2_asset_id: An asset id
    :type picture2_asset_id: int
    :param category_ids: Comma separated list of category IDs used to filter retailer locations by categories
    :type category_ids: str
    :param filter_ids: Comma separated list of filter IDs used to filter retailer locations
    :type filter_ids: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param public_location: Whether the location is public
    :type public_location: bool
    :param active: whether the retailer location created should be active or not
    :type active: bool
    :param location_type: External custom type identifier
    :type location_type: str
    :param latitude: The latitude to center the search on
    :type latitude: float
    :param longitude: The longitude to center the search on
    :type longitude: float

    :rtype: Union[RetailerLocationResponse, Tuple[RetailerLocationResponse, int], Tuple[RetailerLocationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_retailer_locations(version, retailer_id, name, street_address, city, state, postal_code, device_id=None, account_id=None, street_address2=None, country=None, business_phone=None, business_phone_ext=None, website=None, email=None, internal_id=None, details_header=None, details_body=None, hours=None, logo=None, logo_asset_id=None, picture1=None, picture1_asset_id=None, picture2=None, picture2_asset_id=None, category_ids=None, filter_ids=None, latitude=None, longitude=None, building=None, google_place_id=None, yelp_id=None, active=None, public_location=None, location_type=None, audience_ids=None, audience_ids_to_add=None, audience_ids_to_remove=None, response_format=None, response_includes=None):  # noqa: E501
    """Create Retailer Location

    Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_id: The ID of the retailer
    :type retailer_id: int
    :param name: The name of the retailer location
    :type name: str
    :param street_address: The street address of the retailer location
    :type street_address: str
    :param city: The city of the retailer location
    :type city: str
    :param state: The state of the retailer location
    :type state: str
    :param postal_code: The postal code of the retailer location
    :type postal_code: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param country: the country of the retailer location
    :type country: str
    :param business_phone: The business phone number of the retailer location
    :type business_phone: str
    :param business_phone_ext: The business phone extension
    :type business_phone_ext: str
    :param website: The website of the retailer location
    :type website: str
    :param email: The email of the retailer location
    :type email: str
    :param internal_id: An internal identifier used by the retailer
    :type internal_id: str
    :param details_header: A brief description about the retailer location (255 character limit)
    :type details_header: str
    :param details_body: A detailed description about the retailer location
    :type details_body: str
    :param hours: The hours of operation
    :type hours: str
    :param logo: The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    :type logo: str
    :param logo_asset_id: The retailer location logo asset id
    :type logo_asset_id: int
    :param picture1: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    :type picture1: str
    :param picture1_asset_id: An asset id
    :type picture1_asset_id: int
    :param picture2: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    :type picture2: str
    :param picture2_asset_id: An asset id
    :type picture2_asset_id: int
    :param category_ids: Comma separated list of category IDs used to filter retailer locations by categories
    :type category_ids: str
    :param filter_ids: Comma separated list of filter IDs used to filter retailer locations
    :type filter_ids: str
    :param latitude: the latitude of the retailer location
    :type latitude: float
    :param longitude: the longitude of the retailer location
    :type longitude: float
    :param building: 
    :type building: str
    :param google_place_id: the ID of the Google Place that this retailer location is assigned to
    :type google_place_id: str
    :param yelp_id: the Yelp ID that this retailer location is assigned to
    :type yelp_id: str
    :param active: whether the retailer location should be active or inactive
    :type active: bool
    :param public_location: Sets whether the location is public or not
    :type public_location: bool
    :param location_type: External custom type identifier
    :type location_type: str
    :param audience_ids: Comma separated list of audience IDs used to assign audiences to the retailer location
    :type audience_ids: str
    :param audience_ids_to_add: Comma separated list of audience IDs to add to the retailer location
    :type audience_ids_to_add: str
    :param audience_ids_to_remove: Comma separated list of audience IDs to remove from the retailer location
    :type audience_ids_to_remove: str
    :param response_format: The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    :type response_format: str
    :param response_includes: Comma separated list of response includes (e.g. RETAILER,ASSETS,OFFERS,CATEGORIES,FILTERS,AUDIENCES,QRCODE)
    :type response_includes: str

    :rtype: Union[RetailerLocationResponse, Tuple[RetailerLocationResponse, int], Tuple[RetailerLocationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_retailer_location(version, device_id=None, account_id=None, retailer_location_id=None):  # noqa: E501
    """Delete Retailer Location

    Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id
    :type device_id: str
    :param account_id: the id of the logged in user
    :type account_id: int
    :param retailer_location_id: the id of the retailer location to delete
    :type retailer_location_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_retailer_location(version, retailer_location_id, device_id=None, account_id=None, retailer_location_token=None):  # noqa: E501
    """Get Retailer Location

    Gets a retailer location. Only the owner and the employees of the retailer have access to view its information. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_location_id: The ID of the retailer location
    :type retailer_location_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param retailer_location_token: the unique token of the retailer location
    :type retailer_location_token: str

    :rtype: Union[RetailerLocationResponse, Tuple[RetailerLocationResponse, int], Tuple[RetailerLocationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_retailer_location_consumer(version, retailer_location_id, device_id=None, account_id=None):  # noqa: E501
    """Get Retailer Location (Consumer)

    Gets the details of a retailer location as a consumer. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_location_id: The retailer location id
    :type retailer_location_id: int
    :param device_id: The device id for returning account information (i.e. favorites)
    :type device_id: str
    :param account_id: The account id for returning account information (i.e. favorites)
    :type account_id: int

    :rtype: Union[RetailerLocationResponse, Tuple[RetailerLocationResponse, int], Tuple[RetailerLocationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def indexed_retailer_location_distance_search(version, latitude, longitude, search_range, start, limit, account_id=None, address=None, has_offers=None, categories=None, filters=None, audiences=None, retailer_ids=None, retailer_location_ids=None, tags=None, location_type=None, sort_field=None, descending=None, q=None, keyword=None, keyword_operator=None, search_expression=None, distance_unit=None, return_favorited=None, return_retailer=None, return_assets=None, return_offers=None, return_categories=None, return_filters=None, return_audiences=None, return_qr_code=None, return_external_category_data=None, include_favorite=None, include_liked=None, include_rating=None):  # noqa: E501
    """Distance Search Retailer Locations (Indexed)

    Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance. # noqa: E501

    :param version: 
    :type version: 
    :param latitude: The latitude to center the search on
    :type latitude: float
    :param longitude: The longitude to center the search on
    :type longitude: float
    :param search_range: The search range in the distanceUnit specified; default is MILES.
    :type search_range: float
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param account_id: The account id of the user
    :type account_id: int
    :param address: Used to return results using this address as the center
    :type address: str
    :param has_offers: boolean to indicate whether to include retailer locations that have no offers
    :type has_offers: bool
    :param categories: Comma separate list of category ids
    :type categories: str
    :param filters: Comma separated list of filter ids
    :type filters: str
    :param audiences: Comma separated list of audience ids
    :type audiences: str
    :param retailer_ids: Comma separated list of retailer ids
    :type retailer_ids: str
    :param retailer_location_ids: Comma separated list of retailer location ids
    :type retailer_location_ids: str
    :param tags: Does a full-text search on tags
    :type tags: str
    :param location_type: Location type filter
    :type location_type: str
    :param sort_field: The field to sort the result set on. Possible values include: DISTANCE, RETAILER_NAME, RETAILER_LOCATION_NAME
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: Search by keyword
    :type keyword: str
    :param keyword_operator: Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter
    :type keyword_operator: str
    :param search_expression: Search expression to further refine results
    :type search_expression: str
    :param distance_unit: Unit of distance
    :type distance_unit: str
    :param return_favorited: (deprecated) return favorited flag
    :type return_favorited: bool
    :param return_retailer: Return retailer info
    :type return_retailer: bool
    :param return_assets: Return assets
    :type return_assets: bool
    :param return_offers: Return offers
    :type return_offers: bool
    :param return_categories: Return categories
    :type return_categories: bool
    :param return_filters: Return filters
    :type return_filters: bool
    :param return_audiences: Return audiences
    :type return_audiences: bool
    :param return_qr_code: Return QR code info
    :type return_qr_code: bool
    :param return_external_category_data: Return external category data
    :type return_external_category_data: bool
    :param include_favorite: Include favorites in response
    :type include_favorite: bool
    :param include_liked: Include liked flag in response
    :type include_liked: bool
    :param include_rating: Include rating info in response
    :type include_rating: bool

    :rtype: Union[List[RetailerLocationResponse], Tuple[List[RetailerLocationResponse], int], Tuple[List[RetailerLocationResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def indexed_retailer_location_search(version, account_id=None, start=None, limit=None, has_offers=None, categories=None, filters=None, audiences=None, retailer_ids=None, retailer_location_ids=None, tags=None, location_type=None, sort_field=None, descending=None, q=None, keyword=None, keyword_operator=None, search_expression=None, return_retailer=None, return_assets=None, return_offers=None, return_categories=None, return_filters=None, return_audiences=None, return_qr_code=None, return_external_category_data=None, include_favorite=None, include_liked=None, include_rating=None):  # noqa: E501
    """Keyword Search Retailer Locations (Indexed)

    Retailer location (faster) indexed search. This searches all retailer locations. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param has_offers: boolean to indicate whether to include retailer locations that have no offers
    :type has_offers: bool
    :param categories: Comma separate list of category ids
    :type categories: str
    :param filters: Comma separated list of filter ids
    :type filters: str
    :param audiences: Comma separated list of audience ids
    :type audiences: str
    :param retailer_ids: Comma separated list of retailer ids
    :type retailer_ids: str
    :param retailer_location_ids: Comma separated list of retailer location ids
    :type retailer_location_ids: str
    :param tags: Does a full-text search on tags
    :type tags: str
    :param location_type: Location type filter
    :type location_type: str
    :param sort_field: The field to sort the result set on. Possible values include: RETAILER_NAME, RETAILER_LOCATION_NAME
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: Search by keyword
    :type keyword: str
    :param keyword_operator: Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter
    :type keyword_operator: str
    :param search_expression: Search expression to further refine results
    :type search_expression: str
    :param return_retailer: Return retailer info
    :type return_retailer: bool
    :param return_assets: Return assets
    :type return_assets: bool
    :param return_offers: Return offers
    :type return_offers: bool
    :param return_categories: Return categories
    :type return_categories: bool
    :param return_filters: Return filters
    :type return_filters: bool
    :param return_audiences: Return audiences
    :type return_audiences: bool
    :param return_qr_code: Return QR code info
    :type return_qr_code: bool
    :param return_external_category_data: Return external category data
    :type return_external_category_data: bool
    :param include_favorite: Include favorites in response
    :type include_favorite: bool
    :param include_liked: Include liked flag in response
    :type include_liked: bool
    :param include_rating: Include rating info in response
    :type include_rating: bool

    :rtype: Union[List[RetailerLocationResponse], Tuple[List[RetailerLocationResponse], int], Tuple[List[RetailerLocationResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_retailer_locations(version, device_id=None, account_id=None, q=None, keyword=None, retailer_ids=None, retailer_location_ids=None, location_type=None, sort_field=None, descending=None, i=None, start=None, l=None, limit=None, show_public_locations=None, active_only=None, return_retailer=None, return_assets=None, return_offers=None, return_categories=None, return_filters=None, return_audiences=None, return_qr_code=None, include_favorite=None, include_liked=None, include_rating=None):  # noqa: E501
    """Search Retailer Locations (Owned)

    Searches on retailer locations that the account has access to. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param retailer_ids: Comma separated list of retailer IDs which when passed in will filter the results to only return these retailers.
    :type retailer_ids: str
    :param retailer_location_ids: Comma separated list of retailer location IDs
    :type retailer_location_ids: str
    :param location_type: Location type filter
    :type location_type: str
    :param sort_field: The column to sort the search on
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param i: This parameter is deprecated.
    :type i: int
    :param start: The record to begin the return set on
    :type start: int
    :param l: This parameter is deprecated.
    :type l: int
    :param limit: The number of records to return
    :type limit: int
    :param show_public_locations: Whether to include public locations in the results
    :type show_public_locations: bool
    :param active_only: Return only active results
    :type active_only: bool
    :param return_retailer: Return retailer info
    :type return_retailer: bool
    :param return_assets: Return assets
    :type return_assets: bool
    :param return_offers: Return offers
    :type return_offers: bool
    :param return_categories: Return categories
    :type return_categories: bool
    :param return_filters: Return filters
    :type return_filters: bool
    :param return_audiences: Return audiences
    :type return_audiences: bool
    :param return_qr_code: Return QR code info
    :type return_qr_code: bool
    :param include_favorite: Include favorites in response
    :type include_favorite: bool
    :param include_liked: Include liked flag in response
    :type include_liked: bool
    :param include_rating: Include rating info in response
    :type include_rating: bool

    :rtype: Union[List[RetailerLocationResponse], Tuple[List[RetailerLocationResponse], int], Tuple[List[RetailerLocationResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_retailer_locations(version, retailer_location_id, device_id=None, account_id=None, name=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, country=None, business_phone=None, business_phone_ext=None, website=None, email=None, internal_id=None, details_header=None, details_body=None, hours=None, logo=None, logo_asset_id=None, picture1=None, picture1_asset_id=None, picture2=None, picture2_asset_id=None, category_ids=None, filter_ids=None, latitude=None, longitude=None, building=None, google_place_id=None, yelp_id=None, meta_data=None, payment_provider=None, active=None, public_location=None, location_type=None, audience_ids=None, audience_ids_to_add=None, audience_ids_to_remove=None, response_format=None, tags=None):  # noqa: E501
    """Update Retailer Location

    Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this. # noqa: E501

    :param version: 
    :type version: 
    :param retailer_location_id: The ID of the retailer location
    :type retailer_location_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param name: The name of the retailer location
    :type name: str
    :param street_address: The street address of the retailer location
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the retailer location
    :type city: str
    :param state: The state of the retailer location
    :type state: str
    :param postal_code: The postal code of the retailer location
    :type postal_code: str
    :param country: the country of the retailer location
    :type country: str
    :param business_phone: The business phone number of the retailer location
    :type business_phone: str
    :param business_phone_ext: The business phone extension of the retailer location
    :type business_phone_ext: str
    :param website: The website of the retailer location
    :type website: str
    :param email: The email of the retailer location
    :type email: str
    :param internal_id: An internal identifier used by the retailer
    :type internal_id: str
    :param details_header: A brief description about the retailer location (255 character limit)
    :type details_header: str
    :param details_body: A detailed description about the retailer location
    :type details_body: str
    :param hours: The hours of operation
    :type hours: str
    :param logo: The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    :type logo: str
    :param logo_asset_id: The retailer location logo asset id
    :type logo_asset_id: int
    :param picture1: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    :type picture1: str
    :param picture1_asset_id: An asset id
    :type picture1_asset_id: int
    :param picture2: Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    :type picture2: str
    :param picture2_asset_id: An asset id
    :type picture2_asset_id: int
    :param category_ids: Comma separated list of category IDs used to filter retailer locations by categories
    :type category_ids: str
    :param filter_ids: Comma separated list of filter IDs used to filter retailer locations
    :type filter_ids: str
    :param latitude: the latituede of the retailer location
    :type latitude: float
    :param longitude: the longitude of the retailer location
    :type longitude: float
    :param building: 
    :type building: str
    :param google_place_id: the Google Place ID that the retailer location is associated with
    :type google_place_id: str
    :param yelp_id: the Yelp ID that the retailer location is associated with
    :type yelp_id: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param payment_provider: Specifies which payment provider Sirqul will use when making payments
    :type payment_provider: str
    :param active: Sets whether the retailer is active or inactive (hidden from consumers)
    :type active: bool
    :param public_location: Sets whether the location is public or not
    :type public_location: bool
    :param location_type: External custom type identifier
    :type location_type: str
    :param audience_ids: Comma separated list of audience IDs used to assign audiences to the retailer location
    :type audience_ids: str
    :param audience_ids_to_add: Comma separated list of audience IDs to add to the retailer location
    :type audience_ids_to_add: str
    :param audience_ids_to_remove: Comma separated list of audience IDs to remove from the retailer location
    :type audience_ids_to_remove: str
    :param response_format: The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    :type response_format: str
    :param tags: Custom string field for doing full-text searches
    :type tags: str

    :rtype: Union[RetailerLocationResponse, Tuple[RetailerLocationResponse, int], Tuple[RetailerLocationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
