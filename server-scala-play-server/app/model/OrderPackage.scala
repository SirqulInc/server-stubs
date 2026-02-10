package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderPackage.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrderPackage(
  valid: Option[Boolean],
  packageTypeName: Option[String],
  packageCount: Option[Int],
  cubicFeet: Option[Double]
)

object OrderPackage {
  implicit lazy val orderPackageJsonFormat: Format[OrderPackage] = Json.format[OrderPackage]
}

