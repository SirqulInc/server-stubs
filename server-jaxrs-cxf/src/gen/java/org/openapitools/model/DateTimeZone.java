package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DateTimeZone  {
  
  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private Boolean fixed;
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

  public DateTimeZone id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get fixed
   * @return fixed
  **/
  @JsonProperty("fixed")
  public Boolean getFixed() {
    return fixed;
  }

  public void setFixed(Boolean fixed) {
    this.fixed = fixed;
  }

  public DateTimeZone fixed(Boolean fixed) {
    this.fixed = fixed;
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
    DateTimeZone dateTimeZone = (DateTimeZone) o;
    return Objects.equals(this.id, dateTimeZone.id) &&
        Objects.equals(this.fixed, dateTimeZone.fixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeZone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
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

