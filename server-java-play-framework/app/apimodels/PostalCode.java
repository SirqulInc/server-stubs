package apimodels;

import apimodels.Region;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PostalCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PostalCode   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("code")
  
  private String code;

  @JsonProperty("plus4")
  
  private String plus4;

  @JsonProperty("stateCode")
  
  private String stateCode;

  @JsonProperty("city")
  
  private String city;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("utcOffset")
  
  private Integer utcOffset;

  @JsonProperty("regions")
  @Valid

  private Set<@Valid Region> regions = null;

  @JsonProperty("eliminated")
  
  private Boolean eliminated;

  @JsonProperty("searchPoint")
  
  private Boolean searchPoint;

  @JsonProperty("lastOfferImport")
  @Valid

  private OffsetDateTime lastOfferImport;

  @JsonProperty("truncatedLatitude")
  
  private Double truncatedLatitude;

  @JsonProperty("truncatedLongitude")
  
  private Double truncatedLongitude;

  public PostalCode id(Long id) {
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

  public PostalCode active(Boolean active) {
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

  public PostalCode valid(Boolean valid) {
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

  public PostalCode latitude(Double latitude) {
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

  public PostalCode longitude(Double longitude) {
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

  public PostalCode locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public PostalCode code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PostalCode plus4(String plus4) {
    this.plus4 = plus4;
    return this;
  }

   /**
   * Get plus4
   * @return plus4
  **/
  public String getPlus4() {
    return plus4;
  }

  public void setPlus4(String plus4) {
    this.plus4 = plus4;
  }

  public PostalCode stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public PostalCode city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PostalCode timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public PostalCode utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  public Integer getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }

  public PostalCode regions(Set<@Valid Region> regions) {
    this.regions = regions;
    return this;
  }

  public PostalCode addRegionsItem(Region regionsItem) {
    if (this.regions == null) {
      this.regions = new LinkedHashSet<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  public Set<@Valid Region> getRegions() {
    return regions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRegions(Set<@Valid Region> regions) {
    this.regions = regions;
  }

  public PostalCode eliminated(Boolean eliminated) {
    this.eliminated = eliminated;
    return this;
  }

   /**
   * Get eliminated
   * @return eliminated
  **/
  public Boolean getEliminated() {
    return eliminated;
  }

  public void setEliminated(Boolean eliminated) {
    this.eliminated = eliminated;
  }

  public PostalCode searchPoint(Boolean searchPoint) {
    this.searchPoint = searchPoint;
    return this;
  }

   /**
   * Get searchPoint
   * @return searchPoint
  **/
  public Boolean getSearchPoint() {
    return searchPoint;
  }

  public void setSearchPoint(Boolean searchPoint) {
    this.searchPoint = searchPoint;
  }

  public PostalCode lastOfferImport(OffsetDateTime lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
    return this;
  }

   /**
   * Get lastOfferImport
   * @return lastOfferImport
  **/
  public OffsetDateTime getLastOfferImport() {
    return lastOfferImport;
  }

  public void setLastOfferImport(OffsetDateTime lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
  }

  public PostalCode truncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
    return this;
  }

   /**
   * Get truncatedLatitude
   * @return truncatedLatitude
  **/
  public Double getTruncatedLatitude() {
    return truncatedLatitude;
  }

  public void setTruncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  public PostalCode truncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
    return this;
  }

   /**
   * Get truncatedLongitude
   * @return truncatedLongitude
  **/
  public Double getTruncatedLongitude() {
    return truncatedLongitude;
  }

  public void setTruncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalCode postalCode = (PostalCode) o;
    return Objects.equals(id, postalCode.id) &&
        Objects.equals(active, postalCode.active) &&
        Objects.equals(valid, postalCode.valid) &&
        Objects.equals(latitude, postalCode.latitude) &&
        Objects.equals(longitude, postalCode.longitude) &&
        Objects.equals(locationDescription, postalCode.locationDescription) &&
        Objects.equals(code, postalCode.code) &&
        Objects.equals(plus4, postalCode.plus4) &&
        Objects.equals(stateCode, postalCode.stateCode) &&
        Objects.equals(city, postalCode.city) &&
        Objects.equals(timeZone, postalCode.timeZone) &&
        Objects.equals(utcOffset, postalCode.utcOffset) &&
        Objects.equals(regions, postalCode.regions) &&
        Objects.equals(eliminated, postalCode.eliminated) &&
        Objects.equals(searchPoint, postalCode.searchPoint) &&
        Objects.equals(lastOfferImport, postalCode.lastOfferImport) &&
        Objects.equals(truncatedLatitude, postalCode.truncatedLatitude) &&
        Objects.equals(truncatedLongitude, postalCode.truncatedLongitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, code, plus4, stateCode, city, timeZone, utcOffset, regions, eliminated, searchPoint, lastOfferImport, truncatedLatitude, truncatedLongitude);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalCode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    plus4: ").append(toIndentedString(plus4)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    eliminated: ").append(toIndentedString(eliminated)).append("\n");
    sb.append("    searchPoint: ").append(toIndentedString(searchPoint)).append("\n");
    sb.append("    lastOfferImport: ").append(toIndentedString(lastOfferImport)).append("\n");
    sb.append("    truncatedLatitude: ").append(toIndentedString(truncatedLatitude)).append("\n");
    sb.append("    truncatedLongitude: ").append(toIndentedString(truncatedLongitude)).append("\n");
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

