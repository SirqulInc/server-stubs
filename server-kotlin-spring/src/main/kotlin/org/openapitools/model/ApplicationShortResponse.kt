package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param returning 
 */
data class ApplicationShortResponse(

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
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

