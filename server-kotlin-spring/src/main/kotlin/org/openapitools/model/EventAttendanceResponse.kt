package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.CategoryResponse
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
 * @param event 
 * @param affiliatedCategories 
 * @param attendee 
 * @param friend 
 */
data class EventAttendanceResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("event") val event: OfferShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("affiliatedCategories") val affiliatedCategories: kotlin.collections.List<CategoryResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("attendee") val attendee: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friend") val friend: kotlin.Boolean? = null
) {

}

