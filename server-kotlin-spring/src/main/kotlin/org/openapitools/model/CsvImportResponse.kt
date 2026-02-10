package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param batchId 
 * @param csvImportBatchStatus 
 * @param errorMessage 
 * @param objectType 
 * @param returning 
 */
data class CsvImportResponse(

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
    @get:JsonProperty("batchId") val batchId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("csvImportBatchStatus") val csvImportBatchStatus: CsvImportResponse.CsvImportBatchStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorMessage") val errorMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("objectType") val objectType: CsvImportResponse.ObjectType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: NEW,ERROR,COMPLETE,PARSE_ERROR,PROCESSING,DUPLICATE
    */
    enum class CsvImportBatchStatus(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        ERROR("ERROR"),
        COMPLETE("COMPLETE"),
        PARSE_ERROR("PARSE_ERROR"),
        PROCESSING("PROCESSING"),
        DUPLICATE("DUPLICATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CsvImportBatchStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CsvImportResponse'")
            }
        }
    }

    /**
    * 
    * Values: OFFERS,RETAILERS,RETAILERLOCATIONS,CATEGORIES,FILTERS
    */
    enum class ObjectType(@get:JsonValue val value: kotlin.String) {

        OFFERS("OFFERS"),
        RETAILERS("RETAILERS"),
        RETAILERLOCATIONS("RETAILERLOCATIONS"),
        CATEGORIES("CATEGORIES"),
        FILTERS("FILTERS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ObjectType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CsvImportResponse'")
            }
        }
    }

}

