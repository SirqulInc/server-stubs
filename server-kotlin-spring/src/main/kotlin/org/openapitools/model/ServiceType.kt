package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Address
import org.openapitools.model.Retailer
import org.openapitools.model.ServiceHub
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
 * @param business 
 * @param hub 
 * @param name 
 * @param additionalLoadTime 
 * @param pickupAddressOverride 
 * @param dropoffAddressOverride 
 * @param pickupStartTimeOverride 
 * @param pickupEndTimeOverride 
 * @param dropoffStartTimeOverride 
 * @param dropoffEndTimeOverride 
 * @param dateOverride 
 */
data class ServiceType(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("business") val business: Retailer? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("additionalLoadTime") val additionalLoadTime: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupAddressOverride") val pickupAddressOverride: Address? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropoffAddressOverride") val dropoffAddressOverride: Address? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupStartTimeOverride") val pickupStartTimeOverride: java.time.LocalTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupEndTimeOverride") val pickupEndTimeOverride: java.time.LocalTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropoffStartTimeOverride") val dropoffStartTimeOverride: java.time.LocalTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropoffEndTimeOverride") val dropoffEndTimeOverride: java.time.LocalTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dateOverride") val dateOverride: ServiceType.DateOverride? = null
) {

    /**
    * 
    * Values: NONE,PICKUP_START,PICKUP_END,DROPOFF_START,DROPOFF_END
    */
    enum class DateOverride(@get:JsonValue val value: kotlin.String) {

        NONE("NONE"),
        PICKUP_START("PICKUP_START"),
        PICKUP_END("PICKUP_END"),
        DROPOFF_START("DROPOFF_START"),
        DROPOFF_END("DROPOFF_END");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): DateOverride {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ServiceType'")
            }
        }
    }

}

