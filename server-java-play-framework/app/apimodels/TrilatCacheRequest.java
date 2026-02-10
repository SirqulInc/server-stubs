package apimodels;

import apimodels.TrilatCacheSample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrilatCacheRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrilatCacheRequest   {
  @JsonProperty("udid")
  
  private String udid;

  @JsonProperty("sourceTime")
  
  private Long sourceTime;

  @JsonProperty("minimumSampleSize")
  
  private Integer minimumSampleSize;

  @JsonProperty("samples")
  @Valid

  private List<@Valid TrilatCacheSample> samples = null;

  public TrilatCacheRequest udid(String udid) {
    this.udid = udid;
    return this;
  }

   /**
   * Get udid
   * @return udid
  **/
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public TrilatCacheRequest sourceTime(Long sourceTime) {
    this.sourceTime = sourceTime;
    return this;
  }

   /**
   * Get sourceTime
   * @return sourceTime
  **/
  public Long getSourceTime() {
    return sourceTime;
  }

  public void setSourceTime(Long sourceTime) {
    this.sourceTime = sourceTime;
  }

  public TrilatCacheRequest minimumSampleSize(Integer minimumSampleSize) {
    this.minimumSampleSize = minimumSampleSize;
    return this;
  }

   /**
   * Get minimumSampleSize
   * @return minimumSampleSize
  **/
  public Integer getMinimumSampleSize() {
    return minimumSampleSize;
  }

  public void setMinimumSampleSize(Integer minimumSampleSize) {
    this.minimumSampleSize = minimumSampleSize;
  }

  public TrilatCacheRequest samples(List<@Valid TrilatCacheSample> samples) {
    this.samples = samples;
    return this;
  }

  public TrilatCacheRequest addSamplesItem(TrilatCacheSample samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  public List<@Valid TrilatCacheSample> getSamples() {
    return samples;
  }

  public void setSamples(List<@Valid TrilatCacheSample> samples) {
    this.samples = samples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrilatCacheRequest trilatCacheRequest = (TrilatCacheRequest) o;
    return Objects.equals(udid, trilatCacheRequest.udid) &&
        Objects.equals(sourceTime, trilatCacheRequest.sourceTime) &&
        Objects.equals(minimumSampleSize, trilatCacheRequest.minimumSampleSize) &&
        Objects.equals(samples, trilatCacheRequest.samples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(udid, sourceTime, minimumSampleSize, samples);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrilatCacheRequest {\n");
    
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    sourceTime: ").append(toIndentedString(sourceTime)).append("\n");
    sb.append("    minimumSampleSize: ").append(toIndentedString(minimumSampleSize)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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

