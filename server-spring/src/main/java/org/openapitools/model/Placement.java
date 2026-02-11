package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Placement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Placement {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Application application;

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

  /**
   * Gets or Sets clickType
   */
  public enum ClickTypeEnum {
    CONFIG("CONFIG"),
    
    PURCHASE("PURCHASE"),
    
    BANNER("BANNER"),
    
    LEADERBOARD("LEADERBOARD"),
    
    SKYSCRAPER("SKYSCRAPER"),
    
    VIDEO("VIDEO"),
    
    ZIP("ZIP"),
    
    FULL("FULL"),
    
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

    ClickTypeEnum(String value) {
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
    public static ClickTypeEnum fromValue(String value) {
      for (ClickTypeEnum b : ClickTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ClickTypeEnum clickType;

  private @Nullable Integer height;

  private @Nullable Integer width;

  private @Nullable Integer refreshInterval;

  private @Nullable Asset defaultImage;

  public Placement id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Placement active(@Nullable Boolean active) {
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

  public Placement valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Placement application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public Placement name(@Nullable String name) {
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

  public Placement description(@Nullable String description) {
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

  public Placement size(@Nullable SizeEnum size) {
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

  public Placement clickType(@Nullable ClickTypeEnum clickType) {
    this.clickType = clickType;
    return this;
  }

  /**
   * Get clickType
   * @return clickType
   */
  
  @Schema(name = "clickType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clickType")
  public @Nullable ClickTypeEnum getClickType() {
    return clickType;
  }

  public void setClickType(@Nullable ClickTypeEnum clickType) {
    this.clickType = clickType;
  }

  public Placement height(@Nullable Integer height) {
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

  public Placement width(@Nullable Integer width) {
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

  public Placement refreshInterval(@Nullable Integer refreshInterval) {
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

  public Placement defaultImage(@Nullable Asset defaultImage) {
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
  public @Nullable Asset getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(@Nullable Asset defaultImage) {
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
    Placement placement = (Placement) o;
    return Objects.equals(this.id, placement.id) &&
        Objects.equals(this.active, placement.active) &&
        Objects.equals(this.valid, placement.valid) &&
        Objects.equals(this.application, placement.application) &&
        Objects.equals(this.name, placement.name) &&
        Objects.equals(this.description, placement.description) &&
        Objects.equals(this.size, placement.size) &&
        Objects.equals(this.clickType, placement.clickType) &&
        Objects.equals(this.height, placement.height) &&
        Objects.equals(this.width, placement.width) &&
        Objects.equals(this.refreshInterval, placement.refreshInterval) &&
        Objects.equals(this.defaultImage, placement.defaultImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, application, name, description, size, clickType, height, width, refreshInterval, defaultImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Placement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    clickType: ").append(toIndentedString(clickType)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
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

