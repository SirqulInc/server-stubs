package apimodels;

import apimodels.StopResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LoadShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LoadShortResponse   {
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

  public LoadShortResponse id(String id) {
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

  public LoadShortResponse name(String name) {
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

  public LoadShortResponse size(Long size) {
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

  public LoadShortResponse loadingTime(Long loadingTime) {
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

  public LoadShortResponse separatePayloads(Boolean separatePayloads) {
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

  public LoadShortResponse pickup(StopResponse pickup) {
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

  public LoadShortResponse dropoff(StopResponse dropoff) {
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
    LoadShortResponse loadShortResponse = (LoadShortResponse) o;
    return Objects.equals(id, loadShortResponse.id) &&
        Objects.equals(name, loadShortResponse.name) &&
        Objects.equals(size, loadShortResponse.size) &&
        Objects.equals(loadingTime, loadShortResponse.loadingTime) &&
        Objects.equals(separatePayloads, loadShortResponse.separatePayloads) &&
        Objects.equals(pickup, loadShortResponse.pickup) &&
        Objects.equals(dropoff, loadShortResponse.dropoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, loadingTime, separatePayloads, pickup, dropoff);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

