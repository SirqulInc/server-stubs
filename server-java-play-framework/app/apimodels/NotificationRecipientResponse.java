package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NotificationRecipientResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NotificationRecipientResponse   {
  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("locationDisplay")
  
  private String locationDisplay;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("accountType")
  
  private String accountType;

  @JsonProperty("profileImage")
  
  private String profileImage;

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

  @JsonProperty("gender")
  
  private GenderEnum gender;

  @JsonProperty("contactEmail")
  
  private String contactEmail;

  @JsonProperty("applicationId")
  
  private Long applicationId;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("hasApns")
  
  private Boolean hasApns;

  @JsonProperty("hasGcm")
  
  private Boolean hasGcm;

  @JsonProperty("hasEmail")
  
  private Boolean hasEmail;

  @JsonProperty("hasSms")
  
  private Boolean hasSms;

  public NotificationRecipientResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public NotificationRecipientResponse locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

   /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public NotificationRecipientResponse display(String display) {
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

  public NotificationRecipientResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public NotificationRecipientResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public NotificationRecipientResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public NotificationRecipientResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public NotificationRecipientResponse contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public NotificationRecipientResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public NotificationRecipientResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public NotificationRecipientResponse hasApns(Boolean hasApns) {
    this.hasApns = hasApns;
    return this;
  }

   /**
   * Get hasApns
   * @return hasApns
  **/
  public Boolean getHasApns() {
    return hasApns;
  }

  public void setHasApns(Boolean hasApns) {
    this.hasApns = hasApns;
  }

  public NotificationRecipientResponse hasGcm(Boolean hasGcm) {
    this.hasGcm = hasGcm;
    return this;
  }

   /**
   * Get hasGcm
   * @return hasGcm
  **/
  public Boolean getHasGcm() {
    return hasGcm;
  }

  public void setHasGcm(Boolean hasGcm) {
    this.hasGcm = hasGcm;
  }

  public NotificationRecipientResponse hasEmail(Boolean hasEmail) {
    this.hasEmail = hasEmail;
    return this;
  }

   /**
   * Get hasEmail
   * @return hasEmail
  **/
  public Boolean getHasEmail() {
    return hasEmail;
  }

  public void setHasEmail(Boolean hasEmail) {
    this.hasEmail = hasEmail;
  }

  public NotificationRecipientResponse hasSms(Boolean hasSms) {
    this.hasSms = hasSms;
    return this;
  }

   /**
   * Get hasSms
   * @return hasSms
  **/
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
    return Objects.equals(accountId, notificationRecipientResponse.accountId) &&
        Objects.equals(locationDisplay, notificationRecipientResponse.locationDisplay) &&
        Objects.equals(display, notificationRecipientResponse.display) &&
        Objects.equals(username, notificationRecipientResponse.username) &&
        Objects.equals(accountType, notificationRecipientResponse.accountType) &&
        Objects.equals(profileImage, notificationRecipientResponse.profileImage) &&
        Objects.equals(gender, notificationRecipientResponse.gender) &&
        Objects.equals(contactEmail, notificationRecipientResponse.contactEmail) &&
        Objects.equals(applicationId, notificationRecipientResponse.applicationId) &&
        Objects.equals(appName, notificationRecipientResponse.appName) &&
        Objects.equals(hasApns, notificationRecipientResponse.hasApns) &&
        Objects.equals(hasGcm, notificationRecipientResponse.hasGcm) &&
        Objects.equals(hasEmail, notificationRecipientResponse.hasEmail) &&
        Objects.equals(hasSms, notificationRecipientResponse.hasSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, locationDisplay, display, username, accountType, profileImage, gender, contactEmail, applicationId, appName, hasApns, hasGcm, hasEmail, hasSms);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

