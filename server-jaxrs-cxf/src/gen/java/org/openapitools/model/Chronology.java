package org.openapitools.model;

import org.openapitools.model.DateTimeZone;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Chronology  {
  
  @ApiModelProperty(value = "")

  @Valid

  private DateTimeZone zone;
 /**
   * Get zone
   * @return zone
  **/
  @JsonProperty("zone")
  public DateTimeZone getZone() {
    return zone;
  }

  public void setZone(DateTimeZone zone) {
    this.zone = zone;
  }

  public Chronology zone(DateTimeZone zone) {
    this.zone = zone;
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
    Chronology chronology = (Chronology) o;
    return Objects.equals(this.zone, chronology.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chronology {\n");
    
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

