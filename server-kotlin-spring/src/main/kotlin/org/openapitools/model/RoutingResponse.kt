package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConfigRoutingRequest
import org.openapitools.model.DriverResponse
import org.openapitools.model.ItineraryResponse
import org.openapitools.model.LoadResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.VehicleResponse
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
 * @param items 
 * @param vehicles 
 * @param drivers 
 * @param config 
 * @param error 
 * @param debug 
 * @param startTime 
 * @param endTime 
 * @param responses 
 * @param orignalRequest 
 * @param generated 
 * @param itineraries 
 * @param score 
 * @param loadSize 
 * @param runtime 
 * @param earliestPickupWindow 
 * @param latestPickupWindow 
 * @param returning 
 */
data class RoutingResponse(

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<LoadResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vehicles") val vehicles: kotlin.collections.List<VehicleResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("drivers") val drivers: kotlin.collections.List<DriverResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("config") val config: ConfigRoutingRequest? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("debug") val debug: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTime") val startTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endTime") val endTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("responses") val responses: kotlin.collections.List<RoutingResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orignalRequest") val orignalRequest: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("generated") val generated: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("itineraries") val itineraries: kotlin.collections.List<ItineraryResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("score") val score: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("loadSize") val loadSize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("runtime") val runtime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("earliestPickupWindow") val earliestPickupWindow: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latestPickupWindow") val latestPickupWindow: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

