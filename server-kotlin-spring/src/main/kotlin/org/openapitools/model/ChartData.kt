package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.NameStringValueResponse
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
 * @param valid 
 * @param message 
 * @param version 
 * @param serializeNulls 
 * @param startTimeLog 
 * @param errorCode 
 * @param request 
 * @param identifier 
 * @param idAttribute 
 * @param label 
 * @param maxValue 
 * @param totalCount 
 * @param items 
 * @param aggregatedItems 
 * @param caption 
 * @param showAnchor 
 * @param anchorAlpha 
 * @param getxAxisName 
 * @param getyAxisMinValue 
 * @param getyAxisName 
 * @param decimalPrecision 
 * @param formatNumberScale 
 * @param numberPrefix 
 * @param showNames 
 * @param showValues 
 * @param showAlternateHGridColor 
 * @param alternateHGridColor 
 * @param divLineColor 
 * @param divLineAlpha 
 * @param alternateHGridAlpha 
 * @param rotateNames 
 * @param returning 
 */
data class ChartData(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serializeNulls") val serializeNulls: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTimeLog") val startTimeLog: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request") val request: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("identifier") val identifier: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("idAttribute") val idAttribute: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("label") val label: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxValue") val maxValue: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalCount") val totalCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<kotlin.Any>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("aggregatedItems") val aggregatedItems: kotlin.collections.List<kotlin.Any>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("caption") val caption: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showAnchor") val showAnchor: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("anchorAlpha") val anchorAlpha: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("getxAxisName") val getxAxisName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("getyAxisMinValue") val getyAxisMinValue: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("getyAxisName") val getyAxisName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("decimalPrecision") val decimalPrecision: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("formatNumberScale") val formatNumberScale: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("numberPrefix") val numberPrefix: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showNames") val showNames: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showValues") val showValues: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showAlternateHGridColor") val showAlternateHGridColor: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("alternateHGridColor") val alternateHGridColor: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("divLineColor") val divLineColor: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("divLineAlpha") val divLineAlpha: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("alternateHGridAlpha") val alternateHGridAlpha: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rotateNames") val rotateNames: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

