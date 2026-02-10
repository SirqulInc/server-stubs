package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.Region;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PostalCode  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private String code;

  @ApiModelProperty(value = "")

  private String plus4;

  @ApiModelProperty(value = "")

  private String stateCode;

  @ApiModelProperty(value = "")

  private String city;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private Integer utcOffset;

  @ApiModelProperty(value = "")

  @Valid

  private Set<@Valid Region> regions = new LinkedHashSet<>();

  @ApiModelProperty(value = "")

  private Boolean eliminated;

  @ApiModelProperty(value = "")

  private Boolean searchPoint;

  @ApiModelProperty(value = "")

  private Date lastOfferImport;

  @ApiModelProperty(value = "")

  private Double truncatedLatitude;

  @ApiModelProperty(value = "")

  private Double truncatedLongitude;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PostalCode id(Long id) {
    this.id = id;
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

  public PostalCode active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PostalCode valid(Boolean valid) {
    this.valid = valid;
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

  public PostalCode latitude(Double latitude) {
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

  public PostalCode longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public PostalCode locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PostalCode code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get plus4
   * @return plus4
  **/
  @JsonProperty("plus4")
  public String getPlus4() {
    return plus4;
  }

  public void setPlus4(String plus4) {
    this.plus4 = plus4;
  }

  public PostalCode plus4(String plus4) {
    this.plus4 = plus4;
    return this;
  }

 /**
   * Get stateCode
   * @return stateCode
  **/
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public PostalCode stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

 /**
   * Get city
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PostalCode city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get timeZone
   * @return timeZone
  **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public PostalCode timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get utcOffset
   * @return utcOffset
  **/
  @JsonProperty("utcOffset")
  public Integer getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }

  public PostalCode utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

 /**
   * Get regions
   * @return regions
  **/
  @JsonProperty("regions")
  public Set<@Valid Region> getRegions() {
    return regions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRegions(Set<@Valid Region> regions) {
    this.regions = regions;
  }

  public PostalCode regions(Set<@Valid Region> regions) {
    this.regions = regions;
    return this;
  }

  public PostalCode addRegionsItem(Region regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

 /**
   * Get eliminated
   * @return eliminated
  **/
  @JsonProperty("eliminated")
  public Boolean getEliminated() {
    return eliminated;
  }

  public void setEliminated(Boolean eliminated) {
    this.eliminated = eliminated;
  }

  public PostalCode eliminated(Boolean eliminated) {
    this.eliminated = eliminated;
    return this;
  }

 /**
   * Get searchPoint
   * @return searchPoint
  **/
  @JsonProperty("searchPoint")
  public Boolean getSearchPoint() {
    return searchPoint;
  }

  public void setSearchPoint(Boolean searchPoint) {
    this.searchPoint = searchPoint;
  }

  public PostalCode searchPoint(Boolean searchPoint) {
    this.searchPoint = searchPoint;
    return this;
  }

 /**
   * Get lastOfferImport
   * @return lastOfferImport
  **/
  @JsonProperty("lastOfferImport")
  public Date getLastOfferImport() {
    return lastOfferImport;
  }

  public void setLastOfferImport(Date lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
  }

  public PostalCode lastOfferImport(Date lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
    return this;
  }

 /**
   * Get truncatedLatitude
   * @return truncatedLatitude
  **/
  @JsonProperty("truncatedLatitude")
  public Double getTruncatedLatitude() {
    return truncatedLatitude;
  }

  public void setTruncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  public PostalCode truncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
    return this;
  }

 /**
   * Get truncatedLongitude
   * @return truncatedLongitude
  **/
  @JsonProperty("truncatedLongitude")
  public Double getTruncatedLongitude() {
    return truncatedLongitude;
  }

  public void setTruncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
  }

  public PostalCode truncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
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
    PostalCode postalCode = (PostalCode) o;
    return Objects.equals(this.id, postalCode.id) &&
        Objects.equals(this.active, postalCode.active) &&
        Objects.equals(this.valid, postalCode.valid) &&
        Objects.equals(this.latitude, postalCode.latitude) &&
        Objects.equals(this.longitude, postalCode.longitude) &&
        Objects.equals(this.locationDescription, postalCode.locationDescription) &&
        Objects.equals(this.code, postalCode.code) &&
        Objects.equals(this.plus4, postalCode.plus4) &&
        Objects.equals(this.stateCode, postalCode.stateCode) &&
        Objects.equals(this.city, postalCode.city) &&
        Objects.equals(this.timeZone, postalCode.timeZone) &&
        Objects.equals(this.utcOffset, postalCode.utcOffset) &&
        Objects.equals(this.regions, postalCode.regions) &&
        Objects.equals(this.eliminated, postalCode.eliminated) &&
        Objects.equals(this.searchPoint, postalCode.searchPoint) &&
        Objects.equals(this.lastOfferImport, postalCode.lastOfferImport) &&
        Objects.equals(this.truncatedLatitude, postalCode.truncatedLatitude) &&
        Objects.equals(this.truncatedLongitude, postalCode.truncatedLongitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, code, plus4, stateCode, city, timeZone, utcOffset, regions, eliminated, searchPoint, lastOfferImport, truncatedLatitude, truncatedLongitude);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

