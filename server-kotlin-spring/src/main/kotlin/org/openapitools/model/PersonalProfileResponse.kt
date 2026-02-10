package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NameStringValueResponse
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
 * @param valid 
 * @param message 
 * @param version 
 * @param serializeNulls 
 * @param startTimeLog 
 * @param errorCode 
 * @param request 
 * @param preferredGender 
 * @param preferredEthnicity 
 * @param preferredEducation 
 * @param preferredEducationIndex 
 * @param preferredBodyType 
 * @param preferredMinAge 
 * @param preferredMaxAge 
 * @param preferredMinHeight 
 * @param preferredMaxHeight 
 * @param preferredLocationRange 
 * @param gender 
 * @param hometown 
 * @param height 
 * @param heightIndex 
 * @param ethnicity 
 * @param bodyType 
 * @param children 
 * @param companionship 
 * @param companionshipIndex 
 * @param drink 
 * @param education 
 * @param educationIndex 
 * @param maritalStatus 
 * @param smoke 
 * @param religion 
 * @param birthday 
 * @param returning 
 */
data class PersonalProfileResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serializeNulls") val serializeNulls: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTimeLog") val startTimeLog: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request") val request: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredGender") val preferredGender: PersonalProfileResponse.PreferredGender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredEthnicity") val preferredEthnicity: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredEducation") val preferredEducation: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredEducationIndex") val preferredEducationIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredBodyType") val preferredBodyType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMinAge") val preferredMinAge: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMaxAge") val preferredMaxAge: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMinHeight") val preferredMinHeight: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMaxHeight") val preferredMaxHeight: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredLocationRange") val preferredLocationRange: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: PersonalProfileResponse.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hometown") val hometown: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("heightIndex") val heightIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ethnicity") val ethnicity: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bodyType") val bodyType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("companionship") val companionship: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("companionshipIndex") val companionshipIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("drink") val drink: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("education") val education: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("educationIndex") val educationIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maritalStatus") val maritalStatus: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("smoke") val smoke: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("religion") val religion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("birthday") val birthday: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: MALE,FEMALE,ANY
    */
    enum class PreferredGender(@get:JsonValue val value: kotlin.String) {

        MALE("MALE"),
        FEMALE("FEMALE"),
        ANY("ANY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PreferredGender {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PersonalProfileResponse'")
            }
        }
    }

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PersonalProfileResponse'")
            }
        }
    }

}

