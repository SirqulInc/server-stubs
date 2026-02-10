import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.offer_transaction_response import OfferTransactionResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_offer_transaction(version, device_id=None, account_id=None, offer_id=None, offer_location_id=None, offer_cart=None, promo_code=None, currency_type=None, use_points=None, meta_data=None, app_key=None, status=None):  # noqa: E501
    """Create Wallet Offers

    Adds offers to the wallet # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param offer_id: The id of the offer being added (offerId or offeLocationId required)
    :type offer_id: int
    :param offer_location_id: The id of the offer location being added (offerId or offeLocationId required)
    :type offer_location_id: int
    :param offer_cart: A JSON list of offers to purchase. &#x60;&#x60;&#x60;json [   {     \&quot;offerId\&quot;: 123,     \&quot;offerLocationId\&quot;: 234,     \&quot;quantity\&quot;: 2   },   {     \&quot;offerId\&quot;: 456,     \&quot;offerLocationId\&quot;: 567,     \&quot;quantity\&quot;: 1   } ] &#x60;&#x60;&#x60; 
    :type offer_cart: str
    :param promo_code: The promoCode
    :type promo_code: str
    :param currency_type: Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets
    :type currency_type: str
    :param use_points: Sets the currencyType to POINTS
    :type use_points: bool
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param app_key: The application requesting the purchase, required when currencyType is TICKETS
    :type app_key: str
    :param status: Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)
    :type status: int

    :rtype: Union[List[OfferTransactionResponse], Tuple[List[OfferTransactionResponse], int], Tuple[List[OfferTransactionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_offer_transaction(version, transaction_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Wallet Offer

    Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId. # noqa: E501

    :param version: 
    :type version: 
    :param transaction_id: The offer transaction id to remove
    :type transaction_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_transaction(version, transaction_id, device_id=None, account_id=None, include_mission=None, latitude=None, longitude=None, return_full_response=None):  # noqa: E501
    """Get Wallet Offer

     # noqa: E501

    :param version: 
    :type version: 
    :param transaction_id: The offer transaction id to get details of
    :type transaction_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param include_mission: If true then include mission data, false to not include
    :type include_mission: bool
    :param latitude: The latitude location of the user
    :type latitude: float
    :param longitude: The latitude location of the user
    :type longitude: float
    :param return_full_response: Determines whether to return a detailed version of the response
    :type return_full_response: bool

    :rtype: Union[OfferTransactionResponse, Tuple[OfferTransactionResponse, int], Tuple[OfferTransactionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def preview_offer_transaction(version, device_id=None, account_id=None, offer_id=None, offer_location_id=None, offer_cart=None, promo_code=None, currency_type=None, use_points=None, meta_data=None, app_key=None):  # noqa: E501
    """Preview Wallet Offers

    Preview the final cost of a transaction without charging the user # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param offer_id: The id of the offer being added (offerId or offeLocationId required)
    :type offer_id: int
    :param offer_location_id: The id of the offer location being added (offerId or offeLocationId required)
    :type offer_location_id: int
    :param offer_cart: A JSON list of offers to purchase.
    :type offer_cart: str
    :param promo_code: The promoCode
    :type promo_code: str
    :param currency_type: Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets
    :type currency_type: str
    :param use_points: Sets the currencyType to POINTS
    :type use_points: bool
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param app_key: The application requesting the purchase, required when currencyType is TICKETS
    :type app_key: str

    :rtype: Union[List[OfferTransactionResponse], Tuple[List[OfferTransactionResponse], int], Tuple[List[OfferTransactionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_offer_transactions(version, device_id=None, account_id=None, keyword=None, retailer_id=None, retailer_ids=None, retailer_location_id=None, retailer_location_ids=None, exclude_retailer_location_ids=None, offer_id=None, offer_ids=None, offer_location_id=None, offer_location_ids=None, offer_type=None, offer_types=None, special_offer_type=None, special_offer_types=None, category_ids=None, filter_ids=None, offer_audience_ids=None, sort_field=None, descending=None, start=None, limit=None, latitude=None, longitude=None, redeemable_start_date=None, redeemable_end_date=None, filter_by_parent_offer=None, started_since=None, started_before=None, ended_since=None, ended_before=None, redeemed=None, statuses=None, reservations_only=None, active_only=None, return_full_response=None, recurring_started_since=None, recurring_started_before=None, recurring_expiration_since=None, recurring_expiration_before=None):  # noqa: E501
    """Search Wallet Offers

    Search on active offers currently in the user&#39;s wallet, or past offers the user has already redeemed. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param keyword: The keyword to search for
    :type keyword: str
    :param retailer_id: Filter results for this retailer
    :type retailer_id: int
    :param retailer_ids: Filter results for a list of retailers
    :type retailer_ids: str
    :param retailer_location_id: Filter results for this retailer location
    :type retailer_location_id: int
    :param retailer_location_ids: Filter results for a list of retailer locations
    :type retailer_location_ids: str
    :param exclude_retailer_location_ids: Filter results to exclude retailer locations
    :type exclude_retailer_location_ids: str
    :param offer_id: Filter results for this offer
    :type offer_id: int
    :param offer_ids: Filter results for a list of offer
    :type offer_ids: str
    :param offer_location_id: Filter results for this offer location
    :type offer_location_id: int
    :param offer_location_ids: Filter results for a list of offer locations
    :type offer_location_ids: str
    :param offer_type: Filter results to return a specific offer type
    :type offer_type: str
    :param offer_types: Filter results to return specific offer types
    :type offer_types: str
    :param special_offer_type: Filter results to return a specific special offer type
    :type special_offer_type: str
    :param special_offer_types: Filter results to return specific special offer types
    :type special_offer_types: str
    :param category_ids: Category Ids
    :type category_ids: str
    :param filter_ids: Filter Ids
    :type filter_ids: str
    :param offer_audience_ids: Offer Audience Ids
    :type offer_audience_ids: str
    :param sort_field: Determines what to sort the results by
    :type sort_field: str
    :param descending: Determines whether the results are in descending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param latitude: The latitude location of the user
    :type latitude: float
    :param longitude: The latitude location of the user
    :type longitude: float
    :param redeemable_start_date: Filter results by the offer redeemable date
    :type redeemable_start_date: int
    :param redeemable_end_date: Filter results by the offer redeemable date
    :type redeemable_end_date: int
    :param filter_by_parent_offer: Apply params to offer&#39;s parent
    :type filter_by_parent_offer: bool
    :param started_since: Filter results by the offer start date
    :type started_since: int
    :param started_before: Filter results by the offer start date
    :type started_before: int
    :param ended_since: Filter results by the offer end date
    :type ended_since: int
    :param ended_before: Filter results by the offer end date
    :type ended_before: int
    :param redeemed: If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)
    :type redeemed: bool
    :param statuses: Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)
    :type statuses: str
    :param reservations_only: Returns only reservation transactions if true
    :type reservations_only: bool
    :param active_only: Active Only
    :type active_only: bool
    :param return_full_response: Determines whether to return a detailed version of the response
    :type return_full_response: bool
    :param recurring_started_since: Filter results by the recurring billing start date
    :type recurring_started_since: int
    :param recurring_started_before: Filter results by the recurring billing start date
    :type recurring_started_before: int
    :param recurring_expiration_since: Filter results by the recurring billing expiration date
    :type recurring_expiration_since: int
    :param recurring_expiration_before: Filter results by the recurring billing expiration date
    :type recurring_expiration_before: int

    :rtype: Union[List[OfferTransactionResponse], Tuple[List[OfferTransactionResponse], int], Tuple[List[OfferTransactionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_offer_transaction(version, transaction_id, status, device_id=None, account_id=None, offer_location_id=None, currency_type=None, use_points=None, app_key=None, latitude=None, longitude=None, meta_data=None, return_full_response=None, exception_membership_offer_ids=None):  # noqa: E501
    """Update Wallet Offer

    Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point. # noqa: E501

    :param version: 
    :type version: 
    :param transaction_id: The offer transaction id to remove
    :type transaction_id: int
    :param status: The status value to change to (0 or 1)
    :type status: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param offer_location_id: Offer Location Id
    :type offer_location_id: int
    :param currency_type: Currency Type
    :type currency_type: str
    :param use_points: Use Points
    :type use_points: bool
    :param app_key: App Key
    :type app_key: str
    :param latitude: The latitude location of the user
    :type latitude: float
    :param longitude: The latitude location of the user
    :type longitude: float
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param return_full_response: Determines whether to return a detailed version of the response
    :type return_full_response: bool
    :param exception_membership_offer_ids: Exception Offers, transaction audiences of these offers won&#39;t be removed out of the account when up
    :type exception_membership_offer_ids: str

    :rtype: Union[OfferTransactionResponse, Tuple[OfferTransactionResponse, int], Tuple[OfferTransactionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
