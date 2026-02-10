package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TutorialResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TutorialResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  id: Option[Long],
  name: Option[String],
  description: Option[String],
  alignment: Option[String],
  image: Option[AssetShortResponse],
  orderIndex: Option[Long],
  objectType: Option[String],
  returning: Option[String]
)

object TutorialResponse {
  implicit lazy val tutorialResponseJsonFormat: Format[TutorialResponse] = Json.format[TutorialResponse]
}

