package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.BillableEntityShortResponse
import org.openapitools.model.CategoryResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.PlatformResponse
import org.openapitools.model.TrilatAppSettings
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
 * @param valid 
 * @param message 
 * @param version 
 * @param serializeNulls 
 * @param startTimeLog 
 * @param errorCode 
 * @param request 
 * @param applicationId 
 * @param appKey 
 * @param title 
 * @param currentBuildVersion 
 * @param currentApiVersion 
 * @param appIcon 
 * @param appLogo 
 * @param active 
 * @param about 
 * @param landingPageUrl 
 * @param landingPageFullUrl 
 * @param defaultImageFullUrl 
 * @param activityDescription 
 * @param platforms 
 * @param categories 
 * @param placementCount 
 * @param billable 
 * @param hasAds 
 * @param publicNotifications 
 * @param urlScheme 
 * @param global 
 * @param downloadUrls 
 * @param localAdsEnabled 
 * @param trilatSettings 
 * @param appType 
 * @param appName 
 * @param bundleId 
 * @param scoringType 
 * @param hintCost 
 * @param maxScore 
 * @param ticketsPerPoint 
 * @param hasGameData 
 * @param globalTickets 
 * @param eulaVersion 
 * @param eulaDateUpdated 
 * @param modules 
 * @param billableEntityName 
 * @param showInActivities 
 * @param cssClass 
 * @param inviteWelcomeText 
 * @param invitePageUrl 
 * @param apnsCertificateFileName 
 * @param facebookAppId 
 * @param facebookAppSecret 
 * @param appToken 
 * @param googleApiKey 
 * @param appRestKey 
 * @param publicContentApproval 
 * @param productionMode 
 * @param minimumSessionLength 
 * @param sessionGapLength 
 * @param sqootApiKey 
 * @param amqpEnabled 
 * @param authorizedCount 
 * @param authorizedServers 
 * @param returning 
 */
data class ApplicationResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serializeNulls") val serializeNulls: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTimeLog") val startTimeLog: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request") val request: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationId") val applicationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentBuildVersion") val currentBuildVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentApiVersion") val currentApiVersion: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("appIcon") val appIcon: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("appLogo") val appLogo: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("landingPageUrl") val landingPageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("landingPageFullUrl") val landingPageFullUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultImageFullUrl") val defaultImageFullUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("activityDescription") val activityDescription: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("platforms") val platforms: kotlin.collections.List<PlatformResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<CategoryResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("placementCount") val placementCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billable") val billable: BillableEntityShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasAds") val hasAds: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicNotifications") val publicNotifications: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("urlScheme") val urlScheme: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("global") val global: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloadUrls") val downloadUrls: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("localAdsEnabled") val localAdsEnabled: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("trilatSettings") val trilatSettings: TrilatAppSettings? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appType") val appType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bundleId") val bundleId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoringType") val scoringType: ApplicationResponse.ScoringType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hintCost") val hintCost: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxScore") val maxScore: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsPerPoint") val ticketsPerPoint: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasGameData") val hasGameData: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("globalTickets") val globalTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("eulaVersion") val eulaVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("eulaDateUpdated") val eulaDateUpdated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("modules") val modules: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntityName") val billableEntityName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showInActivities") val showInActivities: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cssClass") val cssClass: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteWelcomeText") val inviteWelcomeText: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("invitePageUrl") val invitePageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("apnsCertificateFileName") val apnsCertificateFileName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("facebookAppId") val facebookAppId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("facebookAppSecret") val facebookAppSecret: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appToken") val appToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleApiKey") val googleApiKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appRestKey") val appRestKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicContentApproval") val publicContentApproval: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("productionMode") val productionMode: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumSessionLength") val minimumSessionLength: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sessionGapLength") val sessionGapLength: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootApiKey") val sqootApiKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amqpEnabled") val amqpEnabled: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorizedCount") val authorizedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorizedServers") val authorizedServers: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: GAME_LEVEL,GAME_OBJECT
    */
    enum class ScoringType(@get:JsonValue val value: kotlin.String) {

        GAME_LEVEL("GAME_LEVEL"),
        GAME_OBJECT("GAME_OBJECT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ScoringType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ApplicationResponse'")
            }
        }
    }

}

