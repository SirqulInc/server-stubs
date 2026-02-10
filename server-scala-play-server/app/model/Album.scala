package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Album.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Album(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  owner: Option[Account],
  title: Option[String],
  application: Option[Application],
  approvalStatus: Option[Album.ApprovalStatus.Value],
  publicPermissions: Option[Permissions],
  userPermissions: Option[List[UserPermissions]],
  visibility: Option[Album.Visibility.Value],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  likes: Option[List[YayOrNay]],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  flags: Option[List[Flag]],
  flagCount: Option[Long],
  flagThreshold: Option[FlagThreshold],
  description: Option[String],
  albumType: Option[String],
  assets: Option[List[Asset]],
  coverAsset: Option[Asset],
  tags: Option[String],
  startDate: Option[OffsetDateTime],
  endDate: Option[OffsetDateTime],
  contactInfo: Option[ContactInfo],
  assetCount: Option[Long],
  favoriteCount: Option[Long],
  viewedCount: Option[Long],
  clickedCount: Option[Long],
  sharedCount: Option[Long],
  anonymous: Option[Boolean],
  ownerUsername: Option[String],
  display: Option[String],
  appKey: Option[String],
  billableId: Option[Long],
  subType: Option[String],
  contentAsset: Option[Asset],
  secondaryType: Option[String],
  contentName: Option[String],
  applicationTitle: Option[String],
  shortTitle: Option[String],
  defaultThreshold: Option[Long]
)

object Album {
  implicit lazy val albumJsonFormat: Format[Album] = Json.format[Album]

  // noinspection TypeAnnotation
  object ApprovalStatus extends Enumeration {
    val PENDING = Value("PENDING")
    val REJECTED = Value("REJECTED")
    val APPROVED = Value("APPROVED")
    val FEATURED = Value("FEATURED")

    type ApprovalStatus = Value
    implicit lazy val ApprovalStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

