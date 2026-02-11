package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RetailerLocationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerLocationResponse {

  private @Nullable Long retailerLocationId;

  private @Nullable String name;

  private @Nullable ContactInfoResponse contact;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Boolean active;

  private @Nullable Long favoriteId;

  private @Nullable Boolean favorite;

  private @Nullable ProfileShortResponse responsible;

  private @Nullable ProfileShortResponse manager;

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @Valid
  private List<@Valid FilterResponse> filters = new ArrayList<>();

  private @Nullable AssetShortResponse logo;

  private @Nullable AssetShortResponse picture1;

  private @Nullable AssetShortResponse picture2;

  private @Nullable BillableEntityResponse billableEntity;

  private @Nullable RetailerCountResponse counts;

  private @Nullable RetailerShortResponse retailer;

  private @Nullable ListResponse offers;

  private @Nullable String internalId;

  private @Nullable String detailsHeader;

  private @Nullable String detailsBody;

  private @Nullable String hours;

  private @Nullable String locationToken;

  private @Nullable String building;

  private @Nullable String qrCodeUrl;

  private @Nullable Double distance;

  private @Nullable String googlePlaceId;

  private @Nullable String yelpId;

  public RetailerLocationResponse retailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

  /**
   * Get retailerLocationId
   * @return retailerLocationId
   */
  
  @Schema(name = "retailerLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocationId")
  public @Nullable Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public RetailerLocationResponse name(@Nullable String name) {
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

  public RetailerLocationResponse contact(@Nullable ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public @Nullable ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(@Nullable ContactInfoResponse contact) {
    this.contact = contact;
  }

  public RetailerLocationResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public RetailerLocationResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public RetailerLocationResponse active(@Nullable Boolean active) {
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

  public RetailerLocationResponse favoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

  /**
   * Get favoriteId
   * @return favoriteId
   */
  
  @Schema(name = "favoriteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteId")
  public @Nullable Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public RetailerLocationResponse favorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
   */
  
  @Schema(name = "favorite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favorite")
  public @Nullable Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
  }

  public RetailerLocationResponse responsible(@Nullable ProfileShortResponse responsible) {
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
  public @Nullable ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(@Nullable ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public RetailerLocationResponse manager(@Nullable ProfileShortResponse manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public @Nullable ProfileShortResponse getManager() {
    return manager;
  }

  public void setManager(@Nullable ProfileShortResponse manager) {
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
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
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
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  public RetailerLocationResponse logo(@Nullable AssetShortResponse logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @Valid 
  @Schema(name = "logo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logo")
  public @Nullable AssetShortResponse getLogo() {
    return logo;
  }

  public void setLogo(@Nullable AssetShortResponse logo) {
    this.logo = logo;
  }

  public RetailerLocationResponse picture1(@Nullable AssetShortResponse picture1) {
    this.picture1 = picture1;
    return this;
  }

  /**
   * Get picture1
   * @return picture1
   */
  @Valid 
  @Schema(name = "picture1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture1")
  public @Nullable AssetShortResponse getPicture1() {
    return picture1;
  }

  public void setPicture1(@Nullable AssetShortResponse picture1) {
    this.picture1 = picture1;
  }

  public RetailerLocationResponse picture2(@Nullable AssetShortResponse picture2) {
    this.picture2 = picture2;
    return this;
  }

  /**
   * Get picture2
   * @return picture2
   */
  @Valid 
  @Schema(name = "picture2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture2")
  public @Nullable AssetShortResponse getPicture2() {
    return picture2;
  }

  public void setPicture2(@Nullable AssetShortResponse picture2) {
    this.picture2 = picture2;
  }

  public RetailerLocationResponse billableEntity(@Nullable BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public RetailerLocationResponse counts(@Nullable RetailerCountResponse counts) {
    this.counts = counts;
    return this;
  }

  /**
   * Get counts
   * @return counts
   */
  @Valid 
  @Schema(name = "counts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counts")
  public @Nullable RetailerCountResponse getCounts() {
    return counts;
  }

  public void setCounts(@Nullable RetailerCountResponse counts) {
    this.counts = counts;
  }

  public RetailerLocationResponse retailer(@Nullable RetailerShortResponse retailer) {
    this.retailer = retailer;
    return this;
  }

  /**
   * Get retailer
   * @return retailer
   */
  @Valid 
  @Schema(name = "retailer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailer")
  public @Nullable RetailerShortResponse getRetailer() {
    return retailer;
  }

  public void setRetailer(@Nullable RetailerShortResponse retailer) {
    this.retailer = retailer;
  }

  public RetailerLocationResponse offers(@Nullable ListResponse offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Get offers
   * @return offers
   */
  @Valid 
  @Schema(name = "offers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offers")
  public @Nullable ListResponse getOffers() {
    return offers;
  }

  public void setOffers(@Nullable ListResponse offers) {
    this.offers = offers;
  }

  public RetailerLocationResponse internalId(@Nullable String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * Get internalId
   * @return internalId
   */
  
  @Schema(name = "internalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internalId")
  public @Nullable String getInternalId() {
    return internalId;
  }

  public void setInternalId(@Nullable String internalId) {
    this.internalId = internalId;
  }

  public RetailerLocationResponse detailsHeader(@Nullable String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

  /**
   * Get detailsHeader
   * @return detailsHeader
   */
  
  @Schema(name = "detailsHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsHeader")
  public @Nullable String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(@Nullable String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public RetailerLocationResponse detailsBody(@Nullable String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

  /**
   * Get detailsBody
   * @return detailsBody
   */
  
  @Schema(name = "detailsBody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsBody")
  public @Nullable String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(@Nullable String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public RetailerLocationResponse hours(@Nullable String hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
   */
  
  @Schema(name = "hours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hours")
  public @Nullable String getHours() {
    return hours;
  }

  public void setHours(@Nullable String hours) {
    this.hours = hours;
  }

  public RetailerLocationResponse locationToken(@Nullable String locationToken) {
    this.locationToken = locationToken;
    return this;
  }

  /**
   * Get locationToken
   * @return locationToken
   */
  
  @Schema(name = "locationToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationToken")
  public @Nullable String getLocationToken() {
    return locationToken;
  }

  public void setLocationToken(@Nullable String locationToken) {
    this.locationToken = locationToken;
  }

  public RetailerLocationResponse building(@Nullable String building) {
    this.building = building;
    return this;
  }

  /**
   * Get building
   * @return building
   */
  
  @Schema(name = "building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building")
  public @Nullable String getBuilding() {
    return building;
  }

  public void setBuilding(@Nullable String building) {
    this.building = building;
  }

  public RetailerLocationResponse qrCodeUrl(@Nullable String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

  /**
   * Get qrCodeUrl
   * @return qrCodeUrl
   */
  
  @Schema(name = "qrCodeUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qrCodeUrl")
  public @Nullable String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(@Nullable String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  public RetailerLocationResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public RetailerLocationResponse googlePlaceId(@Nullable String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
    return this;
  }

  /**
   * Get googlePlaceId
   * @return googlePlaceId
   */
  
  @Schema(name = "googlePlaceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googlePlaceId")
  public @Nullable String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(@Nullable String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public RetailerLocationResponse yelpId(@Nullable String yelpId) {
    this.yelpId = yelpId;
    return this;
  }

  /**
   * Get yelpId
   * @return yelpId
   */
  
  @Schema(name = "yelpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yelpId")
  public @Nullable String getYelpId() {
    return yelpId;
  }

  public void setYelpId(@Nullable String yelpId) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

