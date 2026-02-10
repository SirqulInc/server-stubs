package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrilatCacheSample;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrilatCacheRequest   {
  
  private String udid;
  private Long sourceTime;
  private Integer minimumSampleSize;
  private List<@Valid TrilatCacheSample> samples = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("udid")
  public String getUdid() {
    return udid;
  }
  public void setUdid(String udid) {
    this.udid = udid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sourceTime")
  public Long getSourceTime() {
    return sourceTime;
  }
  public void setSourceTime(Long sourceTime) {
    this.sourceTime = sourceTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minimumSampleSize")
  public Integer getMinimumSampleSize() {
    return minimumSampleSize;
  }
  public void setMinimumSampleSize(Integer minimumSampleSize) {
    this.minimumSampleSize = minimumSampleSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("samples")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

