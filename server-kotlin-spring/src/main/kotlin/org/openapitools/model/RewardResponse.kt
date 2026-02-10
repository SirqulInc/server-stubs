package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetShortResponse
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
 * @param offerId 
 * @param title 
 * @param subTitle 
 * @param details 
 * @param artwork 
 * @param finePrint 
 * @param redemptionCode 
 * @param redemptionStatus 
 * @param transactionId 
 * @param estimatedValue 
 */
data class RewardResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerId") val offerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subTitle") val subTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("details") val details: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("artwork") val artwork: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("finePrint") val finePrint: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redemptionCode") val redemptionCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redemptionStatus") val redemptionStatus: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transactionId") val transactionId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedValue") val estimatedValue: kotlin.Double? = null
) {

}

