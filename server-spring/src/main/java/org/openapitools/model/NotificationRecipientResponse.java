package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationRecipientResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationRecipientResponse {

  private @Nullable Long accountId;

  private @Nullable String locationDisplay;

  private @Nullable String display;

  private @Nullable String username;

  private @Nullable String accountType;

  private @Nullable String profileImage;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    ANY("ANY");

    private final String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable GenderEnum gender;

  private @Nullable String contactEmail;

  private @Nullable Long applicationId;

  private @Nullable String appName;

  private @Nullable Boolean hasApns;

  private @Nullable Boolean hasGcm;

  private @Nullable Boolean hasEmail;

  private @Nullable Boolean hasSms;

  public NotificationRecipientResponse accountId(@Nullable Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  
  @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public @Nullable Long getAccountId() {
    return accountId;
  }

  public void setAccountId(@Nullable Long accountId) {
    this.accountId = accountId;
  }

  public NotificationRecipientResponse locationDisplay(@Nullable String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

  /**
   * Get locationDisplay
   * @return locationDisplay
   */
  
  @Schema(name = "locationDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDisplay")
  public @Nullable String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(@Nullable String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public NotificationRecipientResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public NotificationRecipientResponse username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public NotificationRecipientResponse accountType(@Nullable String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   */
  
  @Schema(name = "accountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountType")
  public @Nullable String getAccountType() {
    return accountType;
  }

  public void setAccountType(@Nullable String accountType) {
    this.accountType = accountType;
  }

  public NotificationRecipientResponse profileImage(@Nullable String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
   */
  
  @Schema(name = "profileImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileImage")
  public @Nullable String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(@Nullable String profileImage) {
    this.profileImage = profileImage;
  }

  public NotificationRecipientResponse gender(@Nullable GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable GenderEnum getGender() {
    return gender;
  }

  public void setGender(@Nullable GenderEnum gender) {
    this.gender = gender;
  }

  public NotificationRecipientResponse contactEmail(@Nullable String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Get contactEmail
   * @return contactEmail
   */
  
  @Schema(name = "contactEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactEmail")
  public @Nullable String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(@Nullable String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public NotificationRecipientResponse applicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  
  @Schema(name = "applicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationId")
  public @Nullable Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
  }

  public NotificationRecipientResponse appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public @Nullable String getAppName() {
    return appName;
  }

  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public NotificationRecipientResponse hasApns(@Nullable Boolean hasApns) {
    this.hasApns = hasApns;
    return this;
  }

  /**
   * Get hasApns
   * @return hasApns
   */
  
  @Schema(name = "hasApns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasApns")
  public @Nullable Boolean getHasApns() {
    return hasApns;
  }

  public void setHasApns(@Nullable Boolean hasApns) {
    this.hasApns = hasApns;
  }

  public NotificationRecipientResponse hasGcm(@Nullable Boolean hasGcm) {
    this.hasGcm = hasGcm;
    return this;
  }

  /**
   * Get hasGcm
   * @return hasGcm
   */
  
  @Schema(name = "hasGcm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasGcm")
  public @Nullable Boolean getHasGcm() {
    return hasGcm;
  }

  public void setHasGcm(@Nullable Boolean hasGcm) {
    this.hasGcm = hasGcm;
  }

  public NotificationRecipientResponse hasEmail(@Nullable Boolean hasEmail) {
    this.hasEmail = hasEmail;
    return this;
  }

  /**
   * Get hasEmail
   * @return hasEmail
   */
  
  @Schema(name = "hasEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasEmail")
  public @Nullable Boolean getHasEmail() {
    return hasEmail;
  }

  public void setHasEmail(@Nullable Boolean hasEmail) {
    this.hasEmail = hasEmail;
  }

  public NotificationRecipientResponse hasSms(@Nullable Boolean hasSms) {
    this.hasSms = hasSms;
    return this;
  }

  /**
   * Get hasSms
   * @return hasSms
   */
  
  @Schema(name = "hasSms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasSms")
  public @Nullable Boolean getHasSms() {
    return hasSms;
  }

  public void setHasSms(@Nullable Boolean hasSms) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

