package apimodels;

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
 * TrilatCacheSample
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrilatCacheSample   {
  @JsonProperty("avatarId")
  
  private String avatarId;

  @JsonProperty("deviceId")
  
  private String deviceId;

  @JsonProperty("rssi")
  
  private List<Integer> rssi = null;

  @JsonProperty("filteredRssi")
  
  private Double filteredRssi;

  @JsonProperty("time")
  
  private Long time;

  @JsonProperty("networkName")
  
  private String networkName;

  @JsonProperty("randomizedId")
  
  private Boolean randomizedId;

  @JsonProperty("deviceSignature")
  
  private String deviceSignature;

  @JsonProperty("alternateId")
  
  private String alternateId;

  @JsonProperty("type")
  
  private String type;

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

  @JsonProperty("probeType")
  
  private ProbeTypeEnum probeType;

  @JsonProperty("avgRssi")
  
  private Double avgRssi;

  public TrilatCacheSample avatarId(String avatarId) {
    this.avatarId = avatarId;
    return this;
  }

   /**
   * Get avatarId
   * @return avatarId
  **/
  public String getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(String avatarId) {
    this.avatarId = avatarId;
  }

  public TrilatCacheSample deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
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
  **/
  public List<Integer> getRssi() {
    return rssi;
  }

  public void setRssi(List<Integer> rssi) {
    this.rssi = rssi;
  }

  public TrilatCacheSample filteredRssi(Double filteredRssi) {
    this.filteredRssi = filteredRssi;
    return this;
  }

   /**
   * Get filteredRssi
   * @return filteredRssi
  **/
  public Double getFilteredRssi() {
    return filteredRssi;
  }

  public void setFilteredRssi(Double filteredRssi) {
    this.filteredRssi = filteredRssi;
  }

  public TrilatCacheSample time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public TrilatCacheSample networkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

   /**
   * Get networkName
   * @return networkName
  **/
  public String getNetworkName() {
    return networkName;
  }

  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  public TrilatCacheSample randomizedId(Boolean randomizedId) {
    this.randomizedId = randomizedId;
    return this;
  }

   /**
   * Get randomizedId
   * @return randomizedId
  **/
  public Boolean getRandomizedId() {
    return randomizedId;
  }

  public void setRandomizedId(Boolean randomizedId) {
    this.randomizedId = randomizedId;
  }

  public TrilatCacheSample deviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
    return this;
  }

   /**
   * Get deviceSignature
   * @return deviceSignature
  **/
  public String getDeviceSignature() {
    return deviceSignature;
  }

  public void setDeviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  public TrilatCacheSample alternateId(String alternateId) {
    this.alternateId = alternateId;
    return this;
  }

   /**
   * Get alternateId
   * @return alternateId
  **/
  public String getAlternateId() {
    return alternateId;
  }

  public void setAlternateId(String alternateId) {
    this.alternateId = alternateId;
  }

  public TrilatCacheSample type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TrilatCacheSample probeType(ProbeTypeEnum probeType) {
    this.probeType = probeType;
    return this;
  }

   /**
   * Get probeType
   * @return probeType
  **/
  public ProbeTypeEnum getProbeType() {
    return probeType;
  }

  public void setProbeType(ProbeTypeEnum probeType) {
    this.probeType = probeType;
  }

  public TrilatCacheSample avgRssi(Double avgRssi) {
    this.avgRssi = avgRssi;
    return this;
  }

   /**
   * Get avgRssi
   * @return avgRssi
  **/
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
    return Objects.equals(avatarId, trilatCacheSample.avatarId) &&
        Objects.equals(deviceId, trilatCacheSample.deviceId) &&
        Objects.equals(rssi, trilatCacheSample.rssi) &&
        Objects.equals(filteredRssi, trilatCacheSample.filteredRssi) &&
        Objects.equals(time, trilatCacheSample.time) &&
        Objects.equals(networkName, trilatCacheSample.networkName) &&
        Objects.equals(randomizedId, trilatCacheSample.randomizedId) &&
        Objects.equals(deviceSignature, trilatCacheSample.deviceSignature) &&
        Objects.equals(alternateId, trilatCacheSample.alternateId) &&
        Objects.equals(type, trilatCacheSample.type) &&
        Objects.equals(probeType, trilatCacheSample.probeType) &&
        Objects.equals(avgRssi, trilatCacheSample.avgRssi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, deviceId, rssi, filteredRssi, time, networkName, randomizedId, deviceSignature, alternateId, type, probeType, avgRssi);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

