package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportTypeResponse  {
  
  @ApiModelProperty(value = "")

  private String type;

  @ApiModelProperty(value = "")

  private String javaType;

  @ApiModelProperty(value = "")

  private String label;

  @ApiModelProperty(value = "")

  private Boolean number;

  @ApiModelProperty(value = "")

  private Boolean majorAxis;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportTypeResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get javaType
   * @return javaType
  **/
  @JsonProperty("javaType")
  public String getJavaType() {
    return javaType;
  }

  public void setJavaType(String javaType) {
    this.javaType = javaType;
  }

  public ReportTypeResponse javaType(String javaType) {
    this.javaType = javaType;
    return this;
  }

 /**
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ReportTypeResponse label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get number
   * @return number
  **/
  @JsonProperty("number")
  public Boolean getNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public ReportTypeResponse number(Boolean number) {
    this.number = number;
    return this;
  }

 /**
   * Get majorAxis
   * @return majorAxis
  **/
  @JsonProperty("majorAxis")
  public Boolean getMajorAxis() {
    return majorAxis;
  }

  public void setMajorAxis(Boolean majorAxis) {
    this.majorAxis = majorAxis;
  }

  public ReportTypeResponse majorAxis(Boolean majorAxis) {
    this.majorAxis = majorAxis;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

