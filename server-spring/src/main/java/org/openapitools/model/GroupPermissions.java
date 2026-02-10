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
 * GroupPermissions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GroupPermissions {

  private @Nullable Boolean canViewProfileInfo;

  private @Nullable Boolean canViewGameInfo;

  private @Nullable Boolean canViewFriendInfo;

  public GroupPermissions canViewProfileInfo(@Nullable Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
    return this;
  }

  /**
   * Get canViewProfileInfo
   * @return canViewProfileInfo
   */
  
  @Schema(name = "canViewProfileInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canViewProfileInfo")
  public @Nullable Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }

  public void setCanViewProfileInfo(@Nullable Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  public GroupPermissions canViewGameInfo(@Nullable Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
    return this;
  }

  /**
   * Get canViewGameInfo
   * @return canViewGameInfo
   */
  
  @Schema(name = "canViewGameInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canViewGameInfo")
  public @Nullable Boolean getCanViewGameInfo() {
    return canViewGameInfo;
  }

  public void setCanViewGameInfo(@Nullable Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
  }

  public GroupPermissions canViewFriendInfo(@Nullable Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
    return this;
  }

  /**
   * Get canViewFriendInfo
   * @return canViewFriendInfo
   */
  
  @Schema(name = "canViewFriendInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canViewFriendInfo")
  public @Nullable Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }

  public void setCanViewFriendInfo(@Nullable Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPermissions groupPermissions = (GroupPermissions) o;
    return Objects.equals(this.canViewProfileInfo, groupPermissions.canViewProfileInfo) &&
        Objects.equals(this.canViewGameInfo, groupPermissions.canViewGameInfo) &&
        Objects.equals(this.canViewFriendInfo, groupPermissions.canViewFriendInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canViewProfileInfo, canViewGameInfo, canViewFriendInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupPermissions {\n");
    sb.append("    canViewProfileInfo: ").append(toIndentedString(canViewProfileInfo)).append("\n");
    sb.append("    canViewGameInfo: ").append(toIndentedString(canViewGameInfo)).append("\n");
    sb.append("    canViewFriendInfo: ").append(toIndentedString(canViewFriendInfo)).append("\n");
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

