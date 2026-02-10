package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Media.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Media(
  mediaType: Option[Media.MediaType.Value],
  condition: Option[Media.Condition.Value],
  isbn: Option[String],
  asin: Option[String],
  catalogNumbers: Option[List[String]],
  duration: Option[Int],
  author: Option[String],
  releaseDate: Option[Long],
  availabilityDate: Option[Long],
  parentalRating: Option[String],
  collections: Option[List[Album]],
  collectionCount: Option[Int]
)

object Media {
  implicit lazy val mediaJsonFormat: Format[Media] = Json.format[Media]

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val APK = Value("APK")
    val APPLICATION = Value("APPLICATION")
    val IMAGE = Value("IMAGE")
    val AUDIO = Value("AUDIO")
    val VIDEO = Value("VIDEO")
    val MULTIPART = Value("MULTIPART")
    val BARCODE = Value("BAR_CODE")
    val TEXT = Value("TEXT")
    val OTHER = Value("OTHER")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
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
}

