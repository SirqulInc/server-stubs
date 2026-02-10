package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationRecipientResponse   {
  
  private Long accountId;
  private String locationDisplay;
  private String display;
  private String username;
  private String accountType;
  private String profileImage;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),

        FEMALE("FEMALE"),

        ANY("ANY");
    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GenderEnum gender;
  private String contactEmail;
  private Long applicationId;
  private String appName;
  private Boolean hasApns;
  private Boolean hasGcm;
  private Boolean hasEmail;
  private Boolean hasSms;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }
  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contactEmail")
  public String getContactEmail() {
    return contactEmail;
  }
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasApns")
  public Boolean getHasApns() {
    return hasApns;
  }
  public void setHasApns(Boolean hasApns) {
    this.hasApns = hasApns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasGcm")
  public Boolean getHasGcm() {
    return hasGcm;
  }
  public void setHasGcm(Boolean hasGcm) {
    this.hasGcm = hasGcm;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasEmail")
  public Boolean getHasEmail() {
    return hasEmail;
  }
  public void setHasEmail(Boolean hasEmail) {
    this.hasEmail = hasEmail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasSms")
  public Boolean getHasSms() {
    return hasSms;
  }
  public void setHasSms(Boolean hasSms) {
    this.hasSms = hasSms;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

