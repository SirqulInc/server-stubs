import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.count_response import CountResponse  # noqa: E501
from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.ticket_list_response import TicketListResponse  # noqa: E501
from openapi_server.models.ticket_offer_response import TicketOfferResponse  # noqa: E501
from openapi_server import util


def get_ticket_count(version, device_id=None, account_id=None, game_type=None, app_key=None, ticket_type=None):  # noqa: E501
    """Get Ticket Count

    Gets the ticket count. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the id of the device that owns the tickets
    :type device_id: str
    :param account_id: the id of the account that owns the tickets
    :type account_id: int
    :param game_type: this is deprecated.
    :type game_type: str
    :param app_key: the applicationkey
    :type app_key: str
    :param ticket_type: the type of ticket
    :type ticket_type: str

    :rtype: Union[CountResponse, Tuple[CountResponse, int], Tuple[CountResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ticket_list(version, device_id=None, account_id=None, ticket_object_type=None, action_type=None, ticket_ids=None, object_ids=None, receipt_tokens=None, game_type=None, app_key=None):  # noqa: E501
    """Get Ticket List

    Gets the list of tickets. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: the id of the device that owns the tickets
    :type device_id: str
    :param account_id: the id of the account that owns the tickets
    :type account_id: int
    :param ticket_object_type: comma separated list of TicketObjectType
    :type ticket_object_type: str
    :param action_type: comma separated list of TicketActionType
    :type action_type: str
    :param ticket_ids: the ids of the tickets to get
    :type ticket_ids: str
    :param object_ids: the ids of the objects to get
    :type object_ids: str
    :param receipt_tokens: 
    :type receipt_tokens: str
    :param game_type: 
    :type game_type: str
    :param app_key: the application key
    :type app_key: str

    :rtype: Union[TicketListResponse, Tuple[TicketListResponse, int], Tuple[TicketListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def gift_purchase(version, receiver_account_id, ticket_id, device_id=None, account_id=None, asset_id=None, custom_message=None, game_type=None, app_key=None):  # noqa: E501
    """Gift Tickets

    Gift tickets to another user. # noqa: E501

    :param version: 
    :type version: 
    :param receiver_account_id: the id of the account receiving the tickets
    :type receiver_account_id: int
    :param ticket_id: the id of the tickets
    :type ticket_id: int
    :param device_id: the id of the device
    :type device_id: str
    :param account_id: the id of the gift owner
    :type account_id: int
    :param asset_id: the id of the asset
    :type asset_id: int
    :param custom_message: a message that can be written to go along with the gift
    :type custom_message: str
    :param game_type: the type of game associated with the tickets
    :type game_type: str
    :param app_key: the application key
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def save_ticket(version, action_type, ticket_object_type, return_nulls=None, device_id=None, account_id=None, game_type=None, app_key=None, object_id=None, purchase_code=None, receipt_token=None, receipt_data=None, count=None, ticket_type=None, purchase_provider=None, purchase_type=None, return_profile_response=None, include_profile_response=None, app_version=None):  # noqa: E501
    """Save Ticket

    Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system. # noqa: E501

    :param version: 
    :type version: 
    :param action_type: the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER
    :type action_type: str
    :param ticket_object_type: the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM
    :type ticket_object_type: str
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param device_id: the device id that owns the tickets
    :type device_id: str
    :param account_id: the account id that owns the tickets
    :type account_id: int
    :param game_type: This parameter is deprecated. deprecated, use the appKey
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param object_id: the ID of the item being purchased
    :type object_id: int
    :param purchase_code: a unique string identifier defined by the application owner or Executive
    :type purchase_code: str
    :param receipt_token: a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)
    :type receipt_token: str
    :param receipt_data: the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.
    :type receipt_data: str
    :param count: the count of tickets
    :type count: int
    :param ticket_type: the ticket type
    :type ticket_type: str
    :param purchase_provider: the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}
    :type purchase_provider: str
    :param purchase_type: a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }
    :type purchase_type: str
    :param return_profile_response: returns a ProfileResponse if true, otherwise will return an AppResponse
    :type return_profile_response: bool
    :param include_profile_response: if returnProfileResponse is false, will return an AppResponse with profile data if true
    :type include_profile_response: bool
    :param app_version: the application version
    :type app_version: str

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def save_ticket_via_file_upload(version, action_type, ticket_object_type, receipt_data, return_nulls=None, device_id=None, account_id=None, game_type=None, app_key=None, object_id=None, purchase_code=None, receipt_token=None, count=None, ticket_type=None, purchase_provider=None, purchase_type=None, return_profile_response=None, include_profile_response=None, app_version=None):  # noqa: E501
    """Save Ticket with Reciept

    Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post # noqa: E501

    :param version: 
    :type version: 
    :param action_type: the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }
    :type action_type: str
    :param ticket_object_type: the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}
    :type ticket_object_type: str
    :param receipt_data: the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.
    :type receipt_data: str
    :param return_nulls: whether to return nulls or not
    :type return_nulls: bool
    :param device_id: the device id
    :type device_id: str
    :param account_id: the account id
    :type account_id: int
    :param game_type: This parameter is deprecated. deprecated, use the appKey
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param object_id: the ID of the item being purchased
    :type object_id: int
    :param purchase_code: a unique string identifier defined by the application owner or Executive
    :type purchase_code: str
    :param receipt_token: a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)
    :type receipt_token: str
    :param count: the count of tickets
    :type count: int
    :param ticket_type: the ticket type
    :type ticket_type: str
    :param purchase_provider: the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}
    :type purchase_provider: str
    :param purchase_type: a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }
    :type purchase_type: str
    :param return_profile_response: returns a ProfileResponse if true, otherwise will return an AppResponse
    :type return_profile_response: bool
    :param include_profile_response: if returnProfileResponse is false, will return an AppResponse with profile data if true
    :type include_profile_response: bool
    :param app_version: the application version
    :type app_version: str

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def ticket_offers(version):  # noqa: E501
    """Get Ticket Offers

    Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer. # noqa: E501

    :param version: 
    :type version: 

    :rtype: Union[TicketOfferResponse, Tuple[TicketOfferResponse, int], Tuple[TicketOfferResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
