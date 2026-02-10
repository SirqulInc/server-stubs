package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ContactInfoResponse
import org.openapitools.model.PaymentTypesResponse
import org.openapitools.model.ProfileShortResponse
import org.openapitools.model.SubscriptionResponse
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
 * @param billableEntityId 
 * @param name 
 * @param responsible 
 * @param contact 
 * @param subscription 
 * @param payment 
 */
data class BillableEntityResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntityId") val billableEntityId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("responsible") val responsible: ProfileShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contact") val contact: ContactInfoResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("subscription") val subscription: SubscriptionResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("payment") val payment: PaymentTypesResponse? = null
) {

}

