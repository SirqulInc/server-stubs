package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.CargoType
import org.openapitools.model.DateTimeRange
import org.openapitools.model.Note
import org.openapitools.model.PromoCode
import org.openapitools.model.Route
import org.openapitools.model.ServiceType
import org.openapitools.model.Stop
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
 * @param owner 
 * @param rider 
 * @param pickupStop 
 * @param dropOffStop 
 * @param notes 
 * @param noteCount 
 * @param batchId 
 * @param reserved 
 * @param canceled 
 * @param confirmed 
 * @param route 
 * @param polyline 
 * @param replacePassenger 
 * @param refunded 
 * @param promoCode 
 * @param quantity 
 * @param pickupTimeWindow 
 * @param dropOffTimeWindow 
 * @param cargoType 
 * @param serviceType 
 * @param routeId 
 * @param totalVolume 
 * @param complete 
 * @param contentName 
 * @param riderName 
 */
data class Shipment(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("rider") val rider: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupStop") val pickupStop: Stop? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropOffStop") val dropOffStop: Stop? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("batchId") val batchId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reserved") val reserved: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("canceled") val canceled: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("confirmed") val confirmed: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("route") val route: Route? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polyline") val polyline: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("replacePassenger") val replacePassenger: Shipment? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refunded") val refunded: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("promoCode") val promoCode: PromoCode? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickupTimeWindow") val pickupTimeWindow: DateTimeRange? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropOffTimeWindow") val dropOffTimeWindow: DateTimeRange? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("cargoType") val cargoType: CargoType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("serviceType") val serviceType: ServiceType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("routeId") val routeId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalVolume") val totalVolume: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("complete") val complete: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("riderName") val riderName: kotlin.String? = null
) {

}

