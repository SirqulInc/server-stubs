package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RuleResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RuleResponse(
  ruleId: Option[Long],
  title: Option[String],
  description: Option[String],
  ruleTypeId: Option[Long],
  ruleTypeTitle: Option[String],
  ruleTypeDescription: Option[String],
  ruleValueType: Option[String],
  ruleValue: Option[String]
)

object RuleResponse {
  implicit lazy val ruleResponseJsonFormat: Format[RuleResponse] = Json.format[RuleResponse]
}

