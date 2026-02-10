package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NotificationSettingsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserSettingsResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean showAsZipcode;

  @ApiModelProperty(value = "")

  private Boolean showExactLocation;

  @ApiModelProperty(value = "")

  private Boolean showOthersExactLocation;

  @ApiModelProperty(value = "")

  private Integer suggestionCount;

  @ApiModelProperty(value = "")

  private Integer suggestionTimeFrame;

  @ApiModelProperty(value = "")

  private String suggestionMethod;

  @ApiModelProperty(value = "")

  @Valid

  private NotificationSettingsResponse notifications;

  @ApiModelProperty(value = "")

  private Boolean publicShowFriendInfo;

  @ApiModelProperty(value = "")

  private Boolean publicShowGameInfo;

  @ApiModelProperty(value = "")

  private Boolean publicShowProfileInfo;

public enum FavoriteVisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    FavoriteVisibilityEnum (String v) {
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
    public static FavoriteVisibilityEnum fromValue(String value) {
        for (FavoriteVisibilityEnum b : FavoriteVisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private FavoriteVisibilityEnum favoriteVisibility;
 /**
   * Get showAsZipcode
   * @return showAsZipcode
  **/
  @JsonProperty("showAsZipcode")
  public Boolean getShowAsZipcode() {
    return showAsZipcode;
  }

  public void setShowAsZipcode(Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
  }

  public UserSettingsResponse showAsZipcode(Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
    return this;
  }

 /**
   * Get showExactLocation
   * @return showExactLocation
  **/
  @JsonProperty("showExactLocation")
  public Boolean getShowExactLocation() {
    return showExactLocation;
  }

  public void setShowExactLocation(Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
  }

  public UserSettingsResponse showExactLocation(Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
    return this;
  }

 /**
   * Get showOthersExactLocation
   * @return showOthersExactLocation
  **/
  @JsonProperty("showOthersExactLocation")
  public Boolean getShowOthersExactLocation() {
    return showOthersExactLocation;
  }

  public void setShowOthersExactLocation(Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
  }

  public UserSettingsResponse showOthersExactLocation(Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
    return this;
  }

 /**
   * Get suggestionCount
   * @return suggestionCount
  **/
  @JsonProperty("suggestionCount")
  public Integer getSuggestionCount() {
    return suggestionCount;
  }

  public void setSuggestionCount(Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
  }

  public UserSettingsResponse suggestionCount(Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
    return this;
  }

 /**
   * Get suggestionTimeFrame
   * @return suggestionTimeFrame
  **/
  @JsonProperty("suggestionTimeFrame")
  public Integer getSuggestionTimeFrame() {
    return suggestionTimeFrame;
  }

  public void setSuggestionTimeFrame(Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
  }

  public UserSettingsResponse suggestionTimeFrame(Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
    return this;
  }

 /**
   * Get suggestionMethod
   * @return suggestionMethod
  **/
  @JsonProperty("suggestionMethod")
  public String getSuggestionMethod() {
    return suggestionMethod;
  }

  public void setSuggestionMethod(String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
  }

  public UserSettingsResponse suggestionMethod(String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
    return this;
  }

 /**
   * Get notifications
   * @return notifications
  **/
  @JsonProperty("notifications")
  public NotificationSettingsResponse getNotifications() {
    return notifications;
  }

  public void setNotifications(NotificationSettingsResponse notifications) {
    this.notifications = notifications;
  }

  public UserSettingsResponse notifications(NotificationSettingsResponse notifications) {
    this.notifications = notifications;
    return this;
  }

 /**
   * Get publicShowFriendInfo
   * @return publicShowFriendInfo
  **/
  @JsonProperty("publicShowFriendInfo")
  public Boolean getPublicShowFriendInfo() {
    return publicShowFriendInfo;
  }

  public void setPublicShowFriendInfo(Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
  }

  public UserSettingsResponse publicShowFriendInfo(Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
    return this;
  }

 /**
   * Get publicShowGameInfo
   * @return publicShowGameInfo
  **/
  @JsonProperty("publicShowGameInfo")
  public Boolean getPublicShowGameInfo() {
    return publicShowGameInfo;
  }

  public void setPublicShowGameInfo(Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
  }

  public UserSettingsResponse publicShowGameInfo(Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
    return this;
  }

 /**
   * Get publicShowProfileInfo
   * @return publicShowProfileInfo
  **/
  @JsonProperty("publicShowProfileInfo")
  public Boolean getPublicShowProfileInfo() {
    return publicShowProfileInfo;
  }

  public void setPublicShowProfileInfo(Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
  }

  public UserSettingsResponse publicShowProfileInfo(Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
    return this;
  }

 /**
   * Get favoriteVisibility
   * @return favoriteVisibility
  **/
  @JsonProperty("favoriteVisibility")
  public String getFavoriteVisibility() {
    if (favoriteVisibility == null) {
      return null;
    }
    return favoriteVisibility.value();
  }

  public void setFavoriteVisibility(FavoriteVisibilityEnum favoriteVisibility) {
    this.favoriteVisibility = favoriteVisibility;
  }

  public UserSettingsResponse favoriteVisibility(FavoriteVisibilityEnum favoriteVisibility) {
    this.favoriteVisibility = favoriteVisibility;
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
    UserSettingsResponse userSettingsResponse = (UserSettingsResponse) o;
    return Objects.equals(this.showAsZipcode, userSettingsResponse.showAsZipcode) &&
        Objects.equals(this.showExactLocation, userSettingsResponse.showExactLocation) &&
        Objects.equals(this.showOthersExactLocation, userSettingsResponse.showOthersExactLocation) &&
        Objects.equals(this.suggestionCount, userSettingsResponse.suggestionCount) &&
        Objects.equals(this.suggestionTimeFrame, userSettingsResponse.suggestionTimeFrame) &&
        Objects.equals(this.suggestionMethod, userSettingsResponse.suggestionMethod) &&
        Objects.equals(this.notifications, userSettingsResponse.notifications) &&
        Objects.equals(this.publicShowFriendInfo, userSettingsResponse.publicShowFriendInfo) &&
        Objects.equals(this.publicShowGameInfo, userSettingsResponse.publicShowGameInfo) &&
        Objects.equals(this.publicShowProfileInfo, userSettingsResponse.publicShowProfileInfo) &&
        Objects.equals(this.favoriteVisibility, userSettingsResponse.favoriteVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAsZipcode, showExactLocation, showOthersExactLocation, suggestionCount, suggestionTimeFrame, suggestionMethod, notifications, publicShowFriendInfo, publicShowGameInfo, publicShowProfileInfo, favoriteVisibility);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

