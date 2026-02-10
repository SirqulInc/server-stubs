import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.listing_full_response import ListingFullResponse  # noqa: E501
from openapi_server.models.listing_group_response import ListingGroupResponse  # noqa: E501
from openapi_server.models.listing_response import ListingResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_listing(version, account_id, name, filter_ids=None, description=None, start=None, end=None, location_name=None, location_description=None, is_private=None, external_id=None, external_id2=None, external_group_id=None, active=None, meta_data=None):  # noqa: E501
    """Create Listing

    Creates a listing. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the user&#39;s account ID
    :type account_id: int
    :param name: the name of the listing
    :type name: str
    :param filter_ids: comma separated list of filter IDs
    :type filter_ids: str
    :param description: the description of the listing
    :type description: str
    :param start: the start date of the listing
    :type start: int
    :param end: the end date of the listing
    :type end: int
    :param location_name: the name of the location the listing will be held at
    :type location_name: str
    :param location_description: the description of the location the listing will be held at
    :type location_description: str
    :param is_private: determines whether the listing is public or private
    :type is_private: bool
    :param external_id: external identifier used by a third party
    :type external_id: str
    :param external_id2: secondary external identifier used by a third party
    :type external_id2: str
    :param external_group_id: external group identifier used by a third party
    :type external_group_id: str
    :param active: Sets the active flag
    :type active: bool
    :param meta_data: external custom client defined data
    :type meta_data: str

    :rtype: Union[ListingFullResponse, Tuple[ListingFullResponse, int], Tuple[ListingFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_listing(version, account_id, listing_id):  # noqa: E501
    """Delete Listing

    Delete a listing. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param listing_id: the id of the listing to delete
    :type listing_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_listing(version, listing_id):  # noqa: E501
    """Get Listing

    Get a listing by id. # noqa: E501

    :param version: 
    :type version: 
    :param listing_id: the id of the listing to get
    :type listing_id: int

    :rtype: Union[ListingFullResponse, Tuple[ListingFullResponse, int], Tuple[ListingFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_listing(version, account_id=None, keyword=None, start=None, limit=None, active_only=None, latitude=None, longitude=None, start_date=None, end_date=None, category_ids=None, filter_ids=None, use_listing_order_ids=None, external_id=None, external_id2=None, external_group_id=None):  # noqa: E501
    """Search Listings

    Search for event listings from the start time to end time # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param keyword: search the event name and description for this keyword
    :type keyword: str
    :param start: the record to begin the return set on
    :type start: int
    :param limit: the number of records to return
    :type limit: int
    :param active_only: whether to search on active listings only
    :type active_only: bool
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param start_date: the start date to search from
    :type start_date: int
    :param end_date: the end date to search to
    :type end_date: int
    :param category_ids: only return items of these categories
    :type category_ids: str
    :param filter_ids: 
    :type filter_ids: str
    :param use_listing_order_ids: determines whether to use configured listing order ids
    :type use_listing_order_ids: bool
    :param external_id: external identifier used by a third party
    :type external_id: str
    :param external_id2: secondary external identifier used by a third party
    :type external_id2: str
    :param external_group_id: external group identifier used by a third party
    :type external_group_id: str

    :rtype: Union[List[ListingResponse], Tuple[List[ListingResponse], int], Tuple[List[ListingResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def summary_listing(version, account_id=None, start_date=None, category_ids=None, days_to_include=None, use_listing_order_ids=None):  # noqa: E501
    """Summary Listing

    Search for a list of summary listings from the start time up to 8 days out. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user
    :type account_id: int
    :param start_date: the start date to search from
    :type start_date: int
    :param category_ids: the list of categories to search on
    :type category_ids: str
    :param days_to_include: how far out to search, in days
    :type days_to_include: int
    :param use_listing_order_ids: determines whether to use configured listing order ids
    :type use_listing_order_ids: bool

    :rtype: Union[List[ListingGroupResponse], Tuple[List[ListingGroupResponse], int], Tuple[List[ListingGroupResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_listing(version, account_id, listing_id, filter_ids=None, name=None, description=None, start=None, end=None, location_name=None, location_description=None, is_private=None, external_id=None, external_id2=None, external_group_id=None, active=None, meta_data=None):  # noqa: E501
    """Update Listing

    Updates a listing. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the user&#39;s account ID
    :type account_id: int
    :param listing_id: the listing to update
    :type listing_id: int
    :param filter_ids: comma separated list of filter IDs
    :type filter_ids: str
    :param name: the name of the listing
    :type name: str
    :param description: the description of the listing
    :type description: str
    :param start: the start date of the listing
    :type start: int
    :param end: the end date of the listing
    :type end: int
    :param location_name: the name of the location the listing will be held at
    :type location_name: str
    :param location_description: the description of the location the listing will be held at
    :type location_description: str
    :param is_private: determines whether the listing is public or private
    :type is_private: bool
    :param external_id: external identifier used by a third party
    :type external_id: str
    :param external_id2: secondary external identifier used by a third party
    :type external_id2: str
    :param external_group_id: external group identifier used by a third party
    :type external_group_id: str
    :param active: Sets the active flag
    :type active: bool
    :param meta_data: external custom client defined data
    :type meta_data: str

    :rtype: Union[ListingFullResponse, Tuple[ListingFullResponse, int], Tuple[ListingFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
