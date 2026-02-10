import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.list_count_response import ListCountResponse  # noqa: E501
from openapi_server.models.offer_list_response import OfferListResponse  # noqa: E501
from openapi_server.models.offer_response import OfferResponse  # noqa: E501
from openapi_server.models.offer_short_response import OfferShortResponse  # noqa: E501
from openapi_server.models.offer_transaction_response import OfferTransactionResponse  # noqa: E501
from openapi_server.models.retailer_offer_response import RetailerOfferResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def batch_update_offer_locations(version, data, device_id=None, account_id=None):  # noqa: E501
    """Update Offer Locations

    Batch update offer locations. # noqa: E501

    :param version: 
    :type version: 
    :param data: JSON string in the following format: &#x60;&#x60;&#x60;json [{   \&quot;offerLocationId\&quot;: 1705,   \&quot;latitude\&quot;: 54.0,   \&quot;longitude\&quot;: -122.0,   \&quot;altitude\&quot;: 1.0,   \&quot;locationDetail\&quot;: \&quot;floor 1\&quot;,   \&quot;locationDescription\&quot;: \&quot;behind the Coke sign\&quot; }, {   \&quot;offerLocationId\&quot;: 1704,   \&quot;latitude\&quot;: 54.1,   \&quot;longitude\&quot;: -122.1 }] &#x60;&#x60;&#x60; 
    :type data: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_offer(version, include_offer_locations, title, barcode_type, no_expiration, available_limit, available_limit_per_user, added_limit, view_limit, max_prints, ticket_price, full_price, discount_price, offer_type, special_offer_type, offer_visibility, active, device_id=None, account_id=None, tags=None, parent_offer_id=None, retailer_location_ids=None, offer_locations=None, sub_title=None, details=None, sub_details=None, fine_print=None, barcode_entry=None, external_redeem_options=None, external_url=None, external_id=None, tickets_reward_type=None, tickets_reward=None, activated=None, expires=None, ticket_price_type=None, show_remaining=None, show_redeemed=None, replaced=None, featured=None, category_ids=None, filter_ids=None, barcode_asset_id=None, image_asset_id=None, image_asset_id1=None, image_asset_id2=None, image_asset_id3=None, image_asset_id4=None, image_asset_id5=None, publisher=None, redeemable_start=None, redeemable_end=None, brand=None, product_type=None, condition_type=None, isbn=None, asin=None, catalog_numbers=None, department=None, features=None, minimum_price=None, width=None, height=None, depth=None, weight=None, unit=None, studio=None, parental_rating=None, publish_date=None, availability_date=None, size_id=None, listing_id=None, media_type=None, duration=None, author=None, release_date=None, collection_ids=None, reboot_time_hour=None, reboot_time_minute=None, idle_timeout_in_second=None, serial_number=None, udid=None, device_type=None, device_power=None, device_interference=None, availability=None, availability_summary=None):  # noqa: E501
    """Create Offer

    Create an offer and assign it to the provided retailer locations. # noqa: E501

    :param version: 
    :type version: 
    :param include_offer_locations: If true return all the offer locations associated with the offer
    :type include_offer_locations: bool
    :param title: The title (255 char limit)
    :type title: str
    :param barcode_type: The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    :type barcode_type: str
    :param no_expiration: Overrides the expiration date so that the offer does not expire
    :type no_expiration: bool
    :param available_limit: The limit of how many times the offer can be used by consumers
    :type available_limit: int
    :param available_limit_per_user: The limit of how many times a user can used the same offer
    :type available_limit_per_user: int
    :param added_limit: The limit of how many times the offer can be added to consumer wallets
    :type added_limit: int
    :param view_limit: The limit of how many times the offer can be viewed
    :type view_limit: int
    :param max_prints: The maximum number of times the offer can be printed
    :type max_prints: int
    :param ticket_price: The cost of the offer in tickets
    :type ticket_price: int
    :param full_price: The retail/full price cost of the offer in real currency
    :type full_price: float
    :param discount_price: The cost of the offer at a discounted price (what the consumer pays)
    :type discount_price: float
    :param offer_type: The offer type {VOUCHER, COUPON, PRODUCT, EVENT, MEDIA, DEVICE}
    :type offer_type: str
    :param special_offer_type: The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    :type special_offer_type: str
    :param offer_visibility: The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    :type offer_visibility: str
    :param active: Sets the active flag
    :type active: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id (deviceId or accountId required)
    :type account_id: int
    :param tags: Custom string field for doing full-text searches
    :type tags: str
    :param parent_offer_id: the parent offer id
    :type parent_offer_id: int
    :param retailer_location_ids: Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    :type retailer_location_ids: str
    :param offer_locations: A list of json data that has offer location specific values.
    :type offer_locations: str
    :param sub_title: The sub title (255 char limit)
    :type sub_title: str
    :param details: The details
    :type details: str
    :param sub_details: A string for custom details (255 char limit)
    :type sub_details: str
    :param fine_print: The fine print
    :type fine_print: str
    :param barcode_entry: The bar code entry string
    :type barcode_entry: str
    :param external_redeem_options: An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    :type external_redeem_options: str
    :param external_url: The clickUrl of the offer
    :type external_url: str
    :param external_id: an external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    :type external_id: str
    :param tickets_reward_type: The type of ticket to reward, null means default type
    :type tickets_reward_type: str
    :param tickets_reward: Determines how many tickets are awarded
    :type tickets_reward: int
    :param activated: The date of when the offer will be visible to consumers
    :type activated: int
    :param expires: The date of when the offer expires
    :type expires: int
    :param ticket_price_type: the type of ticket needed to buy offer
    :type ticket_price_type: str
    :param show_remaining: show remaining offers available
    :type show_remaining: bool
    :param show_redeemed: show how many offers have been redeemed
    :type show_redeemed: bool
    :param replaced: 
    :type replaced: bool
    :param featured: flag if offer is featured or not
    :type featured: bool
    :param category_ids: Comma separated list of category ids
    :type category_ids: str
    :param filter_ids: Comma separated list of filter ids
    :type filter_ids: str
    :param barcode_asset_id: The id of the barcode asset
    :type barcode_asset_id: int
    :param image_asset_id: The id of the an offer asset
    :type image_asset_id: int
    :param image_asset_id1: The id of the an offer asset
    :type image_asset_id1: int
    :param image_asset_id2: The id of the an offer asset
    :type image_asset_id2: int
    :param image_asset_id3: The id of the an offer asset
    :type image_asset_id3: int
    :param image_asset_id4: The id of the an offer asset
    :type image_asset_id4: int
    :param image_asset_id5: The id of the an offer asset
    :type image_asset_id5: int
    :param publisher: The maker of the item.
    :type publisher: str
    :param redeemable_start: The redeemable start date/time of the offer.
    :type redeemable_start: int
    :param redeemable_end: The redeemable start date/time of the offer.
    :type redeemable_end: int
    :param brand: The brand. OfferType PRODUCT only.
    :type brand: str
    :param product_type: The product type. OfferType PRODUCT only.
    :type product_type: str
    :param condition_type: The condition. OfferType PRODUCT only.
    :type condition_type: str
    :param isbn: The ISBN id. OfferType PRODUCT only.
    :type isbn: str
    :param asin: The ASIN id. OfferType PRODUCT only.
    :type asin: str
    :param catalog_numbers: The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    :type catalog_numbers: str
    :param department: The department name. The OfferType PRODUCT only.
    :type department: str
    :param features: The list of features, comma seperated. OfferType PRODUCT only.
    :type features: str
    :param minimum_price: The MAP price. OfferType PRODUCT only.
    :type minimum_price: float
    :param width: The width of the item. OfferType PRODUCT only.
    :type width: float
    :param height: The height of the item. OfferType PRODUCT only.
    :type height: float
    :param depth: The depth of the item. OfferType PRODUCT only.
    :type depth: float
    :param weight: The weight of the item. OfferType PRODUCT only.
    :type weight: float
    :param unit: The unit of measurement. OfferType PRODUCT only.
    :type unit: str
    :param studio: The studio name. OfferType PRODUCT only.
    :type studio: str
    :param parental_rating: The parental control rating. OfferType PRODUCT only.
    :type parental_rating: str
    :param publish_date: The date published. OfferType PRODUCT only.
    :type publish_date: int
    :param availability_date: The date available. OfferType PRODUCT only.
    :type availability_date: int
    :param size_id: 
    :type size_id: int
    :param listing_id: The ID of the event listing
    :type listing_id: int
    :param media_type: the media type of the offer
    :type media_type: str
    :param duration: The total playing time of the media item. OfferType MEDIA only.
    :type duration: int
    :param author: The created/author of the media item. OfferType MEDIA only.
    :type author: str
    :param release_date: The date/time of when the media item was originally released. OfferType MEDIA only.
    :type release_date: int
    :param collection_ids: 
    :type collection_ids: str
    :param reboot_time_hour: The reboot hour time ranging from 0 to 23
    :type reboot_time_hour: int
    :param reboot_time_minute: The reboot minute time ranging from 0 to 59
    :type reboot_time_minute: int
    :param idle_timeout_in_second: If the device is idle for idleTimeoutInSecond then the device should timeout
    :type idle_timeout_in_second: int
    :param serial_number: The serial number on the device
    :type serial_number: str
    :param udid: The unique device id for the device
    :type udid: str
    :param device_type: The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.
    :type device_type: str
    :param device_power: Edysen device power level setting
    :type device_power: float
    :param device_interference: Edysen device inteference setting
    :type device_interference: float
    :param availability: 
    :type availability: str
    :param availability_summary: 
    :type availability_summary: str

    :rtype: Union[RetailerOfferResponse, Tuple[RetailerOfferResponse, int], Tuple[RetailerOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_offer(version, offer_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Offer

    Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp. # noqa: E501

    :param version: 
    :type version: 
    :param offer_id: The ID of the offer to be deleted
    :type offer_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the delete, must have rights to edit the offer.
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_offer_location(version, offer_location_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Offer Location

    Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp. # noqa: E501

    :param version: 
    :type version: 
    :param offer_location_id: The ID of the offer location to be deleted
    :type offer_location_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the delete, must have rights to edit the offer location.
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer(version, offer_id, include_offer_locations, device_id=None, account_id=None):  # noqa: E501
    """Get Offer

    Gets the details of an offer that the user has access to. # noqa: E501

    :param version: 
    :type version: 
    :param offer_id: The id of the offer
    :type offer_id: int
    :param include_offer_locations: 
    :type include_offer_locations: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[RetailerOfferResponse, Tuple[RetailerOfferResponse, int], Tuple[RetailerOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_details(version, device_id=None, account_id=None, offer_id=None, offer_location_id=None, distance=None, latitude=None, longitude=None, include_offer_locations=None, include_retailer_locations=None, include_child_offers=None):  # noqa: E501
    """Get Offer

    Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id for returning account information (i.e. favorites)
    :type device_id: str
    :param account_id: The account id for returning account information (i.e. favorites)
    :type account_id: int
    :param offer_id: The offer id (either offeLocationId or offerId must be provided)
    :type offer_id: int
    :param offer_location_id: The offer location id (either offeLocationId or offerId must be provided)
    :type offer_location_id: int
    :param distance: The distance of the offer from the user&#39;s current location (this is returned when the offer is searched)
    :type distance: float
    :param latitude: The latitude to calculate distance from the offer
    :type latitude: float
    :param longitude: The longitude to calculate distance from the offer
    :type longitude: float
    :param include_offer_locations: Determines whether to return offer locations for the offer
    :type include_offer_locations: bool
    :param include_retailer_locations: Determines whether to return the retailer location info for each offer location response (includeOfferLocations must also be true for this to work)
    :type include_retailer_locations: bool
    :param include_child_offers: Determines whether to include child offers in the response
    :type include_child_offers: bool

    :rtype: Union[OfferResponse, Tuple[OfferResponse, int], Tuple[OfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_list_counts(version, latitude, longitude, search_range=None, distance_unit=None):  # noqa: E501
    """Get Offers (Counts)

    Gets the offer list counts. # noqa: E501

    :param version: 
    :type version: 
    :param latitude: The latitude of where the search will center at
    :type latitude: float
    :param longitude: The longitude of where the search will center at
    :type longitude: float
    :param search_range: The range of the search
    :type search_range: 
    :param distance_unit: The units to use for distance calculations (e.g. MILES, KILOMETERS)
    :type distance_unit: str

    :rtype: Union[ListCountResponse, Tuple[ListCountResponse, int], Tuple[ListCountResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_location(version, offer_location_id=None, udid=None):  # noqa: E501
    """Get Offer Location

    Gets the offer location by offer location id or udid (of a device) # noqa: E501

    :param version: 
    :type version: 
    :param offer_location_id: the id of the offer location to get
    :type offer_location_id: int
    :param udid: the UDID of the device
    :type udid: str

    :rtype: Union[OfferShortResponse, Tuple[OfferShortResponse, int], Tuple[OfferShortResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_locations_for_retailers(version, sort_field, descending, start, limit, active_only, include_retailer_location, device_id=None, account_id=None, keyword=None, retailer_id=None, retailer_location_id=None, offer_type=None, special_offer_type=None, barcode_type=None, barcode_entry=None, isbn=None, asin=None, device_status=None, needs_notification_sent=None, last_notification_sent=None):  # noqa: E501
    """Search Offer Locations

    Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: The column to sort the results on. Default is \&quot;TITLE\&quot;, which will sort the results by the offer title. Possible input values: {CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, RETAILER_ID,RETAILER_LOCATION_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    :type sort_field: str
    :param descending: The order to return the results. Default is false, which will return the results in ascending order.
    :type descending: bool
    :param start: The index into the record set to start with. Default is 0.
    :type start: int
    :param limit: The total number of records to return. Default is 20.
    :type limit: int
    :param active_only: Determines whether to return only active results. Default is false.
    :type active_only: bool
    :param include_retailer_location: 
    :type include_retailer_location: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param keyword: The keyword used to search
    :type keyword: str
    :param retailer_id: Filter results for a specific retailer
    :type retailer_id: int
    :param retailer_location_id: Filter results for a specific retailer location
    :type retailer_location_id: int
    :param offer_type: Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    :type offer_type: str
    :param special_offer_type: Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    :type special_offer_type: str
    :param barcode_type: 
    :type barcode_type: str
    :param barcode_entry: 
    :type barcode_entry: str
    :param isbn: 
    :type isbn: str
    :param asin: 
    :type asin: str
    :param device_status: Edysen device status, running, warning, or down
    :type device_status: str
    :param needs_notification_sent: 
    :type needs_notification_sent: bool
    :param last_notification_sent: 
    :type last_notification_sent: int

    :rtype: Union[List[OfferShortResponse], Tuple[List[OfferShortResponse], int], Tuple[List[OfferShortResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offers_for_retailers(version, offer_visibility, sort_field, descending, start, limit, available_only, active_only, include_categories, include_filters, include_offer_locations, device_id=None, account_id=None, category_ids=None, filter_ids=None, q=None, keyword=None, retailer_id=None, retailer_location_id=None, coupon_type=None, offer_type=None, offer_types=None, special_offer_type=None, i=None, l=None, barcode_type=None, barcode_entry=None, isbn=None, asin=None, device_status=None, needs_notification_sent=None, last_notification_sent=None):  # noqa: E501
    """Search Offers

    Searches on offers that the account has access to. # noqa: E501

    :param version: 
    :type version: 
    :param offer_visibility: 
    :type offer_visibility: str
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int
    :param available_only: Return only results that are currently being promoted (is activated and not expired)
    :type available_only: bool
    :param active_only: Return only active results
    :type active_only: bool
    :param include_categories: 
    :type include_categories: bool
    :param include_filters: 
    :type include_filters: bool
    :param include_offer_locations: 
    :type include_offer_locations: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param category_ids: 
    :type category_ids: str
    :param filter_ids: 
    :type filter_ids: str
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param retailer_id: the id of the retailer
    :type retailer_id: int
    :param retailer_location_id: the id of the retailer location
    :type retailer_location_id: int
    :param coupon_type: This parameter is deprecated.
    :type coupon_type: str
    :param offer_type: This parameter is deprecated. Use offer types. Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    :type offer_type: str
    :param offer_types: Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}
    :type offer_types: str
    :param special_offer_type: Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    :type special_offer_type: str
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param barcode_type: 
    :type barcode_type: str
    :param barcode_entry: 
    :type barcode_entry: str
    :param isbn: 
    :type isbn: str
    :param asin: 
    :type asin: str
    :param device_status: Edysen device status
    :type device_status: str
    :param needs_notification_sent: 
    :type needs_notification_sent: bool
    :param last_notification_sent: 
    :type last_notification_sent: int

    :rtype: Union[List[OfferResponse], Tuple[List[OfferResponse], int], Tuple[List[OfferResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def redeem_offer_transaction(version, offer_transaction_id, status, device_id=None, account_id=None, offer_location_id=None):  # noqa: E501
    """Update Offer Transaction

    Redeems an offer. # noqa: E501

    :param version: 
    :type version: 
    :param offer_transaction_id: the OfferTransaction ID of the transaction being redeemed
    :type offer_transaction_id: int
    :param status: the status to set the offer transaction to - 1 sets it to redeemable and 2 sets it to redeemed
    :type status: int
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param offer_location_id: the OfferLocation ID where the offer is being redeemed
    :type offer_location_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_offer_transactions_for_retailers(version, sort_field, descending, start, limit, active_only, device_id=None, account_id=None, q=None, keyword=None, retailer_id=None, retailer_location_id=None, offer_id=None, offer_location_id=None, redeemed=None, reservations_only=None, coupon_type=None, offer_type=None, special_offer_type=None, customer_account_ids=None, category_ids=None, redeemable_start_date=None, redeemable_end_date=None, i=None, l=None):  # noqa: E501
    """Search Offer Transactions

    Searches on offer transactions for offers that the account has access to. # noqa: E501

    :param version: 
    :type version: 
    :param sort_field: Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    :type sort_field: str
    :param descending: Determines whether the results are in descending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param active_only: Determines whether to only return active offer transactions
    :type active_only: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: The keyword to search for
    :type keyword: str
    :param retailer_id: Filter results for this retailer
    :type retailer_id: int
    :param retailer_location_id: Filter results for this retailer location
    :type retailer_location_id: int
    :param offer_id: Filter results for this offer
    :type offer_id: int
    :param offer_location_id: Filter results for this offer location
    :type offer_location_id: int
    :param redeemed: if true return redeemed transactions (status 2), if false return active transactions (status 0 or 1)
    :type redeemed: bool
    :param reservations_only: returns only reservation transactions if true
    :type reservations_only: bool
    :param coupon_type: This parameter is deprecated.
    :type coupon_type: str
    :param offer_type: Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    :type offer_type: str
    :param special_offer_type: Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    :type special_offer_type: str
    :param customer_account_ids: Filter results by accounts
    :type customer_account_ids: str
    :param category_ids: 
    :type category_ids: str
    :param redeemable_start_date: 
    :type redeemable_start_date: int
    :param redeemable_end_date: 
    :type redeemable_end_date: int
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int

    :rtype: Union[List[OfferTransactionResponse], Tuple[List[OfferTransactionResponse], int], Tuple[List[OfferTransactionResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_offers_for_consumer(version, latitude, longitude, recommendation_type, location_id, start, limit, max_recommendations, distance_unit, app_key=None, device_id=None, account_id=None, search_range=None, tags=None, supported_postal_codes=None, keyword=None, categories=None, filters=None, offer_types=None, type=None, sort_field=None, recommend_offer_ids=None, retailer_location_ids=None, offer_id=None, include_mission=None, include_categories=None, include_filters=None, include_expired=None, include_favorite=None, closest_offer_only=None, search_expression=None, group_by=None):  # noqa: E501
    """Search Offers

    Searches for offers as a consumer. # noqa: E501

    :param version: 
    :type version: 
    :param latitude: The latitude of where the search will center at
    :type latitude: float
    :param longitude: The longitude of where the search will center at
    :type longitude: float
    :param recommendation_type: The method to use to gather recommendations: WALLET base relevance on items in users wallets CLICKS base relevance on items users have clicked on BLENDED blend using all methods available
    :type recommendation_type: str
    :param location_id: This parameter is deprecated. The location id
    :type location_id: int
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param max_recommendations: 
    :type max_recommendations: int
    :param distance_unit: 
    :type distance_unit: str
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param device_id: The device id for returning account information (i.e. offer transactions made by the user)
    :type device_id: str
    :param account_id: The account id for returning account information (i.e. offer transactions made by the user)
    :type account_id: int
    :param search_range: The range of the search
    :type search_range: float
    :param tags: Does a full-text search on tags
    :type tags: str
    :param supported_postal_codes: supported postal codes
    :type supported_postal_codes: str
    :param keyword: The keyword to filter results by
    :type keyword: str
    :param categories: Comma separate list of category ids
    :type categories: str
    :param filters: Comma separated list of filter ids
    :type filters: str
    :param offer_types: Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}
    :type offer_types: str
    :param type: The special offer type {ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    :type type: str
    :param sort_field: The field to sort the result set on:DISTANCE Sort the offers nearest to farthest BUSINESS_NAME Sort the offers alphabetically by location name SHUFFLE Sort the nearest offers randomly USERPREFS accountId must accompany this parameter. Gives the first X recommendations where X equals the parameter maxRecommendations
    :type sort_field: str
    :param recommend_offer_ids: Return recommendations based on these offers IDs
    :type recommend_offer_ids: str
    :param retailer_location_ids: Only return offer locations for the specific retailer locations.
    :type retailer_location_ids: str
    :param offer_id: Only return offer locations for the specific offer.
    :type offer_id: int
    :param include_mission: If true include the mission response as part of the offer. Default is false.
    :type include_mission: bool
    :param include_categories: If true include the category list response as part of the offer. Default is false.
    :type include_categories: bool
    :param include_filters: If true include the filter list response as part of the offer. Default is false.
    :type include_filters: bool
    :param include_expired: If true then ignore the expired dates. Default is false.
    :type include_expired: bool
    :param include_favorite: If true then ignore the favorite. Default is false.
    :type include_favorite: bool
    :param closest_offer_only: This parameter is deprecated. see groupBy. If true then it only returns the offer location for an offer closest to the given lat/lon
    :type closest_offer_only: bool
    :param search_expression: 
    :type search_expression: str
    :param group_by: groups the results by a certain field. For example, if you want to return the closest offer location of an offer, then pass in groupBy&#x3D;OFFER_ID and sortField&#x3D;DISTANCE (to sort by distance).
    :type group_by: str

    :rtype: Union[OfferListResponse, Tuple[OfferListResponse, int], Tuple[OfferListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def top_offer_transactions(version, start=None, limit=None):  # noqa: E501
    """Get Offers (Top)

    Gets the top active offers. # noqa: E501

    :param version: 
    :type version: 
    :param start: The index into the record set to start with. Default is 0.
    :type start: int
    :param limit: The total number of record to return. Default id 20.
    :type limit: int

    :rtype: Union[OfferListResponse, Tuple[OfferListResponse, int], Tuple[OfferListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_offer(version, offer_id, include_offer_locations, device_id=None, account_id=None, parent_offer_id=None, retailer_location_ids=None, offer_locations=None, tags=None, title=None, sub_title=None, details=None, sub_details=None, fine_print=None, barcode_type=None, barcode_entry=None, external_redeem_options=None, external_url=None, external_id=None, tickets_reward_type=None, tickets_reward=None, activated=None, expires=None, no_expiration=None, available_limit=None, available_limit_per_user=None, added_limit=None, view_limit=None, max_prints=None, ticket_price_type=None, ticket_price=None, full_price=None, discount_price=None, show_remaining=None, show_redeemed=None, replaced=None, featured=None, offer_type=None, special_offer_type=None, offer_visibility=None, category_ids=None, filter_ids=None, active=None, barcode_asset_id=None, image_asset_id=None, image_asset_id1=None, image_asset_id2=None, image_asset_id3=None, image_asset_id4=None, image_asset_id5=None, publisher=None, redeemable_start=None, redeemable_end=None, brand=None, product_type=None, condition_type=None, isbn=None, asin=None, catalog_numbers=None, department=None, features=None, minimum_price=None, width=None, height=None, depth=None, weight=None, unit=None, studio=None, parental_rating=None, publish_date=None, availability_date=None, size_id=None, listing_id=None, media_type=None, duration=None, author=None, release_date=None, collection_ids=None, reboot_time_hour=None, reboot_time_minute=None, idle_timeout_in_second=None, serial_number=None, udid=None, device_type=None, device_power=None, device_interference=None, availability=None, availability_summary=None):  # noqa: E501
    """Update Offer

    Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted. # noqa: E501

    :param version: 
    :type version: 
    :param offer_id: The offer to update
    :type offer_id: int
    :param include_offer_locations: If true return all the offer locations associated with the offer
    :type include_offer_locations: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)
    :type account_id: int
    :param parent_offer_id: 
    :type parent_offer_id: int
    :param retailer_location_ids: Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    :type retailer_location_ids: str
    :param offer_locations: A list of json data that has offer location specific values.
    :type offer_locations: str
    :param tags: Custom string field for doing full-text searches
    :type tags: str
    :param title: The title (255 char limit)
    :type title: str
    :param sub_title: The sub title (255 char limit)
    :type sub_title: str
    :param details: The details
    :type details: str
    :param sub_details: A string for custom details (255 char limit)
    :type sub_details: str
    :param fine_print: The fine print
    :type fine_print: str
    :param barcode_type: The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    :type barcode_type: str
    :param barcode_entry: The bar code entry string
    :type barcode_entry: str
    :param external_redeem_options: An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.
    :type external_redeem_options: str
    :param external_url: The clickUrl of the offer
    :type external_url: str
    :param external_id: 
    :type external_id: str
    :param tickets_reward_type: The type of ticket to reward, null means default type
    :type tickets_reward_type: str
    :param tickets_reward: Determines how many tickets are awarded
    :type tickets_reward: int
    :param activated: The date of when the offer will be visible to consumers
    :type activated: int
    :param expires: The date of when the offer expires
    :type expires: int
    :param no_expiration: Overrides the expiration date so that the offer does not expire
    :type no_expiration: bool
    :param available_limit: The limit of how many times the offer can be used by consumers
    :type available_limit: int
    :param available_limit_per_user: The limit of how many times a user can used the same offer
    :type available_limit_per_user: int
    :param added_limit: The limit of how many times the offer can be added to consumer wallets
    :type added_limit: int
    :param view_limit: 
    :type view_limit: int
    :param max_prints: The maximum number of times the offer can be printed
    :type max_prints: int
    :param ticket_price_type: the type of ticket needed to buy the offer
    :type ticket_price_type: str
    :param ticket_price: The cost of the offer in tickets
    :type ticket_price: int
    :param full_price: The retail/full price cost of the offer in real currency
    :type full_price: float
    :param discount_price: The cost of the offer at a discounted price (what the consumer pays)
    :type discount_price: float
    :param show_remaining: show remaining offers available
    :type show_remaining: bool
    :param show_redeemed: show how many offers have been redeemed
    :type show_redeemed: bool
    :param replaced: 
    :type replaced: bool
    :param featured: whether the offer is featured or not
    :type featured: bool
    :param offer_type: The offer type {VOUCHER, COUPON, PRODUCT, MEDIA, EVENT}
    :type offer_type: str
    :param special_offer_type: The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    :type special_offer_type: str
    :param offer_visibility: The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    :type offer_visibility: str
    :param category_ids: Comma separated list of category ids
    :type category_ids: str
    :param filter_ids: Comma separated list of filter ids
    :type filter_ids: str
    :param active: Sets the active flag
    :type active: bool
    :param barcode_asset_id: The id of the barcode asset
    :type barcode_asset_id: int
    :param image_asset_id: The id of the an offer asset
    :type image_asset_id: int
    :param image_asset_id1: The id of the an offer asset
    :type image_asset_id1: int
    :param image_asset_id2: The id of the an offer asset
    :type image_asset_id2: int
    :param image_asset_id3: The id of the an offer asset
    :type image_asset_id3: int
    :param image_asset_id4: The id of the an offer asset
    :type image_asset_id4: int
    :param image_asset_id5: The id of the an offer asset
    :type image_asset_id5: int
    :param publisher: The maker of the item.
    :type publisher: str
    :param redeemable_start: The redeemable start date/time of the offer.
    :type redeemable_start: int
    :param redeemable_end: The redeemable start date/time of the offer.
    :type redeemable_end: int
    :param brand: The brand. OfferType PRODUCT only.
    :type brand: str
    :param product_type: The product type. OfferType PRODUCT only.
    :type product_type: str
    :param condition_type: The condition. OfferType PRODUCT only.
    :type condition_type: str
    :param isbn: The ISBN id. OfferType PRODUCT only.
    :type isbn: str
    :param asin: The ASIN id. OfferType PRODUCT only.
    :type asin: str
    :param catalog_numbers: The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    :type catalog_numbers: str
    :param department: The department name. The OfferType PRODUCT only.
    :type department: str
    :param features: The list of features, comma seperated. OfferType PRODUCT only.
    :type features: str
    :param minimum_price: The MAP price. OfferType PRODUCT only.
    :type minimum_price: float
    :param width: The width of the item. OfferType PRODUCT only.
    :type width: float
    :param height: The height of the item. OfferType PRODUCT only.
    :type height: float
    :param depth: The depth of the item. OfferType PRODUCT only.
    :type depth: float
    :param weight: The weight of the item. OfferType PRODUCT only.
    :type weight: float
    :param unit: The unit of measurement. OfferType PRODUCT only.
    :type unit: str
    :param studio: The studio name. OfferType PRODUCT only.
    :type studio: str
    :param parental_rating: The parental control rating. OfferType PRODUCT only.
    :type parental_rating: str
    :param publish_date: The date published. OfferType PRODUCT only.
    :type publish_date: int
    :param availability_date: The date available. OfferType PRODUCT only.
    :type availability_date: int
    :param size_id: The size Id. OfferType PRODUCT only.
    :type size_id: int
    :param listing_id: The ID of the event listing
    :type listing_id: int
    :param media_type: 
    :type media_type: str
    :param duration: The total playing time of the media item. OfferType MEDIA only.
    :type duration: int
    :param author: The created/author of the media item. OfferType MEDIA only.
    :type author: str
    :param release_date: The date/time of when the media item was originally released. OfferType MEDIA only.
    :type release_date: int
    :param collection_ids: 
    :type collection_ids: str
    :param reboot_time_hour: The reboot hour time ranging from 0 to 23
    :type reboot_time_hour: int
    :param reboot_time_minute: The reboot minute time ranging from 0 to 59
    :type reboot_time_minute: int
    :param idle_timeout_in_second: If the device is idle for idleTimeoutInSecond then the device should timeout
    :type idle_timeout_in_second: int
    :param serial_number: The serial number on the device
    :type serial_number: str
    :param udid: The unique device id for the device
    :type udid: str
    :param device_type: The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.
    :type device_type: str
    :param device_power: RSSI reading at 1 meter from device (-10 to -140)
    :type device_power: float
    :param device_interference: 
    :type device_interference: float
    :param availability: 
    :type availability: str
    :param availability_summary: 
    :type availability_summary: str

    :rtype: Union[RetailerOfferResponse, Tuple[RetailerOfferResponse, int], Tuple[RetailerOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_offer_status(version, offer_ids, active, device_id=None, account_id=None):  # noqa: E501
    """Activate Offer

    Sets the activated date on offers. This will make offers visible for consumers. # noqa: E501

    :param version: 
    :type version: 
    :param offer_ids: Comma separated list of offer ids
    :type offer_ids: str
    :param active: Determines whether to make the offer active as well
    :type active: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account used to perform the activation, must have rights to edit the offer.
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
