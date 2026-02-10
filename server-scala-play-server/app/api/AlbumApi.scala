package api

import play.api.libs.json._
import model.AlbumFullResponse
import model.AlbumResponse
import model.BigDecimal
import model.SearchResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AlbumApi {
  /**
    * Create Album
    * Create an Album.
    * @param title the title of the album
    * @param coverAssetNullable determines whether the cover image of the album can be empty, else will use the user&#39;s profile picture as the cover image
    * @param includeCoverInAssetList determines whether the cover image should be added to the album asset list
    * @param publicRead determines whether the album&#39;s participants has read permissions
    * @param publicWrite determines whether the album&#39;s participants has write permissions
    * @param publicDelete determines whether the album&#39;s participants has delete permissions
    * @param publicAdd determines whether the album&#39;s participants has add permissions
    * @param anonymous determines whether the album is posted anonymously
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param assetsToAdd Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)
    * @param media a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)
    * @param mediaURL this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)
    * @param assetId The asset ID to set the album cover image
    * @param attachedMedia a MultipartFile containing an asset that the \&quot;media\&quot; file references. Example to upload a video: the \&quot;media\&quot; file should contain a screen capture of the video, and the \&quot;attachedMedia\&quot; should be the actual video.
    * @param attachedMediaURL this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc)
    * @param startDate the start date
    * @param endDate the end date
    * @param tags the tags
    * @param description the description of the album
    * @param albumType a custom field used for aggregation and searching
    * @param albumTypeId a custom indexed number used for aggregation and searching
    * @param subType a custom string field used for aggregation and searching
    * @param latitude latitude used to update the album&#39;s location
    * @param longitude longitude used to update the album&#39;s location
    * @param locationDescription the location description
    * @param visibility the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    * @param gameType @deprecated, use the appKey
    * @param appKey the application key
    * @param cellPhone the cell phone number
    * @param streetAddress The street address of the location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the location
    * @param state The state of of the location
    * @param postalCode The postal code of the location
    * @param fullAddress The full address of the location which should include the street address, city, state, and postal code
    * @param metaData External custom client defined data
    * @param categoryIds comma separated category ids string associated with the Album
    * @param categoryFilterIds comma separated filter ids string associated with the Album
    * @param audienceIds comma separated audience ids string associated with the album
    * @param includeAllAppUsersAsMembers determines whether to include all app users as members (only admins of the app can do this)
    * @param includeAudiencesAsMembers determines whether to include all users of the audiences as members (only admins of the app can do this)
    * @param audienceOperator determines whether to use ands or ors when using the audience list to add users
    * @param approvalStatus The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    * @param linkedObjectType sets a linked object so that it can be returned as part of the album response
    * @param linkedObjectId sets a linked object id so that it can be returned as part of the album response
    */
  def addAlbumCollection(version: BigDecimal, title: String, coverAssetNullable: Boolean, includeCoverInAssetList: Boolean, publicRead: Boolean, publicWrite: Boolean, publicDelete: Boolean, publicAdd: Boolean, anonymous: Boolean, deviceId: Option[String], accountId: Option[Long], assetsToAdd: Option[String], media: Option[TemporaryFile], mediaURL: Option[String], assetId: Option[Long], attachedMedia: Option[TemporaryFile], attachedMediaURL: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], description: Option[String], albumType: Option[String], albumTypeId: Option[Long], subType: Option[String], latitude: Option[Double], longitude: Option[Double], locationDescription: Option[String], visibility: Option[String], gameType: Option[String], appKey: Option[String], cellPhone: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], fullAddress: Option[String], metaData: Option[String], categoryIds: Option[String], categoryFilterIds: Option[String], audienceIds: Option[String], includeAllAppUsersAsMembers: Option[Boolean], includeAudiencesAsMembers: Option[Boolean], audienceOperator: Option[String], approvalStatus: Option[String], linkedObjectType: Option[String], linkedObjectId: Option[Long]): SearchResponse

  /**
    * Add Album Users
    * Add users to an album as participants.
    * @param albumId the album ID
    * @param includeFriendGroup determines whether to include all friends as participants
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param read determines whether the users being added have read permissions
    * @param write determines whether the users being added have write permissions
    * @param delete determines whether the users being added have delete permissions
    * @param add determines whether the users being added have add permissions
    * @param connections comma separated list of connection IDs
    * @param connectionGroups comma separated list of connection group IDs
    */
  def addAlbumUsers(version: BigDecimal, albumId: Long, includeFriendGroup: Boolean, deviceId: Option[String], accountId: Option[Long], read: Option[Boolean], write: Option[Boolean], delete: Option[Boolean], add: Option[Boolean], connections: Option[String], connectionGroups: Option[String]): SirqulResponse

  /**
    * Approve Album
    * Sets the approval status of an Album.
    * @param albumId The ID of the album
    * @param deviceId A unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param approvalStatus The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    * @param verified Sets whether the album should be marked as \&quot;verified\&quot;
    */
  def approveAlbum(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long], approvalStatus: Option[String], verified: Option[Boolean]): SirqulResponse

  /**
    *  Get Album
    * Get an Album.
    * @param returnNulls This parameter is deprecated.
    * @param albumId the album to look up
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param likePreviewSize returns the last X likes. To search on and paginate the remaining likes - please use the \&quot;/like/search\&quot;Â endpoint.
    * @param assetPreviewSize returns the first X assets. To search on and paginate the remaining assets - please use the \&quot;/assets/search\&quot;Â endpoint.
    * @param notePreviewSize returns the last X notes. To search on and paginate the remaining notes - please use the \&quot;/note/search\&quot; endpoint.
    * @param connectionPreviewSize returns the first X users/connections. To search on and paginate the remaining connections - please use the \&quot;/permissions/search\&quot; endpoint.
    * @param audiencePreviewSize returns the first X audiences. To search on and paginate the remaining audiences - please use the \&quot;/audience/search\&quot; endpoint.
    */
  def getAlbumCollection(version: BigDecimal, returnNulls: Boolean, albumId: Long, deviceId: Option[String], accountId: Option[Long], likePreviewSize: Option[Int], assetPreviewSize: Option[Int], notePreviewSize: Option[Int], connectionPreviewSize: Option[Int], audiencePreviewSize: Option[Int]): AlbumFullResponse

  /**
    * Leave Album
    *  Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.
    * @param albumId the album ID
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    */
  def leaveAlbum(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Delete Album
    * Deletes an Album
    * @param albumId the album ID to delete
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    */
  def removeAlbum(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Remove Album Users
    * Remove participants of an album.
    * @param albumId the album ID
    * @param removeFriendGroup remove friend group
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param connections comma separated list of connection IDs
    * @param connectionGroups comma separated list of connection group IDs
    */
  def removeAlbumUsers(version: BigDecimal, albumId: Long, removeFriendGroup: Boolean, deviceId: Option[String], accountId: Option[Long], connections: Option[String], connectionGroups: Option[String]): SirqulResponse

  /**
    * Search Albums
    * Searches on Albums.
    * @param filter a comma separated list of filters: * MINE - Return albums that the user has created. * SHARED - Return albums that have been shared to the user via addAlbumUsers, or addUsersToPermissionable . * FOLLOWER - Return albums that have been created by the user&#39;s followers (the content needs to have been APPROVED or FEATURED). * FOLLOWING - Return albums that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). * PUBLIC - Return all PUBLIC albums that have been APPROVED or FEATURED. * ALL_PUBLIC - Return all PUBLIC albums regardless of whether they are approved or not (ignores the approval status). * LIKED - Return all albums that the user has liked. * FEATURED - Return all albums that have been featured. * PENDING - Return all pending albums. 
    * @param albumTypeId id of custom albumType
    * @param subType filter albums with this album sub type
    * @param includeInactive determines whether to return inactive albums
    * @param sortField the field to sort by. See AlbumApiMap
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param start the start index for pagination
    * @param limit the limit for pagination (There is a hard limit of 100)
    * @param range the maximum range the album can be from the center (used when sortField&#x3D;ALBUM_DISTANCE)
    * @param includeLiked returns whether or not the current logged in user has liked the album
    * @param includeFavorited returns whether or not the current logged in user has favorited the album
    * @param includePermissions returns permission details on whether they have read/write/delete permissions etc (client app probably doesn&#39;t need this)
    * @param likePreviewSize returns the last X likes
    * @param assetPreviewSize returns the first X assets
    * @param notePreviewSize returns the last X notes
    * @param connectionPreviewSize returns the first X users/connections
    * @param audiencePreviewSize returns the first X audiences. To search on and paginate the remaining audiences, please use the \&quot;/audience/search\&quot; endpoint.
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param connectionAccountId the account ID of the user that the results will be based on. This is used to return albums that this account has liked/favorited.
    * @param ownerId search on albums that have been created by this account (that the user has permissions to)
    * @param albumIds search on album within a comma separated list of album IDs (this does not work with sortField&#x3D;ALBUM_DISTANCE, or when stackSearch&#x3D;true)
    * @param excludeAlbumIds Only for CLOUDINDEX mode, exclude albums with ids matching this list
    * @param mediaId search on albums that are in a particular media offering
    * @param keyword keyword search string
    * @param albumType filter albums with this album type
    * @param limitPerAlbumType When using multiple album types this sets a per-album-type limit (used with cloud index mode)
    * @param dateCreated return items that have been created before this date (time-stamp in milliseconds)
    * @param updatedSince return items that have been updated since this date (time-stamp in milliseconds)
    * @param updatedBefore return items that have been updated before this date (time-stamp in milliseconds)
    * @param createdSince return items that have been created since this date (time-stamp in milliseconds)
    * @param createdBefore return items that have been created before this date (time-stamp in milliseconds)
    * @param startedSince return items that have been started since this date (time-stamp in milliseconds)
    * @param startedBefore return items that have been started before this date (time-stamp in milliseconds)
    * @param endedSince return items that have been ended since this date (time-stamp in milliseconds)
    * @param endedBefore return items that have been ended before this date (time-stamp in milliseconds)
    * @param latitude the latitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)
    * @param longitude the longitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)
    * @param appKey the application key to filter results by application. This is required for consumer searches. Leaving this empty will return albums for the applications that the logged in user owns or has access to.
    * @param categoryIds return results with categories matching this list
    * @param categoryFilterIds return results with filters matching this list
    * @param audienceIds return results with audiences matching this list
    * @param excludeAudienceIds exclude audiences with ids matching this list
    * @param includeCompletable returns the user&#39;s completable object for the album if it exists
    * @param includeRating returns the user&#39;s rating for the album if it exists
    * @param searchMode The search index mode to use (RDS, LUCENE, or CLOUDINDEX). If not provided will use server default.
    * @param stackSearch groups similar albums together that have the same albumTypeId, within a time window defined in stackWindowSize
    * @param stackWindowSize size of each window for each stack
    * @param minStackPerPage The minimum number of stacks returned in a response. For example,  first call, minStackPerPage &#x3D; 20, the API will return at least 20 results
    * @param stackPaginationIdentifier this is used to tell the system where it left off on the previous previous page, since we can&#39;t use start/limit for stackSearch
    * @param stackDetails set this to true when making the call to view the albums in the stack
    * @param flagCountMinimum Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)
    * @param removeFlaggedContent return items that have flagCount &gt;&#x3D; flagThreshold (controls removal of flagged content)
    * @param verifiedFilter setting to true will return only verified albums only, setting to false will return non-verified albums only (leave empty to return both)
    * @param linkedObjectType filter results by the linkedObjectType
    * @param linkedObjectId filter results by the linkedObjectId
    * @param orderAudienceId determines whether to use the order assigned via the /album/order/_* api (which is tied to an audience)
    * @param ignoreDefaultAppFilter if true, ignore the application&#39;s default app filter when searching
    * @param searchExpression Advanced search expression to be used by the server
    * @param generateAlbums If true and results are empty, attempt to generate albums via templates
    */
  def searchAlbums(version: BigDecimal, filter: String, albumTypeId: Long, subType: String, includeInactive: Boolean, sortField: String, descending: Boolean, start: Int, limit: Int, range: Double, includeLiked: Boolean, includeFavorited: Boolean, includePermissions: Boolean, likePreviewSize: Int, assetPreviewSize: Int, notePreviewSize: Int, connectionPreviewSize: Int, audiencePreviewSize: Int, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], ownerId: Option[Long], albumIds: Option[String], excludeAlbumIds: Option[String], mediaId: Option[Long], keyword: Option[String], albumType: Option[String], limitPerAlbumType: Option[Int], dateCreated: Option[Long], updatedSince: Option[Long], updatedBefore: Option[Long], createdSince: Option[Long], createdBefore: Option[Long], startedSince: Option[Long], startedBefore: Option[Long], endedSince: Option[Long], endedBefore: Option[Long], latitude: Option[Double], longitude: Option[Double], appKey: Option[String], categoryIds: Option[String], categoryFilterIds: Option[String], audienceIds: Option[String], excludeAudienceIds: Option[String], includeCompletable: Option[Boolean], includeRating: Option[Boolean], searchMode: Option[String], stackSearch: Option[Boolean], stackWindowSize: Option[Int], minStackPerPage: Option[Int], stackPaginationIdentifier: Option[String], stackDetails: Option[Boolean], flagCountMinimum: Option[Long], removeFlaggedContent: Option[Boolean], verifiedFilter: Option[Boolean], linkedObjectType: Option[String], linkedObjectId: Option[Long], orderAudienceId: Option[Long], ignoreDefaultAppFilter: Option[Boolean], searchExpression: Option[String], generateAlbums: Option[Boolean]): List[AlbumFullResponse]

  /**
    * Update Album
    * Update an Album.
    * @param albumId the ID of the album to update
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param assetsToAdd Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)
    * @param assetsToRemove Comma separated list of asset IDs to remove from the album&#39;s asset list
    * @param assetId the cover asset ID
    * @param media a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)
    * @param mediaURL this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)
    * @param active determines whether the album is active or inactive
    * @param title the title of the album
    * @param startDate the start date
    * @param endDate the end date
    * @param tags the tags
    * @param description the description of the album
    * @param albumType a custom field used for aggregation and searching
    * @param albumTypeId a custom indexed number used for aggregation and searching
    * @param subType a custom string field used for aggregation and searching
    * @param publicRead determines whether the album&#39;s participants have read permissions
    * @param publicWrite determines whether the album&#39;s participants have write permissions
    * @param publicDelete determines whether the album&#39;s participants have delete permissions
    * @param publicAdd determines whether the album&#39;s participants have add permissions
    * @param latitude latitude used to update the album&#39;s location
    * @param longitude longitude used to update the album&#39;s location
    * @param locationDescription the location description
    * @param visibility the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    * @param cellPhone the cell phone number
    * @param streetAddress The street address of the location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the location
    * @param state The state of of the location
    * @param postalCode The postal code of the location
    * @param fullAddress The full address of the location which should include the street address, city, state, and postal code
    * @param anonymous determines whether the album is posted anonymously
    * @param metaData External custom client defined data
    * @param categoryIds comma separated category ids string associated with the Album
    * @param categoryFilterIds comma separated filter ids string associated with the Album
    * @param audienceIds comma separated audience ids string associated with the album
    * @param audienceIdsToAdd comma separated audience ids to add to the album
    * @param audienceIdsToRemove comma separated audience ids to remove from the album (overrides audienceIds and audienceIdsToAdd)
    * @param includeAllAppUsersAsMembers determines whether to include all app users as members (only admins of the app can do this)
    * @param includeAudiencesAsMembers determines whether to include all users of the audiences as members (only admins of the app can do this)
    * @param audienceOperator determines whether to use ands or ors when using the audience list to add users
    * @param linkedObjectType sets a linked object so that it can be returned as part of the album response
    * @param linkedObjectId sets a linked object id so that it can be returned as part of the album response
    * @param indexNow determines whether the album should be indexed immediately
    */
  def updateAlbumCollection(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long], assetsToAdd: Option[String], assetsToRemove: Option[String], assetId: Option[Long], media: Option[TemporaryFile], mediaURL: Option[String], active: Option[Boolean], title: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], description: Option[String], albumType: Option[String], albumTypeId: Option[Long], subType: Option[String], publicRead: Option[Boolean], publicWrite: Option[Boolean], publicDelete: Option[Boolean], publicAdd: Option[Boolean], latitude: Option[Double], longitude: Option[Double], locationDescription: Option[String], visibility: Option[String], cellPhone: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], fullAddress: Option[String], anonymous: Option[Boolean], metaData: Option[String], categoryIds: Option[String], categoryFilterIds: Option[String], audienceIds: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], includeAllAppUsersAsMembers: Option[Boolean], includeAudiencesAsMembers: Option[Boolean], audienceOperator: Option[String], linkedObjectType: Option[String], linkedObjectId: Option[Long], indexNow: Option[Boolean]): AlbumResponse
}
