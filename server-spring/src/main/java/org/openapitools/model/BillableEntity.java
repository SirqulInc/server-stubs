package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Album;
import org.openapitools.model.Asset;
import org.openapitools.model.Category;
import org.openapitools.model.ContactInfo;
import org.openapitools.model.Filter;
import org.openapitools.model.Retailer;
import org.openapitools.model.Subscription;
import org.openapitools.model.ThirdPartyNetwork;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillableEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableEntity {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable ContactInfo contactInfo;

  private @Nullable Account responsible;

  @Valid
  private List<@Valid Retailer> retailers = new ArrayList<>();

  @Valid
  private List<@Valid Account> managers = new ArrayList<>();

  @Valid
  private List<@Valid Category> categories = new ArrayList<>();

  @Valid
  private List<@Valid Filter> filters = new ArrayList<>();

  @Valid
  private List<@Valid Asset> media = new ArrayList<>();

  private @Nullable Album mediaAlbum;

  private @Nullable Subscription subscription;

  private @Nullable ThirdPartyNetwork disbursementIntrospect;

  private @Nullable String authorizeNetTransactionKey;

  private @Nullable String authorizeNetApiKey;

  public BillableEntity id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public BillableEntity active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public BillableEntity valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public BillableEntity name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BillableEntity contactInfo(@Nullable ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  /**
   * Get contactInfo
   * @return contactInfo
   */
  @Valid 
  @Schema(name = "contactInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactInfo")
  public @Nullable ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(@Nullable ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public BillableEntity responsible(@Nullable Account responsible) {
    this.responsible = responsible;
    return this;
  }

  /**
   * Get responsible
   * @return responsible
   */
  @Valid 
  @Schema(name = "responsible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsible")
  public @Nullable Account getResponsible() {
    return responsible;
  }

  public void setResponsible(@Nullable Account responsible) {
    this.responsible = responsible;
  }

  public BillableEntity retailers(List<@Valid Retailer> retailers) {
    this.retailers = retailers;
    return this;
  }

  public BillableEntity addRetailersItem(Retailer retailersItem) {
    if (this.retailers == null) {
      this.retailers = new ArrayList<>();
    }
    this.retailers.add(retailersItem);
    return this;
  }

  /**
   * Get retailers
   * @return retailers
   */
  @Valid 
  @Schema(name = "retailers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailers")
  public List<@Valid Retailer> getRetailers() {
    return retailers;
  }

  public void setRetailers(List<@Valid Retailer> retailers) {
    this.retailers = retailers;
  }

  public BillableEntity managers(List<@Valid Account> managers) {
    this.managers = managers;
    return this;
  }

  public BillableEntity addManagersItem(Account managersItem) {
    if (this.managers == null) {
      this.managers = new ArrayList<>();
    }
    this.managers.add(managersItem);
    return this;
  }

  /**
   * Get managers
   * @return managers
   */
  @Valid 
  @Schema(name = "managers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("managers")
  public List<@Valid Account> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid Account> managers) {
    this.managers = managers;
  }

  public BillableEntity categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public BillableEntity addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public BillableEntity filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public BillableEntity addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public BillableEntity media(List<@Valid Asset> media) {
    this.media = media;
    return this;
  }

  public BillableEntity addMediaItem(Asset mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public List<@Valid Asset> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  public BillableEntity mediaAlbum(@Nullable Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
    return this;
  }

  /**
   * Get mediaAlbum
   * @return mediaAlbum
   */
  @Valid 
  @Schema(name = "mediaAlbum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaAlbum")
  public @Nullable Album getMediaAlbum() {
    return mediaAlbum;
  }

  public void setMediaAlbum(@Nullable Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
  }

  public BillableEntity subscription(@Nullable Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   */
  @Valid 
  @Schema(name = "subscription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscription")
  public @Nullable Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(@Nullable Subscription subscription) {
    this.subscription = subscription;
  }

  public BillableEntity disbursementIntrospect(@Nullable ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
    return this;
  }

  /**
   * Get disbursementIntrospect
   * @return disbursementIntrospect
   */
  @Valid 
  @Schema(name = "disbursementIntrospect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disbursementIntrospect")
  public @Nullable ThirdPartyNetwork getDisbursementIntrospect() {
    return disbursementIntrospect;
  }

  public void setDisbursementIntrospect(@Nullable ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
  }

  public BillableEntity authorizeNetTransactionKey(@Nullable String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
    return this;
  }

  /**
   * Get authorizeNetTransactionKey
   * @return authorizeNetTransactionKey
   */
  
  @Schema(name = "authorizeNetTransactionKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizeNetTransactionKey")
  public @Nullable String getAuthorizeNetTransactionKey() {
    return authorizeNetTransactionKey;
  }

  public void setAuthorizeNetTransactionKey(@Nullable String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
  }

  public BillableEntity authorizeNetApiKey(@Nullable String authorizeNetApiKey) {
    this.authorizeNetApiKey = authorizeNetApiKey;
    return this;
  }

  /**
   * Get authorizeNetApiKey
   * @return authorizeNetApiKey
   */
  
  @Schema(name = "authorizeNetApiKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizeNetApiKey")
  public @Nullable String getAuthorizeNetApiKey() {
    return authorizeNetApiKey;
  }

  public void setAuthorizeNetApiKey(@Nullable String authorizeNetApiKey) {
    this.authorizeNetApiKey = authorizeNetApiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableEntity billableEntity = (BillableEntity) o;
    return Objects.equals(this.id, billableEntity.id) &&
        Objects.equals(this.active, billableEntity.active) &&
        Objects.equals(this.valid, billableEntity.valid) &&
        Objects.equals(this.name, billableEntity.name) &&
        Objects.equals(this.contactInfo, billableEntity.contactInfo) &&
        Objects.equals(this.responsible, billableEntity.responsible) &&
        Objects.equals(this.retailers, billableEntity.retailers) &&
        Objects.equals(this.managers, billableEntity.managers) &&
        Objects.equals(this.categories, billableEntity.categories) &&
        Objects.equals(this.filters, billableEntity.filters) &&
        Objects.equals(this.media, billableEntity.media) &&
        Objects.equals(this.mediaAlbum, billableEntity.mediaAlbum) &&
        Objects.equals(this.subscription, billableEntity.subscription) &&
        Objects.equals(this.disbursementIntrospect, billableEntity.disbursementIntrospect) &&
        Objects.equals(this.authorizeNetTransactionKey, billableEntity.authorizeNetTransactionKey) &&
        Objects.equals(this.authorizeNetApiKey, billableEntity.authorizeNetApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, contactInfo, responsible, retailers, managers, categories, filters, media, mediaAlbum, subscription, disbursementIntrospect, authorizeNetTransactionKey, authorizeNetApiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    retailers: ").append(toIndentedString(retailers)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaAlbum: ").append(toIndentedString(mediaAlbum)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    disbursementIntrospect: ").append(toIndentedString(disbursementIntrospect)).append("\n");
    sb.append("    authorizeNetTransactionKey: ").append(toIndentedString(authorizeNetTransactionKey)).append("\n");
    sb.append("    authorizeNetApiKey: ").append(toIndentedString(authorizeNetApiKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

