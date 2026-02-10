import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.trigger_response import TriggerResponse  # noqa: E501
from openapi_server import util


def create_trigger(version, account_id, name, app_key=None, grouping_id=None, endpoint_url=None, payload=None, scheduled_date=None, start_date=None, end_date=None, cron_expression=None, conditional_input=None, visibility=None, active=None):  # noqa: E501
    """Create Trigger

    Create a trigger # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user
    :type account_id: int
    :param name: The name of the trigger
    :type name: str
    :param app_key: The application to target
    :type app_key: str
    :param grouping_id: Client defined identifier for grouping triggers
    :type grouping_id: str
    :param endpoint_url: The URL for making an HTTP call
    :type endpoint_url: str
    :param payload: The parameters for making an HTTP call
    :type payload: str
    :param scheduled_date: The date and time of the next trigger
    :type scheduled_date: int
    :param start_date: The starting date of the trigger
    :type start_date: int
    :param end_date: The ending date of the trigger
    :type end_date: int
    :param cron_expression: The cron expression that represents the trigger&#39;s schedule
    :type cron_expression: str
    :param conditional_input: Json input representing conditional logic that has to be met before running the trigger
    :type conditional_input: str
    :param visibility: The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    :type visibility: str
    :param active: Sets whether the Trigger is active or not (inactive Triggers are not processed)
    :type active: bool

    :rtype: Union[TriggerResponse, Tuple[TriggerResponse, int], Tuple[TriggerResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_trigger(version, account_id, trigger_id):  # noqa: E501
    """Delete Trigger

    Mark a trigger as deleted. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param trigger_id: The id of the trigger to delete.
    :type trigger_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_trigger(version, account_id, trigger_id):  # noqa: E501
    """Get Trigger

    Get a trigger # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param trigger_id: The id of the Trigger to return.
    :type trigger_id: int

    :rtype: Union[TriggerResponse, Tuple[TriggerResponse, int], Tuple[TriggerResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_triggers(version, account_id, grouping_id=None, filter=None, statuses=None, template_types=None, app_key=None, keyword=None, sort_field=None, descending=None, start=None, limit=None, active_only=None):  # noqa: E501
    """Search Triggers

    Search for triggers # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param grouping_id: Filter results by a grouping identifier defined by the client
    :type grouping_id: str
    :param filter: A comma separated list of filters. * MINE - Return triggers that the user has created * SHARED - Return triggers that have been shared to the user * FOLLOWER - Return triggers that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return triggers that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC triggers that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC triggers regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all triggers that the user has liked * FEATURED - Return all triggers that have been featured * PENDING - Return all pending triggers 
    :type filter: str
    :param statuses: Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE
    :type statuses: str
    :param template_types: Template Types
    :type template_types: str
    :param app_key: Filter the list by a specific application
    :type app_key: str
    :param keyword: Keyword search on the trigger names.
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

    :rtype: Union[List[TriggerResponse], Tuple[List[TriggerResponse], int], Tuple[List[TriggerResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_trigger(version, trigger_id, account_id, name=None, app_key=None, grouping_id=None, endpoint_url=None, payload=None, scheduled_date=None, start_date=None, end_date=None, cron_expression=None, conditional_input=None, visibility=None, active=None):  # noqa: E501
    """Update Trigger

    Update a trigger # noqa: E501

    :param version: 
    :type version: 
    :param trigger_id: The trigger to update
    :type trigger_id: int
    :param account_id: The logged in user
    :type account_id: int
    :param name: The name of the trigger
    :type name: str
    :param app_key: The application to target
    :type app_key: str
    :param grouping_id: Client defined identifier for grouping triggers
    :type grouping_id: str
    :param endpoint_url: The URL for making an HTTP call
    :type endpoint_url: str
    :param payload: The parameters for making an HTTP call
    :type payload: str
    :param scheduled_date: The date and time of the next trigger
    :type scheduled_date: int
    :param start_date: The starting date of the trigger
    :type start_date: int
    :param end_date: The ending date of the trigger
    :type end_date: int
    :param cron_expression: The cron expression that represents the trigger&#39;s schedule
    :type cron_expression: str
    :param conditional_input: Json input representing conditional logic that has to be met before running the trigger
    :type conditional_input: str
    :param visibility: The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    :type visibility: str
    :param active: Sets whether the Trigger is active or not (inactive Triggers are not processed)
    :type active: bool

    :rtype: Union[TriggerResponse, Tuple[TriggerResponse, int], Tuple[TriggerResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
