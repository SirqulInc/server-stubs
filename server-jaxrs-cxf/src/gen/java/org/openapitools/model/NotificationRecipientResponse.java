package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationRecipientResponse  {
  
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

  private Long applicationId;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  private Boolean hasApns;

  @ApiModelProperty(value = "")

  private Boolean hasGcm;

  @ApiModelProperty(value = "")

  private Boolean hasEmail;

  @ApiModelProperty(value = "")

  private Boolean hasSms;
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

  public NotificationRecipientResponse accountId(Long accountId) {
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

  public NotificationRecipientResponse locationDisplay(String locationDisplay) {
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

  public NotificationRecipientResponse display(String display) {
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

  public NotificationRecipientResponse username(String username) {
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

  public NotificationRecipientResponse accountType(String accountType) {
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

  public NotificationRecipientResponse profileImage(String profileImage) {
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

  public NotificationRecipientResponse gender(GenderEnum gender) {
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

  public NotificationRecipientResponse contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

 /**
   * Get applicationId
   * @return applicationId
  **/
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public NotificationRecipientResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

 /**
   * Get appName
   * @return appName
  **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public NotificationRecipientResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get hasApns
   * @return hasApns
  **/
  @JsonProperty("hasApns")
  public Boolean getHasApns() {
    return hasApns;
  }

  public void setHasApns(Boolean hasApns) {
    this.hasApns = hasApns;
  }

  public NotificationRecipientResponse hasApns(Boolean hasApns) {
    this.hasApns = hasApns;
    return this;
  }

 /**
   * Get hasGcm
   * @return hasGcm
  **/
  @JsonProperty("hasGcm")
  public Boolean getHasGcm() {
    return hasGcm;
  }

  public void setHasGcm(Boolean hasGcm) {
    this.hasGcm = hasGcm;
  }

  public NotificationRecipientResponse hasGcm(Boolean hasGcm) {
    this.hasGcm = hasGcm;
    return this;
  }

 /**
   * Get hasEmail
   * @return hasEmail
  **/
  @JsonProperty("hasEmail")
  public Boolean getHasEmail() {
    return hasEmail;
  }

  public void setHasEmail(Boolean hasEmail) {
    this.hasEmail = hasEmail;
  }

  public NotificationRecipientResponse hasEmail(Boolean hasEmail) {
    this.hasEmail = hasEmail;
    return this;
  }

 /**
   * Get hasSms
   * @return hasSms
  **/
  @JsonProperty("hasSms")
  public Boolean getHasSms() {
    return hasSms;
  }

  public void setHasSms(Boolean hasSms) {
    this.hasSms = hasSms;
  }

  public NotificationRecipientResponse hasSms(Boolean hasSms) {
    this.hasSms = hasSms;
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
    NotificationRecipientResponse notificationRecipientResponse = (NotificationRecipientResponse) o;
    return Objects.equals(this.accountId, notificationRecipientResponse.accountId) &&
        Objects.equals(this.locationDisplay, notificationRecipientResponse.locationDisplay) &&
        Objects.equals(this.display, notificationRecipientResponse.display) &&
        Objects.equals(this.username, notificationRecipientResponse.username) &&
        Objects.equals(this.accountType, notificationRecipientResponse.accountType) &&
        Objects.equals(this.profileImage, notificationRecipientResponse.profileImage) &&
        Objects.equals(this.gender, notificationRecipientResponse.gender) &&
        Objects.equals(this.contactEmail, notificationRecipientResponse.contactEmail) &&
        Objects.equals(this.applicationId, notificationRecipientResponse.applicationId) &&
        Objects.equals(this.appName, notificationRecipientResponse.appName) &&
        Objects.equals(this.hasApns, notificationRecipientResponse.hasApns) &&
        Objects.equals(this.hasGcm, notificationRecipientResponse.hasGcm) &&
        Objects.equals(this.hasEmail, notificationRecipientResponse.hasEmail) &&
        Objects.equals(this.hasSms, notificationRecipientResponse.hasSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, locationDisplay, display, username, accountType, profileImage, gender, contactEmail, applicationId, appName, hasApns, hasGcm, hasEmail, hasSms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipientResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    hasApns: ").append(toIndentedString(hasApns)).append("\n");
    sb.append("    hasGcm: ").append(toIndentedString(hasGcm)).append("\n");
    sb.append("    hasEmail: ").append(toIndentedString(hasEmail)).append("\n");
    sb.append("    hasSms: ").append(toIndentedString(hasSms)).append("\n");
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

