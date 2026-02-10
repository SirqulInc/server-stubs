package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param format 
 * @param suffix 
 * @param taskType 
 */
data class MissionTask(

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
    @get:JsonProperty("format") val format: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suffix") val suffix: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("taskType") val taskType: MissionTask.TaskType? = null
) {

    /**
    * 
    * Values: PHOTO,VOTE,ASK,ANSWER,GROUP,INVITE,OFFER,AD,CUSTOM,GAME
    */
    enum class TaskType(@get:JsonValue val value: kotlin.String) {

        PHOTO("PHOTO"),
        VOTE("VOTE"),
        ASK("ASK"),
        ANSWER("ANSWER"),
        GROUP("GROUP"),
        INVITE("INVITE"),
        OFFER("OFFER"),
        AD("AD"),
        CUSTOM("CUSTOM"),
        GAME("GAME");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TaskType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MissionTask'")
            }
        }
    }

}

