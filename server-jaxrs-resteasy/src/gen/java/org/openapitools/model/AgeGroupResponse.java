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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AgeGroupResponse   {
  
  private String key;
  private String toString;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("toString")
  public String getToString() {
    return toString;
  }
  public void setToString(String toString) {
    this.toString = toString;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

