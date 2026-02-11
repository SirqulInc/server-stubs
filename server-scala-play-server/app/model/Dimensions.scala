package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Dimensions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Dimensions(
  width: Option[Double],
  height: Option[Double],
  depth: Option[Double],
  volume: Option[Double]
)

object Dimensions {
  implicit lazy val dimensionsJsonFormat: Format[Dimensions] = Json.format[Dimensions]
}

