package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GroupPermissions  {
  
  @ApiModelProperty(value = "")

  private Boolean canViewProfileInfo;

  @ApiModelProperty(value = "")

  private Boolean canViewGameInfo;

  @ApiModelProperty(value = "")

  private Boolean canViewFriendInfo;
 /**
   * Get canViewProfileInfo
   * @return canViewProfileInfo
  **/
  @JsonProperty("canViewProfileInfo")
  public Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }

  public void setCanViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  public GroupPermissions canViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
    return this;
  }

 /**
   * Get canViewGameInfo
   * @return canViewGameInfo
  **/
  @JsonProperty("canViewGameInfo")
  public Boolean getCanViewGameInfo() {
    return canViewGameInfo;
  }

  public void setCanViewGameInfo(Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
  }

  public GroupPermissions canViewGameInfo(Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
    return this;
  }

 /**
   * Get canViewFriendInfo
   * @return canViewFriendInfo
  **/
  @JsonProperty("canViewFriendInfo")
  public Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }

  public void setCanViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
  }

  public GroupPermissions canViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

