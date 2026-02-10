package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserLocationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserLocationResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long accountId;

  private @Nullable String locationDisplay;

  private @Nullable String display;

  private @Nullable String username;

  private @Nullable String profileImage;

  private @Nullable AssetShortResponse profileAvatar;

  private @Nullable String aboutUs;

  private @Nullable String locale;

  private @Nullable String summaryTitle;

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

  private @Nullable String age;

  /**
   * Gets or Sets gameExperience
   */
  public enum GameExperienceEnum {
    ANY("ANY"),
    
    NEW("NEW"),
    
    BEGINNER("BEGINNER"),
    
    INTERMEDIATE("INTERMEDIATE"),
    
    EXPERT("EXPERT");

    private final String value;

    GameExperienceEnum(String value) {
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
    public static GameExperienceEnum fromValue(String value) {
      for (GameExperienceEnum b : GameExperienceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GameExperienceEnum gameExperience;

  private @Nullable ContactResponse contact;

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  private @Nullable PersonalProfileResponse personalProfile;

  private @Nullable UserSettingsResponse userSettings;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable PostalCodeResponse currentPostalCode;

  private @Nullable String accountType;

  private @Nullable Long premiumExpiration;

  private @Nullable Integer matchIndex;

  private @Nullable String tags;

  private @Nullable Long locationLastUpdated;

  private @Nullable String distanceFromMe;

  private @Nullable String returning;

  public UserLocationResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public UserLocationResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public UserLocationResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public UserLocationResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public UserLocationResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public UserLocationResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public UserLocationResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserLocationResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserLocationResponse accountId(@Nullable Long accountId) {
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

  public UserLocationResponse locationDisplay(@Nullable String locationDisplay) {
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

  public UserLocationResponse display(@Nullable String display) {
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

  public UserLocationResponse username(@Nullable String username) {
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

  public UserLocationResponse profileImage(@Nullable String profileImage) {
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

  public UserLocationResponse profileAvatar(@Nullable AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
    return this;
  }

  /**
   * Get profileAvatar
   * @return profileAvatar
   */
  @Valid 
  @Schema(name = "profileAvatar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileAvatar")
  public @Nullable AssetShortResponse getProfileAvatar() {
    return profileAvatar;
  }

  public void setProfileAvatar(@Nullable AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
  }

  public UserLocationResponse aboutUs(@Nullable String aboutUs) {
    this.aboutUs = aboutUs;
    return this;
  }

  /**
   * Get aboutUs
   * @return aboutUs
   */
  
  @Schema(name = "aboutUs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aboutUs")
  public @Nullable String getAboutUs() {
    return aboutUs;
  }

  public void setAboutUs(@Nullable String aboutUs) {
    this.aboutUs = aboutUs;
  }

  public UserLocationResponse locale(@Nullable String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public @Nullable String getLocale() {
    return locale;
  }

  public void setLocale(@Nullable String locale) {
    this.locale = locale;
  }

  public UserLocationResponse summaryTitle(@Nullable String summaryTitle) {
    this.summaryTitle = summaryTitle;
    return this;
  }

  /**
   * Get summaryTitle
   * @return summaryTitle
   */
  
  @Schema(name = "summaryTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summaryTitle")
  public @Nullable String getSummaryTitle() {
    return summaryTitle;
  }

  public void setSummaryTitle(@Nullable String summaryTitle) {
    this.summaryTitle = summaryTitle;
  }

  public UserLocationResponse gender(@Nullable GenderEnum gender) {
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

  public UserLocationResponse age(@Nullable String age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  
  @Schema(name = "age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public @Nullable String getAge() {
    return age;
  }

  public void setAge(@Nullable String age) {
    this.age = age;
  }

  public UserLocationResponse gameExperience(@Nullable GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
    return this;
  }

  /**
   * Get gameExperience
   * @return gameExperience
   */
  
  @Schema(name = "gameExperience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameExperience")
  public @Nullable GameExperienceEnum getGameExperience() {
    return gameExperience;
  }

  public void setGameExperience(@Nullable GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
  }

  public UserLocationResponse contact(@Nullable ContactResponse contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public @Nullable ContactResponse getContact() {
    return contact;
  }

  public void setContact(@Nullable ContactResponse contact) {
    this.contact = contact;
  }

  public UserLocationResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public UserLocationResponse addCategoriesItem(CategoryResponse categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public UserLocationResponse personalProfile(@Nullable PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
    return this;
  }

  /**
   * Get personalProfile
   * @return personalProfile
   */
  @Valid 
  @Schema(name = "personalProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalProfile")
  public @Nullable PersonalProfileResponse getPersonalProfile() {
    return personalProfile;
  }

  public void setPersonalProfile(@Nullable PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
  }

  public UserLocationResponse userSettings(@Nullable UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
    return this;
  }

  /**
   * Get userSettings
   * @return userSettings
   */
  @Valid 
  @Schema(name = "userSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userSettings")
  public @Nullable UserSettingsResponse getUserSettings() {
    return userSettings;
  }

  public void setUserSettings(@Nullable UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
  }

  public UserLocationResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public UserLocationResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public UserLocationResponse currentPostalCode(@Nullable PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
    return this;
  }

  /**
   * Get currentPostalCode
   * @return currentPostalCode
   */
  @Valid 
  @Schema(name = "currentPostalCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPostalCode")
  public @Nullable PostalCodeResponse getCurrentPostalCode() {
    return currentPostalCode;
  }

  public void setCurrentPostalCode(@Nullable PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  public UserLocationResponse accountType(@Nullable String accountType) {
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

  public UserLocationResponse premiumExpiration(@Nullable Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
    return this;
  }

  /**
   * Get premiumExpiration
   * @return premiumExpiration
   */
  
  @Schema(name = "premiumExpiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("premiumExpiration")
  public @Nullable Long getPremiumExpiration() {
    return premiumExpiration;
  }

  public void setPremiumExpiration(@Nullable Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
  }

  public UserLocationResponse matchIndex(@Nullable Integer matchIndex) {
    this.matchIndex = matchIndex;
    return this;
  }

  /**
   * Get matchIndex
   * @return matchIndex
   */
  
  @Schema(name = "matchIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchIndex")
  public @Nullable Integer getMatchIndex() {
    return matchIndex;
  }

  public void setMatchIndex(@Nullable Integer matchIndex) {
    this.matchIndex = matchIndex;
  }

  public UserLocationResponse tags(@Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public @Nullable String getTags() {
    return tags;
  }

  public void setTags(@Nullable String tags) {
    this.tags = tags;
  }

  public UserLocationResponse locationLastUpdated(@Nullable Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

  /**
   * Get locationLastUpdated
   * @return locationLastUpdated
   */
  
  @Schema(name = "locationLastUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationLastUpdated")
  public @Nullable Long getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(@Nullable Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public UserLocationResponse distanceFromMe(@Nullable String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
    return this;
  }

  /**
   * Get distanceFromMe
   * @return distanceFromMe
   */
  
  @Schema(name = "distanceFromMe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distanceFromMe")
  public @Nullable String getDistanceFromMe() {
    return distanceFromMe;
  }

  public void setDistanceFromMe(@Nullable String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
  }

  public UserLocationResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

