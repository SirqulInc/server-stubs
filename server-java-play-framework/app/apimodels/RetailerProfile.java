package apimodels;

import apimodels.Address;
import apimodels.CellCarrier;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RetailerProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerProfile   {
  @JsonProperty("detailsHeader")
  
  private String detailsHeader;

  @JsonProperty("detailsBody")
  
  private String detailsBody;

  @JsonProperty("detailsLineLeft1")
  
  private String detailsLineLeft1;

  @JsonProperty("detailsLineLeft2")
  
  private String detailsLineLeft2;

  @JsonProperty("detailsLineRight1")
  
  private String detailsLineRight1;

  @JsonProperty("metaDescription")
  
  private String metaDescription;

  @JsonProperty("directions")
  
  private String directions;

  @JsonProperty("hours")
  
  private String hours;

  @JsonProperty("homePhone")
  
  private String homePhone;

  @JsonProperty("cellPhone")
  
  private String cellPhone;

  @JsonProperty("cellCarrier")
  @Valid

  private CellCarrier cellCarrier;

  @JsonProperty("businessPhone")
  
  private String businessPhone;

  @JsonProperty("businessPhoneExt")
  
  private String businessPhoneExt;

  @JsonProperty("faxNumber")
  
  private String faxNumber;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("utcOffset")
  
  private String utcOffset;

  @JsonProperty("code501c3")
  
  private String code501c3;

  @JsonProperty("emailAddress")
  
  private String emailAddress;

  @JsonProperty("address")
  @Valid

  private Address address;

  @JsonProperty("web")
  
  private String web;

  @JsonProperty("featured")
  
  private Boolean featured;

  @JsonProperty("listed")
  
  private Boolean listed;

  public RetailerProfile detailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

   /**
   * Get detailsHeader
   * @return detailsHeader
  **/
  public String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public RetailerProfile detailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

   /**
   * Get detailsBody
   * @return detailsBody
  **/
  public String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public RetailerProfile detailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
    return this;
  }

   /**
   * Get detailsLineLeft1
   * @return detailsLineLeft1
  **/
  public String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }

  public void setDetailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  public RetailerProfile detailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
    return this;
  }

   /**
   * Get detailsLineLeft2
   * @return detailsLineLeft2
  **/
  public String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }

  public void setDetailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  public RetailerProfile detailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
    return this;
  }

   /**
   * Get detailsLineRight1
   * @return detailsLineRight1
  **/
  public String getDetailsLineRight1() {
    return detailsLineRight1;
  }

  public void setDetailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  public RetailerProfile metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

   /**
   * Get metaDescription
   * @return metaDescription
  **/
  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public RetailerProfile directions(String directions) {
    this.directions = directions;
    return this;
  }

   /**
   * Get directions
   * @return directions
  **/
  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public RetailerProfile hours(String hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public RetailerProfile homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

   /**
   * Get homePhone
   * @return homePhone
  **/
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public RetailerProfile cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

   /**
   * Get cellPhone
   * @return cellPhone
  **/
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public RetailerProfile cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

   /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public RetailerProfile businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public RetailerProfile businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

   /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public RetailerProfile faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public RetailerProfile timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public RetailerProfile utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public RetailerProfile code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

   /**
   * Get code501c3
   * @return code501c3
  **/
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public RetailerProfile emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public RetailerProfile address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public RetailerProfile web(String web) {
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public RetailerProfile featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public RetailerProfile listed(Boolean listed) {
    this.listed = listed;
    return this;
  }

   /**
   * Get listed
   * @return listed
  **/
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
    return Objects.equals(detailsHeader, retailerProfile.detailsHeader) &&
        Objects.equals(detailsBody, retailerProfile.detailsBody) &&
        Objects.equals(detailsLineLeft1, retailerProfile.detailsLineLeft1) &&
        Objects.equals(detailsLineLeft2, retailerProfile.detailsLineLeft2) &&
        Objects.equals(detailsLineRight1, retailerProfile.detailsLineRight1) &&
        Objects.equals(metaDescription, retailerProfile.metaDescription) &&
        Objects.equals(directions, retailerProfile.directions) &&
        Objects.equals(hours, retailerProfile.hours) &&
        Objects.equals(homePhone, retailerProfile.homePhone) &&
        Objects.equals(cellPhone, retailerProfile.cellPhone) &&
        Objects.equals(cellCarrier, retailerProfile.cellCarrier) &&
        Objects.equals(businessPhone, retailerProfile.businessPhone) &&
        Objects.equals(businessPhoneExt, retailerProfile.businessPhoneExt) &&
        Objects.equals(faxNumber, retailerProfile.faxNumber) &&
        Objects.equals(timeZone, retailerProfile.timeZone) &&
        Objects.equals(utcOffset, retailerProfile.utcOffset) &&
        Objects.equals(code501c3, retailerProfile.code501c3) &&
        Objects.equals(emailAddress, retailerProfile.emailAddress) &&
        Objects.equals(address, retailerProfile.address) &&
        Objects.equals(web, retailerProfile.web) &&
        Objects.equals(featured, retailerProfile.featured) &&
        Objects.equals(listed, retailerProfile.listed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailsHeader, detailsBody, detailsLineLeft1, detailsLineLeft2, detailsLineRight1, metaDescription, directions, hours, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, featured, listed);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

