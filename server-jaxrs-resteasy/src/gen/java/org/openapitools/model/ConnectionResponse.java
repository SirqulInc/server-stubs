package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionResponse   {
  
  private Long connectionId;
  private String connectionAccountId;
  private String connectionPendingId;
  private String display;
  private String locationDisplay;
  private Long connectionViewedDate;
  private String profileImage;
  private String title;
  private String connectionAccountType;
  private Boolean trusted;
  private Boolean following;
  private Boolean friendRequested;
  private Boolean friendRequestPending;
  private Boolean blocked;
  private Boolean friend;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionId")
  public Long getConnectionId() {
    return connectionId;
  }
  public void setConnectionId(Long connectionId) {
    this.connectionId = connectionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionAccountId")
  public String getConnectionAccountId() {
    return connectionAccountId;
  }
  public void setConnectionAccountId(String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionPendingId")
  public String getConnectionPendingId() {
    return connectionPendingId;
  }
  public void setConnectionPendingId(String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }
  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionViewedDate")
  public Long getConnectionViewedDate() {
    return connectionViewedDate;
  }
  public void setConnectionViewedDate(Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionAccountType")
  public String getConnectionAccountType() {
    return connectionAccountType;
  }
  public void setConnectionAccountType(String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trusted")
  public Boolean getTrusted() {
    return trusted;
  }
  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("following")
  public Boolean getFollowing() {
    return following;
  }
  public void setFollowing(Boolean following) {
    this.following = following;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendRequested")
  public Boolean getFriendRequested() {
    return friendRequested;
  }
  public void setFriendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendRequestPending")
  public Boolean getFriendRequestPending() {
    return friendRequestPending;
  }
  public void setFriendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }
  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friend")
  public Boolean getFriend() {
    return friend;
  }
  public void setFriend(Boolean friend) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

