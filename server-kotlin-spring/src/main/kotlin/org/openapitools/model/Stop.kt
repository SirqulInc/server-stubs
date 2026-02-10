package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Location
import org.openapitools.model.Note
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
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param name 
 * @param owner 
 * @param location 
 * @param notes 
 * @param noteCount 
 * @param stopType 
 * @param orderIndex 
 * @param startTime 
 * @param endTime 
 * @param estimatedTime 
 * @param estimatedArrivalTime 
 * @param estimatedDepartureTime 
 * @param actualTime 
 * @param desiredTime 
 * @param timePadding 
 * @param route 
 * @param shipment 
 * @param progressStatus 
 * @param compareEstimatedTime 
 * @param compareEstimatedArrivalTime 
 * @param compareEstimiatedDepartureTime 
 * @param polyline 
 * @param parent 
 * @param locationDisplay 
 * @param complete 
 * @param contentName 
 * @param locationAddress 
 */
data class Stop(

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
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("location") val location: Location? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("stopType") val stopType: Stop.StopType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderIndex") val orderIndex: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTime") val startTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endTime") val endTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedTime") val estimatedTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedArrivalTime") val estimatedArrivalTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDepartureTime") val estimatedDepartureTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("actualTime") val actualTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("desiredTime") val desiredTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timePadding") val timePadding: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("route") val route: Route? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipment") val shipment: Shipment? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("progressStatus") val progressStatus: Stop.ProgressStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("compareEstimatedTime") val compareEstimatedTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("compareEstimatedArrivalTime") val compareEstimatedArrivalTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("compareEstimiatedDepartureTime") val compareEstimiatedDepartureTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polyline") val polyline: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parent") val parent: Stop? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDisplay") val locationDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("complete") val complete: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationAddress") val locationAddress: kotlin.String? = null
) {

    /**
    * 
    * Values: PICKUP,DROPOFF,START,END,ROUTING
    */
    enum class StopType(@get:JsonValue val value: kotlin.String) {

        PICKUP("PICKUP"),
        DROPOFF("DROPOFF"),
        START("START"),
        END("END"),
        ROUTING("ROUTING");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): StopType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Stop'")
            }
        }
    }

    /**
    * 
    * Values: PENDING,COMPLETE,INVALID
    */
    enum class ProgressStatus(@get:JsonValue val value: kotlin.String) {

        PENDING("PENDING"),
        COMPLETE("COMPLETE"),
        INVALID("INVALID");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ProgressStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Stop'")
            }
        }
    }

}

