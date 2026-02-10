from typing import List, Dict
from aiohttp import web

from openapi_server.models.application_config_response import ApplicationConfigResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def create_application_config(request: web.Request, version, account_id, app_key, config_version, asset_id, retailer_id=None, retailer_location_id=None, udid=None) -> web.Response:
    """Create AppConfig

    Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won&#39;t be created.

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param app_key: The application key that the newly created applicationConfig will be associated to
    :type app_key: str
    :param config_version: The application configuration, has to be unique within the application
    :type config_version: str
    :param asset_id: The json assetId that stores the configuration detail.
    :type asset_id: int
    :param retailer_id: The retailer id for retailer specific configurations
    :type retailer_id: int
    :param retailer_location_id: The retailer location id for retailer location specific configurations
    :type retailer_location_id: int
    :param udid: The device udid for device specific configurations
    :type udid: str

    """
    return web.Response(status=200)


async def delete_application_config(request: web.Request, version, account_id, config_id) -> web.Response:
    """Delete AppConfig

    Mark the application configuration for deletion.

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param config_id: The config ID of the application configuration to delete
    :type config_id: int

    """
    return web.Response(status=200)


async def get_application_config(request: web.Request, version, account_id, config_id) -> web.Response:
    """Get AppConfig

    Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param config_id: The config ID of the application configuration
    :type config_id: int

    """
    return web.Response(status=200)


async def get_application_config_by_config_version(request: web.Request, version, app_key, config_version, retailer_id=None, retailer_location_id=None, udid=None, allow_older_versions=None) -> web.Response:
    """Get AppConfig by Version

    Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. 

    :param version: 
    :type version: 
    :param app_key: The application key
    :type app_key: str
    :param config_version: The version of the application configuration
    :type config_version: str
    :param retailer_id: Only returns the config that matches the given retailer
    :type retailer_id: int
    :param retailer_location_id: Only returns the config that matches the given retailer location
    :type retailer_location_id: int
    :param udid: Only returns only returns the config that matches the given device udid
    :type udid: str
    :param allow_older_versions: Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.
    :type allow_older_versions: bool

    """
    return web.Response(status=200)


async def search_application_config(request: web.Request, version, account_id, app_key=None, retailer_id=None, retailer_location_id=None, udid=None, config_version=None, sort_field=None, descending=None, start=None, limit=None) -> web.Response:
    """Search AppConfigs

    Gets all versions of application configurations in a particular app by the given appKey.

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param app_key: The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)
    :type app_key: str
    :param retailer_id: Only returns the configs that matches the given retailer
    :type retailer_id: int
    :param retailer_location_id: Only returns the configs that matches the given retailer location
    :type retailer_location_id: int
    :param udid: Only returns only returns the configs that matches the given device udid
    :type udid: str
    :param config_version: Config Version
    :type config_version: str
    :param sort_field: Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX 
    :type sort_field: str
    :param descending: Determines whether the results are in descending or ascending order
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit for pagination (There is a hard limit of 100)
    :type limit: int

    """
    return web.Response(status=200)


async def update_application_config(request: web.Request, version, account_id, config_id, app_key=None, config_version=None, asset_id=None, retailer_id=None, retailer_location_id=None, udid=None) -> web.Response:
    """Update AppConfig

    pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won&#39;t be updated.

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param config_id: The config ID of the application configuration to update
    :type config_id: int
    :param app_key: The application key that the updated applicationConfig will be associated to
    :type app_key: str
    :param config_version: The application configuration, has to be unique within the application
    :type config_version: str
    :param asset_id: The json assetId that stores the configuration detail.
    :type asset_id: int
    :param retailer_id: The retailer id for retailer specific configurations
    :type retailer_id: int
    :param retailer_location_id: The retailer location id for retailer location specific configurations
    :type retailer_location_id: int
    :param udid: The device udid for device specific configurations
    :type udid: str

    """
    return web.Response(status=200)
