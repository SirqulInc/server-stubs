import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.asset_full_response import AssetFullResponse  # noqa: E501
from openapi_server.models.asset_response import AssetResponse  # noqa: E501
from openapi_server.models.asset_short_response import AssetShortResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def asset_download(version, filename):  # noqa: E501
    """Download Asset

    Downloads an asset from the server for assets that have been uploaded to the server. # noqa: E501

    :param version: 
    :type version: 
    :param filename: the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}
    :type filename: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def asset_morph(version, offer_id, ad_size, creative_id=None, width=None, height=None, background_size=None, template=None):  # noqa: E501
    """Convert Offer to Creative

    Converts an offer image + text into a creative image. # noqa: E501

    :param version: 
    :type version: 
    :param offer_id: offer id used for inserting offer text/flavor
    :type offer_id: int
    :param ad_size: the ad size used for selecting a format for the creative image
    :type ad_size: str
    :param creative_id: used for inserting the newly created image into
    :type creative_id: int
    :param width: total width of the creative image
    :type width: int
    :param height: total height of the creative image
    :type height: int
    :param background_size: the size of the background
    :type background_size: str
    :param template: the template to use
    :type template: str

    :rtype: Union[AssetShortResponse, Tuple[AssetShortResponse, int], Tuple[AssetShortResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_asset(version, return_nulls=None, device_id=None, account_id=None, album_id=None, collection_id=None, add_to_default_album=None, add_to_media_library=None, version_code=None, version_name=None, meta_data=None, caption=None, asset_type=None, approval_status=None, assigned_account_id=None, media=None, media_url=None, media_string=None, media_string_file_name=None, media_string_content_type=None, media_height=None, media_width=None, attached_media=None, attached_media_url=None, attached_media_string=None, attached_media_string_file_name=None, attached_media_string_content_type=None, attached_media_height=None, attached_media_width=None, location_description=None, app=None, app_key=None, search_tags=None, latitude=None, longitude=None):  # noqa: E501
    """Create Asset

    Uploads an asset to server and returns an asset id which can be used to assign to various objects. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: to return nulls
    :type return_nulls: bool
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param album_id: the album the asset will be added to (optional)
    :type album_id: int
    :param collection_id: Deprecated: use collections via the collection endpoints.
    :type collection_id: int
    :param add_to_default_album: Whether to add to a default album
    :type add_to_default_album: str
    :param add_to_media_library: Whether to add to the media library
    :type add_to_media_library: bool
    :param version_code: the version code
    :type version_code: int
    :param version_name: the version name
    :type version_name: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param caption: the caption (optional)
    :type caption: str
    :param asset_type: the asset type
    :type asset_type: str
    :param approval_status: approval status for the asset
    :type approval_status: str
    :param assigned_account_id: account id assigned to the asset
    :type assigned_account_id: int
    :param media: a MultipartFile containing the mimetype, etc
    :type media: str
    :param media_url: this can be used if the \&quot;media\&quot; is a link (optional)
    :type media_url: str
    :param media_string: the media content as a string (optional)
    :type media_string: str
    :param media_string_file_name: file name for mediaString (optional)
    :type media_string_file_name: str
    :param media_string_content_type: content type for mediaString (optional)
    :type media_string_content_type: str
    :param media_height: the media height (optional)
    :type media_height: int
    :param media_width: the media width (optional)
    :type media_width: int
    :param attached_media: a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.
    :type attached_media: str
    :param attached_media_url: this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)
    :type attached_media_url: str
    :param attached_media_string: attached media content as a string (optional)
    :type attached_media_string: str
    :param attached_media_string_file_name: file name for attachedMediaString (optional)
    :type attached_media_string_file_name: str
    :param attached_media_string_content_type: content type for attachedMediaString (optional)
    :type attached_media_string_content_type: str
    :param attached_media_height: the attached media height (optional)
    :type attached_media_height: int
    :param attached_media_width: the attached media width (optional)
    :type attached_media_width: int
    :param location_description: the location description (optional)
    :type location_description: str
    :param app: Deprecated: app parameter
    :type app: str
    :param app_key: the application key
    :type app_key: str
    :param search_tags: the search tags
    :type search_tags: str
    :param latitude: the latitude (optional)
    :type latitude: float
    :param longitude: the longitude (optional)
    :type longitude: float

    :rtype: Union[AssetResponse, Tuple[AssetResponse, int], Tuple[AssetResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_asset(version, asset_id, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Delete Asset

    Delete an asset. # noqa: E501

    :param version: 
    :type version: 
    :param asset_id: the id of the asset to delete
    :type asset_id: str
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_asset(version, asset_id, device_id=None, account_id=None, note_descending=None):  # noqa: E501
    """Get Asset

    Gets the full asset response including attached likes and notes. # noqa: E501

    :param version: 
    :type version: 
    :param asset_id: the asset ID
    :type asset_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param note_descending: determines whether the notes on the asset are in descending order
    :type note_descending: bool

    :rtype: Union[AssetFullResponse, Tuple[AssetFullResponse, int], Tuple[AssetFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_asset(version, asset_id, device_id=None, account_id=None, album_id=None, collection_id=None, remove_from_default_albums=None, latitude=None, longitude=None):  # noqa: E501
    """Remove Asset from Collection

    Remove assets from collections # noqa: E501

    :param version: 
    :type version: 
    :param asset_id: the id of the asset to remove
    :type asset_id: str
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param album_id: the album id to remove the asset from
    :type album_id: int
    :param collection_id: the collection id to remove the asset from
    :type collection_id: int
    :param remove_from_default_albums: remove from the user&#39;s profile album
    :type remove_from_default_albums: bool
    :param latitude: latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_assets(version, device_id=None, account_id=None, album_ids=None, asset_ids=None, app_key=None, media_type=None, mime_type=None, keyword=None, version_code=None, version_name=None, updated_since=None, updated_before=None, sort_field=None, descending=None, search_media_library=None, filter_by_billable=None, active_only=None, return_app=None, start=None, limit=None, search_mode=None, asset_type=None, approval_status=None, assigned_account_id=None):  # noqa: E501
    """Search Assets

    Searches for assets # noqa: E501

    :param version: 
    :type version: 
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param album_ids: comma separated list of album ids to search on
    :type album_ids: str
    :param asset_ids: comma separated list of asset ids to search on
    :type asset_ids: str
    :param app_key: the application key to filter results by application.
    :type app_key: str
    :param media_type: filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT
    :type media_type: str
    :param mime_type: filter results by mime type
    :type mime_type: str
    :param keyword: keyword search string
    :type keyword: str
    :param version_code: filter results by version code
    :type version_code: int
    :param version_name: filter results by version name
    :type version_name: str
    :param updated_since: return items that have been updated since this date (time-stamp in milliseconds)
    :type updated_since: int
    :param updated_before: return items that have been updated before this date (time-stamp in milliseconds)
    :type updated_before: int
    :param sort_field: the field to sort by. See AssetApiMap
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param search_media_library: determines whether to search on the media library album
    :type search_media_library: bool
    :param filter_by_billable: filter results by billable entity
    :type filter_by_billable: bool
    :param active_only: if only searching for active assets
    :type active_only: bool
    :param return_app: determines whether to include the application response as part of the asset response
    :type return_app: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination (there is a hard limit of 200)
    :type limit: int
    :param search_mode: search mode for index (SearchIndexMode)
    :type search_mode: str
    :param asset_type: filter by asset type
    :type asset_type: str
    :param approval_status: filter by approval status
    :type approval_status: str
    :param assigned_account_id: filter results by an assigned account id
    :type assigned_account_id: int

    :rtype: Union[List[AssetResponse], Tuple[List[AssetResponse], int], Tuple[List[AssetResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_asset(version, asset_id, device_id=None, account_id=None, album_id=None, attached_asset_id=None, version_code=None, version_name=None, meta_data=None, caption=None, asset_type=None, approval_status=None, assigned_account_id=None, media=None, media_url=None, media_string=None, media_string_file_name=None, media_string_content_type=None, media_height=None, media_width=None, attached_media=None, attached_media_url=None, attached_media_string=None, attached_media_string_file_name=None, attached_media_string_content_type=None, attached_media_height=None, attached_media_width=None, location_description=None, search_tags=None, app_key=None, latitude=None, longitude=None):  # noqa: E501
    """Update Asset

    Updates an asset&#39;s meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data. # noqa: E501

    :param version: 
    :type version: 
    :param asset_id: the ID of the asset to update
    :type asset_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param album_id: the ID of the album to check user permissions
    :type album_id: int
    :param attached_asset_id: the ID of the attached asset
    :type attached_asset_id: int
    :param version_code: the version code
    :type version_code: int
    :param version_name: the version name
    :type version_name: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param caption: the caption
    :type caption: str
    :param asset_type: the asset type
    :type asset_type: str
    :param approval_status: approval status for the asset
    :type approval_status: str
    :param assigned_account_id: account id assigned to the asset
    :type assigned_account_id: int
    :param media: a MultipartFile containing the mimetype, etc
    :type media: str
    :param media_url: this can be used if the \&quot;media\&quot; is a link (optional)
    :type media_url: str
    :param media_string: the media content as a string (optional)
    :type media_string: str
    :param media_string_file_name: file name for mediaString (optional)
    :type media_string_file_name: str
    :param media_string_content_type: content type for mediaString (optional)
    :type media_string_content_type: str
    :param media_height: the media height (optional)
    :type media_height: int
    :param media_width: the media width (optional)
    :type media_width: int
    :param attached_media: a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.
    :type attached_media: str
    :param attached_media_url: this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)
    :type attached_media_url: str
    :param attached_media_string: attached media content as a string (optional)
    :type attached_media_string: str
    :param attached_media_string_file_name: file name for attachedMediaString (optional)
    :type attached_media_string_file_name: str
    :param attached_media_string_content_type: content type for attachedMediaString (optional)
    :type attached_media_string_content_type: str
    :param attached_media_height: the attached media height (optional)
    :type attached_media_height: int
    :param attached_media_width: the attached media width (optional)
    :type attached_media_width: int
    :param location_description: the location description
    :type location_description: str
    :param search_tags: search tags
    :type search_tags: str
    :param app_key: the application key
    :type app_key: str
    :param latitude: latitude used to update the asset&#39;s location
    :type latitude: float
    :param longitude: longitude used to update the asset&#39;s location
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
