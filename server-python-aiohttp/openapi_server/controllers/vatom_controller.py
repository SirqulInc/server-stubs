from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def create_following(request: web.Request, version, account_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Create following

    Create following.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def create_space(request: web.Request, version, account_id, app_key, vatom_parameters, return_raw_response=None) -> web.Response:
    """Create Vatom Space

    Create a Vatom space.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def create_vatom_event(request: web.Request, version, account_id, app_key, vatom_parameters, return_raw_response=None) -> web.Response:
    """Create Vatom Event

    Create a Vatom event.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def delete_following(request: web.Request, version, account_id, vatom_rels_key, return_raw_response=None) -> web.Response:
    """Delete following

    Delete following.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_rels_key: Vatom Rels Key
    :type vatom_rels_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def delete_points_balance(request: web.Request, version, account_id, app_key, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Reset All Points Balance

    Reset All Points Balance.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def delete_space(request: web.Request, version, account_id, app_key, vatom_space_id, return_raw_response=None) -> web.Response:
    """Delete Vatom Space

    Delete a Vatom space.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_space_id: Vatom Space Id
    :type vatom_space_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def delete_vatom_event(request: web.Request, version, account_id, app_key, vatom_event_id, return_raw_response=None) -> web.Response:
    """Delete Vatom Event

    Delete a Vatom event.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_event_id: Vatom Event Id
    :type vatom_event_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def delete_vatom_nft(request: web.Request, version, account_id, vatom_id, return_raw_response=None) -> web.Response:
    """Delete Vatom NFT

    Delete Vatom NFT

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_id: Vatom NFT Id
    :type vatom_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def execute_action_on_nft(request: web.Request, version, account_id, vatom_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Execute Action on NFT

    Execute Action on NFT.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_id: Vatom NFT Id
    :type vatom_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def geomap_search(request: web.Request, version, account_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Search Vatom Geo Map

    Search Vatom Geo Map

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_business_behaviors(request: web.Request, version, account_id, app_key, return_raw_response=None) -> web.Response:
    """Get Vatom Business Behaviors

    Gets the behaviors of a business.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_business_coins_balance(request: web.Request, version, account_id, app_key, return_raw_response=None) -> web.Response:
    """Get the coins for a Business

    Get the coins for a Businesss.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_business_ids(request: web.Request, version, account_id, return_raw_response=None) -> web.Response:
    """Get the user business ids

    Get the business ids the logged in user has access to.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_business_info(request: web.Request, version, account_id, app_key, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """Get Vatom Business Info

    Gets the business info tied to this account.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_business_users(request: web.Request, version, account_id, app_key, return_raw_response=None) -> web.Response:
    """Get Vatom Business Users

    Gets the users of a business.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_campaign_group_entities(request: web.Request, version, account_id, app_key, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Get Campaign Group Entities

    Get campaign group entities.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_campaign_group_rules(request: web.Request, version, account_id, app_key, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Get Campaign Group Rules

    Get campaign group rules.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_campaign_group_stats(request: web.Request, version, account_id, app_key, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Get Campaign Group Stats

    Get campaign group stats.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_campaign_info(request: web.Request, version, account_id, app_key, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Get Campaign Info

    Gets the info on a campaign.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_event_guest_list(request: web.Request, version, account_id, app_key, vatom_event_id, return_raw_response=None) -> web.Response:
    """Get Vatom Event Guest List

    Gets the guest list of an event.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_event_id: Vatom Event Id
    :type vatom_event_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_inventory(request: web.Request, version, account_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Get Vatom User&#39;s Inventory

    Gets the logged in user&#39;s Vatom Inventory.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_my_following(request: web.Request, version, account_id, return_raw_response=None) -> web.Response:
    """Get following

    Get following.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_points_balance(request: web.Request, version, account_id, vatom_user_id, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Get Points Balance

    Gets the points balance of a Vatom user.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_points_balance_as_business(request: web.Request, version, account_id, app_key, vatom_user_id, vatom_campaign_id, return_raw_response=None) -> web.Response:
    """Get Points Balance as Business

    Gets the points balance of a Vatom user.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_space(request: web.Request, version, account_id, app_key, vatom_space_id, return_raw_response=None) -> web.Response:
    """Get Vatom Space

    Gets the details of a space.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_space_id: Vatom Space Id
    :type vatom_space_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_user_coins_as_business(request: web.Request, version, account_id, vatom_user_id, app_key, return_raw_response=None) -> web.Response:
    """Get the coins for a user (as a Business)

    Get the coins for a user (as a Business).

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_user_coins_balance(request: web.Request, version, account_id, vatom_user_id, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """Gets the coins balance for a Vatom User

    Gets the coins balance for a Vatom User.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_user_followers(request: web.Request, version, account_id, vatom_user_id, return_raw_response=None) -> web.Response:
    """Get user followers

    Get user followers.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_user_following(request: web.Request, version, account_id, vatom_user_id, return_raw_response=None) -> web.Response:
    """Get user following

    Get user following.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_user_info(request: web.Request, version, account_id, vatom_user_id, return_raw_response=None) -> web.Response:
    """Get User Info

    Get a User&#39;s Info.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_user_profile(request: web.Request, version, account_id, return_raw_response=None) -> web.Response:
    """Get Vatom User Profile

    Gets the logged in user&#39;s profile in Vatom.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_vatom_event(request: web.Request, version, account_id, app_key, vatom_event_id, return_raw_response=None) -> web.Response:
    """Get Vatom Event

    Gets the details of a event.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_event_id: Vatom Event Id
    :type vatom_event_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def get_vatom_nft(request: web.Request, version, account_id, vatom_id, return_raw_response=None) -> web.Response:
    """Get Vatom NFT Details

    Get Vatom NFT Details

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_id: Vatom NFT Id
    :type vatom_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def list_communities(request: web.Request, version, account_id, app_key, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """List Vatom Communities

    Gets the communities tied to a business.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def list_events(request: web.Request, version, account_id, app_key, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """List Vatom Events

    Gets the events tied to a business.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def list_spaces(request: web.Request, version, account_id, app_key, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """List Vatom Spaces

    Gets the spaces tied to a business.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def list_user_coin_transactions(request: web.Request, version, account_id, vatom_user_id, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """List Coin Transactions for a Vatom User

    Gets the logged in user&#39;s Vatom coin transactions.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def list_user_coin_transactions_as_business(request: web.Request, version, account_id, vatom_user_id, app_key, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """List coin transactions for a user (as a Business)

    List coin transactions for a user (as a Business).

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def perform_action_on_nft(request: web.Request, version, account_id, vatom_id, vatom_action, vatom_parameters, return_raw_response=None) -> web.Response:
    """Perform Action on NFT

    Perform Action on NFT.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_id: Vatom NFT Id
    :type vatom_id: str
    :param vatom_action: Vatom Action
    :type vatom_action: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def redeem_nft(request: web.Request, version, account_id, app_key, vatom_parameters, return_raw_response=None) -> web.Response:
    """Redeem NFT

    Redeem an NFT.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def redeem_user_coins_as_business(request: web.Request, version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response=None) -> web.Response:
    """Redeem the coins for a user (as a Business)

    Redeem the coins for a user (as a Business).

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def search_businesses(request: web.Request, version, account_id, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """Search for Vatom Businesses

    Searches for Vatom businesses.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def search_campaign_groups(request: web.Request, version, account_id, app_key, return_raw_response=None) -> web.Response:
    """Search Campaign Groups

    Search campaign groups.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def search_identities(request: web.Request, version, account_id, return_raw_response=None) -> web.Response:
    """Search User Identities

    Search User Identities.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def search_inventory(request: web.Request, version, account_id, vatom_parameters=None, return_raw_response=None) -> web.Response:
    """Search Vatom User&#39;s Inventory

    Searches the logged in user&#39;s Vatom Inventory.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def send_nft(request: web.Request, version, account_id, app_key, vatom_campaign_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Send NFT

    Send an NFT.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def set_points_balance_as_business(request: web.Request, version, account_id, app_key, vatom_user_id, vatom_campaign_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Set Points Balance as Business

    Sets the points balance of a Vatom user.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param vatom_campaign_id: Vatom Campaign Id
    :type vatom_campaign_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def transfer_user_coins(request: web.Request, version, account_id, vatom_user_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Transfer coins from Vatom Users

    Transfer coins from Vatom Users.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def update_business_coins(request: web.Request, version, account_id, app_key, vatom_parameters, return_raw_response=None) -> web.Response:
    """Fund coins for a Business

    Fund/update coins for a Businesss.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def update_event_guest_list(request: web.Request, version, account_id, app_key, vatom_event_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Update Vatom Event Guest List

    Update the guest list of an event.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_event_id: Vatom Event Id
    :type vatom_event_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def update_space(request: web.Request, version, account_id, app_key, vatom_space_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Update Vatom Space

    Update a Vatom space.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_space_id: Vatom Space Id
    :type vatom_space_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def update_user_coins_as_business(request: web.Request, version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response=None) -> web.Response:
    """Update the coins for a user (as a Business)

    Update the coins for a user (as a Business).

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def update_user_profile(request: web.Request, version, account_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Update Vatom User Profile

    Gets the logged in user&#39;s profile in Vatom.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)


async def update_vatom_event(request: web.Request, version, account_id, app_key, vatom_event_id, vatom_parameters, return_raw_response=None) -> web.Response:
    """Update Vatom Event

    Update a Vatom event.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param vatom_event_id: Vatom Event Id
    :type vatom_event_id: str
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    """
    return web.Response(status=200)
