package apimodels;

import apimodels.Asset;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConnectedFriend
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConnectedFriend   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("avatar")
  @Valid

  private Asset avatar;

  @JsonProperty("avatarURL")
  
  private String avatarURL;

  @JsonProperty("platform")
  
  private String platform;

  @JsonProperty("platformId")
  
  private String platformId;

  @JsonProperty("invited")
  
  private Boolean invited;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  public ConnectedFriend id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ConnectedFriend active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ConnectedFriend valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ConnectedFriend display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public ConnectedFriend avatar(Asset avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  public Asset getAvatar() {
    return avatar;
  }

  public void setAvatar(Asset avatar) {
    this.avatar = avatar;
  }

  public ConnectedFriend avatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
    return this;
  }

   /**
   * Get avatarURL
   * @return avatarURL
  **/
  public String getAvatarURL() {
    return avatarURL;
  }

  public void setAvatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
  }

  public ConnectedFriend platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ConnectedFriend platformId(String platformId) {
    this.platformId = platformId;
    return this;
  }

   /**
   * Get platformId
   * @return platformId
  **/
  public String getPlatformId() {
    return platformId;
  }

  public void setPlatformId(String platformId) {
    this.platformId = platformId;
  }

  public ConnectedFriend invited(Boolean invited) {
    this.invited = invited;
    return this;
  }

   /**
   * Get invited
   * @return invited
  **/
  public Boolean getInvited() {
    return invited;
  }

  public void setInvited(Boolean invited) {
    this.invited = invited;
  }

  public ConnectedFriend locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
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
    return Objects.equals(id, connectedFriend.id) &&
        Objects.equals(active, connectedFriend.active) &&
        Objects.equals(valid, connectedFriend.valid) &&
        Objects.equals(display, connectedFriend.display) &&
        Objects.equals(avatar, connectedFriend.avatar) &&
        Objects.equals(avatarURL, connectedFriend.avatarURL) &&
        Objects.equals(platform, connectedFriend.platform) &&
        Objects.equals(platformId, connectedFriend.platformId) &&
        Objects.equals(invited, connectedFriend.invited) &&
        Objects.equals(locationDescription, connectedFriend.locationDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, display, avatar, avatarURL, platform, platformId, invited, locationDescription);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

