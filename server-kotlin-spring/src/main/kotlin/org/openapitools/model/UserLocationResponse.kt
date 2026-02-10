package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.CategoryResponse
import org.openapitools.model.ContactResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.PersonalProfileResponse
import org.openapitools.model.PostalCodeResponse
import org.openapitools.model.UserSettingsResponse
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
 * @param accountId 
 * @param locationDisplay 
 * @param display 
 * @param username 
 * @param profileImage 
 * @param profileAvatar 
 * @param aboutUs 
 * @param locale 
 * @param summaryTitle 
 * @param gender 
 * @param age 
 * @param gameExperience 
 * @param contact 
 * @param categories 
 * @param personalProfile 
 * @param userSettings 
 * @param latitude 
 * @param longitude 
 * @param currentPostalCode 
 * @param accountType 
 * @param premiumExpiration 
 * @param matchIndex 
 * @param tags 
 * @param locationLastUpdated 
 * @param distanceFromMe 
 * @param returning 
 */
data class UserLocationResponse(

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
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDisplay") val locationDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImage") val profileImage: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profileAvatar") val profileAvatar: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("aboutUs") val aboutUs: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locale") val locale: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("summaryTitle") val summaryTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: UserLocationResponse.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("age") val age: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameExperience") val gameExperience: UserLocationResponse.GameExperience? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contact") val contact: ContactResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<CategoryResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("personalProfile") val personalProfile: PersonalProfileResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userSettings") val userSettings: UserSettingsResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currentPostalCode") val currentPostalCode: PostalCodeResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountType") val accountType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("premiumExpiration") val premiumExpiration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("matchIndex") val matchIndex: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tags") val tags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationLastUpdated") val locationLastUpdated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distanceFromMe") val distanceFromMe: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UserLocationResponse'")
            }
        }
    }

    /**
    * 
    * Values: ANY,NEW,BEGINNER,INTERMEDIATE,EXPERT
    */
    enum class GameExperience(@get:JsonValue val value: kotlin.String) {

        ANY("ANY"),
        NEW("NEW"),
        BEGINNER("BEGINNER"),
        INTERMEDIATE("INTERMEDIATE"),
        EXPERT("EXPERT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): GameExperience {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UserLocationResponse'")
            }
        }
    }

}

