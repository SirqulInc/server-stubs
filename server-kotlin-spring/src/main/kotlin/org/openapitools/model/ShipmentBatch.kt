package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Program
import org.openapitools.model.Retailer
import org.openapitools.model.ServiceHub
import org.openapitools.model.Shipment
import org.openapitools.model.ShipmentImportStatus
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
 * @param created 
 * @param updated 
 * @param active 
 * @param valid 
 * @param retailer 
 * @param hub 
 * @param program 
 * @param shipmentImportStatuses 
 * @param shipments 
 * @param uploaded 
 * @param started 
 * @param optimizationStarted 
 * @param completed 
 * @param optimizationCompleted 
 * @param source 
 * @param externalId 
 * @param total 
 * @param processedCount 
 * @param successCount 
 * @param failedCount 
 * @param validCount 
 * @param invalidCount 
 * @param averageTravelSpeed 
 * @param maxSeconds 
 * @param importStatus 
 * @param totalRoutes 
 * @param routesCreated 
 * @param totalLegsRequests 
 * @param legsRequested 
 * @param initScore 
 * @param hardScore 
 * @param mediumScore 
 * @param softScore 
 */
data class ShipmentBatch(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailer") val retailer: Retailer? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("program") val program: Program? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipmentImportStatuses") val shipmentImportStatuses: kotlin.collections.List<ShipmentImportStatus>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipments") val shipments: kotlin.collections.List<Shipment>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("uploaded") val uploaded: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("started") val started: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optimizationStarted") val optimizationStarted: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("completed") val completed: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optimizationCompleted") val optimizationCompleted: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("source") val source: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("total") val total: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("processedCount") val processedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("successCount") val successCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("failedCount") val failedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("validCount") val validCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("invalidCount") val invalidCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("averageTravelSpeed") val averageTravelSpeed: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxSeconds") val maxSeconds: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("importStatus") val importStatus: ShipmentBatch.ImportStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalRoutes") val totalRoutes: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("routesCreated") val routesCreated: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalLegsRequests") val totalLegsRequests: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("legsRequested") val legsRequested: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("initScore") val initScore: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hardScore") val hardScore: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("mediumScore") val mediumScore: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("softScore") val softScore: kotlin.Long? = null
) {

    /**
    * 
    * Values: NEW,STARTED,FETCHING_DISTANCE_DATA,OPTIMIZING,CREATING_ROUTES,COMPLETED,INCOMPLETE
    */
    enum class ImportStatus(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        STARTED("STARTED"),
        FETCHING_DISTANCE_DATA("FETCHING_DISTANCE_DATA"),
        OPTIMIZING("OPTIMIZING"),
        CREATING_ROUTES("CREATING_ROUTES"),
        COMPLETED("COMPLETED"),
        INCOMPLETE("INCOMPLETE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ImportStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ShipmentBatch'")
            }
        }
    }

}

