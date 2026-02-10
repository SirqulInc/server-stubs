package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AlbumResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AlbumResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  albumId: Option[Long],
  albumType: Option[String],
  ownerId: Option[Long],
  owner: Option[AccountShortResponse],
  title: Option[String],
  description: Option[String],
  coverAsset: Option[AssetResponse],
  tags: Option[String],
  visibility: Option[AlbumResponse.Visibility.Value],
  startDate: Option[Long],
  endDate: Option[Long],
  assetCount: Option[Int],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  commentsCount: Option[Long],
  userCount: Option[Int],
  notifications: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  distance: Option[Double],
  dateCreated: Option[Long],
  dateUpdated: Option[Long],
  cellPhone: Option[String],
  fullAddress: Option[String],
  approvalStatus: Option[AlbumResponse.ApprovalStatus.Value],
  favoriteCount: Option[Long],
  liked: Option[Boolean],
  favorite: Option[Boolean],
  favoriteId: Option[Long],
  anonymous: Option[Boolean],
  flagCount: Option[Long],
  viewedCount: Option[Long],
  clickedCount: Option[Long],
  sharedCount: Option[Long],
  returning: Option[String]
)

object AlbumResponse {
  implicit lazy val albumResponseJsonFormat: Format[AlbumResponse] = Json.format[AlbumResponse]

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ApprovalStatus extends Enumeration {
    val PENDING = Value("PENDING")
    val REJECTED = Value("REJECTED")
    val APPROVED = Value("APPROVED")
    val FEATURED = Value("FEATURED")

    type ApprovalStatus = Value
    implicit lazy val ApprovalStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

