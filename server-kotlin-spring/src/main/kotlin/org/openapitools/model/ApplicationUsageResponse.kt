package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BillableEntityResponse
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
 * @param billableEntity 
 * @param applicationId 
 * @param invoiceDate 
 * @param balance 
 * @param totalRequests 
 * @param totalDataStorage 
 * @param totalMediaStorage 
 * @param totalNotifications 
 * @param maxMissions 
 * @param maxVouchers 
 * @param maxCoupons 
 * @param maxProducts 
 * @param maxEvents 
 * @param maxMedia 
 * @param maxLocations 
 */
data class ApplicationUsageResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntityResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationId") val applicationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("invoiceDate") val invoiceDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("balance") val balance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalRequests") val totalRequests: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalDataStorage") val totalDataStorage: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalMediaStorage") val totalMediaStorage: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalNotifications") val totalNotifications: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxMissions") val maxMissions: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxVouchers") val maxVouchers: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxCoupons") val maxCoupons: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxProducts") val maxProducts: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxEvents") val maxEvents: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxMedia") val maxMedia: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxLocations") val maxLocations: kotlin.Long? = null
) {

}

