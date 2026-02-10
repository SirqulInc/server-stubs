package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmployeeResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class EmployeeResponse(
  accountId: Option[Long],
  locationDisplay: Option[String],
  display: Option[String],
  username: Option[String],
  accountType: Option[String],
  profileImage: Option[String],
  gender: Option[EmployeeResponse.Gender.Value],
  contactEmail: Option[String],
  contact: Option[ContactResponse],
  manager: Option[AccountMiniResponse],
  active: Option[Boolean],
  locations: Option[List[RetailerLocationShortResponse]],
  hasDelegateAccess: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationLastUpdated: Option[Long],
  locationCount: Option[Int]
)

object EmployeeResponse {
  implicit lazy val employeeResponseJsonFormat: Format[EmployeeResponse] = Json.format[EmployeeResponse]

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

