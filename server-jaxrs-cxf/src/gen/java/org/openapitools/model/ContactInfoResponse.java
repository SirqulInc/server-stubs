package org.openapitools.model;

import org.openapitools.model.AddressResponse;
import org.openapitools.model.CellCarrierResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContactInfoResponse  {
  
  @ApiModelProperty(value = "")

  private String homePhone;

  @ApiModelProperty(value = "")

  private String cellPhone;

  @ApiModelProperty(value = "")

  private String cellPhoneCarrier;

  @ApiModelProperty(value = "")

  private String businessPhone;

  @ApiModelProperty(value = "")

  private String businessPhoneExt;

  @ApiModelProperty(value = "")

  private String faxNumber;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private String utcOffset;

  @ApiModelProperty(value = "")

  private String code501c3;

  @ApiModelProperty(value = "")

  private String emailAddress;

  @ApiModelProperty(value = "")

  @Valid

  private AddressResponse address;

  @ApiModelProperty(value = "")

  private String web;

  @ApiModelProperty(value = "")

  @Valid

  private CellCarrierResponse cellCarrier;
 /**
   * Get homePhone
   * @return homePhone
  **/
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public ContactInfoResponse homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

 /**
   * Get cellPhone
   * @return cellPhone
  **/
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public ContactInfoResponse cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

 /**
   * Get cellPhoneCarrier
   * @return cellPhoneCarrier
  **/
  @JsonProperty("cellPhoneCarrier")
  public String getCellPhoneCarrier() {
    return cellPhoneCarrier;
  }

  public void setCellPhoneCarrier(String cellPhoneCarrier) {
    this.cellPhoneCarrier = cellPhoneCarrier;
  }

  public ContactInfoResponse cellPhoneCarrier(String cellPhoneCarrier) {
    this.cellPhoneCarrier = cellPhoneCarrier;
    return this;
  }

 /**
   * Get businessPhone
   * @return businessPhone
  **/
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public ContactInfoResponse businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

 /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public ContactInfoResponse businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

 /**
   * Get faxNumber
   * @return faxNumber
  **/
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public ContactInfoResponse faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
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

  public ContactInfoResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get utcOffset
   * @return utcOffset
  **/
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public ContactInfoResponse utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

 /**
   * Get code501c3
   * @return code501c3
  **/
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public ContactInfoResponse code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

 /**
   * Get emailAddress
   * @return emailAddress
  **/
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ContactInfoResponse emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public AddressResponse getAddress() {
    return address;
  }

  public void setAddress(AddressResponse address) {
    this.address = address;
  }

  public ContactInfoResponse address(AddressResponse address) {
    this.address = address;
    return this;
  }

 /**
   * Get web
   * @return web
  **/
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public ContactInfoResponse web(String web) {
    this.web = web;
    return this;
  }

 /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  @JsonProperty("cellCarrier")
  public CellCarrierResponse getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrierResponse cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public ContactInfoResponse cellCarrier(CellCarrierResponse cellCarrier) {
    this.cellCarrier = cellCarrier;
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
    ContactInfoResponse contactInfoResponse = (ContactInfoResponse) o;
    return Objects.equals(this.homePhone, contactInfoResponse.homePhone) &&
        Objects.equals(this.cellPhone, contactInfoResponse.cellPhone) &&
        Objects.equals(this.cellPhoneCarrier, contactInfoResponse.cellPhoneCarrier) &&
        Objects.equals(this.businessPhone, contactInfoResponse.businessPhone) &&
        Objects.equals(this.businessPhoneExt, contactInfoResponse.businessPhoneExt) &&
        Objects.equals(this.faxNumber, contactInfoResponse.faxNumber) &&
        Objects.equals(this.timeZone, contactInfoResponse.timeZone) &&
        Objects.equals(this.utcOffset, contactInfoResponse.utcOffset) &&
        Objects.equals(this.code501c3, contactInfoResponse.code501c3) &&
        Objects.equals(this.emailAddress, contactInfoResponse.emailAddress) &&
        Objects.equals(this.address, contactInfoResponse.address) &&
        Objects.equals(this.web, contactInfoResponse.web) &&
        Objects.equals(this.cellCarrier, contactInfoResponse.cellCarrier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homePhone, cellPhone, cellPhoneCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, cellCarrier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInfoResponse {\n");
    
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    cellPhoneCarrier: ").append(toIndentedString(cellPhoneCarrier)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhoneExt: ").append(toIndentedString(businessPhoneExt)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    code501c3: ").append(toIndentedString(code501c3)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    cellCarrier: ").append(toIndentedString(cellCarrier)).append("\n");
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

