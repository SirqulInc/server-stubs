package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EntityReference.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class EntityReference(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  entityType: Option[String],
  masterEntityId: Option[Long],
  slaveUID: Option[String],
  slaveEntityId: Option[Long]
)

object EntityReference {
  implicit lazy val entityReferenceJsonFormat: Format[EntityReference] = Json.format[EntityReference]
}

