package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConnectionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionResponse {

  private @Nullable Long connectionId;

  private @Nullable String connectionAccountId;

  private @Nullable String connectionPendingId;

  private @Nullable String display;

  private @Nullable String locationDisplay;

  private @Nullable Long connectionViewedDate;

  private @Nullable String profileImage;

  private @Nullable String title;

  private @Nullable String connectionAccountType;

  private @Nullable Boolean trusted;

  private @Nullable Boolean following;

  private @Nullable Boolean friendRequested;

  private @Nullable Boolean friendRequestPending;

  private @Nullable Boolean blocked;

  private @Nullable Boolean friend;

  public ConnectionResponse connectionId(@Nullable Long connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * Get connectionId
   * @return connectionId
   */
  
  @Schema(name = "connectionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionId")
  public @Nullable Long getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(@Nullable Long connectionId) {
    this.connectionId = connectionId;
  }

  public ConnectionResponse connectionAccountId(@Nullable String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
    return this;
  }

  /**
   * Get connectionAccountId
   * @return connectionAccountId
   */
  
  @Schema(name = "connectionAccountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionAccountId")
  public @Nullable String getConnectionAccountId() {
    return connectionAccountId;
  }

  public void setConnectionAccountId(@Nullable String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
  }

  public ConnectionResponse connectionPendingId(@Nullable String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
    return this;
  }

  /**
   * Get connectionPendingId
   * @return connectionPendingId
   */
  
  @Schema(name = "connectionPendingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionPendingId")
  public @Nullable String getConnectionPendingId() {
    return connectionPendingId;
  }

  public void setConnectionPendingId(@Nullable String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
  }

  public ConnectionResponse display(@Nullable String display) {
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

  public ConnectionResponse locationDisplay(@Nullable String locationDisplay) {
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

  public ConnectionResponse connectionViewedDate(@Nullable Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
    return this;
  }

  /**
   * Get connectionViewedDate
   * @return connectionViewedDate
   */
  
  @Schema(name = "connectionViewedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionViewedDate")
  public @Nullable Long getConnectionViewedDate() {
    return connectionViewedDate;
  }

  public void setConnectionViewedDate(@Nullable Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  public ConnectionResponse profileImage(@Nullable String profileImage) {
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

  public ConnectionResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ConnectionResponse connectionAccountType(@Nullable String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
    return this;
  }

  /**
   * Get connectionAccountType
   * @return connectionAccountType
   */
  
  @Schema(name = "connectionAccountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionAccountType")
  public @Nullable String getConnectionAccountType() {
    return connectionAccountType;
  }

  public void setConnectionAccountType(@Nullable String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
  }

  public ConnectionResponse trusted(@Nullable Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

  /**
   * Get trusted
   * @return trusted
   */
  
  @Schema(name = "trusted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trusted")
  public @Nullable Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(@Nullable Boolean trusted) {
    this.trusted = trusted;
  }

  public ConnectionResponse following(@Nullable Boolean following) {
    this.following = following;
    return this;
  }

  /**
   * Get following
   * @return following
   */
  
  @Schema(name = "following", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("following")
  public @Nullable Boolean getFollowing() {
    return following;
  }

  public void setFollowing(@Nullable Boolean following) {
    this.following = following;
  }

  public ConnectionResponse friendRequested(@Nullable Boolean friendRequested) {
    this.friendRequested = friendRequested;
    return this;
  }

  /**
   * Get friendRequested
   * @return friendRequested
   */
  
  @Schema(name = "friendRequested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendRequested")
  public @Nullable Boolean getFriendRequested() {
    return friendRequested;
  }

  public void setFriendRequested(@Nullable Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  public ConnectionResponse friendRequestPending(@Nullable Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
    return this;
  }

  /**
   * Get friendRequestPending
   * @return friendRequestPending
   */
  
  @Schema(name = "friendRequestPending", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendRequestPending")
  public @Nullable Boolean getFriendRequestPending() {
    return friendRequestPending;
  }

  public void setFriendRequestPending(@Nullable Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  public ConnectionResponse blocked(@Nullable Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Get blocked
   * @return blocked
   */
  
  @Schema(name = "blocked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blocked")
  public @Nullable Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(@Nullable Boolean blocked) {
    this.blocked = blocked;
  }

  public ConnectionResponse friend(@Nullable Boolean friend) {
    this.friend = friend;
    return this;
  }

  /**
   * Get friend
   * @return friend
   */
  
  @Schema(name = "friend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friend")
  public @Nullable Boolean getFriend() {
    return friend;
  }

  public void setFriend(@Nullable Boolean friend) {
    this.friend = friend;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionResponse connectionResponse = (ConnectionResponse) o;
    return Objects.equals(this.connectionId, connectionResponse.connectionId) &&
        Objects.equals(this.connectionAccountId, connectionResponse.connectionAccountId) &&
        Objects.equals(this.connectionPendingId, connectionResponse.connectionPendingId) &&
        Objects.equals(this.display, connectionResponse.display) &&
        Objects.equals(this.locationDisplay, connectionResponse.locationDisplay) &&
        Objects.equals(this.connectionViewedDate, connectionResponse.connectionViewedDate) &&
        Objects.equals(this.profileImage, connectionResponse.profileImage) &&
        Objects.equals(this.title, connectionResponse.title) &&
        Objects.equals(this.connectionAccountType, connectionResponse.connectionAccountType) &&
        Objects.equals(this.trusted, connectionResponse.trusted) &&
        Objects.equals(this.following, connectionResponse.following) &&
        Objects.equals(this.friendRequested, connectionResponse.friendRequested) &&
        Objects.equals(this.friendRequestPending, connectionResponse.friendRequestPending) &&
        Objects.equals(this.blocked, connectionResponse.blocked) &&
        Objects.equals(this.friend, connectionResponse.friend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, connectionAccountId, connectionPendingId, display, locationDisplay, connectionViewedDate, profileImage, title, connectionAccountType, trusted, following, friendRequested, friendRequestPending, blocked, friend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionResponse {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    connectionAccountId: ").append(toIndentedString(connectionAccountId)).append("\n");
    sb.append("    connectionPendingId: ").append(toIndentedString(connectionPendingId)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    connectionViewedDate: ").append(toIndentedString(connectionViewedDate)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    connectionAccountType: ").append(toIndentedString(connectionAccountType)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    friendRequested: ").append(toIndentedString(friendRequested)).append("\n");
    sb.append("    friendRequestPending: ").append(toIndentedString(friendRequestPending)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    friend: ").append(toIndentedString(friend)).append("\n");
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

