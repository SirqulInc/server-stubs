package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Album
import org.openapitools.model.Asset
import org.openapitools.model.Category
import org.openapitools.model.ContactInfo
import org.openapitools.model.Filter
import org.openapitools.model.Retailer
import org.openapitools.model.Subscription
import org.openapitools.model.ThirdPartyNetwork
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
 * @param contactInfo 
 * @param responsible 
 * @param retailers 
 * @param managers 
 * @param categories 
 * @param filters 
 * @param media 
 * @param mediaAlbum 
 * @param subscription 
 * @param disbursementIntrospect 
 * @param authorizeNetTransactionKey 
 * @param authorizeNetApiKey 
 */
data class BillableEntity(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contactInfo") val contactInfo: ContactInfo? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("responsible") val responsible: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailers") val retailers: kotlin.collections.List<Retailer>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("managers") val managers: kotlin.collections.List<Account>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: kotlin.collections.List<Filter>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media") val media: kotlin.collections.List<Asset>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("mediaAlbum") val mediaAlbum: Album? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("subscription") val subscription: Subscription? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("disbursementIntrospect") val disbursementIntrospect: ThirdPartyNetwork? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorizeNetTransactionKey") val authorizeNetTransactionKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorizeNetApiKey") val authorizeNetApiKey: kotlin.String? = null
) {

}

