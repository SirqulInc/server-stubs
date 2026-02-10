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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportTypeResponse   {
  
  private String type;
  private String javaType;
  private String label;
  private Boolean number;
  private Boolean majorAxis;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("javaType")
  public String getJavaType() {
    return javaType;
  }
  public void setJavaType(String javaType) {
    this.javaType = javaType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public Boolean getNumber() {
    return number;
  }
  public void setNumber(Boolean number) {
    this.number = number;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("majorAxis")
  public Boolean getMajorAxis() {
    return majorAxis;
  }
  public void setMajorAxis(Boolean majorAxis) {
    this.majorAxis = majorAxis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTypeResponse reportTypeResponse = (ReportTypeResponse) o;
    return Objects.equals(this.type, reportTypeResponse.type) &&
        Objects.equals(this.javaType, reportTypeResponse.javaType) &&
        Objects.equals(this.label, reportTypeResponse.label) &&
        Objects.equals(this.number, reportTypeResponse.number) &&
        Objects.equals(this.majorAxis, reportTypeResponse.majorAxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, javaType, label, number, majorAxis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTypeResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    javaType: ").append(toIndentedString(javaType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    majorAxis: ").append(toIndentedString(majorAxis)).append("\n");
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

