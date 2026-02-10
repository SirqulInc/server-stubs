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
 * @param items 
 * @param count 
 * @param startIndexAudiences 
 * @param startIndexGroups 
 * @param total 
 * @param countAudiences 
 * @param countGroups 
 * @param hasMoreResults 
 */
data class NotificationRecipientResponseListResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<kotlin.Any>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startIndexAudiences") val startIndexAudiences: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startIndexGroups") val startIndexGroups: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("total") val total: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("countAudiences") val countAudiences: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("countGroups") val countGroups: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasMoreResults") val hasMoreResults: kotlin.Boolean? = null
) {

}

