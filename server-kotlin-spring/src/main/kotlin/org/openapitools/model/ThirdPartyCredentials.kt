package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.ThirdPartyNetwork
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
 * @param account 
 * @param thirdPartyNetwork 
 * @param thirdPartyUID 
 * @param thirdPartyId 
 * @param thirdPartyToken 
 * @param thirdPartySecret 
 * @param thirdPartyName 
 * @param thirdPartyUnencryptedToken 
 */
data class ThirdPartyCredentials(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyNetwork") val thirdPartyNetwork: ThirdPartyNetwork? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyUID") val thirdPartyUID: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyId") val thirdPartyId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyToken") val thirdPartyToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartySecret") val thirdPartySecret: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyName") val thirdPartyName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyUnencryptedToken") val thirdPartyUnencryptedToken: kotlin.String? = null
) {

}

