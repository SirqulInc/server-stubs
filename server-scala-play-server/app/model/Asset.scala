package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for Asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Asset(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  premigrationId: Option[Long],
  newOwnerId: Option[Long],
  folderUri: Option[String],
  fileName: Option[String],
  mediaType: Option[String],
  mimeType: Option[String],
  metaData: Option[String],
  caption: Option[String],
  versionCode: Option[Int],
  versionName: Option[String],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  noteCount: Option[Long],
  owner: Option[Account],
  notes: Option[List[Note]],
  likes: Option[List[YayOrNay]],
  attachedAssetId: Option[Long],
  flags: Option[List[Flag]],
  flagCount: Option[Long],
  flagThreshold: Option[FlagThreshold],
  defaultAlbumType: Option[Asset.DefaultAlbumType.Value],
  album: Option[Album],
  assignment: Option[Assignment],
  application: Option[Application],
  display: Option[String],
  appKey: Option[String],
  billableId: Option[Long],
  subType: Option[String],
  contentName: Option[String],
  urifolder: Option[URI],
  defaultThreshold: Option[Long]
)

object Asset {
  implicit lazy val assetJsonFormat: Format[Asset] = Json.format[Asset]

  // noinspection TypeAnnotation
  object DefaultAlbumType extends Enumeration {
    val PROFILE = Value("PROFILE")
    val DEFAULTPROFILEAVATAR = Value("DEFAULT_PROFILE_AVATAR")
    val DEFAULTAPPICON = Value("DEFAULT_APP_ICON")
    val DEFAULTAPPLOGO = Value("DEFAULT_APP_LOGO")

    type DefaultAlbumType = Value
    implicit lazy val DefaultAlbumTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

