package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Address  {
  
  @ApiModelProperty(value = "")

  private String streetAddress;

  @ApiModelProperty(value = "")

  private String streetAddress2;

  @ApiModelProperty(value = "")

  private String city;

  @ApiModelProperty(value = "")

  private String stateCode;

  @ApiModelProperty(value = "")

  private String state;

  @ApiModelProperty(value = "")

  private String postalCode;

  @ApiModelProperty(value = "")

  private String countryCode;

  @ApiModelProperty(value = "")

  private String country;

  @ApiModelProperty(value = "")

  private String display;
 /**
   * Get streetAddress
   * @return streetAddress
  **/
  @JsonProperty("streetAddress")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Address streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

 /**
   * Get streetAddress2
   * @return streetAddress2
  **/
  @JsonProperty("streetAddress2")
  public String getStreetAddress2() {
    return streetAddress2;
  }

  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  public Address streetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
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

  public Address city(String city) {
    this.city = city;
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

  public Address stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get postalCode
   * @return postalCode
  **/
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
   * Get countryCode
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Address display(String display) {
    this.display = display;
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
    Address address = (Address) o;
    return Objects.equals(this.streetAddress, address.streetAddress) &&
        Objects.equals(this.streetAddress2, address.streetAddress2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateCode, address.stateCode) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.display, address.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, streetAddress2, city, stateCode, state, postalCode, countryCode, country, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

