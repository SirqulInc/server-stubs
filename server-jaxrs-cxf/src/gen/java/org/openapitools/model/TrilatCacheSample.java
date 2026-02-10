package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TrilatCacheSample  {
  
  @ApiModelProperty(value = "")

  private String avatarId;

  @ApiModelProperty(value = "")

  private String deviceId;

  @ApiModelProperty(value = "")

  private List<Integer> rssi = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Double filteredRssi;

  @ApiModelProperty(value = "")

  private Long time;

  @ApiModelProperty(value = "")

  private String networkName;

  @ApiModelProperty(value = "")

  private Boolean randomizedId;

  @ApiModelProperty(value = "")

  private String deviceSignature;

  @ApiModelProperty(value = "")

  private String alternateId;

  @ApiModelProperty(value = "")

  private String type;

public enum ProbeTypeEnum {

WIFI_PROBE_REQUEST(String.valueOf("WIFI_PROBE_REQUEST")), IBEACON(String.valueOf("IBEACON")), BLE(String.valueOf("BLE")), UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    ProbeTypeEnum (String v) {
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
    public static ProbeTypeEnum fromValue(String value) {
        for (ProbeTypeEnum b : ProbeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ProbeTypeEnum probeType;

  @ApiModelProperty(value = "")

  private Double avgRssi;
 /**
   * Get avatarId
   * @return avatarId
  **/
  @JsonProperty("avatarId")
  public String getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(String avatarId) {
    this.avatarId = avatarId;
  }

  public TrilatCacheSample avatarId(String avatarId) {
    this.avatarId = avatarId;
    return this;
  }

 /**
   * Get deviceId
   * @return deviceId
  **/
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public TrilatCacheSample deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Get rssi
   * @return rssi
  **/
  @JsonProperty("rssi")
  public List<Integer> getRssi() {
    return rssi;
  }

  public void setRssi(List<Integer> rssi) {
    this.rssi = rssi;
  }

  public TrilatCacheSample rssi(List<Integer> rssi) {
    this.rssi = rssi;
    return this;
  }

  public TrilatCacheSample addRssiItem(Integer rssiItem) {
    this.rssi.add(rssiItem);
    return this;
  }

 /**
   * Get filteredRssi
   * @return filteredRssi
  **/
  @JsonProperty("filteredRssi")
  public Double getFilteredRssi() {
    return filteredRssi;
  }

  public void setFilteredRssi(Double filteredRssi) {
    this.filteredRssi = filteredRssi;
  }

  public TrilatCacheSample filteredRssi(Double filteredRssi) {
    this.filteredRssi = filteredRssi;
    return this;
  }

 /**
   * Get time
   * @return time
  **/
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public TrilatCacheSample time(Long time) {
    this.time = time;
    return this;
  }

 /**
   * Get networkName
   * @return networkName
  **/
  @JsonProperty("networkName")
  public String getNetworkName() {
    return networkName;
  }

  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  public TrilatCacheSample networkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

 /**
   * Get randomizedId
   * @return randomizedId
  **/
  @JsonProperty("randomizedId")
  public Boolean getRandomizedId() {
    return randomizedId;
  }

  public void setRandomizedId(Boolean randomizedId) {
    this.randomizedId = randomizedId;
  }

  public TrilatCacheSample randomizedId(Boolean randomizedId) {
    this.randomizedId = randomizedId;
    return this;
  }

 /**
   * Get deviceSignature
   * @return deviceSignature
  **/
  @JsonProperty("deviceSignature")
  public String getDeviceSignature() {
    return deviceSignature;
  }

  public void setDeviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  public TrilatCacheSample deviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
    return this;
  }

 /**
   * Get alternateId
   * @return alternateId
  **/
  @JsonProperty("alternateId")
  public String getAlternateId() {
    return alternateId;
  }

  public void setAlternateId(String alternateId) {
    this.alternateId = alternateId;
  }

  public TrilatCacheSample alternateId(String alternateId) {
    this.alternateId = alternateId;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TrilatCacheSample type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get probeType
   * @return probeType
  **/
  @JsonProperty("probeType")
  public String getProbeType() {
    if (probeType == null) {
      return null;
    }
    return probeType.value();
  }

  public void setProbeType(ProbeTypeEnum probeType) {
    this.probeType = probeType;
  }

  public TrilatCacheSample probeType(ProbeTypeEnum probeType) {
    this.probeType = probeType;
    return this;
  }

 /**
   * Get avgRssi
   * @return avgRssi
  **/
  @JsonProperty("avgRssi")
  public Double getAvgRssi() {
    return avgRssi;
  }

  public void setAvgRssi(Double avgRssi) {
    this.avgRssi = avgRssi;
  }

  public TrilatCacheSample avgRssi(Double avgRssi) {
    this.avgRssi = avgRssi;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

