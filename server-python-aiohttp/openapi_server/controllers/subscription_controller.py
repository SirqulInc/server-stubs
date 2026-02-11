from typing import List, Dict
from aiohttp import web

from openapi_server.models.application_usage_response import ApplicationUsageResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.subscription_plan_response import SubscriptionPlanResponse
from openapi_server.models.subscription_response import SubscriptionResponse
from openapi_server import util


async def create_subscription(request: web.Request, account_id, plan_id=None, promo_code=None) -> web.Response:
    """Create Subscription

    Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.

    :param account_id: The account used to perform the create, must be the responsible manager
    :type account_id: int
    :param plan_id: The plan to subscribe to, if null use default plan
    :type plan_id: int
    :param promo_code: Set a promo code for a discount.
    :type promo_code: str

    """
    return web.Response(status=200)


async def delete_subscription(request: web.Request, account_id) -> web.Response:
    """Delete Subscription

    Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action

    :param account_id: The account used to perform the delete, must be the responsible manager
    :type account_id: int

    """
    return web.Response(status=200)


async def get_subscription(request: web.Request, account_id) -> web.Response:
    """Get Subscription

    Use the accountId to determine the associated BillableEntity.  Then get the subscription.

    :param account_id: The account used to perform the lookup
    :type account_id: int

    """
    return web.Response(status=200)


async def get_subscription_plan(request: web.Request, plan_id) -> web.Response:
    """Get Subscription Plan

    Get the matched subscription plan

    :param plan_id: The ID of the plan to get
    :type plan_id: int

    """
    return web.Response(status=200)


async def get_subscription_plans(request: web.Request, visible=None, role=None) -> web.Response:
    """List Subscription Plans

    Get the matched subscription plan

    :param visible: Include visible only (true), hidden only (false), or all (null)
    :type visible: bool
    :param role: The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER
    :type role: str

    """
    return web.Response(status=200)


async def get_subscription_usage(request: web.Request, account_id, application_id=None, start=None, end=None) -> web.Response:
    """Get Subscription Usage

    Use the accountId to determine the associated BillableEntity.  Then get the application usage.

    :param account_id: The account used to perform the lookup
    :type account_id: int
    :param application_id: Get for just 1 application instead of the BillableEntity
    :type application_id: int
    :param start: The start time frame
    :type start: int
    :param end: The end time frame
    :type end: int

    """
    return web.Response(status=200)


async def update_subscription(request: web.Request, account_id, plan_id=None, promo_code=None, active=None) -> web.Response:
    """Update Subscription

    Updates the subscription for the billable entity for an account

    :param account_id: The account used to perform the update, must be the responsible manager
    :type account_id: int
    :param plan_id: The plan to subscribe to
    :type plan_id: int
    :param promo_code: Set a promo code for a discount.
    :type promo_code: str
    :param active: Set active status
    :type active: bool

    """
    return web.Response(status=200)
