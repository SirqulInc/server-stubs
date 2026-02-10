package model

import play.api.libs.json._
import java.time.OffsetDateTime
import scala.collection.immutable.Set

/**
  * Represents the Swagger definition for PostalCode.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PostalCode(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  code: Option[String],
  plus4: Option[String],
  stateCode: Option[String],
  city: Option[String],
  timeZone: Option[String],
  utcOffset: Option[Int],
  regions: Option[Set[Region]],
  eliminated: Option[Boolean],
  searchPoint: Option[Boolean],
  lastOfferImport: Option[OffsetDateTime],
  truncatedLatitude: Option[Double],
  truncatedLongitude: Option[Double]
)

object PostalCode {
  implicit lazy val postalCodeJsonFormat: Format[PostalCode] = Json.format[PostalCode]
}

