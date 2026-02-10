package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.ContactInfoResponse;
import org.openapitools.model.ProfileShortResponse;
import org.openapitools.model.RetailerCountResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerFullResponse  {
  
  @ApiModelProperty(value = "")

  private Long retailerId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String facebookUrl;

  @ApiModelProperty(value = "")

  private String twitterUrl;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private ContactInfoResponse contact;

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

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String visibility;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileShortResponse responsible;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileShortResponse manager;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityResponse billableEntity;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerCountResponse counts;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RetailerLocationShortResponse> locations = new ArrayList<>();
 /**
   * Get retailerId
   * @return retailerId
  **/
  @JsonProperty("retailerId")
  public Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
  }

  public RetailerFullResponse retailerId(Long retailerId) {
    this.retailerId = retailerId;
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

  public RetailerFullResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get facebookUrl
   * @return facebookUrl
  **/
  @JsonProperty("facebookUrl")
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public RetailerFullResponse facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

 /**
   * Get twitterUrl
   * @return twitterUrl
  **/
  @JsonProperty("twitterUrl")
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public RetailerFullResponse twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
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

  public RetailerFullResponse active(Boolean active) {
    this.active = active;
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

  public RetailerFullResponse contact(ContactInfoResponse contact) {
    this.contact = contact;
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

  public RetailerFullResponse logo(AssetShortResponse logo) {
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

  public RetailerFullResponse picture1(AssetShortResponse picture1) {
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

  public RetailerFullResponse picture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
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

  public RetailerFullResponse latitude(Double latitude) {
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

  public RetailerFullResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public RetailerFullResponse visibility(String visibility) {
    this.visibility = visibility;
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

  public RetailerFullResponse responsible(ProfileShortResponse responsible) {
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

  public RetailerFullResponse manager(ProfileShortResponse manager) {
    this.manager = manager;
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

  public RetailerFullResponse billableEntity(BillableEntityResponse billableEntity) {
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

  public RetailerFullResponse counts(RetailerCountResponse counts) {
    this.counts = counts;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public List<@Valid RetailerLocationShortResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
  }

  public RetailerFullResponse locations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
    return this;
  }

  public RetailerFullResponse addLocationsItem(RetailerLocationShortResponse locationsItem) {
    this.locations.add(locationsItem);
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
    RetailerFullResponse retailerFullResponse = (RetailerFullResponse) o;
    return Objects.equals(this.retailerId, retailerFullResponse.retailerId) &&
        Objects.equals(this.name, retailerFullResponse.name) &&
        Objects.equals(this.facebookUrl, retailerFullResponse.facebookUrl) &&
        Objects.equals(this.twitterUrl, retailerFullResponse.twitterUrl) &&
        Objects.equals(this.active, retailerFullResponse.active) &&
        Objects.equals(this.contact, retailerFullResponse.contact) &&
        Objects.equals(this.logo, retailerFullResponse.logo) &&
        Objects.equals(this.picture1, retailerFullResponse.picture1) &&
        Objects.equals(this.picture2, retailerFullResponse.picture2) &&
        Objects.equals(this.latitude, retailerFullResponse.latitude) &&
        Objects.equals(this.longitude, retailerFullResponse.longitude) &&
        Objects.equals(this.visibility, retailerFullResponse.visibility) &&
        Objects.equals(this.responsible, retailerFullResponse.responsible) &&
        Objects.equals(this.manager, retailerFullResponse.manager) &&
        Objects.equals(this.billableEntity, retailerFullResponse.billableEntity) &&
        Objects.equals(this.counts, retailerFullResponse.counts) &&
        Objects.equals(this.locations, retailerFullResponse.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, name, facebookUrl, twitterUrl, active, contact, logo, picture1, picture2, latitude, longitude, visibility, responsible, manager, billableEntity, counts, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerFullResponse {\n");
    
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    picture1: ").append(toIndentedString(picture1)).append("\n");
    sb.append("    picture2: ").append(toIndentedString(picture2)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

