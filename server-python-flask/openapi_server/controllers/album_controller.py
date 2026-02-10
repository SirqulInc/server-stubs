import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.album_full_response import AlbumFullResponse  # noqa: E501
from openapi_server.models.album_response import AlbumResponse  # noqa: E501
from openapi_server.models.search_response import SearchResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def add_album_collection(version, title, cover_asset_nullable, include_cover_in_asset_list, public_read, public_write, public_delete, public_add, anonymous, device_id=None, account_id=None, assets_to_add=None, media=None, media_url=None, asset_id=None, attached_media=None, attached_media_url=None, start_date=None, end_date=None, tags=None, description=None, album_type=None, album_type_id=None, sub_type=None, latitude=None, longitude=None, location_description=None, visibility=None, game_type=None, app_key=None, cell_phone=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, full_address=None, meta_data=None, category_ids=None, category_filter_ids=None, audience_ids=None, include_all_app_users_as_members=None, include_audiences_as_members=None, audience_operator=None, approval_status=None, linked_object_type=None, linked_object_id=None):  # noqa: E501
    """Create Album

    Create an Album. # noqa: E501

    :param version: 
    :type version: 
    :param title: the title of the album
    :type title: str
    :param cover_asset_nullable: determines whether the cover image of the album can be empty, else will use the user&#39;s profile picture as the cover image
    :type cover_asset_nullable: bool
    :param include_cover_in_asset_list: determines whether the cover image should be added to the album asset list
    :type include_cover_in_asset_list: bool
    :param public_read: determines whether the album&#39;s participants has read permissions
    :type public_read: bool
    :param public_write: determines whether the album&#39;s participants has write permissions
    :type public_write: bool
    :param public_delete: determines whether the album&#39;s participants has delete permissions
    :type public_delete: bool
    :param public_add: determines whether the album&#39;s participants has add permissions
    :type public_add: bool
    :param anonymous: determines whether the album is posted anonymously
    :type anonymous: bool
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param assets_to_add: Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)
    :type assets_to_add: str
    :param media: a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)
    :type media: str
    :param media_url: this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)
    :type media_url: str
    :param asset_id: The asset ID to set the album cover image
    :type asset_id: int
    :param attached_media: a MultipartFile containing an asset that the \&quot;media\&quot; file references. Example to upload a video: the \&quot;media\&quot; file should contain a screen capture of the video, and the \&quot;attachedMedia\&quot; should be the actual video.
    :type attached_media: str
    :param attached_media_url: this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc)
    :type attached_media_url: str
    :param start_date: the start date
    :type start_date: int
    :param end_date: the end date
    :type end_date: int
    :param tags: the tags
    :type tags: str
    :param description: the description of the album
    :type description: str
    :param album_type: a custom field used for aggregation and searching
    :type album_type: str
    :param album_type_id: a custom indexed number used for aggregation and searching
    :type album_type_id: int
    :param sub_type: a custom string field used for aggregation and searching
    :type sub_type: str
    :param latitude: latitude used to update the album&#39;s location
    :type latitude: float
    :param longitude: longitude used to update the album&#39;s location
    :type longitude: float
    :param location_description: the location description
    :type location_description: str
    :param visibility: the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    :type visibility: str
    :param game_type: @deprecated, use the appKey
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param cell_phone: the cell phone number
    :type cell_phone: str
    :param street_address: The street address of the location
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the location
    :type city: str
    :param state: The state of of the location
    :type state: str
    :param postal_code: The postal code of the location
    :type postal_code: str
    :param full_address: The full address of the location which should include the street address, city, state, and postal code
    :type full_address: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param category_ids: comma separated category ids string associated with the Album
    :type category_ids: str
    :param category_filter_ids: comma separated filter ids string associated with the Album
    :type category_filter_ids: str
    :param audience_ids: comma separated audience ids string associated with the album
    :type audience_ids: str
    :param include_all_app_users_as_members: determines whether to include all app users as members (only admins of the app can do this)
    :type include_all_app_users_as_members: bool
    :param include_audiences_as_members: determines whether to include all users of the audiences as members (only admins of the app can do this)
    :type include_audiences_as_members: bool
    :param audience_operator: determines whether to use ands or ors when using the audience list to add users
    :type audience_operator: str
    :param approval_status: The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    :type approval_status: str
    :param linked_object_type: sets a linked object so that it can be returned as part of the album response
    :type linked_object_type: str
    :param linked_object_id: sets a linked object id so that it can be returned as part of the album response
    :type linked_object_id: int

    :rtype: Union[SearchResponse, Tuple[SearchResponse, int], Tuple[SearchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def add_album_users(version, album_id, include_friend_group, device_id=None, account_id=None, read=None, write=None, delete=None, add=None, connections=None, connection_groups=None):  # noqa: E501
    """Add Album Users

    Add users to an album as participants. # noqa: E501

    :param version: 
    :type version: 
    :param album_id: the album ID
    :type album_id: int
    :param include_friend_group: determines whether to include all friends as participants
    :type include_friend_group: bool
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param read: determines whether the users being added have read permissions
    :type read: bool
    :param write: determines whether the users being added have write permissions
    :type write: bool
    :param delete: determines whether the users being added have delete permissions
    :type delete: bool
    :param add: determines whether the users being added have add permissions
    :type add: bool
    :param connections: comma separated list of connection IDs
    :type connections: str
    :param connection_groups: comma separated list of connection group IDs
    :type connection_groups: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def approve_album(version, album_id, device_id=None, account_id=None, approval_status=None, verified=None):  # noqa: E501
    """Approve Album

    Sets the approval status of an Album. # noqa: E501

    :param version: 
    :type version: 
    :param album_id: The ID of the album
    :type album_id: int
    :param device_id: A unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param approval_status: The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    :type approval_status: str
    :param verified: Sets whether the album should be marked as \&quot;verified\&quot;
    :type verified: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_album_collection(version, return_nulls, album_id, device_id=None, account_id=None, like_preview_size=None, asset_preview_size=None, note_preview_size=None, connection_preview_size=None, audience_preview_size=None):  # noqa: E501
    """ Get Album

    Get an Album. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: This parameter is deprecated.
    :type return_nulls: bool
    :param album_id: the album to look up
    :type album_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param like_preview_size: returns the last X likes. To search on and paginate the remaining likes - please use the \&quot;/like/search\&quot;Â endpoint.
    :type like_preview_size: int
    :param asset_preview_size: returns the first X assets. To search on and paginate the remaining assets - please use the \&quot;/assets/search\&quot;Â endpoint.
    :type asset_preview_size: int
    :param note_preview_size: returns the last X notes. To search on and paginate the remaining notes - please use the \&quot;/note/search\&quot; endpoint.
    :type note_preview_size: int
    :param connection_preview_size: returns the first X users/connections. To search on and paginate the remaining connections - please use the \&quot;/permissions/search\&quot; endpoint.
    :type connection_preview_size: int
    :param audience_preview_size: returns the first X audiences. To search on and paginate the remaining audiences - please use the \&quot;/audience/search\&quot; endpoint.
    :type audience_preview_size: int

    :rtype: Union[AlbumFullResponse, Tuple[AlbumFullResponse, int], Tuple[AlbumFullResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def leave_album(version, album_id, device_id=None, account_id=None):  # noqa: E501
    """Leave Album

     Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums. # noqa: E501

    :param version: 
    :type version: 
    :param album_id: the album ID
    :type album_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_album(version, album_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Album

    Deletes an Album # noqa: E501

    :param version: 
    :type version: 
    :param album_id: the album ID to delete
    :type album_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_album_users(version, album_id, remove_friend_group, device_id=None, account_id=None, connections=None, connection_groups=None):  # noqa: E501
    """Remove Album Users

    Remove participants of an album. # noqa: E501

    :param version: 
    :type version: 
    :param album_id: the album ID
    :type album_id: int
    :param remove_friend_group: remove friend group
    :type remove_friend_group: bool
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param connections: comma separated list of connection IDs
    :type connections: str
    :param connection_groups: comma separated list of connection group IDs
    :type connection_groups: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_albums(version, filter, album_type_id, sub_type, include_inactive, sort_field, descending, start, limit, range, include_liked, include_favorited, include_permissions, like_preview_size, asset_preview_size, note_preview_size, connection_preview_size, audience_preview_size, device_id=None, account_id=None, connection_account_id=None, owner_id=None, album_ids=None, exclude_album_ids=None, media_id=None, keyword=None, album_type=None, limit_per_album_type=None, date_created=None, updated_since=None, updated_before=None, created_since=None, created_before=None, started_since=None, started_before=None, ended_since=None, ended_before=None, latitude=None, longitude=None, app_key=None, category_ids=None, category_filter_ids=None, audience_ids=None, exclude_audience_ids=None, include_completable=None, include_rating=None, search_mode=None, stack_search=None, stack_window_size=None, min_stack_per_page=None, stack_pagination_identifier=None, stack_details=None, flag_count_minimum=None, remove_flagged_content=None, verified_filter=None, linked_object_type=None, linked_object_id=None, order_audience_id=None, ignore_default_app_filter=None, search_expression=None, generate_albums=None):  # noqa: E501
    """Search Albums

    Searches on Albums. # noqa: E501

    :param version: 
    :type version: 
    :param filter: a comma separated list of filters: * MINE - Return albums that the user has created. * SHARED - Return albums that have been shared to the user via addAlbumUsers, or addUsersToPermissionable . * FOLLOWER - Return albums that have been created by the user&#39;s followers (the content needs to have been APPROVED or FEATURED). * FOLLOWING - Return albums that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). * PUBLIC - Return all PUBLIC albums that have been APPROVED or FEATURED. * ALL_PUBLIC - Return all PUBLIC albums regardless of whether they are approved or not (ignores the approval status). * LIKED - Return all albums that the user has liked. * FEATURED - Return all albums that have been featured. * PENDING - Return all pending albums. 
    :type filter: str
    :param album_type_id: id of custom albumType
    :type album_type_id: int
    :param sub_type: filter albums with this album sub type
    :type sub_type: str
    :param include_inactive: determines whether to return inactive albums
    :type include_inactive: bool
    :param sort_field: the field to sort by. See AlbumApiMap
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination (There is a hard limit of 100)
    :type limit: int
    :param range: the maximum range the album can be from the center (used when sortField&#x3D;ALBUM_DISTANCE)
    :type range: float
    :param include_liked: returns whether or not the current logged in user has liked the album
    :type include_liked: bool
    :param include_favorited: returns whether or not the current logged in user has favorited the album
    :type include_favorited: bool
    :param include_permissions: returns permission details on whether they have read/write/delete permissions etc (client app probably doesn&#39;t need this)
    :type include_permissions: bool
    :param like_preview_size: returns the last X likes
    :type like_preview_size: int
    :param asset_preview_size: returns the first X assets
    :type asset_preview_size: int
    :param note_preview_size: returns the last X notes
    :type note_preview_size: int
    :param connection_preview_size: returns the first X users/connections
    :type connection_preview_size: int
    :param audience_preview_size: returns the first X audiences. To search on and paginate the remaining audiences, please use the \&quot;/audience/search\&quot; endpoint.
    :type audience_preview_size: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: the account ID of the user that the results will be based on. This is used to return albums that this account has liked/favorited.
    :type connection_account_id: int
    :param owner_id: search on albums that have been created by this account (that the user has permissions to)
    :type owner_id: int
    :param album_ids: search on album within a comma separated list of album IDs (this does not work with sortField&#x3D;ALBUM_DISTANCE, or when stackSearch&#x3D;true)
    :type album_ids: str
    :param exclude_album_ids: Only for CLOUDINDEX mode, exclude albums with ids matching this list
    :type exclude_album_ids: str
    :param media_id: search on albums that are in a particular media offering
    :type media_id: int
    :param keyword: keyword search string
    :type keyword: str
    :param album_type: filter albums with this album type
    :type album_type: str
    :param limit_per_album_type: When using multiple album types this sets a per-album-type limit (used with cloud index mode)
    :type limit_per_album_type: int
    :param date_created: return items that have been created before this date (time-stamp in milliseconds)
    :type date_created: int
    :param updated_since: return items that have been updated since this date (time-stamp in milliseconds)
    :type updated_since: int
    :param updated_before: return items that have been updated before this date (time-stamp in milliseconds)
    :type updated_before: int
    :param created_since: return items that have been created since this date (time-stamp in milliseconds)
    :type created_since: int
    :param created_before: return items that have been created before this date (time-stamp in milliseconds)
    :type created_before: int
    :param started_since: return items that have been started since this date (time-stamp in milliseconds)
    :type started_since: int
    :param started_before: return items that have been started before this date (time-stamp in milliseconds)
    :type started_before: int
    :param ended_since: return items that have been ended since this date (time-stamp in milliseconds)
    :type ended_since: int
    :param ended_before: return items that have been ended before this date (time-stamp in milliseconds)
    :type ended_before: int
    :param latitude: the latitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)
    :type latitude: float
    :param longitude: the longitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)
    :type longitude: float
    :param app_key: the application key to filter results by application. This is required for consumer searches. Leaving this empty will return albums for the applications that the logged in user owns or has access to.
    :type app_key: str
    :param category_ids: return results with categories matching this list
    :type category_ids: str
    :param category_filter_ids: return results with filters matching this list
    :type category_filter_ids: str
    :param audience_ids: return results with audiences matching this list
    :type audience_ids: str
    :param exclude_audience_ids: exclude audiences with ids matching this list
    :type exclude_audience_ids: str
    :param include_completable: returns the user&#39;s completable object for the album if it exists
    :type include_completable: bool
    :param include_rating: returns the user&#39;s rating for the album if it exists
    :type include_rating: bool
    :param search_mode: The search index mode to use (RDS, LUCENE, or CLOUDINDEX). If not provided will use server default.
    :type search_mode: str
    :param stack_search: groups similar albums together that have the same albumTypeId, within a time window defined in stackWindowSize
    :type stack_search: bool
    :param stack_window_size: size of each window for each stack
    :type stack_window_size: int
    :param min_stack_per_page: The minimum number of stacks returned in a response. For example,  first call, minStackPerPage &#x3D; 20, the API will return at least 20 results
    :type min_stack_per_page: int
    :param stack_pagination_identifier: this is used to tell the system where it left off on the previous previous page, since we can&#39;t use start/limit for stackSearch
    :type stack_pagination_identifier: str
    :param stack_details: set this to true when making the call to view the albums in the stack
    :type stack_details: bool
    :param flag_count_minimum: Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)
    :type flag_count_minimum: int
    :param remove_flagged_content: return items that have flagCount &gt;&#x3D; flagThreshold (controls removal of flagged content)
    :type remove_flagged_content: bool
    :param verified_filter: setting to true will return only verified albums only, setting to false will return non-verified albums only (leave empty to return both)
    :type verified_filter: bool
    :param linked_object_type: filter results by the linkedObjectType
    :type linked_object_type: str
    :param linked_object_id: filter results by the linkedObjectId
    :type linked_object_id: int
    :param order_audience_id: determines whether to use the order assigned via the /album/order/* api (which is tied to an audience)
    :type order_audience_id: int
    :param ignore_default_app_filter: if true, ignore the application&#39;s default app filter when searching
    :type ignore_default_app_filter: bool
    :param search_expression: Advanced search expression to be used by the server
    :type search_expression: str
    :param generate_albums: If true and results are empty, attempt to generate albums via templates
    :type generate_albums: bool

    :rtype: Union[List[AlbumFullResponse], Tuple[List[AlbumFullResponse], int], Tuple[List[AlbumFullResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_album_collection(version, album_id, device_id=None, account_id=None, assets_to_add=None, assets_to_remove=None, asset_id=None, media=None, media_url=None, active=None, title=None, start_date=None, end_date=None, tags=None, description=None, album_type=None, album_type_id=None, sub_type=None, public_read=None, public_write=None, public_delete=None, public_add=None, latitude=None, longitude=None, location_description=None, visibility=None, cell_phone=None, street_address=None, street_address2=None, city=None, state=None, postal_code=None, full_address=None, anonymous=None, meta_data=None, category_ids=None, category_filter_ids=None, audience_ids=None, audience_ids_to_add=None, audience_ids_to_remove=None, include_all_app_users_as_members=None, include_audiences_as_members=None, audience_operator=None, linked_object_type=None, linked_object_id=None, index_now=None):  # noqa: E501
    """Update Album

    Update an Album. # noqa: E501

    :param version: 
    :type version: 
    :param album_id: the ID of the album to update
    :type album_id: int
    :param device_id: a unique ID given by the device (deviceId or accountId required)
    :type device_id: str
    :param account_id: the account ID of the user (deviceId or accountId required)
    :type account_id: int
    :param assets_to_add: Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)
    :type assets_to_add: str
    :param assets_to_remove: Comma separated list of asset IDs to remove from the album&#39;s asset list
    :type assets_to_remove: str
    :param asset_id: the cover asset ID
    :type asset_id: int
    :param media: a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)
    :type media: str
    :param media_url: this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)
    :type media_url: str
    :param active: determines whether the album is active or inactive
    :type active: bool
    :param title: the title of the album
    :type title: str
    :param start_date: the start date
    :type start_date: int
    :param end_date: the end date
    :type end_date: int
    :param tags: the tags
    :type tags: str
    :param description: the description of the album
    :type description: str
    :param album_type: a custom field used for aggregation and searching
    :type album_type: str
    :param album_type_id: a custom indexed number used for aggregation and searching
    :type album_type_id: int
    :param sub_type: a custom string field used for aggregation and searching
    :type sub_type: str
    :param public_read: determines whether the album&#39;s participants have read permissions
    :type public_read: bool
    :param public_write: determines whether the album&#39;s participants have write permissions
    :type public_write: bool
    :param public_delete: determines whether the album&#39;s participants have delete permissions
    :type public_delete: bool
    :param public_add: determines whether the album&#39;s participants have add permissions
    :type public_add: bool
    :param latitude: latitude used to update the album&#39;s location
    :type latitude: float
    :param longitude: longitude used to update the album&#39;s location
    :type longitude: float
    :param location_description: the location description
    :type location_description: str
    :param visibility: the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    :type visibility: str
    :param cell_phone: the cell phone number
    :type cell_phone: str
    :param street_address: The street address of the location
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the location
    :type city: str
    :param state: The state of of the location
    :type state: str
    :param postal_code: The postal code of the location
    :type postal_code: str
    :param full_address: The full address of the location which should include the street address, city, state, and postal code
    :type full_address: str
    :param anonymous: determines whether the album is posted anonymously
    :type anonymous: bool
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param category_ids: comma separated category ids string associated with the Album
    :type category_ids: str
    :param category_filter_ids: comma separated filter ids string associated with the Album
    :type category_filter_ids: str
    :param audience_ids: comma separated audience ids string associated with the album
    :type audience_ids: str
    :param audience_ids_to_add: comma separated audience ids to add to the album
    :type audience_ids_to_add: str
    :param audience_ids_to_remove: comma separated audience ids to remove from the album (overrides audienceIds and audienceIdsToAdd)
    :type audience_ids_to_remove: str
    :param include_all_app_users_as_members: determines whether to include all app users as members (only admins of the app can do this)
    :type include_all_app_users_as_members: bool
    :param include_audiences_as_members: determines whether to include all users of the audiences as members (only admins of the app can do this)
    :type include_audiences_as_members: bool
    :param audience_operator: determines whether to use ands or ors when using the audience list to add users
    :type audience_operator: str
    :param linked_object_type: sets a linked object so that it can be returned as part of the album response
    :type linked_object_type: str
    :param linked_object_id: sets a linked object id so that it can be returned as part of the album response
    :type linked_object_id: int
    :param index_now: determines whether the album should be indexed immediately
    :type index_now: bool

    :rtype: Union[AlbumResponse, Tuple[AlbumResponse, int], Tuple[AlbumResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
