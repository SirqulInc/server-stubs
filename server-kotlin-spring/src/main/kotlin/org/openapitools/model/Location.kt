package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Address
import org.openapitools.model.Asset
import org.openapitools.model.CellCarrier
import org.openapitools.model.Note
import org.openapitools.model.Program
import org.openapitools.model.ServiceHub
import org.openapitools.model.Territory
import org.openapitools.model.YayOrNay
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
 * @param territory 
 * @param hub 
 * @param picture 
 * @param notes 
 * @param noteCount 
 * @param homePhone 
 * @param cellPhone 
 * @param cellCarrier 
 * @param businessPhone 
 * @param businessPhoneExt 
 * @param faxNumber 
 * @param timeZone 
 * @param utcOffset 
 * @param code501c3 
 * @param emailAddress 
 * @param address 
 * @param web 
 * @param program 
 * @param visibility 
 * @param groupingId 
 * @param destination 
 * @param dockingTime 
 * @param usageCount 
 * @param timeFramesAllowed 
 * @param likes 
 * @param likeCount 
 * @param dislikeCount 
 * @param ownerDisplay 
 * @param contentName 
 */
data class Location(

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("territory") val territory: Territory? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture") val picture: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("homePhone") val homePhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cellPhone") val cellPhone: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("cellCarrier") val cellCarrier: CellCarrier? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessPhone") val businessPhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessPhoneExt") val businessPhoneExt: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("faxNumber") val faxNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeZone") val timeZone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("utcOffset") val utcOffset: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("code501c3") val code501c3: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("emailAddress") val emailAddress: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: Address? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("web") val web: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("program") val program: Program? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: Location.Visibility? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("groupingId") val groupingId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("destination") val destination: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dockingTime") val dockingTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("usageCount") val usageCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeFramesAllowed") val timeFramesAllowed: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("likes") val likes: kotlin.collections.List<YayOrNay>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerDisplay") val ownerDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Location'")
            }
        }
    }

}

