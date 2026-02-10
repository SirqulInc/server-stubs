package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.Note
import org.openapitools.model.Program
import org.openapitools.model.Region
import org.openapitools.model.ServiceHub
import org.openapitools.model.Shipment
import org.openapitools.model.Stop
import org.openapitools.model.Vehicle
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
 * @param name 
 * @param externalId 
 * @param hub 
 * @param program 
 * @param zone 
 * @param vehicle 
 * @param driver 
 * @param concierge 
 * @param scheduled 
 * @param approved 
 * @param started 
 * @param completed 
 * @param totalDistance 
 * @param totalTime 
 * @param estimatedDistance 
 * @param estimatedTime 
 * @param startStop 
 * @param endStop 
 * @param stops 
 * @param shipments 
 * @param allShipmentsConfirmed 
 * @param shipmentOrderCount 
 * @param polyline 
 * @param notes 
 * @param noteCount 
 * @param glympseToken 
 * @param enableOptimization 
 * @param optimizedDate 
 * @param optimizationStarted 
 * @param optimizationCompleted 
 * @param featured 
 * @param image 
 * @param parent 
 * @param contentName 
 */
data class Route(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("program") val program: Program? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("zone") val zone: Region? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vehicle") val vehicle: Vehicle? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("driver") val driver: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("concierge") val concierge: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduled") val scheduled: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("approved") val approved: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("started") val started: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("completed") val completed: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalDistance") val totalDistance: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalTime") val totalTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDistance") val estimatedDistance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedTime") val estimatedTime: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("startStop") val startStop: Stop? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("endStop") val endStop: Stop? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("stops") val stops: kotlin.collections.List<Stop>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipments") val shipments: kotlin.collections.List<Shipment>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allShipmentsConfirmed") val allShipmentsConfirmed: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("shipmentOrderCount") val shipmentOrderCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polyline") val polyline: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("glympseToken") val glympseToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enableOptimization") val enableOptimization: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optimizedDate") val optimizedDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optimizationStarted") val optimizationStarted: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optimizationCompleted") val optimizationCompleted: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("featured") val featured: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parent") val parent: Route? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null
) {

}

