from typing import List, Dict
from aiohttp import web

from openapi_server.models.account_mini_response import AccountMiniResponse
from openapi_server.models.assignment_response import AssignmentResponse
from openapi_server.models.assignment_status_response import AssignmentStatusResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def assigment_assignee_account_search(request: web.Request, account_id, keyword=None) -> web.Response:
    """Search Assignment Assignees

    Search for avaiable users for creating or updating assignment.

    :param account_id: The account id sending the request
    :type account_id: int
    :param keyword: The keyword to filter the returned results
    :type keyword: str

    """
    return web.Response(status=200)


async def assignment_create(request: web.Request, account_id, name, assignee_account_id, description=None, retailer_location_id=None, tags=None, active=None) -> web.Response:
    """Create Assignment

    Create an assignment.

    :param account_id: the user account id
    :type account_id: int
    :param name: the name for the assignment
    :type name: str
    :param assignee_account_id: the account id to assign to
    :type assignee_account_id: int
    :param description: the desciprtion for the assignment
    :type description: str
    :param retailer_location_id: the retailer location id
    :type retailer_location_id: int
    :param tags: the tags
    :type tags: str
    :param active: determines whether the assignment is active or inactive
    :type active: bool

    """
    return web.Response(status=200)


async def assignment_delete(request: web.Request, account_id, assignment_id) -> web.Response:
    """Delete Assignment

    Delete an assignment.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_id: the assignment id
    :type assignment_id: int

    """
    return web.Response(status=200)


async def assignment_get(request: web.Request, account_id, assignment_id) -> web.Response:
    """Get Assignment

    Get the details of an assignment.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_id: the assignment id
    :type assignment_id: int

    """
    return web.Response(status=200)


async def assignment_search(request: web.Request, account_id, sort_field, descending, active_only, start, limit, creator_account_id=None, assignee_account_ids=None, retailer_location_ids=None, current_status_type=None, keyword=None) -> web.Response:
    """Search Assignments

    Search for assignments by the given parameters.

    :param account_id: the account sending the request
    :type account_id: int
    :param sort_field: sort by table field
    :type sort_field: str
    :param descending: return results in descending order or not
    :type descending: bool
    :param active_only: return active results only or not
    :type active_only: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param creator_account_id: the creator of the assignment
    :type creator_account_id: int
    :param assignee_account_ids: filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.
    :type assignee_account_ids: str
    :param retailer_location_ids: filter results by retailer locations
    :type retailer_location_ids: str
    :param current_status_type: filter results by assignment status
    :type current_status_type: str
    :param keyword: filter results by keyword search that matches the assignee, creator, or retailer location name
    :type keyword: str

    """
    return web.Response(status=200)


async def assignment_status_create(request: web.Request, account_id, assignment_id, scheduled_notification_id=None, to_do=None, connection=None, method=None, status=None, closure=None, message=None, follow_up=None, active=None) -> web.Response:
    """Create Assignment Status

    Create an assignment status.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_id: the assignment id
    :type assignment_id: int
    :param scheduled_notification_id: the scheduled notification id for reminders
    :type scheduled_notification_id: int
    :param to_do: the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT
    :type to_do: str
    :param connection: the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED
    :type connection: str
    :param method: the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL
    :type method: str
    :param status: the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED
    :type status: str
    :param closure: the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB
    :type closure: str
    :param message: the message from the assignee
    :type message: str
    :param follow_up: the date to follow up by
    :type follow_up: int
    :param active: determines whether the assignment status is active or inactive
    :type active: bool

    """
    return web.Response(status=200)


async def assignment_status_delete(request: web.Request, account_id, assignment_status_id) -> web.Response:
    """Deletes Assignment Status

    Deletes an assignment status.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_status_id: the assignment status id
    :type assignment_status_id: int

    """
    return web.Response(status=200)


async def assignment_status_get(request: web.Request, account_id, assignment_status_id) -> web.Response:
    """Get Assignment Status

    Get an assignment status.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_status_id: the assignment status id
    :type assignment_status_id: int

    """
    return web.Response(status=200)


async def assignment_status_search(request: web.Request, account_id, sort_field, descending, active_only, start, limit, assignment_id=None, creator_account_id=None, assignee_account_id=None, retailer_location_id=None, status_type=None, keyword=None) -> web.Response:
    """Search Assignment Statuses

    Search on assignment statuses.

    :param account_id: the user account id
    :type account_id: int
    :param sort_field: the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param active_only: determines whether to only return active results
    :type active_only: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int
    :param assignment_id: the assignment id
    :type assignment_id: int
    :param creator_account_id: filter results by the account who created the status
    :type creator_account_id: int
    :param assignee_account_id: filter results by the assignee account
    :type assignee_account_id: int
    :param retailer_location_id: filter results by by retailer location
    :type retailer_location_id: int
    :param status_type: filter results by the status type
    :type status_type: str
    :param keyword: filter results by keyword search
    :type keyword: str

    """
    return web.Response(status=200)


async def assignment_status_update(request: web.Request, account_id, assignment_status_id, scheduled_notification_id=None, to_do=None, connection=None, method=None, status=None, closure=None, message=None, follow_up=None, active=None) -> web.Response:
    """Update Assignment Status

    Updates an assignment status.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_status_id: the assignment status id
    :type assignment_status_id: int
    :param scheduled_notification_id: the scheduled notification id for reminders
    :type scheduled_notification_id: int
    :param to_do: the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT
    :type to_do: str
    :param connection: the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED
    :type connection: str
    :param method: the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL
    :type method: str
    :param status: the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED
    :type status: str
    :param closure: the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB
    :type closure: str
    :param message: the message from the assignee
    :type message: str
    :param follow_up: the date to follow up by
    :type follow_up: int
    :param active: determines whether the assignment status is active or inactive
    :type active: bool

    """
    return web.Response(status=200)


async def assignment_update(request: web.Request, account_id, assignment_id, name=None, description=None, assignee_account_id=None, retailer_location_id=None, tags=None, active=None) -> web.Response:
    """Update Assignment

    Updates an assignment.

    :param account_id: the user account id
    :type account_id: int
    :param assignment_id: the assignment id
    :type assignment_id: int
    :param name: the name of the assignment
    :type name: str
    :param description: the description of the assignment
    :type description: str
    :param assignee_account_id: the account id to assign to
    :type assignee_account_id: int
    :param retailer_location_id: the retailer location id
    :type retailer_location_id: int
    :param tags: the tags
    :type tags: str
    :param active: determines whether the assignment is active or inactive
    :type active: bool

    """
    return web.Response(status=200)
