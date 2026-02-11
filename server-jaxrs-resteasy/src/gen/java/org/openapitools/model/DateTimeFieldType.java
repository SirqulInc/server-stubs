package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DurationFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DateTimeFieldType   {
  
  private String name;
  private DurationFieldType rangeDurationType;
  private DurationFieldType durationType;

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
  @JsonProperty("rangeDurationType")
  @Valid
  public DurationFieldType getRangeDurationType() {
    return rangeDurationType;
  }
  public void setRangeDurationType(DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("durationType")
  @Valid
  public DurationFieldType getDurationType() {
    return durationType;
  }
  public void setDurationType(DurationFieldType durationType) {
    this.durationType = durationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeFieldType dateTimeFieldType = (DateTimeFieldType) o;
    return Objects.equals(this.name, dateTimeFieldType.name) &&
        Objects.equals(this.rangeDurationType, dateTimeFieldType.rangeDurationType) &&
        Objects.equals(this.durationType, dateTimeFieldType.durationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rangeDurationType, durationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeFieldType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rangeDurationType: ").append(toIndentedString(rangeDurationType)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
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

