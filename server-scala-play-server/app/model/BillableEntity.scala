package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillableEntity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BillableEntity(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  contactInfo: Option[ContactInfo],
  responsible: Option[Account],
  retailers: Option[List[Retailer]],
  managers: Option[List[Account]],
  categories: Option[List[Category]],
  filters: Option[List[Filter]],
  media: Option[List[Asset]],
  mediaAlbum: Option[Album],
  subscription: Option[Subscription],
  disbursementIntrospect: Option[ThirdPartyNetwork],
  authorizeNetTransactionKey: Option[String],
  authorizeNetApiKey: Option[String]
)

object BillableEntity {
  implicit lazy val billableEntityJsonFormat: Format[BillableEntity] = Json.format[BillableEntity]
}

