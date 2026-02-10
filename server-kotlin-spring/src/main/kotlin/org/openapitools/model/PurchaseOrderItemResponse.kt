package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.NameStringValueResponse
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
 * @param purchaseOrderItemId 
 * @param created 
 * @param updated 
 * @param customer 
 * @param orderItemType 
 * @param orderItemId 
 * @param orderCustomType 
 * @param orderCustomId 
 * @param retailerLocationId 
 * @param amount 
 * @param tax 
 * @param comment 
 * @param returning 
 */
data class PurchaseOrderItemResponse(

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

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseOrderItemId") val purchaseOrderItemId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("customer") val customer: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderItemType") val orderItemType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderItemId") val orderItemId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderCustomType") val orderCustomType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderCustomId") val orderCustomId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocationId") val retailerLocationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amount") val amount: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tax") val tax: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("comment") val comment: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

