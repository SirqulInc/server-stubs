package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AlbumContestResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AlbumContestResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  albumContestId: Option[Long],
  contestType: Option[String],
  owner: Option[AccountShortResponse],
  title: Option[String],
  description: Option[String],
  visibility: Option[AlbumContestResponse.Visibility.Value],
  startDate: Option[Long],
  endDate: Option[Long],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  commentsCount: Option[Int],
  userCount: Option[Int],
  comments: Option[List[NoteFullResponse]],
  likes: Option[List[LikeResponse]],
  connectionGroups: Option[List[ConnectionGroupShortResponse]],
  connections: Option[List[ConnectionResponse]],
  hasLiked: Option[Boolean],
  userPermissions: Option[Permissions],
  publicPermissions: Option[Permissions],
  album1: Option[AlbumFullResponse],
  album2: Option[AlbumFullResponse],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  distance: Option[Double],
  dateCreated: Option[Long],
  dateUpdated: Option[Long],
  approvalStatus: Option[AlbumContestResponse.ApprovalStatus.Value],
  voteCount: Option[Long],
  returning: Option[String]
)

object AlbumContestResponse {
  implicit lazy val albumContestResponseJsonFormat: Format[AlbumContestResponse] = Json.format[AlbumContestResponse]

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

