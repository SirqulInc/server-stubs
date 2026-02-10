package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssignmentStatusResponse
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
 * @param assignmentId 
 * @param name 
 * @param description 
 * @param active 
 * @param created 
 * @param updated 
 * @param assignee 
 * @param creator 
 * @param lastReportedBy 
 * @param location 
 * @param currentStatus 
 * @param currentStatusType 
 */
data class AssignmentResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("assignmentId") val assignmentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assignee") val assignee: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creator") val creator: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("lastReportedBy") val lastReportedBy: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("location") val location: RetailerLocationShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currentStatus") val currentStatus: AssignmentStatusResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentStatusType") val currentStatusType: AssignmentResponse.CurrentStatusType? = null
) {

    /**
    * 
    * Values: NEW,IN_PROGRESS,SUBSCRIBED,ARCHIVED
    */
    enum class CurrentStatusType(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        IN_PROGRESS("IN_PROGRESS"),
        SUBSCRIBED("SUBSCRIBED"),
        ARCHIVED("ARCHIVED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CurrentStatusType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssignmentResponse'")
            }
        }
    }

}

