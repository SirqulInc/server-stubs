package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.Flag
import org.openapitools.model.FlagThreshold
import org.openapitools.model.YayOrNay
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
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param owner 
 * @param notableType 
 * @param notableId 
 * @param noteTag 
 * @param notes 
 * @param likes 
 * @param assets 
 * @param noteDescription 
 * @param likeCount 
 * @param dislikeCount 
 * @param noteCount 
 * @param flags 
 * @param flagCount 
 * @param flagThreshold 
 * @param contentName 
 * @param defaultThreshold 
 */
data class Note(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notableType") val notableType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notableId") val notableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteTag") val noteTag: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("likes") val likes: kotlin.collections.List<YayOrNay>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assets") val assets: kotlin.collections.List<Asset>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteDescription") val noteDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flags") val flags: kotlin.collections.List<Flag>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold") val flagThreshold: FlagThreshold? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultThreshold") val defaultThreshold: kotlin.Long? = null
) {

}

