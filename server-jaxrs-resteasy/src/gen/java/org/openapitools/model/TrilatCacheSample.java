package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrilatCacheSample   {
  
  private String avatarId;
  private String deviceId;
  private List<Integer> rssi = new ArrayList<>();
  private Double filteredRssi;
  private Long time;
  private String networkName;
  private Boolean randomizedId;
  private String deviceSignature;
  private String alternateId;
  private String type;

  /**
   * Gets or Sets probeType
   */
  public enum ProbeTypeEnum {
    WIFI_PROBE_REQUEST("WIFI_PROBE_REQUEST"),

        IBEACON("IBEACON"),

        BLE("BLE"),

        UNKNOWN("UNKNOWN");
    private String value;

    ProbeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProbeTypeEnum probeType;
  private Double avgRssi;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("avatarId")
  public String getAvatarId() {
    return avatarId;
  }
  public void setAvatarId(String avatarId) {
    this.avatarId = avatarId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rssi")
  public List<Integer> getRssi() {
    return rssi;
  }
  public void setRssi(List<Integer> rssi) {
    this.rssi = rssi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filteredRssi")
  public Double getFilteredRssi() {
    return filteredRssi;
  }
  public void setFilteredRssi(Double filteredRssi) {
    this.filteredRssi = filteredRssi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("networkName")
  public String getNetworkName() {
    return networkName;
  }
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("randomizedId")
  public Boolean getRandomizedId() {
    return randomizedId;
  }
  public void setRandomizedId(Boolean randomizedId) {
    this.randomizedId = randomizedId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceSignature")
  public String getDeviceSignature() {
    return deviceSignature;
  }
  public void setDeviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alternateId")
  public String getAlternateId() {
    return alternateId;
  }
  public void setAlternateId(String alternateId) {
    this.alternateId = alternateId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("probeType")
  public ProbeTypeEnum getProbeType() {
    return probeType;
  }
  public void setProbeType(ProbeTypeEnum probeType) {
    this.probeType = probeType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("avgRssi")
  public Double getAvgRssi() {
    return avgRssi;
  }
  public void setAvgRssi(Double avgRssi) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

