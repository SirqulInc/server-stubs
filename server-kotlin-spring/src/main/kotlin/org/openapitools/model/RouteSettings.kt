package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Program
import org.openapitools.model.ServiceHub
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
 * @param active 
 * @param valid 
 * @param name 
 * @param description 
 * @param setting 
 * @param settingType 
 * @param program 
 * @param hub 
 */
data class RouteSettings(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("setting") val setting: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("settingType") val settingType: RouteSettings.SettingType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("program") val program: Program? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null
) {

    /**
    * 
    * Values: FLOAT,DOUBLE,INTEGER,LONG,BOOLEAN,STRING
    */
    enum class SettingType(@get:JsonValue val value: kotlin.String) {

        FLOAT("FLOAT"),
        DOUBLE("DOUBLE"),
        INTEGER("INTEGER"),
        LONG("LONG"),
        BOOLEAN("BOOLEAN"),
        STRING("STRING");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SettingType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RouteSettings'")
            }
        }
    }

}

