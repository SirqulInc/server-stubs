package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.Region;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostalCode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PostalCode {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable String code;

  private @Nullable String plus4;

  private @Nullable String stateCode;

  private @Nullable String city;

  private @Nullable String timeZone;

  private @Nullable Integer utcOffset;

  @Valid
  private Set<@Valid Region> regions = new LinkedHashSet<>();

  private @Nullable Boolean eliminated;

  private @Nullable Boolean searchPoint;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastOfferImport;

  private @Nullable Double truncatedLatitude;

  private @Nullable Double truncatedLongitude;

  public PostalCode id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public PostalCode active(@Nullable Boolean active) {
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

  public PostalCode valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public PostalCode latitude(@Nullable Double latitude) {
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

  public PostalCode longitude(@Nullable Double longitude) {
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

  public PostalCode locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public PostalCode code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public PostalCode plus4(@Nullable String plus4) {
    this.plus4 = plus4;
    return this;
  }

  /**
   * Get plus4
   * @return plus4
   */
  
  @Schema(name = "plus4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plus4")
  public @Nullable String getPlus4() {
    return plus4;
  }

  public void setPlus4(@Nullable String plus4) {
    this.plus4 = plus4;
  }

  public PostalCode stateCode(@Nullable String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
   */
  
  @Schema(name = "stateCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateCode")
  public @Nullable String getStateCode() {
    return stateCode;
  }

  public void setStateCode(@Nullable String stateCode) {
    this.stateCode = stateCode;
  }

  public PostalCode city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public PostalCode timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public PostalCode utcOffset(@Nullable Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * Get utcOffset
   * @return utcOffset
   */
  
  @Schema(name = "utcOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("utcOffset")
  public @Nullable Integer getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(@Nullable Integer utcOffset) {
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
   */
  @Valid 
  @Schema(name = "regions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regions")
  public Set<@Valid Region> getRegions() {
    return regions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRegions(Set<@Valid Region> regions) {
    this.regions = regions;
  }

  public PostalCode eliminated(@Nullable Boolean eliminated) {
    this.eliminated = eliminated;
    return this;
  }

  /**
   * Get eliminated
   * @return eliminated
   */
  
  @Schema(name = "eliminated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eliminated")
  public @Nullable Boolean getEliminated() {
    return eliminated;
  }

  public void setEliminated(@Nullable Boolean eliminated) {
    this.eliminated = eliminated;
  }

  public PostalCode searchPoint(@Nullable Boolean searchPoint) {
    this.searchPoint = searchPoint;
    return this;
  }

  /**
   * Get searchPoint
   * @return searchPoint
   */
  
  @Schema(name = "searchPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchPoint")
  public @Nullable Boolean getSearchPoint() {
    return searchPoint;
  }

  public void setSearchPoint(@Nullable Boolean searchPoint) {
    this.searchPoint = searchPoint;
  }

  public PostalCode lastOfferImport(@Nullable OffsetDateTime lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
    return this;
  }

  /**
   * Get lastOfferImport
   * @return lastOfferImport
   */
  @Valid 
  @Schema(name = "lastOfferImport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastOfferImport")
  public @Nullable OffsetDateTime getLastOfferImport() {
    return lastOfferImport;
  }

  public void setLastOfferImport(@Nullable OffsetDateTime lastOfferImport) {
    this.lastOfferImport = lastOfferImport;
  }

  public PostalCode truncatedLatitude(@Nullable Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
    return this;
  }

  /**
   * Get truncatedLatitude
   * @return truncatedLatitude
   */
  
  @Schema(name = "truncatedLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("truncatedLatitude")
  public @Nullable Double getTruncatedLatitude() {
    return truncatedLatitude;
  }

  public void setTruncatedLatitude(@Nullable Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  public PostalCode truncatedLongitude(@Nullable Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
    return this;
  }

  /**
   * Get truncatedLongitude
   * @return truncatedLongitude
   */
  
  @Schema(name = "truncatedLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("truncatedLongitude")
  public @Nullable Double getTruncatedLongitude() {
    return truncatedLongitude;
  }

  public void setTruncatedLongitude(@Nullable Double truncatedLongitude) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

