package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserLocationResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  private String locationDisplay;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String profileImage;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse profileAvatar;

  @ApiModelProperty(value = "")

  private String aboutUs;

  @ApiModelProperty(value = "")

  private String locale;

  @ApiModelProperty(value = "")

  private String summaryTitle;

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

  private String age;

public enum GameExperienceEnum {

ANY(String.valueOf("ANY")), NEW(String.valueOf("NEW")), BEGINNER(String.valueOf("BEGINNER")), INTERMEDIATE(String.valueOf("INTERMEDIATE")), EXPERT(String.valueOf("EXPERT"));


    private String value;

    GameExperienceEnum (String v) {
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
    public static GameExperienceEnum fromValue(String value) {
        for (GameExperienceEnum b : GameExperienceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private GameExperienceEnum gameExperience;

  @ApiModelProperty(value = "")

  @Valid

  private ContactResponse contact;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private PersonalProfileResponse personalProfile;

  @ApiModelProperty(value = "")

  @Valid

  private UserSettingsResponse userSettings;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  @Valid

  private PostalCodeResponse currentPostalCode;

  @ApiModelProperty(value = "")

  private String accountType;

  @ApiModelProperty(value = "")

  private Long premiumExpiration;

  @ApiModelProperty(value = "")

  private Integer matchIndex;

  @ApiModelProperty(value = "")

  private String tags;

  @ApiModelProperty(value = "")

  private Long locationLastUpdated;

  @ApiModelProperty(value = "")

  private String distanceFromMe;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public UserLocationResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UserLocationResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public UserLocationResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public UserLocationResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public UserLocationResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public UserLocationResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserLocationResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserLocationResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

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

  public UserLocationResponse accountId(Long accountId) {
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

  public UserLocationResponse locationDisplay(String locationDisplay) {
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

  public UserLocationResponse display(String display) {
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

  public UserLocationResponse username(String username) {
    this.username = username;
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

  public UserLocationResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Get profileAvatar
   * @return profileAvatar
  **/
  @JsonProperty("profileAvatar")
  public AssetShortResponse getProfileAvatar() {
    return profileAvatar;
  }

  public void setProfileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
  }

  public UserLocationResponse profileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
    return this;
  }

 /**
   * Get aboutUs
   * @return aboutUs
  **/
  @JsonProperty("aboutUs")
  public String getAboutUs() {
    return aboutUs;
  }

  public void setAboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
  }

  public UserLocationResponse aboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
    return this;
  }

 /**
   * Get locale
   * @return locale
  **/
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserLocationResponse locale(String locale) {
    this.locale = locale;
    return this;
  }

 /**
   * Get summaryTitle
   * @return summaryTitle
  **/
  @JsonProperty("summaryTitle")
  public String getSummaryTitle() {
    return summaryTitle;
  }

  public void setSummaryTitle(String summaryTitle) {
    this.summaryTitle = summaryTitle;
  }

  public UserLocationResponse summaryTitle(String summaryTitle) {
    this.summaryTitle = summaryTitle;
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

  public UserLocationResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get age
   * @return age
  **/
  @JsonProperty("age")
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public UserLocationResponse age(String age) {
    this.age = age;
    return this;
  }

 /**
   * Get gameExperience
   * @return gameExperience
  **/
  @JsonProperty("gameExperience")
  public String getGameExperience() {
    if (gameExperience == null) {
      return null;
    }
    return gameExperience.value();
  }

  public void setGameExperience(GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
  }

  public UserLocationResponse gameExperience(GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
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

  public UserLocationResponse contact(ContactResponse contact) {
    this.contact = contact;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public UserLocationResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public UserLocationResponse addCategoriesItem(CategoryResponse categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get personalProfile
   * @return personalProfile
  **/
  @JsonProperty("personalProfile")
  public PersonalProfileResponse getPersonalProfile() {
    return personalProfile;
  }

  public void setPersonalProfile(PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
  }

  public UserLocationResponse personalProfile(PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
    return this;
  }

 /**
   * Get userSettings
   * @return userSettings
  **/
  @JsonProperty("userSettings")
  public UserSettingsResponse getUserSettings() {
    return userSettings;
  }

  public void setUserSettings(UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
  }

  public UserLocationResponse userSettings(UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public UserLocationResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public UserLocationResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get currentPostalCode
   * @return currentPostalCode
  **/
  @JsonProperty("currentPostalCode")
  public PostalCodeResponse getCurrentPostalCode() {
    return currentPostalCode;
  }

  public void setCurrentPostalCode(PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  public UserLocationResponse currentPostalCode(PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
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

  public UserLocationResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get premiumExpiration
   * @return premiumExpiration
  **/
  @JsonProperty("premiumExpiration")
  public Long getPremiumExpiration() {
    return premiumExpiration;
  }

  public void setPremiumExpiration(Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
  }

  public UserLocationResponse premiumExpiration(Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
    return this;
  }

 /**
   * Get matchIndex
   * @return matchIndex
  **/
  @JsonProperty("matchIndex")
  public Integer getMatchIndex() {
    return matchIndex;
  }

  public void setMatchIndex(Integer matchIndex) {
    this.matchIndex = matchIndex;
  }

  public UserLocationResponse matchIndex(Integer matchIndex) {
    this.matchIndex = matchIndex;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public UserLocationResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

 /**
   * Get locationLastUpdated
   * @return locationLastUpdated
  **/
  @JsonProperty("locationLastUpdated")
  public Long getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public UserLocationResponse locationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

 /**
   * Get distanceFromMe
   * @return distanceFromMe
  **/
  @JsonProperty("distanceFromMe")
  public String getDistanceFromMe() {
    return distanceFromMe;
  }

  public void setDistanceFromMe(String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
  }

  public UserLocationResponse distanceFromMe(String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public UserLocationResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

