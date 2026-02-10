package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.Note
import org.openapitools.model.Program
import org.openapitools.model.Region
import org.openapitools.model.ServiceHub
import org.openapitools.model.VehicleType
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
 * @param description 
 * @param vehicleType 
 * @param vin 
 * @param licensePlateNumber 
 * @param externalId 
 * @param hub 
 * @param programs 
 * @param seatQuantity 
 * @param picture 
 * @param markerIcon 
 * @param trackingColor 
 * @param belongsTo 
 * @param zone 
 * @param notes 
 * @param noteCount 
 * @param inUse 
 * @param contentName 
 */
data class Vehicle(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vehicleType") val vehicleType: VehicleType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("vin") val vin: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("licensePlateNumber") val licensePlateNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("programs") val programs: kotlin.collections.List<Program>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("seatQuantity") val seatQuantity: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture") val picture: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("markerIcon") val markerIcon: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("trackingColor") val trackingColor: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("belongsTo") val belongsTo: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("zone") val zone: Region? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inUse") val inUse: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null
) {

}

