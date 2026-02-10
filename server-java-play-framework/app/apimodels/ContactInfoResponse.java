package apimodels;

import apimodels.AddressResponse;
import apimodels.CellCarrierResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ContactInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ContactInfoResponse   {
  @JsonProperty("homePhone")
  
  private String homePhone;

  @JsonProperty("cellPhone")
  
  private String cellPhone;

  @JsonProperty("cellPhoneCarrier")
  
  private String cellPhoneCarrier;

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

  private AddressResponse address;

  @JsonProperty("web")
  
  private String web;

  @JsonProperty("cellCarrier")
  @Valid

  private CellCarrierResponse cellCarrier;

  public ContactInfoResponse homePhone(String homePhone) {
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

  public ContactInfoResponse cellPhone(String cellPhone) {
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

  public ContactInfoResponse cellPhoneCarrier(String cellPhoneCarrier) {
    this.cellPhoneCarrier = cellPhoneCarrier;
    return this;
  }

   /**
   * Get cellPhoneCarrier
   * @return cellPhoneCarrier
  **/
  public String getCellPhoneCarrier() {
    return cellPhoneCarrier;
  }

  public void setCellPhoneCarrier(String cellPhoneCarrier) {
    this.cellPhoneCarrier = cellPhoneCarrier;
  }

  public ContactInfoResponse businessPhone(String businessPhone) {
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

  public ContactInfoResponse businessPhoneExt(String businessPhoneExt) {
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

  public ContactInfoResponse faxNumber(String faxNumber) {
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

  public ContactInfoResponse timeZone(String timeZone) {
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

  public ContactInfoResponse utcOffset(String utcOffset) {
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

  public ContactInfoResponse code501c3(String code501c3) {
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

  public ContactInfoResponse emailAddress(String emailAddress) {
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

  public ContactInfoResponse address(AddressResponse address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public AddressResponse getAddress() {
    return address;
  }

  public void setAddress(AddressResponse address) {
    this.address = address;
  }

  public ContactInfoResponse web(String web) {
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

  public ContactInfoResponse cellCarrier(CellCarrierResponse cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

   /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  public CellCarrierResponse getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrierResponse cellCarrier) {
    this.cellCarrier = cellCarrier;
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
    return Objects.equals(homePhone, contactInfoResponse.homePhone) &&
        Objects.equals(cellPhone, contactInfoResponse.cellPhone) &&
        Objects.equals(cellPhoneCarrier, contactInfoResponse.cellPhoneCarrier) &&
        Objects.equals(businessPhone, contactInfoResponse.businessPhone) &&
        Objects.equals(businessPhoneExt, contactInfoResponse.businessPhoneExt) &&
        Objects.equals(faxNumber, contactInfoResponse.faxNumber) &&
        Objects.equals(timeZone, contactInfoResponse.timeZone) &&
        Objects.equals(utcOffset, contactInfoResponse.utcOffset) &&
        Objects.equals(code501c3, contactInfoResponse.code501c3) &&
        Objects.equals(emailAddress, contactInfoResponse.emailAddress) &&
        Objects.equals(address, contactInfoResponse.address) &&
        Objects.equals(web, contactInfoResponse.web) &&
        Objects.equals(cellCarrier, contactInfoResponse.cellCarrier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homePhone, cellPhone, cellPhoneCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, cellCarrier);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

