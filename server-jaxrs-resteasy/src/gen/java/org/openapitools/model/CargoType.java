package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CargoType   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Retailer business;
  private ServiceHub hub;
  private String name;
  private Double width;
  private Double height;
  private Double depth;
  private Double volume;
  private Double weight;
  private Long loadTime;
  private Boolean palletizable;
  private Integer palletRatio;
  private Boolean adminOnly;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("business")
  @Valid
  public Retailer getBusiness() {
    return business;
  }
  public void setBusiness(Retailer business) {
    this.business = business;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hub")
  @Valid
  public ServiceHub getHub() {
    return hub;
  }
  public void setHub(ServiceHub hub) {
    this.hub = hub;
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
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("depth")
  public Double getDepth() {
    return depth;
  }
  public void setDepth(Double depth) {
    this.depth = depth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("volume")
  public Double getVolume() {
    return volume;
  }
  public void setVolume(Double volume) {
    this.volume = volume;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("loadTime")
  public Long getLoadTime() {
    return loadTime;
  }
  public void setLoadTime(Long loadTime) {
    this.loadTime = loadTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("palletizable")
  public Boolean getPalletizable() {
    return palletizable;
  }
  public void setPalletizable(Boolean palletizable) {
    this.palletizable = palletizable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("palletRatio")
  public Integer getPalletRatio() {
    return palletRatio;
  }
  public void setPalletRatio(Integer palletRatio) {
    this.palletRatio = palletRatio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("adminOnly")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

