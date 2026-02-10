package apimodels;

import apimodels.Account;
import apimodels.ConnectedFriend;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Connection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Connection   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("created")
  @Valid

  private OffsetDateTime created;

  @JsonProperty("updated")
  @Valid

  private OffsetDateTime updated;

  @JsonProperty("deleted")
  @Valid

  private OffsetDateTime deleted;

  @JsonProperty("objectType")
  
  private String objectType;

  @JsonProperty("legacyId")
  
  private String legacyId;

  @JsonProperty("searchTags")
  
  private String searchTags;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("account")
  @Valid

  private Account account;

  @JsonProperty("connection")
  @Valid

  private Account connection;

  @JsonProperty("pendingConnection")
  @Valid

  private ConnectedFriend pendingConnection;

  @JsonProperty("friend")
  
  private Boolean friend;

  @JsonProperty("friendRequested")
  
  private Boolean friendRequested;

  @JsonProperty("friendRequestPending")
  
  private Boolean friendRequestPending;

  @JsonProperty("following")
  
  private Boolean following;

  @JsonProperty("follower")
  
  private Boolean follower;

  @JsonProperty("trusted")
  
  private Boolean trusted;

  @JsonProperty("blocked")
  
  private Boolean blocked;

  @JsonProperty("friendRequestDate")
  @Valid

  private OffsetDateTime friendRequestDate;

  @JsonProperty("friendResponseDate")
  @Valid

  private OffsetDateTime friendResponseDate;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("connectionViewedDate")
  @Valid

  private OffsetDateTime connectionViewedDate;

  /**
   * Gets or Sets connectionType
   */
  public enum ConnectionTypeEnum {
    PRIMARY("PRIMARY"),
    
    SECONDARY("SECONDARY"),
    
    DEPENDENT("DEPENDENT"),
    
    ACQUAINTANCE("ACQUAINTANCE");

    private final String value;

    ConnectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConnectionTypeEnum fromValue(String value) {
      for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("connectionType")
  
  private ConnectionTypeEnum connectionType;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("pendingConnection_id")
  
  private Long pendingConnectionId;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  public Connection id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Connection created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Connection updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public Connection deleted(OffsetDateTime deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  public OffsetDateTime getDeleted() {
    return deleted;
  }

  public void setDeleted(OffsetDateTime deleted) {
    this.deleted = deleted;
  }

  public Connection objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public Connection legacyId(String legacyId) {
    this.legacyId = legacyId;
    return this;
  }

   /**
   * Get legacyId
   * @return legacyId
  **/
  public String getLegacyId() {
    return legacyId;
  }

  public void setLegacyId(String legacyId) {
    this.legacyId = legacyId;
  }

  public Connection searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

   /**
   * Get searchTags
   * @return searchTags
  **/
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public Connection active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Connection valid(Boolean valid) {
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

  public Connection account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Connection connection(Account connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  public Account getConnection() {
    return connection;
  }

  public void setConnection(Account connection) {
    this.connection = connection;
  }

  public Connection pendingConnection(ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
    return this;
  }

   /**
   * Get pendingConnection
   * @return pendingConnection
  **/
  public ConnectedFriend getPendingConnection() {
    return pendingConnection;
  }

  public void setPendingConnection(ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
  }

  public Connection friend(Boolean friend) {
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

  public Connection friendRequested(Boolean friendRequested) {
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

  public Connection friendRequestPending(Boolean friendRequestPending) {
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

  public Connection following(Boolean following) {
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

  public Connection follower(Boolean follower) {
    this.follower = follower;
    return this;
  }

   /**
   * Get follower
   * @return follower
  **/
  public Boolean getFollower() {
    return follower;
  }

  public void setFollower(Boolean follower) {
    this.follower = follower;
  }

  public Connection trusted(Boolean trusted) {
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

  public Connection blocked(Boolean blocked) {
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

  public Connection friendRequestDate(OffsetDateTime friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
    return this;
  }

   /**
   * Get friendRequestDate
   * @return friendRequestDate
  **/
  public OffsetDateTime getFriendRequestDate() {
    return friendRequestDate;
  }

  public void setFriendRequestDate(OffsetDateTime friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
  }

  public Connection friendResponseDate(OffsetDateTime friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
    return this;
  }

   /**
   * Get friendResponseDate
   * @return friendResponseDate
  **/
  public OffsetDateTime getFriendResponseDate() {
    return friendResponseDate;
  }

  public void setFriendResponseDate(OffsetDateTime friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
  }

  public Connection display(String display) {
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

  public Connection connectionViewedDate(OffsetDateTime connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
    return this;
  }

   /**
   * Get connectionViewedDate
   * @return connectionViewedDate
  **/
  public OffsetDateTime getConnectionViewedDate() {
    return connectionViewedDate;
  }

  public void setConnectionViewedDate(OffsetDateTime connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  public Connection connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  public Connection title(String title) {
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

  public Connection pendingConnectionId(Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
    return this;
  }

   /**
   * Get pendingConnectionId
   * @return pendingConnectionId
  **/
  public Long getPendingConnectionId() {
    return pendingConnectionId;
  }

  public void setPendingConnectionId(Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
  }

  public Connection latitude(Double latitude) {
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

  public Connection longitude(Double longitude) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(id, connection.id) &&
        Objects.equals(created, connection.created) &&
        Objects.equals(updated, connection.updated) &&
        Objects.equals(deleted, connection.deleted) &&
        Objects.equals(objectType, connection.objectType) &&
        Objects.equals(legacyId, connection.legacyId) &&
        Objects.equals(searchTags, connection.searchTags) &&
        Objects.equals(active, connection.active) &&
        Objects.equals(valid, connection.valid) &&
        Objects.equals(account, connection.account) &&
        Objects.equals(connection, connection.connection) &&
        Objects.equals(pendingConnection, connection.pendingConnection) &&
        Objects.equals(friend, connection.friend) &&
        Objects.equals(friendRequested, connection.friendRequested) &&
        Objects.equals(friendRequestPending, connection.friendRequestPending) &&
        Objects.equals(following, connection.following) &&
        Objects.equals(follower, connection.follower) &&
        Objects.equals(trusted, connection.trusted) &&
        Objects.equals(blocked, connection.blocked) &&
        Objects.equals(friendRequestDate, connection.friendRequestDate) &&
        Objects.equals(friendResponseDate, connection.friendResponseDate) &&
        Objects.equals(display, connection.display) &&
        Objects.equals(connectionViewedDate, connection.connectionViewedDate) &&
        Objects.equals(connectionType, connection.connectionType) &&
        Objects.equals(title, connection.title) &&
        Objects.equals(pendingConnectionId, connection.pendingConnectionId) &&
        Objects.equals(latitude, connection.latitude) &&
        Objects.equals(longitude, connection.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, deleted, objectType, legacyId, searchTags, active, valid, account, connection, pendingConnection, friend, friendRequested, friendRequestPending, following, follower, trusted, blocked, friendRequestDate, friendResponseDate, display, connectionViewedDate, connectionType, title, pendingConnectionId, latitude, longitude);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    pendingConnection: ").append(toIndentedString(pendingConnection)).append("\n");
    sb.append("    friend: ").append(toIndentedString(friend)).append("\n");
    sb.append("    friendRequested: ").append(toIndentedString(friendRequested)).append("\n");
    sb.append("    friendRequestPending: ").append(toIndentedString(friendRequestPending)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    follower: ").append(toIndentedString(follower)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    friendRequestDate: ").append(toIndentedString(friendRequestDate)).append("\n");
    sb.append("    friendResponseDate: ").append(toIndentedString(friendResponseDate)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    connectionViewedDate: ").append(toIndentedString(connectionViewedDate)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    pendingConnectionId: ").append(toIndentedString(pendingConnectionId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

