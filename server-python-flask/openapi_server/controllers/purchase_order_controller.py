import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.order_response import OrderResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_order(version, app_key, cart, device_id=None, account_id=None, description=None, currency_type=None, payment_method_id=None, external_order_id=None, external_payment_id=None, remote_ref_type=None, external_date=None, promo_code=None):  # noqa: E501
    """Create Order

    Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application requesting the purchase
    :type app_key: str
    :param cart: &#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; 
    :type cart: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param description: A description of the purchase
    :type description: str
    :param currency_type: Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  
    :type currency_type: str
    :param payment_method_id: Use a specific payment method (CASH), if not provided use default
    :type payment_method_id: int
    :param external_order_id: Store identifier from external system
    :type external_order_id: str
    :param external_payment_id: Store identifier from external system
    :type external_payment_id: str
    :param remote_ref_type: Remote Reference type
    :type remote_ref_type: str
    :param external_date: External Date
    :type external_date: int
    :param promo_code: The Promo Code
    :type promo_code: str

    :rtype: Union[OrderResponse, Tuple[OrderResponse, int], Tuple[OrderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_order(version, order_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Order

    Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId. # noqa: E501

    :param version: 
    :type version: 
    :param order_id: Order Id
    :type order_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_order(version, device_id=None, account_id=None, order_id=None, external_order_id=None):  # noqa: E501
    """Get Order

    Get an order record # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param order_id: The order id to get details of, either orderId or externalOrderId must be provided
    :type order_id: int
    :param external_order_id: The external order id to get details of, either orderId or externalOrderId must be provided
    :type external_order_id: str

    :rtype: Union[OrderResponse, Tuple[OrderResponse, int], Tuple[OrderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def preview_order(version, app_key, cart, device_id=None, account_id=None, description=None, currency_type=None, payment_method_id=None, external_order_id=None, external_payment_id=None, remote_ref_type=None, external_date=None, promo_code=None):  # noqa: E501
    """Preview Order

    Previews a purchase to see the total cost before making it. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application requesting the purchase
    :type app_key: str
    :param cart: A JSON list of items to purchase
    :type cart: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param description: A description of the purchase
    :type description: str
    :param currency_type: Determines the method of purchasing offer. &#x60;&#x60;&#x60;json {   \&quot;VOID\&quot;: \&quot;used for when there is no payment involved (ie. for updating the status of a purchase order)\&quot;,   \&quot;CASH\&quot;: \&quot;use card on file\&quot;,   \&quot;POINTS\&quot;: \&quot;use account balance\&quot;,   \&quot;TICKETS\&quot;: \&quot;use tickets\&quot;,   \&quot;REFUND\&quot;: \&quot;not allowed for a create, requires a paymentTransactionId\&quot;,   \&quot;CREDIT\&quot;: \&quot;add to the account balance\&quot;,   \&quot;RELOAD\&quot;: \&quot;charge a credit card then add to the account balance\&quot; } &#x60;&#x60;&#x60; 
    :type currency_type: str
    :param payment_method_id: Use a specific payment method (CASH), if not provided use default
    :type payment_method_id: int
    :param external_order_id: Store identifier from external system
    :type external_order_id: str
    :param external_payment_id: Store identifier from external system
    :type external_payment_id: str
    :param remote_ref_type: Remote Reference type
    :type remote_ref_type: str
    :param external_date: External Date
    :type external_date: int
    :param promo_code: The Promo Code
    :type promo_code: str

    :rtype: Union[OrderResponse, Tuple[OrderResponse, int], Tuple[OrderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_orders(version, app_key, device_id=None, account_id=None, start=None, limit=None, descending=None, active_only=None, ignore_customer_filter=None, order_item_types=None, order_item_ids=None, order_custom_types=None, order_custom_ids=None, sort_field=None, offer_types=None, special_offer_types=None, category_ids=None, filter_ids=None, offer_audience_ids=None, transaction_audience_ids=None, offer_ids=None, offer_location_ids=None, retailer_ids=None, retailer_location_ids=None, statuses=None, keyword=None, redeemable_start_date=None, redeemable_end_date=None, started_since=None, started_before=None, ended_since=None, ended_before=None):  # noqa: E501
    """Search Orders

    Search on active orders by customer # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application requesting the purchase
    :type app_key: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param descending: Determines whether to return the resulting list in descending or ascending order
    :type descending: bool
    :param active_only: Only return active orders
    :type active_only: bool
    :param ignore_customer_filter: Determines whether to ignore the customer filter (requires an Admin/Exec account)
    :type ignore_customer_filter: bool
    :param order_item_types: Filter results by orderItemTypes
    :type order_item_types: str
    :param order_item_ids: Filter results by orderItemIds
    :type order_item_ids: str
    :param order_custom_types: Filter results by orderCustomTypes
    :type order_custom_types: str
    :param order_custom_ids: Filter results by orderCustomIds
    :type order_custom_ids: str
    :param sort_field: Determines what to sort the results by
    :type sort_field: str
    :param offer_types: Filter results by offer type
    :type offer_types: str
    :param special_offer_types: Filter results by special offer type
    :type special_offer_types: str
    :param category_ids: Filter results by category Ids
    :type category_ids: str
    :param filter_ids: Filter results by filter Ids
    :type filter_ids: str
    :param offer_audience_ids: Filter results by offer audience Ids
    :type offer_audience_ids: str
    :param transaction_audience_ids: Filter results by transaction audience Ids
    :type transaction_audience_ids: str
    :param offer_ids: Filter results by offer Ids
    :type offer_ids: str
    :param offer_location_ids: Filter results by offer location Ids
    :type offer_location_ids: str
    :param retailer_ids: Filter results by retailer Ids
    :type retailer_ids: str
    :param retailer_location_ids: Filter results by retailer location Ids
    :type retailer_location_ids: str
    :param statuses: Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)
    :type statuses: str
    :param keyword: The keyword to search for
    :type keyword: str
    :param redeemable_start_date: Filter results by the offer redeemable date
    :type redeemable_start_date: int
    :param redeemable_end_date: Filter results by the offer redeemable date
    :type redeemable_end_date: int
    :param started_since: Filter results by the offer start date
    :type started_since: int
    :param started_before: Filter results by the offer start date
    :type started_before: int
    :param ended_since: Filter results by the offer end date
    :type ended_since: int
    :param ended_before: Filter results by the offer end date
    :type ended_before: int

    :rtype: Union[List[OrderResponse], Tuple[List[OrderResponse], int], Tuple[List[OrderResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_order(version, order_id, app_key, cart, device_id=None, account_id=None, payment_transaction_id=None, description=None, currency_type=None, payment_method_id=None, external_payment_id=None, external_date=None):  # noqa: E501
    """Update Order

    Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it. # noqa: E501

    :param version: 
    :type version: 
    :param order_id: The order to add the purchase to, leave null for new order.
    :type order_id: int
    :param app_key: The application requesting the purchase
    :type app_key: str
    :param cart: &#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; 
    :type cart: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param payment_transaction_id: The payment transaction to apply the refund to
    :type payment_transaction_id: int
    :param description: A description of the purchase
    :type description: str
    :param currency_type: Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  
    :type currency_type: str
    :param payment_method_id: Use a specific payment method (CASH), if not provided use default
    :type payment_method_id: int
    :param external_payment_id: Store identifier from external system
    :type external_payment_id: str
    :param external_date: External Date
    :type external_date: int

    :rtype: Union[OrderResponse, Tuple[OrderResponse, int], Tuple[OrderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
