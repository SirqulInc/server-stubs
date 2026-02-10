package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ThirdPartyNetworkShortResponse
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
 * @param thirdPartyCredentialId 
 * @param thirdPartyId 
 * @param thirdPartyName 
 * @param network 
 * @param updated 
 * @param created 
 */
data class ThirdPartyCredentialResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyCredentialId") val thirdPartyCredentialId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyId") val thirdPartyId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyName") val thirdPartyName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("network") val network: ThirdPartyNetworkShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null
) {

}

