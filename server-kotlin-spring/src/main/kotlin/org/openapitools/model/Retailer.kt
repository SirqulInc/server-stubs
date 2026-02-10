package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Address
import org.openapitools.model.Category
import org.openapitools.model.CellCarrier
import org.openapitools.model.Note
import org.openapitools.model.RetailerLocation
import org.openapitools.model.Territory
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
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param name 
 * @param responsible 
 * @param manager 
 * @param detailsHeader 
 * @param detailsBody 
 * @param detailsLineLeft1 
 * @param detailsLineLeft2 
 * @param detailsLineRight1 
 * @param metaDescription 
 * @param directions 
 * @param hours 
 * @param homePhone 
 * @param cellPhone 
 * @param cellCarrier 
 * @param businessPhone 
 * @param businessPhoneExt 
 * @param faxNumber 
 * @param timeZone 
 * @param utcOffset 
 * @param code501c3 
 * @param emailAddress 
 * @param address 
 * @param web 
 * @param featured 
 * @param listed 
 * @param categories 
 * @param territory 
 * @param locations 
 * @param yipitId 
 * @param facebookUrl 
 * @param twitterUrl 
 * @param visibility 
 * @param notes 
 * @param noteCount 
 * @param appKey 
 * @param categoryTree 
 * @param filterTree 
 * @param billableId 
 * @param subType 
 * @param contentName 
 * @param owner 
 */
data class Retailer(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("responsible") val responsible: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("manager") val manager: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsHeader") val detailsHeader: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsBody") val detailsBody: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsLineLeft1") val detailsLineLeft1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsLineLeft2") val detailsLineLeft2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsLineRight1") val detailsLineRight1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaDescription") val metaDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("directions") val directions: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hours") val hours: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("homePhone") val homePhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cellPhone") val cellPhone: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("cellCarrier") val cellCarrier: CellCarrier? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessPhone") val businessPhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessPhoneExt") val businessPhoneExt: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("faxNumber") val faxNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeZone") val timeZone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("utcOffset") val utcOffset: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("code501c3") val code501c3: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("emailAddress") val emailAddress: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: Address? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("web") val web: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("featured") val featured: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("listed") val listed: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("territory") val territory: Territory? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locations") val locations: kotlin.collections.List<RetailerLocation>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("yipitId") val yipitId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("facebookUrl") val facebookUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("twitterUrl") val twitterUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: Retailer.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("categoryTree") val categoryTree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("filterTree") val filterTree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableId") val billableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subType") val subType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null
) {

    /**
    * 
    * Values: PUBLIC,PRIVATE,FRIENDS
    */
    enum class Visibility(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        PRIVATE("PRIVATE"),
        FRIENDS("FRIENDS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Visibility {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Retailer'")
            }
        }
    }

}

