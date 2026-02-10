package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Address
import org.openapitools.model.CellCarrier
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
 * @param detailsHeader 
 * @param detailsBody 
 * @param detailsLineLeft1 
 * @param detailsLineLeft2 
 * @param detailsLineRight1 
 * @param metaDescription 
 * @param directions 
 * @param hours 
 * @param homePhone 
 * @param cellPhone 
 * @param cellCarrier 
 * @param businessPhone 
 * @param businessPhoneExt 
 * @param faxNumber 
 * @param timeZone 
 * @param utcOffset 
 * @param code501c3 
 * @param emailAddress 
 * @param address 
 * @param web 
 * @param featured 
 * @param listed 
 */
data class RetailerProfile(

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsHeader") val detailsHeader: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsBody") val detailsBody: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsLineLeft1") val detailsLineLeft1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsLineLeft2") val detailsLineLeft2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsLineRight1") val detailsLineRight1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaDescription") val metaDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("directions") val directions: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hours") val hours: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("homePhone") val homePhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cellPhone") val cellPhone: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("cellCarrier") val cellCarrier: CellCarrier? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessPhone") val businessPhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessPhoneExt") val businessPhoneExt: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("faxNumber") val faxNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeZone") val timeZone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("utcOffset") val utcOffset: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("code501c3") val code501c3: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("emailAddress") val emailAddress: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: Address? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("web") val web: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("featured") val featured: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("listed") val listed: kotlin.Boolean? = null
) {

}

