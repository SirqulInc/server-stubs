package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NoteFullResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NoteFullResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  noteId: Option[Long],
  comment: Option[String],
  tags: Option[String],
  likesCount: Option[Long],
  dislikesCount: Option[Long],
  dateCreated: Option[Long],
  createdDate: Option[Long],
  updatedDate: Option[Long],
  owner: Option[AccountShortResponse],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  attachedAssets: Option[List[AssetShortResponse]],
  likes: Option[List[LikeResponse]],
  hasLiked: Option[Boolean],
  hasDisliked: Option[Boolean],
  returning: Option[String]
)

object NoteFullResponse {
  implicit lazy val noteFullResponseJsonFormat: Format[NoteFullResponse] = Json.format[NoteFullResponse]
}

