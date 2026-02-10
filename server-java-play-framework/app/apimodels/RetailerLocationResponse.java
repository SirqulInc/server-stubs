package apimodels;

import apimodels.AssetShortResponse;
import apimodels.BillableEntityResponse;
import apimodels.CategoryResponse;
import apimodels.ContactInfoResponse;
import apimodels.FilterResponse;
import apimodels.ListResponse;
import apimodels.ProfileShortResponse;
import apimodels.RetailerCountResponse;
import apimodels.RetailerShortResponse;
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
 * RetailerLocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerLocationResponse   {
  @JsonProperty("retailerLocationId")
  
  private Long retailerLocationId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("contact")
  @Valid

  private ContactInfoResponse contact;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("favoriteId")
  
  private Long favoriteId;

  @JsonProperty("favorite")
  
  private Boolean favorite;

  @JsonProperty("responsible")
  @Valid

  private ProfileShortResponse responsible;

  @JsonProperty("manager")
  @Valid

  private ProfileShortResponse manager;

  @JsonProperty("categories")
  @Valid

  private List<@Valid CategoryResponse> categories = null;

  @JsonProperty("filters")
  @Valid

  private List<@Valid FilterResponse> filters = null;

  @JsonProperty("logo")
  @Valid

  private AssetShortResponse logo;

  @JsonProperty("picture1")
  @Valid

  private AssetShortResponse picture1;

  @JsonProperty("picture2")
  @Valid

  private AssetShortResponse picture2;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntityResponse billableEntity;

  @JsonProperty("counts")
  @Valid

  private RetailerCountResponse counts;

  @JsonProperty("retailer")
  @Valid

  private RetailerShortResponse retailer;

  @JsonProperty("offers")
  @Valid

  private ListResponse offers;

  @JsonProperty("internalId")
  
  private String internalId;

  @JsonProperty("detailsHeader")
  
  private String detailsHeader;

  @JsonProperty("detailsBody")
  
  private String detailsBody;

  @JsonProperty("hours")
  
  private String hours;

  @JsonProperty("locationToken")
  
  private String locationToken;

  @JsonProperty("building")
  
  private String building;

  @JsonProperty("qrCodeUrl")
  
  private String qrCodeUrl;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("googlePlaceId")
  
  private String googlePlaceId;

  @JsonProperty("yelpId")
  
  private String yelpId;

  public RetailerLocationResponse retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

   /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public RetailerLocationResponse name(String name) {
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

  public RetailerLocationResponse contact(ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  public RetailerLocationResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public RetailerLocationResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public RetailerLocationResponse active(Boolean active) {
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

  public RetailerLocationResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * Get favoriteId
   * @return favoriteId
  **/
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public RetailerLocationResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public RetailerLocationResponse responsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

   /**
   * Get responsible
   * @return responsible
  **/
  public ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public RetailerLocationResponse manager(ProfileShortResponse manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  public ProfileShortResponse getManager() {
    return manager;
  }

  public void setManager(ProfileShortResponse manager) {
    this.manager = manager;
  }

  public RetailerLocationResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public RetailerLocationResponse addCategoriesItem(CategoryResponse categoriesItem) {
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
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public RetailerLocationResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public RetailerLocationResponse addFiltersItem(FilterResponse filtersItem) {
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
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  public RetailerLocationResponse logo(AssetShortResponse logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  public AssetShortResponse getLogo() {
    return logo;
  }

  public void setLogo(AssetShortResponse logo) {
    this.logo = logo;
  }

  public RetailerLocationResponse picture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
    return this;
  }

   /**
   * Get picture1
   * @return picture1
  **/
  public AssetShortResponse getPicture1() {
    return picture1;
  }

  public void setPicture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
  }

  public RetailerLocationResponse picture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
    return this;
  }

   /**
   * Get picture2
   * @return picture2
  **/
  public AssetShortResponse getPicture2() {
    return picture2;
  }

  public void setPicture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
  }

  public RetailerLocationResponse billableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public RetailerLocationResponse counts(RetailerCountResponse counts) {
    this.counts = counts;
    return this;
  }

   /**
   * Get counts
   * @return counts
  **/
  public RetailerCountResponse getCounts() {
    return counts;
  }

  public void setCounts(RetailerCountResponse counts) {
    this.counts = counts;
  }

  public RetailerLocationResponse retailer(RetailerShortResponse retailer) {
    this.retailer = retailer;
    return this;
  }

   /**
   * Get retailer
   * @return retailer
  **/
  public RetailerShortResponse getRetailer() {
    return retailer;
  }

  public void setRetailer(RetailerShortResponse retailer) {
    this.retailer = retailer;
  }

  public RetailerLocationResponse offers(ListResponse offers) {
    this.offers = offers;
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  public ListResponse getOffers() {
    return offers;
  }

  public void setOffers(ListResponse offers) {
    this.offers = offers;
  }

  public RetailerLocationResponse internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public RetailerLocationResponse detailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

   /**
   * Get detailsHeader
   * @return detailsHeader
  **/
  public String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public RetailerLocationResponse detailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

   /**
   * Get detailsBody
   * @return detailsBody
  **/
  public String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public RetailerLocationResponse hours(String hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public RetailerLocationResponse locationToken(String locationToken) {
    this.locationToken = locationToken;
    return this;
  }

   /**
   * Get locationToken
   * @return locationToken
  **/
  public String getLocationToken() {
    return locationToken;
  }

  public void setLocationToken(String locationToken) {
    this.locationToken = locationToken;
  }

  public RetailerLocationResponse building(String building) {
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public RetailerLocationResponse qrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * Get qrCodeUrl
   * @return qrCodeUrl
  **/
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  public RetailerLocationResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public RetailerLocationResponse googlePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
    return this;
  }

   /**
   * Get googlePlaceId
   * @return googlePlaceId
  **/
  public String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public RetailerLocationResponse yelpId(String yelpId) {
    this.yelpId = yelpId;
    return this;
  }

   /**
   * Get yelpId
   * @return yelpId
  **/
  public String getYelpId() {
    return yelpId;
  }

  public void setYelpId(String yelpId) {
    this.yelpId = yelpId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailerLocationResponse retailerLocationResponse = (RetailerLocationResponse) o;
    return Objects.equals(retailerLocationId, retailerLocationResponse.retailerLocationId) &&
        Objects.equals(name, retailerLocationResponse.name) &&
        Objects.equals(contact, retailerLocationResponse.contact) &&
        Objects.equals(latitude, retailerLocationResponse.latitude) &&
        Objects.equals(longitude, retailerLocationResponse.longitude) &&
        Objects.equals(active, retailerLocationResponse.active) &&
        Objects.equals(favoriteId, retailerLocationResponse.favoriteId) &&
        Objects.equals(favorite, retailerLocationResponse.favorite) &&
        Objects.equals(responsible, retailerLocationResponse.responsible) &&
        Objects.equals(manager, retailerLocationResponse.manager) &&
        Objects.equals(categories, retailerLocationResponse.categories) &&
        Objects.equals(filters, retailerLocationResponse.filters) &&
        Objects.equals(logo, retailerLocationResponse.logo) &&
        Objects.equals(picture1, retailerLocationResponse.picture1) &&
        Objects.equals(picture2, retailerLocationResponse.picture2) &&
        Objects.equals(billableEntity, retailerLocationResponse.billableEntity) &&
        Objects.equals(counts, retailerLocationResponse.counts) &&
        Objects.equals(retailer, retailerLocationResponse.retailer) &&
        Objects.equals(offers, retailerLocationResponse.offers) &&
        Objects.equals(internalId, retailerLocationResponse.internalId) &&
        Objects.equals(detailsHeader, retailerLocationResponse.detailsHeader) &&
        Objects.equals(detailsBody, retailerLocationResponse.detailsBody) &&
        Objects.equals(hours, retailerLocationResponse.hours) &&
        Objects.equals(locationToken, retailerLocationResponse.locationToken) &&
        Objects.equals(building, retailerLocationResponse.building) &&
        Objects.equals(qrCodeUrl, retailerLocationResponse.qrCodeUrl) &&
        Objects.equals(distance, retailerLocationResponse.distance) &&
        Objects.equals(googlePlaceId, retailerLocationResponse.googlePlaceId) &&
        Objects.equals(yelpId, retailerLocationResponse.yelpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerLocationId, name, contact, latitude, longitude, active, favoriteId, favorite, responsible, manager, categories, filters, logo, picture1, picture2, billableEntity, counts, retailer, offers, internalId, detailsHeader, detailsBody, hours, locationToken, building, qrCodeUrl, distance, googlePlaceId, yelpId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerLocationResponse {\n");
    
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    picture1: ").append(toIndentedString(picture1)).append("\n");
    sb.append("    picture2: ").append(toIndentedString(picture2)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    retailer: ").append(toIndentedString(retailer)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    detailsHeader: ").append(toIndentedString(detailsHeader)).append("\n");
    sb.append("    detailsBody: ").append(toIndentedString(detailsBody)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    locationToken: ").append(toIndentedString(locationToken)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    googlePlaceId: ").append(toIndentedString(googlePlaceId)).append("\n");
    sb.append("    yelpId: ").append(toIndentedString(yelpId)).append("\n");
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

