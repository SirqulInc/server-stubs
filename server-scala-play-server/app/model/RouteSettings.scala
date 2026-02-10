package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RouteSettings.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RouteSettings(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  setting: Option[String],
  settingType: Option[RouteSettings.SettingType.Value],
  program: Option[Program],
  hub: Option[ServiceHub]
)

object RouteSettings {
  implicit lazy val routeSettingsJsonFormat: Format[RouteSettings] = Json.format[RouteSettings]

  // noinspection TypeAnnotation
  object SettingType extends Enumeration {
    val FLOAT = Value("FLOAT")
    val DOUBLE = Value("DOUBLE")
    val INTEGER = Value("INTEGER")
    val LONG = Value("LONG")
    val BOOLEAN = Value("BOOLEAN")
    val STRING = Value("STRING")

    type SettingType = Value
    implicit lazy val SettingTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

