package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BidResponse;
import org.openapitools.model.JsonElement;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CreativeResponse   {
  
  private Long creativeId;
  private Boolean active;
  private String name;
  private String description;
  private AssetShortResponse image;
  private String action;
  private JsonElement content;
  private String suffix;
  private String type;
  private String appVersion;
  private Boolean preview;
  private AccountShortResponse owner;
  private BidResponse currentBid;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creativeId")
  public Long getCreativeId() {
    return creativeId;
  }
  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public AssetShortResponse getImage() {
    return image;
  }
  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  @Valid
  public JsonElement getContent() {
    return content;
  }
  public void setContent(JsonElement content) {
    this.content = content;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preview")
  public Boolean getPreview() {
    return preview;
  }
  public void setPreview(Boolean preview) {
    this.preview = preview;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentBid")
  @Valid
  public BidResponse getCurrentBid() {
    return currentBid;
  }
  public void setCurrentBid(BidResponse currentBid) {
    this.currentBid = currentBid;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

