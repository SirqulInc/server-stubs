package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for AccountProfileInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AccountProfileInfo(
  id: Option[Long],
  created: Option[OffsetDateTime],
  updated: Option[OffsetDateTime],
  active: Option[Boolean],
  valid: Option[Boolean],
  account: Option[Account],
  gender: Option[AccountProfileInfo.Gender.Value],
  birthday: Option[OffsetDateTime],
  ageGroup: Option[AccountProfileInfo.AgeGroup.Value],
  preferredMinAge: Option[Int],
  preferredMaxAge: Option[Int],
  preferredMinHeight: Option[Int],
  preferredMaxHeight: Option[Int],
  preferredGender: Option[AccountProfileInfo.PreferredGender.Value],
  preferredEducation: Option[String],
  preferredEducationIndex: Option[Int],
  preferredBodyType: Option[String],
  preferredEthnicity: Option[String],
  preferredLocation: Option[String],
  preferredLocationRange: Option[Double],
  height: Option[String],
  heightIndex: Option[Int],
  ethnicity: Option[String],
  bodyType: Option[String],
  maritalStatus: Option[String],
  children: Option[String],
  religion: Option[String],
  education: Option[String],
  educationIndex: Option[Int],
  smoke: Option[String],
  drink: Option[String],
  companionship: Option[String],
  companionshipIndex: Option[Int],
  developmentPlatforms: Option[AccountProfileInfo.DevelopmentPlatforms.Value],
  matchToken: Option[Long],
  matchString: Option[String],
  noneZeroMatchToken: Option[Long],
  preferredMaxBirthday: Option[OffsetDateTime],
  preferredMinBirthday: Option[OffsetDateTime]
)

object AccountProfileInfo {
  implicit lazy val accountProfileInfoJsonFormat: Format[AccountProfileInfo] = Json.format[AccountProfileInfo]

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object AgeGroup extends Enumeration {
    val AGE013 = Value("AGE_0_13")
    val AGE1417 = Value("AGE_14_17")
    val AGE1822 = Value("AGE_18_22")
    val AGE2330 = Value("AGE_23_30")
    val AGE3154 = Value("AGE_31_54")
    val AGE55PLUS = Value("AGE_55_PLUS")

    type AgeGroup = Value
    implicit lazy val AgeGroupJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object PreferredGender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type PreferredGender = Value
    implicit lazy val PreferredGenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object DevelopmentPlatforms extends Enumeration {
    val MAC = Value("MAC")
    val WINDOWS = Value("WINDOWS")
    val IOS = Value("IOS")
    val ANDROID = Value("ANDROID")
    val WINDOWSPHONE = Value("WINDOWSPHONE")
    val KINDLE = Value("KINDLE")
    val UNITY3D = Value("UNITY3D")
    val COCOS2D = Value("COCOS2D")
    val HTML5 = Value("HTML5")
    val FACEBOOK = Value("FACEBOOK")

    type DevelopmentPlatforms = Value
    implicit lazy val DevelopmentPlatformsJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

