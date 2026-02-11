from typing import List, Dict
from aiohttp import web

from openapi_server.models.trip import Trip
from openapi_server import util


async def create_trip(request: web.Request, body=None) -> web.Response:
    """Create Trip

    Create a new trip

    :param body: 
    :type body: dict | bytes

    """
    body = Trip.from_dict(body)
    return web.Response(status=200)


async def delete(request: web.Request, id) -> web.Response:
    """Delete Trip

    Delete an existing trip

    :param id: the id of the trip to delete
    :type id: int

    """
    return web.Response(status=200)


async def drive_trip(request: web.Request, id, recurrence) -> web.Response:
    """Set Trip Preference Driver

    Update trip preference to drive, also create a route and assign the trip to the route

    :param id: the id of the trip
    :type id: int
    :param recurrence: the frequency of the trip (e.g. weekly, until 2018-08-09)
    :type recurrence: bool

    """
    return web.Response(status=200)


async def flexible_trip(request: web.Request, id, recurrence) -> web.Response:
    """Set Trip Preference Flexible

    Update trip preference to flexible.

    :param id: the id of the trip
    :type id: int
    :param recurrence: the frequency of the trip (e.g. weekly, until 2018-08-09)
    :type recurrence: bool

    """
    return web.Response(status=200)


async def get_trip(request: web.Request, id) -> web.Response:
    """Get Trip

    Get an existing trip

    :param id: the id of the trip to get
    :type id: int

    """
    return web.Response(status=200)


async def get_trip_matches(request: web.Request, id, sort_field, descending, start, limit, active_only, matched_has_route=None, matched_has_driver=None) -> web.Response:
    """Get Trip Matches

    Get matching trips of specific trip

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

    """
    return web.Response(status=200)


async def process_trip_matches(request: web.Request, start_date=None, end_date=None, trip_id=None) -> web.Response:
    """Process Trip Matches

    Process trip matching, assign trips with no route to matched trips with route.

    :param start_date: The lower bound date to process matchings
    :type start_date: int
    :param end_date: The upper bound date to process matchings
    :type end_date: int
    :param trip_id: the id of the trip to process
    :type trip_id: int

    """
    return web.Response(status=200)


async def ride(request: web.Request, id, recurrence) -> web.Response:
    """Set Trip Preference Rider

    Update trip preference to ride.

    :param id: the id of the trip
    :type id: int
    :param recurrence: the frequency of the trip (e.g. weekly, until 2018-08-09)
    :type recurrence: bool

    """
    return web.Response(status=200)


async def search(request: web.Request, account_id, sort_field, descending, start, limit, active_only, start_date=None, end_date=None, has_notifications=None) -> web.Response:
    """Search Trips

    Search for trips

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

    """
    return web.Response(status=200)


async def search_trips(request: web.Request, account_id, sort_field, descending, start, limit, active_only, start_date=None, end_date=None, matched_has_route=None, matched_has_driver=None) -> web.Response:
    """Search Trips

    Search for trips with matching information.

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

    """
    return web.Response(status=200)


async def update_locations(request: web.Request, id, body=None) -> web.Response:
    """Update Trip Locations

    

    :param id: the id of the trip to update locations for
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Trip.from_dict(body)
    return web.Response(status=200)


async def update_recurrence_locations(request: web.Request, id, body=None) -> web.Response:
    """Update Recurrence Locations

    

    :param id: the id of the trip
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Trip.from_dict(body)
    return web.Response(status=200)


async def update_recurrence_shipments(request: web.Request, id, body=None) -> web.Response:
    """Update Recurrence Shipments

    

    :param id: the id of the trip
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Trip.from_dict(body)
    return web.Response(status=200)


async def update_shipments(request: web.Request, id, body=None) -> web.Response:
    """Update Trip Shipments

    

    :param id: the id of the trip shipments to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Trip.from_dict(body)
    return web.Response(status=200)


async def update_trip(request: web.Request, id, body=None) -> web.Response:
    """Update Trip

    Update an existing trip. Does not support recurring trip update.

    :param id: the id of the trip to update
    :type id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Trip.from_dict(body)
    return web.Response(status=200)


async def update_trip_notifications(request: web.Request, id, notifications=None) -> web.Response:
    """Trip Notifications

    Update the trip notifications

    :param id: the id of the trip
    :type id: int
    :param notifications: the notifications to update on the trip
    :type notifications: str

    """
    return web.Response(status=200)
