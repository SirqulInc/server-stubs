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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerProfile   {
  
  private String detailsHeader;
  private String detailsBody;
  private String detailsLineLeft1;
  private String detailsLineLeft2;
  private String detailsLineRight1;
  private String metaDescription;
  private String directions;
  private String hours;
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
  private Boolean featured;
  private Boolean listed;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsHeader")
  public String getDetailsHeader() {
    return detailsHeader;
  }
  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsBody")
  public String getDetailsBody() {
    return detailsBody;
  }
  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsLineLeft1")
  public String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }
  public void setDetailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsLineLeft2")
  public String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }
  public void setDetailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsLineRight1")
  public String getDetailsLineRight1() {
    return detailsLineRight1;
  }
  public void setDetailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metaDescription")
  public String getMetaDescription() {
    return metaDescription;
  }
  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("directions")
  public String getDirections() {
    return directions;
  }
  public void setDirections(String directions) {
    this.directions = directions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }
  public void setHours(String hours) {
    this.hours = hours;
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
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }
  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listed")
  public Boolean getListed() {
    return listed;
  }
  public void setListed(Boolean listed) {
    this.listed = listed;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

