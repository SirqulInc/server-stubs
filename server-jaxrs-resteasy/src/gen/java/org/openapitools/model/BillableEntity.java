package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableEntity   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private ContactInfo contactInfo;
  private Account responsible;
  private List<@Valid Retailer> retailers = new ArrayList<>();
  private List<@Valid Account> managers = new ArrayList<>();
  private List<@Valid Category> categories = new ArrayList<>();
  private List<@Valid Filter> filters = new ArrayList<>();
  private List<@Valid Asset> media = new ArrayList<>();
  private Album mediaAlbum;
  private Subscription subscription;
  private ThirdPartyNetwork disbursementIntrospect;
  private String authorizeNetTransactionKey;
  private String authorizeNetApiKey;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contactInfo")
  @Valid
  public ContactInfo getContactInfo() {
    return contactInfo;
  }
  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responsible")
  @Valid
  public Account getResponsible() {
    return responsible;
  }
  public void setResponsible(Account responsible) {
    this.responsible = responsible;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailers")
  @Valid
  public List<@Valid Retailer> getRetailers() {
    return retailers;
  }
  public void setRetailers(List<@Valid Retailer> retailers) {
    this.retailers = retailers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("managers")
  @Valid
  public List<@Valid Account> getManagers() {
    return managers;
  }
  public void setManagers(List<@Valid Account> managers) {
    this.managers = managers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid Category> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid
  public List<@Valid Filter> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  @Valid
  public List<@Valid Asset> getMedia() {
    return media;
  }
  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mediaAlbum")
  @Valid
  public Album getMediaAlbum() {
    return mediaAlbum;
  }
  public void setMediaAlbum(Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subscription")
  @Valid
  public Subscription getSubscription() {
    return subscription;
  }
  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disbursementIntrospect")
  @Valid
  public ThirdPartyNetwork getDisbursementIntrospect() {
    return disbursementIntrospect;
  }
  public void setDisbursementIntrospect(ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizeNetTransactionKey")
  public String getAuthorizeNetTransactionKey() {
    return authorizeNetTransactionKey;
  }
  public void setAuthorizeNetTransactionKey(String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizeNetApiKey")
  public String getAuthorizeNetApiKey() {
    return authorizeNetApiKey;
  }
  public void setAuthorizeNetApiKey(String authorizeNetApiKey) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

