package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.ContactResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountResponse  {
  
  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  private String locationDisplay;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String accountType;

  @ApiModelProperty(value = "")

  private String profileImage;

public enum GenderEnum {

MALE(String.valueOf("MALE")), FEMALE(String.valueOf("FEMALE")), ANY(String.valueOf("ANY"));


    private String value;

    GenderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
        for (GenderEnum b : GenderEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private GenderEnum gender;

  @ApiModelProperty(value = "")

  private String contactEmail;

  @ApiModelProperty(value = "")

  @Valid

  private ContactResponse contact;

  @ApiModelProperty(value = "")

  @Valid

  private AccountMiniResponse manager;

  @ApiModelProperty(value = "")

  private Boolean active;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AccountResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public AccountResponse locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public AccountResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountResponse username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get profileImage
   * @return profileImage
  **/
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public AccountResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    if (gender == null) {
      return null;
    }
    return gender.value();
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public AccountResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get contactEmail
   * @return contactEmail
  **/
  @JsonProperty("contactEmail")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public AccountResponse contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public ContactResponse getContact() {
    return contact;
  }

  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  public AccountResponse contact(ContactResponse contact) {
    this.contact = contact;
    return this;
  }

 /**
   * Get manager
   * @return manager
  **/
  @JsonProperty("manager")
  public AccountMiniResponse getManager() {
    return manager;
  }

  public void setManager(AccountMiniResponse manager) {
    this.manager = manager;
  }

  public AccountResponse manager(AccountMiniResponse manager) {
    this.manager = manager;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AccountResponse active(Boolean active) {
    this.active = active;
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
    AccountResponse accountResponse = (AccountResponse) o;
    return Objects.equals(this.accountId, accountResponse.accountId) &&
        Objects.equals(this.locationDisplay, accountResponse.locationDisplay) &&
        Objects.equals(this.display, accountResponse.display) &&
        Objects.equals(this.username, accountResponse.username) &&
        Objects.equals(this.accountType, accountResponse.accountType) &&
        Objects.equals(this.profileImage, accountResponse.profileImage) &&
        Objects.equals(this.gender, accountResponse.gender) &&
        Objects.equals(this.contactEmail, accountResponse.contactEmail) &&
        Objects.equals(this.contact, accountResponse.contact) &&
        Objects.equals(this.manager, accountResponse.manager) &&
        Objects.equals(this.active, accountResponse.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, locationDisplay, display, username, accountType, profileImage, gender, contactEmail, contact, manager, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

