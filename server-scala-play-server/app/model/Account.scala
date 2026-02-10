package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Account.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Account(
  id: Option[Long],
  created: Option[OffsetDateTime],
  updated: Option[OffsetDateTime],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  currentRegion: Option[Region],
  locationLastUpdated: Option[OffsetDateTime],
  currentPostalCode: Option[String],
  currentPostalCodeLatitude: Option[Double],
  currentPostalCodeLongitude: Option[Double],
  locationUpdated: Option[Boolean],
  premigrationId: Option[Long],
  username: Option[String],
  locale: Option[String],
  inviteCode: Option[String],
  retailerInviteCode: Option[String],
  aboutUs: Option[String],
  businessName: Option[String],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  thirdPartyCredentials: Option[List[ThirdPartyCredentials]],
  partnerActive: Option[Boolean],
  resetToken: Option[String],
  profileImage: Option[String],
  accountType: Option[String],
  media: Option[List[Asset]],
  picture: Option[Asset],
  firstName: Option[String],
  middleName: Option[String],
  lastName: Option[String],
  prefix: Option[String],
  suffix: Option[String],
  title: Option[String],
  homePhone: Option[String],
  cellPhone: Option[String],
  cellCarrier: Option[CellCarrier],
  businessPhone: Option[String],
  businessPhoneExt: Option[String],
  faxNumber: Option[String],
  timeZone: Option[String],
  utcOffset: Option[String],
  code501c3: Option[String],
  emailAddress: Option[String],
  address: Option[Address],
  web: Option[String],
  display: Option[String],
  website: Option[String],
  consumersNotes: Option[String],
  consumersAboutUs: Option[String],
  accountProfile: Option[AccountProfileInfo],
  retailerLocations: Option[List[RetailerLocation]],
  executive: Option[Boolean],
  contentName: Option[String],
  defaultThreshold: Option[Long],
  audienceInfoGender: Option[Account.AudienceInfoGender.Value],
  flagThresholdId: Option[Long],
  contentType: Option[String]
)

object Account {
  implicit lazy val accountJsonFormat: Format[Account] = Json.format[Account]

  // noinspection TypeAnnotation
  object AudienceInfoGender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type AudienceInfoGender = Value
    implicit lazy val AudienceInfoGenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

