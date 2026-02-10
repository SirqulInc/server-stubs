package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonArray.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class JsonArray(
  asInt: Option[Int],
  asString: Option[String],
  asBoolean: Option[Boolean],
  asNumber: Option[JsObject],
  asDouble: Option[Double],
  asFloat: Option[Float],
  asLong: Option[Long],
  asByte: Option[ArrayByte],
  asCharacter: Option[String],
  asBigDecimal: Option[BigDecimal],
  asBigInteger: Option[Int],
  asShort: Option[Int],
  asJsonObject: Option[JsonObject],
  jsonNull: Option[Boolean],
  jsonArray: Option[Boolean],
  jsonObject: Option[Boolean],
  jsonPrimitive: Option[Boolean],
  asJsonArray: Option[JsonArray],
  asJsonPrimitive: Option[JsonPrimitive],
  asJsonNull: Option[JsonNull]
)

object JsonArray {
  implicit lazy val jsonArrayJsonFormat: Format[JsonArray] = Json.format[JsonArray]
}

