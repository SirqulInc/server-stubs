from typing import List, Dict
from aiohttp import web

from openapi_server.models.account_response import AccountResponse
from openapi_server.models.search_response import SearchResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.wrapped_response import WrappedResponse
from openapi_server import util


async def add_favorite(request: web.Request, favoritable_id, favoritable_type, device_id=None, account_id=None, latitude=None, longitude=None) -> web.Response:
    """Create Favorite

    Adds an offer, offer location, retailer location, or category to your favorites.

    :param favoritable_id: The ID of the object to favorite {offerId, offerLocationId, retailerLocationId, categoryId}
    :type favoritable_id: int
    :param favoritable_type: The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY, ALBUM}
    :type favoritable_type: str
    :param device_id: The unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def delete_favorite(request: web.Request, device_id=None, account_id=None, favorite_id=None, favoritable_id=None, favoritable_type=None) -> web.Response:
    """Delete Favorite

    Removes a favorited item from the user&#39;s favorites list.

    :param device_id: The unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param favorite_id: The ID of the favorite reference record (only optional if favoritableId &amp; favoritableType is pass in instead)
    :type favorite_id: int
    :param favoritable_id: The ID of the object to un-favorite {offerId, offerLocationId, retailerLocationId, categoryId} (this is required if favoriteId is NOT passed in)
    :type favoritable_id: int
    :param favoritable_type: The type of the object to un-favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY} (this is required if favoriteId is NOT passed in)
    :type favoritable_type: str

    """
    return web.Response(status=200)


async def get_favorite(request: web.Request, favorite_id, device_id=None, account_id=None, latitude=None, longitude=None) -> web.Response:
    """Get Favorite

    Retrieves a single favorited item.

    :param favorite_id: The ID of the favorite reference record
    :type favorite_id: int
    :param device_id: The unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def search_favorites(request: web.Request, favoritable_type, sort_field, descending, start, limit, active_only, return_full_response, device_id=None, account_id=None, connection_account_id=None, secondary_type=None, keyword=None, latitude=None, longitude=None) -> web.Response:
    """Search Favorites

    Searches on the user&#39;s favorites.

    :param favoritable_type: The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}
    :type favoritable_type: str
    :param sort_field: Determines what to sort the results by {CREATED, UPDATED, DISPLAY}
    :type sort_field: str
    :param descending: Determines whether the results are in descending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination (there is a hard limit of 1000)
    :type limit: int
    :param active_only: Determines whether to only return active favorites
    :type active_only: bool
    :param return_full_response: Determines whether to return a detailed version of the response list
    :type return_full_response: bool
    :param device_id: The unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: The ID of an account the user would like to view favorites for
    :type connection_account_id: int
    :param secondary_type: 
    :type secondary_type: str
    :param keyword: The keyword to search for
    :type keyword: str
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    """
    return web.Response(status=200)


async def who_has_favorited(request: web.Request, favoritable_id, favoritable_type, start, limit, device_id=None, account_id=None, latitude=None, longitude=None, keyword=None) -> web.Response:
    """Who has Favorited

    Searches for everyone that has favorited an item

    :param favoritable_id: The ID of the favoritableType to search on
    :type favoritable_id: int
    :param favoritable_type: The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}
    :type favoritable_type: str
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination
    :type limit: int
    :param device_id: The unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float
    :param keyword: The keyword to limit that account list
    :type keyword: str

    """
    return web.Response(status=200)
