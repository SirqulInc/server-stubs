package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountMiniResponse
import org.openapitools.model.ContactResponse
import org.openapitools.model.RetailerLocationShortResponse
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
 * @param accountId 
 * @param locationDisplay 
 * @param display 
 * @param username 
 * @param accountType 
 * @param profileImage 
 * @param gender 
 * @param contactEmail 
 * @param contact 
 * @param manager 
 * @param active 
 * @param locations 
 * @param hasDelegateAccess 
 * @param latitude 
 * @param longitude 
 * @param locationLastUpdated 
 * @param locationCount 
 */
data class EmployeeResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDisplay") val locationDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountType") val accountType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImage") val profileImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: EmployeeResponse.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contactEmail") val contactEmail: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contact") val contact: ContactResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("manager") val manager: AccountMiniResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locations") val locations: kotlin.collections.List<RetailerLocationShortResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasDelegateAccess") val hasDelegateAccess: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationLastUpdated") val locationLastUpdated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationCount") val locationCount: kotlin.Int? = null
) {

    /**
    * 
    * Values: MALE,FEMALE,ANY
    */
    enum class Gender(@get:JsonValue val value: kotlin.String) {

        MALE("MALE"),
        FEMALE("FEMALE"),
        ANY("ANY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Gender {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'EmployeeResponse'")
            }
        }
    }

}

