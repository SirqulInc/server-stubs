package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CategoryResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class CategoryResponse(
  categoryId: Option[Long],
  name: Option[String],
  display: Option[String],
  subCategoryCount: Option[Long],
  parentId: Option[Long],
  parentName: Option[String],
  description: Option[String],
  active: Option[Boolean],
  asset: Option[AssetShortResponse],
  favoriteId: Option[Long],
  favorite: Option[Boolean],
  applicationId: Option[Long],
  `type`: Option[String],
  externalId: Option[String],
  externalType: Option[String]
)

object CategoryResponse {
  implicit lazy val categoryResponseJsonFormat: Format[CategoryResponse] = Json.format[CategoryResponse]
}

