import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.application_usage_response import ApplicationUsageResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.subscription_plan_response import SubscriptionPlanResponse  # noqa: E501
from openapi_server.models.subscription_response import SubscriptionResponse  # noqa: E501
from openapi_server import util


def create_subscription(version, account_id, plan_id=None, promo_code=None):  # noqa: E501
    """Create Subscription

    Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the create, must be the responsible manager
    :type account_id: int
    :param plan_id: The plan to subscribe to, if null use default plan
    :type plan_id: int
    :param promo_code: Set a promo code for a discount.
    :type promo_code: str

    :rtype: Union[SubscriptionResponse, Tuple[SubscriptionResponse, int], Tuple[SubscriptionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_subscription(version, account_id):  # noqa: E501
    """Delete Subscription

    Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the delete, must be the responsible manager
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subscription(version, account_id):  # noqa: E501
    """Get Subscription

    Use the accountId to determine the associated BillableEntity.  Then get the subscription. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the lookup
    :type account_id: int

    :rtype: Union[SubscriptionResponse, Tuple[SubscriptionResponse, int], Tuple[SubscriptionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subscription_plan(version, plan_id):  # noqa: E501
    """Get Subscription Plan

    Get the matched subscription plan # noqa: E501

    :param version: 
    :type version: 
    :param plan_id: The ID of the plan to get
    :type plan_id: int

    :rtype: Union[SubscriptionPlanResponse, Tuple[SubscriptionPlanResponse, int], Tuple[SubscriptionPlanResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subscription_plans(version, visible=None, role=None):  # noqa: E501
    """List Subscription Plans

    Get the matched subscription plan # noqa: E501

    :param version: 
    :type version: 
    :param visible: Include visible only (true), hidden only (false), or all (null)
    :type visible: bool
    :param role: The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER
    :type role: str

    :rtype: Union[List[SubscriptionPlanResponse], Tuple[List[SubscriptionPlanResponse], int], Tuple[List[SubscriptionPlanResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subscription_usage(version, account_id, application_id=None, start=None, end=None):  # noqa: E501
    """Get Subscription Usage

    Use the accountId to determine the associated BillableEntity.  Then get the application usage. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the lookup
    :type account_id: int
    :param application_id: Get for just 1 application instead of the BillableEntity
    :type application_id: int
    :param start: The start time frame
    :type start: int
    :param end: The end time frame
    :type end: int

    :rtype: Union[ApplicationUsageResponse, Tuple[ApplicationUsageResponse, int], Tuple[ApplicationUsageResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_subscription(version, account_id, plan_id=None, promo_code=None, active=None):  # noqa: E501
    """Update Subscription

    Updates the subscription for the billable entity for an account # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the update, must be the responsible manager
    :type account_id: int
    :param plan_id: The plan to subscribe to
    :type plan_id: int
    :param promo_code: Set a promo code for a discount.
    :type promo_code: str
    :param active: Set active status
    :type active: bool

    :rtype: Union[SubscriptionResponse, Tuple[SubscriptionResponse, int], Tuple[SubscriptionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
