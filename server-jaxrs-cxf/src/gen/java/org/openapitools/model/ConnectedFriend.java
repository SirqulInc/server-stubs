package org.openapitools.model;

import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectedFriend  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  @Valid

  private Asset avatar;

  @ApiModelProperty(value = "")

  private String avatarURL;

  @ApiModelProperty(value = "")

  private String platform;

  @ApiModelProperty(value = "")

  private String platformId;

  @ApiModelProperty(value = "")

  private Boolean invited;

  @ApiModelProperty(value = "")

  private String locationDescription;
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

  public ConnectedFriend id(Long id) {
    this.id = id;
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

  public ConnectedFriend active(Boolean active) {
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

  public ConnectedFriend valid(Boolean valid) {
    this.valid = valid;
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

  public ConnectedFriend display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get avatar
   * @return avatar
  **/
  @JsonProperty("avatar")
  public Asset getAvatar() {
    return avatar;
  }

  public void setAvatar(Asset avatar) {
    this.avatar = avatar;
  }

  public ConnectedFriend avatar(Asset avatar) {
    this.avatar = avatar;
    return this;
  }

 /**
   * Get avatarURL
   * @return avatarURL
  **/
  @JsonProperty("avatarURL")
  public String getAvatarURL() {
    return avatarURL;
  }

  public void setAvatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
  }

  public ConnectedFriend avatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
    return this;
  }

 /**
   * Get platform
   * @return platform
  **/
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ConnectedFriend platform(String platform) {
    this.platform = platform;
    return this;
  }

 /**
   * Get platformId
   * @return platformId
  **/
  @JsonProperty("platformId")
  public String getPlatformId() {
    return platformId;
  }

  public void setPlatformId(String platformId) {
    this.platformId = platformId;
  }

  public ConnectedFriend platformId(String platformId) {
    this.platformId = platformId;
    return this;
  }

 /**
   * Get invited
   * @return invited
  **/
  @JsonProperty("invited")
  public Boolean getInvited() {
    return invited;
  }

  public void setInvited(Boolean invited) {
    this.invited = invited;
  }

  public ConnectedFriend invited(Boolean invited) {
    this.invited = invited;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public ConnectedFriend locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

