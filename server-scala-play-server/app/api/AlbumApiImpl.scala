package api

import model.AlbumFullResponse
import model.AlbumResponse
import model.BigDecimal
import model.SearchResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[AlbumApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AlbumApiImpl extends AlbumApi {
  /**
    * @inheritdoc
    */
  override def addAlbumCollection(version: BigDecimal, title: String, coverAssetNullable: Boolean, includeCoverInAssetList: Boolean, publicRead: Boolean, publicWrite: Boolean, publicDelete: Boolean, publicAdd: Boolean, anonymous: Boolean, deviceId: Option[String], accountId: Option[Long], assetsToAdd: Option[String], media: Option[TemporaryFile], mediaURL: Option[String], assetId: Option[Long], attachedMedia: Option[TemporaryFile], attachedMediaURL: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], description: Option[String], albumType: Option[String], albumTypeId: Option[Long], subType: Option[String], latitude: Option[Double], longitude: Option[Double], locationDescription: Option[String], visibility: Option[String], gameType: Option[String], appKey: Option[String], cellPhone: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], fullAddress: Option[String], metaData: Option[String], categoryIds: Option[String], categoryFilterIds: Option[String], audienceIds: Option[String], includeAllAppUsersAsMembers: Option[Boolean], includeAudiencesAsMembers: Option[Boolean], audienceOperator: Option[String], approvalStatus: Option[String], linkedObjectType: Option[String], linkedObjectId: Option[Long]): SearchResponse = {
    // TODO: Implement better logic

    SearchResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def addAlbumUsers(version: BigDecimal, albumId: Long, includeFriendGroup: Boolean, deviceId: Option[String], accountId: Option[Long], read: Option[Boolean], write: Option[Boolean], delete: Option[Boolean], add: Option[Boolean], connections: Option[String], connectionGroups: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def approveAlbum(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long], approvalStatus: Option[String], verified: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAlbumCollection(version: BigDecimal, returnNulls: Boolean, albumId: Long, deviceId: Option[String], accountId: Option[Long], likePreviewSize: Option[Int], assetPreviewSize: Option[Int], notePreviewSize: Option[Int], connectionPreviewSize: Option[Int], audiencePreviewSize: Option[Int]): AlbumFullResponse = {
    // TODO: Implement better logic

    AlbumFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def leaveAlbum(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeAlbum(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeAlbumUsers(version: BigDecimal, albumId: Long, removeFriendGroup: Boolean, deviceId: Option[String], accountId: Option[Long], connections: Option[String], connectionGroups: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchAlbums(version: BigDecimal, filter: String, albumTypeId: Long, subType: String, includeInactive: Boolean, sortField: String, descending: Boolean, start: Int, limit: Int, range: Double, includeLiked: Boolean, includeFavorited: Boolean, includePermissions: Boolean, likePreviewSize: Int, assetPreviewSize: Int, notePreviewSize: Int, connectionPreviewSize: Int, audiencePreviewSize: Int, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], ownerId: Option[Long], albumIds: Option[String], excludeAlbumIds: Option[String], mediaId: Option[Long], keyword: Option[String], albumType: Option[String], limitPerAlbumType: Option[Int], dateCreated: Option[Long], updatedSince: Option[Long], updatedBefore: Option[Long], createdSince: Option[Long], createdBefore: Option[Long], startedSince: Option[Long], startedBefore: Option[Long], endedSince: Option[Long], endedBefore: Option[Long], latitude: Option[Double], longitude: Option[Double], appKey: Option[String], categoryIds: Option[String], categoryFilterIds: Option[String], audienceIds: Option[String], excludeAudienceIds: Option[String], includeCompletable: Option[Boolean], includeRating: Option[Boolean], searchMode: Option[String], stackSearch: Option[Boolean], stackWindowSize: Option[Int], minStackPerPage: Option[Int], stackPaginationIdentifier: Option[String], stackDetails: Option[Boolean], flagCountMinimum: Option[Long], removeFlaggedContent: Option[Boolean], verifiedFilter: Option[Boolean], linkedObjectType: Option[String], linkedObjectId: Option[Long], orderAudienceId: Option[Long], ignoreDefaultAppFilter: Option[Boolean], searchExpression: Option[String], generateAlbums: Option[Boolean]): List[AlbumFullResponse] = {
    // TODO: Implement better logic

    List.empty[AlbumFullResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateAlbumCollection(version: BigDecimal, albumId: Long, deviceId: Option[String], accountId: Option[Long], assetsToAdd: Option[String], assetsToRemove: Option[String], assetId: Option[Long], media: Option[TemporaryFile], mediaURL: Option[String], active: Option[Boolean], title: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], description: Option[String], albumType: Option[String], albumTypeId: Option[Long], subType: Option[String], publicRead: Option[Boolean], publicWrite: Option[Boolean], publicDelete: Option[Boolean], publicAdd: Option[Boolean], latitude: Option[Double], longitude: Option[Double], locationDescription: Option[String], visibility: Option[String], cellPhone: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], fullAddress: Option[String], anonymous: Option[Boolean], metaData: Option[String], categoryIds: Option[String], categoryFilterIds: Option[String], audienceIds: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], includeAllAppUsersAsMembers: Option[Boolean], includeAudiencesAsMembers: Option[Boolean], audienceOperator: Option[String], linkedObjectType: Option[String], linkedObjectId: Option[Long], indexNow: Option[Boolean]): AlbumResponse = {
    // TODO: Implement better logic

    AlbumResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
