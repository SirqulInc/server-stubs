package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.Asset
import org.openapitools.model.GameLevel
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
 * @param newOwnerId 
 * @param owner 
 * @param application 
 * @param sequenceType 
 * @param title 
 * @param description 
 * @param startDate 
 * @param endDate 
 * @param packType 
 * @param image 
 * @param background 
 * @param imageURL 
 * @param gameLevels 
 * @param hasMoreItems 
 * @param totalCount 
 * @param downloaded 
 * @param authorOverride 
 * @param packOrder 
 * @param inGame 
 * @param highest 
 * @param notificationCount 
 * @param points 
 * @param ticketType 
 * @param ticketCount 
 * @param priceType 
 * @param price 
 * @param allocateTickets 
 * @param applicationTitle 
 * @param levelNumberMap 
 */
data class Pack(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("newOwnerId") val newOwnerId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sequenceType") val sequenceType: Pack.SequenceType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("packType") val packType: Pack.PackType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("background") val background: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("imageURL") val imageURL: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("gameLevels") val gameLevels: kotlin.collections.List<GameLevel>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasMoreItems") val hasMoreItems: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalCount") val totalCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloaded") val downloaded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("packOrder") val packOrder: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inGame") val inGame: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("highest") val highest: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notificationCount") val notificationCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("priceType") val priceType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationTitle") val applicationTitle: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("levelNumberMap") val levelNumberMap: kotlin.collections.Map<kotlin.String, GameLevel>? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Pack'")
            }
        }
    }

    /**
    * 
    * Values: TUTORIAL,BUILTIN,DOWNLOAD,THRESHOLD,THEME,TOURNAMENT
    */
    enum class PackType(@get:JsonValue val value: kotlin.String) {

        TUTORIAL("TUTORIAL"),
        BUILTIN("BUILTIN"),
        DOWNLOAD("DOWNLOAD"),
        THRESHOLD("THRESHOLD"),
        THEME("THEME"),
        TOURNAMENT("TOURNAMENT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PackType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Pack'")
            }
        }
    }

}

