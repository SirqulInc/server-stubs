import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.media_offer_response import MediaOfferResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_media(version, account_id, title, barcode_type, no_expiration, available_limit, available_limit_per_user, added_limit, view_limit, max_prints, ticket_price, full_price, discount_price, special_offer_type, offer_visibility, active, retailer_location_ids=None, sub_title=None, details=None, sub_details=None, fine_print=None, barcode_entry=None, external_redeem_options=None, external_url=None, tickets_reward_type=None, tickets_reward=None, activated=None, expires=None, ticket_price_type=None, show_remaining=None, show_redeemed=None, replaced=None, featured=None, category_ids=None, filter_ids=None, barcode_asset_id=None, image_asset_id=None, image_asset_id1=None, image_asset_id2=None, image_asset_id3=None, image_asset_id4=None, image_asset_id5=None, publisher=None, redeemable_start=None, redeemable_end=None, condition_type=None, isbn=None, asin=None, catalog_numbers=None, parental_rating=None, availability_date=None, media_type=None, duration=None, author=None, release_date=None, collection_ids=None, availability=None, availability_summary=None):  # noqa: E501
    """Create Media

    Create a media offering. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
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
    :param special_offer_type: The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    :type special_offer_type: str
    :param offer_visibility: The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    :type offer_visibility: str
    :param active: Sets the active flag
    :type active: bool
    :param retailer_location_ids: Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    :type retailer_location_ids: str
    :param sub_title: The sub title (255 char limit)
    :type sub_title: str
    :param details: The details of the media
    :type details: str
    :param sub_details: A string for custom details (255 char limit)
    :type sub_details: str
    :param fine_print: The fine print of the media
    :type fine_print: str
    :param barcode_entry: The bar code entry string
    :type barcode_entry: str
    :param external_redeem_options: An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    :type external_redeem_options: str
    :param external_url: The clickUrl of the offer
    :type external_url: str
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
    :param show_remaining: show how many of the media is remaining (if there is a limit)
    :type show_remaining: bool
    :param show_redeemed: show how many of the media has been redeemed
    :type show_redeemed: bool
    :param replaced: if the media has been replaced
    :type replaced: bool
    :param featured: if the media should be featured or not
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
    :param condition_type: The condition type of the media
    :type condition_type: str
    :param isbn: The ISBN id
    :type isbn: str
    :param asin: The ASIN id
    :type asin: str
    :param catalog_numbers: The list of catelog numbers, comma seperated
    :type catalog_numbers: str
    :param parental_rating: The parental control rating
    :type parental_rating: str
    :param availability_date: The date the media is available to use
    :type availability_date: int
    :param media_type: the media type
    :type media_type: str
    :param duration: The total playing time of the media item
    :type duration: int
    :param author: The created/author of the media item
    :type author: str
    :param release_date: The date/time of when the media item was originally released
    :type release_date: int
    :param collection_ids: the IDs of the collections this media should be assigned to
    :type collection_ids: str
    :param availability: ability to assign if this media should active or not
    :type availability: str
    :param availability_summary: ability to assign when the media expires
    :type availability_summary: str

    :rtype: Union[MediaOfferResponse, Tuple[MediaOfferResponse, int], Tuple[MediaOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_media(version, account_id, media_id):  # noqa: E501
    """Delete Media

    Delete a media offering that the user has permissions to. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param media_id: the ID of the media to delete
    :type media_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_media(version, account_id, media_id):  # noqa: E501
    """Media Get

    Get a media offering. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param media_id: the id of the media to get
    :type media_id: int

    :rtype: Union[MediaOfferResponse, Tuple[MediaOfferResponse, int], Tuple[MediaOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_media(version, account_id, active_only, sort_field, descending, keyword=None, category_ids=None, filter_ids=None, start=None, limit=None):  # noqa: E501
    """Search Media

    Searches on events that the account has access to. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param active_only: Return only active results
    :type active_only: bool
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, AVAILABILITY_DATE, RELEASE_DATE
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param keyword: The keyword used to search
    :type keyword: str
    :param category_ids: 
    :type category_ids: str
    :param filter_ids: 
    :type filter_ids: str
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int

    :rtype: Union[List[MediaOfferResponse], Tuple[List[MediaOfferResponse], int], Tuple[List[MediaOfferResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_media(version, account_id, media_id, retailer_location_ids=None, offer_locations=None, title=None, sub_title=None, details=None, sub_details=None, fine_print=None, barcode_type=None, barcode_entry=None, external_redeem_options=None, external_url=None, tickets_reward_type=None, tickets_reward=None, activated=None, expires=None, no_expiration=None, available_limit=None, available_limit_per_user=None, added_limit=None, view_limit=None, max_prints=None, ticket_price_type=None, ticket_price=None, full_price=None, discount_price=None, show_remaining=None, show_redeemed=None, replaced=None, featured=None, special_offer_type=None, offer_visibility=None, category_ids=None, filter_ids=None, active=None, barcode_asset_id=None, image_asset_id=None, image_asset_id1=None, image_asset_id2=None, image_asset_id3=None, image_asset_id4=None, image_asset_id5=None, publisher=None, redeemable_start=None, redeemable_end=None, condition_type=None, isbn=None, asin=None, catalog_numbers=None, availability_date=None, parental_rating=None, media_type=None, duration=None, author=None, release_date=None, collection_ids=None, availability=None, availability_summary=None):  # noqa: E501
    """Update Media

    Update a media offering. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)
    :type account_id: int
    :param media_id: 
    :type media_id: int
    :param retailer_location_ids: Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    :type retailer_location_ids: str
    :param offer_locations: A list of json data that has offer location specific values.
    :type offer_locations: str
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
    :param show_remaining: The show remaining
    :type show_remaining: bool
    :param show_redeemed: The show redeemed
    :type show_redeemed: bool
    :param replaced: The replaced
    :type replaced: bool
    :param featured: The featured
    :type featured: bool
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
    :param condition_type: The condition. OfferType PRODUCT only.
    :type condition_type: str
    :param isbn: The ISBN id. OfferType PRODUCT only.
    :type isbn: str
    :param asin: The ASIN id. OfferType PRODUCT only.
    :type asin: str
    :param catalog_numbers: The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    :type catalog_numbers: str
    :param availability_date: The date available. OfferType PRODUCT only.
    :type availability_date: int
    :param parental_rating: The parental control rating. OfferType PRODUCT only.
    :type parental_rating: str
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
    :param availability: 
    :type availability: str
    :param availability_summary: 
    :type availability_summary: str

    :rtype: Union[MediaOfferResponse, Tuple[MediaOfferResponse, int], Tuple[MediaOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
