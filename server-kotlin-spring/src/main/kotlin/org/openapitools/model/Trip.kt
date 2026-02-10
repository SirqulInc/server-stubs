package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Connection
import org.openapitools.model.Location
import org.openapitools.model.Recurrence
import org.openapitools.model.Route
import org.openapitools.model.Shipment
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
 * @param owner 
 * @param pickupLocation 
 * @param pickupTime 
 * @param dropOffLocation 
 * @param dropOffTime 
 * @param shipments 
 * @param recurrence 
 * @param timeZone 
 * @param route 
 * @param preference 
 * @param notifications 
 * @param matches 
 * @param ownerConnection 
 * @param originalId 
 */
data class Trip(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupLocation") val pickupLocation: Location? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupTime") val pickupTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropOffLocation") val dropOffLocation: Location? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dropOffTime") val dropOffTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipments") val shipments: kotlin.collections.List<Shipment>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("recurrence") val recurrence: Recurrence? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeZone") val timeZone: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("route") val route: Route? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preference") val preference: Trip.Preference? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notifications") val notifications: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("matches") val matches: kotlin.collections.List<Trip>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerConnection") val ownerConnection: Connection? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("originalId") val originalId: kotlin.Long? = null
) {

    /**
    * 
    * Values: DRIVE,FLEXIBLE,RIDE
    */
    enum class Preference(@get:JsonValue val value: kotlin.String) {

        DRIVE("DRIVE"),
        FLEXIBLE("FLEXIBLE"),
        RIDE("RIDE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Preference {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Trip'")
            }
        }
    }

}

