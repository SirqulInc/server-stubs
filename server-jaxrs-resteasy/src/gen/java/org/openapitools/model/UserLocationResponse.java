package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.ContactResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PersonalProfileResponse;
import org.openapitools.model.PostalCodeResponse;
import org.openapitools.model.UserSettingsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserLocationResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long accountId;
  private String locationDisplay;
  private String display;
  private String username;
  private String profileImage;
  private AssetShortResponse profileAvatar;
  private String aboutUs;
  private String locale;
  private String summaryTitle;

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
  private String age;

  /**
   * Gets or Sets gameExperience
   */
  public enum GameExperienceEnum {
    ANY("ANY"),

        NEW("NEW"),

        BEGINNER("BEGINNER"),

        INTERMEDIATE("INTERMEDIATE"),

        EXPERT("EXPERT");
    private String value;

    GameExperienceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GameExperienceEnum gameExperience;
  private ContactResponse contact;
  private List<@Valid CategoryResponse> categories = new ArrayList<>();
  private PersonalProfileResponse personalProfile;
  private UserSettingsResponse userSettings;
  private Double latitude;
  private Double longitude;
  private PostalCodeResponse currentPostalCode;
  private String accountType;
  private Long premiumExpiration;
  private Integer matchIndex;
  private String tags;
  private Long locationLastUpdated;
  private String distanceFromMe;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

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
  @JsonProperty("profileAvatar")
  @Valid
  public AssetShortResponse getProfileAvatar() {
    return profileAvatar;
  }
  public void setProfileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aboutUs")
  public String getAboutUs() {
    return aboutUs;
  }
  public void setAboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("summaryTitle")
  public String getSummaryTitle() {
    return summaryTitle;
  }
  public void setSummaryTitle(String summaryTitle) {
    this.summaryTitle = summaryTitle;
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
  @JsonProperty("age")
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameExperience")
  public GameExperienceEnum getGameExperience() {
    return gameExperience;
  }
  public void setGameExperience(GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contact")
  @Valid
  public ContactResponse getContact() {
    return contact;
  }
  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("personalProfile")
  @Valid
  public PersonalProfileResponse getPersonalProfile() {
    return personalProfile;
  }
  public void setPersonalProfile(PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userSettings")
  @Valid
  public UserSettingsResponse getUserSettings() {
    return userSettings;
  }
  public void setUserSettings(UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentPostalCode")
  @Valid
  public PostalCodeResponse getCurrentPostalCode() {
    return currentPostalCode;
  }
  public void setCurrentPostalCode(PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
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
  @JsonProperty("premiumExpiration")
  public Long getPremiumExpiration() {
    return premiumExpiration;
  }
  public void setPremiumExpiration(Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matchIndex")
  public Integer getMatchIndex() {
    return matchIndex;
  }
  public void setMatchIndex(Integer matchIndex) {
    this.matchIndex = matchIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationLastUpdated")
  public Long getLocationLastUpdated() {
    return locationLastUpdated;
  }
  public void setLocationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distanceFromMe")
  public String getDistanceFromMe() {
    return distanceFromMe;
  }
  public void setDistanceFromMe(String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
    this.returning = returning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLocationResponse userLocationResponse = (UserLocationResponse) o;
    return Objects.equals(this.valid, userLocationResponse.valid) &&
        Objects.equals(this.message, userLocationResponse.message) &&
        Objects.equals(this.version, userLocationResponse.version) &&
        Objects.equals(this.serializeNulls, userLocationResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, userLocationResponse.startTimeLog) &&
        Objects.equals(this.errorCode, userLocationResponse.errorCode) &&
        Objects.equals(this.request, userLocationResponse.request) &&
        Objects.equals(this.accountId, userLocationResponse.accountId) &&
        Objects.equals(this.locationDisplay, userLocationResponse.locationDisplay) &&
        Objects.equals(this.display, userLocationResponse.display) &&
        Objects.equals(this.username, userLocationResponse.username) &&
        Objects.equals(this.profileImage, userLocationResponse.profileImage) &&
        Objects.equals(this.profileAvatar, userLocationResponse.profileAvatar) &&
        Objects.equals(this.aboutUs, userLocationResponse.aboutUs) &&
        Objects.equals(this.locale, userLocationResponse.locale) &&
        Objects.equals(this.summaryTitle, userLocationResponse.summaryTitle) &&
        Objects.equals(this.gender, userLocationResponse.gender) &&
        Objects.equals(this.age, userLocationResponse.age) &&
        Objects.equals(this.gameExperience, userLocationResponse.gameExperience) &&
        Objects.equals(this.contact, userLocationResponse.contact) &&
        Objects.equals(this.categories, userLocationResponse.categories) &&
        Objects.equals(this.personalProfile, userLocationResponse.personalProfile) &&
        Objects.equals(this.userSettings, userLocationResponse.userSettings) &&
        Objects.equals(this.latitude, userLocationResponse.latitude) &&
        Objects.equals(this.longitude, userLocationResponse.longitude) &&
        Objects.equals(this.currentPostalCode, userLocationResponse.currentPostalCode) &&
        Objects.equals(this.accountType, userLocationResponse.accountType) &&
        Objects.equals(this.premiumExpiration, userLocationResponse.premiumExpiration) &&
        Objects.equals(this.matchIndex, userLocationResponse.matchIndex) &&
        Objects.equals(this.tags, userLocationResponse.tags) &&
        Objects.equals(this.locationLastUpdated, userLocationResponse.locationLastUpdated) &&
        Objects.equals(this.distanceFromMe, userLocationResponse.distanceFromMe) &&
        Objects.equals(this.returning, userLocationResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, accountId, locationDisplay, display, username, profileImage, profileAvatar, aboutUs, locale, summaryTitle, gender, age, gameExperience, contact, categories, personalProfile, userSettings, latitude, longitude, currentPostalCode, accountType, premiumExpiration, matchIndex, tags, locationLastUpdated, distanceFromMe, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocationResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    profileAvatar: ").append(toIndentedString(profileAvatar)).append("\n");
    sb.append("    aboutUs: ").append(toIndentedString(aboutUs)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    summaryTitle: ").append(toIndentedString(summaryTitle)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gameExperience: ").append(toIndentedString(gameExperience)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    personalProfile: ").append(toIndentedString(personalProfile)).append("\n");
    sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    currentPostalCode: ").append(toIndentedString(currentPostalCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    premiumExpiration: ").append(toIndentedString(premiumExpiration)).append("\n");
    sb.append("    matchIndex: ").append(toIndentedString(matchIndex)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    locationLastUpdated: ").append(toIndentedString(locationLastUpdated)).append("\n");
    sb.append("    distanceFromMe: ").append(toIndentedString(distanceFromMe)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

