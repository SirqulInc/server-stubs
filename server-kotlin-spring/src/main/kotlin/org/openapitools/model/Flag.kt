package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
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
 * @param owner 
 * @param flagableObjectType 
 * @param flagableObjectId 
 * @param flagDescription 
 * @param app 
 */
data class Flag(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagableObjectType") val flagableObjectType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagableObjectId") val flagableObjectId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagDescription") val flagDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("app") val app: kotlin.String? = null
) {

}

