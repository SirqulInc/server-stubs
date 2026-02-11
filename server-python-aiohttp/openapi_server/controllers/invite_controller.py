from typing import List, Dict
from aiohttp import web

from openapi_server.models.consumer_invite_response import ConsumerInviteResponse
from openapi_server.models.invite_response import InviteResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def accept_invite(request: web.Request, token, account_id, album_id=None, mission_id=None, album_contest_id=None, offer_id=None, offer_location_id=None, retailer_location_id=None, app_key=None, auto_friend=None, auto_attend_event=None, auto_favorite_offer=None, auto_favorite_offer_location=None, auto_favorite_retailer_location=None) -> web.Response:
    """Accept Invite

    Allows a user to accept an invite. The user could also become the inviter&#39;s friend.

    :param token: the invite token
    :type token: str
    :param account_id: the accountId of the user who is accepting the invite
    :type account_id: int
    :param album_id: the album id associated with this invite (if applicable)
    :type album_id: int
    :param mission_id: the mission id associated with this invite (if applicable)
    :type mission_id: int
    :param album_contest_id: the album contest id associated with this invite (if applicable)
    :type album_contest_id: int
    :param offer_id: the offer id associated with this invite (if applicable)
    :type offer_id: int
    :param offer_location_id: the offer location id associated with this invite (if applicable)
    :type offer_location_id: int
    :param retailer_location_id: the retailer location id associated with this invite (if applicable)
    :type retailer_location_id: int
    :param app_key: the application key
    :type app_key: str
    :param auto_friend: whether to auto-friend the invite sender and receiver
    :type auto_friend: bool
    :param auto_attend_event: whether to mark the event as attending automatically after invite is accepted
    :type auto_attend_event: bool
    :param auto_favorite_offer: whether to mark the offer as favorited automatically after invite is accepted
    :type auto_favorite_offer: bool
    :param auto_favorite_offer_location: whether to mark the offer location as favorited automatically after invite is accepted
    :type auto_favorite_offer_location: bool
    :param auto_favorite_retailer_location: whether to mark the retailer location as favorited automatically after invite is accepted
    :type auto_favorite_retailer_location: bool

    """
    return web.Response(status=200)


async def album_contest_invite(request: web.Request, device_id=None, account_id=None, app_id=None, app_key=None, album_contest_id=None, latitude=None, longitude=None) -> web.Response:
    """Invite to Contest

    Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param app_id: This parameter is deprecated.
    :type app_id: int
    :param app_key: the application key
    :type app_key: str
    :param album_contest_id: the album contest to share
    :type album_contest_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def album_invite(request: web.Request, device_id=None, account_id=None, app_id=None, app_key=None, album_id=None, latitude=None, longitude=None) -> web.Response:
    """Invite to Collection

    Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param app_id: This parameter is deprecated.
    :type app_id: int
    :param app_key: the application key
    :type app_key: str
    :param album_id: the album to share
    :type album_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def event_invite(request: web.Request, account_id, app_key, listing_id, receiver_account_ids=None, retailer_location_id=None) -> web.Response:
    """Invite to Event

    Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.

    :param account_id: the account ID of the user making the share
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param listing_id: The ID of the event listing
    :type listing_id: int
    :param receiver_account_ids: the account ID of a Sirqul user they would like to share an event with
    :type receiver_account_ids: str
    :param retailer_location_id: The retailer location id of where the event will take place
    :type retailer_location_id: int

    """
    return web.Response(status=200)


async def game_invite(request: web.Request, device_id=None, account_id=None, app_id=None, app_key=None, game_level_id=None, latitude=None, longitude=None) -> web.Response:
    """Invite to Game Level

    Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param app_id: This parameter is deprecated.
    :type app_id: int
    :param app_key: the application key
    :type app_key: str
    :param game_level_id: the game level that the user owns and is giving access to
    :type game_level_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def get_invite(request: web.Request, account_id=None, token=None, album_id=None, mission_id=None, album_contest_id=None, offer_id=None, offer_location_id=None, retailer_location_id=None, app_key=None) -> web.Response:
    """Get Invite

    This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.

    :param account_id: Account ID of the user if they are logged in
    :type account_id: int
    :param token: the invite token
    :type token: str
    :param album_id: album id to match the invite against (if applicable)
    :type album_id: int
    :param mission_id: mission id to match the invite against (if applicable)
    :type mission_id: int
    :param album_contest_id: album contest id to match the invite against (if applicable)
    :type album_contest_id: int
    :param offer_id: offer id to match the invite against (if applicable)
    :type offer_id: int
    :param offer_location_id: offer location id to match the invite against (if applicable)
    :type offer_location_id: int
    :param retailer_location_id: retailer location id to match the invite against (if applicable)
    :type retailer_location_id: int
    :param app_key: the application key
    :type app_key: str

    """
    return web.Response(status=200)


async def mission_invite(request: web.Request, device_id=None, account_id=None, app_id=None, app_key=None, mission_id=None, latitude=None, longitude=None) -> web.Response:
    """Invite to Mission

    Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param app_id: This parameter is deprecated.
    :type app_id: int
    :param app_key: the application key
    :type app_key: str
    :param mission_id: the mission to share
    :type mission_id: int
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def offer_invite(request: web.Request, account_id, app_key, offer_id) -> web.Response:
    """Invite to Offer

    Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite&#39;s list.

    :param account_id: the account ID of the user making the share
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param offer_id: the ID of the offer used to invite to favorite
    :type offer_id: int

    """
    return web.Response(status=200)


async def offer_location_invite(request: web.Request, account_id, app_key, offer_location_id) -> web.Response:
    """Invite to Offer Location

    Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite&#39;s list.

    :param account_id: the account ID of the user making the share
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param offer_location_id: the id of the offer location to share
    :type offer_location_id: int

    """
    return web.Response(status=200)


async def retailer_location_invite(request: web.Request, account_id, app_key, retailer_location_id, album_id=None) -> web.Response:
    """Invite to Retailer Location

    Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite&#39;s list.

    :param account_id: the account ID of the user making the share
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param retailer_location_id: The retailer location id of where the event will take place
    :type retailer_location_id: int
    :param album_id: Optional album id to link with the invite
    :type album_id: int

    """
    return web.Response(status=200)
