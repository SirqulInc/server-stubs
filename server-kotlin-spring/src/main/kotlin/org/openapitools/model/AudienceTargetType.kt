package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.OfferLocation
import org.openapitools.model.Region
import org.openapitools.model.RetailerLocation
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
 * @param targetType 
 * @param targetDescription 
 * @param retailerLocation 
 * @param offerLocation 
 * @param account 
 * @param region 
 */
data class AudienceTargetType(

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetType") val targetType: AudienceTargetType.TargetType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetDescription") val targetDescription: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocation") val retailerLocation: RetailerLocation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerLocation") val offerLocation: OfferLocation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("region") val region: Region? = null
) {

    /**
    * 
    * Values: RETAILER_LOCATION,OFFER_LOCATION,ACCOUNT,REGION
    */
    enum class TargetType(@get:JsonValue val value: kotlin.String) {

        RETAILER_LOCATION("RETAILER_LOCATION"),
        OFFER_LOCATION("OFFER_LOCATION"),
        ACCOUNT("ACCOUNT"),
        REGION("REGION");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TargetType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AudienceTargetType'")
            }
        }
    }

}

