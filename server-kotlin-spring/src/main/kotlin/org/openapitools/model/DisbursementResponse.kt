package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BillableEntityShortResponse
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
 * @param disbursementId 
 * @param title 
 * @param comment 
 * @param externalId 
 * @param introspectionParams 
 * @param amount 
 * @param scheduledDate 
 * @param captureDate 
 * @param estimatedDate 
 * @param settledDate 
 * @param status 
 * @param provider 
 * @param senderBillable 
 * @param receiverBillable 
 * @param errorCode 
 * @param errorMessage 
 */
data class DisbursementResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("disbursementId") val disbursementId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("comment") val comment: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("introspectionParams") val introspectionParams: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amount") val amount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledDate") val scheduledDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("captureDate") val captureDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDate") val estimatedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("settledDate") val settledDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: DisbursementResponse.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("provider") val provider: DisbursementResponse.Provider? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("senderBillable") val senderBillable: BillableEntityShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("receiverBillable") val receiverBillable: BillableEntityShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorMessage") val errorMessage: kotlin.String? = null
) {

    /**
    * 
    * Values: NEW,APPROVED,VALIDATING,ERROR,AUTHORIZED,CAPTURED,SETTLED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        APPROVED("APPROVED"),
        VALIDATING("VALIDATING"),
        ERROR("ERROR"),
        AUTHORIZED("AUTHORIZED"),
        CAPTURED("CAPTURED"),
        SETTLED("SETTLED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'DisbursementResponse'")
            }
        }
    }

    /**
    * 
    * Values: AUTHORIZE_NET,AMAZON_FPS,BILL_COM
    */
    enum class Provider(@get:JsonValue val value: kotlin.String) {

        AUTHORIZE_NET("AUTHORIZE_NET"),
        AMAZON_FPS("AMAZON_FPS"),
        BILL_COM("BILL_COM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Provider {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'DisbursementResponse'")
            }
        }
    }

}

