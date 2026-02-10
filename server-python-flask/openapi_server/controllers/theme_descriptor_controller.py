import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.purchase_item_list_response import PurchaseItemListResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.theme_descriptor_response import ThemeDescriptorResponse  # noqa: E501
from openapi_server import util


def add_or_update_theme_descriptor(version, public_read, public_write, public_delete, public_add, visibility, include_friend_group, complete_with_default_values, device_id=None, account_id=None, game_type=None, theme_descriptor_id=None, title=None, description=None, connection_ids_to_add=None, connection_group_ids_to_add=None, app_version=None, color_value_json=None, string_replacer_json=None, custom_json_objects=None, icon_image=None, scene_atlas_image=None, bg_image=None, bg_sound=None, music_selection=None, location_description=None, latitude=None, longitude=None):  # noqa: E501
    """Create/Update Theme

    Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme. # noqa: E501

    :param version: 
    :type version: 
    :param public_read: determines whether the theme&#39;s participants have read permissions
    :type public_read: bool
    :param public_write: determines whether the theme&#39;s participants have write permissions
    :type public_write: bool
    :param public_delete: determines whether the theme&#39;s participants have delete permissions
    :type public_delete: bool
    :param public_add: 
    :type public_add: bool
    :param visibility: the determines the theme&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    :type visibility: str
    :param include_friend_group: flag to determine whether to share to the user&#39;s \&quot;friends\&quot; group
    :type include_friend_group: bool
    :param complete_with_default_values: determines whether to use default values to complete the theme
    :type complete_with_default_values: bool
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: the application key
    :type game_type: str
    :param theme_descriptor_id: the theme descriptor id used to update an existing theme, leave empty for creating a new theme
    :type theme_descriptor_id: int
    :param title: the title of the theme
    :type title: str
    :param description: the description of the theme
    :type description: str
    :param connection_ids_to_add: a comma separated list of connection IDs to share to users
    :type connection_ids_to_add: str
    :param connection_group_ids_to_add: a comma separated list of connection group IDs to share to groups
    :type connection_group_ids_to_add: str
    :param app_version: the application version the theme was created for
    :type app_version: str
    :param color_value_json: a json array used to replace colors within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;sceneAtlas\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   },   {     \&quot;name\&quot;: \&quot;bg\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   } ] &#x60;&#x60;&#x60; 
    :type color_value_json: str
    :param string_replacer_json: a json array used to replace strings within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;coins\&quot;,     \&quot;valueString\&quot;: \&quot;Gems\&quot;   },   {     \&quot;name\&quot;: \&quot;lives\&quot;,     \&quot;valueString\&quot;: \&quot;lives\&quot;   } ] &#x60;&#x60;&#x60; 
    :type string_replacer_json: str
    :param custom_json_objects: a json object used by the scene atlas to position sprites. Example: &#x60;&#x60;&#x60;json {   \&quot;pShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;2.2\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;-0.3\&quot;     }   ],   \&quot;e1ShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;0.25\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;0.5\&quot;     }   ] } &#x60;&#x60;&#x60; 
    :type custom_json_objects: str
    :param icon_image: a MultipartFile containing the image used as the theme icon
    :type icon_image: str
    :param scene_atlas_image: a MultipartFile containing the scene atlas
    :type scene_atlas_image: str
    :param bg_image: a MultipartFile containing the background image
    :type bg_image: str
    :param bg_sound: a MultipartFile containing the background sound file (preferably in MP3 format)
    :type bg_sound: str
    :param music_selection: used to select a default sound file that already exists in the application
    :type music_selection: str
    :param location_description: the description of the user&#39;s current location
    :type location_description: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float

    :rtype: Union[ThemeDescriptorResponse, Tuple[ThemeDescriptorResponse, int], Tuple[ThemeDescriptorResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_theme_descriptor(version, theme_descriptor_id, device_id=None, account_id=None, game_type=None, latitude=None, longitude=None):  # noqa: E501
    """Get Theme

    Gets a theme. # noqa: E501

    :param version: 
    :type version: 
    :param theme_descriptor_id: the theme id
    :type theme_descriptor_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: the application key
    :type game_type: str
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[PurchaseItemListResponse, Tuple[PurchaseItemListResponse, int], Tuple[PurchaseItemListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_theme_descriptors(version, filter, sort_field, descending, start, limit, device_id=None, account_id=None, game_type=None, contest_type=None, owner_id=None, q=None, keyword=None, i=None, l=None, date_created=None, app_version=None, latitude=None, longitude=None):  # noqa: E501
    """Search Themes

    Searches for themes. # noqa: E501

    :param version: 
    :type version: 
    :param filter: a comma separated list of Ownership
    :type filter: str
    :param sort_field: the field to sort by. See ThemeDescriptorApiMap
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: the start parameter for pagination
    :type start: int
    :param limit: the limit parameter for pagination
    :type limit: int
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: the unique title of an application given from the admin tool
    :type game_type: str
    :param contest_type: contest type
    :type contest_type: str
    :param owner_id: search on contests that an account has access to
    :type owner_id: int
    :param q: This parameter is deprecated.
    :type q: str
    :param keyword: a keyword to search on
    :type keyword: str
    :param i: This parameter is deprecated.
    :type i: int
    :param l: This parameter is deprecated.
    :type l: int
    :param date_created: filter on items that have been created before this date
    :type date_created: int
    :param app_version: application version of the theme to filter by
    :type app_version: str
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[PurchaseItemListResponse, Tuple[PurchaseItemListResponse, int], Tuple[PurchaseItemListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_theme_descriptor(version, theme_descriptor_id, device_id=None, account_id=None, game_type=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Theme

    Removes a theme. # noqa: E501

    :param version: 
    :type version: 
    :param theme_descriptor_id: the theme id to remove
    :type theme_descriptor_id: int
    :param device_id: a unique id given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param game_type: the unique title of an application given from the admin tool
    :type game_type: str
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
