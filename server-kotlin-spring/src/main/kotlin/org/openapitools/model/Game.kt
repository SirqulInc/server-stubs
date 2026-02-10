package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.Asset
import org.openapitools.model.GameLevel
import org.openapitools.model.Pack
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
 * @param application 
 * @param title 
 * @param description 
 * @param startDate 
 * @param endDate 
 * @param packs 
 * @param sequenceType 
 * @param authorOverride 
 * @param icon 
 * @param image 
 * @param points 
 * @param ticketType 
 * @param ticketCount 
 * @param allocateTickets 
 * @param allGameLevels 
 * @param contentName 
 * @param contentType 
 */
data class Game(

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
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("packs") val packs: kotlin.collections.List<Pack>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sequenceType") val sequenceType: Game.SequenceType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("allGameLevels") val allGameLevels: kotlin.collections.List<GameLevel>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null
) {

    /**
    * 
    * Values: FIRST_AVAILABLE,ALL_AVAILABLE
    */
    enum class SequenceType(@get:JsonValue val value: kotlin.String) {

        FIRST_AVAILABLE("FIRST_AVAILABLE"),
        ALL_AVAILABLE("ALL_AVAILABLE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SequenceType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Game'")
            }
        }
    }

}

