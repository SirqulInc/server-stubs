package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrilatCacheSample;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TrilatCacheRequest  {
  
  @ApiModelProperty(value = "")

  private String udid;

  @ApiModelProperty(value = "")

  private Long sourceTime;

  @ApiModelProperty(value = "")

  private Integer minimumSampleSize;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid TrilatCacheSample> samples = new ArrayList<>();
 /**
   * Get udid
   * @return udid
  **/
  @JsonProperty("udid")
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public TrilatCacheRequest udid(String udid) {
    this.udid = udid;
    return this;
  }

 /**
   * Get sourceTime
   * @return sourceTime
  **/
  @JsonProperty("sourceTime")
  public Long getSourceTime() {
    return sourceTime;
  }

  public void setSourceTime(Long sourceTime) {
    this.sourceTime = sourceTime;
  }

  public TrilatCacheRequest sourceTime(Long sourceTime) {
    this.sourceTime = sourceTime;
    return this;
  }

 /**
   * Get minimumSampleSize
   * @return minimumSampleSize
  **/
  @JsonProperty("minimumSampleSize")
  public Integer getMinimumSampleSize() {
    return minimumSampleSize;
  }

  public void setMinimumSampleSize(Integer minimumSampleSize) {
    this.minimumSampleSize = minimumSampleSize;
  }

  public TrilatCacheRequest minimumSampleSize(Integer minimumSampleSize) {
    this.minimumSampleSize = minimumSampleSize;
    return this;
  }

 /**
   * Get samples
   * @return samples
  **/
  @JsonProperty("samples")
  public List<@Valid TrilatCacheSample> getSamples() {
    return samples;
  }

  public void setSamples(List<@Valid TrilatCacheSample> samples) {
    this.samples = samples;
  }

  public TrilatCacheRequest samples(List<@Valid TrilatCacheSample> samples) {
    this.samples = samples;
    return this;
  }

  public TrilatCacheRequest addSamplesItem(TrilatCacheSample samplesItem) {
    this.samples.add(samplesItem);
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
    TrilatCacheRequest trilatCacheRequest = (TrilatCacheRequest) o;
    return Objects.equals(this.udid, trilatCacheRequest.udid) &&
        Objects.equals(this.sourceTime, trilatCacheRequest.sourceTime) &&
        Objects.equals(this.minimumSampleSize, trilatCacheRequest.minimumSampleSize) &&
        Objects.equals(this.samples, trilatCacheRequest.samples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(udid, sourceTime, minimumSampleSize, samples);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

