package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Asset
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
 * @param name 
 * @param description 
 * @param alignment 
 * @param image 
 * @param orderIndex 
 * @param tutorialObjectType 
 */
data class Tutorial(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("alignment") val alignment: Tutorial.Alignment? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderIndex") val orderIndex: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorialObjectType") val tutorialObjectType: Tutorial.TutorialObjectType? = null
) {

    /**
    * 
    * Values: NONE,IMAGE_ABOVE,IMAGE_BELOW,IMAGE_LEFT,IMAGE_RIGHT,IMAGE_ONLY,TEXT_ONLY
    */
    enum class Alignment(@get:JsonValue val value: kotlin.String) {

        NONE("NONE"),
        IMAGE_ABOVE("IMAGE_ABOVE"),
        IMAGE_BELOW("IMAGE_BELOW"),
        IMAGE_LEFT("IMAGE_LEFT"),
        IMAGE_RIGHT("IMAGE_RIGHT"),
        IMAGE_ONLY("IMAGE_ONLY"),
        TEXT_ONLY("TEXT_ONLY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Alignment {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Tutorial'")
            }
        }
    }

    /**
    * 
    * Values: GAME_OBJECT,GAME_LEVEL,PACK,GAME,MISSION,PROFILE,APPLICATION,TICKETS,ASSET,CUSTOM
    */
    enum class TutorialObjectType(@get:JsonValue val value: kotlin.String) {

        GAME_OBJECT("GAME_OBJECT"),
        GAME_LEVEL("GAME_LEVEL"),
        PACK("PACK"),
        GAME("GAME"),
        MISSION("MISSION"),
        PROFILE("PROFILE"),
        APPLICATION("APPLICATION"),
        TICKETS("TICKETS"),
        ASSET("ASSET"),
        CUSTOM("CUSTOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TutorialObjectType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Tutorial'")
            }
        }
    }

}

