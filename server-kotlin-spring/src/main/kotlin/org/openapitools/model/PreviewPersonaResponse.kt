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
 * @param personaId 
 * @param title 
 * @param previewAccounts 
 * @param active 
 * @param date 
 * @param age 
 * @param gender 
 * @param gameExperienceLevel 
 * @param latitude 
 * @param longitude 
 */
data class PreviewPersonaResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("personaId") val personaId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("previewAccounts") val previewAccounts: kotlin.collections.List<AccountMiniResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("date") val date: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("age") val age: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameExperienceLevel") val gameExperienceLevel: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null
) {

}

