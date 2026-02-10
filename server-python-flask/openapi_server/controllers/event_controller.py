import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.event_attendance_response import EventAttendanceResponse  # noqa: E501
from openapi_server.models.offer_response import OfferResponse  # noqa: E501
from openapi_server.models.offer_short_response import OfferShortResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def attend_event(version, device_id=None, account_id=None, app_key=None, listing_id=None, retailer_location_id=None, offer_location_id=None, transaction_id=None, status=None, latitude=None, longitude=None):  # noqa: E501
    """Attend Event

     Specify whether the user is attending an event at a particular location. This can also be used as a \&quot;check-in\&quot; action. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id (deviceId or accountId required)
    :type account_id: int
    :param app_key: The application of where to send notifications about the attend action
    :type app_key: str
    :param listing_id: The scheduled broadcast or marketing experience id
    :type listing_id: int
    :param retailer_location_id: The retailer location where the event is being held
    :type retailer_location_id: int
    :param offer_location_id: The actual event being held
    :type offer_location_id: int
    :param transaction_id: The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId
    :type transaction_id: int
    :param status: Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)
    :type status: int
    :param latitude: The location of the status update
    :type latitude: float
    :param longitude: The location of the status update
    :type longitude: float

    :rtype: Union[OfferResponse, Tuple[OfferResponse, int], Tuple[OfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_event(version, account_id, title, retailer_location_ids=None, sub_title=None, details=None, category_ids=None, filter_ids=None, active=None, image_asset_id=None, redeemable_start=None, redeemable_end=None, meta_data=None):  # noqa: E501
    """Create Event

    Create a private event to share with associates. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param title: The event title
    :type title: str
    :param retailer_location_ids: The retailer location to have the event at
    :type retailer_location_ids: str
    :param sub_title: The event sub title
    :type sub_title: str
    :param details: The event details
    :type details: str
    :param category_ids: The categories the associate the event with
    :type category_ids: str
    :param filter_ids: The filters the associate the event with
    :type filter_ids: str
    :param active: Is this event active
    :type active: bool
    :param image_asset_id: The image to show for the event
    :type image_asset_id: int
    :param redeemable_start: The event start date/time
    :type redeemable_start: int
    :param redeemable_end: The event end date/time
    :type redeemable_end: int
    :param meta_data: external custom client defined data
    :type meta_data: str

    :rtype: Union[OfferResponse, Tuple[OfferResponse, int], Tuple[OfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_event(version, account_id, event_id):  # noqa: E501
    """Delete Event

    Delete an event that the user has permissions to. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param event_id: the id of the event to update
    :type event_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_event(version, account_id, event_id):  # noqa: E501
    """Get Event

    Get an event. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param event_id: The id of the event to return
    :type event_id: int

    :rtype: Union[OfferResponse, Tuple[OfferResponse, int], Tuple[OfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_event_transactions(version, device_id=None, account_id=None, app_key=None, keyword=None, retailer_id=None, retailer_location_id=None, exclude_retailer_location_id=None, listing_id=None, offer_id=None, offer_location_id=None, customer_account_ids=None, affiliated_category_ids=None, start_date=None, end_date=None, statuses=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search Event Attendance

    Searches on event type transactions. This can be used to see who is attending an event. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param keyword: The keyword to search for
    :type keyword: str
    :param retailer_id: Filter results for this retailer
    :type retailer_id: int
    :param retailer_location_id: Filter results for this retailer location
    :type retailer_location_id: int
    :param exclude_retailer_location_id: Exclude results from this retailer location
    :type exclude_retailer_location_id: int
    :param listing_id: Filter results for this event listing
    :type listing_id: int
    :param offer_id: Filter results for this offer
    :type offer_id: int
    :param offer_location_id: Filter results for this offer location
    :type offer_location_id: int
    :param customer_account_ids: Filter results by accounts
    :type customer_account_ids: str
    :param affiliated_category_ids: Comma separated list of category ids to determine whether the attendee is affiliated with the category
    :type affiliated_category_ids: str
    :param start_date: Filter on attendance starting on or after this date (milliseconds since epoch)
    :type start_date: int
    :param end_date: Filter on attendance starting on or before this date (milliseconds since epoch)
    :type end_date: int
    :param statuses: Comma separated list of transaction statuses to filter on
    :type statuses: str
    :param sort_field: Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    :type sort_field: str
    :param descending: Determines whether the results are in descending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int

    :rtype: Union[List[EventAttendanceResponse], Tuple[List[EventAttendanceResponse], int], Tuple[List[EventAttendanceResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_events(version, account_id, keyword=None, active_only=None, category_ids=None, filter_ids=None, offer_audience_ids=None, transaction_audience_ids=None, sort_field=None, descending=None, start_date=None, end_date=None, start=None, limit=None):  # noqa: E501
    """Search Events

    Searches on events that the account has access to. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param keyword: The keyword used to search
    :type keyword: str
    :param active_only: Return only active results
    :type active_only: bool
    :param category_ids: the IDs of the categories that this event is associated with
    :type category_ids: str
    :param filter_ids: the IDs of the filters that this event is associated with
    :type filter_ids: str
    :param offer_audience_ids: Offer audience ids to filter on
    :type offer_audience_ids: str
    :param transaction_audience_ids: Transaction audience ids to filter on
    :type transaction_audience_ids: str
    :param sort_field: The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start_date: Filter the events to return only those that start on or after the date
    :type start_date: int
    :param end_date: Filter the events to return only those that start on or before the date
    :type end_date: int
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int

    :rtype: Union[List[OfferShortResponse], Tuple[List[OfferShortResponse], int], Tuple[List[OfferShortResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_event(version, account_id, event_id, retailer_location_ids=None, title=None, sub_title=None, details=None, category_ids=None, filter_ids=None, active=None, image_asset_id=None, redeemable_start=None, redeemable_end=None):  # noqa: E501
    """Update Event

    Update a private event to share with associates. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param event_id: The id of the event to update
    :type event_id: int
    :param retailer_location_ids: The retailer location to have the event at
    :type retailer_location_ids: str
    :param title: The event title
    :type title: str
    :param sub_title: The event sub title
    :type sub_title: str
    :param details: The event details
    :type details: str
    :param category_ids: The categories the associate the event with
    :type category_ids: str
    :param filter_ids: The filters the associate the event with
    :type filter_ids: str
    :param active: Is this event active
    :type active: bool
    :param image_asset_id: The image to show for the event
    :type image_asset_id: int
    :param redeemable_start: The event start date/time
    :type redeemable_start: int
    :param redeemable_end: The event end date/time
    :type redeemable_end: int

    :rtype: Union[OfferResponse, Tuple[OfferResponse, int], Tuple[OfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
