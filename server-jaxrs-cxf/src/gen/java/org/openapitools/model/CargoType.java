package org.openapitools.model;

import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CargoType  {
  
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

  private Double weight;

  @ApiModelProperty(value = "")

  private Long loadTime;

  @ApiModelProperty(value = "")

  private Boolean palletizable;

  @ApiModelProperty(value = "")

  private Integer palletRatio;

  @ApiModelProperty(value = "")

  private Boolean adminOnly;
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

  public CargoType id(Long id) {
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

  public CargoType active(Boolean active) {
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

  public CargoType valid(Boolean valid) {
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

  public CargoType business(Retailer business) {
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

  public CargoType hub(ServiceHub hub) {
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

  public CargoType name(String name) {
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

  public CargoType width(Double width) {
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

  public CargoType height(Double height) {
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

  public CargoType depth(Double depth) {
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

  public CargoType volume(Double volume) {
    this.volume = volume;
    return this;
  }

 /**
   * Get weight
   * @return weight
  **/
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public CargoType weight(Double weight) {
    this.weight = weight;
    return this;
  }

 /**
   * Get loadTime
   * @return loadTime
  **/
  @JsonProperty("loadTime")
  public Long getLoadTime() {
    return loadTime;
  }

  public void setLoadTime(Long loadTime) {
    this.loadTime = loadTime;
  }

  public CargoType loadTime(Long loadTime) {
    this.loadTime = loadTime;
    return this;
  }

 /**
   * Get palletizable
   * @return palletizable
  **/
  @JsonProperty("palletizable")
  public Boolean getPalletizable() {
    return palletizable;
  }

  public void setPalletizable(Boolean palletizable) {
    this.palletizable = palletizable;
  }

  public CargoType palletizable(Boolean palletizable) {
    this.palletizable = palletizable;
    return this;
  }

 /**
   * Get palletRatio
   * @return palletRatio
  **/
  @JsonProperty("palletRatio")
  public Integer getPalletRatio() {
    return palletRatio;
  }

  public void setPalletRatio(Integer palletRatio) {
    this.palletRatio = palletRatio;
  }

  public CargoType palletRatio(Integer palletRatio) {
    this.palletRatio = palletRatio;
    return this;
  }

 /**
   * Get adminOnly
   * @return adminOnly
  **/
  @JsonProperty("adminOnly")
  public Boolean getAdminOnly() {
    return adminOnly;
  }

  public void setAdminOnly(Boolean adminOnly) {
    this.adminOnly = adminOnly;
  }

  public CargoType adminOnly(Boolean adminOnly) {
    this.adminOnly = adminOnly;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

