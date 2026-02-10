package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
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
 * @param account 
 * @param availableStart 
 * @param availableEnd 
 * @param color1 
 * @param color2 
 * @param type 
 */
data class Participant(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableStart") val availableStart: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableEnd") val availableEnd: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("color1") val color1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("color2") val color2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: Participant.Type? = null
) {

    /**
    * 
    * Values: TEAM,LEAGUE,SPORT
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        TEAM("TEAM"),
        LEAGUE("LEAGUE"),
        SPORT("SPORT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Participant'")
            }
        }
    }

}

