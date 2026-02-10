package apimodels;

import apimodels.StopResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LoadResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LoadResponse   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("size")
  
  private Long size;

  @JsonProperty("loadingTime")
  
  private Long loadingTime;

  @JsonProperty("separatePayloads")
  
  private Boolean separatePayloads;

  @JsonProperty("pickup")
  @Valid

  private StopResponse pickup;

  @JsonProperty("dropoff")
  @Valid

  private StopResponse dropoff;

  public LoadResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoadResponse name(String name) {
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

  public LoadResponse size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LoadResponse loadingTime(Long loadingTime) {
    this.loadingTime = loadingTime;
    return this;
  }

   /**
   * Get loadingTime
   * @return loadingTime
  **/
  public Long getLoadingTime() {
    return loadingTime;
  }

  public void setLoadingTime(Long loadingTime) {
    this.loadingTime = loadingTime;
  }

  public LoadResponse separatePayloads(Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
    return this;
  }

   /**
   * Get separatePayloads
   * @return separatePayloads
  **/
  public Boolean getSeparatePayloads() {
    return separatePayloads;
  }

  public void setSeparatePayloads(Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
  }

  public LoadResponse pickup(StopResponse pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Get pickup
   * @return pickup
  **/
  public StopResponse getPickup() {
    return pickup;
  }

  public void setPickup(StopResponse pickup) {
    this.pickup = pickup;
  }

  public LoadResponse dropoff(StopResponse dropoff) {
    this.dropoff = dropoff;
    return this;
  }

   /**
   * Get dropoff
   * @return dropoff
  **/
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
    LoadResponse loadResponse = (LoadResponse) o;
    return Objects.equals(id, loadResponse.id) &&
        Objects.equals(name, loadResponse.name) &&
        Objects.equals(size, loadResponse.size) &&
        Objects.equals(loadingTime, loadResponse.loadingTime) &&
        Objects.equals(separatePayloads, loadResponse.separatePayloads) &&
        Objects.equals(pickup, loadResponse.pickup) &&
        Objects.equals(dropoff, loadResponse.dropoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, loadingTime, separatePayloads, pickup, dropoff);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadResponse {\n");
    
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

