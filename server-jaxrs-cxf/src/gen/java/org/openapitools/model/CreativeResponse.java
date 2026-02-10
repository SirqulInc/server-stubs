package org.openapitools.model;

import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BidResponse;
import org.openapitools.model.JsonElement;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreativeResponse  {
  
  @ApiModelProperty(value = "")

  private Long creativeId;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;

  @ApiModelProperty(value = "")

  private String action;

  @ApiModelProperty(value = "")

  @Valid

  private JsonElement content;

  @ApiModelProperty(value = "")

  private String suffix;

  @ApiModelProperty(value = "")

  private String type;

  @ApiModelProperty(value = "")

  private String appVersion;

  @ApiModelProperty(value = "")

  private Boolean preview;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  @Valid

  private BidResponse currentBid;
 /**
   * Get creativeId
   * @return creativeId
  **/
  @JsonProperty("creativeId")
  public Long getCreativeId() {
    return creativeId;
  }

  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }

  public CreativeResponse creativeId(Long creativeId) {
    this.creativeId = creativeId;
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

  public CreativeResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreativeResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreativeResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public CreativeResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public CreativeResponse action(String action) {
    this.action = action;
    return this;
  }

 /**
   * Get content
   * @return content
  **/
  @JsonProperty("content")
  public JsonElement getContent() {
    return content;
  }

  public void setContent(JsonElement content) {
    this.content = content;
  }

  public CreativeResponse content(JsonElement content) {
    this.content = content;
    return this;
  }

 /**
   * Get suffix
   * @return suffix
  **/
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public CreativeResponse suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreativeResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get appVersion
   * @return appVersion
  **/
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public CreativeResponse appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

 /**
   * Get preview
   * @return preview
  **/
  @JsonProperty("preview")
  public Boolean getPreview() {
    return preview;
  }

  public void setPreview(Boolean preview) {
    this.preview = preview;
  }

  public CreativeResponse preview(Boolean preview) {
    this.preview = preview;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public CreativeResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get currentBid
   * @return currentBid
  **/
  @JsonProperty("currentBid")
  public BidResponse getCurrentBid() {
    return currentBid;
  }

  public void setCurrentBid(BidResponse currentBid) {
    this.currentBid = currentBid;
  }

  public CreativeResponse currentBid(BidResponse currentBid) {
    this.currentBid = currentBid;
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
    CreativeResponse creativeResponse = (CreativeResponse) o;
    return Objects.equals(this.creativeId, creativeResponse.creativeId) &&
        Objects.equals(this.active, creativeResponse.active) &&
        Objects.equals(this.name, creativeResponse.name) &&
        Objects.equals(this.description, creativeResponse.description) &&
        Objects.equals(this.image, creativeResponse.image) &&
        Objects.equals(this.action, creativeResponse.action) &&
        Objects.equals(this.content, creativeResponse.content) &&
        Objects.equals(this.suffix, creativeResponse.suffix) &&
        Objects.equals(this.type, creativeResponse.type) &&
        Objects.equals(this.appVersion, creativeResponse.appVersion) &&
        Objects.equals(this.preview, creativeResponse.preview) &&
        Objects.equals(this.owner, creativeResponse.owner) &&
        Objects.equals(this.currentBid, creativeResponse.currentBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeId, active, name, description, image, action, content, suffix, type, appVersion, preview, owner, currentBid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeResponse {\n");
    
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    currentBid: ").append(toIndentedString(currentBid)).append("\n");
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

