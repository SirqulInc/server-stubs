package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NotificationSettingsResponse
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
 * @param showAsZipcode 
 * @param showExactLocation 
 * @param showOthersExactLocation 
 * @param suggestionCount 
 * @param suggestionTimeFrame 
 * @param suggestionMethod 
 * @param notifications 
 * @param publicShowFriendInfo 
 * @param publicShowGameInfo 
 * @param publicShowProfileInfo 
 * @param favoriteVisibility 
 */
data class UserSettingsResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("showAsZipcode") val showAsZipcode: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showExactLocation") val showExactLocation: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showOthersExactLocation") val showOthersExactLocation: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suggestionCount") val suggestionCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suggestionTimeFrame") val suggestionTimeFrame: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suggestionMethod") val suggestionMethod: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notifications") val notifications: NotificationSettingsResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicShowFriendInfo") val publicShowFriendInfo: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicShowGameInfo") val publicShowGameInfo: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicShowProfileInfo") val publicShowProfileInfo: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteVisibility") val favoriteVisibility: UserSettingsResponse.FavoriteVisibility? = null
) {

    /**
    * 
    * Values: PUBLIC,PRIVATE,FRIENDS
    */
    enum class FavoriteVisibility(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        PRIVATE("PRIVATE"),
        FRIENDS("FRIENDS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FavoriteVisibility {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UserSettingsResponse'")
            }
        }
    }

}

