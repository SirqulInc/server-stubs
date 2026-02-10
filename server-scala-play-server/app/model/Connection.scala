package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Connection.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Connection(
  id: Option[Long],
  created: Option[OffsetDateTime],
  updated: Option[OffsetDateTime],
  deleted: Option[OffsetDateTime],
  objectType: Option[String],
  legacyId: Option[String],
  searchTags: Option[String],
  active: Option[Boolean],
  valid: Option[Boolean],
  account: Option[Account],
  connection: Option[Account],
  pendingConnection: Option[ConnectedFriend],
  friend: Option[Boolean],
  friendRequested: Option[Boolean],
  friendRequestPending: Option[Boolean],
  following: Option[Boolean],
  follower: Option[Boolean],
  trusted: Option[Boolean],
  blocked: Option[Boolean],
  friendRequestDate: Option[OffsetDateTime],
  friendResponseDate: Option[OffsetDateTime],
  display: Option[String],
  connectionViewedDate: Option[OffsetDateTime],
  connectionType: Option[Connection.ConnectionType.Value],
  title: Option[String],
  pendingConnectionId: Option[Long],
  latitude: Option[Double],
  longitude: Option[Double]
)

object Connection {
  implicit lazy val connectionJsonFormat: Format[Connection] = Json.format[Connection]

  // noinspection TypeAnnotation
  object ConnectionType extends Enumeration {
    val PRIMARY = Value("PRIMARY")
    val SECONDARY = Value("SECONDARY")
    val DEPENDENT = Value("DEPENDENT")
    val ACQUAINTANCE = Value("ACQUAINTANCE")

    type ConnectionType = Value
    implicit lazy val ConnectionTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

