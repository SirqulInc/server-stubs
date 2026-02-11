package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegionLegSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionLegSummary {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Long regionId;

  private @Nullable String floorId;

  private @Nullable Long retailerLocationId;

  private @Nullable Long legId;

  public RegionLegSummary id(@Nullable Long id) {
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

  public RegionLegSummary active(@Nullable Boolean active) {
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

  public RegionLegSummary valid(@Nullable Boolean valid) {
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

  public RegionLegSummary regionId(@Nullable Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Get regionId
   * @return regionId
   */
  
  @Schema(name = "regionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionId")
  public @Nullable Long getRegionId() {
    return regionId;
  }

  public void setRegionId(@Nullable Long regionId) {
    this.regionId = regionId;
  }

  public RegionLegSummary floorId(@Nullable String floorId) {
    this.floorId = floorId;
    return this;
  }

  /**
   * Get floorId
   * @return floorId
   */
  
  @Schema(name = "floorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floorId")
  public @Nullable String getFloorId() {
    return floorId;
  }

  public void setFloorId(@Nullable String floorId) {
    this.floorId = floorId;
  }

  public RegionLegSummary retailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

  /**
   * Get retailerLocationId
   * @return retailerLocationId
   */
  
  @Schema(name = "retailerLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocationId")
  public @Nullable Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public RegionLegSummary legId(@Nullable Long legId) {
    this.legId = legId;
    return this;
  }

  /**
   * Get legId
   * @return legId
   */
  
  @Schema(name = "legId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legId")
  public @Nullable Long getLegId() {
    return legId;
  }

  public void setLegId(@Nullable Long legId) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

