package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrilatAppSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrilatAppSettings   {
  /**
   * Gets or Sets processingType
   */
  public enum ProcessingTypeEnum {
    DEFAULT("DEFAULT"),
    
    FINGERPRINT("FINGERPRINT"),
    
    FINGERPRINT_V2("FINGERPRINT_V2");

    private final String value;

    ProcessingTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("processingType")
  
  private ProcessingTypeEnum processingType;

  @JsonProperty("maxSampleSize")
  
  private Integer maxSampleSize;

  @JsonProperty("minRSSI")
  
  private Double minRSSI;

  public TrilatAppSettings processingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
    return this;
  }

   /**
   * Get processingType
   * @return processingType
  **/
  public ProcessingTypeEnum getProcessingType() {
    return processingType;
  }

  public void setProcessingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
  }

  public TrilatAppSettings maxSampleSize(Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
    return this;
  }

   /**
   * Get maxSampleSize
   * @return maxSampleSize
  **/
  public Integer getMaxSampleSize() {
    return maxSampleSize;
  }

  public void setMaxSampleSize(Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
  }

  public TrilatAppSettings minRSSI(Double minRSSI) {
    this.minRSSI = minRSSI;
    return this;
  }

   /**
   * Get minRSSI
   * @return minRSSI
  **/
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
    return Objects.equals(processingType, trilatAppSettings.processingType) &&
        Objects.equals(maxSampleSize, trilatAppSettings.maxSampleSize) &&
        Objects.equals(minRSSI, trilatAppSettings.minRSSI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingType, maxSampleSize, minRSSI);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

