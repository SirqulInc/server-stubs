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
 * @param firstName 
 * @param middleName 
 * @param lastName 
 * @param prefix 
 * @param suffix 
 * @param title 
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
 * @param display 
 */
data class Contact(

    @Schema(example = "null", description = "")
    @get:JsonProperty("firstName") val firstName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("middleName") val middleName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastName") val lastName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("prefix") val prefix: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suffix") val suffix: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

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
    @get:JsonProperty("display") val display: kotlin.String? = null
) {

}

