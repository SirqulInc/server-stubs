package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserPermissionsListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserPermissionsListResponse(
  action: Option[UserPermissionsListResponse.Action.Value],
  visibility: Option[UserPermissionsListResponse.Visibility.Value],
  publicPermissions: Option[PermissionResponse],
  userPermissions: Option[List[UserPermissionsResponse]]
)

object UserPermissionsListResponse {
  implicit lazy val userPermissionsListResponseJsonFormat: Format[UserPermissionsListResponse] = Json.format[UserPermissionsListResponse]

  // noinspection TypeAnnotation
  object Action extends Enumeration {
    val DATA = Value("DATA")
    val SAVE = Value("SAVE")
    val DELETE = Value("DELETE")
    val GET = Value("GET")

    type Action = Value
    implicit lazy val ActionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

