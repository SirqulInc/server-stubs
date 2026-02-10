import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_response import AccountResponse  # noqa: E501
from openapi_server.models.search_response import SearchResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.wrapped_response import WrappedResponse  # noqa: E501
from openapi_server import util


def add_favorite(version, favoritable_id, favoritable_type, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Create Favorite

    Adds an offer, offer location, retailer location, or category to your favorites. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[WrappedResponse, Tuple[WrappedResponse, int], Tuple[WrappedResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_favorite(version, device_id=None, account_id=None, favorite_id=None, favoritable_id=None, favoritable_type=None):  # noqa: E501
    """Delete Favorite

    Removes a favorited item from the user&#39;s favorites list. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_favorite(version, favorite_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Favorite

    Retrieves a single favorited item. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[WrappedResponse, Tuple[WrappedResponse, int], Tuple[WrappedResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_favorites(version, favoritable_type, sort_field, descending, start, limit, active_only, return_full_response, device_id=None, account_id=None, connection_account_id=None, secondary_type=None, keyword=None, latitude=None, longitude=None):  # noqa: E501
    """Search Favorites

    Searches on the user&#39;s favorites. # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[SearchResponse, Tuple[SearchResponse, int], Tuple[SearchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def who_has_favorited(version, favoritable_id, favoritable_type, start, limit, device_id=None, account_id=None, latitude=None, longitude=None, keyword=None):  # noqa: E501
    """Who has Favorited

    Searches for everyone that has favorited an item # noqa: E501

    :param version: 
    :type version: 
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

    :rtype: Union[List[AccountResponse], Tuple[List[AccountResponse], int], Tuple[List[AccountResponse], int, Dict[str, str]]
    """
    return 'do some magic!'
