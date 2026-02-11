package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlacementResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PlacementResponse {

  private @Nullable Long placementId;

  private @Nullable String name;

  private @Nullable String description;

  /**
   * Gets or Sets size
   */
  public enum SizeEnum {
    CONFIG("CONFIG"),
    
    BANNER("BANNER"),
    
    LEADERBOARD("LEADERBOARD"),
    
    SKYSCRAPER("SKYSCRAPER"),
    
    VIDEO("VIDEO"),
    
    ZIP("ZIP"),
    
    INTERSTITIAL("INTERSTITIAL"),
    
    CUSTOM1("CUSTOM1"),
    
    CUSTOM2("CUSTOM2"),
    
    CUSTOM3("CUSTOM3"),
    
    CUSTOM4("CUSTOM4"),
    
    CUSTOM5("CUSTOM5"),
    
    CUSTOM6("CUSTOM6"),
    
    CUSTOM7("CUSTOM7"),
    
    CUSTOM8("CUSTOM8"),
    
    CUSTOM9("CUSTOM9"),
    
    CUSTOM10("CUSTOM10");

    private final String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SizeEnum size;

  private @Nullable Integer height;

  private @Nullable Integer width;

  private @Nullable Integer refreshInterval;

  private @Nullable String appName;

  private @Nullable String appKey;

  private @Nullable Boolean active;

  private @Nullable AssetShortResponse defaultImage;

  public PlacementResponse placementId(@Nullable Long placementId) {
    this.placementId = placementId;
    return this;
  }

  /**
   * Get placementId
   * @return placementId
   */
  
  @Schema(name = "placementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placementId")
  public @Nullable Long getPlacementId() {
    return placementId;
  }

  public void setPlacementId(@Nullable Long placementId) {
    this.placementId = placementId;
  }

  public PlacementResponse name(@Nullable String name) {
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

  public PlacementResponse description(@Nullable String description) {
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

  public PlacementResponse size(@Nullable SizeEnum size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable SizeEnum getSize() {
    return size;
  }

  public void setSize(@Nullable SizeEnum size) {
    this.size = size;
  }

  public PlacementResponse height(@Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public @Nullable Integer getHeight() {
    return height;
  }

  public void setHeight(@Nullable Integer height) {
    this.height = height;
  }

  public PlacementResponse width(@Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public @Nullable Integer getWidth() {
    return width;
  }

  public void setWidth(@Nullable Integer width) {
    this.width = width;
  }

  public PlacementResponse refreshInterval(@Nullable Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

  /**
   * Get refreshInterval
   * @return refreshInterval
   */
  
  @Schema(name = "refreshInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshInterval")
  public @Nullable Integer getRefreshInterval() {
    return refreshInterval;
  }

  public void setRefreshInterval(@Nullable Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
  }

  public PlacementResponse appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public @Nullable String getAppName() {
    return appName;
  }

  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public PlacementResponse appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public PlacementResponse active(@Nullable Boolean active) {
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

  public PlacementResponse defaultImage(@Nullable AssetShortResponse defaultImage) {
    this.defaultImage = defaultImage;
    return this;
  }

  /**
   * Get defaultImage
   * @return defaultImage
   */
  @Valid 
  @Schema(name = "defaultImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultImage")
  public @Nullable AssetShortResponse getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(@Nullable AssetShortResponse defaultImage) {
    this.defaultImage = defaultImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementResponse placementResponse = (PlacementResponse) o;
    return Objects.equals(this.placementId, placementResponse.placementId) &&
        Objects.equals(this.name, placementResponse.name) &&
        Objects.equals(this.description, placementResponse.description) &&
        Objects.equals(this.size, placementResponse.size) &&
        Objects.equals(this.height, placementResponse.height) &&
        Objects.equals(this.width, placementResponse.width) &&
        Objects.equals(this.refreshInterval, placementResponse.refreshInterval) &&
        Objects.equals(this.appName, placementResponse.appName) &&
        Objects.equals(this.appKey, placementResponse.appKey) &&
        Objects.equals(this.active, placementResponse.active) &&
        Objects.equals(this.defaultImage, placementResponse.defaultImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementId, name, description, size, height, width, refreshInterval, appName, appKey, active, defaultImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementResponse {\n");
    sb.append("    placementId: ").append(toIndentedString(placementId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    defaultImage: ").append(toIndentedString(defaultImage)).append("\n");
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

