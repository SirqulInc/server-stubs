package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param activityId 
 * @param created 
 * @param appKey 
 * @param targetId 
 * @param targetType 
 * @param targetLegacyId 
 * @param targetDescription 
 * @param targetActive 
 * @param action 
 * @param slaveEntityId 
 */
data class ActivityResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("activityId") val activityId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetId") val targetId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetType") val targetType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetLegacyId") val targetLegacyId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetDescription") val targetDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetActive") val targetActive: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("slaveEntityId") val slaveEntityId: kotlin.Long? = null
) {

}

