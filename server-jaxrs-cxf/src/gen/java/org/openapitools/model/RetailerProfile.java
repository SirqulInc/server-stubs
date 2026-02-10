package org.openapitools.model;

import org.openapitools.model.Address;
import org.openapitools.model.CellCarrier;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerProfile  {
  
  @ApiModelProperty(value = "")

  private String detailsHeader;

  @ApiModelProperty(value = "")

  private String detailsBody;

  @ApiModelProperty(value = "")

  private String detailsLineLeft1;

  @ApiModelProperty(value = "")

  private String detailsLineLeft2;

  @ApiModelProperty(value = "")

  private String detailsLineRight1;

  @ApiModelProperty(value = "")

  private String metaDescription;

  @ApiModelProperty(value = "")

  private String directions;

  @ApiModelProperty(value = "")

  private String hours;

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

  @ApiModelProperty(value = "")

  private Boolean featured;

  @ApiModelProperty(value = "")

  private Boolean listed;
 /**
   * Get detailsHeader
   * @return detailsHeader
  **/
  @JsonProperty("detailsHeader")
  public String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public RetailerProfile detailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

 /**
   * Get detailsBody
   * @return detailsBody
  **/
  @JsonProperty("detailsBody")
  public String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public RetailerProfile detailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

 /**
   * Get detailsLineLeft1
   * @return detailsLineLeft1
  **/
  @JsonProperty("detailsLineLeft1")
  public String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }

  public void setDetailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  public RetailerProfile detailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
    return this;
  }

 /**
   * Get detailsLineLeft2
   * @return detailsLineLeft2
  **/
  @JsonProperty("detailsLineLeft2")
  public String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }

  public void setDetailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  public RetailerProfile detailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
    return this;
  }

 /**
   * Get detailsLineRight1
   * @return detailsLineRight1
  **/
  @JsonProperty("detailsLineRight1")
  public String getDetailsLineRight1() {
    return detailsLineRight1;
  }

  public void setDetailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  public RetailerProfile detailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
    return this;
  }

 /**
   * Get metaDescription
   * @return metaDescription
  **/
  @JsonProperty("metaDescription")
  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public RetailerProfile metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

 /**
   * Get directions
   * @return directions
  **/
  @JsonProperty("directions")
  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public RetailerProfile directions(String directions) {
    this.directions = directions;
    return this;
  }

 /**
   * Get hours
   * @return hours
  **/
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public RetailerProfile hours(String hours) {
    this.hours = hours;
    return this;
  }

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

  public RetailerProfile homePhone(String homePhone) {
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

  public RetailerProfile cellPhone(String cellPhone) {
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

  public RetailerProfile cellCarrier(CellCarrier cellCarrier) {
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

  public RetailerProfile businessPhone(String businessPhone) {
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

  public RetailerProfile businessPhoneExt(String businessPhoneExt) {
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

  public RetailerProfile faxNumber(String faxNumber) {
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

  public RetailerProfile timeZone(String timeZone) {
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

  public RetailerProfile utcOffset(String utcOffset) {
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

  public RetailerProfile code501c3(String code501c3) {
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

  public RetailerProfile emailAddress(String emailAddress) {
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

  public RetailerProfile address(Address address) {
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

  public RetailerProfile web(String web) {
    this.web = web;
    return this;
  }

 /**
   * Get featured
   * @return featured
  **/
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public RetailerProfile featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

 /**
   * Get listed
   * @return listed
  **/
  @JsonProperty("listed")
  public Boolean getListed() {
    return listed;
  }

  public void setListed(Boolean listed) {
    this.listed = listed;
  }

  public RetailerProfile listed(Boolean listed) {
    this.listed = listed;
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
    RetailerProfile retailerProfile = (RetailerProfile) o;
    return Objects.equals(this.detailsHeader, retailerProfile.detailsHeader) &&
        Objects.equals(this.detailsBody, retailerProfile.detailsBody) &&
        Objects.equals(this.detailsLineLeft1, retailerProfile.detailsLineLeft1) &&
        Objects.equals(this.detailsLineLeft2, retailerProfile.detailsLineLeft2) &&
        Objects.equals(this.detailsLineRight1, retailerProfile.detailsLineRight1) &&
        Objects.equals(this.metaDescription, retailerProfile.metaDescription) &&
        Objects.equals(this.directions, retailerProfile.directions) &&
        Objects.equals(this.hours, retailerProfile.hours) &&
        Objects.equals(this.homePhone, retailerProfile.homePhone) &&
        Objects.equals(this.cellPhone, retailerProfile.cellPhone) &&
        Objects.equals(this.cellCarrier, retailerProfile.cellCarrier) &&
        Objects.equals(this.businessPhone, retailerProfile.businessPhone) &&
        Objects.equals(this.businessPhoneExt, retailerProfile.businessPhoneExt) &&
        Objects.equals(this.faxNumber, retailerProfile.faxNumber) &&
        Objects.equals(this.timeZone, retailerProfile.timeZone) &&
        Objects.equals(this.utcOffset, retailerProfile.utcOffset) &&
        Objects.equals(this.code501c3, retailerProfile.code501c3) &&
        Objects.equals(this.emailAddress, retailerProfile.emailAddress) &&
        Objects.equals(this.address, retailerProfile.address) &&
        Objects.equals(this.web, retailerProfile.web) &&
        Objects.equals(this.featured, retailerProfile.featured) &&
        Objects.equals(this.listed, retailerProfile.listed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailsHeader, detailsBody, detailsLineLeft1, detailsLineLeft2, detailsLineRight1, metaDescription, directions, hours, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, featured, listed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerProfile {\n");
    
    sb.append("    detailsHeader: ").append(toIndentedString(detailsHeader)).append("\n");
    sb.append("    detailsBody: ").append(toIndentedString(detailsBody)).append("\n");
    sb.append("    detailsLineLeft1: ").append(toIndentedString(detailsLineLeft1)).append("\n");
    sb.append("    detailsLineLeft2: ").append(toIndentedString(detailsLineLeft2)).append("\n");
    sb.append("    detailsLineRight1: ").append(toIndentedString(detailsLineRight1)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    listed: ").append(toIndentedString(listed)).append("\n");
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

