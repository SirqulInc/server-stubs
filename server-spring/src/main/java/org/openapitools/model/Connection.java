package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.Account;
import org.openapitools.model.ConnectedFriend;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Connection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Connection {

  private @Nullable Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime deleted;

  private @Nullable String objectType;

  private @Nullable String legacyId;

  private @Nullable String searchTags;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account account;

  private @Nullable Account connection;

  private @Nullable ConnectedFriend pendingConnection;

  private @Nullable Boolean friend;

  private @Nullable Boolean friendRequested;

  private @Nullable Boolean friendRequestPending;

  private @Nullable Boolean following;

  private @Nullable Boolean follower;

  private @Nullable Boolean trusted;

  private @Nullable Boolean blocked;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime friendRequestDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime friendResponseDate;

  private @Nullable String display;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime connectionViewedDate;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ConnectionTypeEnum connectionType;

  private @Nullable String title;

  private @Nullable Long pendingConnectionId;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  public Connection id(@Nullable Long id) {
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

  public Connection created(@Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@Nullable OffsetDateTime created) {
    this.created = created;
  }

  public Connection updated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @Valid 
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
  }

  public Connection deleted(@Nullable OffsetDateTime deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  @Valid 
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public @Nullable OffsetDateTime getDeleted() {
    return deleted;
  }

  public void setDeleted(@Nullable OffsetDateTime deleted) {
    this.deleted = deleted;
  }

  public Connection objectType(@Nullable String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
   */
  
  @Schema(name = "objectType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectType")
  public @Nullable String getObjectType() {
    return objectType;
  }

  public void setObjectType(@Nullable String objectType) {
    this.objectType = objectType;
  }

  public Connection legacyId(@Nullable String legacyId) {
    this.legacyId = legacyId;
    return this;
  }

  /**
   * Get legacyId
   * @return legacyId
   */
  
  @Schema(name = "legacyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legacyId")
  public @Nullable String getLegacyId() {
    return legacyId;
  }

  public void setLegacyId(@Nullable String legacyId) {
    this.legacyId = legacyId;
  }

  public Connection searchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

  /**
   * Get searchTags
   * @return searchTags
   */
  
  @Schema(name = "searchTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchTags")
  public @Nullable String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
  }

  public Connection active(@Nullable Boolean active) {
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

  public Connection valid(@Nullable Boolean valid) {
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

  public Connection account(@Nullable Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public @Nullable Account getAccount() {
    return account;
  }

  public void setAccount(@Nullable Account account) {
    this.account = account;
  }

  public Connection connection(@Nullable Account connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
   */
  @Valid 
  @Schema(name = "connection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection")
  public @Nullable Account getConnection() {
    return connection;
  }

  public void setConnection(@Nullable Account connection) {
    this.connection = connection;
  }

  public Connection pendingConnection(@Nullable ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
    return this;
  }

  /**
   * Get pendingConnection
   * @return pendingConnection
   */
  @Valid 
  @Schema(name = "pendingConnection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingConnection")
  public @Nullable ConnectedFriend getPendingConnection() {
    return pendingConnection;
  }

  public void setPendingConnection(@Nullable ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
  }

  public Connection friend(@Nullable Boolean friend) {
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

  public Connection friendRequested(@Nullable Boolean friendRequested) {
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

  public Connection friendRequestPending(@Nullable Boolean friendRequestPending) {
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

  public Connection following(@Nullable Boolean following) {
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

  public Connection follower(@Nullable Boolean follower) {
    this.follower = follower;
    return this;
  }

  /**
   * Get follower
   * @return follower
   */
  
  @Schema(name = "follower", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follower")
  public @Nullable Boolean getFollower() {
    return follower;
  }

  public void setFollower(@Nullable Boolean follower) {
    this.follower = follower;
  }

  public Connection trusted(@Nullable Boolean trusted) {
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

  public Connection blocked(@Nullable Boolean blocked) {
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

  public Connection friendRequestDate(@Nullable OffsetDateTime friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
    return this;
  }

  /**
   * Get friendRequestDate
   * @return friendRequestDate
   */
  @Valid 
  @Schema(name = "friendRequestDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendRequestDate")
  public @Nullable OffsetDateTime getFriendRequestDate() {
    return friendRequestDate;
  }

  public void setFriendRequestDate(@Nullable OffsetDateTime friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
  }

  public Connection friendResponseDate(@Nullable OffsetDateTime friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
    return this;
  }

  /**
   * Get friendResponseDate
   * @return friendResponseDate
   */
  @Valid 
  @Schema(name = "friendResponseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendResponseDate")
  public @Nullable OffsetDateTime getFriendResponseDate() {
    return friendResponseDate;
  }

  public void setFriendResponseDate(@Nullable OffsetDateTime friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
  }

  public Connection display(@Nullable String display) {
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

  public Connection connectionViewedDate(@Nullable OffsetDateTime connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
    return this;
  }

  /**
   * Get connectionViewedDate
   * @return connectionViewedDate
   */
  @Valid 
  @Schema(name = "connectionViewedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionViewedDate")
  public @Nullable OffsetDateTime getConnectionViewedDate() {
    return connectionViewedDate;
  }

  public void setConnectionViewedDate(@Nullable OffsetDateTime connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  public Connection connectionType(@Nullable ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * Get connectionType
   * @return connectionType
   */
  
  @Schema(name = "connectionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionType")
  public @Nullable ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(@Nullable ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  public Connection title(@Nullable String title) {
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

  public Connection pendingConnectionId(@Nullable Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
    return this;
  }

  /**
   * Get pendingConnectionId
   * @return pendingConnectionId
   */
  
  @Schema(name = "pendingConnection_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingConnection_id")
  public @Nullable Long getPendingConnectionId() {
    return pendingConnectionId;
  }

  public void setPendingConnectionId(@Nullable Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
  }

  public Connection latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public Connection longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

