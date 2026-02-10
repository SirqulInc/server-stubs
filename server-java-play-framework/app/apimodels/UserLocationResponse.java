package apimodels;

import apimodels.AssetShortResponse;
import apimodels.CategoryResponse;
import apimodels.ContactResponse;
import apimodels.NameStringValueResponse;
import apimodels.PersonalProfileResponse;
import apimodels.PostalCodeResponse;
import apimodels.UserSettingsResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserLocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserLocationResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("locationDisplay")
  
  private String locationDisplay;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("profileImage")
  
  private String profileImage;

  @JsonProperty("profileAvatar")
  @Valid

  private AssetShortResponse profileAvatar;

  @JsonProperty("aboutUs")
  
  private String aboutUs;

  @JsonProperty("locale")
  
  private String locale;

  @JsonProperty("summaryTitle")
  
  private String summaryTitle;

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

  @JsonProperty("age")
  
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

    private final String value;

    GameExperienceEnum(String value) {
      this.value = value;
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

  @JsonProperty("gameExperience")
  
  private GameExperienceEnum gameExperience;

  @JsonProperty("contact")
  @Valid

  private ContactResponse contact;

  @JsonProperty("categories")
  @Valid

  private List<@Valid CategoryResponse> categories = null;

  @JsonProperty("personalProfile")
  @Valid

  private PersonalProfileResponse personalProfile;

  @JsonProperty("userSettings")
  @Valid

  private UserSettingsResponse userSettings;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("currentPostalCode")
  @Valid

  private PostalCodeResponse currentPostalCode;

  @JsonProperty("accountType")
  
  private String accountType;

  @JsonProperty("premiumExpiration")
  
  private Long premiumExpiration;

  @JsonProperty("matchIndex")
  
  private Integer matchIndex;

  @JsonProperty("tags")
  
  private String tags;

  @JsonProperty("locationLastUpdated")
  
  private Long locationLastUpdated;

  @JsonProperty("distanceFromMe")
  
  private String distanceFromMe;

  @JsonProperty("returning")
  
  private String returning;

  public UserLocationResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public UserLocationResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UserLocationResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public UserLocationResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public UserLocationResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public UserLocationResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserLocationResponse accountId(Long accountId) {
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

  public UserLocationResponse locationDisplay(String locationDisplay) {
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

  public UserLocationResponse display(String display) {
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

  public UserLocationResponse username(String username) {
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

  public UserLocationResponse profileImage(String profileImage) {
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

  public UserLocationResponse profileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
    return this;
  }

   /**
   * Get profileAvatar
   * @return profileAvatar
  **/
  public AssetShortResponse getProfileAvatar() {
    return profileAvatar;
  }

  public void setProfileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
  }

  public UserLocationResponse aboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
    return this;
  }

   /**
   * Get aboutUs
   * @return aboutUs
  **/
  public String getAboutUs() {
    return aboutUs;
  }

  public void setAboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
  }

  public UserLocationResponse locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserLocationResponse summaryTitle(String summaryTitle) {
    this.summaryTitle = summaryTitle;
    return this;
  }

   /**
   * Get summaryTitle
   * @return summaryTitle
  **/
  public String getSummaryTitle() {
    return summaryTitle;
  }

  public void setSummaryTitle(String summaryTitle) {
    this.summaryTitle = summaryTitle;
  }

  public UserLocationResponse gender(GenderEnum gender) {
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

  public UserLocationResponse age(String age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public UserLocationResponse gameExperience(GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
    return this;
  }

   /**
   * Get gameExperience
   * @return gameExperience
  **/
  public GameExperienceEnum getGameExperience() {
    return gameExperience;
  }

  public void setGameExperience(GameExperienceEnum gameExperience) {
    this.gameExperience = gameExperience;
  }

  public UserLocationResponse contact(ContactResponse contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public ContactResponse getContact() {
    return contact;
  }

  public void setContact(ContactResponse contact) {
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
  **/
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public UserLocationResponse personalProfile(PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
    return this;
  }

   /**
   * Get personalProfile
   * @return personalProfile
  **/
  public PersonalProfileResponse getPersonalProfile() {
    return personalProfile;
  }

  public void setPersonalProfile(PersonalProfileResponse personalProfile) {
    this.personalProfile = personalProfile;
  }

  public UserLocationResponse userSettings(UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
    return this;
  }

   /**
   * Get userSettings
   * @return userSettings
  **/
  public UserSettingsResponse getUserSettings() {
    return userSettings;
  }

  public void setUserSettings(UserSettingsResponse userSettings) {
    this.userSettings = userSettings;
  }

  public UserLocationResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public UserLocationResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public UserLocationResponse currentPostalCode(PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
    return this;
  }

   /**
   * Get currentPostalCode
   * @return currentPostalCode
  **/
  public PostalCodeResponse getCurrentPostalCode() {
    return currentPostalCode;
  }

  public void setCurrentPostalCode(PostalCodeResponse currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  public UserLocationResponse accountType(String accountType) {
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

  public UserLocationResponse premiumExpiration(Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
    return this;
  }

   /**
   * Get premiumExpiration
   * @return premiumExpiration
  **/
  public Long getPremiumExpiration() {
    return premiumExpiration;
  }

  public void setPremiumExpiration(Long premiumExpiration) {
    this.premiumExpiration = premiumExpiration;
  }

  public UserLocationResponse matchIndex(Integer matchIndex) {
    this.matchIndex = matchIndex;
    return this;
  }

   /**
   * Get matchIndex
   * @return matchIndex
  **/
  public Integer getMatchIndex() {
    return matchIndex;
  }

  public void setMatchIndex(Integer matchIndex) {
    this.matchIndex = matchIndex;
  }

  public UserLocationResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public UserLocationResponse locationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

   /**
   * Get locationLastUpdated
   * @return locationLastUpdated
  **/
  public Long getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public UserLocationResponse distanceFromMe(String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
    return this;
  }

   /**
   * Get distanceFromMe
   * @return distanceFromMe
  **/
  public String getDistanceFromMe() {
    return distanceFromMe;
  }

  public void setDistanceFromMe(String distanceFromMe) {
    this.distanceFromMe = distanceFromMe;
  }

  public UserLocationResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    return Objects.equals(valid, userLocationResponse.valid) &&
        Objects.equals(message, userLocationResponse.message) &&
        Objects.equals(version, userLocationResponse.version) &&
        Objects.equals(serializeNulls, userLocationResponse.serializeNulls) &&
        Objects.equals(startTimeLog, userLocationResponse.startTimeLog) &&
        Objects.equals(errorCode, userLocationResponse.errorCode) &&
        Objects.equals(request, userLocationResponse.request) &&
        Objects.equals(accountId, userLocationResponse.accountId) &&
        Objects.equals(locationDisplay, userLocationResponse.locationDisplay) &&
        Objects.equals(display, userLocationResponse.display) &&
        Objects.equals(username, userLocationResponse.username) &&
        Objects.equals(profileImage, userLocationResponse.profileImage) &&
        Objects.equals(profileAvatar, userLocationResponse.profileAvatar) &&
        Objects.equals(aboutUs, userLocationResponse.aboutUs) &&
        Objects.equals(locale, userLocationResponse.locale) &&
        Objects.equals(summaryTitle, userLocationResponse.summaryTitle) &&
        Objects.equals(gender, userLocationResponse.gender) &&
        Objects.equals(age, userLocationResponse.age) &&
        Objects.equals(gameExperience, userLocationResponse.gameExperience) &&
        Objects.equals(contact, userLocationResponse.contact) &&
        Objects.equals(categories, userLocationResponse.categories) &&
        Objects.equals(personalProfile, userLocationResponse.personalProfile) &&
        Objects.equals(userSettings, userLocationResponse.userSettings) &&
        Objects.equals(latitude, userLocationResponse.latitude) &&
        Objects.equals(longitude, userLocationResponse.longitude) &&
        Objects.equals(currentPostalCode, userLocationResponse.currentPostalCode) &&
        Objects.equals(accountType, userLocationResponse.accountType) &&
        Objects.equals(premiumExpiration, userLocationResponse.premiumExpiration) &&
        Objects.equals(matchIndex, userLocationResponse.matchIndex) &&
        Objects.equals(tags, userLocationResponse.tags) &&
        Objects.equals(locationLastUpdated, userLocationResponse.locationLastUpdated) &&
        Objects.equals(distanceFromMe, userLocationResponse.distanceFromMe) &&
        Objects.equals(returning, userLocationResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, accountId, locationDisplay, display, username, profileImage, profileAvatar, aboutUs, locale, summaryTitle, gender, age, gameExperience, contact, categories, personalProfile, userSettings, latitude, longitude, currentPostalCode, accountType, premiumExpiration, matchIndex, tags, locationLastUpdated, distanceFromMe, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

