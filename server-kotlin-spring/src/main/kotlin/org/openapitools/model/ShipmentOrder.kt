package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrderPackage
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
 * @param batchID 
 * @param batchSize 
 * @param orderTrackingID 
 * @param clientRefNo 
 * @param clientRefNo2 
 * @param hubCode 
 * @param accountNo 
 * @param companyName 
 * @param vehicleTypeName 
 * @param serviceTypeName 
 * @param serviceCode 
 * @param pieces 
 * @param weight 
 * @param cubicFeet 
 * @param pickupCompany 
 * @param pickupContact 
 * @param pickupPhone 
 * @param pickupStreet 
 * @param pickupStreet2 
 * @param pickupCity 
 * @param pickupState 
 * @param pickupZip 
 * @param pickupTargetFrom 
 * @param pickupTargetTo 
 * @param deliveryCompany 
 * @param deliveryContact 
 * @param deliveryPhone 
 * @param deliveryStreet 
 * @param deliveryStreet2 
 * @param deliveryCity 
 * @param deliveryState 
 * @param deliveryZip 
 * @param deliveryTargetFrom 
 * @param deliveryTargetTo 
 * @param orderPackages 
 * @param routeID 
 * @param driverID 
 * @param pickupSequenceNo 
 * @param deliverySequenceNo 
 * @param pickupETA 
 * @param deliveryETA 
 */
data class ShipmentOrder(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("BatchID") val batchID: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("BatchSize") val batchSize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("OrderTrackingID") val orderTrackingID: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ClientRefNo") val clientRefNo: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ClientRefNo2") val clientRefNo2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("HubCode") val hubCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("AccountNo") val accountNo: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("CompanyName") val companyName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("VehicleTypeName") val vehicleTypeName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ServiceTypeName") val serviceTypeName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ServiceCode") val serviceCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Pieces") val pieces: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Weight") val weight: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("CubicFeet") val cubicFeet: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupCompany") val pickupCompany: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupContact") val pickupContact: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupPhone") val pickupPhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupStreet") val pickupStreet: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupStreet2") val pickupStreet2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupCity") val pickupCity: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupState") val pickupState: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupZip") val pickupZip: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupTargetFrom") val pickupTargetFrom: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupTargetTo") val pickupTargetTo: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryCompany") val deliveryCompany: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryContact") val deliveryContact: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryPhone") val deliveryPhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryStreet") val deliveryStreet: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryStreet2") val deliveryStreet2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryCity") val deliveryCity: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryState") val deliveryState: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryZip") val deliveryZip: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryTargetFrom") val deliveryTargetFrom: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryTargetTo") val deliveryTargetTo: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OrderPackages") val orderPackages: kotlin.collections.List<OrderPackage>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("RouteID") val routeID: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DriverID") val driverID: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupSequenceNo") val pickupSequenceNo: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliverySequenceNo") val deliverySequenceNo: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PickupETA") val pickupETA: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryETA") val deliveryETA: kotlin.String? = null
) {

}

