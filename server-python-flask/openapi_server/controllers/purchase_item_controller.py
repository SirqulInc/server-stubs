import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.purchase_item_full_response import PurchaseItemFullResponse  # noqa: E501
from openapi_server.models.purchase_item_response import PurchaseItemResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_purchase_item(version, app_key, name, purchase_type, device_id=None, account_id=None, description=None, tickets=None, price=None, purchase_code=None, secret_key=None, purchase_limit=None, service_action=None, cover_asset_id=None, promo_asset_id=None, giftable=None, assetable=None, allocate_tickets=None, ticket_type=None, points=None, offer_location_id=None):  # noqa: E501
    """Create Purchase

    Creates a purchase item for in app purchases # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key that the purchase can be used in
    :type app_key: str
    :param name: The name of the purchase item
    :type name: str
    :param purchase_type: The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    :type purchase_type: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param description: The description of the purchase item
    :type description: str
    :param tickets: How much the purchase item is worth in tickets
    :type tickets: int
    :param price: How much the purchase item will cost in real money
    :type price: float
    :param purchase_code: The unique identifier used by purchase providers to identify in-app-purchases
    :type purchase_code: str
    :param secret_key: A secret key from purchase providers that would be used for validation
    :type secret_key: str
    :param purchase_limit: How many times a user acquire the same purchase item
    :type purchase_limit: int
    :param service_action: Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;
    :type service_action: str
    :param cover_asset_id: The cover image of the purchase item
    :type cover_asset_id: int
    :param promo_asset_id: An application specific asset that can be used to store/provide additional data
    :type promo_asset_id: int
    :param giftable: Determines whether the purchase item can be gifted to other users
    :type giftable: bool
    :param assetable: Determines whether users can attach their own media/asset to the purchase item
    :type assetable: bool
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed missions
    :type allocate_tickets: bool
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int
    :param offer_location_id: The offer location that will get added to the user&#39;s wallet after purchase.
    :type offer_location_id: int

    :rtype: Union[PurchaseItemFullResponse, Tuple[PurchaseItemFullResponse, int], Tuple[PurchaseItemFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_purchase_item(version, purchase_item_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Purchase

    Marks the purchase item as deleted # noqa: E501

    :param version: 
    :type version: 
    :param purchase_item_id: The purchase item id
    :type purchase_item_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_purchase_item(version, purchase_item_id, device_id=None, account_id=None):  # noqa: E501
    """Get Purchase

    Get detailed information about a purchase item # noqa: E501

    :param version: 
    :type version: 
    :param purchase_item_id: The purchase item id
    :type purchase_item_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[PurchaseItemFullResponse, Tuple[PurchaseItemFullResponse, int], Tuple[PurchaseItemFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_purchase_items(version, device_id=None, account_id=None, app_key=None, filter_by_billable=None, purchase_type=None, service_action=None, keyword=None, sort_field=None, descending=None, start=None, limit=None, active_only=None):  # noqa: E501
    """Search Purchases

    Search for purchasable items from the system # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: The application key to filter results by application
    :type app_key: str
    :param filter_by_billable: Determines whether to filter results by the user&#39;s billable entity
    :type filter_by_billable: bool
    :param purchase_type: A comma separated list of purchase providers to filter by. Possible values include: &lt;ul&gt; &lt;li&gt;SIRQUL - purchases from the Sirqul store using tickets&lt;/li&gt; &lt;li&gt;IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - purchases from the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - purchases from the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - purchases from the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - purchases from the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - purchases that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    :type purchase_type: str
    :param service_action: A comma separated list of service actions to filter results by. Possible values include: &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - purchases that subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - purchases that subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - purchases that subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - purchases that allow users to add more tickets&lt;/li&gt; &lt;li&gt;ADD_GIFT - purchases that allow users to recieve gifts&lt;/li&gt; &lt;/ul&gt;
    :type service_action: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param active_only: Return only active results
    :type active_only: bool

    :rtype: Union[List[PurchaseItemResponse], Tuple[List[PurchaseItemResponse], int], Tuple[List[PurchaseItemResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_purchase_item(version, purchase_item_id, device_id=None, account_id=None, name=None, description=None, tickets=None, price=None, purchase_type=None, purchase_code=None, secret_key=None, purchase_limit=None, service_action=None, cover_asset_id=None, promo_asset_id=None, giftable=None, assetable=None, active=None, allocate_tickets=None, ticket_type=None, points=None, offer_location_id=None):  # noqa: E501
    """Update Purchase

    Updates a purchase item for in app purchases # noqa: E501

    :param version: 
    :type version: 
    :param purchase_item_id: The purchase item id
    :type purchase_item_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param name: The name of the purchase item
    :type name: str
    :param description: The description of the purchase item
    :type description: str
    :param tickets: How much the purchase item is worth in tickets
    :type tickets: int
    :param price: How much the purchase item will cost in real money
    :type price: float
    :param purchase_type: The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    :type purchase_type: str
    :param purchase_code: The unique identifier used by purchase providers to identify in-app-purchases
    :type purchase_code: str
    :param secret_key: A secret key from purchase providers that would be used for validation
    :type secret_key: str
    :param purchase_limit: How many times a user acquire the same purchase item
    :type purchase_limit: int
    :param service_action: Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;
    :type service_action: str
    :param cover_asset_id: The cover image of the purchase item
    :type cover_asset_id: int
    :param promo_asset_id: An application specific asset that can be used to store/provide additional data
    :type promo_asset_id: int
    :param giftable: Determines whether the purchase item can be gifted to other users
    :type giftable: bool
    :param assetable: Determines whether users can attach their own media/asset to the purchase item
    :type assetable: bool
    :param active: Sets whether the purchase item is active or inactive (hidden from consumers)
    :type active: bool
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed missions
    :type allocate_tickets: bool
    :param ticket_type: The type of ticket to reward, null means default type
    :type ticket_type: str
    :param points: The number of points to award for completing a mission
    :type points: int
    :param offer_location_id: The offer location that will get added to the user&#39;s wallet after purchase.
    :type offer_location_id: int

    :rtype: Union[PurchaseItemFullResponse, Tuple[PurchaseItemFullResponse, int], Tuple[PurchaseItemFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
