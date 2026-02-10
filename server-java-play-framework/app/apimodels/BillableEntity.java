package apimodels;

import apimodels.Account;
import apimodels.Album;
import apimodels.Asset;
import apimodels.Category;
import apimodels.ContactInfo;
import apimodels.Filter;
import apimodels.Retailer;
import apimodels.Subscription;
import apimodels.ThirdPartyNetwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BillableEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BillableEntity   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("contactInfo")
  @Valid

  private ContactInfo contactInfo;

  @JsonProperty("responsible")
  @Valid

  private Account responsible;

  @JsonProperty("retailers")
  @Valid

  private List<@Valid Retailer> retailers = null;

  @JsonProperty("managers")
  @Valid

  private List<@Valid Account> managers = null;

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("filters")
  @Valid

  private List<@Valid Filter> filters = null;

  @JsonProperty("media")
  @Valid

  private List<@Valid Asset> media = null;

  @JsonProperty("mediaAlbum")
  @Valid

  private Album mediaAlbum;

  @JsonProperty("subscription")
  @Valid

  private Subscription subscription;

  @JsonProperty("disbursementIntrospect")
  @Valid

  private ThirdPartyNetwork disbursementIntrospect;

  @JsonProperty("authorizeNetTransactionKey")
  
  private String authorizeNetTransactionKey;

  @JsonProperty("authorizeNetApiKey")
  
  private String authorizeNetApiKey;

  public BillableEntity id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BillableEntity active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BillableEntity valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public BillableEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillableEntity contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public BillableEntity responsible(Account responsible) {
    this.responsible = responsible;
    return this;
  }

   /**
   * Get responsible
   * @return responsible
  **/
  public Account getResponsible() {
    return responsible;
  }

  public void setResponsible(Account responsible) {
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public List<@Valid Asset> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  public BillableEntity mediaAlbum(Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
    return this;
  }

   /**
   * Get mediaAlbum
   * @return mediaAlbum
  **/
  public Album getMediaAlbum() {
    return mediaAlbum;
  }

  public void setMediaAlbum(Album mediaAlbum) {
    this.mediaAlbum = mediaAlbum;
  }

  public BillableEntity subscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public BillableEntity disbursementIntrospect(ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
    return this;
  }

   /**
   * Get disbursementIntrospect
   * @return disbursementIntrospect
  **/
  public ThirdPartyNetwork getDisbursementIntrospect() {
    return disbursementIntrospect;
  }

  public void setDisbursementIntrospect(ThirdPartyNetwork disbursementIntrospect) {
    this.disbursementIntrospect = disbursementIntrospect;
  }

  public BillableEntity authorizeNetTransactionKey(String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
    return this;
  }

   /**
   * Get authorizeNetTransactionKey
   * @return authorizeNetTransactionKey
  **/
  public String getAuthorizeNetTransactionKey() {
    return authorizeNetTransactionKey;
  }

  public void setAuthorizeNetTransactionKey(String authorizeNetTransactionKey) {
    this.authorizeNetTransactionKey = authorizeNetTransactionKey;
  }

  public BillableEntity authorizeNetApiKey(String authorizeNetApiKey) {
    this.authorizeNetApiKey = authorizeNetApiKey;
    return this;
  }

   /**
   * Get authorizeNetApiKey
   * @return authorizeNetApiKey
  **/
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
    return Objects.equals(id, billableEntity.id) &&
        Objects.equals(active, billableEntity.active) &&
        Objects.equals(valid, billableEntity.valid) &&
        Objects.equals(name, billableEntity.name) &&
        Objects.equals(contactInfo, billableEntity.contactInfo) &&
        Objects.equals(responsible, billableEntity.responsible) &&
        Objects.equals(retailers, billableEntity.retailers) &&
        Objects.equals(managers, billableEntity.managers) &&
        Objects.equals(categories, billableEntity.categories) &&
        Objects.equals(filters, billableEntity.filters) &&
        Objects.equals(media, billableEntity.media) &&
        Objects.equals(mediaAlbum, billableEntity.mediaAlbum) &&
        Objects.equals(subscription, billableEntity.subscription) &&
        Objects.equals(disbursementIntrospect, billableEntity.disbursementIntrospect) &&
        Objects.equals(authorizeNetTransactionKey, billableEntity.authorizeNetTransactionKey) &&
        Objects.equals(authorizeNetApiKey, billableEntity.authorizeNetApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, contactInfo, responsible, retailers, managers, categories, filters, media, mediaAlbum, subscription, disbursementIntrospect, authorizeNetTransactionKey, authorizeNetApiKey);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

