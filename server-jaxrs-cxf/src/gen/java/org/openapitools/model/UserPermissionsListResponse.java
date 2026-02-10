package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PermissionResponse;
import org.openapitools.model.UserPermissionsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserPermissionsListResponse  {
  
public enum ActionEnum {

DATA(String.valueOf("DATA")), SAVE(String.valueOf("SAVE")), DELETE(String.valueOf("DELETE")), GET(String.valueOf("GET"));


    private String value;

    ActionEnum (String v) {
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
    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ActionEnum action;

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
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
    public static VisibilityEnum fromValue(String value) {
        for (VisibilityEnum b : VisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  @Valid

  private PermissionResponse publicPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid UserPermissionsResponse> userPermissions = new ArrayList<>();
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    if (action == null) {
      return null;
    }
    return action.value();
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public UserPermissionsListResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public UserPermissionsListResponse visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  @JsonProperty("publicPermissions")
  public PermissionResponse getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(PermissionResponse publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public UserPermissionsListResponse publicPermissions(PermissionResponse publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

 /**
   * Get userPermissions
   * @return userPermissions
  **/
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissionsResponse> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissionsResponse> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public UserPermissionsListResponse userPermissions(List<@Valid UserPermissionsResponse> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public UserPermissionsListResponse addUserPermissionsItem(UserPermissionsResponse userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

