package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Asset
import org.openapitools.model.SubscriptionOption
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
 * @param options 
 * @param price 
 * @param promo 
 * @param transactionFee 
 * @param role 
 * @param defaultPlan 
 * @param visible 
 * @param image 
 */
data class SubscriptionPlan(

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
    @get:JsonProperty("options") val options: kotlin.collections.List<SubscriptionOption>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("promo") val promo: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transactionFee") val transactionFee: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("role") val role: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultPlan") val defaultPlan: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visible") val visible: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null
) {

}

