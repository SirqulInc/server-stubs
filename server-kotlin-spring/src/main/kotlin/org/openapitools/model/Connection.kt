package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.ConnectedFriend
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
 * @param deleted 
 * @param objectType 
 * @param legacyId 
 * @param searchTags 
 * @param active 
 * @param valid 
 * @param account 
 * @param connection 
 * @param pendingConnection 
 * @param friend 
 * @param friendRequested 
 * @param friendRequestPending 
 * @param following 
 * @param follower 
 * @param trusted 
 * @param blocked 
 * @param friendRequestDate 
 * @param friendResponseDate 
 * @param display 
 * @param connectionViewedDate 
 * @param connectionType 
 * @param title 
 * @param pendingConnectionId 
 * @param latitude 
 * @param longitude 
 */
data class Connection(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deleted") val deleted: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("objectType") val objectType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("legacyId") val legacyId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("searchTags") val searchTags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connection") val connection: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pendingConnection") val pendingConnection: ConnectedFriend? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friend") val friend: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequested") val friendRequested: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequestPending") val friendRequestPending: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("following") val following: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("follower") val follower: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("trusted") val trusted: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendRequestDate") val friendRequestDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendResponseDate") val friendResponseDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionViewedDate") val connectionViewedDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionType") val connectionType: Connection.ConnectionType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pendingConnection_id") val pendingConnectionId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null
) {

    /**
    * 
    * Values: PRIMARY,SECONDARY,DEPENDENT,ACQUAINTANCE
    */
    enum class ConnectionType(@get:JsonValue val value: kotlin.String) {

        PRIMARY("PRIMARY"),
        SECONDARY("SECONDARY"),
        DEPENDENT("DEPENDENT"),
        ACQUAINTANCE("ACQUAINTANCE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ConnectionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Connection'")
            }
        }
    }

}

