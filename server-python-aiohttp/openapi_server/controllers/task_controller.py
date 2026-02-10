from typing import List, Dict
from aiohttp import web

from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.task_response import TaskResponse
from openapi_server import util


async def create_task(request: web.Request, version, account_id, name, app_key=None, grouping_id=None, endpoint_url=None, payload=None, scheduled_date=None, start_date=None, end_date=None, cron_expression=None, visibility=None, active=None) -> web.Response:
    """Create Task

    Create a Task

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the task
    :type name: str
    :param app_key: The application to target
    :type app_key: str
    :param grouping_id: Client defined identifier for grouping tasks
    :type grouping_id: str
    :param endpoint_url: The URL for making an HTTP call
    :type endpoint_url: str
    :param payload: The parameters for making an HTTP call
    :type payload: str
    :param scheduled_date: The date and time of the task
    :type scheduled_date: int
    :param start_date: The starting date of the task
    :type start_date: int
    :param end_date: The ending date of the task
    :type end_date: int
    :param cron_expression: The cron expression that represents the task&#39;s schedule
    :type cron_expression: str
    :param visibility: The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    :type visibility: str
    :param active: Sets whether the Task is active or not (inactive Tasks are not processed)
    :type active: bool

    """
    return web.Response(status=200)


async def delete_task(request: web.Request, version, account_id, task_id) -> web.Response:
    """Delete Task

    Delete a Task

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param task_id: The id of the Task to delete.
    :type task_id: int

    """
    return web.Response(status=200)


async def get_task(request: web.Request, version, account_id, task_id) -> web.Response:
    """Get Task

    Get a Task

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param task_id: The id of the Task to return.
    :type task_id: int

    """
    return web.Response(status=200)


async def search_tasks(request: web.Request, version, account_id, grouping_id=None, filter=None, statuses=None, template_types=None, app_key=None, keyword=None, sort_field=None, descending=None, start=None, limit=None, active_only=None) -> web.Response:
    """Search Tasks

    Search on Tasks

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param grouping_id: Filter results by a grouping identifier defined by the client
    :type grouping_id: str
    :param filter: A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks 
    :type filter: str
    :param statuses: Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE
    :type statuses: str
    :param template_types: Template Types
    :type template_types: str
    :param app_key: Filter the list by a specific application
    :type app_key: str
    :param keyword: Keyword search on the task names.
    :type keyword: str
    :param sort_field: The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number.
    :type limit: int
    :param active_only: Determines whether to return only active results
    :type active_only: bool

    """
    return web.Response(status=200)


async def update_task(request: web.Request, version, task_id, account_id, name=None, app_key=None, grouping_id=None, endpoint_url=None, payload=None, scheduled_date=None, start_date=None, end_date=None, cron_expression=None, visibility=None, active=None) -> web.Response:
    """Update Task

    Update a Task

    :param version: 
    :type version: 
    :param task_id: Task Id
    :type task_id: int
    :param account_id: The logged in user.
    :type account_id: int
    :param name: The name of the task
    :type name: str
    :param app_key: The application to target
    :type app_key: str
    :param grouping_id: Client defined identifier for grouping tasks
    :type grouping_id: str
    :param endpoint_url: The URL for making an HTTP call
    :type endpoint_url: str
    :param payload: The parameters for making an HTTP call
    :type payload: str
    :param scheduled_date: The date and time of the task
    :type scheduled_date: int
    :param start_date: The starting date of the task
    :type start_date: int
    :param end_date: The ending date of the task
    :type end_date: int
    :param cron_expression: The cron expression that represents the task&#39;s schedule
    :type cron_expression: str
    :param visibility: The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    :type visibility: str
    :param active: Sets whether the Task is active or not (inactive Tasks are not processed)
    :type active: bool

    """
    return web.Response(status=200)
