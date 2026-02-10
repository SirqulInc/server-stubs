package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.VehicleCargoSetting;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VehicleType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleType {

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

  private @Nullable Double maxWeight;

  @Valid
  private List<@Valid VehicleCargoSetting> vehicleCargoSettings = new ArrayList<>();

  public VehicleType id(@Nullable Long id) {
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

  public VehicleType active(@Nullable Boolean active) {
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

  public VehicleType valid(@Nullable Boolean valid) {
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

  public VehicleType business(@Nullable Retailer business) {
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

  public VehicleType hub(@Nullable ServiceHub hub) {
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

  public VehicleType name(@Nullable String name) {
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

  public VehicleType width(@Nullable Double width) {
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

  public VehicleType height(@Nullable Double height) {
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

  public VehicleType depth(@Nullable Double depth) {
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

  public VehicleType volume(@Nullable Double volume) {
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

  public VehicleType maxWeight(@Nullable Double maxWeight) {
    this.maxWeight = maxWeight;
    return this;
  }

  /**
   * Get maxWeight
   * @return maxWeight
   */
  
  @Schema(name = "maxWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxWeight")
  public @Nullable Double getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(@Nullable Double maxWeight) {
    this.maxWeight = maxWeight;
  }

  public VehicleType vehicleCargoSettings(List<@Valid VehicleCargoSetting> vehicleCargoSettings) {
    this.vehicleCargoSettings = vehicleCargoSettings;
    return this;
  }

  public VehicleType addVehicleCargoSettingsItem(VehicleCargoSetting vehicleCargoSettingsItem) {
    if (this.vehicleCargoSettings == null) {
      this.vehicleCargoSettings = new ArrayList<>();
    }
    this.vehicleCargoSettings.add(vehicleCargoSettingsItem);
    return this;
  }

  /**
   * Get vehicleCargoSettings
   * @return vehicleCargoSettings
   */
  @Valid 
  @Schema(name = "vehicleCargoSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleCargoSettings")
  public List<@Valid VehicleCargoSetting> getVehicleCargoSettings() {
    return vehicleCargoSettings;
  }

  public void setVehicleCargoSettings(List<@Valid VehicleCargoSetting> vehicleCargoSettings) {
    this.vehicleCargoSettings = vehicleCargoSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleType vehicleType = (VehicleType) o;
    return Objects.equals(this.id, vehicleType.id) &&
        Objects.equals(this.active, vehicleType.active) &&
        Objects.equals(this.valid, vehicleType.valid) &&
        Objects.equals(this.business, vehicleType.business) &&
        Objects.equals(this.hub, vehicleType.hub) &&
        Objects.equals(this.name, vehicleType.name) &&
        Objects.equals(this.width, vehicleType.width) &&
        Objects.equals(this.height, vehicleType.height) &&
        Objects.equals(this.depth, vehicleType.depth) &&
        Objects.equals(this.volume, vehicleType.volume) &&
        Objects.equals(this.maxWeight, vehicleType.maxWeight) &&
        Objects.equals(this.vehicleCargoSettings, vehicleType.vehicleCargoSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, business, hub, name, width, height, depth, volume, maxWeight, vehicleCargoSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
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
    sb.append("    maxWeight: ").append(toIndentedString(maxWeight)).append("\n");
    sb.append("    vehicleCargoSettings: ").append(toIndentedString(vehicleCargoSettings)).append("\n");
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

