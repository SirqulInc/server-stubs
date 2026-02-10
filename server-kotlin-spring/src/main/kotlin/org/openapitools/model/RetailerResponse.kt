package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.BillableEntityResponse
import org.openapitools.model.ContactInfoResponse
import org.openapitools.model.ProfileShortResponse
import org.openapitools.model.RetailerCountResponse
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
 * @param retailerId 
 * @param name 
 * @param facebookUrl 
 * @param twitterUrl 
 * @param active 
 * @param contact 
 * @param logo 
 * @param picture1 
 * @param picture2 
 * @param latitude 
 * @param longitude 
 * @param visibility 
 * @param responsible 
 * @param manager 
 * @param billableEntity 
 * @param counts 
 */
data class RetailerResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerId") val retailerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("facebookUrl") val facebookUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("twitterUrl") val twitterUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contact") val contact: ContactInfoResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("logo") val logo: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture1") val picture1: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture2") val picture2: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("responsible") val responsible: ProfileShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("manager") val manager: ProfileShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntityResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("counts") val counts: RetailerCountResponse? = null
) {

}

