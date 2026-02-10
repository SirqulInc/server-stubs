package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Asset
import org.openapitools.model.BillableEntity
import org.openapitools.model.BlobFile
import org.openapitools.model.Category
import org.openapitools.model.Placement
import org.openapitools.model.Platform
import org.openapitools.model.Retailer
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
 * @param id 
 * @param active 
 * @param valid 
 * @param title 
 * @param about 
 * @param certificateUrl 
 * @param certificateName 
 * @param certificate 
 * @param certificateLastUpdated 
 * @param appDescription 
 * @param showInActivities 
 * @param cssClass 
 * @param inviteWelcomeText 
 * @param bundleId 
 * @param appType 
 * @param scoringType 
 * @param appKey 
 * @param appRestKey 
 * @param appTokenKey 
 * @param hintCost 
 * @param eulaDate 
 * @param eulaVersion 
 * @param landingPageUrl 
 * @param invitePageUrl 
 * @param downloadUrls 
 * @param appName 
 * @param appIcon 
 * @param appLogo 
 * @param billableEntity 
 * @param facebookAppId 
 * @param facebookAppSecret 
 * @param twitterAppId 
 * @param twitterAppSecret 
 * @param twitterCallbackURL 
 * @param defaultImage 
 * @param modules 
 * @param authorizedServers 
 * @param authorizedCount 
 * @param activeServers 
 * @param licensePeriod 
 * @param hasGameData 
 * @param currentBuildVersion 
 * @param currentApiVersion 
 * @param globalTickets 
 * @param ticketsPerPoint 
 * @param maxPointsPerScore 
 * @param useAppCache 
 * @param uniqueUserTag 
 * @param useMatchingAlgorithm 
 * @param platforms 
 * @param categories 
 * @param placements 
 * @param hasAdvertisements 
 * @param appleAppId 
 * @param googleAppId 
 * @param googleApiKey 
 * @param googleOAuthClientId 
 * @param googleOAuthSecret 
 * @param googleOAuthAccessToken 
 * @param googleOAuthRefreshToken 
 * @param baiduApiKey 
 * @param baiduSecretKey 
 * @param jpushAppKey 
 * @param jpushMasterSecret 
 * @param xgPushSecretKey 
 * @param publicNotifications 
 * @param urlScheme 
 * @param retailer 
 * @param objectStoreSession 
 * @param publicContentApproval 
 * @param productionMode 
 * @param griplyBaseUrl 
 * @param minimumSessionLength 
 * @param sessionGapLength 
 * @param processSessionData 
 * @param localAdsEnabled 
 * @param includeInReport 
 * @param sqootApiKey 
 * @param amqpEnabled 
 * @param trilatSettings 
 */
data class Application(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("certificateUrl") val certificateUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("certificateName") val certificateName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("certificate") val certificate: BlobFile? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("certificateLastUpdated") val certificateLastUpdated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appDescription") val appDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showInActivities") val showInActivities: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cssClass") val cssClass: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteWelcomeText") val inviteWelcomeText: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bundleId") val bundleId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appType") val appType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoringType") val scoringType: Application.ScoringType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appRestKey") val appRestKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appTokenKey") val appTokenKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hintCost") val hintCost: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("eulaDate") val eulaDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("eulaVersion") val eulaVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("landingPageUrl") val landingPageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("invitePageUrl") val invitePageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloadUrls") val downloadUrls: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("appIcon") val appIcon: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("appLogo") val appLogo: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntity? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("facebookAppId") val facebookAppId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("facebookAppSecret") val facebookAppSecret: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("twitterAppId") val twitterAppId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("twitterAppSecret") val twitterAppSecret: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("twitterCallbackURL") val twitterCallbackURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultImage") val defaultImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("modules") val modules: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorizedServers") val authorizedServers: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorizedCount") val authorizedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("activeServers") val activeServers: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("licensePeriod") val licensePeriod: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasGameData") val hasGameData: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentBuildVersion") val currentBuildVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentApiVersion") val currentApiVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("globalTickets") val globalTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsPerPoint") val ticketsPerPoint: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxPointsPerScore") val maxPointsPerScore: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("useAppCache") val useAppCache: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("uniqueUserTag") val uniqueUserTag: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("useMatchingAlgorithm") val useMatchingAlgorithm: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("platforms") val platforms: kotlin.collections.List<Platform>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placements") val placements: kotlin.collections.List<Placement>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasAdvertisements") val hasAdvertisements: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appleAppId") val appleAppId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleAppId") val googleAppId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleApiKey") val googleApiKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleOAuthClientId") val googleOAuthClientId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleOAuthSecret") val googleOAuthSecret: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleOAuthAccessToken") val googleOAuthAccessToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googleOAuthRefreshToken") val googleOAuthRefreshToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("baiduApiKey") val baiduApiKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("baiduSecretKey") val baiduSecretKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("jpushAppKey") val jpushAppKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("jpushMasterSecret") val jpushMasterSecret: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("xgPushSecretKey") val xgPushSecretKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicNotifications") val publicNotifications: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("urlScheme") val urlScheme: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailer") val retailer: Retailer? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("objectStoreSession") val objectStoreSession: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publicContentApproval") val publicContentApproval: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("productionMode") val productionMode: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("griplyBaseUrl") val griplyBaseUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumSessionLength") val minimumSessionLength: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sessionGapLength") val sessionGapLength: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("processSessionData") val processSessionData: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("localAdsEnabled") val localAdsEnabled: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("includeInReport") val includeInReport: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootApiKey") val sqootApiKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amqpEnabled") val amqpEnabled: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("trilatSettings") val trilatSettings: TrilatAppSettings? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Application'")
            }
        }
    }

}

