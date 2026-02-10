package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GroupPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GroupPermissions   {
  @JsonProperty("canViewProfileInfo")
  
  private Boolean canViewProfileInfo;

  @JsonProperty("canViewGameInfo")
  
  private Boolean canViewGameInfo;

  @JsonProperty("canViewFriendInfo")
  
  private Boolean canViewFriendInfo;

  public GroupPermissions canViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
    return this;
  }

   /**
   * Get canViewProfileInfo
   * @return canViewProfileInfo
  **/
  public Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }

  public void setCanViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  public GroupPermissions canViewGameInfo(Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
    return this;
  }

   /**
   * Get canViewGameInfo
   * @return canViewGameInfo
  **/
  public Boolean getCanViewGameInfo() {
    return canViewGameInfo;
  }

  public void setCanViewGameInfo(Boolean canViewGameInfo) {
    this.canViewGameInfo = canViewGameInfo;
  }

  public GroupPermissions canViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
    return this;
  }

   /**
   * Get canViewFriendInfo
   * @return canViewFriendInfo
  **/
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
    return Objects.equals(canViewProfileInfo, groupPermissions.canViewProfileInfo) &&
        Objects.equals(canViewGameInfo, groupPermissions.canViewGameInfo) &&
        Objects.equals(canViewFriendInfo, groupPermissions.canViewFriendInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canViewProfileInfo, canViewGameInfo, canViewFriendInfo);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

