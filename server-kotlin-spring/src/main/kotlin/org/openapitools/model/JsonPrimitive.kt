package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.JsonArray
import org.openapitools.model.JsonNull
import org.openapitools.model.JsonObject
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param asInt 
 * @param number 
 * @param boolean 
 * @param asString 
 * @param asBoolean 
 * @param asNumber 
 * @param asDouble 
 * @param asFloat 
 * @param asLong 
 * @param asByte 
 * @param asCharacter 
 * @param asBigDecimal 
 * @param asBigInteger 
 * @param asShort 
 * @param string 
 * @param asJsonObject 
 * @param jsonNull 
 * @param jsonArray 
 * @param jsonObject 
 * @param jsonPrimitive 
 * @param asJsonArray 
 * @param asJsonPrimitive 
 * @param asJsonNull 
 */
data class JsonPrimitive(

    @Schema(example = "null", description = "")
    @get:JsonProperty("asInt") val asInt: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("number") val number: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("boolean") val boolean: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asString") val asString: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asBoolean") val asBoolean: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asNumber") val asNumber: kotlin.Any? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asDouble") val asDouble: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asFloat") val asFloat: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asLong") val asLong: kotlin.Long? = null,

    @get:Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    @Schema(example = "null", description = "")
    @get:JsonProperty("asByte") val asByte: kotlin.ByteArray? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asCharacter") val asCharacter: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asBigDecimal") val asBigDecimal: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asBigInteger") val asBigInteger: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asShort") val asShort: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("string") val string: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asJsonObject") val asJsonObject: JsonObject? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("jsonNull") val jsonNull: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("jsonArray") val jsonArray: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("jsonObject") val jsonObject: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("jsonPrimitive") val jsonPrimitive: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asJsonArray") val asJsonArray: JsonArray? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asJsonPrimitive") val asJsonPrimitive: JsonPrimitive? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asJsonNull") val asJsonNull: JsonNull? = null
) {

}

