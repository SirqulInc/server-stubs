package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CargoType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CargoType {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Retailer business;

  private @Nullable ServiceHub hub;

  private @Nullable String name;

  private @Nullable Double width;

  private @Nullable Double height;

  private @Nullable Double depth;

  private @Nullable Double volume;

  private @Nullable Double weight;

  private @Nullable Long loadTime;

  private @Nullable Boolean palletizable;

  private @Nullable Integer palletRatio;

  private @Nullable Boolean adminOnly;

  public CargoType id(@Nullable Long id) {
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

  public CargoType active(@Nullable Boolean active) {
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

  public CargoType valid(@Nullable Boolean valid) {
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

  public CargoType business(@Nullable Retailer business) {
    this.business = business;
    return this;
  }

  /**
   * Get business
   * @return business
   */
  @Valid 
  @Schema(name = "business", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business")
  public @Nullable Retailer getBusiness() {
    return business;
  }

  public void setBusiness(@Nullable Retailer business) {
    this.business = business;
  }

  public CargoType hub(@Nullable ServiceHub hub) {
    this.hub = hub;
    return this;
  }

  /**
   * Get hub
   * @return hub
   */
  @Valid 
  @Schema(name = "hub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hub")
  public @Nullable ServiceHub getHub() {
    return hub;
  }

  public void setHub(@Nullable ServiceHub hub) {
    this.hub = hub;
  }

  public CargoType name(@Nullable String name) {
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

  public CargoType width(@Nullable Double width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public @Nullable Double getWidth() {
    return width;
  }

  public void setWidth(@Nullable Double width) {
    this.width = width;
  }

  public CargoType height(@Nullable Double height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public @Nullable Double getHeight() {
    return height;
  }

  public void setHeight(@Nullable Double height) {
    this.height = height;
  }

  public CargoType depth(@Nullable Double depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
   */
  
  @Schema(name = "depth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("depth")
  public @Nullable Double getDepth() {
    return depth;
  }

  public void setDepth(@Nullable Double depth) {
    this.depth = depth;
  }

  public CargoType volume(@Nullable Double volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
   */
  
  @Schema(name = "volume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("volume")
  public @Nullable Double getVolume() {
    return volume;
  }

  public void setVolume(@Nullable Double volume) {
    this.volume = volume;
  }

  public CargoType weight(@Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public @Nullable Double getWeight() {
    return weight;
  }

  public void setWeight(@Nullable Double weight) {
    this.weight = weight;
  }

  public CargoType loadTime(@Nullable Long loadTime) {
    this.loadTime = loadTime;
    return this;
  }

  /**
   * Get loadTime
   * @return loadTime
   */
  
  @Schema(name = "loadTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadTime")
  public @Nullable Long getLoadTime() {
    return loadTime;
  }

  public void setLoadTime(@Nullable Long loadTime) {
    this.loadTime = loadTime;
  }

  public CargoType palletizable(@Nullable Boolean palletizable) {
    this.palletizable = palletizable;
    return this;
  }

  /**
   * Get palletizable
   * @return palletizable
   */
  
  @Schema(name = "palletizable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("palletizable")
  public @Nullable Boolean getPalletizable() {
    return palletizable;
  }

  public void setPalletizable(@Nullable Boolean palletizable) {
    this.palletizable = palletizable;
  }

  public CargoType palletRatio(@Nullable Integer palletRatio) {
    this.palletRatio = palletRatio;
    return this;
  }

  /**
   * Get palletRatio
   * @return palletRatio
   */
  
  @Schema(name = "palletRatio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("palletRatio")
  public @Nullable Integer getPalletRatio() {
    return palletRatio;
  }

  public void setPalletRatio(@Nullable Integer palletRatio) {
    this.palletRatio = palletRatio;
  }

  public CargoType adminOnly(@Nullable Boolean adminOnly) {
    this.adminOnly = adminOnly;
    return this;
  }

  /**
   * Get adminOnly
   * @return adminOnly
   */
  
  @Schema(name = "adminOnly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminOnly")
  public @Nullable Boolean getAdminOnly() {
    return adminOnly;
  }

  public void setAdminOnly(@Nullable Boolean adminOnly) {
    this.adminOnly = adminOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CargoType cargoType = (CargoType) o;
    return Objects.equals(this.id, cargoType.id) &&
        Objects.equals(this.active, cargoType.active) &&
        Objects.equals(this.valid, cargoType.valid) &&
        Objects.equals(this.business, cargoType.business) &&
        Objects.equals(this.hub, cargoType.hub) &&
        Objects.equals(this.name, cargoType.name) &&
        Objects.equals(this.width, cargoType.width) &&
        Objects.equals(this.height, cargoType.height) &&
        Objects.equals(this.depth, cargoType.depth) &&
        Objects.equals(this.volume, cargoType.volume) &&
        Objects.equals(this.weight, cargoType.weight) &&
        Objects.equals(this.loadTime, cargoType.loadTime) &&
        Objects.equals(this.palletizable, cargoType.palletizable) &&
        Objects.equals(this.palletRatio, cargoType.palletRatio) &&
        Objects.equals(this.adminOnly, cargoType.adminOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, business, hub, name, width, height, depth, volume, weight, loadTime, palletizable, palletRatio, adminOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    loadTime: ").append(toIndentedString(loadTime)).append("\n");
    sb.append("    palletizable: ").append(toIndentedString(palletizable)).append("\n");
    sb.append("    palletRatio: ").append(toIndentedString(palletRatio)).append("\n");
    sb.append("    adminOnly: ").append(toIndentedString(adminOnly)).append("\n");
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

