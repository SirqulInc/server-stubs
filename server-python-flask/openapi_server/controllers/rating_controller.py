import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.rating_index_response import RatingIndexResponse  # noqa: E501
from openapi_server.models.rating_response import RatingResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_rating(version, ratable_type, ratable_id, rating_value, device_id=None, account_id=None, category_id=None, display=None, description=None, location_description=None, latitude=None, longitude=None):  # noqa: E501
    """Create Rating

    This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object. # noqa: E501

    :param version: 
    :type version: 
    :param ratable_type: The ratable object type {RETAILER_LOCATION}
    :type ratable_type: str
    :param ratable_id: The id of the ratable object
    :type ratable_id: int
    :param rating_value: The integer value of 0-100
    :type rating_value: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param category_id: 
    :type category_id: int
    :param display: A subject title for the user rating (limited to 255 characters)
    :type display: str
    :param description: The description of the rating
    :type description: str
    :param location_description: The description of the location
    :type location_description: str
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float

    :rtype: Union[RatingResponse, Tuple[RatingResponse, int], Tuple[RatingResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_rating(version, rating_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Rating

    Sets a rating as deleted. # noqa: E501

    :param version: 
    :type version: 
    :param rating_id: The ID of the rating to delete
    :type rating_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_location_rating_indexes(version, category_ids=None, keyword=None, location_type=None, sort_field=None, descending=None, start=None, limit=None, search_range=None, latitude=None, longitude=None, return_overall_rating=None, distance_unit=None, return_retailer=None, return_assets=None, return_offers=None, return_categories=None, return_filters=None):  # noqa: E501
    """Search Location Rating Indexes

    Search for retailer locations by averages near you. # noqa: E501

    :param version: 
    :type version: 
    :param category_ids: Comma separated list of category ids to filter the results by
    :type category_ids: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param location_type: The type of location to filter the results by
    :type location_type: str
    :param sort_field: The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param search_range: The search radius in kilometers to filter results
    :type search_range: float
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float
    :param return_overall_rating: Determines whether to return the overall rating record instead
    :type return_overall_rating: bool
    :param distance_unit: 
    :type distance_unit: str
    :param return_retailer: whether to return the retailer or not
    :type return_retailer: bool
    :param return_assets: whether to return the assets or not
    :type return_assets: bool
    :param return_offers: whether to return the offers or not
    :type return_offers: bool
    :param return_categories: whether to return the categories or not
    :type return_categories: bool
    :param return_filters: whether to return the filters or not
    :type return_filters: bool

    :rtype: Union[List[RatingIndexResponse], Tuple[List[RatingIndexResponse], int], Tuple[List[RatingIndexResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_rating_indexes(version, ratable_type, ratable_ids=None, category_ids=None, secondary_type=None, keyword=None, sort_field=None, descending=None, start=None, limit=None, latitude=None, longitude=None, return_ratable=None, return_overall_rating=None):  # noqa: E501
    """Search Rating Indexes

    Search for ratable items by averages. # noqa: E501

    :param version: 
    :type version: 
    :param ratable_type: Filter results by a ratable type {RETAILER_LOCATION}
    :type ratable_type: str
    :param ratable_ids: Comma separated list of ratable ids to filter the resuts by
    :type ratable_ids: str
    :param category_ids: Comma separated list of category ids to filter the results by
    :type category_ids: str
    :param secondary_type: 
    :type secondary_type: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param sort_field: The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param latitude: 
    :type latitude: float
    :param longitude: 
    :type longitude: float
    :param return_ratable: Determines whether to return the ratable object in the response
    :type return_ratable: bool
    :param return_overall_rating: Determines whether to return the overall rating record instead
    :type return_overall_rating: bool

    :rtype: Union[List[RatingIndexResponse], Tuple[List[RatingIndexResponse], int], Tuple[List[RatingIndexResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_ratings(version, device_id=None, account_id=None, filter_account_id=None, ratable_type=None, ratable_id=None, category_ids=None, keyword=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search Ratings

    Search for ratings on a ratable object. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param filter_account_id: Filter results for a particular account
    :type filter_account_id: int
    :param ratable_type: The ratable object type {RETAILER_LOCATION}
    :type ratable_type: str
    :param ratable_id: The id of the ratable object
    :type ratable_id: int
    :param category_ids: Comma separated list of category ids to filter the results by
    :type category_ids: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param sort_field: The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE}
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int

    :rtype: Union[List[RatingResponse], Tuple[List[RatingResponse], int], Tuple[List[RatingResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_rating(version, rating_id, device_id=None, account_id=None, rating_value=None, category_id=None, display=None, description=None, location_description=None, latitude=None, longitude=None):  # noqa: E501
    """Update Rating

    Update an existing rating. Only the creator of the rating have permission to update. # noqa: E501

    :param version: 
    :type version: 
    :param rating_id: The id of the rating (Note: this is not the ratable object id)
    :type rating_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param rating_value: The rating value to update
    :type rating_value: int
    :param category_id: 
    :type category_id: int
    :param display: A subject title for the user rating (limited to 255 characters)
    :type display: str
    :param description: The description of the rating
    :type description: str
    :param location_description: The description of the location
    :type location_description: str
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float

    :rtype: Union[RatingResponse, Tuple[RatingResponse, int], Tuple[RatingResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
