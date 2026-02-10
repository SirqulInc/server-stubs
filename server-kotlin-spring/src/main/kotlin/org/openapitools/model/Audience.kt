package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.AudienceDeviceVersionRange
import org.openapitools.model.AudienceLocation
import org.openapitools.model.AudienceTargetType
import org.openapitools.model.Category
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
 * @param name 
 * @param display 
 * @param description 
 * @param owner 
 * @param gender 
 * @param ageGroups 
 * @param gameExperienceLevel 
 * @param deviceVersionRanges 
 * @param categories 
 * @param applications 
 * @param radius 
 * @param locations 
 * @param sendSuggestion 
 * @param startTimeOffset 
 * @param endTimeOffset 
 * @param target 
 * @param associateContentName 
 * @param polygon 
 * @param associateType 
 * @param associateId 
 */
data class Audience(

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

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: Audience.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ageGroups") val ageGroups: kotlin.collections.List<Audience.AgeGroups>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameExperienceLevel") val gameExperienceLevel: Audience.GameExperienceLevel? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceVersionRanges") val deviceVersionRanges: kotlin.collections.List<AudienceDeviceVersionRange>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("applications") val applications: kotlin.collections.List<Application>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("radius") val radius: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locations") val locations: kotlin.collections.List<AudienceLocation>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sendSuggestion") val sendSuggestion: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTimeOffset") val startTimeOffset: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endTimeOffset") val endTimeOffset: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("target") val target: AudienceTargetType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("associateContentName") val associateContentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polygon") val polygon: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("associateType") val associateType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("associateId") val associateId: kotlin.Long? = null
) {

    /**
    * 
    * Values: MALE,FEMALE,ANY
    */
    enum class Gender(@get:JsonValue val value: kotlin.String) {

        MALE("MALE"),
        FEMALE("FEMALE"),
        ANY("ANY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Gender {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Audience'")
            }
        }
    }

    /**
    * 
    * Values: AGE_0_13,AGE_14_17,AGE_18_22,AGE_23_30,AGE_31_54,AGE_55_PLUS
    */
    enum class AgeGroups(@get:JsonValue val value: kotlin.String) {

        AGE_0_13("AGE_0_13"),
        AGE_14_17("AGE_14_17"),
        AGE_18_22("AGE_18_22"),
        AGE_23_30("AGE_23_30"),
        AGE_31_54("AGE_31_54"),
        AGE_55_PLUS("AGE_55_PLUS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AgeGroups {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Audience'")
            }
        }
    }

    /**
    * 
    * Values: ANY,NEW,BEGINNER,INTERMEDIATE,EXPERT
    */
    enum class GameExperienceLevel(@get:JsonValue val value: kotlin.String) {

        ANY("ANY"),
        NEW("NEW"),
        BEGINNER("BEGINNER"),
        INTERMEDIATE("INTERMEDIATE"),
        EXPERT("EXPERT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): GameExperienceLevel {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Audience'")
            }
        }
    }

}

