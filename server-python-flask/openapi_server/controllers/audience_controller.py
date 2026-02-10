import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.age_group_response import AgeGroupResponse  # noqa: E501
from openapi_server.models.audience_device_response import AudienceDeviceResponse  # noqa: E501
from openapi_server.models.audience_response import AudienceResponse  # noqa: E501
from openapi_server.models.offer_list_response import OfferListResponse  # noqa: E501
from openapi_server.models.search_response import SearchResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_audience(version, account_id, name, description=None, search_tags=None, gender=None, age_groups=None, category_ids=None, application_ids=None, game_experience_level=None, devices=None, device_ids=None, device_versions=None, locations=None, radius=None, start_time_offset=None, end_time_offset=None, send_suggestion=None, associate_description=None, associate_type=None, associate_id=None, grouping_id=None, meta_data=None, visibility=None, audience_type=None, use_order=None, cohort_regions_data=None, app_key=None, trilateration_types=None, unique_name=None):  # noqa: E501
    """Create Audience

    Create a user defined audience. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the audience
    :type name: str
    :param description: The description of the audience
    :type description: str
    :param search_tags: The search tags
    :type search_tags: str
    :param gender: The gender; possible values are: MALE, FEMALE, ANY
    :type gender: str
    :param age_groups: The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)
    :type age_groups: str
    :param category_ids: The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)
    :type category_ids: str
    :param application_ids: The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)
    :type application_ids: str
    :param game_experience_level: The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    :type game_experience_level: str
    :param devices: (Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)
    :type devices: str
    :param device_ids: The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)
    :type device_ids: str
    :param device_versions: The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)
    :type device_versions: str
    :param locations: The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)
    :type locations: str
    :param radius: The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.
    :type radius: str
    :param start_time_offset: Seconds from the start time of an event
    :type start_time_offset: int
    :param end_time_offset: Seconds from the end time of an event
    :type end_time_offset: int
    :param send_suggestion: If true, then notify matching users when they are inside the radius
    :type send_suggestion: bool
    :param associate_description: The description of the associated object
    :type associate_description: str
    :param associate_type: The type of the object to center the audience geofence
    :type associate_type: str
    :param associate_id: The ID of the object to center the audience geofence
    :type associate_id: int
    :param grouping_id: Optional grouping id for the audience
    :type grouping_id: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param visibility: Visibility of the audience
    :type visibility: str
    :param audience_type: Type of audience
    :type audience_type: str
    :param use_order: Use order for cohort
    :type use_order: bool
    :param cohort_regions_data: Cohort data for \&quot;cohort\&quot; audience type
    :type cohort_regions_data: str
    :param app_key: Filter results by application key
    :type app_key: str
    :param trilateration_types: Trilateration types
    :type trilateration_types: str
    :param unique_name: If true, makes sure the audience name is unique
    :type unique_name: bool

    :rtype: Union[AudienceResponse, Tuple[AudienceResponse, int], Tuple[AudienceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_audience(version, account_id, audience_id):  # noqa: E501
    """Delete Audience

    Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param audience_id: The id of the audience to delete.
    :type audience_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_age_groups(version):  # noqa: E501
    """Get Age Groups

    Gets the list of available age groups that can be selected by consumers and retailers targeting offers. # noqa: E501

    :param version: 
    :type version: 

    :rtype: Union[List[AgeGroupResponse], Tuple[List[AgeGroupResponse], int], Tuple[List[AgeGroupResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_audience(version, account_id, audience_id, app_key=None, return_account_count=None, return_album_count=None, album_types_for_count=None):  # noqa: E501
    """Get Audience

    Get an audience. The audience and account must be valid and have the appropriate permissions to view the content. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param audience_id: The id of the audience to return.
    :type audience_id: int
    :param app_key: The application key (optional). If provided, results may be scoped to this application.
    :type app_key: str
    :param return_account_count: (boolean) set to true to include the accountCount associated with current audience of the current app
    :type return_account_count: bool
    :param return_album_count: (boolean) set to true to include the albumCount associated with current audience of the current app
    :type return_album_count: bool
    :param album_types_for_count: (String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.
    :type album_types_for_count: str

    :rtype: Union[AudienceResponse, Tuple[AudienceResponse, int], Tuple[AudienceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_audience_list(version, account_id=None, album_ids=None, keyword=None, keyword_fields=None, sort_field=None, descending=None, start=None, limit=None, send_suggestion=None, active_only=None, group_by_grouping_id=None, app_key=None, return_global=None, exact_keyword=None, audience_type=None, audience_types=None, return_account_count=None, return_album_count=None, album_types_for_count=None):  # noqa: E501
    """Search Audiences

    Get the list audiences owned by the account # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param album_ids: Comma separated list of album IDs to filter results with
    :type album_ids: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param keyword_fields: Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY
    :type keyword_fields: str
    :param sort_field: The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}
    :type sort_field: str
    :param descending: The order to return the results. Default is false, which will return the results in ascending order.
    :type descending: bool
    :param start: The index into the record set to start with.
    :type start: int
    :param limit: The total number of record to return (there is a hard limit of 100).
    :type limit: int
    :param send_suggestion: Filter results based on whether or not the audience is set to send suggestions
    :type send_suggestion: bool
    :param active_only: Determines whether to return only active results. Default is false.
    :type active_only: bool
    :param group_by_grouping_id: Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)
    :type group_by_grouping_id: bool
    :param app_key: Filter results by application key
    :type app_key: str
    :param return_global: If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well
    :type return_global: bool
    :param exact_keyword: If true, match keyword exactly
    :type exact_keyword: bool
    :param audience_type: (Deprecated) Filter results by audience type
    :type audience_type: str
    :param audience_types: comma separated string with the different audience types you want to filter for
    :type audience_types: str
    :param return_account_count: (boolean) set to true to include the accountCount associated with current audience of the current app
    :type return_account_count: bool
    :param return_album_count: (boolean) set to true to include the albumCount associated with current audience of the current app
    :type return_album_count: bool
    :param album_types_for_count: (String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.
    :type album_types_for_count: str

    :rtype: Union[List[SearchResponse], Tuple[List[SearchResponse], int], Tuple[List[SearchResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_devices(version, include_inactive):  # noqa: E501
    """Get Devices

    Gets the list of available devices that can be selected by consumers and retailers. # noqa: E501

    :param version: 
    :type version: 
    :param include_inactive: If true return inactive record as well. default is false.
    :type include_inactive: bool

    :rtype: Union[List[AudienceDeviceResponse], Tuple[List[AudienceDeviceResponse], int], Tuple[List[AudienceDeviceResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_experiences(version):  # noqa: E501
    """Get Experiences

    Gets the list of available experiences that can be selected by consumers and retailers. # noqa: E501

    :param version: 
    :type version: 

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_grouped_audiences(version, account_id, audience_grouping_id):  # noqa: E501
    """Get GroupedAudiences

    Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param audience_grouping_id: The audience grouping id to return.
    :type audience_grouping_id: str

    :rtype: Union[AudienceResponse, Tuple[AudienceResponse, int], Tuple[AudienceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_by_account(version, account_id, limit, suggestion_type):  # noqa: E501
    """List Suggestions by Audience

    List either Missions or Offers that the user matches the assigned audience. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account to match offers for.
    :type account_id: int
    :param limit: the limit of the index
    :type limit: int
    :param suggestion_type: the type of suggestion
    :type suggestion_type: str

    :rtype: Union[OfferListResponse, Tuple[OfferListResponse, int], Tuple[OfferListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_by_audience(version, limit, gender=None, age=None, category_ids=None, latitude=None, longitude=None):  # noqa: E501
    """List Offers by Audience

    Get a list of offer locations based on audience information provided. # noqa: E501

    :param version: 
    :type version: 
    :param limit: this is the limit of the index
    :type limit: int
    :param gender: this is the gender to list offers by
    :type gender: str
    :param age: this is the age to list offers by
    :type age: int
    :param category_ids: this is the category IDs to list offers by
    :type category_ids: str
    :param latitude: this is the latitude to list offers by
    :type latitude: float
    :param longitude: this is the longitude to list offers by
    :type longitude: float

    :rtype: Union[OfferListResponse, Tuple[OfferListResponse, int], Tuple[OfferListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_lastest_by_account(version, account_id, timeframe, suggestion_type):  # noqa: E501
    """List Sent Suggestions 

    Return list of recent trigger suggestions that have been sent to the user. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account to match offers for.
    :type account_id: int
    :param timeframe: The timeframe in seconds of the latest suggestions
    :type timeframe: int
    :param suggestion_type: The type of trigger suggestions to return
    :type suggestion_type: str

    :rtype: Union[OfferListResponse, Tuple[OfferListResponse, int], Tuple[OfferListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_by_account(version, account_id, latitude, longitude):  # noqa: E501
    """Send Suggestions

    Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account to match offers for.
    :type account_id: int
    :param latitude: the latitude
    :type latitude: float
    :param longitude: the longitude
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_audience(version, account_id, audience_id, name=None, description=None, search_tags=None, gender=None, age_groups=None, category_ids=None, application_ids=None, game_experience_level=None, devices=None, device_ids=None, device_versions=None, locations=None, radius=None, active=None, send_suggestion=None, start_time_offset=None, end_time_offset=None, associate_description=None, associate_type=None, associate_id=None, grouping_id=None, meta_data=None, visibility=None, audience_type=None, use_order=None, cohort_regions_data=None, app_key=None, trilateration_types=None, unique_name=None):  # noqa: E501
    """Update Audience

    Update a user defined audience. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param audience_id: The id of the audience to update.
    :type audience_id: int
    :param name: The name of the audience
    :type name: str
    :param description: The description of the audience
    :type description: str
    :param search_tags: The search tags
    :type search_tags: str
    :param gender: The gender; possible values are: MALE, FEMALE, ANY
    :type gender: str
    :param age_groups: The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)
    :type age_groups: str
    :param category_ids: The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)
    :type category_ids: str
    :param application_ids: The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)
    :type application_ids: str
    :param game_experience_level: The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    :type game_experience_level: str
    :param devices: (Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)
    :type devices: str
    :param device_ids: The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)
    :type device_ids: str
    :param device_versions: The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)
    :type device_versions: str
    :param locations: The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)
    :type locations: str
    :param radius: The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.
    :type radius: str
    :param active: if audience is active
    :type active: bool
    :param send_suggestion: If true, then notify matching users when they are inside the radius
    :type send_suggestion: bool
    :param start_time_offset: Seconds from the start time of an event
    :type start_time_offset: int
    :param end_time_offset: Seconds from the end time of an event
    :type end_time_offset: int
    :param associate_description: the associate description
    :type associate_description: str
    :param associate_type: The type of the object to center the audience geofence
    :type associate_type: str
    :param associate_id: The ID of the object to center the audience geofence
    :type associate_id: int
    :param grouping_id: Optional grouping id for the audience
    :type grouping_id: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param visibility: Visibility of the audience
    :type visibility: str
    :param audience_type: Type of audience
    :type audience_type: str
    :param use_order: Use order for cohort
    :type use_order: bool
    :param cohort_regions_data: Cohort data for \&quot;cohort\&quot; audience type
    :type cohort_regions_data: str
    :param app_key: Filter results by application key
    :type app_key: str
    :param trilateration_types: Trilateration types
    :type trilateration_types: str
    :param unique_name: If true, makes sure the audience name is unique
    :type unique_name: bool

    :rtype: Union[AudienceResponse, Tuple[AudienceResponse, int], Tuple[AudienceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
