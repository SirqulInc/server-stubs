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
 * @param reportBatchStatus 
 * @param errorMessage 
 * @param endpoint 
 * @param pageUrl 
 * @param name 
 * @param description 
 * @param created 
 * @param updated 
 * @param returning 
 */
data class ReportBatchResponse(

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
    @get:JsonProperty("reportBatchStatus") val reportBatchStatus: ReportBatchResponse.ReportBatchStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorMessage") val errorMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endpoint") val endpoint: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pageUrl") val pageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: NEW,ERROR,COMPLETE,PARSE_ERROR,PROCESSING,DUPLICATE,SAVEONLY
    */
    enum class ReportBatchStatus(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        ERROR("ERROR"),
        COMPLETE("COMPLETE"),
        PARSE_ERROR("PARSE_ERROR"),
        PROCESSING("PROCESSING"),
        DUPLICATE("DUPLICATE"),
        SAVEONLY("SAVEONLY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReportBatchStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ReportBatchResponse'")
            }
        }
    }

}

