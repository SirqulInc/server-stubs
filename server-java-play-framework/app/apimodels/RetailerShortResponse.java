package apimodels;

import apimodels.AssetShortResponse;
import apimodels.ContactInfoResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RetailerShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerShortResponse   {
  @JsonProperty("retailerId")
  
  private Long retailerId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("facebookUrl")
  
  private String facebookUrl;

  @JsonProperty("twitterUrl")
  
  private String twitterUrl;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("contact")
  @Valid

  private ContactInfoResponse contact;

  @JsonProperty("logo")
  @Valid

  private AssetShortResponse logo;

  @JsonProperty("picture1")
  @Valid

  private AssetShortResponse picture1;

  @JsonProperty("picture2")
  @Valid

  private AssetShortResponse picture2;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("visibility")
  
  private String visibility;

  public RetailerShortResponse retailerId(Long retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Get retailerId
   * @return retailerId
  **/
  public Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
  }

  public RetailerShortResponse name(String name) {
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

  public RetailerShortResponse facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

   /**
   * Get facebookUrl
   * @return facebookUrl
  **/
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public RetailerShortResponse twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

   /**
   * Get twitterUrl
   * @return twitterUrl
  **/
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public RetailerShortResponse active(Boolean active) {
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

  public RetailerShortResponse contact(ContactInfoResponse contact) {
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

  public RetailerShortResponse logo(AssetShortResponse logo) {
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

  public RetailerShortResponse picture1(AssetShortResponse picture1) {
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

  public RetailerShortResponse picture2(AssetShortResponse picture2) {
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

  public RetailerShortResponse latitude(Double latitude) {
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

  public RetailerShortResponse longitude(Double longitude) {
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

  public RetailerShortResponse visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
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
    return Objects.equals(retailerId, retailerShortResponse.retailerId) &&
        Objects.equals(name, retailerShortResponse.name) &&
        Objects.equals(facebookUrl, retailerShortResponse.facebookUrl) &&
        Objects.equals(twitterUrl, retailerShortResponse.twitterUrl) &&
        Objects.equals(active, retailerShortResponse.active) &&
        Objects.equals(contact, retailerShortResponse.contact) &&
        Objects.equals(logo, retailerShortResponse.logo) &&
        Objects.equals(picture1, retailerShortResponse.picture1) &&
        Objects.equals(picture2, retailerShortResponse.picture2) &&
        Objects.equals(latitude, retailerShortResponse.latitude) &&
        Objects.equals(longitude, retailerShortResponse.longitude) &&
        Objects.equals(visibility, retailerShortResponse.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, name, facebookUrl, twitterUrl, active, contact, logo, picture1, picture2, latitude, longitude, visibility);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

