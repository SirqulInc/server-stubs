package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Category
import org.openapitools.model.Filter
import org.openapitools.model.GeoBox
import org.openapitools.model.PostalCode
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
 * @param owner 
 * @param shortName 
 * @param fullName 
 * @param bounds 
 * @param start 
 * @param end 
 * @param polygon 
 * @param metaData 
 * @param children 
 * @param parents 
 * @param postalCodes 
 * @param regionClass 
 * @param root 
 * @param webActive 
 * @param adminActive 
 * @param visibility 
 * @param categories 
 * @param filters 
 * @param truncatedLatitude 
 * @param truncatedLongitude 
 * @param versionCode 
 * @param display 
 * @param contentName 
 */
data class Region(

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("shortName") val shortName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullName") val fullName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("bounds") val bounds: GeoBox? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("end") val end: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polygon") val polygon: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaData") val metaData: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.collections.Set<Region>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parents") val parents: kotlin.collections.Set<Region>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("postalCodes") val postalCodes: kotlin.collections.Set<PostalCode>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("regionClass") val regionClass: Region.RegionClass? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("root") val root: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("webActive") val webActive: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("adminActive") val adminActive: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: Region.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: kotlin.collections.List<Filter>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("truncatedLatitude") val truncatedLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("truncatedLongitude") val truncatedLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("versionCode") val versionCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null
) {

    /**
    * 
    * Values: NATIONAL,STATE,COUNTY,METRO_AREA,CITY,NEIGHBORHOOD,TERRITORY,CUSTOM,ZONE
    */
    enum class RegionClass(@get:JsonValue val value: kotlin.String) {

        NATIONAL("NATIONAL"),
        STATE("STATE"),
        COUNTY("COUNTY"),
        METRO_AREA("METRO_AREA"),
        CITY("CITY"),
        NEIGHBORHOOD("NEIGHBORHOOD"),
        TERRITORY("TERRITORY"),
        CUSTOM("CUSTOM"),
        ZONE("ZONE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): RegionClass {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Region'")
            }
        }
    }

    /**
    * 
    * Values: PUBLIC,PRIVATE,FRIENDS
    */
    enum class Visibility(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        PRIVATE("PRIVATE"),
        FRIENDS("FRIENDS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Visibility {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Region'")
            }
        }
    }

}

