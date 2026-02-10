import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.trip import Trip  # noqa: E501
from openapi_server import util


def create_trip(version, body=None):  # noqa: E501
    """Create Trip

    Create a new trip # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Trip.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete(version, id):  # noqa: E501
    """Delete Trip

    Delete an existing trip # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip to delete
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def drive_trip(version, id, recurrence):  # noqa: E501
    """Set Trip Preference Driver

    Update trip preference to drive, also create a route and assign the trip to the route # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip
    :type id: int
    :param recurrence: the frequency of the trip (e.g. weekly, until 2018-08-09)
    :type recurrence: bool

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    return 'do some magic!'


def flexible_trip(version, id, recurrence):  # noqa: E501
    """Set Trip Preference Flexible

    Update trip preference to flexible. # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip
    :type id: int
    :param recurrence: the frequency of the trip (e.g. weekly, until 2018-08-09)
    :type recurrence: bool

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_trip(version, id):  # noqa: E501
    """Get Trip

    Get an existing trip # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip to get
    :type id: int

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_trip_matches(version, id, sort_field, descending, start, limit, active_only, matched_has_route=None, matched_has_driver=None):  # noqa: E501
    """Get Trip Matches

    Get matching trips of specific trip # noqa: E501

    :param version: 
    :type version: 
    :param id: The id The id of the trip to search for matches for
    :type id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param matched_has_route: Only return matchings that already have route assigned
    :type matched_has_route: bool
    :param matched_has_driver: Only return matchings that already have driver assigned
    :type matched_has_driver: bool

    :rtype: Union[List[Trip], Tuple[List[Trip], int], Tuple[List[Trip], int, Dict[str, str]]
    """
    return 'do some magic!'


def process_trip_matches(version, start_date=None, end_date=None, trip_id=None):  # noqa: E501
    """Process Trip Matches

    Process trip matching, assign trips with no route to matched trips with route. # noqa: E501

    :param version: 
    :type version: 
    :param start_date: The lower bound date to process matchings
    :type start_date: int
    :param end_date: The upper bound date to process matchings
    :type end_date: int
    :param trip_id: the id of the trip to process
    :type trip_id: int

    :rtype: Union[List[Trip], Tuple[List[Trip], int], Tuple[List[Trip], int, Dict[str, str]]
    """
    return 'do some magic!'


def ride(version, id, recurrence):  # noqa: E501
    """Set Trip Preference Rider

    Update trip preference to ride. # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip
    :type id: int
    :param recurrence: the frequency of the trip (e.g. weekly, until 2018-08-09)
    :type recurrence: bool

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    return 'do some magic!'


def search(version, account_id, sort_field, descending, start, limit, active_only, start_date=None, end_date=None, has_notifications=None):  # noqa: E501
    """Search Trips

    Search for trips # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The owner of the trips
    :type account_id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param start_date: The lower bound limit of time
    :type start_date: int
    :param end_date: The upper bound limit of time
    :type end_date: int
    :param has_notifications: whether to search on trips that have notifications or not
    :type has_notifications: bool

    :rtype: Union[List[Trip], Tuple[List[Trip], int], Tuple[List[Trip], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_trips(version, account_id, sort_field, descending, start, limit, active_only, start_date=None, end_date=None, matched_has_route=None, matched_has_driver=None):  # noqa: E501
    """Search Trips

    Search for trips with matching information. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The owner of the trips
    :type account_id: int
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool
    :param start_date: The lower bound limit of time
    :type start_date: int
    :param end_date: The upper bound limit of time
    :type end_date: int
    :param matched_has_route: Only return matchings that already have route assigned
    :type matched_has_route: bool
    :param matched_has_driver: Only return matchings that already have driver assigned
    :type matched_has_driver: bool

    :rtype: Union[List[Trip], Tuple[List[Trip], int], Tuple[List[Trip], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_locations(version, id, body=None):  # noqa: E501
    """Update Trip Locations

     # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip to update locations for
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Trip.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_recurrence_locations(version, id, body=None):  # noqa: E501
    """Update Recurrence Locations

     # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[List[Trip], Tuple[List[Trip], int], Tuple[List[Trip], int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Trip.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_recurrence_shipments(version, id, body=None):  # noqa: E501
    """Update Recurrence Shipments

     # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[List[Trip], Tuple[List[Trip], int], Tuple[List[Trip], int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Trip.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_shipments(version, id, body=None):  # noqa: E501
    """Update Trip Shipments

     # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip shipments to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Trip.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_trip(version, id, body=None):  # noqa: E501
    """Update Trip

    Update an existing trip. Does not support recurring trip update. # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Trip.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_trip_notifications(version, id, notifications=None):  # noqa: E501
    """Trip Notifications

    Update the trip notifications # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the trip
    :type id: int
    :param notifications: the notifications to update on the trip
    :type notifications: str

    :rtype: Union[Trip, Tuple[Trip, int], Tuple[Trip, int, Dict[str, str]]
    """
    return 'do some magic!'
