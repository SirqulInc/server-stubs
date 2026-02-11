package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BidResponse;
import org.openapitools.model.JsonElement;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreativeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CreativeResponse {

  private @Nullable Long creativeId;

  private @Nullable Boolean active;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable AssetShortResponse image;

  private @Nullable String action;

  private @Nullable JsonElement content;

  private @Nullable String suffix;

  private @Nullable String type;

  private @Nullable String appVersion;

  private @Nullable Boolean preview;

  private @Nullable AccountShortResponse owner;

  private @Nullable BidResponse currentBid;

  public CreativeResponse creativeId(@Nullable Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  /**
   * Get creativeId
   * @return creativeId
   */
  
  @Schema(name = "creativeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creativeId")
  public @Nullable Long getCreativeId() {
    return creativeId;
  }

  public void setCreativeId(@Nullable Long creativeId) {
    this.creativeId = creativeId;
  }

  public CreativeResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public CreativeResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CreativeResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public CreativeResponse image(@Nullable AssetShortResponse image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable AssetShortResponse getImage() {
    return image;
  }

  public void setImage(@Nullable AssetShortResponse image) {
    this.image = image;
  }

  public CreativeResponse action(@Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable String getAction() {
    return action;
  }

  public void setAction(@Nullable String action) {
    this.action = action;
  }

  public CreativeResponse content(@Nullable JsonElement content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public @Nullable JsonElement getContent() {
    return content;
  }

  public void setContent(@Nullable JsonElement content) {
    this.content = content;
  }

  public CreativeResponse suffix(@Nullable String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  
  @Schema(name = "suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public @Nullable String getSuffix() {
    return suffix;
  }

  public void setSuffix(@Nullable String suffix) {
    this.suffix = suffix;
  }

  public CreativeResponse type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public CreativeResponse appVersion(@Nullable String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Get appVersion
   * @return appVersion
   */
  
  @Schema(name = "appVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appVersion")
  public @Nullable String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(@Nullable String appVersion) {
    this.appVersion = appVersion;
  }

  public CreativeResponse preview(@Nullable Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * Get preview
   * @return preview
   */
  
  @Schema(name = "preview", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preview")
  public @Nullable Boolean getPreview() {
    return preview;
  }

  public void setPreview(@Nullable Boolean preview) {
    this.preview = preview;
  }

  public CreativeResponse owner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public CreativeResponse currentBid(@Nullable BidResponse currentBid) {
    this.currentBid = currentBid;
    return this;
  }

  /**
   * Get currentBid
   * @return currentBid
   */
  @Valid 
  @Schema(name = "currentBid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBid")
  public @Nullable BidResponse getCurrentBid() {
    return currentBid;
  }

  public void setCurrentBid(@Nullable BidResponse currentBid) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

