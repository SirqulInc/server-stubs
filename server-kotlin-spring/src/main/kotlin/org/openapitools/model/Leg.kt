package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.Step
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
 * @param parentOwner 
 * @param application 
 * @param deviceId 
 * @param distance 
 * @param duration 
 * @param startLatitude 
 * @param startLongitude 
 * @param startAltitude 
 * @param startDate 
 * @param endLatitude 
 * @param endLongitude 
 * @param endAltitude 
 * @param endDate 
 * @param type 
 * @param retailerLocationId 
 * @param floorId 
 * @param steps 
 */
data class Leg(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parentOwner") val parentOwner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceId") val deviceId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLatitude") val startLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLongitude") val startLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startAltitude") val startAltitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLatitude") val endLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLongitude") val endLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endAltitude") val endAltitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocationId") val retailerLocationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("floorId") val floorId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("steps") val steps: kotlin.collections.List<Step>? = null
) {

}

