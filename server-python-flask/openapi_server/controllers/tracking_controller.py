import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_mini_response import AccountMiniResponse  # noqa: E501
from openapi_server.models.leg import Leg  # noqa: E501
from openapi_server.models.leg_response import LegResponse  # noqa: E501
from openapi_server.models.predicted_location_response import PredictedLocationResponse  # noqa: E501
from openapi_server.models.preferred_location_response import PreferredLocationResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.step_response import StepResponse  # noqa: E501
from openapi_server import util


def batch_save_tracking(version, data, device_id=None, account_id=None, generate_accounts=None, update_account_locations=None, default_tag=None, slave_uid=None):  # noqa: E501
    """Create Batch Tracking

    Batch create tracking legs # noqa: E501

    :param version: 
    :type version: 
    :param data: JSON array of tracking legs &#x60;&#x60;&#x60;json [   \&quot;distance\&quot;: \&quot;0.08\&quot;,   \&quot;duration\&quot;: \&quot;10000\&quot;,   \&quot;startLatitude\&quot;: \&quot;47.614603\&quot;,   \&quot;startLongitude\&quot;: \&quot;-122.350518\&quot;,   \&quot;endLatitude\&quot;: \&quot;47.614384\&quot;,   \&quot;endLongitude\&quot;: \&quot;-122.349161\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endDate\&quot;: \&quot;1361924020000\&quot;,   \&quot;steps\&quot;: [     {       \&quot;distance\&quot;: \&quot;0.03\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614603\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,       \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614941\&quot;,       \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;endDate\&quot;: \&quot;1361924015000\&quot;     },{       \&quot;distance\&quot;: \&quot;0.05\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614941\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;startDate\&quot;: \&quot;1361924015000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614384\&quot;,       \&quot;endLng\&quot;: \&quot;-122.349161\&quot;,       \&quot;endDate\&quot;: \&quot;1361924020000\&quot;     }   ] ] &#x60;&#x60;&#x60; 
    :type data: str
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param generate_accounts: Whether to generate accounts for tracking entries when the owner does not exist
    :type generate_accounts: bool
    :param update_account_locations: Whether to update the account&#39;s current location from the incoming tracking data
    :type update_account_locations: bool
    :param default_tag: The default tag to apply to incoming legs when no tag is provided
    :type default_tag: str
    :param slave_uid: 
    :type slave_uid: str

    :rtype: Union[List[Leg], Tuple[List[Leg], int], Tuple[List[Leg], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_predicted_locations(version, account_id, latitude=None, longitude=None, date_check=None, hour_check=None, threshold=None, distance_unit=None, search_range=None, sort_order=None):  # noqa: E501
    """Get Predicted Locations

    Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the customer
    :type account_id: int
    :param latitude: latitude to return a more likely result set based on the user&#39;s current location
    :type latitude: float
    :param longitude: longitude to return a more likely result set based on the user&#39;s current location
    :type longitude: float
    :param date_check: Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, the current date will be used.
    :type date_check: int
    :param hour_check: Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.
    :type hour_check: str
    :param threshold: The minimum number matches in 1 hour to be considered a likely location.
    :type threshold: int
    :param distance_unit: Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}
    :type distance_unit: str
    :param search_range: Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.
    :type search_range: float
    :param sort_order: The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}
    :type sort_order: str

    :rtype: Union[PredictedLocationResponse, Tuple[PredictedLocationResponse, int], Tuple[PredictedLocationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_predicted_path(version, account_id, start_step_id, end_step_id):  # noqa: E501
    """Get Tracking Path

    Get the path (lat/long coordinates) between 2 steps previously logged for a customer. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the customer
    :type account_id: int
    :param start_step_id: The stepId to begin from
    :type start_step_id: int
    :param end_step_id: The stepId to end with
    :type end_step_id: int

    :rtype: Union[List[StepResponse], Tuple[List[StepResponse], int], Tuple[List[StepResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_preferred_locations(version, account_id, latitude=None, longitude=None, date_check=None, hour_check=None, sort_field=None, descending=None, start=None, limit=None, search_range=None, distance_unit=None):  # noqa: E501
    """Search Preferred Locations

    Search on preferred locations for a user, which is created when a customer resides in a place for a period of time. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the customer
    :type account_id: int
    :param latitude: latitude to return a more likely result set based on the user&#39;s current location
    :type latitude: float
    :param longitude: longitude to return a more likely result set based on the user&#39;s current location
    :type longitude: float
    :param date_check: Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.
    :type date_check: int
    :param hour_check: Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.
    :type hour_check: str
    :param sort_field: Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param search_range: Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.
    :type search_range: float
    :param distance_unit: Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}
    :type distance_unit: str

    :rtype: Union[List[PreferredLocationResponse], Tuple[List[PreferredLocationResponse], int], Tuple[List[PreferredLocationResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tracking_legs(version, device_id=None, account_id=None, owner_id=None, tracking_device_id=None, start_date=None, end_date=None, tags=None, get_last_point=None):  # noqa: E501
    """Search Tracking

    Retrieve tracking data to be able to show where a user has been. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param owner_id: the account id of the person the user wants to tracking data for
    :type owner_id: int
    :param tracking_device_id: the id of the tracking device
    :type tracking_device_id: str
    :param start_date: the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.
    :type start_date: int
    :param end_date: the end date in (UTC milliseconds) to filter the tracking results
    :type end_date: int
    :param tags: filter results by tag
    :type tags: str
    :param get_last_point: gets the last known location of the user
    :type get_last_point: bool

    :rtype: Union[List[LegResponse], Tuple[List[LegResponse], int], Tuple[List[LegResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def save_tracking_leg(version, start_lat, start_lng, start_date, end_lat, end_lng, end_date, device_id=None, account_id=None, distance=None, duration=None, steps=None, tags=None):  # noqa: E501
    """Create Tracking Leg

    Send tracking points to be able to generate pathing data # noqa: E501

    :param version: 
    :type version: 
    :param start_lat: the latitude of the first point
    :type start_lat: float
    :param start_lng: the longitude of the first point
    :type start_lng: float
    :param start_date: the start date (in UTC milliseconds) of the first point
    :type start_date: int
    :param end_lat: the latitude of the last point
    :type end_lat: float
    :param end_lng: the longitude of the last point
    :type end_lng: float
    :param end_date: the end date (in UTC milliseconds) of the last point
    :type end_date: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param distance: the total distance
    :type distance: float
    :param duration: the total duration
    :type duration: int
    :param steps: JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. &#x60;&#x60;&#x60;json [{   \&quot;distance\&quot;: \&quot;0.03\&quot;,   \&quot;duration\&quot;: \&quot;5000\&quot;,   \&quot;startLat\&quot;: \&quot;47.614603\&quot;,   \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endLat\&quot;: \&quot;47.614941\&quot;,   \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,   \&quot;endDate\&quot;: \&quot;1361924015000\&quot; }] &#x60;&#x60;&#x60; 
    :type steps: str
    :param tags: name the leg for searching
    :type tags: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def save_tracking_step(version, leg_id, start_lat, start_lng, start_date, end_lat, end_lng, end_date, device_id=None, account_id=None, distance=None, duration=None):  # noqa: E501
    """Create Tracking Step

    Send tracking points to be able to generate pathing data # noqa: E501

    :param version: 
    :type version: 
    :param leg_id: the leg to add the step to
    :type leg_id: int
    :param start_lat: the latitude of the first point
    :type start_lat: float
    :param start_lng: the longitude of the first point
    :type start_lng: float
    :param start_date: the start date (in UTC milliseconds) of the first point
    :type start_date: int
    :param end_lat: the latitude of the last point
    :type end_lat: float
    :param end_lng: the longitude of the last point
    :type end_lng: float
    :param end_date: the end date (in UTC milliseconds) of the last point
    :type end_date: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param distance: the total distance
    :type distance: float
    :param duration: the total duration
    :type duration: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_accounts_with_tracking_legs(version, account_id, keyword=None, start_date=None, end_date=None, tags=None, audience_ids=None, latitude=None, longitude=None, range=None, sort_field=None, descending=None, start=None, limit=None, active_only=None):  # noqa: E501
    """List Tracking

    Search for all accounts that have tracking legs data by the given constraints. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int
    :param keyword: Used for LIKE search of first or last name on the acocunt
    :type keyword: str
    :param start_date: Range to begin in UTC milliseconds
    :type start_date: int
    :param end_date: Range to end in UTC milliseconds
    :type end_date: int
    :param tags: Exact match on tag field of Legs&#39;s searchTag
    :type tags: str
    :param audience_ids: 
    :type audience_ids: str
    :param latitude: Origin latitude to perform searching constraints with given range
    :type latitude: float
    :param longitude: Origin longitude to perform searching constraints with given range
    :type longitude: float
    :param range: The radius, in miles, to perform the search for
    :type range: float
    :param sort_field: The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}
    :type sort_field: str
    :param descending: The order to return the results. Default is false, which will return the results in ascending order.
    :type descending: bool
    :param start: The index into the record set to start with. Default is 0.
    :type start: int
    :param limit: The total number of records to return. Default is 20.
    :type limit: int
    :param active_only: Determines whether to return only active results. Default is false.
    :type active_only: bool

    :rtype: Union[List[AccountMiniResponse], Tuple[List[AccountMiniResponse], int], Tuple[List[AccountMiniResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_tracking_legs(version, account_id, app_key, tracking_device_id=None, start_date=None, end_date=None, tags=None, start=None, limit=None):  # noqa: E501
    """Search Tracking (Billable)

    Retrieve tracking data for billable/account scoped queries. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id to search tracking for
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param tracking_device_id: The id of the tracking device
    :type tracking_device_id: str
    :param start_date: The start date in (UTC milliseconds) to filter the tracking results
    :type start_date: int
    :param end_date: The end date in (UTC milliseconds) to filter the tracking results
    :type end_date: int
    :param tags: Filter results by tag
    :type tags: str
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    :rtype: Union[List[LegResponse], Tuple[List[LegResponse], int], Tuple[List[LegResponse], int, Dict[str, str]]
    """
    return 'do some magic!'
