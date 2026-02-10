package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
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
 * @param status 
 * @param title 
 * @param description 
 * @param owner 
 * @param permissionableId 
 * @param permissionableType 
 * @param ranked 
 * @param rewarded 
 * @param startDate 
 * @param endDate 
 * @param updated 
 * @param buyBackAvailable 
 * @param inviteStatus 
 */
data class MissionInviteResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: MissionInviteResponse.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("permissionableId") val permissionableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("permissionableType") val permissionableType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ranked") val ranked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rewarded") val rewarded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("buyBackAvailable") val buyBackAvailable: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteStatus") val inviteStatus: MissionInviteResponse.InviteStatus? = null
) {

    /**
    * 
    * Values: AVAILABLE,PENDING,UPDATED,ACCEPTED,ACTIVE,BUY_BACK,FAILED,QUIT,COMPLETED,PENDING_REVIEW,REJECTED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        AVAILABLE("AVAILABLE"),
        PENDING("PENDING"),
        UPDATED("UPDATED"),
        ACCEPTED("ACCEPTED"),
        ACTIVE("ACTIVE"),
        BUY_BACK("BUY_BACK"),
        FAILED("FAILED"),
        QUIT("QUIT"),
        COMPLETED("COMPLETED"),
        PENDING_REVIEW("PENDING_REVIEW"),
        REJECTED("REJECTED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MissionInviteResponse'")
            }
        }
    }

    /**
    * 
    * Values: AVAILABLE,PENDING,UPDATED,ACCEPTED,ACTIVE,BUY_BACK,FAILED,QUIT,COMPLETED,PENDING_REVIEW,REJECTED
    */
    enum class InviteStatus(@get:JsonValue val value: kotlin.String) {

        AVAILABLE("AVAILABLE"),
        PENDING("PENDING"),
        UPDATED("UPDATED"),
        ACCEPTED("ACCEPTED"),
        ACTIVE("ACTIVE"),
        BUY_BACK("BUY_BACK"),
        FAILED("FAILED"),
        QUIT("QUIT"),
        COMPLETED("COMPLETED"),
        PENDING_REVIEW("PENDING_REVIEW"),
        REJECTED("REJECTED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): InviteStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MissionInviteResponse'")
            }
        }
    }

}

