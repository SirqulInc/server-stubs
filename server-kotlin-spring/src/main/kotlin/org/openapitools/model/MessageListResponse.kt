package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MessageResponse
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
 * @param start 
 * @param limit 
 * @param countTotal 
 * @param items 
 * @param count 
 * @param hasMoreResults 
 */
data class MessageListResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("limit") val limit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("countTotal") val countTotal: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<MessageResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasMoreResults") val hasMoreResults: kotlin.Boolean? = null
) {

}

