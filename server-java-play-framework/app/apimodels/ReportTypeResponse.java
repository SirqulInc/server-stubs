package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ReportTypeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReportTypeResponse   {
  @JsonProperty("type")
  
  private String type;

  @JsonProperty("javaType")
  
  private String javaType;

  @JsonProperty("label")
  
  private String label;

  @JsonProperty("number")
  
  private Boolean number;

  @JsonProperty("majorAxis")
  
  private Boolean majorAxis;

  public ReportTypeResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportTypeResponse javaType(String javaType) {
    this.javaType = javaType;
    return this;
  }

   /**
   * Get javaType
   * @return javaType
  **/
  public String getJavaType() {
    return javaType;
  }

  public void setJavaType(String javaType) {
    this.javaType = javaType;
  }

  public ReportTypeResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ReportTypeResponse number(Boolean number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  public Boolean getNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public ReportTypeResponse majorAxis(Boolean majorAxis) {
    this.majorAxis = majorAxis;
    return this;
  }

   /**
   * Get majorAxis
   * @return majorAxis
  **/
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
    return Objects.equals(type, reportTypeResponse.type) &&
        Objects.equals(javaType, reportTypeResponse.javaType) &&
        Objects.equals(label, reportTypeResponse.label) &&
        Objects.equals(number, reportTypeResponse.number) &&
        Objects.equals(majorAxis, reportTypeResponse.majorAxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, javaType, label, number, majorAxis);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

