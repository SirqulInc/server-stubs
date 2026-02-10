package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Direction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Direction   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("distance")
  
  private String distance;

  @JsonProperty("duration")
  
  private String duration;

  @JsonProperty("endLatitude")
  
  private Double endLatitude;

  @JsonProperty("endLongitude")
  
  private Double endLongitude;

  @JsonProperty("startLatitude")
  
  private Double startLatitude;

  @JsonProperty("startLongitude")
  
  private Double startLongitude;

  @JsonProperty("instruction")
  
  private String instruction;

  @JsonProperty("polyline")
  
  private String polyline;

  /**
   * Gets or Sets progressStatus
   */
  public enum ProgressStatusEnum {
    PENDING("PENDING"),
    
    COMPLETE("COMPLETE"),
    
    INVALID("INVALID");

    private final String value;

    ProgressStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProgressStatusEnum fromValue(String value) {
      for (ProgressStatusEnum b : ProgressStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("progressStatus")
  
  private ProgressStatusEnum progressStatus;

  @JsonProperty("highlight")
  
  private Boolean highlight;

  public Direction id(Long id) {
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

  public Direction active(Boolean active) {
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

  public Direction valid(Boolean valid) {
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

  public Direction distance(String distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public Direction duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Direction endLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

   /**
   * Get endLatitude
   * @return endLatitude
  **/
  public Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public Direction endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

   /**
   * Get endLongitude
   * @return endLongitude
  **/
  public Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public Direction startLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

   /**
   * Get startLatitude
   * @return startLatitude
  **/
  public Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public Direction startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

   /**
   * Get startLongitude
   * @return startLongitude
  **/
  public Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public Direction instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public Direction polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

   /**
   * Get polyline
   * @return polyline
  **/
  public String getPolyline() {
    return polyline;
  }

  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  public Direction progressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

   /**
   * Get progressStatus
   * @return progressStatus
  **/
  public ProgressStatusEnum getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  public Direction highlight(Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

   /**
   * Get highlight
   * @return highlight
  **/
  public Boolean getHighlight() {
    return highlight;
  }

  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Direction direction = (Direction) o;
    return Objects.equals(id, direction.id) &&
        Objects.equals(active, direction.active) &&
        Objects.equals(valid, direction.valid) &&
        Objects.equals(distance, direction.distance) &&
        Objects.equals(duration, direction.duration) &&
        Objects.equals(endLatitude, direction.endLatitude) &&
        Objects.equals(endLongitude, direction.endLongitude) &&
        Objects.equals(startLatitude, direction.startLatitude) &&
        Objects.equals(startLongitude, direction.startLongitude) &&
        Objects.equals(instruction, direction.instruction) &&
        Objects.equals(polyline, direction.polyline) &&
        Objects.equals(progressStatus, direction.progressStatus) &&
        Objects.equals(highlight, direction.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, distance, duration, endLatitude, endLongitude, startLatitude, startLongitude, instruction, polyline, progressStatus, highlight);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Direction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    progressStatus: ").append(toIndentedString(progressStatus)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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

