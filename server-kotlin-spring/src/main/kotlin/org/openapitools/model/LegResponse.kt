package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.StepResponse
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
 * @param appKey 
 * @param distance 
 * @param duration 
 * @param startLatitude 
 * @param startLongitude 
 * @param startAltitude 
 * @param startDate 
 * @param endLatitude 
 * @param endLongitude 
 * @param endAltitude 
 * @param endDate 
 * @param created 
 * @param tags 
 * @param deviceId 
 * @param accountId 
 * @param deviceSignature 
 * @param parentAccountId 
 * @param steps 
 * @param type 
 * @param returning 
 */
data class LegResponse(

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
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLatitude") val startLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLongitude") val startLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startAltitude") val startAltitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLatitude") val endLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLongitude") val endLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endAltitude") val endAltitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tags") val tags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceId") val deviceId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceSignature") val deviceSignature: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentAccountId") val parentAccountId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("steps") val steps: kotlin.collections.List<StepResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

