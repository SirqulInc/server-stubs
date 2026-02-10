package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TrilatCacheSample
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
 * @param udid 
 * @param sourceTime 
 * @param minimumSampleSize 
 * @param samples 
 */
data class TrilatCacheRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("udid") val udid: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sourceTime") val sourceTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumSampleSize") val minimumSampleSize: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("samples") val samples: kotlin.collections.List<TrilatCacheSample>? = null
) {

}

