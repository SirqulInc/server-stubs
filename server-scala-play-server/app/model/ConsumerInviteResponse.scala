package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConsumerInviteResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConsumerInviteResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  inviterId: Option[Long],
  inviter: Option[AccountShortResponse],
  connection: Option[ConnectionResponse],
  inviteText: Option[String],
  token: Option[String],
  albumCoverUrl: Option[String],
  albumTitle: Option[String],
  appName: Option[String],
  welcomeText: Option[String],
  application: Option[ApplicationShortResponse],
  retailerLocation: Option[RetailerLocationResponse],
  offer: Option[OfferShortResponse],
  album: Option[AlbumResponse],
  returning: Option[String]
)

object ConsumerInviteResponse {
  implicit lazy val consumerInviteResponseJsonFormat: Format[ConsumerInviteResponse] = Json.format[ConsumerInviteResponse]
}

