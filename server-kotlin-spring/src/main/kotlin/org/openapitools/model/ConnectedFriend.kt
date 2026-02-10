package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Asset
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
 * @param id 
 * @param active 
 * @param valid 
 * @param display 
 * @param avatar 
 * @param avatarURL 
 * @param platform 
 * @param platformId 
 * @param invited 
 * @param locationDescription 
 */
data class ConnectedFriend(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("avatar") val avatar: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("avatarURL") val avatarURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("platform") val platform: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("platformId") val platformId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("invited") val invited: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null
) {

}

