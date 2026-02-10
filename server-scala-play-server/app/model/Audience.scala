package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Audience.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Audience(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  name: Option[String],
  display: Option[Boolean],
  description: Option[String],
  owner: Option[Account],
  gender: Option[Audience.Gender.Value],
  ageGroups: Option[Audience.AgeGroups.Value],
  gameExperienceLevel: Option[Audience.GameExperienceLevel.Value],
  deviceVersionRanges: Option[List[AudienceDeviceVersionRange]],
  categories: Option[List[Category]],
  applications: Option[List[Application]],
  radius: Option[Double],
  locations: Option[List[AudienceLocation]],
  sendSuggestion: Option[Boolean],
  startTimeOffset: Option[Int],
  endTimeOffset: Option[Int],
  target: Option[AudienceTargetType],
  associateContentName: Option[String],
  polygon: Option[String],
  associateType: Option[String],
  associateId: Option[Long]
)

object Audience {
  implicit lazy val audienceJsonFormat: Format[Audience] = Json.format[Audience]

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object AgeGroups extends Enumeration {
    val AGE013 = Value("AGE_0_13")
    val AGE1417 = Value("AGE_14_17")
    val AGE1822 = Value("AGE_18_22")
    val AGE2330 = Value("AGE_23_30")
    val AGE3154 = Value("AGE_31_54")
    val AGE55PLUS = Value("AGE_55_PLUS")

    type AgeGroups = Value
    implicit lazy val AgeGroupsJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object GameExperienceLevel extends Enumeration {
    val ANY = Value("ANY")
    val NEW = Value("NEW")
    val BEGINNER = Value("BEGINNER")
    val INTERMEDIATE = Value("INTERMEDIATE")
    val EXPERT = Value("EXPERT")

    type GameExperienceLevel = Value
    implicit lazy val GameExperienceLevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

