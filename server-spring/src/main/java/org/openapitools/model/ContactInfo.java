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
 * ContactInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ContactInfo {

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

  public ContactInfo homePhone(@Nullable String homePhone) {
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

  public ContactInfo cellPhone(@Nullable String cellPhone) {
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

  public ContactInfo cellCarrier(@Nullable CellCarrier cellCarrier) {
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

  public ContactInfo businessPhone(@Nullable String businessPhone) {
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

  public ContactInfo businessPhoneExt(@Nullable String businessPhoneExt) {
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

  public ContactInfo faxNumber(@Nullable String faxNumber) {
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

  public ContactInfo timeZone(@Nullable String timeZone) {
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

  public ContactInfo utcOffset(@Nullable String utcOffset) {
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

  public ContactInfo code501c3(@Nullable String code501c3) {
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

  public ContactInfo emailAddress(@Nullable String emailAddress) {
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

  public ContactInfo address(@Nullable Address address) {
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

  public ContactInfo web(@Nullable String web) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

