import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def create_following(version, account_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Create following

    Create following. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_space(version, account_id, app_key, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Create Vatom Space

    Create a Vatom space. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_vatom_event(version, account_id, app_key, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Create Vatom Event

    Create a Vatom event. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_following(version, account_id, vatom_rels_key, return_raw_response=None):  # noqa: E501
    """Delete following

    Delete following. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_rels_key: Vatom Rels Key
    :type vatom_rels_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_points_balance(version, account_id, app_key, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Reset All Points Balance

    Reset All Points Balance. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_space(version, account_id, app_key, vatom_space_id, return_raw_response=None):  # noqa: E501
    """Delete Vatom Space

    Delete a Vatom space. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_vatom_event(version, account_id, app_key, vatom_event_id, return_raw_response=None):  # noqa: E501
    """Delete Vatom Event

    Delete a Vatom event. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_vatom_nft(version, account_id, vatom_id, return_raw_response=None):  # noqa: E501
    """Delete Vatom NFT

    Delete Vatom NFT # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_id: Vatom NFT Id
    :type vatom_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def execute_action_on_nft(version, account_id, vatom_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Execute Action on NFT

    Execute Action on NFT. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def geomap_search(version, account_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Search Vatom Geo Map

    Search Vatom Geo Map # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_business_behaviors(version, account_id, app_key, return_raw_response=None):  # noqa: E501
    """Get Vatom Business Behaviors

    Gets the behaviors of a business. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_business_coins_balance(version, account_id, app_key, return_raw_response=None):  # noqa: E501
    """Get the coins for a Business

    Get the coins for a Businesss. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_business_ids(version, account_id, return_raw_response=None):  # noqa: E501
    """Get the user business ids

    Get the business ids the logged in user has access to. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_business_info(version, account_id, app_key, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """Get Vatom Business Info

    Gets the business info tied to this account. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_business_users(version, account_id, app_key, return_raw_response=None):  # noqa: E501
    """Get Vatom Business Users

    Gets the users of a business. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_group_entities(version, account_id, app_key, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Get Campaign Group Entities

    Get campaign group entities. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_group_rules(version, account_id, app_key, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Get Campaign Group Rules

    Get campaign group rules. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_group_stats(version, account_id, app_key, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Get Campaign Group Stats

    Get campaign group stats. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_info(version, account_id, app_key, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Get Campaign Info

    Gets the info on a campaign. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_event_guest_list(version, account_id, app_key, vatom_event_id, return_raw_response=None):  # noqa: E501
    """Get Vatom Event Guest List

    Gets the guest list of an event. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_inventory(version, account_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Get Vatom User&#39;s Inventory

    Gets the logged in user&#39;s Vatom Inventory. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_my_following(version, account_id, return_raw_response=None):  # noqa: E501
    """Get following

    Get following. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_points_balance(version, account_id, vatom_user_id, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Get Points Balance

    Gets the points balance of a Vatom user. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_points_balance_as_business(version, account_id, app_key, vatom_user_id, vatom_campaign_id, return_raw_response=None):  # noqa: E501
    """Get Points Balance as Business

    Gets the points balance of a Vatom user. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_space(version, account_id, app_key, vatom_space_id, return_raw_response=None):  # noqa: E501
    """Get Vatom Space

    Gets the details of a space. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_coins_as_business(version, account_id, vatom_user_id, app_key, return_raw_response=None):  # noqa: E501
    """Get the coins for a user (as a Business)

    Get the coins for a user (as a Business). # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_coins_balance(version, account_id, vatom_user_id, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """Gets the coins balance for a Vatom User

    Gets the coins balance for a Vatom User. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_followers(version, account_id, vatom_user_id, return_raw_response=None):  # noqa: E501
    """Get user followers

    Get user followers. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_following(version, account_id, vatom_user_id, return_raw_response=None):  # noqa: E501
    """Get user following

    Get user following. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_info(version, account_id, vatom_user_id, return_raw_response=None):  # noqa: E501
    """Get User Info

    Get a User&#39;s Info. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_user_id: Vatom User Id
    :type vatom_user_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_profile(version, account_id, return_raw_response=None):  # noqa: E501
    """Get Vatom User Profile

    Gets the logged in user&#39;s profile in Vatom. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vatom_event(version, account_id, app_key, vatom_event_id, return_raw_response=None):  # noqa: E501
    """Get Vatom Event

    Gets the details of a event. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vatom_nft(version, account_id, vatom_id, return_raw_response=None):  # noqa: E501
    """Get Vatom NFT Details

    Get Vatom NFT Details # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_id: Vatom NFT Id
    :type vatom_id: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_communities(version, account_id, app_key, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """List Vatom Communities

    Gets the communities tied to a business. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_events(version, account_id, app_key, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """List Vatom Events

    Gets the events tied to a business. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_spaces(version, account_id, app_key, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """List Vatom Spaces

    Gets the spaces tied to a business. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_user_coin_transactions(version, account_id, vatom_user_id, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """List Coin Transactions for a Vatom User

    Gets the logged in user&#39;s Vatom coin transactions. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_user_coin_transactions_as_business(version, account_id, vatom_user_id, app_key, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """List coin transactions for a user (as a Business)

    List coin transactions for a user (as a Business). # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def perform_action_on_nft(version, account_id, vatom_id, vatom_action, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Perform Action on NFT

    Perform Action on NFT. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redeem_nft(version, account_id, app_key, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Redeem NFT

    Redeem an NFT. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def redeem_user_coins_as_business(version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Redeem the coins for a user (as a Business)

    Redeem the coins for a user (as a Business). # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_businesses(version, account_id, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """Search for Vatom Businesses

    Searches for Vatom businesses. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_campaign_groups(version, account_id, app_key, return_raw_response=None):  # noqa: E501
    """Search Campaign Groups

    Search campaign groups. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param app_key: Sirqul Application Key
    :type app_key: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_identities(version, account_id, return_raw_response=None):  # noqa: E501
    """Search User Identities

    Search User Identities. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_inventory(version, account_id, vatom_parameters=None, return_raw_response=None):  # noqa: E501
    """Search Vatom User&#39;s Inventory

    Searches the logged in user&#39;s Vatom Inventory. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_nft(version, account_id, app_key, vatom_campaign_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Send NFT

    Send an NFT. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_points_balance_as_business(version, account_id, app_key, vatom_user_id, vatom_campaign_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Set Points Balance as Business

    Sets the points balance of a Vatom user. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def transfer_user_coins(version, account_id, vatom_user_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Transfer coins from Vatom Users

    Transfer coins from Vatom Users. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_business_coins(version, account_id, app_key, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Fund coins for a Business

    Fund/update coins for a Businesss. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_event_guest_list(version, account_id, app_key, vatom_event_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Update Vatom Event Guest List

    Update the guest list of an event. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_space(version, account_id, app_key, vatom_space_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Update Vatom Space

    Update a Vatom space. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_user_coins_as_business(version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Update the coins for a user (as a Business)

    Update the coins for a user (as a Business). # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_user_profile(version, account_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Update Vatom User Profile

    Gets the logged in user&#39;s profile in Vatom. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param vatom_parameters: Vatom Parameters
    :type vatom_parameters: str
    :param return_raw_response: Return raw response
    :type return_raw_response: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_vatom_event(version, account_id, app_key, vatom_event_id, vatom_parameters, return_raw_response=None):  # noqa: E501
    """Update Vatom Event

    Update a Vatom event. # noqa: E501

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

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
