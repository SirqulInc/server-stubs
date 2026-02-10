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
 * @param ruleId 
 * @param title 
 * @param description 
 * @param ruleTypeId 
 * @param ruleTypeTitle 
 * @param ruleTypeDescription 
 * @param ruleValueType 
 * @param ruleValue 
 */
data class RuleResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("ruleId") val ruleId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ruleTypeId") val ruleTypeId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ruleTypeTitle") val ruleTypeTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ruleTypeDescription") val ruleTypeDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ruleValueType") val ruleValueType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ruleValue") val ruleValue: kotlin.String? = null
) {

}

