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
 * @param accountId 
 * @param locationDisplay 
 * @param display 
 * @param username 
 * @param accountType 
 */
data class AccountMiniResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDisplay") val locationDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountType") val accountType: kotlin.String? = null
) {

}

