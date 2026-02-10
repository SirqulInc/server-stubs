package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PostalCodeResponse
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
 * @param shortName 
 * @param fullName 
 * @param parent 
 * @param children 
 * @param postalCodes 
 * @param latitude 
 * @param longitude 
 * @param active 
 * @param root 
 * @param regionClass 
 * @param start 
 * @param end 
 * @param polygon 
 * @param metaData 
 * @param distance 
 * @param versionCode 
 */
data class RegionResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("shortName") val shortName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullName") val fullName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parent") val parent: RegionResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.collections.List<RegionResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("postalCodes") val postalCodes: kotlin.collections.List<PostalCodeResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("root") val root: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("regionClass") val regionClass: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("end") val end: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polygon") val polygon: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaData") val metaData: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("versionCode") val versionCode: kotlin.Int? = null
) {

}

