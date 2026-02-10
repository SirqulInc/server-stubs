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
 * @param created 
 * @param updated 
 * @param active 
 * @param valid 
 * @param account 
 * @param gender 
 * @param birthday 
 * @param ageGroup 
 * @param preferredMinAge 
 * @param preferredMaxAge 
 * @param preferredMinHeight 
 * @param preferredMaxHeight 
 * @param preferredGender 
 * @param preferredEducation 
 * @param preferredEducationIndex 
 * @param preferredBodyType 
 * @param preferredEthnicity 
 * @param preferredLocation 
 * @param preferredLocationRange 
 * @param height 
 * @param heightIndex 
 * @param ethnicity 
 * @param bodyType 
 * @param maritalStatus 
 * @param children 
 * @param religion 
 * @param education 
 * @param educationIndex 
 * @param smoke 
 * @param drink 
 * @param companionship 
 * @param companionshipIndex 
 * @param developmentPlatforms 
 * @param matchToken 
 * @param matchString 
 * @param noneZeroMatchToken 
 * @param preferredMaxBirthday 
 * @param preferredMinBirthday 
 */
data class AccountProfileInfo(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: AccountProfileInfo.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("birthday") val birthday: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ageGroup") val ageGroup: AccountProfileInfo.AgeGroup? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMinAge") val preferredMinAge: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMaxAge") val preferredMaxAge: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMinHeight") val preferredMinHeight: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMaxHeight") val preferredMaxHeight: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredGender") val preferredGender: AccountProfileInfo.PreferredGender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredEducation") val preferredEducation: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredEducationIndex") val preferredEducationIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredBodyType") val preferredBodyType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredEthnicity") val preferredEthnicity: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredLocation") val preferredLocation: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredLocationRange") val preferredLocationRange: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("heightIndex") val heightIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ethnicity") val ethnicity: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bodyType") val bodyType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maritalStatus") val maritalStatus: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("religion") val religion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("education") val education: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("educationIndex") val educationIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("smoke") val smoke: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("drink") val drink: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("companionship") val companionship: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("companionshipIndex") val companionshipIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("developmentPlatforms") val developmentPlatforms: kotlin.collections.List<AccountProfileInfo.DevelopmentPlatforms>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("matchToken") val matchToken: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("matchString") val matchString: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noneZeroMatchToken") val noneZeroMatchToken: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMaxBirthday") val preferredMaxBirthday: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredMinBirthday") val preferredMinBirthday: java.time.OffsetDateTime? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AccountProfileInfo'")
            }
        }
    }

    /**
    * 
    * Values: AGE_0_13,AGE_14_17,AGE_18_22,AGE_23_30,AGE_31_54,AGE_55_PLUS
    */
    enum class AgeGroup(@get:JsonValue val value: kotlin.String) {

        AGE_0_13("AGE_0_13"),
        AGE_14_17("AGE_14_17"),
        AGE_18_22("AGE_18_22"),
        AGE_23_30("AGE_23_30"),
        AGE_31_54("AGE_31_54"),
        AGE_55_PLUS("AGE_55_PLUS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AgeGroup {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AccountProfileInfo'")
            }
        }
    }

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AccountProfileInfo'")
            }
        }
    }

    /**
    * 
    * Values: MAC,WINDOWS,IOS,ANDROID,WINDOWSPHONE,KINDLE,UNITY3D,COCOS2D,HTML5,FACEBOOK
    */
    enum class DevelopmentPlatforms(@get:JsonValue val value: kotlin.String) {

        MAC("MAC"),
        WINDOWS("WINDOWS"),
        IOS("IOS"),
        ANDROID("ANDROID"),
        WINDOWSPHONE("WINDOWSPHONE"),
        KINDLE("KINDLE"),
        UNITY3D("UNITY3D"),
        COCOS2D("COCOS2D"),
        HTML5("HTML5"),
        FACEBOOK("FACEBOOK");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): DevelopmentPlatforms {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AccountProfileInfo'")
            }
        }
    }

}

