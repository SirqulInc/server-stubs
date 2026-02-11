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
public class NameStringValueResponse   {
  
  private String name;
  private String valueString;

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
  @JsonProperty("valueString")
  public String getValueString() {
    return valueString;
  }
  public void setValueString(String valueString) {
    this.valueString = valueString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameStringValueResponse nameStringValueResponse = (NameStringValueResponse) o;
    return Objects.equals(this.name, nameStringValueResponse.name) &&
        Objects.equals(this.valueString, nameStringValueResponse.valueString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valueString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameStringValueResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueString: ").append(toIndentedString(valueString)).append("\n");
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

