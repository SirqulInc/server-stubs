package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.ContactInfoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerShortResponse  {
  
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

  public RetailerShortResponse retailerId(Long retailerId) {
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

  public RetailerShortResponse name(String name) {
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

  public RetailerShortResponse facebookUrl(String facebookUrl) {
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

  public RetailerShortResponse twitterUrl(String twitterUrl) {
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

  public RetailerShortResponse active(Boolean active) {
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

  public RetailerShortResponse contact(ContactInfoResponse contact) {
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

  public RetailerShortResponse logo(AssetShortResponse logo) {
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

  public RetailerShortResponse picture1(AssetShortResponse picture1) {
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

  public RetailerShortResponse picture2(AssetShortResponse picture2) {
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

  public RetailerShortResponse latitude(Double latitude) {
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

  public RetailerShortResponse longitude(Double longitude) {
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

  public RetailerShortResponse visibility(String visibility) {
    this.visibility = visibility;
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
    RetailerShortResponse retailerShortResponse = (RetailerShortResponse) o;
    return Objects.equals(this.retailerId, retailerShortResponse.retailerId) &&
        Objects.equals(this.name, retailerShortResponse.name) &&
        Objects.equals(this.facebookUrl, retailerShortResponse.facebookUrl) &&
        Objects.equals(this.twitterUrl, retailerShortResponse.twitterUrl) &&
        Objects.equals(this.active, retailerShortResponse.active) &&
        Objects.equals(this.contact, retailerShortResponse.contact) &&
        Objects.equals(this.logo, retailerShortResponse.logo) &&
        Objects.equals(this.picture1, retailerShortResponse.picture1) &&
        Objects.equals(this.picture2, retailerShortResponse.picture2) &&
        Objects.equals(this.latitude, retailerShortResponse.latitude) &&
        Objects.equals(this.longitude, retailerShortResponse.longitude) &&
        Objects.equals(this.visibility, retailerShortResponse.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, name, facebookUrl, twitterUrl, active, contact, logo, picture1, picture2, latitude, longitude, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerShortResponse {\n");
    
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

