package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddressResponse  {
  
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

  public AddressResponse streetAddress(String streetAddress) {
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

  public AddressResponse streetAddress2(String streetAddress2) {
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

  public AddressResponse city(String city) {
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

  public AddressResponse stateCode(String stateCode) {
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

  public AddressResponse state(String state) {
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

  public AddressResponse postalCode(String postalCode) {
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

  public AddressResponse countryCode(String countryCode) {
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

  public AddressResponse country(String country) {
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

  public AddressResponse display(String display) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

