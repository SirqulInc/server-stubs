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
 * Contact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Contact   {
  @JsonProperty("firstName")
  
  private String firstName;

  @JsonProperty("middleName")
  
  private String middleName;

  @JsonProperty("lastName")
  
  private String lastName;

  @JsonProperty("prefix")
  
  private String prefix;

  @JsonProperty("suffix")
  
  private String suffix;

  @JsonProperty("title")
  
  private String title;

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

  @JsonProperty("display")
  
  private String display;

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Contact suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public Contact title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Contact homePhone(String homePhone) {
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

  public Contact cellPhone(String cellPhone) {
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

  public Contact cellCarrier(CellCarrier cellCarrier) {
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

  public Contact businessPhone(String businessPhone) {
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

  public Contact businessPhoneExt(String businessPhoneExt) {
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

  public Contact faxNumber(String faxNumber) {
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

  public Contact timeZone(String timeZone) {
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

  public Contact utcOffset(String utcOffset) {
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

  public Contact code501c3(String code501c3) {
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

  public Contact emailAddress(String emailAddress) {
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

  public Contact address(Address address) {
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

  public Contact web(String web) {
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

  public Contact display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
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
    return Objects.equals(firstName, contact.firstName) &&
        Objects.equals(middleName, contact.middleName) &&
        Objects.equals(lastName, contact.lastName) &&
        Objects.equals(prefix, contact.prefix) &&
        Objects.equals(suffix, contact.suffix) &&
        Objects.equals(title, contact.title) &&
        Objects.equals(homePhone, contact.homePhone) &&
        Objects.equals(cellPhone, contact.cellPhone) &&
        Objects.equals(cellCarrier, contact.cellCarrier) &&
        Objects.equals(businessPhone, contact.businessPhone) &&
        Objects.equals(businessPhoneExt, contact.businessPhoneExt) &&
        Objects.equals(faxNumber, contact.faxNumber) &&
        Objects.equals(timeZone, contact.timeZone) &&
        Objects.equals(utcOffset, contact.utcOffset) &&
        Objects.equals(code501c3, contact.code501c3) &&
        Objects.equals(emailAddress, contact.emailAddress) &&
        Objects.equals(address, contact.address) &&
        Objects.equals(web, contact.web) &&
        Objects.equals(display, contact.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, prefix, suffix, title, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, display);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

