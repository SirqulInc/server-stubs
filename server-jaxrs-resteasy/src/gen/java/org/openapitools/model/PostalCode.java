package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.Region;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PostalCode   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private String code;
  private String plus4;
  private String stateCode;
  private String city;
  private String timeZone;
  private Integer utcOffset;
  private Set<@Valid Region> regions = new LinkedHashSet<>();
  private Boolean eliminated;
  private Boolean searchPoint;
  private Date lastOfferImport;
  private Double truncatedLatitude;
  private Double truncatedLongitude;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
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
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("plus4")
  public String getPlus4() {
    return plus4;
  }
  public void setPlus4(String plus4) {
    this.plus4 = plus4;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }
  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("utcOffset")
  public Integer getUtcOffset() {
    return utcOffset;
  }
  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regions")
  @Valid
  public Set<@Valid Region> getRegions() {
    return regions;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRegions(Set<@Valid Region> regions) {
    this.regions = regions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eliminated")
  public Boolean getEliminated() {
    return eliminated;
  }
  public void setEliminated(Boolean eliminated) {
    this.eliminated = eliminated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("searchPoint")
  public Boolean getSearchPoint() {
    return searchPoint;
  }
  public void setSearchPoint(Boolean searchPoint) {
    this.searchPoint = searchPoint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastOfferImport")
  public Date getLastOfferImport() {
    return lastOfferImport;
  }
  public void setLastOfferImport(Date lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("truncatedLatitude")
  public Double getTruncatedLatitude() {
    return truncatedLatitude;
  }
  public void setTruncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("truncatedLongitude")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

