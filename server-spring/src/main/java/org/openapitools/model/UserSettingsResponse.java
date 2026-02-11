package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NotificationSettingsResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserSettingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserSettingsResponse {

  private @Nullable Boolean showAsZipcode;

  private @Nullable Boolean showExactLocation;

  private @Nullable Boolean showOthersExactLocation;

  private @Nullable Integer suggestionCount;

  private @Nullable Integer suggestionTimeFrame;

  private @Nullable String suggestionMethod;

  private @Nullable NotificationSettingsResponse notifications;

  private @Nullable Boolean publicShowFriendInfo;

  private @Nullable Boolean publicShowGameInfo;

  private @Nullable Boolean publicShowProfileInfo;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable FavoriteVisibilityEnum favoriteVisibility;

  public UserSettingsResponse showAsZipcode(@Nullable Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
    return this;
  }

  /**
   * Get showAsZipcode
   * @return showAsZipcode
   */
  
  @Schema(name = "showAsZipcode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showAsZipcode")
  public @Nullable Boolean getShowAsZipcode() {
    return showAsZipcode;
  }

  public void setShowAsZipcode(@Nullable Boolean showAsZipcode) {
    this.showAsZipcode = showAsZipcode;
  }

  public UserSettingsResponse showExactLocation(@Nullable Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
    return this;
  }

  /**
   * Get showExactLocation
   * @return showExactLocation
   */
  
  @Schema(name = "showExactLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showExactLocation")
  public @Nullable Boolean getShowExactLocation() {
    return showExactLocation;
  }

  public void setShowExactLocation(@Nullable Boolean showExactLocation) {
    this.showExactLocation = showExactLocation;
  }

  public UserSettingsResponse showOthersExactLocation(@Nullable Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
    return this;
  }

  /**
   * Get showOthersExactLocation
   * @return showOthersExactLocation
   */
  
  @Schema(name = "showOthersExactLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showOthersExactLocation")
  public @Nullable Boolean getShowOthersExactLocation() {
    return showOthersExactLocation;
  }

  public void setShowOthersExactLocation(@Nullable Boolean showOthersExactLocation) {
    this.showOthersExactLocation = showOthersExactLocation;
  }

  public UserSettingsResponse suggestionCount(@Nullable Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
    return this;
  }

  /**
   * Get suggestionCount
   * @return suggestionCount
   */
  
  @Schema(name = "suggestionCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestionCount")
  public @Nullable Integer getSuggestionCount() {
    return suggestionCount;
  }

  public void setSuggestionCount(@Nullable Integer suggestionCount) {
    this.suggestionCount = suggestionCount;
  }

  public UserSettingsResponse suggestionTimeFrame(@Nullable Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
    return this;
  }

  /**
   * Get suggestionTimeFrame
   * @return suggestionTimeFrame
   */
  
  @Schema(name = "suggestionTimeFrame", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestionTimeFrame")
  public @Nullable Integer getSuggestionTimeFrame() {
    return suggestionTimeFrame;
  }

  public void setSuggestionTimeFrame(@Nullable Integer suggestionTimeFrame) {
    this.suggestionTimeFrame = suggestionTimeFrame;
  }

  public UserSettingsResponse suggestionMethod(@Nullable String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
    return this;
  }

  /**
   * Get suggestionMethod
   * @return suggestionMethod
   */
  
  @Schema(name = "suggestionMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestionMethod")
  public @Nullable String getSuggestionMethod() {
    return suggestionMethod;
  }

  public void setSuggestionMethod(@Nullable String suggestionMethod) {
    this.suggestionMethod = suggestionMethod;
  }

  public UserSettingsResponse notifications(@Nullable NotificationSettingsResponse notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   * @return notifications
   */
  @Valid 
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public @Nullable NotificationSettingsResponse getNotifications() {
    return notifications;
  }

  public void setNotifications(@Nullable NotificationSettingsResponse notifications) {
    this.notifications = notifications;
  }

  public UserSettingsResponse publicShowFriendInfo(@Nullable Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
    return this;
  }

  /**
   * Get publicShowFriendInfo
   * @return publicShowFriendInfo
   */
  
  @Schema(name = "publicShowFriendInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicShowFriendInfo")
  public @Nullable Boolean getPublicShowFriendInfo() {
    return publicShowFriendInfo;
  }

  public void setPublicShowFriendInfo(@Nullable Boolean publicShowFriendInfo) {
    this.publicShowFriendInfo = publicShowFriendInfo;
  }

  public UserSettingsResponse publicShowGameInfo(@Nullable Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
    return this;
  }

  /**
   * Get publicShowGameInfo
   * @return publicShowGameInfo
   */
  
  @Schema(name = "publicShowGameInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicShowGameInfo")
  public @Nullable Boolean getPublicShowGameInfo() {
    return publicShowGameInfo;
  }

  public void setPublicShowGameInfo(@Nullable Boolean publicShowGameInfo) {
    this.publicShowGameInfo = publicShowGameInfo;
  }

  public UserSettingsResponse publicShowProfileInfo(@Nullable Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
    return this;
  }

  /**
   * Get publicShowProfileInfo
   * @return publicShowProfileInfo
   */
  
  @Schema(name = "publicShowProfileInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicShowProfileInfo")
  public @Nullable Boolean getPublicShowProfileInfo() {
    return publicShowProfileInfo;
  }

  public void setPublicShowProfileInfo(@Nullable Boolean publicShowProfileInfo) {
    this.publicShowProfileInfo = publicShowProfileInfo;
  }

  public UserSettingsResponse favoriteVisibility(@Nullable FavoriteVisibilityEnum favoriteVisibility) {
    this.favoriteVisibility = favoriteVisibility;
    return this;
  }

  /**
   * Get favoriteVisibility
   * @return favoriteVisibility
   */
  
  @Schema(name = "favoriteVisibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteVisibility")
  public @Nullable FavoriteVisibilityEnum getFavoriteVisibility() {
    return favoriteVisibility;
  }

  public void setFavoriteVisibility(@Nullable FavoriteVisibilityEnum favoriteVisibility) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

