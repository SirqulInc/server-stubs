package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CategoryResponse
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
 * @param ratingIndexId 
 * @param ratingCount 
 * @param ratingAverage 
 * @param &#x60;value&#x60; 
 * @param display 
 * @param ratableType 
 * @param ratableId 
 * @param category 
 * @param ratable 
 * @param secondaryType 
 */
data class RatingIndexResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("ratingIndexId") val ratingIndexId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ratingCount") val ratingCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ratingAverage") val ratingAverage: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("value") val `value`: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ratableType") val ratableType: RatingIndexResponse.RatableType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ratableId") val ratableId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("category") val category: CategoryResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ratable") val ratable: kotlin.Any? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondaryType") val secondaryType: kotlin.String? = null
) {

    /**
    * 
    * Values: LOCATABLE,RESERVABLE,PERMISSIONABLE,NOTABLE,ASSETABLE,LIKABLE,FLAGABLE,FAVORITABLE,RATABLE,ALBUM,COLLECTION,APPLICATION,APPLICATION_SETTING,APPLICATION_CERT,APPLICATION_PLACEMENT,ACCOUNT,ACCOUNT_SETTING,GAME_LEVEL,PACK,MISSION,TOURNAMENT,ASSET,ALBUM_CONTEST,THEME_DESCRIPTOR,OFFER,OFFER_LOCATION,EVENT,RETAILER,RETAILER_LOCATION,NOTE,CREATIVE,FAVORITE,LIKE,RATING,ANALYTIC,THIRD_PARTY_CREDENTIAL,THIRD_PARTY_NETWORK,REGION
    */
    enum class RatableType(@get:JsonValue val value: kotlin.String) {

        LOCATABLE("LOCATABLE"),
        RESERVABLE("RESERVABLE"),
        PERMISSIONABLE("PERMISSIONABLE"),
        NOTABLE("NOTABLE"),
        ASSETABLE("ASSETABLE"),
        LIKABLE("LIKABLE"),
        FLAGABLE("FLAGABLE"),
        FAVORITABLE("FAVORITABLE"),
        RATABLE("RATABLE"),
        ALBUM("ALBUM"),
        COLLECTION("COLLECTION"),
        APPLICATION("APPLICATION"),
        APPLICATION_SETTING("APPLICATION_SETTING"),
        APPLICATION_CERT("APPLICATION_CERT"),
        APPLICATION_PLACEMENT("APPLICATION_PLACEMENT"),
        ACCOUNT("ACCOUNT"),
        ACCOUNT_SETTING("ACCOUNT_SETTING"),
        GAME_LEVEL("GAME_LEVEL"),
        PACK("PACK"),
        MISSION("MISSION"),
        TOURNAMENT("TOURNAMENT"),
        ASSET("ASSET"),
        ALBUM_CONTEST("ALBUM_CONTEST"),
        THEME_DESCRIPTOR("THEME_DESCRIPTOR"),
        OFFER("OFFER"),
        OFFER_LOCATION("OFFER_LOCATION"),
        EVENT("EVENT"),
        RETAILER("RETAILER"),
        RETAILER_LOCATION("RETAILER_LOCATION"),
        NOTE("NOTE"),
        CREATIVE("CREATIVE"),
        FAVORITE("FAVORITE"),
        LIKE("LIKE"),
        RATING("RATING"),
        ANALYTIC("ANALYTIC"),
        THIRD_PARTY_CREDENTIAL("THIRD_PARTY_CREDENTIAL"),
        THIRD_PARTY_NETWORK("THIRD_PARTY_NETWORK"),
        REGION("REGION");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): RatableType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RatingIndexResponse'")
            }
        }
    }

}

