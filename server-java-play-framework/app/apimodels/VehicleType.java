package apimodels;

import apimodels.Retailer;
import apimodels.ServiceHub;
import apimodels.VehicleCargoSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VehicleType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VehicleType   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("business")
  @Valid

  private Retailer business;

  @JsonProperty("hub")
  @Valid

  private ServiceHub hub;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("width")
  
  private Double width;

  @JsonProperty("height")
  
  private Double height;

  @JsonProperty("depth")
  
  private Double depth;

  @JsonProperty("volume")
  
  private Double volume;

  @JsonProperty("maxWeight")
  
  private Double maxWeight;

  @JsonProperty("vehicleCargoSettings")
  @Valid

  private List<@Valid VehicleCargoSetting> vehicleCargoSettings = null;

  public VehicleType id(Long id) {
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

  public VehicleType active(Boolean active) {
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

  public VehicleType valid(Boolean valid) {
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

  public VehicleType business(Retailer business) {
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  public Retailer getBusiness() {
    return business;
  }

  public void setBusiness(Retailer business) {
    this.business = business;
  }

  public VehicleType hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

   /**
   * Get hub
   * @return hub
  **/
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public VehicleType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleType width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public VehicleType height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public VehicleType depth(Double depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public VehicleType volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public VehicleType maxWeight(Double maxWeight) {
    this.maxWeight = maxWeight;
    return this;
  }

   /**
   * Get maxWeight
   * @return maxWeight
  **/
  public Double getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(Double maxWeight) {
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
  **/
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
    return Objects.equals(id, vehicleType.id) &&
        Objects.equals(active, vehicleType.active) &&
        Objects.equals(valid, vehicleType.valid) &&
        Objects.equals(business, vehicleType.business) &&
        Objects.equals(hub, vehicleType.hub) &&
        Objects.equals(name, vehicleType.name) &&
        Objects.equals(width, vehicleType.width) &&
        Objects.equals(height, vehicleType.height) &&
        Objects.equals(depth, vehicleType.depth) &&
        Objects.equals(volume, vehicleType.volume) &&
        Objects.equals(maxWeight, vehicleType.maxWeight) &&
        Objects.equals(vehicleCargoSettings, vehicleType.vehicleCargoSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, business, hub, name, width, height, depth, volume, maxWeight, vehicleCargoSettings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

