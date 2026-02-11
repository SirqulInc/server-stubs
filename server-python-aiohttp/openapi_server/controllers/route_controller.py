from typing import List, Dict
from aiohttp import web

from openapi_server.models.direction import Direction
from openapi_server.models.route import Route
from openapi_server.models.shipment import Shipment
from openapi_server.models.stop import Stop
from openapi_server import util


async def approve_route(request: web.Request, route_id) -> web.Response:
    """Approve Route

    Approve a route

    :param route_id: the id of the route to approve
    :type route_id: int

    """
    return web.Response(status=200)


async def copy_route(request: web.Request, route_id, body=None) -> web.Response:
    """Copy Route

    Make an copy of the given route with optional overriding properties

    :param route_id: the id of the route to duplicate
    :type route_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Route.from_dict(body)
    return web.Response(status=200)


async def create_route(request: web.Request, body=None) -> web.Response:
    """Create Route

    Create new route

    :param body: 
    :type body: dict | bytes

    """
    body = Route.from_dict(body)
    return web.Response(status=200)


async def create_route_directions(request: web.Request, route_id) -> web.Response:
    """Update Route Directions

    Regenerate the directions of a route

    :param route_id: the id of the route to update directions for
    :type route_id: int

    """
    return web.Response(status=200)


async def create_route_polyline(request: web.Request, route_id) -> web.Response:
    """Create Route Polyline

    Update the polyline of the requested route

    :param route_id: the id of the route to create a polyline for
    :type route_id: int

    """
    return web.Response(status=200)


async def delete_route(request: web.Request, route_id) -> web.Response:
    """Delete Route

    Delete an existing route

    :param route_id: the id of the route
    :type route_id: int

    """
    return web.Response(status=200)


async def disapprove_route(request: web.Request, route_id) -> web.Response:
    """Disapprove Route

    Disapprove a route

    :param route_id: the id of the route to reject
    :type route_id: int

    """
    return web.Response(status=200)


async def get_route(request: web.Request, route_id, show_inherited_properties) -> web.Response:
    """Get Route

    Get an existing route

    :param route_id: the id of the route to get
    :type route_id: int
    :param show_inherited_properties: return inherited properties from parent or not
    :type show_inherited_properties: bool

    """
    return web.Response(status=200)


async def get_route_directions(request: web.Request, route_id) -> web.Response:
    """Get Route Directions

    Get the directions of a route

    :param route_id: the id of the route to get directions for
    :type route_id: int

    """
    return web.Response(status=200)


async def get_route_shipments(request: web.Request, route_id) -> web.Response:
    """Get Route Shipments

    Get the shipments on the requested route

    :param route_id: the id of the route to get shipments for
    :type route_id: int

    """
    return web.Response(status=200)


async def get_route_stop(request: web.Request, route_id, stop_id) -> web.Response:
    """Get Route Stop

    Get the specific stop on a route

    :param route_id: the id of the route to get stops for
    :type route_id: int
    :param stop_id: the id of the specific stop on the route
    :type stop_id: int

    """
    return web.Response(status=200)


async def get_route_stops(request: web.Request, route_id, confirmed_only) -> web.Response:
    """Get Route Stops

    The stops of the route requested

    :param route_id: the id of the route
    :type route_id: int
    :param confirmed_only: only get stops that have been confirmed or not
    :type confirmed_only: bool

    """
    return web.Response(status=200)


async def get_shipments_at_stop(request: web.Request, route_id, stop_id) -> web.Response:
    """Get Shipments At Stop

    Get the list of shipments on the requested route at a stop

    :param route_id: the id of the route
    :type route_id: int
    :param stop_id: the id of the stop to get shipments on
    :type stop_id: int

    """
    return web.Response(status=200)


async def optimize_route(request: web.Request, route_id) -> web.Response:
    """Optimize Route

    Optimize a route. The optimization method based on how the server is configured.

    :param route_id: the id of the route to optimize
    :type route_id: int

    """
    return web.Response(status=200)


async def remove_stop(request: web.Request, route_id, stop_id) -> web.Response:
    """Delete Stop

    Delete a stop on a route

    :param route_id: the id of the route
    :type route_id: int
    :param stop_id: the id of the specific stop to delete on the route
    :type stop_id: int

    """
    return web.Response(status=200)


async def reorder_route_stops_patch(request: web.Request, route_id, body=None) -> web.Response:
    """Reorder Route Stops

    Reordering the stops on the route with and update route distance, time, direction, and polyline

    :param route_id: the id of the route
    :type route_id: int
    :param body: 
    :type body: list | bytes

    """
    body = [Stop.from_dict(d) for d in body]
    return web.Response(status=200)


async def reorder_route_stops_post(request: web.Request, route_id, body=None) -> web.Response:
    """Reorder Route Stops

    Reordering the stops on the route with and update route distance, time, direction, and polyline

    :param route_id: the id of the route
    :type route_id: int
    :param body: 
    :type body: list | bytes

    """
    body = [Stop.from_dict(d) for d in body]
    return web.Response(status=200)


async def search_routes(request: web.Request, sort_field, descending, start, limit, active_only, includes_empty, root_only, show_inherited_properties, hub_id=None, program_id=None, scheduled_start=None, scheduled_end=None, updated_start=None, updated_end=None, featured=None, seat_count=None, approved=None, started=None, completed=None, valid=None, parent_id=None) -> web.Response:
    """Search Routes

    Search for routes.

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
    :param includes_empty: Include empty routes or not
    :type includes_empty: bool
    :param root_only: Only return root instance routes
    :type root_only: bool
    :param show_inherited_properties: Display root route properties
    :type show_inherited_properties: bool
    :param hub_id: Filter results by service hub
    :type hub_id: int
    :param program_id: Filter results by program
    :type program_id: int
    :param scheduled_start: The start date to filter the results by
    :type scheduled_start: int
    :param scheduled_end: The end date to filter the results by
    :type scheduled_end: int
    :param updated_start: The lower bound of updated date
    :type updated_start: int
    :param updated_end: The upper bound of updated date
    :type updated_end: int
    :param featured: The route is featured or not
    :type featured: bool
    :param seat_count: Has at least this many seat available
    :type seat_count: int
    :param approved: Has been approved or not
    :type approved: bool
    :param started: Has started or not
    :type started: bool
    :param completed: Has completed or not
    :type completed: bool
    :param valid: Is valid or not
    :type valid: bool
    :param parent_id: If it is a recurring route based on the parent route
    :type parent_id: int

    """
    return web.Response(status=200)


async def set_driver(request: web.Request, id, driver_id) -> web.Response:
    """Set Driver

    Update the driver of the route.

    :param id: the id of the route
    :type id: int
    :param driver_id: the id of the driver
    :type driver_id: int

    """
    return web.Response(status=200)


async def update_route(request: web.Request, route_id, body=None) -> web.Response:
    """Update Route

    Update an existing route

    :param route_id: the id of the route
    :type route_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Route.from_dict(body)
    return web.Response(status=200)


async def update_route_stop(request: web.Request, route_id, stop_id, body=None) -> web.Response:
    """Update Route Stop

    Update a stop on a specified route

    :param route_id: the id of the route to update stops for
    :type route_id: int
    :param stop_id: the id of the specific stop to update on the route
    :type stop_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = Stop.from_dict(body)
    return web.Response(status=200)
