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
 * @param connectionId 
 * @param connectionAccountId 
 * @param connectionPendingId 
 * @param display 
 * @param locationDisplay 
 * @param connectionViewedDate 
 * @param profileImage 
 * @param title 
 * @param connectionAccountType 
 * @param trusted 
 * @param following 
 * @param friendRequested 
 * @param friendRequestPending 
 * @param blocked 
 * @param friend 
 */
data class ConnectionResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionId") val connectionId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionAccountId") val connectionAccountId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionPendingId") val connectionPendingId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDisplay") val locationDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionViewedDate") val connectionViewedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImage") val profileImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionAccountType") val connectionAccountType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("trusted") val trusted: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("following") val following: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequested") val friendRequested: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequestPending") val friendRequestPending: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friend") val friend: kotlin.Boolean? = null
) {

}

