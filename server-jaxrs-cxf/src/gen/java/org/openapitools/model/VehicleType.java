package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.VehicleCargoSetting;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleType  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Retailer business;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Double width;

  @ApiModelProperty(value = "")

  private Double height;

  @ApiModelProperty(value = "")

  private Double depth;

  @ApiModelProperty(value = "")

  private Double volume;

  @ApiModelProperty(value = "")

  private Double maxWeight;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid VehicleCargoSetting> vehicleCargoSettings = new ArrayList<>();
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

  public VehicleType id(Long id) {
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

  public VehicleType active(Boolean active) {
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

  public VehicleType valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get business
   * @return business
  **/
  @JsonProperty("business")
  public Retailer getBusiness() {
    return business;
  }

  public void setBusiness(Retailer business) {
    this.business = business;
  }

  public VehicleType business(Retailer business) {
    this.business = business;
    return this;
  }

 /**
   * Get hub
   * @return hub
  **/
  @JsonProperty("hub")
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public VehicleType hub(ServiceHub hub) {
    this.hub = hub;
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

  public VehicleType name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get width
   * @return width
  **/
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public VehicleType width(Double width) {
    this.width = width;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public VehicleType height(Double height) {
    this.height = height;
    return this;
  }

 /**
   * Get depth
   * @return depth
  **/
  @JsonProperty("depth")
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public VehicleType depth(Double depth) {
    this.depth = depth;
    return this;
  }

 /**
   * Get volume
   * @return volume
  **/
  @JsonProperty("volume")
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public VehicleType volume(Double volume) {
    this.volume = volume;
    return this;
  }

 /**
   * Get maxWeight
   * @return maxWeight
  **/
  @JsonProperty("maxWeight")
  public Double getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(Double maxWeight) {
    this.maxWeight = maxWeight;
  }

  public VehicleType maxWeight(Double maxWeight) {
    this.maxWeight = maxWeight;
    return this;
  }

 /**
   * Get vehicleCargoSettings
   * @return vehicleCargoSettings
  **/
  @JsonProperty("vehicleCargoSettings")
  public List<@Valid VehicleCargoSetting> getVehicleCargoSettings() {
    return vehicleCargoSettings;
  }

  public void setVehicleCargoSettings(List<@Valid VehicleCargoSetting> vehicleCargoSettings) {
    this.vehicleCargoSettings = vehicleCargoSettings;
  }

  public VehicleType vehicleCargoSettings(List<@Valid VehicleCargoSetting> vehicleCargoSettings) {
    this.vehicleCargoSettings = vehicleCargoSettings;
    return this;
  }

  public VehicleType addVehicleCargoSettingsItem(VehicleCargoSetting vehicleCargoSettingsItem) {
    this.vehicleCargoSettings.add(vehicleCargoSettingsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

