package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Address;
import org.openapitools.model.CellCarrier;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Contact   {
  
  private String firstName;
  private String middleName;
  private String lastName;
  private String prefix;
  private String suffix;
  private String title;
  private String homePhone;
  private String cellPhone;
  private CellCarrier cellCarrier;
  private String businessPhone;
  private String businessPhoneExt;
  private String faxNumber;
  private String timeZone;
  private String utcOffset;
  private String code501c3;
  private String emailAddress;
  private Address address;
  private String web;
  private String display;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellCarrier")
  @Valid
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }
  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }
  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }
  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
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
  public String getUtcOffset() {
    return utcOffset;
  }
  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }
  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }
  public void setWeb(String web) {
    this.web = web;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
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
    Contact contact = (Contact) o;
    return Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.middleName, contact.middleName) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.prefix, contact.prefix) &&
        Objects.equals(this.suffix, contact.suffix) &&
        Objects.equals(this.title, contact.title) &&
        Objects.equals(this.homePhone, contact.homePhone) &&
        Objects.equals(this.cellPhone, contact.cellPhone) &&
        Objects.equals(this.cellCarrier, contact.cellCarrier) &&
        Objects.equals(this.businessPhone, contact.businessPhone) &&
        Objects.equals(this.businessPhoneExt, contact.businessPhoneExt) &&
        Objects.equals(this.faxNumber, contact.faxNumber) &&
        Objects.equals(this.timeZone, contact.timeZone) &&
        Objects.equals(this.utcOffset, contact.utcOffset) &&
        Objects.equals(this.code501c3, contact.code501c3) &&
        Objects.equals(this.emailAddress, contact.emailAddress) &&
        Objects.equals(this.address, contact.address) &&
        Objects.equals(this.web, contact.web) &&
        Objects.equals(this.display, contact.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, prefix, suffix, title, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

