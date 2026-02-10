package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
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
 * @param sender 
 * @param event 
 * @param notificationMessage 
 * @param created 
 * @param hasRead 
 * @param contentId 
 * @param contentType 
 * @param contentName 
 * @param parentId 
 * @param parentType 
 * @param actionCategory 
 * @param thumbnailURL 
 * @param coverURL 
 */
data class NotificationMessageResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("sender") val sender: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("event") val event: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notificationMessage") val notificationMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasRead") val hasRead: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentId") val contentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentType") val parentType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("actionCategory") val actionCategory: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thumbnailURL") val thumbnailURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("coverURL") val coverURL: kotlin.String? = null
) {

}

