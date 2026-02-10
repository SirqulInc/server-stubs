package apimodels;

import apimodels.Retailer;
import apimodels.ServiceHub;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CargoType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CargoType   {
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

  @JsonProperty("weight")
  
  private Double weight;

  @JsonProperty("loadTime")
  
  private Long loadTime;

  @JsonProperty("palletizable")
  
  private Boolean palletizable;

  @JsonProperty("palletRatio")
  
  private Integer palletRatio;

  @JsonProperty("adminOnly")
  
  private Boolean adminOnly;

  public CargoType id(Long id) {
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

  public CargoType active(Boolean active) {
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

  public CargoType valid(Boolean valid) {
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

  public CargoType business(Retailer business) {
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

  public CargoType hub(ServiceHub hub) {
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

  public CargoType name(String name) {
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

  public CargoType width(Double width) {
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

  public CargoType height(Double height) {
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

  public CargoType depth(Double depth) {
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

  public CargoType volume(Double volume) {
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

  public CargoType weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public CargoType loadTime(Long loadTime) {
    this.loadTime = loadTime;
    return this;
  }

   /**
   * Get loadTime
   * @return loadTime
  **/
  public Long getLoadTime() {
    return loadTime;
  }

  public void setLoadTime(Long loadTime) {
    this.loadTime = loadTime;
  }

  public CargoType palletizable(Boolean palletizable) {
    this.palletizable = palletizable;
    return this;
  }

   /**
   * Get palletizable
   * @return palletizable
  **/
  public Boolean getPalletizable() {
    return palletizable;
  }

  public void setPalletizable(Boolean palletizable) {
    this.palletizable = palletizable;
  }

  public CargoType palletRatio(Integer palletRatio) {
    this.palletRatio = palletRatio;
    return this;
  }

   /**
   * Get palletRatio
   * @return palletRatio
  **/
  public Integer getPalletRatio() {
    return palletRatio;
  }

  public void setPalletRatio(Integer palletRatio) {
    this.palletRatio = palletRatio;
  }

  public CargoType adminOnly(Boolean adminOnly) {
    this.adminOnly = adminOnly;
    return this;
  }

   /**
   * Get adminOnly
   * @return adminOnly
  **/
  public Boolean getAdminOnly() {
    return adminOnly;
  }

  public void setAdminOnly(Boolean adminOnly) {
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
    return Objects.equals(id, cargoType.id) &&
        Objects.equals(active, cargoType.active) &&
        Objects.equals(valid, cargoType.valid) &&
        Objects.equals(business, cargoType.business) &&
        Objects.equals(hub, cargoType.hub) &&
        Objects.equals(name, cargoType.name) &&
        Objects.equals(width, cargoType.width) &&
        Objects.equals(height, cargoType.height) &&
        Objects.equals(depth, cargoType.depth) &&
        Objects.equals(volume, cargoType.volume) &&
        Objects.equals(weight, cargoType.weight) &&
        Objects.equals(loadTime, cargoType.loadTime) &&
        Objects.equals(palletizable, cargoType.palletizable) &&
        Objects.equals(palletRatio, cargoType.palletRatio) &&
        Objects.equals(adminOnly, cargoType.adminOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, business, hub, name, width, height, depth, volume, weight, loadTime, palletizable, palletRatio, adminOnly);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

