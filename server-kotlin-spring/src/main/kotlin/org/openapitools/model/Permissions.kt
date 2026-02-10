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
 * @param read 
 * @param write 
 * @param delete 
 * @param add 
 */
data class Permissions(

    @Schema(example = "null", description = "")
    @get:JsonProperty("read") val read: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("write") val write: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("delete") val delete: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("add") val add: kotlin.Boolean? = null
) {

}

