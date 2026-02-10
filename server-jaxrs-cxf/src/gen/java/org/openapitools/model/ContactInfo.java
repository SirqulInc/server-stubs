package org.openapitools.model;

import org.openapitools.model.Address;
import org.openapitools.model.CellCarrier;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContactInfo  {
  
  @ApiModelProperty(value = "")

  private String homePhone;

  @ApiModelProperty(value = "")

  private String cellPhone;

  @ApiModelProperty(value = "")

  @Valid

  private CellCarrier cellCarrier;

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

  private Address address;

  @ApiModelProperty(value = "")

  private String web;
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

  public ContactInfo homePhone(String homePhone) {
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

  public ContactInfo cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

 /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  @JsonProperty("cellCarrier")
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public ContactInfo cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
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

  public ContactInfo businessPhone(String businessPhone) {
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

  public ContactInfo businessPhoneExt(String businessPhoneExt) {
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

  public ContactInfo faxNumber(String faxNumber) {
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

  public ContactInfo timeZone(String timeZone) {
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

  public ContactInfo utcOffset(String utcOffset) {
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

  public ContactInfo code501c3(String code501c3) {
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

  public ContactInfo emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ContactInfo address(Address address) {
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

  public ContactInfo web(String web) {
    this.web = web;
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
    ContactInfo contactInfo = (ContactInfo) o;
    return Objects.equals(this.homePhone, contactInfo.homePhone) &&
        Objects.equals(this.cellPhone, contactInfo.cellPhone) &&
        Objects.equals(this.cellCarrier, contactInfo.cellCarrier) &&
        Objects.equals(this.businessPhone, contactInfo.businessPhone) &&
        Objects.equals(this.businessPhoneExt, contactInfo.businessPhoneExt) &&
        Objects.equals(this.faxNumber, contactInfo.faxNumber) &&
        Objects.equals(this.timeZone, contactInfo.timeZone) &&
        Objects.equals(this.utcOffset, contactInfo.utcOffset) &&
        Objects.equals(this.code501c3, contactInfo.code501c3) &&
        Objects.equals(this.emailAddress, contactInfo.emailAddress) &&
        Objects.equals(this.address, contactInfo.address) &&
        Objects.equals(this.web, contactInfo.web);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInfo {\n");
    
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    cellCarrier: ").append(toIndentedString(cellCarrier)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhoneExt: ").append(toIndentedString(businessPhoneExt)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    code501c3: ").append(toIndentedString(code501c3)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
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

