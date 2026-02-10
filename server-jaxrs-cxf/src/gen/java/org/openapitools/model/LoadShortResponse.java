package org.openapitools.model;

import org.openapitools.model.StopResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LoadShortResponse  {
  
  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Long size;

  @ApiModelProperty(value = "")

  private Long loadingTime;

  @ApiModelProperty(value = "")

  private Boolean separatePayloads;

  @ApiModelProperty(value = "")

  @Valid

  private StopResponse pickup;

  @ApiModelProperty(value = "")

  @Valid

  private StopResponse dropoff;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoadShortResponse id(String id) {
    this.id = id;
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

  public LoadShortResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LoadShortResponse size(Long size) {
    this.size = size;
    return this;
  }

 /**
   * Get loadingTime
   * @return loadingTime
  **/
  @JsonProperty("loadingTime")
  public Long getLoadingTime() {
    return loadingTime;
  }

  public void setLoadingTime(Long loadingTime) {
    this.loadingTime = loadingTime;
  }

  public LoadShortResponse loadingTime(Long loadingTime) {
    this.loadingTime = loadingTime;
    return this;
  }

 /**
   * Get separatePayloads
   * @return separatePayloads
  **/
  @JsonProperty("separatePayloads")
  public Boolean getSeparatePayloads() {
    return separatePayloads;
  }

  public void setSeparatePayloads(Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
  }

  public LoadShortResponse separatePayloads(Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
    return this;
  }

 /**
   * Get pickup
   * @return pickup
  **/
  @JsonProperty("pickup")
  public StopResponse getPickup() {
    return pickup;
  }

  public void setPickup(StopResponse pickup) {
    this.pickup = pickup;
  }

  public LoadShortResponse pickup(StopResponse pickup) {
    this.pickup = pickup;
    return this;
  }

 /**
   * Get dropoff
   * @return dropoff
  **/
  @JsonProperty("dropoff")
  public StopResponse getDropoff() {
    return dropoff;
  }

  public void setDropoff(StopResponse dropoff) {
    this.dropoff = dropoff;
  }

  public LoadShortResponse dropoff(StopResponse dropoff) {
    this.dropoff = dropoff;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

