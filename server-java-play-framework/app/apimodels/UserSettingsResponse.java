package apimodels;

import apimodels.NotificationSettingsResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserSettingsResponse   {
  @JsonProperty("showAsZipcode")
  
  private Boolean showAsZipcode;

  @JsonProperty("showExactLocation")
  
  private Boolean showExactLocation;

  @JsonProperty("showOthersExactLocation")
  
  private Boolean showOthersExactLocation;

  @JsonProperty("suggestionCount")
  
  private Integer suggestionCount;

  @JsonProperty("suggestionTimeFrame")
  
  private Integer suggestionTimeFrame;

  @JsonProperty("suggestionMethod")
  
  private String suggestionMethod;

  @JsonProperty("notifications")
  @Valid

  private NotificationSettingsResponse notifications;

  @JsonProperty("publicShowFriendInfo")
  
  private Boolean publicShowFriendInfo;

  @JsonProperty("publicShowGameInfo")
  
  private Boolean publicShowGameInfo;

  @JsonProperty("publicShowProfileInfo")
  
  private Boolean publicShowProfileInfo;

  /**
   * Gets or Sets favoriteVisibility
   */
  public enum FavoriteVisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    FavoriteVisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FavoriteVisibilityEnum fromValue(String value) {
      for (FavoriteVisibilityEnum b : FavoriteVisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("favoriteVisibility")
  
  private FavoriteVisibilityEnum favoriteVisibility;

  public UserSettingsResponse showAsZipcode(Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
    return this;
  }

   /**
   * Get showAsZipcode
   * @return showAsZipcode
  **/
  public Boolean getShowAsZipcode() {
    return showAsZipcode;
  }

  public void setShowAsZipcode(Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
  }

  public UserSettingsResponse showExactLocation(Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
    return this;
  }

   /**
   * Get showExactLocation
   * @return showExactLocation
  **/
  public Boolean getShowExactLocation() {
    return showExactLocation;
  }

  public void setShowExactLocation(Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
  }

  public UserSettingsResponse showOthersExactLocation(Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
    return this;
  }

   /**
   * Get showOthersExactLocation
   * @return showOthersExactLocation
  **/
  public Boolean getShowOthersExactLocation() {
    return showOthersExactLocation;
  }

  public void setShowOthersExactLocation(Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
  }

  public UserSettingsResponse suggestionCount(Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
    return this;
  }

   /**
   * Get suggestionCount
   * @return suggestionCount
  **/
  public Integer getSuggestionCount() {
    return suggestionCount;
  }

  public void setSuggestionCount(Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
  }

  public UserSettingsResponse suggestionTimeFrame(Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
    return this;
  }

   /**
   * Get suggestionTimeFrame
   * @return suggestionTimeFrame
  **/
  public Integer getSuggestionTimeFrame() {
    return suggestionTimeFrame;
  }

  public void setSuggestionTimeFrame(Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
  }

  public UserSettingsResponse suggestionMethod(String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
    return this;
  }

   /**
   * Get suggestionMethod
   * @return suggestionMethod
  **/
  public String getSuggestionMethod() {
    return suggestionMethod;
  }

  public void setSuggestionMethod(String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
  }

  public UserSettingsResponse notifications(NotificationSettingsResponse notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  public NotificationSettingsResponse getNotifications() {
    return notifications;
  }

  public void setNotifications(NotificationSettingsResponse notifications) {
    this.notifications = notifications;
  }

  public UserSettingsResponse publicShowFriendInfo(Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
    return this;
  }

   /**
   * Get publicShowFriendInfo
   * @return publicShowFriendInfo
  **/
  public Boolean getPublicShowFriendInfo() {
    return publicShowFriendInfo;
  }

  public void setPublicShowFriendInfo(Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
  }

  public UserSettingsResponse publicShowGameInfo(Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
    return this;
  }

   /**
   * Get publicShowGameInfo
   * @return publicShowGameInfo
  **/
  public Boolean getPublicShowGameInfo() {
    return publicShowGameInfo;
  }

  public void setPublicShowGameInfo(Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
  }

  public UserSettingsResponse publicShowProfileInfo(Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
    return this;
  }

   /**
   * Get publicShowProfileInfo
   * @return publicShowProfileInfo
  **/
  public Boolean getPublicShowProfileInfo() {
    return publicShowProfileInfo;
  }

  public void setPublicShowProfileInfo(Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
  }

  public UserSettingsResponse favoriteVisibility(FavoriteVisibilityEnum favoriteVisibility) {
    this.favoriteVisibility = favoriteVisibility;
    return this;
  }

   /**
   * Get favoriteVisibility
   * @return favoriteVisibility
  **/
  public FavoriteVisibilityEnum getFavoriteVisibility() {
    return favoriteVisibility;
  }

  public void setFavoriteVisibility(FavoriteVisibilityEnum favoriteVisibility) {
    this.favoriteVisibility = favoriteVisibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettingsResponse userSettingsResponse = (UserSettingsResponse) o;
    return Objects.equals(showAsZipcode, userSettingsResponse.showAsZipcode) &&
        Objects.equals(showExactLocation, userSettingsResponse.showExactLocation) &&
        Objects.equals(showOthersExactLocation, userSettingsResponse.showOthersExactLocation) &&
        Objects.equals(suggestionCount, userSettingsResponse.suggestionCount) &&
        Objects.equals(suggestionTimeFrame, userSettingsResponse.suggestionTimeFrame) &&
        Objects.equals(suggestionMethod, userSettingsResponse.suggestionMethod) &&
        Objects.equals(notifications, userSettingsResponse.notifications) &&
        Objects.equals(publicShowFriendInfo, userSettingsResponse.publicShowFriendInfo) &&
        Objects.equals(publicShowGameInfo, userSettingsResponse.publicShowGameInfo) &&
        Objects.equals(publicShowProfileInfo, userSettingsResponse.publicShowProfileInfo) &&
        Objects.equals(favoriteVisibility, userSettingsResponse.favoriteVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAsZipcode, showExactLocation, showOthersExactLocation, suggestionCount, suggestionTimeFrame, suggestionMethod, notifications, publicShowFriendInfo, publicShowGameInfo, publicShowProfileInfo, favoriteVisibility);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsResponse {\n");
    
    sb.append("    showAsZipcode: ").append(toIndentedString(showAsZipcode)).append("\n");
    sb.append("    showExactLocation: ").append(toIndentedString(showExactLocation)).append("\n");
    sb.append("    showOthersExactLocation: ").append(toIndentedString(showOthersExactLocation)).append("\n");
    sb.append("    suggestionCount: ").append(toIndentedString(suggestionCount)).append("\n");
    sb.append("    suggestionTimeFrame: ").append(toIndentedString(suggestionTimeFrame)).append("\n");
    sb.append("    suggestionMethod: ").append(toIndentedString(suggestionMethod)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    publicShowFriendInfo: ").append(toIndentedString(publicShowFriendInfo)).append("\n");
    sb.append("    publicShowGameInfo: ").append(toIndentedString(publicShowGameInfo)).append("\n");
    sb.append("    publicShowProfileInfo: ").append(toIndentedString(publicShowProfileInfo)).append("\n");
    sb.append("    favoriteVisibility: ").append(toIndentedString(favoriteVisibility)).append("\n");
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

