package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Address;
import org.openapitools.model.CellCarrier;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RetailerProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerProfile {

  private @Nullable String detailsHeader;

  private @Nullable String detailsBody;

  private @Nullable String detailsLineLeft1;

  private @Nullable String detailsLineLeft2;

  private @Nullable String detailsLineRight1;

  private @Nullable String metaDescription;

  private @Nullable String directions;

  private @Nullable String hours;

  private @Nullable String homePhone;

  private @Nullable String cellPhone;

  private @Nullable CellCarrier cellCarrier;

  private @Nullable String businessPhone;

  private @Nullable String businessPhoneExt;

  private @Nullable String faxNumber;

  private @Nullable String timeZone;

  private @Nullable String utcOffset;

  private @Nullable String code501c3;

  private @Nullable String emailAddress;

  private @Nullable Address address;

  private @Nullable String web;

  private @Nullable Boolean featured;

  private @Nullable Boolean listed;

  public RetailerProfile detailsHeader(@Nullable String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

  /**
   * Get detailsHeader
   * @return detailsHeader
   */
  
  @Schema(name = "detailsHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsHeader")
  public @Nullable String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(@Nullable String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public RetailerProfile detailsBody(@Nullable String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

  /**
   * Get detailsBody
   * @return detailsBody
   */
  
  @Schema(name = "detailsBody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsBody")
  public @Nullable String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(@Nullable String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public RetailerProfile detailsLineLeft1(@Nullable String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
    return this;
  }

  /**
   * Get detailsLineLeft1
   * @return detailsLineLeft1
   */
  
  @Schema(name = "detailsLineLeft1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsLineLeft1")
  public @Nullable String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }

  public void setDetailsLineLeft1(@Nullable String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  public RetailerProfile detailsLineLeft2(@Nullable String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
    return this;
  }

  /**
   * Get detailsLineLeft2
   * @return detailsLineLeft2
   */
  
  @Schema(name = "detailsLineLeft2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsLineLeft2")
  public @Nullable String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }

  public void setDetailsLineLeft2(@Nullable String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  public RetailerProfile detailsLineRight1(@Nullable String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
    return this;
  }

  /**
   * Get detailsLineRight1
   * @return detailsLineRight1
   */
  
  @Schema(name = "detailsLineRight1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsLineRight1")
  public @Nullable String getDetailsLineRight1() {
    return detailsLineRight1;
  }

  public void setDetailsLineRight1(@Nullable String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  public RetailerProfile metaDescription(@Nullable String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

  /**
   * Get metaDescription
   * @return metaDescription
   */
  
  @Schema(name = "metaDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaDescription")
  public @Nullable String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(@Nullable String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public RetailerProfile directions(@Nullable String directions) {
    this.directions = directions;
    return this;
  }

  /**
   * Get directions
   * @return directions
   */
  
  @Schema(name = "directions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("directions")
  public @Nullable String getDirections() {
    return directions;
  }

  public void setDirections(@Nullable String directions) {
    this.directions = directions;
  }

  public RetailerProfile hours(@Nullable String hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
   */
  
  @Schema(name = "hours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hours")
  public @Nullable String getHours() {
    return hours;
  }

  public void setHours(@Nullable String hours) {
    this.hours = hours;
  }

  public RetailerProfile homePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  /**
   * Get homePhone
   * @return homePhone
   */
  
  @Schema(name = "homePhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homePhone")
  public @Nullable String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
  }

  public RetailerProfile cellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
   */
  
  @Schema(name = "cellPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellPhone")
  public @Nullable String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public RetailerProfile cellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

  /**
   * Get cellCarrier
   * @return cellCarrier
   */
  @Valid 
  @Schema(name = "cellCarrier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellCarrier")
  public @Nullable CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public RetailerProfile businessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

  /**
   * Get businessPhone
   * @return businessPhone
   */
  
  @Schema(name = "businessPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhone")
  public @Nullable String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public RetailerProfile businessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

  /**
   * Get businessPhoneExt
   * @return businessPhoneExt
   */
  
  @Schema(name = "businessPhoneExt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhoneExt")
  public @Nullable String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public RetailerProfile faxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Get faxNumber
   * @return faxNumber
   */
  
  @Schema(name = "faxNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("faxNumber")
  public @Nullable String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public RetailerProfile timeZone(@Nullable String timeZone) {
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

  public RetailerProfile utcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * Get utcOffset
   * @return utcOffset
   */
  
  @Schema(name = "utcOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("utcOffset")
  public @Nullable String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public RetailerProfile code501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

  /**
   * Get code501c3
   * @return code501c3
   */
  
  @Schema(name = "code501c3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code501c3")
  public @Nullable String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
  }

  public RetailerProfile emailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  
  @Schema(name = "emailAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public @Nullable String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public RetailerProfile address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  public RetailerProfile web(@Nullable String web) {
    this.web = web;
    return this;
  }

  /**
   * Get web
   * @return web
   */
  
  @Schema(name = "web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web")
  public @Nullable String getWeb() {
    return web;
  }

  public void setWeb(@Nullable String web) {
    this.web = web;
  }

  public RetailerProfile featured(@Nullable Boolean featured) {
    this.featured = featured;
    return this;
  }

  /**
   * Get featured
   * @return featured
   */
  
  @Schema(name = "featured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featured")
  public @Nullable Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(@Nullable Boolean featured) {
    this.featured = featured;
  }

  public RetailerProfile listed(@Nullable Boolean listed) {
    this.listed = listed;
    return this;
  }

  /**
   * Get listed
   * @return listed
   */
  
  @Schema(name = "listed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listed")
  public @Nullable Boolean getListed() {
    return listed;
  }

  public void setListed(@Nullable Boolean listed) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

