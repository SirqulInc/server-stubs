package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TrilatCacheSample
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrilatCacheSample {

  private @Nullable String avatarId;

  private @Nullable String deviceId;

  @Valid
  private List<Integer> rssi = new ArrayList<>();

  private @Nullable Double filteredRssi;

  private @Nullable Long time;

  private @Nullable String networkName;

  private @Nullable Boolean randomizedId;

  private @Nullable String deviceSignature;

  private @Nullable String alternateId;

  private @Nullable String type;

  /**
   * Gets or Sets probeType
   */
  public enum ProbeTypeEnum {
    WIFI_PROBE_REQUEST("WIFI_PROBE_REQUEST"),
    
    IBEACON("IBEACON"),
    
    BLE("BLE"),
    
    UNKNOWN("UNKNOWN");

    private final String value;

    ProbeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProbeTypeEnum fromValue(String value) {
      for (ProbeTypeEnum b : ProbeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ProbeTypeEnum probeType;

  private @Nullable Double avgRssi;

  public TrilatCacheSample avatarId(@Nullable String avatarId) {
    this.avatarId = avatarId;
    return this;
  }

  /**
   * Get avatarId
   * @return avatarId
   */
  
  @Schema(name = "avatarId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarId")
  public @Nullable String getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(@Nullable String avatarId) {
    this.avatarId = avatarId;
  }

  public TrilatCacheSample deviceId(@Nullable String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  
  @Schema(name = "deviceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceId")
  public @Nullable String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(@Nullable String deviceId) {
    this.deviceId = deviceId;
  }

  public TrilatCacheSample rssi(List<Integer> rssi) {
    this.rssi = rssi;
    return this;
  }

  public TrilatCacheSample addRssiItem(Integer rssiItem) {
    if (this.rssi == null) {
      this.rssi = new ArrayList<>();
    }
    this.rssi.add(rssiItem);
    return this;
  }

  /**
   * Get rssi
   * @return rssi
   */
  
  @Schema(name = "rssi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rssi")
  public List<Integer> getRssi() {
    return rssi;
  }

  public void setRssi(List<Integer> rssi) {
    this.rssi = rssi;
  }

  public TrilatCacheSample filteredRssi(@Nullable Double filteredRssi) {
    this.filteredRssi = filteredRssi;
    return this;
  }

  /**
   * Get filteredRssi
   * @return filteredRssi
   */
  
  @Schema(name = "filteredRssi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filteredRssi")
  public @Nullable Double getFilteredRssi() {
    return filteredRssi;
  }

  public void setFilteredRssi(@Nullable Double filteredRssi) {
    this.filteredRssi = filteredRssi;
  }

  public TrilatCacheSample time(@Nullable Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   */
  
  @Schema(name = "time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public @Nullable Long getTime() {
    return time;
  }

  public void setTime(@Nullable Long time) {
    this.time = time;
  }

  public TrilatCacheSample networkName(@Nullable String networkName) {
    this.networkName = networkName;
    return this;
  }

  /**
   * Get networkName
   * @return networkName
   */
  
  @Schema(name = "networkName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("networkName")
  public @Nullable String getNetworkName() {
    return networkName;
  }

  public void setNetworkName(@Nullable String networkName) {
    this.networkName = networkName;
  }

  public TrilatCacheSample randomizedId(@Nullable Boolean randomizedId) {
    this.randomizedId = randomizedId;
    return this;
  }

  /**
   * Get randomizedId
   * @return randomizedId
   */
  
  @Schema(name = "randomizedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("randomizedId")
  public @Nullable Boolean getRandomizedId() {
    return randomizedId;
  }

  public void setRandomizedId(@Nullable Boolean randomizedId) {
    this.randomizedId = randomizedId;
  }

  public TrilatCacheSample deviceSignature(@Nullable String deviceSignature) {
    this.deviceSignature = deviceSignature;
    return this;
  }

  /**
   * Get deviceSignature
   * @return deviceSignature
   */
  
  @Schema(name = "deviceSignature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSignature")
  public @Nullable String getDeviceSignature() {
    return deviceSignature;
  }

  public void setDeviceSignature(@Nullable String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  public TrilatCacheSample alternateId(@Nullable String alternateId) {
    this.alternateId = alternateId;
    return this;
  }

  /**
   * Get alternateId
   * @return alternateId
   */
  
  @Schema(name = "alternateId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternateId")
  public @Nullable String getAlternateId() {
    return alternateId;
  }

  public void setAlternateId(@Nullable String alternateId) {
    this.alternateId = alternateId;
  }

  public TrilatCacheSample type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public TrilatCacheSample probeType(@Nullable ProbeTypeEnum probeType) {
    this.probeType = probeType;
    return this;
  }

  /**
   * Get probeType
   * @return probeType
   */
  
  @Schema(name = "probeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("probeType")
  public @Nullable ProbeTypeEnum getProbeType() {
    return probeType;
  }

  public void setProbeType(@Nullable ProbeTypeEnum probeType) {
    this.probeType = probeType;
  }

  public TrilatCacheSample avgRssi(@Nullable Double avgRssi) {
    this.avgRssi = avgRssi;
    return this;
  }

  /**
   * Get avgRssi
   * @return avgRssi
   */
  
  @Schema(name = "avgRssi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgRssi")
  public @Nullable Double getAvgRssi() {
    return avgRssi;
  }

  public void setAvgRssi(@Nullable Double avgRssi) {
    this.avgRssi = avgRssi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrilatCacheSample trilatCacheSample = (TrilatCacheSample) o;
    return Objects.equals(this.avatarId, trilatCacheSample.avatarId) &&
        Objects.equals(this.deviceId, trilatCacheSample.deviceId) &&
        Objects.equals(this.rssi, trilatCacheSample.rssi) &&
        Objects.equals(this.filteredRssi, trilatCacheSample.filteredRssi) &&
        Objects.equals(this.time, trilatCacheSample.time) &&
        Objects.equals(this.networkName, trilatCacheSample.networkName) &&
        Objects.equals(this.randomizedId, trilatCacheSample.randomizedId) &&
        Objects.equals(this.deviceSignature, trilatCacheSample.deviceSignature) &&
        Objects.equals(this.alternateId, trilatCacheSample.alternateId) &&
        Objects.equals(this.type, trilatCacheSample.type) &&
        Objects.equals(this.probeType, trilatCacheSample.probeType) &&
        Objects.equals(this.avgRssi, trilatCacheSample.avgRssi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, deviceId, rssi, filteredRssi, time, networkName, randomizedId, deviceSignature, alternateId, type, probeType, avgRssi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrilatCacheSample {\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    filteredRssi: ").append(toIndentedString(filteredRssi)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    randomizedId: ").append(toIndentedString(randomizedId)).append("\n");
    sb.append("    deviceSignature: ").append(toIndentedString(deviceSignature)).append("\n");
    sb.append("    alternateId: ").append(toIndentedString(alternateId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    probeType: ").append(toIndentedString(probeType)).append("\n");
    sb.append("    avgRssi: ").append(toIndentedString(avgRssi)).append("\n");
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

