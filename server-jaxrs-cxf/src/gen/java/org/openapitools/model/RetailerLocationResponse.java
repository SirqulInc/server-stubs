package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.ContactInfoResponse;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.ListResponse;
import org.openapitools.model.ProfileShortResponse;
import org.openapitools.model.RetailerCountResponse;
import org.openapitools.model.RetailerShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerLocationResponse  {
  
  @ApiModelProperty(value = "")

  private Long retailerLocationId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private ContactInfoResponse contact;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Long favoriteId;

  @ApiModelProperty(value = "")

  private Boolean favorite;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileShortResponse responsible;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileShortResponse manager;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid FilterResponse> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse logo;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse picture1;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse picture2;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityResponse billableEntity;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerCountResponse counts;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerShortResponse retailer;

  @ApiModelProperty(value = "")

  @Valid

  private ListResponse offers;

  @ApiModelProperty(value = "")

  private String internalId;

  @ApiModelProperty(value = "")

  private String detailsHeader;

  @ApiModelProperty(value = "")

  private String detailsBody;

  @ApiModelProperty(value = "")

  private String hours;

  @ApiModelProperty(value = "")

  private String locationToken;

  @ApiModelProperty(value = "")

  private String building;

  @ApiModelProperty(value = "")

  private String qrCodeUrl;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private String googlePlaceId;

  @ApiModelProperty(value = "")

  private String yelpId;
 /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public RetailerLocationResponse retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
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

  public RetailerLocationResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  public RetailerLocationResponse contact(ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public RetailerLocationResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public RetailerLocationResponse longitude(Double longitude) {
    this.longitude = longitude;
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

  public RetailerLocationResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get favoriteId
   * @return favoriteId
  **/
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public RetailerLocationResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

 /**
   * Get favorite
   * @return favorite
  **/
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public RetailerLocationResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

 /**
   * Get responsible
   * @return responsible
  **/
  @JsonProperty("responsible")
  public ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public RetailerLocationResponse responsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

 /**
   * Get manager
   * @return manager
  **/
  @JsonProperty("manager")
  public ProfileShortResponse getManager() {
    return manager;
  }

  public void setManager(ProfileShortResponse manager) {
    this.manager = manager;
  }

  public RetailerLocationResponse manager(ProfileShortResponse manager) {
    this.manager = manager;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public RetailerLocationResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public RetailerLocationResponse addCategoriesItem(CategoryResponse categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  public RetailerLocationResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public RetailerLocationResponse addFiltersItem(FilterResponse filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get logo
   * @return logo
  **/
  @JsonProperty("logo")
  public AssetShortResponse getLogo() {
    return logo;
  }

  public void setLogo(AssetShortResponse logo) {
    this.logo = logo;
  }

  public RetailerLocationResponse logo(AssetShortResponse logo) {
    this.logo = logo;
    return this;
  }

 /**
   * Get picture1
   * @return picture1
  **/
  @JsonProperty("picture1")
  public AssetShortResponse getPicture1() {
    return picture1;
  }

  public void setPicture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
  }

  public RetailerLocationResponse picture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
    return this;
  }

 /**
   * Get picture2
   * @return picture2
  **/
  @JsonProperty("picture2")
  public AssetShortResponse getPicture2() {
    return picture2;
  }

  public void setPicture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
  }

  public RetailerLocationResponse picture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public RetailerLocationResponse billableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

 /**
   * Get counts
   * @return counts
  **/
  @JsonProperty("counts")
  public RetailerCountResponse getCounts() {
    return counts;
  }

  public void setCounts(RetailerCountResponse counts) {
    this.counts = counts;
  }

  public RetailerLocationResponse counts(RetailerCountResponse counts) {
    this.counts = counts;
    return this;
  }

 /**
   * Get retailer
   * @return retailer
  **/
  @JsonProperty("retailer")
  public RetailerShortResponse getRetailer() {
    return retailer;
  }

  public void setRetailer(RetailerShortResponse retailer) {
    this.retailer = retailer;
  }

  public RetailerLocationResponse retailer(RetailerShortResponse retailer) {
    this.retailer = retailer;
    return this;
  }

 /**
   * Get offers
   * @return offers
  **/
  @JsonProperty("offers")
  public ListResponse getOffers() {
    return offers;
  }

  public void setOffers(ListResponse offers) {
    this.offers = offers;
  }

  public RetailerLocationResponse offers(ListResponse offers) {
    this.offers = offers;
    return this;
  }

 /**
   * Get internalId
   * @return internalId
  **/
  @JsonProperty("internalId")
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public RetailerLocationResponse internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

 /**
   * Get detailsHeader
   * @return detailsHeader
  **/
  @JsonProperty("detailsHeader")
  public String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public RetailerLocationResponse detailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

 /**
   * Get detailsBody
   * @return detailsBody
  **/
  @JsonProperty("detailsBody")
  public String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public RetailerLocationResponse detailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

 /**
   * Get hours
   * @return hours
  **/
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public RetailerLocationResponse hours(String hours) {
    this.hours = hours;
    return this;
  }

 /**
   * Get locationToken
   * @return locationToken
  **/
  @JsonProperty("locationToken")
  public String getLocationToken() {
    return locationToken;
  }

  public void setLocationToken(String locationToken) {
    this.locationToken = locationToken;
  }

  public RetailerLocationResponse locationToken(String locationToken) {
    this.locationToken = locationToken;
    return this;
  }

 /**
   * Get building
   * @return building
  **/
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public RetailerLocationResponse building(String building) {
    this.building = building;
    return this;
  }

 /**
   * Get qrCodeUrl
   * @return qrCodeUrl
  **/
  @JsonProperty("qrCodeUrl")
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  public RetailerLocationResponse qrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public RetailerLocationResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get googlePlaceId
   * @return googlePlaceId
  **/
  @JsonProperty("googlePlaceId")
  public String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public RetailerLocationResponse googlePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
    return this;
  }

 /**
   * Get yelpId
   * @return yelpId
  **/
  @JsonProperty("yelpId")
  public String getYelpId() {
    return yelpId;
  }

  public void setYelpId(String yelpId) {
    this.yelpId = yelpId;
  }

  public RetailerLocationResponse yelpId(String yelpId) {
    this.yelpId = yelpId;
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
    RetailerLocationResponse retailerLocationResponse = (RetailerLocationResponse) o;
    return Objects.equals(this.retailerLocationId, retailerLocationResponse.retailerLocationId) &&
        Objects.equals(this.name, retailerLocationResponse.name) &&
        Objects.equals(this.contact, retailerLocationResponse.contact) &&
        Objects.equals(this.latitude, retailerLocationResponse.latitude) &&
        Objects.equals(this.longitude, retailerLocationResponse.longitude) &&
        Objects.equals(this.active, retailerLocationResponse.active) &&
        Objects.equals(this.favoriteId, retailerLocationResponse.favoriteId) &&
        Objects.equals(this.favorite, retailerLocationResponse.favorite) &&
        Objects.equals(this.responsible, retailerLocationResponse.responsible) &&
        Objects.equals(this.manager, retailerLocationResponse.manager) &&
        Objects.equals(this.categories, retailerLocationResponse.categories) &&
        Objects.equals(this.filters, retailerLocationResponse.filters) &&
        Objects.equals(this.logo, retailerLocationResponse.logo) &&
        Objects.equals(this.picture1, retailerLocationResponse.picture1) &&
        Objects.equals(this.picture2, retailerLocationResponse.picture2) &&
        Objects.equals(this.billableEntity, retailerLocationResponse.billableEntity) &&
        Objects.equals(this.counts, retailerLocationResponse.counts) &&
        Objects.equals(this.retailer, retailerLocationResponse.retailer) &&
        Objects.equals(this.offers, retailerLocationResponse.offers) &&
        Objects.equals(this.internalId, retailerLocationResponse.internalId) &&
        Objects.equals(this.detailsHeader, retailerLocationResponse.detailsHeader) &&
        Objects.equals(this.detailsBody, retailerLocationResponse.detailsBody) &&
        Objects.equals(this.hours, retailerLocationResponse.hours) &&
        Objects.equals(this.locationToken, retailerLocationResponse.locationToken) &&
        Objects.equals(this.building, retailerLocationResponse.building) &&
        Objects.equals(this.qrCodeUrl, retailerLocationResponse.qrCodeUrl) &&
        Objects.equals(this.distance, retailerLocationResponse.distance) &&
        Objects.equals(this.googlePlaceId, retailerLocationResponse.googlePlaceId) &&
        Objects.equals(this.yelpId, retailerLocationResponse.yelpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerLocationId, name, contact, latitude, longitude, active, favoriteId, favorite, responsible, manager, categories, filters, logo, picture1, picture2, billableEntity, counts, retailer, offers, internalId, detailsHeader, detailsBody, hours, locationToken, building, qrCodeUrl, distance, googlePlaceId, yelpId);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

