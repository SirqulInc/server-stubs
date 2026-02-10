package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Category.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Category(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  shortName: Option[String],
  description: Option[String],
  `type`: Option[String],
  application: Option[Application],
  parent: Option[Category],
  children: Option[List[Category]],
  childrenCount: Option[Long],
  display: Option[String],
  sqootSlug: Option[String],
  asset: Option[Asset],
  externalId: Option[String],
  externalType: Option[String],
  favoriteCount: Option[Long],
  root: Option[Category],
  tree: Option[String],
  parentName: Option[String],
  parentId: Option[Long],
  applicationId: Option[Long],
  secondaryType: Option[String]
)

object Category {
  implicit lazy val categoryJsonFormat: Format[Category] = Json.format[Category]
}

