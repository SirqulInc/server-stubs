package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceTargetType.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AudienceTargetType(
  targetType: Option[AudienceTargetType.TargetType.Value],
  targetDescription: Option[String],
  retailerLocation: Option[RetailerLocation],
  offerLocation: Option[OfferLocation],
  account: Option[Account],
  region: Option[Region]
)

object AudienceTargetType {
  implicit lazy val audienceTargetTypeJsonFormat: Format[AudienceTargetType] = Json.format[AudienceTargetType]

  // noinspection TypeAnnotation
  object TargetType extends Enumeration {
    val RETAILERLOCATION = Value("RETAILER_LOCATION")
    val OFFERLOCATION = Value("OFFER_LOCATION")
    val ACCOUNT = Value("ACCOUNT")
    val REGION = Value("REGION")

    type TargetType = Value
    implicit lazy val TargetTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

