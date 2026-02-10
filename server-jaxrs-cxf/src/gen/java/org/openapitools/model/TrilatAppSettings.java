package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TrilatAppSettings  {
  
public enum ProcessingTypeEnum {

DEFAULT(String.valueOf("DEFAULT")), FINGERPRINT(String.valueOf("FINGERPRINT")), FINGERPRINT_V2(String.valueOf("FINGERPRINT_V2"));


    private String value;

    ProcessingTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingTypeEnum fromValue(String value) {
        for (ProcessingTypeEnum b : ProcessingTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ProcessingTypeEnum processingType;

  @ApiModelProperty(value = "")

  private Integer maxSampleSize;

  @ApiModelProperty(value = "")

  private Double minRSSI;
 /**
   * Get processingType
   * @return processingType
  **/
  @JsonProperty("processingType")
  public String getProcessingType() {
    if (processingType == null) {
      return null;
    }
    return processingType.value();
  }

  public void setProcessingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
  }

  public TrilatAppSettings processingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
    return this;
  }

 /**
   * Get maxSampleSize
   * @return maxSampleSize
  **/
  @JsonProperty("maxSampleSize")
  public Integer getMaxSampleSize() {
    return maxSampleSize;
  }

  public void setMaxSampleSize(Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
  }

  public TrilatAppSettings maxSampleSize(Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
    return this;
  }

 /**
   * Get minRSSI
   * @return minRSSI
  **/
  @JsonProperty("minRSSI")
  public Double getMinRSSI() {
    return minRSSI;
  }

  public void setMinRSSI(Double minRSSI) {
    this.minRSSI = minRSSI;
  }

  public TrilatAppSettings minRSSI(Double minRSSI) {
    this.minRSSI = minRSSI;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

