package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NotificationSettingsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserSettingsResponse   {
  
  private Boolean showAsZipcode;
  private Boolean showExactLocation;
  private Boolean showOthersExactLocation;
  private Integer suggestionCount;
  private Integer suggestionTimeFrame;
  private String suggestionMethod;
  private NotificationSettingsResponse notifications;
  private Boolean publicShowFriendInfo;
  private Boolean publicShowGameInfo;
  private Boolean publicShowProfileInfo;

  /**
   * Gets or Sets favoriteVisibility
   */
  public enum FavoriteVisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    FavoriteVisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FavoriteVisibilityEnum favoriteVisibility;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showAsZipcode")
  public Boolean getShowAsZipcode() {
    return showAsZipcode;
  }
  public void setShowAsZipcode(Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showExactLocation")
  public Boolean getShowExactLocation() {
    return showExactLocation;
  }
  public void setShowExactLocation(Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showOthersExactLocation")
  public Boolean getShowOthersExactLocation() {
    return showOthersExactLocation;
  }
  public void setShowOthersExactLocation(Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suggestionCount")
  public Integer getSuggestionCount() {
    return suggestionCount;
  }
  public void setSuggestionCount(Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suggestionTimeFrame")
  public Integer getSuggestionTimeFrame() {
    return suggestionTimeFrame;
  }
  public void setSuggestionTimeFrame(Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suggestionMethod")
  public String getSuggestionMethod() {
    return suggestionMethod;
  }
  public void setSuggestionMethod(String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notifications")
  @Valid
  public NotificationSettingsResponse getNotifications() {
    return notifications;
  }
  public void setNotifications(NotificationSettingsResponse notifications) {
    this.notifications = notifications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicShowFriendInfo")
  public Boolean getPublicShowFriendInfo() {
    return publicShowFriendInfo;
  }
  public void setPublicShowFriendInfo(Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicShowGameInfo")
  public Boolean getPublicShowGameInfo() {
    return publicShowGameInfo;
  }
  public void setPublicShowGameInfo(Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicShowProfileInfo")
  public Boolean getPublicShowProfileInfo() {
    return publicShowProfileInfo;
  }
  public void setPublicShowProfileInfo(Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favoriteVisibility")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

