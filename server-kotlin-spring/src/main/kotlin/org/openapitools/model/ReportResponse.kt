package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.ReportTypeResponse
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
 * @param columns 
 * @param rows 
 * @param summations 
 * @param count 
 * @param queryName 
 * @param hasMore 
 * @param returning 
 */
data class ReportResponse(

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("columns") val columns: kotlin.collections.List<ReportTypeResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rows") val rows: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("summations") val summations: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("queryName") val queryName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasMore") val hasMore: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

