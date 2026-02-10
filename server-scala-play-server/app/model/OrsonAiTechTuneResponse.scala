package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiTechTuneResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiTechTuneResponse(
  requestId: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  people: Option[Int],
  wasCutoff: Option[Boolean],
  frames: Option[Int],
  framesWithoutAFace: Option[Int],
  framesWithFaceOffscreen: Option[Int],
  framesWithWrongNumberOfPeople: Option[Int],
  height: Option[Int],
  width: Option[Int],
  fps: Option[Int]
)

object OrsonAiTechTuneResponse {
  implicit lazy val orsonAiTechTuneResponseJsonFormat: Format[OrsonAiTechTuneResponse] = Json.format[OrsonAiTechTuneResponse]
}

