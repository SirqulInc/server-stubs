package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GameResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GameResponse(
  action: Option[GameResponse.Action.Value],
  highestAppVersion: Option[String],
  gameId: Option[Long],
  gameType: Option[String],
  packs: Option[PackListResponse],
  scores: Option[ScoreListResponse],
  owner: Option[AccountShortResponse],
  userPermissionsList: Option[UserPermissionsListResponse],
  rules: Option[RuleListResponse],
  results: Option[List[NameStringValueResponse]],
  ticketsEarned: Option[Long],
  title: Option[String],
  description: Option[String],
  authorOverride: Option[String],
  icon: Option[AssetShortResponse],
  image: Option[AssetShortResponse],
  sequenceType: Option[String],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  appKey: Option[String]
)

object GameResponse {
  implicit lazy val gameResponseJsonFormat: Format[GameResponse] = Json.format[GameResponse]

  // noinspection TypeAnnotation
  object Action extends Enumeration {
    val DATA = Value("DATA")
    val SAVE = Value("SAVE")
    val DELETE = Value("DELETE")
    val GET = Value("GET")

    type Action = Value
    implicit lazy val ActionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

