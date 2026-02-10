import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.application_config_response import ApplicationConfigResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_application_config(version, account_id, app_key, config_version, asset_id, retailer_id=None, retailer_location_id=None, udid=None):  # noqa: E501
    """Create AppConfig

    Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won&#39;t be created. # noqa: E501

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

    :rtype: Union[ApplicationConfigResponse, Tuple[ApplicationConfigResponse, int], Tuple[ApplicationConfigResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_application_config(version, account_id, config_id):  # noqa: E501
    """Delete AppConfig

    Mark the application configuration for deletion. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param config_id: The config ID of the application configuration to delete
    :type config_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_application_config(version, account_id, config_id):  # noqa: E501
    """Get AppConfig

    Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account ID of the user
    :type account_id: int
    :param config_id: The config ID of the application configuration
    :type config_id: int

    :rtype: Union[ApplicationConfigResponse, Tuple[ApplicationConfigResponse, int], Tuple[ApplicationConfigResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_application_config_by_config_version(version, app_key, config_version, retailer_id=None, retailer_location_id=None, udid=None, allow_older_versions=None):  # noqa: E501
    """Get AppConfig by Version

    Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response.  # noqa: E501

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

    :rtype: Union[ApplicationConfigResponse, Tuple[ApplicationConfigResponse, int], Tuple[ApplicationConfigResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_application_config(version, account_id, app_key=None, retailer_id=None, retailer_location_id=None, udid=None, config_version=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search AppConfigs

    Gets all versions of application configurations in a particular app by the given appKey. # noqa: E501

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

    :rtype: Union[List[ApplicationConfigResponse], Tuple[List[ApplicationConfigResponse], int], Tuple[List[ApplicationConfigResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_application_config(version, account_id, config_id, app_key=None, config_version=None, asset_id=None, retailer_id=None, retailer_location_id=None, udid=None):  # noqa: E501
    """Update AppConfig

    pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won&#39;t be updated. # noqa: E501

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

    :rtype: Union[ApplicationConfigResponse, Tuple[ApplicationConfigResponse, int], Tuple[ApplicationConfigResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
