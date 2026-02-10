import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.category_response import CategoryResponse  # noqa: E501
from openapi_server.models.category_tree_response import CategoryTreeResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def category_distance_search(version, account_id=None, keyword=None, app_key=None, category_ids=None, parent_category_ids=None, root_only=None, sort_field=None, response_group=None, descending=None, start=None, limit=None, active_only=None, return_external=None, exact_match=None, type=None, external_type=None, min_offer_count=None, latitude=None, longitude=None, range=None):  # noqa: E501
    """Search Categories by Distance

    Search for categories by distance. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param keyword: The keyword string to search on
    :type keyword: str
    :param app_key: the appKey of the application to retrieve categories for, if not specified then search on the global application.
    :type app_key: str
    :param category_ids: Restrict the search by specific categories
    :type category_ids: str
    :param parent_category_ids: Restrict the search by specific parent categories so that only its sub children are searched.
    :type parent_category_ids: str
    :param root_only: Restrict the search to only those categories with no parent category assigned.
    :type root_only: bool
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    :type sort_field: str
    :param response_group: The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    :type response_group: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param active_only: Determines whether to return only active categories
    :type active_only: bool
    :param return_external: Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    :type return_external: bool
    :param exact_match: If true search categories using the exact keyword, if false then do a partial match (like) search.
    :type exact_match: bool
    :param type: Filters results by the Category&#39;s type
    :type type: str
    :param external_type: Filters results by externalType
    :type external_type: str
    :param min_offer_count: Filters results to only return Categories that have been referenced by a minimum number of Offers
    :type min_offer_count: int
    :param latitude: the latitude of where the search is centered on
    :type latitude: float
    :param longitude: the longitude of where the search is centered on
    :type longitude: float
    :param range: the maximum range the category can be from the center
    :type range: float

    :rtype: Union[List[CategoryResponse], Tuple[List[CategoryResponse], int], Tuple[List[CategoryResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def create_category(version, account_id, name, app_key=None, parent_category_id=None, description=None, type=None, asset_id=None, external_id=None, external_type=None, external_category_slug=None, sqoot_slug=None, active=None, meta_data=None, search_tags=None):  # noqa: E501
    """Create Category

    Create a new category. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user (must have permissions to the target application)
    :type account_id: int
    :param name: The name of the category
    :type name: str
    :param app_key: The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)
    :type app_key: str
    :param parent_category_id: The ID of the parent category, if not provided then the parent category will be null
    :type parent_category_id: int
    :param description: The description of the category
    :type description: str
    :param type: The type of the category
    :type type: str
    :param asset_id: The ID of the image asset previously uploaded using the media service
    :type asset_id: int
    :param external_id: A string identifier used by client applications to store external information
    :type external_id: str
    :param external_type: A string type used by client applications to store external information
    :type external_type: str
    :param external_category_slug: external category slug
    :type external_category_slug: str
    :param sqoot_slug: sqoot slug
    :type sqoot_slug: str
    :param active: Sets whether the category is active or inactive (hidden from consumers)
    :type active: bool
    :param meta_data: external custom client defined data
    :type meta_data: str
    :param search_tags: user defined strings for searching
    :type search_tags: str

    :rtype: Union[CategoryTreeResponse, Tuple[CategoryTreeResponse, int], Tuple[CategoryTreeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_category(version, account_id, category_id):  # noqa: E501
    """Delete Category

    Delete a category. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the ID of the account
    :type account_id: int
    :param category_id: the ID of the category
    :type category_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def duplicate_category(version, account_id, category_id, app_key=None, parent_category_id=None):  # noqa: E501
    """Duplicate Category

    Duplicate a category, including all its children. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user (must have permissions to the target application)
    :type account_id: int
    :param category_id: The category ID to duplicate (includes all children)
    :type category_id: int
    :param app_key: The application to assign the new category to, may be different then the application the source category is assigned to
    :type app_key: str
    :param parent_category_id: The parent category ID to add the target category to.
    :type parent_category_id: int

    :rtype: Union[CategoryTreeResponse, Tuple[CategoryTreeResponse, int], Tuple[CategoryTreeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_category(version, category_id, return_external=None):  # noqa: E501
    """Get Category

    Get the details of a specific category. Recursively include all child categories and their children. # noqa: E501

    :param version: 
    :type version: 
    :param category_id: the ID of the category
    :type category_id: int
    :param return_external: Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    :type return_external: bool

    :rtype: Union[CategoryTreeResponse, Tuple[CategoryTreeResponse, int], Tuple[CategoryTreeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_categories(version, account_id=None, keyword=None, app_key=None, category_id=None, category_ids=None, parent_category_ids=None, root_only=None, sort_field=None, response_group=None, descending=None, start=None, limit=None, active_only=None, return_external=None, exact_match=None, type=None, external_type=None, exclude_external_type=None, min_offer_count=None, search_depth=None, search_mode=None):  # noqa: E501
    """Search Categories

    Search for categories. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param keyword: The string to search on
    :type keyword: str
    :param app_key: the appKey of the application to retrieve categories for, if not specified then search on the global application.
    :type app_key: str
    :param category_id: @Deprecated, use parentCategoryIds instead
    :type category_id: str
    :param category_ids: Restrict the search by specific categories
    :type category_ids: str
    :param parent_category_ids: Restrict the search by specific parent categories so that only its sub children are searched.
    :type parent_category_ids: str
    :param root_only: Restrict the search to only those categories with no parent category assigned.
    :type root_only: bool
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    :type sort_field: str
    :param response_group: The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    :type response_group: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param active_only: Determines whether to return only active categories
    :type active_only: bool
    :param return_external: Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    :type return_external: bool
    :param exact_match: If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.
    :type exact_match: bool
    :param type: Filters results by the Category&#39;s type
    :type type: str
    :param external_type: Filters results by externalType
    :type external_type: str
    :param exclude_external_type: Determines whether the \&quot;externalType\&quot; param is excluded from the search results
    :type exclude_external_type: bool
    :param min_offer_count: Filters results to only return Categories that have been referenced by a minimum number of Offers
    :type min_offer_count: int
    :param search_depth: When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.
    :type search_depth: int
    :param search_mode: The search index mode to use (e.g. OPENSEARCH or RDS)
    :type search_mode: str

    :rtype: Union[List[CategoryResponse], Tuple[List[CategoryResponse], int], Tuple[List[CategoryResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_category(version, account_id, category_id, parent_category_id=None, name=None, description=None, type=None, asset_id=None, external_id=None, external_type=None, external_category_slug=None, sqoot_slug=None, active=None, meta_data=None, search_tags=None):  # noqa: E501
    """Update Category

    Update a category. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param category_id: The ID of the category to edit
    :type category_id: int
    :param parent_category_id: The ID of the parent category, if not provided then the parent category will be null
    :type parent_category_id: int
    :param name: The name of the category
    :type name: str
    :param description: The description of the category
    :type description: str
    :param type: The type of the category
    :type type: str
    :param asset_id: The ID of the image asset previously uploaded using the media service
    :type asset_id: int
    :param external_id: A string identifier used by client applications to store external information
    :type external_id: str
    :param external_type: A string type used by client applications to store external information
    :type external_type: str
    :param external_category_slug: external category slug
    :type external_category_slug: str
    :param sqoot_slug: sqoot slug
    :type sqoot_slug: str
    :param active: Sets whether the category is active or inactive (hidden from consumers)
    :type active: bool
    :param meta_data: external custom client defined data
    :type meta_data: str
    :param search_tags: user defined strings for searching
    :type search_tags: str

    :rtype: Union[CategoryTreeResponse, Tuple[CategoryTreeResponse, int], Tuple[CategoryTreeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
