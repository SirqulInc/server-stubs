package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param queueId 
 * @param name 
 * @param host 
 * @param port 
 * @param username 
 * @param password 
 * @param virtualHost 
 * @param workers 
 * @param exchanger 
 * @param exchangerType 
 * @param handleDelivery 
 * @param dataMapping 
 * @param analyticTags 
 */
data class QueueResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("queueId") val queueId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("host") val host: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("port") val port: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("password") val password: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("virtualHost") val virtualHost: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("workers") val workers: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("exchanger") val exchanger: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("exchangerType") val exchangerType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("handleDelivery") val handleDelivery: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dataMapping") val dataMapping: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("analyticTags") val analyticTags: kotlin.String? = null
) {

}

