package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param bidId 
 * @param biddableType 
 * @param biddableId 
 * @param amountPerView 
 * @param amountPerAction 
 * @param currentDailyBudget 
 * @param currentBudget 
 * @param currentBudgetExpiration 
 * @param currentBudgetStart 
 * @param budgetAmount 
 * @param budgetSchedule 
 */
data class BidResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("bidId") val bidId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("biddableType") val biddableType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("biddableId") val biddableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amountPerView") val amountPerView: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amountPerAction") val amountPerAction: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentDailyBudget") val currentDailyBudget: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentBudget") val currentBudget: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentBudgetExpiration") val currentBudgetExpiration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentBudgetStart") val currentBudgetStart: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("budgetAmount") val budgetAmount: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("budgetSchedule") val budgetSchedule: BidResponse.BudgetSchedule? = null
) {

    /**
    * 
    * Values: DAILY,WEEKLY,MONTHLY,YEARLY
    */
    enum class BudgetSchedule(@get:JsonValue val value: kotlin.String) {

        DAILY("DAILY"),
        WEEKLY("WEEKLY"),
        MONTHLY("MONTHLY"),
        YEARLY("YEARLY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): BudgetSchedule {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BidResponse'")
            }
        }
    }

}

