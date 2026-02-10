package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountProfileInfo
import org.openapitools.model.Address
import org.openapitools.model.Asset
import org.openapitools.model.CellCarrier
import org.openapitools.model.Region
import org.openapitools.model.RetailerLocation
import org.openapitools.model.ThirdPartyCredentials
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
 * @param created 
 * @param updated 
 * @param active 
 * @param valid 
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param currentRegion 
 * @param locationLastUpdated 
 * @param currentPostalCode 
 * @param currentPostalCodeLatitude 
 * @param currentPostalCodeLongitude 
 * @param locationUpdated 
 * @param premigrationId 
 * @param username 
 * @param locale 
 * @param inviteCode 
 * @param retailerInviteCode 
 * @param aboutUs 
 * @param businessName 
 * @param likeCount 
 * @param dislikeCount 
 * @param thirdPartyCredentials 
 * @param partnerActive 
 * @param resetToken 
 * @param profileImage 
 * @param accountType 
 * @param media 
 * @param picture 
 * @param firstName 
 * @param middleName 
 * @param lastName 
 * @param prefix 
 * @param suffix 
 * @param title 
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
 * @param display 
 * @param website 
 * @param consumersNotes 
 * @param consumersAboutUs 
 * @param accountProfile 
 * @param retailerLocations 
 * @param executive 
 * @param contentName 
 * @param defaultThreshold 
 * @param audienceInfoGender 
 * @param flagThresholdId 
 * @param contentType 
 */
data class Account(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: java.time.OffsetDateTime? = null,

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currentRegion") val currentRegion: Region? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationLastUpdated") val locationLastUpdated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentPostalCode") val currentPostalCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentPostalCodeLatitude") val currentPostalCodeLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentPostalCodeLongitude") val currentPostalCodeLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationUpdated") val locationUpdated: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("premigrationId") val premigrationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locale") val locale: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteCode") val inviteCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerInviteCode") val retailerInviteCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("aboutUs") val aboutUs: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("businessName") val businessName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("thirdPartyCredentials") val thirdPartyCredentials: kotlin.collections.List<ThirdPartyCredentials>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partnerActive") val partnerActive: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("resetToken") val resetToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImage") val profileImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountType") val accountType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media") val media: kotlin.collections.List<Asset>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture") val picture: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("firstName") val firstName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("middleName") val middleName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastName") val lastName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("prefix") val prefix: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suffix") val suffix: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

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
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("website") val website: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("consumersNotes") val consumersNotes: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("consumersAboutUs") val consumersAboutUs: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("accountProfile") val accountProfile: AccountProfileInfo? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocations") val retailerLocations: kotlin.collections.List<RetailerLocation>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("executive") val executive: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultThreshold") val defaultThreshold: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("audienceInfo_gender") val audienceInfoGender: Account.AudienceInfoGender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold_id") val flagThresholdId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null
) {

    /**
    * 
    * Values: MALE,FEMALE,ANY
    */
    enum class AudienceInfoGender(@get:JsonValue val value: kotlin.String) {

        MALE("MALE"),
        FEMALE("FEMALE"),
        ANY("ANY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AudienceInfoGender {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Account'")
            }
        }
    }

}

