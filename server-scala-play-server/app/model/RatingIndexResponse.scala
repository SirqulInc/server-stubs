package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RatingIndexResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RatingIndexResponse(
  ratingIndexId: Option[Long],
  ratingCount: Option[Long],
  ratingAverage: Option[Float],
  value: Option[Float],
  display: Option[String],
  ratableType: Option[RatingIndexResponse.RatableType.Value],
  ratableId: Option[Long],
  category: Option[CategoryResponse],
  ratable: Option[JsObject],
  secondaryType: Option[String]
)

object RatingIndexResponse {
  implicit lazy val ratingIndexResponseJsonFormat: Format[RatingIndexResponse] = Json.format[RatingIndexResponse]

  // noinspection TypeAnnotation
  object RatableType extends Enumeration {
    val LOCATABLE = Value("LOCATABLE")
    val RESERVABLE = Value("RESERVABLE")
    val PERMISSIONABLE = Value("PERMISSIONABLE")
    val NOTABLE = Value("NOTABLE")
    val ASSETABLE = Value("ASSETABLE")
    val LIKABLE = Value("LIKABLE")
    val FLAGABLE = Value("FLAGABLE")
    val FAVORITABLE = Value("FAVORITABLE")
    val RATABLE = Value("RATABLE")
    val ALBUM = Value("ALBUM")
    val COLLECTION = Value("COLLECTION")
    val APPLICATION = Value("APPLICATION")
    val APPLICATIONSETTING = Value("APPLICATION_SETTING")
    val APPLICATIONCERT = Value("APPLICATION_CERT")
    val APPLICATIONPLACEMENT = Value("APPLICATION_PLACEMENT")
    val ACCOUNT = Value("ACCOUNT")
    val ACCOUNTSETTING = Value("ACCOUNT_SETTING")
    val GAMELEVEL = Value("GAME_LEVEL")
    val PACK = Value("PACK")
    val MISSION = Value("MISSION")
    val TOURNAMENT = Value("TOURNAMENT")
    val ASSET = Value("ASSET")
    val ALBUMCONTEST = Value("ALBUM_CONTEST")
    val THEMEDESCRIPTOR = Value("THEME_DESCRIPTOR")
    val OFFER = Value("OFFER")
    val OFFERLOCATION = Value("OFFER_LOCATION")
    val EVENT = Value("EVENT")
    val RETAILER = Value("RETAILER")
    val RETAILERLOCATION = Value("RETAILER_LOCATION")
    val NOTE = Value("NOTE")
    val CREATIVE = Value("CREATIVE")
    val FAVORITE = Value("FAVORITE")
    val LIKE = Value("LIKE")
    val RATING = Value("RATING")
    val ANALYTIC = Value("ANALYTIC")
    val THIRDPARTYCREDENTIAL = Value("THIRD_PARTY_CREDENTIAL")
    val THIRDPARTYNETWORK = Value("THIRD_PARTY_NETWORK")
    val REGION = Value("REGION")

    type RatableType = Value
    implicit lazy val RatableTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

