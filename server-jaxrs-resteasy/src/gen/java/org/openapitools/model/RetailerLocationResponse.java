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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerLocationResponse   {
  
  private Long retailerLocationId;
  private String name;
  private ContactInfoResponse contact;
  private Double latitude;
  private Double longitude;
  private Boolean active;
  private Long favoriteId;
  private Boolean favorite;
  private ProfileShortResponse responsible;
  private ProfileShortResponse manager;
  private List<@Valid CategoryResponse> categories = new ArrayList<>();
  private List<@Valid FilterResponse> filters = new ArrayList<>();
  private AssetShortResponse logo;
  private AssetShortResponse picture1;
  private AssetShortResponse picture2;
  private BillableEntityResponse billableEntity;
  private RetailerCountResponse counts;
  private RetailerShortResponse retailer;
  private ListResponse offers;
  private String internalId;
  private String detailsHeader;
  private String detailsBody;
  private String hours;
  private String locationToken;
  private String building;
  private String qrCodeUrl;
  private Double distance;
  private String googlePlaceId;
  private String yelpId;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }
  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
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
  @JsonProperty("contact")
  @Valid
  public ContactInfoResponse getContact() {
    return contact;
  }
  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
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
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }
  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responsible")
  @Valid
  public ProfileShortResponse getResponsible() {
    return responsible;
  }
  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("manager")
  @Valid
  public ProfileShortResponse getManager() {
    return manager;
  }
  public void setManager(ProfileShortResponse manager) {
    this.manager = manager;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("logo")
  @Valid
  public AssetShortResponse getLogo() {
    return logo;
  }
  public void setLogo(AssetShortResponse logo) {
    this.logo = logo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("picture1")
  @Valid
  public AssetShortResponse getPicture1() {
    return picture1;
  }
  public void setPicture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("picture2")
  @Valid
  public AssetShortResponse getPicture2() {
    return picture2;
  }
  public void setPicture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("counts")
  @Valid
  public RetailerCountResponse getCounts() {
    return counts;
  }
  public void setCounts(RetailerCountResponse counts) {
    this.counts = counts;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailer")
  @Valid
  public RetailerShortResponse getRetailer() {
    return retailer;
  }
  public void setRetailer(RetailerShortResponse retailer) {
    this.retailer = retailer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offers")
  @Valid
  public ListResponse getOffers() {
    return offers;
  }
  public void setOffers(ListResponse offers) {
    this.offers = offers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("internalId")
  public String getInternalId() {
    return internalId;
  }
  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsHeader")
  public String getDetailsHeader() {
    return detailsHeader;
  }
  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsBody")
  public String getDetailsBody() {
    return detailsBody;
  }
  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }
  public void setHours(String hours) {
    this.hours = hours;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationToken")
  public String getLocationToken() {
    return locationToken;
  }
  public void setLocationToken(String locationToken) {
    this.locationToken = locationToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }
  public void setBuilding(String building) {
    this.building = building;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("qrCodeUrl")
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }
  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googlePlaceId")
  public String getGooglePlaceId() {
    return googlePlaceId;
  }
  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("yelpId")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

