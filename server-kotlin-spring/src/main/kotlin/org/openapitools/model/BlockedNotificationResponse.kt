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
 * @param blockedNotificationId 
 * @param created 
 * @param event 
 * @param conduit 
 * @param customType 
 * @param contentType 
 * @param contentId 
 * @param searchTags 
 * @param blocked 
 * @param deleted 
 */
data class BlockedNotificationResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("blockedNotificationId") val blockedNotificationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("event") val event: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conduit") val conduit: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customType") val customType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentId") val contentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("searchTags") val searchTags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deleted") val deleted: kotlin.Boolean? = null
) {

}

