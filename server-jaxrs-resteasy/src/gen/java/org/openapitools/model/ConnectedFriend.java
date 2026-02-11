package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectedFriend   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String display;
  private Asset avatar;
  private String avatarURL;
  private String platform;
  private String platformId;
  private Boolean invited;
  private String locationDescription;

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
  @JsonProperty("avatar")
  @Valid
  public Asset getAvatar() {
    return avatar;
  }
  public void setAvatar(Asset avatar) {
    this.avatar = avatar;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("avatarURL")
  public String getAvatarURL() {
    return avatarURL;
  }
  public void setAvatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("platformId")
  public String getPlatformId() {
    return platformId;
  }
  public void setPlatformId(String platformId) {
    this.platformId = platformId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invited")
  public Boolean getInvited() {
    return invited;
  }
  public void setInvited(Boolean invited) {
    this.invited = invited;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedFriend connectedFriend = (ConnectedFriend) o;
    return Objects.equals(this.id, connectedFriend.id) &&
        Objects.equals(this.active, connectedFriend.active) &&
        Objects.equals(this.valid, connectedFriend.valid) &&
        Objects.equals(this.display, connectedFriend.display) &&
        Objects.equals(this.avatar, connectedFriend.avatar) &&
        Objects.equals(this.avatarURL, connectedFriend.avatarURL) &&
        Objects.equals(this.platform, connectedFriend.platform) &&
        Objects.equals(this.platformId, connectedFriend.platformId) &&
        Objects.equals(this.invited, connectedFriend.invited) &&
        Objects.equals(this.locationDescription, connectedFriend.locationDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, display, avatar, avatarURL, platform, platformId, invited, locationDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedFriend {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarURL: ").append(toIndentedString(avatarURL)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    invited: ").append(toIndentedString(invited)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
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

