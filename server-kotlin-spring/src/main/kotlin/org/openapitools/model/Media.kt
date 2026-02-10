package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Album
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
 * @param mediaType 
 * @param condition 
 * @param isbn 
 * @param asin 
 * @param catalogNumbers 
 * @param duration 
 * @param author 
 * @param releaseDate 
 * @param availabilityDate 
 * @param parentalRating 
 * @param collections 
 * @param collectionCount 
 */
data class Media(

    @Schema(example = "null", description = "")
    @get:JsonProperty("mediaType") val mediaType: Media.MediaType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("condition") val condition: Media.Condition? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isbn") val isbn: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asin") val asin: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("catalogNumbers") val catalogNumbers: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("author") val author: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("releaseDate") val releaseDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availabilityDate") val availabilityDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentalRating") val parentalRating: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("collections") val collections: kotlin.collections.List<Album>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("collectionCount") val collectionCount: kotlin.Int? = null
) {

    /**
    * 
    * Values: APK,APPLICATION,IMAGE,AUDIO,VIDEO,MULTIPART,BAR_CODE,TEXT,OTHER
    */
    enum class MediaType(@get:JsonValue val value: kotlin.String) {

        APK("APK"),
        APPLICATION("APPLICATION"),
        IMAGE("IMAGE"),
        AUDIO("AUDIO"),
        VIDEO("VIDEO"),
        MULTIPART("MULTIPART"),
        BAR_CODE("BAR_CODE"),
        TEXT("TEXT"),
        OTHER("OTHER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Media'")
            }
        }
    }

    /**
    * 
    * Values: NEW,USED,REFURBISHED,OTHER
    */
    enum class Condition(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        USED("USED"),
        REFURBISHED("REFURBISHED"),
        OTHER("OTHER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Condition {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Media'")
            }
        }
    }

}

