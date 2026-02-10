package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AddressResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AddressResponse {

  private @Nullable String streetAddress;

  private @Nullable String streetAddress2;

  private @Nullable String city;

  private @Nullable String stateCode;

  private @Nullable String state;

  private @Nullable String postalCode;

  private @Nullable String countryCode;

  private @Nullable String country;

  private @Nullable String display;

  public AddressResponse streetAddress(@Nullable String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   */
  
  @Schema(name = "streetAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetAddress")
  public @Nullable String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(@Nullable String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public AddressResponse streetAddress2(@Nullable String streetAddress2) {
    this.streetAddress2 = streetAddress2;
    return this;
  }

  /**
   * Get streetAddress2
   * @return streetAddress2
   */
  
  @Schema(name = "streetAddress2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetAddress2")
  public @Nullable String getStreetAddress2() {
    return streetAddress2;
  }

  public void setStreetAddress2(@Nullable String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  public AddressResponse city(@Nullable String city) {
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

  public AddressResponse stateCode(@Nullable String stateCode) {
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

  public AddressResponse state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable String getState() {
    return state;
  }

  public void setState(@Nullable String state) {
    this.state = state;
  }

  public AddressResponse postalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   */
  
  @Schema(name = "postalCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public @Nullable String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressResponse countryCode(@Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   */
  
  @Schema(name = "countryCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public @Nullable String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@Nullable String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressResponse country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public AddressResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressResponse addressResponse = (AddressResponse) o;
    return Objects.equals(this.streetAddress, addressResponse.streetAddress) &&
        Objects.equals(this.streetAddress2, addressResponse.streetAddress2) &&
        Objects.equals(this.city, addressResponse.city) &&
        Objects.equals(this.stateCode, addressResponse.stateCode) &&
        Objects.equals(this.state, addressResponse.state) &&
        Objects.equals(this.postalCode, addressResponse.postalCode) &&
        Objects.equals(this.countryCode, addressResponse.countryCode) &&
        Objects.equals(this.country, addressResponse.country) &&
        Objects.equals(this.display, addressResponse.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, streetAddress2, city, stateCode, state, postalCode, countryCode, country, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResponse {\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

