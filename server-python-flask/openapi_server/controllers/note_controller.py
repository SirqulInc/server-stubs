import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.note_response import NoteResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def batch_operation(version, notable_id, notable_type, device_id=None, account_id=None, batch_operation=None):  # noqa: E501
    """Batch Note Operation

    Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE).  # noqa: E501

    :param version: 
    :type version: 
    :param notable_id: The id of the notable object the batch operation will affect
    :type notable_id: int
    :param notable_type: The notable object type (for example ALBUM, ASSET, OFFER, etc.)
    :type notable_type: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param batch_operation: The batch operation to perform (e.g., DELETE_ALL_NOTES_IN_NOTABLE). Optional.
    :type batch_operation: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_note(version, comment, device_id=None, account_id=None, notable_type=None, notable_id=None, note_type=None, asset_ids=None, tags=None, permissionable_type=None, permissionable_id=None, app_key=None, location_description=None, latitude=None, longitude=None, meta_data=None, receiver_account_ids=None, return_full_response=None, initialize_asset=None, asset_return_nulls=None, asset_album_id=None, asset_collection_id=None, asset_add_to_default_album=None, asset_add_to_media_library=None, asset_version_code=None, asset_version_name=None, asset_meta_data=None, asset_caption=None, asset_media=None, asset_media_url=None, asset_media_string=None, asset_media_string_file_name=None, asset_media_string_content_type=None, asset_attached_media=None, asset_attached_media_url=None, asset_attached_media_string=None, asset_attached_media_string_file_name=None, asset_attached_media_string_content_type=None, asset_location_description=None, asset_app=None, asset_search_tags=None, asset_latitude=None, asset_longitude=None):  # noqa: E501
    """Create Note

    This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object. # noqa: E501

    :param version: 
    :type version: 
    :param comment: The message the user wishes to leave a comment on
    :type comment: str
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param notable_type: The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}
    :type notable_type: str
    :param notable_id: The id of the notable object
    :type notable_id: int
    :param note_type: The custom string defined by the client (used for differentiating various note types)
    :type note_type: str
    :param asset_ids: A comma separated list of asset IDs to add with the note
    :type asset_ids: str
    :param tags: search tags
    :type tags: str
    :param permissionable_type: This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    :type permissionable_type: str
    :param permissionable_id: The id of the permissionable object (for sending group notifications)
    :type permissionable_id: int
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param location_description: The description of the location
    :type location_description: str
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param receiver_account_ids: Comma separated list of additional account IDs that will receive the note notifications
    :type receiver_account_ids: str
    :param return_full_response: whether to return the full response or not
    :type return_full_response: bool
    :param initialize_asset: Check true if need to initialize an asset and assign to current note
    :type initialize_asset: bool
    :param asset_return_nulls: Return null fields for asset response when creating an asset
    :type asset_return_nulls: bool
    :param asset_album_id: the album the asset will be added to (optional)
    :type asset_album_id: int
    :param asset_collection_id: the collection ID that the asset is associated with
    :type asset_collection_id: int
    :param asset_add_to_default_album: the default album to add the asset to
    :type asset_add_to_default_album: str
    :param asset_add_to_media_library: the media library to add the asset to
    :type asset_add_to_media_library: bool
    :param asset_version_code: the version code of the asset
    :type asset_version_code: int
    :param asset_version_name: the version name of the asset
    :type asset_version_name: str
    :param asset_meta_data: the meta data of the asset
    :type asset_meta_data: str
    :param asset_caption: the caption of the asset
    :type asset_caption: str
    :param asset_media: the media of the asset
    :type asset_media: str
    :param asset_media_url: the media URL of the asset
    :type asset_media_url: str
    :param asset_media_string: the media string of the asset
    :type asset_media_string: str
    :param asset_media_string_file_name: the media string file name of the asset
    :type asset_media_string_file_name: str
    :param asset_media_string_content_type: the media string content type of the asset
    :type asset_media_string_content_type: str
    :param asset_attached_media: the attached media of the asset
    :type asset_attached_media: str
    :param asset_attached_media_url: the attached media URL of the asset
    :type asset_attached_media_url: str
    :param asset_attached_media_string: the attached media string of the asset
    :type asset_attached_media_string: str
    :param asset_attached_media_string_file_name: the attached media string file name of the asset
    :type asset_attached_media_string_file_name: str
    :param asset_attached_media_string_content_type: the attached media string content type of the asset
    :type asset_attached_media_string_content_type: str
    :param asset_location_description: the location description for the asset
    :type asset_location_description: str
    :param asset_app: the application for the asset
    :type asset_app: str
    :param asset_search_tags: the search tags used for the asset
    :type asset_search_tags: str
    :param asset_latitude: the latitude of the asset
    :type asset_latitude: float
    :param asset_longitude: the longitude of the asset
    :type asset_longitude: 

    :rtype: Union[NoteResponse, Tuple[NoteResponse, int], Tuple[NoteResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_note(version, note_id, device_id=None, account_id=None, latitude=None, longitude=None, app_key=None):  # noqa: E501
    """Delete Note

    Sets a comment (note) as deleted. # noqa: E501

    :param version: 
    :type version: 
    :param note_id: The ID of the note to delete
    :type note_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float
    :param app_key: The application key used to identify the application
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_note(version, note_id, device_id=None, account_id=None, return_full_response=None):  # noqa: E501
    """Get Note

    Get for a note based on its Id. # noqa: E501

    :param version: 
    :type version: 
    :param note_id: the id of the note to get
    :type note_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param return_full_response: Determines whether to return the NoteFullResponse for the item
    :type return_full_response: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_notes(version, device_id=None, account_id=None, notable_type=None, notable_id=None, note_types=None, app_key=None, keyword=None, flag_count_minimum=None, flags_exceed_threshold=None, include_inactive=None, sort_field=None, descending=None, return_full_response=None, updated_since=None, updated_before=None, start=None, limit=None):  # noqa: E501
    """Search Notes

    Search for notes on a notable object. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param notable_type: The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}
    :type notable_type: str
    :param notable_id: The id of the notable object
    :type notable_id: int
    :param note_types: Comma separated list of noteType strings to filter results with
    :type note_types: str
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param flag_count_minimum: return items that has flagCount &gt;&#x3D; flagCountMinimum if this is set, return all items, even ones with flagCount &gt;&#x3D; flagThreshold
    :type flag_count_minimum: int
    :param flags_exceed_threshold: return items that has flagCount &gt;&#x3D; flagThreshold, which are hidden by default
    :type flags_exceed_threshold: bool
    :param include_inactive: include inactive in the result
    :type include_inactive: bool
    :param sort_field: The column to sort the search on
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param return_full_response: Determines whether to return the NoteFullResponse for each search item
    :type return_full_response: bool
    :param updated_since: return items that have been updated since this date (time-stamp in milliseconds)
    :type updated_since: int
    :param updated_before: return items that have been updated before this date (time-stamp in milliseconds)
    :type updated_before: int
    :param start: The record to begin the return set on
    :type start: int
    :param limit: The number of records to return
    :type limit: int

    :rtype: Union[List[NoteResponse], Tuple[List[NoteResponse], int], Tuple[List[NoteResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_note(version, note_id, device_id=None, account_id=None, comment=None, note_type=None, asset_ids=None, tags=None, permissionable_type=None, permissionable_id=None, app_key=None, location_description=None, latitude=None, longitude=None, meta_data=None, return_full_response=None, active=None, update_asset=None, asset_return_nulls=None, asset_album_id=None, asset_collection_id=None, asset_add_to_default_album=None, asset_add_to_media_library=None, asset_version_code=None, asset_version_name=None, asset_meta_data=None, asset_caption=None, asset_media=None, asset_media_url=None, asset_media_string=None, asset_media_string_file_name=None, asset_media_string_content_type=None, asset_attached_media=None, asset_attached_media_url=None, asset_attached_media_string=None, asset_attached_media_string_file_name=None, asset_attached_media_string_content_type=None, asset_location_description=None, asset_app=None, asset_search_tags=None, asset_latitude=None, asset_longitude=None):  # noqa: E501
    """Update Note

    Update an existing comment (note). Only the creator of the note have permission to update. # noqa: E501

    :param version: 
    :type version: 
    :param note_id: The id of the note, used when editing a comment
    :type note_id: int
    :param device_id: The unique device identifier that made the request (either deviceId or accountId must be used)
    :type device_id: str
    :param account_id: The unique accountId that made the request (either deviceId or accountId must be used)
    :type account_id: int
    :param comment: The message the user wishes to leave a comment on
    :type comment: str
    :param note_type: The custom string defined by the client (used for differentiating on various note types)
    :type note_type: str
    :param asset_ids: A comma separated list of asset IDs to add with the note
    :type asset_ids: str
    :param tags: search tags
    :type tags: str
    :param permissionable_type: This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    :type permissionable_type: str
    :param permissionable_id: The id of the permissionable object (for sending group notifications)
    :type permissionable_id: int
    :param app_key: The application key used to identify the application
    :type app_key: str
    :param location_description: The description of the location
    :type location_description: str
    :param latitude: The current location of the user
    :type latitude: float
    :param longitude: The current location of the user
    :type longitude: float
    :param meta_data: meta data to update with the note
    :type meta_data: str
    :param return_full_response: whether to return the full response or not
    :type return_full_response: bool
    :param active: Sets the active flag for the note
    :type active: bool
    :param update_asset: main flag for updating asset in note, must set to true if you want to update the note&#39;s asset
    :type update_asset: bool
    :param asset_return_nulls: Return null fields for asset response when updating an asset
    :type asset_return_nulls: bool
    :param asset_album_id: the album the asset will be added to (optional)
    :type asset_album_id: int
    :param asset_collection_id: the collection ID that the asset is associated with
    :type asset_collection_id: int
    :param asset_add_to_default_album: the default album to add the asset to
    :type asset_add_to_default_album: str
    :param asset_add_to_media_library: the media library to add the asset to
    :type asset_add_to_media_library: bool
    :param asset_version_code: the version code of the asset
    :type asset_version_code: int
    :param asset_version_name: the version name of the asset
    :type asset_version_name: str
    :param asset_meta_data: the meta data of the asset
    :type asset_meta_data: str
    :param asset_caption: the caption of the asset
    :type asset_caption: str
    :param asset_media: the media of the asset
    :type asset_media: str
    :param asset_media_url: the media URL of the asset
    :type asset_media_url: str
    :param asset_media_string: the media string of the asset
    :type asset_media_string: str
    :param asset_media_string_file_name: the media string file name of the asset
    :type asset_media_string_file_name: str
    :param asset_media_string_content_type: the media string content type of the asset
    :type asset_media_string_content_type: str
    :param asset_attached_media: the attached media of the asset
    :type asset_attached_media: str
    :param asset_attached_media_url: the attached media URL of the asset
    :type asset_attached_media_url: str
    :param asset_attached_media_string: the attached media string of the asset
    :type asset_attached_media_string: str
    :param asset_attached_media_string_file_name: the attached media string file name of the asset
    :type asset_attached_media_string_file_name: str
    :param asset_attached_media_string_content_type: the attached media string content type of the asset
    :type asset_attached_media_string_content_type: str
    :param asset_location_description: the location description for the asset
    :type asset_location_description: str
    :param asset_app: the application for the asset
    :type asset_app: str
    :param asset_search_tags: the search tags used for the asset
    :type asset_search_tags: str
    :param asset_latitude: the latitude of the asset
    :type asset_latitude: float
    :param asset_longitude: the longitude of the asset
    :type asset_longitude: float

    :rtype: Union[NoteResponse, Tuple[NoteResponse, int], Tuple[NoteResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
