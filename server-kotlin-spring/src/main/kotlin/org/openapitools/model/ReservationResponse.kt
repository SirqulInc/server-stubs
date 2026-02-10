package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.OfferShortResponse
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
 * @param reservationId 
 * @param reservableId 
 * @param reservableType 
 * @param account 
 * @param createdDate 
 * @param updatedDate 
 * @param startDate 
 * @param endDate 
 * @param transaction 
 */
data class ReservationResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("reservationId") val reservationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reservableId") val reservableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reservableType") val reservableType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdDate") val createdDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("transaction") val transaction: OfferShortResponse? = null
) {

}

