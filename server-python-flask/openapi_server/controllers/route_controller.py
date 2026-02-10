import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.direction import Direction  # noqa: E501
from openapi_server.models.route import Route  # noqa: E501
from openapi_server.models.shipment import Shipment  # noqa: E501
from openapi_server.models.stop import Stop  # noqa: E501
from openapi_server import util


def approve_route(version, route_id):  # noqa: E501
    """Approve Route

    Approve a route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to approve
    :type route_id: int

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    return 'do some magic!'


def copy_route(version, route_id, body=None):  # noqa: E501
    """Copy Route

    Make an copy of the given route with optional overriding properties # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to duplicate
    :type route_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Route.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_route(version, body=None):  # noqa: E501
    """Create Route

    Create new route # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Route.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_route_directions(version, route_id):  # noqa: E501
    """Update Route Directions

    Regenerate the directions of a route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to update directions for
    :type route_id: int

    :rtype: Union[List[Direction], Tuple[List[Direction], int], Tuple[List[Direction], int, Dict[str, str]]
    """
    return 'do some magic!'


def create_route_polyline(version, route_id):  # noqa: E501
    """Create Route Polyline

    Update the polyline of the requested route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to create a polyline for
    :type route_id: int

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_route(version, route_id):  # noqa: E501
    """Delete Route

    Delete an existing route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def disapprove_route(version, route_id):  # noqa: E501
    """Disapprove Route

    Disapprove a route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to reject
    :type route_id: int

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_route(version, route_id, show_inherited_properties):  # noqa: E501
    """Get Route

    Get an existing route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to get
    :type route_id: int
    :param show_inherited_properties: return inherited properties from parent or not
    :type show_inherited_properties: bool

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_route_directions(version, route_id):  # noqa: E501
    """Get Route Directions

    Get the directions of a route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to get directions for
    :type route_id: int

    :rtype: Union[List[Direction], Tuple[List[Direction], int], Tuple[List[Direction], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_route_shipments(version, route_id):  # noqa: E501
    """Get Route Shipments

    Get the shipments on the requested route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to get shipments for
    :type route_id: int

    :rtype: Union[List[Shipment], Tuple[List[Shipment], int], Tuple[List[Shipment], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_route_stop(version, route_id, stop_id):  # noqa: E501
    """Get Route Stop

    Get the specific stop on a route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to get stops for
    :type route_id: int
    :param stop_id: the id of the specific stop on the route
    :type stop_id: int

    :rtype: Union[Stop, Tuple[Stop, int], Tuple[Stop, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_route_stops(version, route_id, confirmed_only):  # noqa: E501
    """Get Route Stops

    The stops of the route requested # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int
    :param confirmed_only: only get stops that have been confirmed or not
    :type confirmed_only: bool

    :rtype: Union[List[Stop], Tuple[List[Stop], int], Tuple[List[Stop], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_shipments_at_stop(version, route_id, stop_id):  # noqa: E501
    """Get Shipments At Stop

    Get the list of shipments on the requested route at a stop # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int
    :param stop_id: the id of the stop to get shipments on
    :type stop_id: int

    :rtype: Union[List[Shipment], Tuple[List[Shipment], int], Tuple[List[Shipment], int, Dict[str, str]]
    """
    return 'do some magic!'


def optimize_route(version, route_id):  # noqa: E501
    """Optimize Route

    Optimize a route. The optimization method based on how the server is configured. # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to optimize
    :type route_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_stop(version, route_id, stop_id):  # noqa: E501
    """Delete Stop

    Delete a stop on a route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int
    :param stop_id: the id of the specific stop to delete on the route
    :type stop_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def reorder_route_stops_patch(version, route_id, body=None):  # noqa: E501
    """Reorder Route Stops

    Reordering the stops on the route with and update route distance, time, direction, and polyline # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int
    :param body: 
    :type body: list | bytes

    :rtype: Union[List[Stop], Tuple[List[Stop], int], Tuple[List[Stop], int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = [Stop.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def reorder_route_stops_post(version, route_id, body=None):  # noqa: E501
    """Reorder Route Stops

    Reordering the stops on the route with and update route distance, time, direction, and polyline # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int
    :param body: 
    :type body: list | bytes

    :rtype: Union[List[Stop], Tuple[List[Stop], int], Tuple[List[Stop], int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = [Stop.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def search_routes(version, sort_field, descending, start, limit, active_only, includes_empty, root_only, show_inherited_properties, hub_id=None, program_id=None, scheduled_start=None, scheduled_end=None, updated_start=None, updated_end=None, featured=None, seat_count=None, approved=None, started=None, completed=None, valid=None, parent_id=None):  # noqa: E501
    """Search Routes

    Search for routes. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[List[Route], Tuple[List[Route], int], Tuple[List[Route], int, Dict[str, str]]
    """
    return 'do some magic!'


def set_driver(version, id, driver_id):  # noqa: E501
    """Set Driver

    Update the driver of the route. # noqa: E501

    :param version: 
    :type version: 
    :param id: the id of the route
    :type id: int
    :param driver_id: the id of the driver
    :type driver_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_route(version, route_id, body=None):  # noqa: E501
    """Update Route

    Update an existing route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route
    :type route_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[Route, Tuple[Route, int], Tuple[Route, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Route.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_route_stop(version, route_id, stop_id, body=None):  # noqa: E501
    """Update Route Stop

    Update a stop on a specified route # noqa: E501

    :param version: 
    :type version: 
    :param route_id: the id of the route to update stops for
    :type route_id: int
    :param stop_id: the id of the specific stop to update on the route
    :type stop_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = Stop.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
