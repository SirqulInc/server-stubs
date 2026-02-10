package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Product(
  brand: Option[String],
  productType: Option[Product.ProductType.Value],
  condition: Option[Product.Condition.Value],
  isbn: Option[String],
  asin: Option[String],
  catalogNumbers: Option[List[String]],
  department: Option[String],
  features: Option[List[String]],
  minimumPrice: Option[Double],
  width: Option[Double],
  height: Option[Double],
  depth: Option[Double],
  weight: Option[Double],
  unit: Option[Product.Unit.Value],
  studio: Option[String],
  parentalRating: Option[String],
  publishDate: Option[Long],
  availabilityDate: Option[Long],
  size: Option[SizeGroup]
)

object Product {
  implicit lazy val productJsonFormat: Format[Product] = Json.format[Product]

  // noinspection TypeAnnotation
  object ProductType extends Enumeration {
    val APPAREL = Value("APPAREL")
    val APPLIANCES = Value("APPLIANCES")
    val APPS = Value("APPS")
    val ARTSCRAFTS = Value("ARTS_CRAFTS")
    val AUTOMOTIVE = Value("AUTOMOTIVE")
    val BABY = Value("BABY")
    val BEAUTY = Value("BEAUTY")
    val BOOKS = Value("BOOKS")
    val CLASSICAL = Value("CLASSICAL")
    val COLLECTIBLES = Value("COLLECTIBLES")
    val DVD = Value("DVD")
    val ELECTRONICS = Value("ELECTRONICS")
    val GIFTCARDS = Value("GIFT_CARDS")
    val GOURMETFOOD = Value("GOURMET_FOOD")
    val GROCERY = Value("GROCERY")
    val HEALTHPERSONALCARE = Value("HEALTH_PERSONAL_CARE")
    val HOMEGARDEN = Value("HOME_GARDEN")
    val INDUSTRIAL = Value("INDUSTRIAL")
    val JEWELRY = Value("JEWELRY")
    val KITCHEN = Value("KITCHEN")
    val LAWNGARDEN = Value("LAWN_GARDEN")
    val MAGAZINES = Value("MAGAZINES")
    val MISCELLANEOUS = Value("MISCELLANEOUS")
    val MUSICALINSTRUMENTS = Value("MUSICAL_INSTRUMENTS")
    val OFFICEPRODUCTS = Value("OFFICE_PRODUCTS")
    val OTHER = Value("OTHER")
    val OUTDOORLIVING = Value("OUTDOOR_LIVING")
    val PCHARDWARE = Value("PC_HARDWARE")
    val PETSUPPLIES = Value("PET_SUPPLIES")
    val SHOES = Value("SHOES")
    val SOFTWARE = Value("SOFTWARE")
    val SPORTINGGOODS = Value("SPORTING_GOODS")
    val TOOLS = Value("TOOLS")
    val TOYS = Value("TOYS")
    val VIDEOGAMES = Value("VIDEO_GAMES")
    val WATCHES = Value("WATCHES")
    val WIRELESS = Value("WIRELESS")
    val WIRELESSACCESSORIES = Value("WIRELESS_ACCESSORIES")

    type ProductType = Value
    implicit lazy val ProductTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Condition extends Enumeration {
    val NEW = Value("NEW")
    val USED = Value("USED")
    val REFURBISHED = Value("REFURBISHED")
    val OTHER = Value("OTHER")

    type Condition = Value
    implicit lazy val ConditionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Unit extends Enumeration {
    val MILIMETER = Value("MILIMETER")
    val CENTIMETER = Value("CENTIMETER")
    val METER = Value("METER")
    val INCH = Value("INCH")
    val FOOT = Value("FOOT")
    val YARD = Value("YARD")

    type Unit = Value
    implicit lazy val UnitJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

