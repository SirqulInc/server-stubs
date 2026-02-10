package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillableEntity  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private ContactInfo contactInfo;

  @ApiModelProperty(value = "")

  @Valid

  private Account responsible;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Retailer> retailers = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Account> managers = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Filter> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Asset> media = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Album mediaAlbum;

  @ApiModelProperty(value = "")

  @Valid

  private Subscription subscription;

  @ApiModelProperty(value = "")

  @Valid

  private ThirdPartyNetwork disbursementIntrospect;

  @ApiModelProperty(value = "")

  private String authorizeNetTransactionKey;

  @ApiModelProperty(value = "")

  private String authorizeNetApiKey;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BillableEntity id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BillableEntity active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public BillableEntity valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillableEntity name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get contactInfo
   * @return contactInfo
  **/
  @JsonProperty("contactInfo")
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public BillableEntity contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

 /**
   * Get responsible
   * @return responsible
  **/
  @JsonProperty("responsible")
  public Account getResponsible() {
    return responsible;
  }

  public void setResponsible(Account responsible) {
    this.responsible = responsible;
  }

  public BillableEntity responsible(Account responsible) {
    this.responsible = responsible;
    return this;
  }

 /**
   * Get retailers
   * @return retailers
  **/
  @JsonProperty("retailers")
  public List<@Valid Retailer> getRetailers() {
    return retailers;
  }

  public void setRetailers(List<@Valid Retailer> retailers) {
    this.retailers = retailers;
  }

  public BillableEntity retailers(List<@Valid Retailer> retailers) {
    this.retailers = retailers;
    return this;
  }

  public BillableEntity addRetailersItem(Retailer retailersItem) {
    this.retailers.add(retailersItem);
    return this;
  }

 /**
   * Get managers
   * @return managers
  **/
  @JsonProperty("managers")
  public List<@Valid Account> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid Account> managers) {
    this.managers = managers;
  }

  public BillableEntity managers(List<@Valid Account> managers) {
    this.managers = managers;
    return this;
  }

  public BillableEntity addManagersItem(Account managersItem) {
    this.managers.add(managersItem);
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public BillableEntity categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public BillableEntity addCategoriesItem(Category categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public BillableEntity filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public BillableEntity addFiltersItem(Filter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public List<@Valid Asset> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  public BillableEntity media(List<@Valid Asset> media) {
    this.media = media;
    return this;
  }

  public BillableEntity addMediaItem(Asset mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

 /**
   * Get mediaAlbum
   * @return mediaAlbum
  **/
  @JsonProperty("mediaAlbum")
  public Album getMediaAlbum() {
    return mediaAlbum;
  }

  public void setMediaAlbum(Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
  }

  public BillableEntity mediaAlbum(Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
    return this;
  }

 /**
   * Get subscription
   * @return subscription
  **/
  @JsonProperty("subscription")
  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public BillableEntity subscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

 /**
   * Get disbursementIntrospect
   * @return disbursementIntrospect
  **/
  @JsonProperty("disbursementIntrospect")
  public ThirdPartyNetwork getDisbursementIntrospect() {
    return disbursementIntrospect;
  }

  public void setDisbursementIntrospect(ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
  }

  public BillableEntity disbursementIntrospect(ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
    return this;
  }

 /**
   * Get authorizeNetTransactionKey
   * @return authorizeNetTransactionKey
  **/
  @JsonProperty("authorizeNetTransactionKey")
  public String getAuthorizeNetTransactionKey() {
    return authorizeNetTransactionKey;
  }

  public void setAuthorizeNetTransactionKey(String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
  }

  public BillableEntity authorizeNetTransactionKey(String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
    return this;
  }

 /**
   * Get authorizeNetApiKey
   * @return authorizeNetApiKey
  **/
  @JsonProperty("authorizeNetApiKey")
  public String getAuthorizeNetApiKey() {
    return authorizeNetApiKey;
  }

  public void setAuthorizeNetApiKey(String authorizeNetApiKey) {
    this.authorizeNetApiKey = authorizeNetApiKey;
  }

  public BillableEntity authorizeNetApiKey(String authorizeNetApiKey) {
    this.authorizeNetApiKey = authorizeNetApiKey;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

