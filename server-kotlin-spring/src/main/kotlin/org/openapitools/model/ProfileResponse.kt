package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AppInfoResponse
import org.openapitools.model.ConnectionInfoResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.ProfileInfoResponse
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
 * @param loginAccountId 
 * @param validated 
 * @param appInfo 
 * @param canViewAppInfo 
 * @param canViewFriendInfo 
 * @param canViewProfileInfo 
 * @param flagCount 
 * @param friendInfo 
 * @param isBlocked 
 * @param isProfileOwner 
 * @param metFlagThreshold 
 * @param profileInfo 
 * @param trusted 
 * @param following 
 * @param friendRequested 
 * @param friendRequestPending 
 * @param blocked 
 * @param flagged 
 * @param profileOwner 
 * @param friend 
 * @param returning 
 */
data class ProfileResponse(

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
    @get:JsonProperty("loginAccountId") val loginAccountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("validated") val validated: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("appInfo") val appInfo: AppInfoResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("canViewAppInfo") val canViewAppInfo: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("canViewFriendInfo") val canViewFriendInfo: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("canViewProfileInfo") val canViewProfileInfo: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("friendInfo") val friendInfo: ConnectionInfoResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isBlocked") val isBlocked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isProfileOwner") val isProfileOwner: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metFlagThreshold") val metFlagThreshold: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profileInfo") val profileInfo: ProfileInfoResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("trusted") val trusted: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("following") val following: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequested") val friendRequested: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequestPending") val friendRequestPending: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagged") val flagged: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileOwner") val profileOwner: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friend") val friend: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

