package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RegionLegSummary  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Long regionId;

  @ApiModelProperty(value = "")

  private String floorId;

  @ApiModelProperty(value = "")

  private Long retailerLocationId;

  @ApiModelProperty(value = "")

  private Long legId;
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

  public RegionLegSummary id(Long id) {
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

  public RegionLegSummary active(Boolean active) {
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

  public RegionLegSummary valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get regionId
   * @return regionId
  **/
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public RegionLegSummary regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
   * Get floorId
   * @return floorId
  **/
  @JsonProperty("floorId")
  public String getFloorId() {
    return floorId;
  }

  public void setFloorId(String floorId) {
    this.floorId = floorId;
  }

  public RegionLegSummary floorId(String floorId) {
    this.floorId = floorId;
    return this;
  }

 /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public RegionLegSummary retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

 /**
   * Get legId
   * @return legId
  **/
  @JsonProperty("legId")
  public Long getLegId() {
    return legId;
  }

  public void setLegId(Long legId) {
    this.legId = legId;
  }

  public RegionLegSummary legId(Long legId) {
    this.legId = legId;
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
    RegionLegSummary regionLegSummary = (RegionLegSummary) o;
    return Objects.equals(this.id, regionLegSummary.id) &&
        Objects.equals(this.active, regionLegSummary.active) &&
        Objects.equals(this.valid, regionLegSummary.valid) &&
        Objects.equals(this.regionId, regionLegSummary.regionId) &&
        Objects.equals(this.floorId, regionLegSummary.floorId) &&
        Objects.equals(this.retailerLocationId, regionLegSummary.retailerLocationId) &&
        Objects.equals(this.legId, regionLegSummary.legId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, regionId, floorId, retailerLocationId, legId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionLegSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    legId: ").append(toIndentedString(legId)).append("\n");
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

