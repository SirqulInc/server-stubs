package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StopResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LoadShortResponse   {
  
  private String id;
  private String name;
  private Long size;
  private Long loadingTime;
  private Boolean separatePayloads;
  private StopResponse pickup;
  private StopResponse dropoff;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("loadingTime")
  public Long getLoadingTime() {
    return loadingTime;
  }
  public void setLoadingTime(Long loadingTime) {
    this.loadingTime = loadingTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("separatePayloads")
  public Boolean getSeparatePayloads() {
    return separatePayloads;
  }
  public void setSeparatePayloads(Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickup")
  @Valid
  public StopResponse getPickup() {
    return pickup;
  }
  public void setPickup(StopResponse pickup) {
    this.pickup = pickup;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropoff")
  @Valid
  public StopResponse getDropoff() {
    return dropoff;
  }
  public void setDropoff(StopResponse dropoff) {
    this.dropoff = dropoff;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadShortResponse loadShortResponse = (LoadShortResponse) o;
    return Objects.equals(this.id, loadShortResponse.id) &&
        Objects.equals(this.name, loadShortResponse.name) &&
        Objects.equals(this.size, loadShortResponse.size) &&
        Objects.equals(this.loadingTime, loadShortResponse.loadingTime) &&
        Objects.equals(this.separatePayloads, loadShortResponse.separatePayloads) &&
        Objects.equals(this.pickup, loadShortResponse.pickup) &&
        Objects.equals(this.dropoff, loadShortResponse.dropoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, loadingTime, separatePayloads, pickup, dropoff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadShortResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    loadingTime: ").append(toIndentedString(loadingTime)).append("\n");
    sb.append("    separatePayloads: ").append(toIndentedString(separatePayloads)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    dropoff: ").append(toIndentedString(dropoff)).append("\n");
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

