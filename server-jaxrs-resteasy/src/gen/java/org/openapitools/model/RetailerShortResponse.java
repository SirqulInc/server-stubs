package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.ContactInfoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerShortResponse   {
  
  private Long retailerId;
  private String name;
  private String facebookUrl;
  private String twitterUrl;
  private Boolean active;
  private ContactInfoResponse contact;
  private AssetShortResponse logo;
  private AssetShortResponse picture1;
  private AssetShortResponse picture2;
  private Double latitude;
  private Double longitude;
  private String visibility;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerId")
  public Long getRetailerId() {
    return retailerId;
  }
  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
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
  @JsonProperty("facebookUrl")
  public String getFacebookUrl() {
    return facebookUrl;
  }
  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("twitterUrl")
  public String getTwitterUrl() {
    return twitterUrl;
  }
  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
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
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

