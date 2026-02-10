package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AgeGroupResponse  {
  
  @ApiModelProperty(value = "")

  private String key;

  @ApiModelProperty(value = "")

  private String toString;
 /**
   * Get key
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AgeGroupResponse key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Get toString
   * @return toString
  **/
  @JsonProperty("toString")
  public String getToString() {
    return toString;
  }

  public void setToString(String toString) {
    this.toString = toString;
  }

  public AgeGroupResponse toString(String toString) {
    this.toString = toString;
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
    AgeGroupResponse ageGroupResponse = (AgeGroupResponse) o;
    return Objects.equals(this.key, ageGroupResponse.key) &&
        Objects.equals(this.toString, ageGroupResponse.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, toString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeGroupResponse {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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

