package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PersonalProfileResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PersonalProfileResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  preferredGender: Option[PersonalProfileResponse.PreferredGender.Value],
  preferredEthnicity: Option[String],
  preferredEducation: Option[String],
  preferredEducationIndex: Option[Int],
  preferredBodyType: Option[String],
  preferredMinAge: Option[Int],
  preferredMaxAge: Option[Int],
  preferredMinHeight: Option[Int],
  preferredMaxHeight: Option[Int],
  preferredLocationRange: Option[Double],
  gender: Option[PersonalProfileResponse.Gender.Value],
  hometown: Option[String],
  height: Option[String],
  heightIndex: Option[Int],
  ethnicity: Option[String],
  bodyType: Option[String],
  children: Option[String],
  companionship: Option[String],
  companionshipIndex: Option[Int],
  drink: Option[String],
  education: Option[String],
  educationIndex: Option[Int],
  maritalStatus: Option[String],
  smoke: Option[String],
  religion: Option[String],
  birthday: Option[Long],
  returning: Option[String]
)

object PersonalProfileResponse {
  implicit lazy val personalProfileResponseJsonFormat: Format[PersonalProfileResponse] = Json.format[PersonalProfileResponse]

  // noinspection TypeAnnotation
  object PreferredGender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type PreferredGender = Value
    implicit lazy val PreferredGenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

