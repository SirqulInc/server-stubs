from typing import List, Dict
from aiohttp import web

from openapi_server.models.coords_response import CoordsResponse
from openapi_server.models.geo_point_response import GeoPointResponse
from openapi_server.models.location_search_response import LocationSearchResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server.models.trilat_cache_request import TrilatCacheRequest
from openapi_server import util


async def cache_trilateration_data(request: web.Request, version, udid, source_time=None, minimum_sample_size=None, data=None, data_file=None) -> web.Response:
    """Create Trilateration Data with File

    Creates trilateration samples for a source device (i.e. a router).

    :param version: 
    :type version: 
    :param udid: The unique identifier of the source device
    :type udid: str
    :param source_time: The current timestamp of the source device
    :type source_time: int
    :param minimum_sample_size: the minimum number of Edysen devices that must be used to be able to trilaterate a device
    :type minimum_sample_size: int
    :param data: The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;:\&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;: \&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; 
    :type data: str
    :param data_file: Binary file containing data (multipart upload)
    :type data_file: str

    """
    return web.Response(status=200)


async def cache_trilateration_data_gzip(request: web.Request, version, body=None) -> web.Response:
    """Create Trilateration Data with Rest

    Creates trilateration samples for a source device (i.e. a router).

    :param version: 
    :type version: 
    :param body: 
    :type body: dict | bytes

    """
    body = TrilatCacheRequest.from_dict(body)
    return web.Response(status=200)


async def get_location_by_ip(request: web.Request, version, ip=None) -> web.Response:
    """Get Location by IP

    Get location information based on an IP address.

    :param version: 
    :type version: 
    :param ip: the ip address of the client device
    :type ip: str

    """
    return web.Response(status=200)


async def get_location_by_trilateration(request: web.Request, version, account_id=None, latitude=None, longitude=None, data=None, response_filters=None) -> web.Response:
    """Get Location by Trilateration

    Send in device data and calculate a position based on signal strengths.

    :param version: 
    :type version: 
    :param account_id: The account making the request, if provided the last know location will be updated
    :type account_id: int
    :param latitude: The known GPS latitude to compare to the calculated version
    :type latitude: float
    :param longitude: The known GPS longitude to compare to the calculated version
    :type longitude: float
    :param data: The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; 
    :type data: str
    :param response_filters: Optional response filters (not used currently)
    :type response_filters: str

    """
    return web.Response(status=200)


async def get_locations(request: web.Request, version, device_id=None, account_id=None, currentlatitude=None, currentlongitude=None, current_latitude=None, current_longitude=None, query=None, zipcode=None, zip_code=None, selected_maplatitude=None, selected_maplongitude=None, selected_map_latitude=None, selected_map_longitude=None, search_range=None, use_geocode=None, i=None, start=None, l=None, limit=None) -> web.Response:
    """Search Regions or Postal Codes

    Searches geographic locations by proximity via address or keyword.

    :param version: 
    :type version: 
    :param device_id: the device id
    :type device_id: str
    :param account_id: the account id
    :type account_id: int
    :param currentlatitude: This parameter is deprecated.
    :type currentlatitude: float
    :param currentlongitude: This parameter is deprecated.
    :type currentlongitude: float
    :param current_latitude: the current latitude of the user
    :type current_latitude: float
    :param current_longitude: the current longitude of the user
    :type current_longitude: float
    :param query: the query results by keyword or address
    :type query: str
    :param zipcode: This parameter is deprecated.
    :type zipcode: str
    :param zip_code: the zip code to filter results
    :type zip_code: str
    :param selected_maplatitude: This parameter is deprecated.
    :type selected_maplatitude: float
    :param selected_maplongitude: This parameter is deprecated.
    :type selected_maplongitude: float
    :param selected_map_latitude: the latitude of where the search should originate from
    :type selected_map_latitude: float
    :param selected_map_longitude: the longitude of where the search should originate from
    :type selected_map_longitude: float
    :param search_range: the search range of the search in miles
    :type search_range: float
    :param use_geocode: determines whether to allow searches via address
    :type use_geocode: bool
    :param i: This parameter is deprecated.
    :type i: int
    :param start: the start index for pagination
    :type start: int
    :param l: This parameter is deprecated.
    :type l: int
    :param limit: the limit for pagination
    :type limit: int

    """
    return web.Response(status=200)
