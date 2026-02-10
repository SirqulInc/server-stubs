package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetFullResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AssetFullResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  assetId: Option[Long],
  fileName: Option[String],
  caption: Option[String],
  mediaType: Option[String],
  thumbnailURL: Option[String],
  coverURL: Option[String],
  fullURL: Option[String],
  assetVersion: Option[String],
  versionName: Option[String],
  versionCode: Option[Int],
  display: Option[String],
  locationDescription: Option[String],
  uploader: Option[AccountShortResponse],
  likesCount: Option[Long],
  commentsCount: Option[Int],
  latitude: Option[Double],
  longitude: Option[Double],
  attachedMediaType: Option[String],
  attachedAssetURL: Option[String],
  created: Option[Long],
  updated: Option[Long],
  searchTags: Option[String],
  metaData: Option[String],
  comments: Option[List[NoteFullResponse]],
  likes: Option[List[LikeResponse]],
  hasLiked: Option[Boolean],
  hasDisliked: Option[Boolean],
  metFlagThreshold: Option[Boolean],
  returning: Option[String]
)

object AssetFullResponse {
  implicit lazy val assetFullResponseJsonFormat: Format[AssetFullResponse] = Json.format[AssetFullResponse]
}

