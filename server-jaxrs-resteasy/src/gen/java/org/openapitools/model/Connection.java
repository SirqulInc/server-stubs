package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Account;
import org.openapitools.model.ConnectedFriend;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Connection   {
  
  private Long id;
  private Date created;
  private Date updated;
  private Date deleted;
  private String objectType;
  private String legacyId;
  private String searchTags;
  private Boolean active;
  private Boolean valid;
  private Account account;
  private Account connection;
  private ConnectedFriend pendingConnection;
  private Boolean friend;
  private Boolean friendRequested;
  private Boolean friendRequestPending;
  private Boolean following;
  private Boolean follower;
  private Boolean trusted;
  private Boolean blocked;
  private Date friendRequestDate;
  private Date friendResponseDate;
  private String display;
  private Date connectionViewedDate;

  /**
   * Gets or Sets connectionType
   */
  public enum ConnectionTypeEnum {
    PRIMARY("PRIMARY"),

        SECONDARY("SECONDARY"),

        DEPENDENT("DEPENDENT"),

        ACQUAINTANCE("ACQUAINTANCE");
    private String value;

    ConnectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConnectionTypeEnum connectionType;
  private String title;
  private Long pendingConnectionId;
  private Double latitude;
  private Double longitude;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted")
  public Date getDeleted() {
    return deleted;
  }
  public void setDeleted(Date deleted) {
    this.deleted = deleted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("objectType")
  public String getObjectType() {
    return objectType;
  }
  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legacyId")
  public String getLegacyId() {
    return legacyId;
  }
  public void setLegacyId(String legacyId) {
    this.legacyId = legacyId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }
  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  @Valid
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connection")
  @Valid
  public Account getConnection() {
    return connection;
  }
  public void setConnection(Account connection) {
    this.connection = connection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pendingConnection")
  @Valid
  public ConnectedFriend getPendingConnection() {
    return pendingConnection;
  }
  public void setPendingConnection(ConnectedFriend pendingConnection) {
    this.pendingConnection = pendingConnection;
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
  @JsonProperty("follower")
  public Boolean getFollower() {
    return follower;
  }
  public void setFollower(Boolean follower) {
    this.follower = follower;
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
  @JsonProperty("friendRequestDate")
  public Date getFriendRequestDate() {
    return friendRequestDate;
  }
  public void setFriendRequestDate(Date friendRequestDate) {
    this.friendRequestDate = friendRequestDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendResponseDate")
  public Date getFriendResponseDate() {
    return friendResponseDate;
  }
  public void setFriendResponseDate(Date friendResponseDate) {
    this.friendResponseDate = friendResponseDate;
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
  @JsonProperty("connectionViewedDate")
  public Date getConnectionViewedDate() {
    return connectionViewedDate;
  }
  public void setConnectionViewedDate(Date connectionViewedDate) {
    this.connectionViewedDate = connectionViewedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionType")
  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }
  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
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
  @JsonProperty("pendingConnection_id")
  public Long getPendingConnectionId() {
    return pendingConnectionId;
  }
  public void setPendingConnectionId(Long pendingConnectionId) {
    this.pendingConnectionId = pendingConnectionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

