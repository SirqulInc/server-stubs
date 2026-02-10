package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param id 
 * @param active 
 * @param valid 
 * @param query 
 * @param queryName 
 * @param displayName 
 * @param columnNames 
 * @param nativeSql 
 * @param display 
 * @param dataSource 
 * @param maxLimit 
 * @param maxDateRange 
 * @param displayParams 
 * @param metaData 
 * @param columnNamesRaw 
 */
data class ReportDefinition(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("query") val query: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("queryName") val queryName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("displayName") val displayName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("columnNames") val columnNames: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("nativeSql") val nativeSql: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dataSource") val dataSource: ReportDefinition.DataSource? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxLimit") val maxLimit: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxDateRange") val maxDateRange: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("displayParams") val displayParams: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaData") val metaData: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("columnNamesRaw") val columnNamesRaw: kotlin.String? = null
) {

    /**
    * 
    * Values: WRITE,ANALYTIC,READ1
    */
    enum class DataSource(@get:JsonValue val value: kotlin.String) {

        WRITE("WRITE"),
        ANALYTIC("ANALYTIC"),
        READ1("READ1");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): DataSource {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ReportDefinition'")
            }
        }
    }

}

