package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AgeGroupResponse
import org.openapitools.model.ApplicationShortResponse
import org.openapitools.model.AudienceDeviceResponse
import org.openapitools.model.CategoryResponse
import org.openapitools.model.GeocodeLatLngResponse
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
 * @param name 
 * @param latitude 
 * @param longitude 
 * @param radius 
 * @param sendSuggestion 
 * @param description 
 * @param active 
 * @param searchTags 
 * @param ownerId 
 * @param gender 
 * @param ageGroups 
 * @param categories 
 * @param applications 
 * @param devices 
 * @param gameExperienceLevel 
 * @param locations 
 * @param associateType 
 * @param associateId 
 * @param associateDescription 
 */
data class AudienceResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("radius") val radius: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sendSuggestion") val sendSuggestion: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("searchTags") val searchTags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerId") val ownerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ageGroups") val ageGroups: kotlin.collections.List<AgeGroupResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<CategoryResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("applications") val applications: kotlin.collections.List<ApplicationShortResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("devices") val devices: kotlin.collections.List<AudienceDeviceResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameExperienceLevel") val gameExperienceLevel: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locations") val locations: kotlin.collections.List<GeocodeLatLngResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("associateType") val associateType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("associateId") val associateId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("associateDescription") val associateDescription: kotlin.String? = null
) {

}

