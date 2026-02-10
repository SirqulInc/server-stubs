import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.chart_data import ChartData  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.user_activity_response import UserActivityResponse  # noqa: E501
from openapi_server import util


def activities(version, start, limit, account_id):  # noqa: E501
    """Get User Activity

    Get an activity feed by user. # noqa: E501

    :param version: 
    :type version: 
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int
    :param account_id: the account id of the user
    :type account_id: int

    :rtype: Union[List[UserActivityResponse], Tuple[List[UserActivityResponse], int], Tuple[List[UserActivityResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def aggregated_filtered_usage(version, device_id=None, account_id=None, application_id=None, app_key=None, start_date=None, end_date=None, device_type=None, device=None, device_os=None, gender=None, age_group=None, country=None, state=None, city=None, zip=None, model=None, tag=None, user_account_id=None, user_account_display=None, user_account_username=None, group_by_root=None, group_by=None, distinct_count=None, sort_field=None, descending=None, hide_unknown=None, response_format=None, l=None, limit=None, latitude=None, longitude=None):  # noqa: E501
    """Get Aggregated Filtered Usage

    Query analytics to get data used for nested graphs and charts # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param application_id: This parameter is deprecated.
    :type application_id: int
    :param app_key: The application key used to filter results by application
    :type app_key: str
    :param start_date: Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)
    :type start_date: int
    :param end_date: Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)
    :type end_date: int
    :param device_type: The device type to filter results by (performs a LIKE search)
    :type device_type: str
    :param device: The device to filter results by (performs a LIKE search)
    :type device: str
    :param device_os: The device OS to filter results by (performs a LIKE search)
    :type device_os: str
    :param gender: The gender to filter results by {MALE, FEMALE}
    :type gender: str
    :param age_group: Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}
    :type age_group: str
    :param country: The country to filter results by (performs a wild-card search)
    :type country: str
    :param state: The state to filter results by (performs a wild-card search)
    :type state: str
    :param city: The city to filter results by (performs a wild-card search)
    :type city: str
    :param zip: The zip to filter results by (performs a wild-card search)
    :type zip: str
    :param model: The model to filter results by (performs a wild-card search)
    :type model: str
    :param tag: The tag to filter results by (performs a wild-card search)
    :type tag: str
    :param user_account_id: The account id to filter results for a particular user
    :type user_account_id: int
    :param user_account_display: The user display to filter results by (performs a wild-card search)
    :type user_account_display: str
    :param user_account_username: The username to filter results by (performs a wild-card search)
    :type user_account_username: str
    :param group_by_root: Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}
    :type group_by_root: str
    :param group_by: Determines how to group the nested data. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}
    :type group_by: str
    :param distinct_count: Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, NEW_ACCOUNT}
    :type distinct_count: str
    :param sort_field: Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}
    :type sort_field: str
    :param descending: Determines whether to return results in descending order
    :type descending: bool
    :param hide_unknown: Determines whether to return data that has empty or unknown values
    :type hide_unknown: bool
    :param response_format: Determines whether to return a JOSN or XML representation of the graph results
    :type response_format: str
    :param l: This parameter is deprecated.
    :type l: int
    :param limit: Used to limit results to get a cleaner graph. The results that gets filtered out will be combined
    :type limit: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[ChartData, Tuple[ChartData, int], Tuple[ChartData, int, Dict[str, str]]
    """
    return 'do some magic!'


def filtered_usage(version, device_id=None, account_id=None, application_id=None, app_key=None, start_date=None, end_date=None, device_type=None, device=None, device_os=None, gender=None, age_group=None, country=None, state=None, city=None, zip=None, model=None, tag=None, user_account_id=None, user_account_display=None, user_account_username=None, custom_id=None, custom_type=None, custom_value=None, custom_value2=None, custom_long=None, custom_long2=None, custom_message=None, custom_message2=None, group_by=None, distinct_count=None, sum_column=None, sort_field=None, descending=None, hide_unknown=None, response_format=None, l=None, limit=None, latitude=None, longitude=None):  # noqa: E501
    """Get Filtered Usage

    Query analytics to get data used for graphs and charts # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param application_id: This parameter is deprecated.
    :type application_id: int
    :param app_key: The application key used to filter results by application
    :type app_key: str
    :param start_date: Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)
    :type start_date: int
    :param end_date: Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)
    :type end_date: int
    :param device_type: The device type to filter results by (performs a LIKE search)
    :type device_type: str
    :param device: The device to filter results by (performs a LIKE search)
    :type device: str
    :param device_os: The device OS to filter results by (performs a LIKE search)
    :type device_os: str
    :param gender: The gender to filter results by {MALE, FEMALE}
    :type gender: str
    :param age_group: Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}
    :type age_group: str
    :param country: The country to filter results by (performs a wild-card search)
    :type country: str
    :param state: The state to filter results by (performs a wild-card search)
    :type state: str
    :param city: The city to filter results by (performs a wild-card search)
    :type city: str
    :param zip: The zip to filter results by (performs a wild-card search)
    :type zip: str
    :param model: The model to filter results by (performs a wild-card search)
    :type model: str
    :param tag: The tag to filter results by (performs a wild-card search)
    :type tag: str
    :param user_account_id: The account id to filter results for a particular user
    :type user_account_id: int
    :param user_account_display: The user display to filter results by (performs a wild-card search)
    :type user_account_display: str
    :param user_account_username: The username to filter results by (performs a wild-card search)
    :type user_account_username: str
    :param custom_id: The ID for the custom table column
    :type custom_id: int
    :param custom_type: The type defined for the custom table column
    :type custom_type: str
    :param custom_value: The value for the custom table column
    :type custom_value: float
    :param custom_value2: The value for another custom table column
    :type custom_value2: float
    :param custom_long: The value that supports Longs for custom table column
    :type custom_long: int
    :param custom_long2: The value that supports Longs for custom table column
    :type custom_long2: int
    :param custom_message: The message for the custom table column
    :type custom_message: str
    :param custom_message2: The message for the custom table column
    :type custom_message2: str
    :param group_by: Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}
    :type group_by: str
    :param distinct_count: Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}
    :type distinct_count: str
    :param sum_column: sum of the column values
    :type sum_column: str
    :param sort_field: Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}
    :type sort_field: str
    :param descending: Determines whether to return results in descending order
    :type descending: bool
    :param hide_unknown: Determines whether to return data that has empty or unknown values
    :type hide_unknown: bool
    :param response_format: Determines whether to return a JOSN or XML representation of the graph results
    :type response_format: str
    :param l: This parameter is deprecated.
    :type l: int
    :param limit: Used to limit results to get a cleaner graph. The results that gets filtered out will be combined
    :type limit: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[ChartData, Tuple[ChartData, int], Tuple[ChartData, int, Dict[str, str]]
    """
    return 'do some magic!'


def usage(version, tag, device_id=None, account_id=None, application_id=None, app_key=None, app_version=None, device=None, device_type=None, device_os=None, model=None, latitude=None, longitude=None, custom_id=None, custom_type=None, achievement_increment=None, city=None, state=None, country=None, zip=None, location_description=None, client_time=None, error_message=None, ip=None, user_agent=None, background_event=None, custom_message=None, custom_message2=None, custom_value=None, custom_value2=None, custom_long=None, custom_long2=None):  # noqa: E501
    """Create Usage Record

    Record an analytic record for a known state within the application. # noqa: E501

    :param version: 
    :type version: 
    :param tag: The tag to apply: the name of the action or thing being logged.
    :type tag: str
    :param device_id: The client deviceID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param application_id: This parameter is deprecated. This is deprecated, use appKey.
    :type application_id: int
    :param app_key: The application key unique to each application.
    :type app_key: str
    :param app_version: The current build version of the application
    :type app_version: str
    :param device: The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)
    :type device: str
    :param device_type: The type of device (Handheld or Desktop)
    :type device_type: str
    :param device_os: The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc)
    :type device_os: str
    :param model: The model of the device (iPhone5,1 , Nexus One, etc.)
    :type model: str
    :param latitude: The current position of the user
    :type latitude: float
    :param longitude: The current position of the user
    :type longitude: float
    :param custom_id: A customId used to associate the usage record with some other record in the system
    :type custom_id: int
    :param custom_type: The type of record the customId is recorded for
    :type custom_type: str
    :param achievement_increment: This parameter is deprecated. This is deprecated, use \&quot;customValue\&quot;. Determines how many achievement points and/or ranking points the user gets if this analytic is associated with an achievement
    :type achievement_increment: int
    :param city: The current city of the user
    :type city: str
    :param state: The current state of the user
    :type state: str
    :param country: The current country of the user
    :type country: str
    :param zip: The current zip of the user
    :type zip: str
    :param location_description: The general description of the user&#39;s location
    :type location_description: str
    :param client_time: Timestamp sent from device
    :type client_time: int
    :param error_message: This parameter is deprecated.
    :type error_message: str
    :param ip: the ip address of the client device
    :type ip: str
    :param user_agent: this is a description of the client (might contain the device&#39;s OS, browser version etc - its a common term)
    :type user_agent: str
    :param background_event: This is deprecated.
    :type background_event: bool
    :param custom_message: a custom message for the usage record
    :type custom_message: str
    :param custom_message2: a custom message for the usage record
    :type custom_message2: str
    :param custom_value: a custom value for the usage record
    :type custom_value: float
    :param custom_value2: a custom value for the usage record
    :type custom_value2: float
    :param custom_long: a custom long value for the usage record
    :type custom_long: int
    :param custom_long2: a custom long value for the usage record
    :type custom_long2: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def usage_batch(version, app_key, device, data, device_id=None, account_id=None, app_version=None, device_type=None, device_os=None, model=None, update_ranking=None, return_summary_response=None):  # noqa: E501
    """Create Multiple Usage Records

    Sends multiple analytics. Can be used to send in the user&#39;s stored usage when they did not have internet access. Should not include more than 100 items per batch. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key unique to each application.
    :type app_key: str
    :param device: The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)
    :type device: str
    :param data: The analytic data AnalyticListResponse
    :type data: str
    :param device_id: The unique id of the device making the request
    :type device_id: str
    :param account_id: The account ID of the logged in user making the request
    :type account_id: int
    :param app_version: The current build version of the application
    :type app_version: str
    :param device_type: The type of device (Handheld or Desktop)
    :type device_type: str
    :param device_os: The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc.)
    :type device_os: str
    :param model: The model of the device (iPhone5,1 , Nexus One, etc.)
    :type model: str
    :param update_ranking: Will create a leaderboard if one does not exist for the \&quot;tag\&quot; yet
    :type update_ranking: bool
    :param return_summary_response: Returns a summary response of the achievements that have been completed due to the analytics
    :type return_summary_response: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
