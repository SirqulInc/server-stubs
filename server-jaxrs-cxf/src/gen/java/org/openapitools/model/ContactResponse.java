package org.openapitools.model;

import org.openapitools.model.ContactInfoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContactResponse  {
  
  @ApiModelProperty(value = "")

  private String firstName;

  @ApiModelProperty(value = "")

  private String middleName;

  @ApiModelProperty(value = "")

  private String lastName;

  @ApiModelProperty(value = "")

  private String prefix;

  @ApiModelProperty(value = "")

  private String suffix;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  @Valid

  private ContactInfoResponse contactInfo;
 /**
   * Get firstName
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get middleName
   * @return middleName
  **/
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ContactResponse middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get prefix
   * @return prefix
  **/
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public ContactResponse prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

 /**
   * Get suffix
   * @return suffix
  **/
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public ContactResponse suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ContactResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get contactInfo
   * @return contactInfo
  **/
  @JsonProperty("contactInfo")
  public ContactInfoResponse getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfoResponse contactInfo) {
    this.contactInfo = contactInfo;
  }

  public ContactResponse contactInfo(ContactInfoResponse contactInfo) {
    this.contactInfo = contactInfo;
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
    ContactResponse contactResponse = (ContactResponse) o;
    return Objects.equals(this.firstName, contactResponse.firstName) &&
        Objects.equals(this.middleName, contactResponse.middleName) &&
        Objects.equals(this.lastName, contactResponse.lastName) &&
        Objects.equals(this.prefix, contactResponse.prefix) &&
        Objects.equals(this.suffix, contactResponse.suffix) &&
        Objects.equals(this.title, contactResponse.title) &&
        Objects.equals(this.contactInfo, contactResponse.contactInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, prefix, suffix, title, contactInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponse {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
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

