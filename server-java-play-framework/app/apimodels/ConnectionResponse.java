package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConnectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConnectionResponse   {
  @JsonProperty("connectionId")
  
  private Long connectionId;

  @JsonProperty("connectionAccountId")
  
  private String connectionAccountId;

  @JsonProperty("connectionPendingId")
  
  private String connectionPendingId;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("locationDisplay")
  
  private String locationDisplay;

  @JsonProperty("connectionViewedDate")
  
  private Long connectionViewedDate;

  @JsonProperty("profileImage")
  
  private String profileImage;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("connectionAccountType")
  
  private String connectionAccountType;

  @JsonProperty("trusted")
  
  private Boolean trusted;

  @JsonProperty("following")
  
  private Boolean following;

  @JsonProperty("friendRequested")
  
  private Boolean friendRequested;

  @JsonProperty("friendRequestPending")
  
  private Boolean friendRequestPending;

  @JsonProperty("blocked")
  
  private Boolean blocked;

  @JsonProperty("friend")
  
  private Boolean friend;

  public ConnectionResponse connectionId(Long connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  public Long getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(Long connectionId) {
    this.connectionId = connectionId;
  }

  public ConnectionResponse connectionAccountId(String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
    return this;
  }

   /**
   * Get connectionAccountId
   * @return connectionAccountId
  **/
  public String getConnectionAccountId() {
    return connectionAccountId;
  }

  public void setConnectionAccountId(String connectionAccountId) {
    this.connectionAccountId = connectionAccountId;
  }

  public ConnectionResponse connectionPendingId(String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
    return this;
  }

   /**
   * Get connectionPendingId
   * @return connectionPendingId
  **/
  public String getConnectionPendingId() {
    return connectionPendingId;
  }

  public void setConnectionPendingId(String connectionPendingId) {
    this.connectionPendingId = connectionPendingId;
  }

  public ConnectionResponse display(String display) {
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

  public ConnectionResponse locationDisplay(String locationDisplay) {
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

  public ConnectionResponse connectionViewedDate(Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
    return this;
  }

   /**
   * Get connectionViewedDate
   * @return connectionViewedDate
  **/
  public Long getConnectionViewedDate() {
    return connectionViewedDate;
  }

  public void setConnectionViewedDate(Long connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  public ConnectionResponse profileImage(String profileImage) {
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

  public ConnectionResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ConnectionResponse connectionAccountType(String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
    return this;
  }

   /**
   * Get connectionAccountType
   * @return connectionAccountType
  **/
  public String getConnectionAccountType() {
    return connectionAccountType;
  }

  public void setConnectionAccountType(String connectionAccountType) {
    this.connectionAccountType = connectionAccountType;
  }

  public ConnectionResponse trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

   /**
   * Get trusted
   * @return trusted
  **/
  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public ConnectionResponse following(Boolean following) {
    this.following = following;
    return this;
  }

   /**
   * Get following
   * @return following
  **/
  public Boolean getFollowing() {
    return following;
  }

  public void setFollowing(Boolean following) {
    this.following = following;
  }

  public ConnectionResponse friendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
    return this;
  }

   /**
   * Get friendRequested
   * @return friendRequested
  **/
  public Boolean getFriendRequested() {
    return friendRequested;
  }

  public void setFriendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  public ConnectionResponse friendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
    return this;
  }

   /**
   * Get friendRequestPending
   * @return friendRequestPending
  **/
  public Boolean getFriendRequestPending() {
    return friendRequestPending;
  }

  public void setFriendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  public ConnectionResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ConnectionResponse friend(Boolean friend) {
    this.friend = friend;
    return this;
  }

   /**
   * Get friend
   * @return friend
  **/
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
    return Objects.equals(connectionId, connectionResponse.connectionId) &&
        Objects.equals(connectionAccountId, connectionResponse.connectionAccountId) &&
        Objects.equals(connectionPendingId, connectionResponse.connectionPendingId) &&
        Objects.equals(display, connectionResponse.display) &&
        Objects.equals(locationDisplay, connectionResponse.locationDisplay) &&
        Objects.equals(connectionViewedDate, connectionResponse.connectionViewedDate) &&
        Objects.equals(profileImage, connectionResponse.profileImage) &&
        Objects.equals(title, connectionResponse.title) &&
        Objects.equals(connectionAccountType, connectionResponse.connectionAccountType) &&
        Objects.equals(trusted, connectionResponse.trusted) &&
        Objects.equals(following, connectionResponse.following) &&
        Objects.equals(friendRequested, connectionResponse.friendRequested) &&
        Objects.equals(friendRequestPending, connectionResponse.friendRequestPending) &&
        Objects.equals(blocked, connectionResponse.blocked) &&
        Objects.equals(friend, connectionResponse.friend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, connectionAccountId, connectionPendingId, display, locationDisplay, connectionViewedDate, profileImage, title, connectionAccountType, trusted, following, friendRequested, friendRequestPending, blocked, friend);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

