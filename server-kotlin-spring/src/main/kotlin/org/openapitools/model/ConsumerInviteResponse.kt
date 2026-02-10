package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AlbumResponse
import org.openapitools.model.ApplicationShortResponse
import org.openapitools.model.ConnectionResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.OfferShortResponse
import org.openapitools.model.RetailerLocationResponse
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
 * @param inviterId 
 * @param inviter 
 * @param connection 
 * @param inviteText 
 * @param token 
 * @param albumCoverUrl 
 * @param albumTitle 
 * @param appName 
 * @param welcomeText 
 * @param application 
 * @param retailerLocation 
 * @param offer 
 * @param album 
 * @param returning 
 */
data class ConsumerInviteResponse(

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
    @get:JsonProperty("inviterId") val inviterId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("inviter") val inviter: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connection") val connection: ConnectionResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteText") val inviteText: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("token") val token: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("albumCoverUrl") val albumCoverUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("albumTitle") val albumTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("welcomeText") val welcomeText: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocation") val retailerLocation: RetailerLocationResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offer") val offer: OfferShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("album") val album: AlbumResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

