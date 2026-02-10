package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreativeResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class CreativeResponse(
  creativeId: Option[Long],
  active: Option[Boolean],
  name: Option[String],
  description: Option[String],
  image: Option[AssetShortResponse],
  action: Option[String],
  content: Option[JsonElement],
  suffix: Option[String],
  `type`: Option[String],
  appVersion: Option[String],
  preview: Option[Boolean],
  owner: Option[AccountShortResponse],
  currentBid: Option[BidResponse]
)

object CreativeResponse {
  implicit lazy val creativeResponseJsonFormat: Format[CreativeResponse] = Json.format[CreativeResponse]
}

