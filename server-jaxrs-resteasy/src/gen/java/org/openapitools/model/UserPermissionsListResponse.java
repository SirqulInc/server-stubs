package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PermissionResponse;
import org.openapitools.model.UserPermissionsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserPermissionsListResponse   {
  

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),

        SAVE("SAVE"),

        DELETE("DELETE"),

        GET("GET");
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ActionEnum action;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private PermissionResponse publicPermissions;
  private List<@Valid UserPermissionsResponse> userPermissions = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicPermissions")
  @Valid
  public PermissionResponse getPublicPermissions() {
    return publicPermissions;
  }
  public void setPublicPermissions(PermissionResponse publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userPermissions")
  @Valid
  public List<@Valid UserPermissionsResponse> getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(List<@Valid UserPermissionsResponse> userPermissions) {
    this.userPermissions = userPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPermissionsListResponse userPermissionsListResponse = (UserPermissionsListResponse) o;
    return Objects.equals(this.action, userPermissionsListResponse.action) &&
        Objects.equals(this.visibility, userPermissionsListResponse.visibility) &&
        Objects.equals(this.publicPermissions, userPermissionsListResponse.publicPermissions) &&
        Objects.equals(this.userPermissions, userPermissionsListResponse.userPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, visibility, publicPermissions, userPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissionsListResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
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

