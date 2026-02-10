package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserPermissionsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserPermissionsResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  permissions: Option[PermissionResponse],
  connection: Option[ConnectionResponse],
  connectionGroup: Option[ConnectionGroupResponse],
  exclude: Option[Boolean],
  blocked: Option[Boolean],
  friendGroup: Option[Boolean],
  permissionableId: Option[Long],
  permissionableType: Option[String],
  returning: Option[String]
)

object UserPermissionsResponse {
  implicit lazy val userPermissionsResponseJsonFormat: Format[UserPermissionsResponse] = Json.format[UserPermissionsResponse]
}

