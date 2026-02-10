package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Asset;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConnectedFriend
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectedFriend {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String display;

  private @Nullable Asset avatar;

  private @Nullable String avatarURL;

  private @Nullable String platform;

  private @Nullable String platformId;

  private @Nullable Boolean invited;

  private @Nullable String locationDescription;

  public ConnectedFriend id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ConnectedFriend active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ConnectedFriend valid(@Nullable Boolean valid) {
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

  public ConnectedFriend display(@Nullable String display) {
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

  public ConnectedFriend avatar(@Nullable Asset avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
   */
  @Valid 
  @Schema(name = "avatar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar")
  public @Nullable Asset getAvatar() {
    return avatar;
  }

  public void setAvatar(@Nullable Asset avatar) {
    this.avatar = avatar;
  }

  public ConnectedFriend avatarURL(@Nullable String avatarURL) {
    this.avatarURL = avatarURL;
    return this;
  }

  /**
   * Get avatarURL
   * @return avatarURL
   */
  
  @Schema(name = "avatarURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarURL")
  public @Nullable String getAvatarURL() {
    return avatarURL;
  }

  public void setAvatarURL(@Nullable String avatarURL) {
    this.avatarURL = avatarURL;
  }

  public ConnectedFriend platform(@Nullable String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public @Nullable String getPlatform() {
    return platform;
  }

  public void setPlatform(@Nullable String platform) {
    this.platform = platform;
  }

  public ConnectedFriend platformId(@Nullable String platformId) {
    this.platformId = platformId;
    return this;
  }

  /**
   * Get platformId
   * @return platformId
   */
  
  @Schema(name = "platformId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platformId")
  public @Nullable String getPlatformId() {
    return platformId;
  }

  public void setPlatformId(@Nullable String platformId) {
    this.platformId = platformId;
  }

  public ConnectedFriend invited(@Nullable Boolean invited) {
    this.invited = invited;
    return this;
  }

  /**
   * Get invited
   * @return invited
   */
  
  @Schema(name = "invited", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invited")
  public @Nullable Boolean getInvited() {
    return invited;
  }

  public void setInvited(@Nullable Boolean invited) {
    this.invited = invited;
  }

  public ConnectedFriend locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedFriend connectedFriend = (ConnectedFriend) o;
    return Objects.equals(this.id, connectedFriend.id) &&
        Objects.equals(this.active, connectedFriend.active) &&
        Objects.equals(this.valid, connectedFriend.valid) &&
        Objects.equals(this.display, connectedFriend.display) &&
        Objects.equals(this.avatar, connectedFriend.avatar) &&
        Objects.equals(this.avatarURL, connectedFriend.avatarURL) &&
        Objects.equals(this.platform, connectedFriend.platform) &&
        Objects.equals(this.platformId, connectedFriend.platformId) &&
        Objects.equals(this.invited, connectedFriend.invited) &&
        Objects.equals(this.locationDescription, connectedFriend.locationDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, display, avatar, avatarURL, platform, platformId, invited, locationDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedFriend {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarURL: ").append(toIndentedString(avatarURL)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    invited: ").append(toIndentedString(invited)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
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

