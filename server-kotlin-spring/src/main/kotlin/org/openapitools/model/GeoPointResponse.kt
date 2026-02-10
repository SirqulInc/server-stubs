package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetShortResponse
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
 * @param objectId 
 * @param latitude 
 * @param longitude 
 * @param altitude 
 * @param locationDescription 
 * @param locatableId 
 * @param locatableObjectId 
 * @param locatableObjectName 
 * @param locatableDisplay 
 * @param asset 
 * @param distance 
 */
data class GeoPointResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("objectId") val objectId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("altitude") val altitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locatableId") val locatableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locatableObjectId") val locatableObjectId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locatableObjectName") val locatableObjectName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locatableDisplay") val locatableDisplay: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asset") val asset: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null
) {

}

