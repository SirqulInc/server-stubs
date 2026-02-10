package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.Account;
import org.openapitools.model.ConnectedFriend;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Connection  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Date created;

  @ApiModelProperty(value = "")

  private Date updated;

  @ApiModelProperty(value = "")

  private Date deleted;

  @ApiModelProperty(value = "")

  private String objectType;

  @ApiModelProperty(value = "")

  private String legacyId;

  @ApiModelProperty(value = "")

  private String searchTags;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account account;

  @ApiModelProperty(value = "")

  @Valid

  private Account connection;

  @ApiModelProperty(value = "")

  @Valid

  private ConnectedFriend pendingConnection;

  @ApiModelProperty(value = "")

  private Boolean friend;

  @ApiModelProperty(value = "")

  private Boolean friendRequested;

  @ApiModelProperty(value = "")

  private Boolean friendRequestPending;

  @ApiModelProperty(value = "")

  private Boolean following;

  @ApiModelProperty(value = "")

  private Boolean follower;

  @ApiModelProperty(value = "")

  private Boolean trusted;

  @ApiModelProperty(value = "")

  private Boolean blocked;

  @ApiModelProperty(value = "")

  private Date friendRequestDate;

  @ApiModelProperty(value = "")

  private Date friendResponseDate;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private Date connectionViewedDate;

public enum ConnectionTypeEnum {

PRIMARY(String.valueOf("PRIMARY")), SECONDARY(String.valueOf("SECONDARY")), DEPENDENT(String.valueOf("DEPENDENT")), ACQUAINTANCE(String.valueOf("ACQUAINTANCE"));


    private String value;

    ConnectionTypeEnum (String v) {
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
    public static ConnectionTypeEnum fromValue(String value) {
        for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ConnectionTypeEnum connectionType;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private Long pendingConnectionId;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Connection id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Connection created(Date created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Connection updated(Date updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get deleted
   * @return deleted
  **/
  @JsonProperty("deleted")
  public Date getDeleted() {
    return deleted;
  }

  public void setDeleted(Date deleted) {
    this.deleted = deleted;
  }

  public Connection deleted(Date deleted) {
    this.deleted = deleted;
    return this;
  }

 /**
   * Get objectType
   * @return objectType
  **/
  @JsonProperty("objectType")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public Connection objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

 /**
   * Get legacyId
   * @return legacyId
  **/
  @JsonProperty("legacyId")
  public String getLegacyId() {
    return legacyId;
  }

  public void setLegacyId(String legacyId) {
    this.legacyId = legacyId;
  }

  public Connection legacyId(String legacyId) {
    this.legacyId = legacyId;
    return this;
  }

 /**
   * Get searchTags
   * @return searchTags
  **/
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public Connection searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Connection active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Connection valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Connection account(Account account) {
    this.account = account;
    return this;
  }

 /**
   * Get connection
   * @return connection
  **/
  @JsonProperty("connection")
  public Account getConnection() {
    return connection;
  }

  public void setConnection(Account connection) {
    this.connection = connection;
  }

  public Connection connection(Account connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Get pendingConnection
   * @return pendingConnection
  **/
  @JsonProperty("pendingConnection")
  public ConnectedFriend getPendingConnection() {
    return pendingConnection;
  }

  public void setPendingConnection(ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
  }

  public Connection pendingConnection(ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
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

  public Connection friend(Boolean friend) {
    this.friend = friend;
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

  public Connection friendRequested(Boolean friendRequested) {
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

  public Connection friendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
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

  public Connection following(Boolean following) {
    this.following = following;
    return this;
  }

 /**
   * Get follower
   * @return follower
  **/
  @JsonProperty("follower")
  public Boolean getFollower() {
    return follower;
  }

  public void setFollower(Boolean follower) {
    this.follower = follower;
  }

  public Connection follower(Boolean follower) {
    this.follower = follower;
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

  public Connection trusted(Boolean trusted) {
    this.trusted = trusted;
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

  public Connection blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

 /**
   * Get friendRequestDate
   * @return friendRequestDate
  **/
  @JsonProperty("friendRequestDate")
  public Date getFriendRequestDate() {
    return friendRequestDate;
  }

  public void setFriendRequestDate(Date friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
  }

  public Connection friendRequestDate(Date friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
    return this;
  }

 /**
   * Get friendResponseDate
   * @return friendResponseDate
  **/
  @JsonProperty("friendResponseDate")
  public Date getFriendResponseDate() {
    return friendResponseDate;
  }

  public void setFriendResponseDate(Date friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
  }

  public Connection friendResponseDate(Date friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
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

  public Connection display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get connectionViewedDate
   * @return connectionViewedDate
  **/
  @JsonProperty("connectionViewedDate")
  public Date getConnectionViewedDate() {
    return connectionViewedDate;
  }

  public void setConnectionViewedDate(Date connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  public Connection connectionViewedDate(Date connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
    return this;
  }

 /**
   * Get connectionType
   * @return connectionType
  **/
  @JsonProperty("connectionType")
  public String getConnectionType() {
    if (connectionType == null) {
      return null;
    }
    return connectionType.value();
  }

  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  public Connection connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
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

  public Connection title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get pendingConnectionId
   * @return pendingConnectionId
  **/
  @JsonProperty("pendingConnection_id")
  public Long getPendingConnectionId() {
    return pendingConnectionId;
  }

  public void setPendingConnectionId(Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
  }

  public Connection pendingConnectionId(Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Connection latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Connection longitude(Double longitude) {
    this.longitude = longitude;
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
    Connection connection = (Connection) o;
    return Objects.equals(this.id, connection.id) &&
        Objects.equals(this.created, connection.created) &&
        Objects.equals(this.updated, connection.updated) &&
        Objects.equals(this.deleted, connection.deleted) &&
        Objects.equals(this.objectType, connection.objectType) &&
        Objects.equals(this.legacyId, connection.legacyId) &&
        Objects.equals(this.searchTags, connection.searchTags) &&
        Objects.equals(this.active, connection.active) &&
        Objects.equals(this.valid, connection.valid) &&
        Objects.equals(this.account, connection.account) &&
        Objects.equals(this.connection, connection.connection) &&
        Objects.equals(this.pendingConnection, connection.pendingConnection) &&
        Objects.equals(this.friend, connection.friend) &&
        Objects.equals(this.friendRequested, connection.friendRequested) &&
        Objects.equals(this.friendRequestPending, connection.friendRequestPending) &&
        Objects.equals(this.following, connection.following) &&
        Objects.equals(this.follower, connection.follower) &&
        Objects.equals(this.trusted, connection.trusted) &&
        Objects.equals(this.blocked, connection.blocked) &&
        Objects.equals(this.friendRequestDate, connection.friendRequestDate) &&
        Objects.equals(this.friendResponseDate, connection.friendResponseDate) &&
        Objects.equals(this.display, connection.display) &&
        Objects.equals(this.connectionViewedDate, connection.connectionViewedDate) &&
        Objects.equals(this.connectionType, connection.connectionType) &&
        Objects.equals(this.title, connection.title) &&
        Objects.equals(this.pendingConnectionId, connection.pendingConnectionId) &&
        Objects.equals(this.latitude, connection.latitude) &&
        Objects.equals(this.longitude, connection.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, deleted, objectType, legacyId, searchTags, active, valid, account, connection, pendingConnection, friend, friendRequested, friendRequestPending, following, follower, trusted, blocked, friendRequestDate, friendResponseDate, display, connectionViewedDate, connectionType, title, pendingConnectionId, latitude, longitude);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

