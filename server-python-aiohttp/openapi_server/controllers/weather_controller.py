from typing import List, Dict
from aiohttp import web

from openapi_server.models.weather_response import WeatherResponse
from openapi_server import util


async def search_weather(request: web.Request, version, region_id=None, latitude=None, longitude=None, timezone_offset=None) -> web.Response:
    """Search Weather

    Search the weather forcast for the next 5 days

    :param version: 
    :type version: 
    :param region_id: Region Id
    :type region_id: int
    :param latitude: Latitude
    :type latitude: float
    :param longitude: Longitude
    :type longitude: float
    :param timezone_offset: Timezone Offset
    :type timezone_offset: int

    """
    return web.Response(status=200)
