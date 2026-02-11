package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AppVersion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AppVersion(
  minorVersion: Option[Int],
  majorVersion: Option[Int],
  versionIndex: Option[Int]
)

object AppVersion {
  implicit lazy val appVersionJsonFormat: Format[AppVersion] = Json.format[AppVersion]
}

