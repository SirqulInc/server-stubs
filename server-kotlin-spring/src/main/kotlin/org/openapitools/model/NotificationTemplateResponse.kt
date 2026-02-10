package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ApplicationMiniResponse
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
 * @param notificationTemplateId 
 * @param event 
 * @param conduit 
 * @param title 
 * @param body 
 * @param publicBody 
 * @param application 
 * @param updated 
 * @param created 
 * @param tags 
 */
data class NotificationTemplateResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("notificationTemplateId") val notificationTemplateId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("event") val event: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conduit") val conduit: NotificationTemplateResponse.Conduit? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("body") val body: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicBody") val publicBody: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationMiniResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tags") val tags: kotlin.String? = null
) {

    /**
    * 
    * Values: HTTP,SAVE,EMAIL,SMS,APNS,GCM,PUSH,MOBILE_NOTIFICATION
    */
    enum class Conduit(@get:JsonValue val value: kotlin.String) {

        HTTP("HTTP"),
        SAVE("SAVE"),
        EMAIL("EMAIL"),
        SMS("SMS"),
        APNS("APNS"),
        GCM("GCM"),
        PUSH("PUSH"),
        MOBILE_NOTIFICATION("MOBILE_NOTIFICATION");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Conduit {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'NotificationTemplateResponse'")
            }
        }
    }

}

