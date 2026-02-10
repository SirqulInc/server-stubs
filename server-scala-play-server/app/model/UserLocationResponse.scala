package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserLocationResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserLocationResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  accountId: Option[Long],
  locationDisplay: Option[String],
  display: Option[String],
  username: Option[String],
  profileImage: Option[String],
  profileAvatar: Option[AssetShortResponse],
  aboutUs: Option[String],
  locale: Option[String],
  summaryTitle: Option[String],
  gender: Option[UserLocationResponse.Gender.Value],
  age: Option[String],
  gameExperience: Option[UserLocationResponse.GameExperience.Value],
  contact: Option[ContactResponse],
  categories: Option[List[CategoryResponse]],
  personalProfile: Option[PersonalProfileResponse],
  userSettings: Option[UserSettingsResponse],
  latitude: Option[Double],
  longitude: Option[Double],
  currentPostalCode: Option[PostalCodeResponse],
  accountType: Option[String],
  premiumExpiration: Option[Long],
  matchIndex: Option[Int],
  tags: Option[String],
  locationLastUpdated: Option[Long],
  distanceFromMe: Option[String],
  returning: Option[String]
)

object UserLocationResponse {
  implicit lazy val userLocationResponseJsonFormat: Format[UserLocationResponse] = Json.format[UserLocationResponse]

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object GameExperience extends Enumeration {
    val ANY = Value("ANY")
    val NEW = Value("NEW")
    val BEGINNER = Value("BEGINNER")
    val INTERMEDIATE = Value("INTERMEDIATE")
    val EXPERT = Value("EXPERT")

    type GameExperience = Value
    implicit lazy val GameExperienceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

