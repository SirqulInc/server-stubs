import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.weather_response import WeatherResponse  # noqa: E501
from openapi_server import util


def search_weather(version, region_id=None, latitude=None, longitude=None, timezone_offset=None):  # noqa: E501
    """Search Weather

    Search the weather forcast for the next 5 days # noqa: E501

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

    :rtype: Union[WeatherResponse, Tuple[WeatherResponse, int], Tuple[WeatherResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
