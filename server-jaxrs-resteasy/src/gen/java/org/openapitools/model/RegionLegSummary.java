package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionLegSummary   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Long regionId;
  private String floorId;
  private Long retailerLocationId;
  private Long legId;

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
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("floorId")
  public String getFloorId() {
    return floorId;
  }
  public void setFloorId(String floorId) {
    this.floorId = floorId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }
  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legId")
  public Long getLegId() {
    return legId;
  }
  public void setLegId(Long legId) {
    this.legId = legId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

