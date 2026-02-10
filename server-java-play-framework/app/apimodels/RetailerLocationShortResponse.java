package apimodels;

import apimodels.ContactInfoResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RetailerLocationShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerLocationShortResponse   {
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

  public RetailerLocationShortResponse retailerLocationId(Long retailerLocationId) {
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

  public RetailerLocationShortResponse name(String name) {
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

  public RetailerLocationShortResponse contact(ContactInfoResponse contact) {
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

  public RetailerLocationShortResponse latitude(Double latitude) {
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

  public RetailerLocationShortResponse longitude(Double longitude) {
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

  public RetailerLocationShortResponse active(Boolean active) {
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

  public RetailerLocationShortResponse favoriteId(Long favoriteId) {
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

  public RetailerLocationShortResponse favorite(Boolean favorite) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailerLocationShortResponse retailerLocationShortResponse = (RetailerLocationShortResponse) o;
    return Objects.equals(retailerLocationId, retailerLocationShortResponse.retailerLocationId) &&
        Objects.equals(name, retailerLocationShortResponse.name) &&
        Objects.equals(contact, retailerLocationShortResponse.contact) &&
        Objects.equals(latitude, retailerLocationShortResponse.latitude) &&
        Objects.equals(longitude, retailerLocationShortResponse.longitude) &&
        Objects.equals(active, retailerLocationShortResponse.active) &&
        Objects.equals(favoriteId, retailerLocationShortResponse.favoriteId) &&
        Objects.equals(favorite, retailerLocationShortResponse.favorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerLocationId, name, contact, latitude, longitude, active, favoriteId, favorite);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerLocationShortResponse {\n");
    
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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

