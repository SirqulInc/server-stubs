import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.region_response import RegionResponse  # noqa: E501
from openapi_server import util


def create_region(version, account_id, region_class, short_name, full_name=None, parent_ids=None, children_ids=None, postal_code_ids=None, locations=None, retailer_location_id=None, visibility=None, category_ids=None, filter_ids=None, start=None, end=None, polygon=None, meta_data=None, latitude=None, longitude=None, version_code=None, root=None, active=None):  # noqa: E501
    """Create Region

    Create a region. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The id of the account sending the request
    :type account_id: int
    :param region_class: RegionClass of this region
    :type region_class: str
    :param short_name: Short name of the region. This is optimized for search
    :type short_name: str
    :param full_name: Full name of the region
    :type full_name: str
    :param parent_ids: Comma separated region ids that are parents of this region
    :type parent_ids: str
    :param children_ids: Comma separated region ids that are children of this region
    :type children_ids: str
    :param postal_code_ids: Comma separated postal code ids the region will include
    :type postal_code_ids: str
    :param locations: Sets of name,lat,long used to create new postal codes assigned to the region
    :type locations: str
    :param retailer_location_id: the id of the retailer location that the region is being created for
    :type retailer_location_id: int
    :param visibility: The Visibility of the region
    :type visibility: str
    :param category_ids: the categories that the region is assigned to
    :type category_ids: str
    :param filter_ids: the filters that the region is assigned to
    :type filter_ids: str
    :param start: 
    :type start: int
    :param end: 
    :type end: int
    :param polygon: the polygon generated for the region
    :type polygon: str
    :param meta_data: the meta data associated with the region
    :type meta_data: str
    :param latitude: the latitude of the region
    :type latitude: float
    :param longitude: the longitude of the region
    :type longitude: float
    :param version_code: the version code
    :type version_code: int
    :param root: If this is a root region or not. If true means this region has no parent regions
    :type root: bool
    :param active: Active or inactive status of the region
    :type active: bool

    :rtype: Union[RegionResponse, Tuple[RegionResponse, int], Tuple[RegionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_region(version, account_id, region_id):  # noqa: E501
    """Delete Region

    Delete a region. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account logged in
    :type account_id: int
    :param region_id: the id of the region
    :type region_id: int

    :rtype: Union[RegionResponse, Tuple[RegionResponse, int], Tuple[RegionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_region(version, region_id, account_id=None):  # noqa: E501
    """Get Region

    Get a region. # noqa: E501

    :param version: 
    :type version: 
    :param region_id: the id of the region to get
    :type region_id: int
    :param account_id: the id of the logged in user
    :type account_id: int

    :rtype: Union[RegionResponse, Tuple[RegionResponse, int], Tuple[RegionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_regions(version, account_id=None, query=None, keyword=None, latitude=None, longitude=None, range=None, region_class=None, visibility=None, search_mode=None, sort_field=None, descending=None, include_parent=None, include_children=None, include_postal_codes=None, category_ids=None, filter_ids=None, version_code=None, active_only=None, show_deleted=None, last_updated_since=None, start=None, limit=None):  # noqa: E501
    """Search Regions

    Get the list of regions. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the owner account id of the region to be created
    :type account_id: int
    :param query: This parameter is deprecated. deprecated - use \&quot;keyword\&quot;
    :type query: str
    :param keyword: the keyword to filter results on
    :type keyword: str
    :param latitude: the latitude of the user
    :type latitude: float
    :param longitude: the longitude of the user
    :type longitude: float
    :param range: the search radius
    :type range: float
    :param region_class: 
    :type region_class: str
    :param visibility: 
    :type visibility: str
    :param search_mode: the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server
    :type search_mode: str
    :param sort_field: the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.
    :type sort_field: str
    :param descending: determines if the results get ordered in descending order
    :type descending: bool
    :param include_parent: include the parent region or not
    :type include_parent: bool
    :param include_children: include the chidren regions or not
    :type include_children: bool
    :param include_postal_codes: include the postal codes associated with the region or not
    :type include_postal_codes: bool
    :param category_ids: search on the categories associated with the region
    :type category_ids: str
    :param filter_ids: search on the filters associated with the region
    :type filter_ids: str
    :param version_code: filter by a specific version code
    :type version_code: int
    :param active_only: filter to show only active results
    :type active_only: bool
    :param show_deleted: If showDeleted is true and activeOnly is false, will return regions that have been deleted
    :type show_deleted: bool
    :param last_updated_since: only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)
    :type last_updated_since: int
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[List[RegionResponse], Tuple[List[RegionResponse], int], Tuple[List[RegionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_region(version, account_id, region_id, region_class=None, short_name=None, full_name=None, parent_ids=None, children_ids=None, postal_code_ids=None, locations=None, retailer_location_id=None, visibility=None, category_ids=None, filter_ids=None, start=None, end=None, polygon=None, meta_data=None, latitude=None, longitude=None, version_code=None, root=None, active=None, clear_lists=None):  # noqa: E501
    """Update Region

    Update a region. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The id of the account sending the request
    :type account_id: int
    :param region_id: The id of the region to be updated
    :type region_id: int
    :param region_class: RegionClass of this region
    :type region_class: str
    :param short_name: Short name of the region. This is optimized for search
    :type short_name: str
    :param full_name: Full name of the region
    :type full_name: str
    :param parent_ids: Comma separated region ids that are parents of this region
    :type parent_ids: str
    :param children_ids: Comma separated region ids that are children of this region
    :type children_ids: str
    :param postal_code_ids: Comma separated postal code ids the region will include
    :type postal_code_ids: str
    :param locations: Sets of name,lat,long used to create new postal codes assigned to the region
    :type locations: str
    :param retailer_location_id: the retailer location ID that the region is associated with
    :type retailer_location_id: int
    :param visibility: The Visibility of the region
    :type visibility: str
    :param category_ids: the categories that the region is assigned to
    :type category_ids: str
    :param filter_ids: the filters that the region is assigned to
    :type filter_ids: str
    :param start: 
    :type start: int
    :param end: 
    :type end: int
    :param polygon: the polygon of the region
    :type polygon: str
    :param meta_data: the meta data of the region
    :type meta_data: str
    :param latitude: the latitude of the region
    :type latitude: float
    :param longitude: the longitude of the region
    :type longitude: float
    :param version_code: the version code
    :type version_code: int
    :param root: If this is a root region or not. If true means this region has no parent regions
    :type root: bool
    :param active: Active or inactive status of the region
    :type active: bool
    :param clear_lists: If true clear the children and postal code lists before add new ones, otherwise just append.
    :type clear_lists: bool

    :rtype: Union[RegionResponse, Tuple[RegionResponse, int], Tuple[RegionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
