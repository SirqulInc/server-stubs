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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GroupPermissions   {
  
  private Boolean canViewProfileInfo;
  private Boolean canViewGameInfo;
  private Boolean canViewFriendInfo;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canViewProfileInfo")
  public Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }
  public void setCanViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canViewGameInfo")
  public Boolean getCanViewGameInfo() {
    return canViewGameInfo;
  }
  public void setCanViewGameInfo(Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canViewFriendInfo")
  public Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }
  public void setCanViewFriendInfo(Boolean canViewFriendInfo) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

