package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrilatAppSettings   {
  

  /**
   * Gets or Sets processingType
   */
  public enum ProcessingTypeEnum {
    DEFAULT("DEFAULT"),

        FINGERPRINT("FINGERPRINT"),

        FINGERPRINT_V2("FINGERPRINT_V2");
    private String value;

    ProcessingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProcessingTypeEnum processingType;
  private Integer maxSampleSize;
  private Double minRSSI;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("processingType")
  public ProcessingTypeEnum getProcessingType() {
    return processingType;
  }
  public void setProcessingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxSampleSize")
  public Integer getMaxSampleSize() {
    return maxSampleSize;
  }
  public void setMaxSampleSize(Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minRSSI")
  public Double getMinRSSI() {
    return minRSSI;
  }
  public void setMinRSSI(Double minRSSI) {
    this.minRSSI = minRSSI;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrilatAppSettings trilatAppSettings = (TrilatAppSettings) o;
    return Objects.equals(this.processingType, trilatAppSettings.processingType) &&
        Objects.equals(this.maxSampleSize, trilatAppSettings.maxSampleSize) &&
        Objects.equals(this.minRSSI, trilatAppSettings.minRSSI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingType, maxSampleSize, minRSSI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrilatAppSettings {\n");
    
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    maxSampleSize: ").append(toIndentedString(maxSampleSize)).append("\n");
    sb.append("    minRSSI: ").append(toIndentedString(minRSSI)).append("\n");
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

