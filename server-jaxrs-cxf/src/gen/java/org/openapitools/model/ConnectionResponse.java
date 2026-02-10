package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectionResponse  {
  
  @ApiModelProperty(value = "")

  private Long connectionId;

  @ApiModelProperty(value = "")

  private String connectionAccountId;

  @ApiModelProperty(value = "")

  private String connectionPendingId;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String locationDisplay;

  @ApiModelProperty(value = "")

  private Long connectionViewedDate;

  @ApiModelProperty(value = "")

  private String profileImage;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String connectionAccountType;

  @ApiModelProperty(value = "")

  private Boolean trusted;

  @ApiModelProperty(value = "")

  private Boolean following;

  @ApiModelProperty(value = "")

  private Boolean friendRequested;

  @ApiModelProperty(value = "")

  private Boolean friendRequestPending;

  @ApiModelProperty(value = "")

  private Boolean blocked;

  @ApiModelProperty(value = "")

  private Boolean friend;
 /**
   * Get connectionId
   * @return connectionId
  **/
  @JsonProperty("connectionId")
  public Long getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(Long connectionId) {
    this.connectionId = connectionId;
  }

  public ConnectionResponse connectionId(Long connectionId) {
    this.connectionId = connectionId;
    return this;
  }

 /**
   * Get connectionAccountId
   * @return connectionAccountId
  **/
  @JsonProperty("connectionAccountId")
  public String getConnectionAccountId() {
    return connectionAccountId;
  }

  public void setConnectionAccountId(String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
  }

  public ConnectionResponse connectionAccountId(String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
    return this;
  }

 /**
   * Get connectionPendingId
   * @return connectionPendingId
  **/
  @JsonProperty("connectionPendingId")
  public String getConnectionPendingId() {
    return connectionPendingId;
  }

  public void setConnectionPendingId(String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
  }

  public ConnectionResponse connectionPendingId(String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
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

  public ConnectionResponse display(String display) {
    this.display = display;
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

  public ConnectionResponse locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

 /**
   * Get connectionViewedDate
   * @return connectionViewedDate
  **/
  @JsonProperty("connectionViewedDate")
  public Long getConnectionViewedDate() {
    return connectionViewedDate;
  }

  public void setConnectionViewedDate(Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  public ConnectionResponse connectionViewedDate(Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
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

  public ConnectionResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ConnectionResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get connectionAccountType
   * @return connectionAccountType
  **/
  @JsonProperty("connectionAccountType")
  public String getConnectionAccountType() {
    return connectionAccountType;
  }

  public void setConnectionAccountType(String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
  }

  public ConnectionResponse connectionAccountType(String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
    return this;
  }

 /**
   * Get trusted
   * @return trusted
  **/
  @JsonProperty("trusted")
  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public ConnectionResponse trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

 /**
   * Get following
   * @return following
  **/
  @JsonProperty("following")
  public Boolean getFollowing() {
    return following;
  }

  public void setFollowing(Boolean following) {
    this.following = following;
  }

  public ConnectionResponse following(Boolean following) {
    this.following = following;
    return this;
  }

 /**
   * Get friendRequested
   * @return friendRequested
  **/
  @JsonProperty("friendRequested")
  public Boolean getFriendRequested() {
    return friendRequested;
  }

  public void setFriendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  public ConnectionResponse friendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
    return this;
  }

 /**
   * Get friendRequestPending
   * @return friendRequestPending
  **/
  @JsonProperty("friendRequestPending")
  public Boolean getFriendRequestPending() {
    return friendRequestPending;
  }

  public void setFriendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  public ConnectionResponse friendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
    return this;
  }

 /**
   * Get blocked
   * @return blocked
  **/
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ConnectionResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

 /**
   * Get friend
   * @return friend
  **/
  @JsonProperty("friend")
  public Boolean getFriend() {
    return friend;
  }

  public void setFriend(Boolean friend) {
    this.friend = friend;
  }

  public ConnectionResponse friend(Boolean friend) {
    this.friend = friend;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

