package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BiometricImage
import org.openapitools.model.FingerprintBiometricImage
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
 * @param face 
 * @param fingerprints 
 */
data class BiometricRequest(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("face") val face: BiometricImage? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("fingerprints") val fingerprints: kotlin.collections.List<FingerprintBiometricImage>? = null
) {

}

