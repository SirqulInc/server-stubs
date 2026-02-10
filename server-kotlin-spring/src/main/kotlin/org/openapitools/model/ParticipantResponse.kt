package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountMiniResponse
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
 * @param account 
 * @param availableStart 
 * @param availableEnd 
 * @param color1 
 * @param color2 
 * @param type 
 */
data class ParticipantResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: AccountMiniResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableStart") val availableStart: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableEnd") val availableEnd: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("color1") val color1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("color2") val color2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

