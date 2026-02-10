package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TrilatCacheSample;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TrilatCacheRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrilatCacheRequest {

  private @Nullable String udid;

  private @Nullable Long sourceTime;

  private @Nullable Integer minimumSampleSize;

  @Valid
  private List<@Valid TrilatCacheSample> samples = new ArrayList<>();

  public TrilatCacheRequest udid(@Nullable String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * Get udid
   * @return udid
   */
  
  @Schema(name = "udid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("udid")
  public @Nullable String getUdid() {
    return udid;
  }

  public void setUdid(@Nullable String udid) {
    this.udid = udid;
  }

  public TrilatCacheRequest sourceTime(@Nullable Long sourceTime) {
    this.sourceTime = sourceTime;
    return this;
  }

  /**
   * Get sourceTime
   * @return sourceTime
   */
  
  @Schema(name = "sourceTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceTime")
  public @Nullable Long getSourceTime() {
    return sourceTime;
  }

  public void setSourceTime(@Nullable Long sourceTime) {
    this.sourceTime = sourceTime;
  }

  public TrilatCacheRequest minimumSampleSize(@Nullable Integer minimumSampleSize) {
    this.minimumSampleSize = minimumSampleSize;
    return this;
  }

  /**
   * Get minimumSampleSize
   * @return minimumSampleSize
   */
  
  @Schema(name = "minimumSampleSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumSampleSize")
  public @Nullable Integer getMinimumSampleSize() {
    return minimumSampleSize;
  }

  public void setMinimumSampleSize(@Nullable Integer minimumSampleSize) {
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
   */
  @Valid 
  @Schema(name = "samples", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("samples")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

