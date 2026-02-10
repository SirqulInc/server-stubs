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
 * @param id 
 * @param active 
 * @param valid 
 * @param entityType 
 * @param masterEntityId 
 * @param slaveUID 
 * @param slaveEntityId 
 */
data class EntityReference(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("entityType") val entityType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("masterEntityId") val masterEntityId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("slaveUID") val slaveUID: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("slaveEntityId") val slaveEntityId: kotlin.Long? = null
) {

}

