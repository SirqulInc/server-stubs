package apimodels;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Device   {
  @JsonProperty("rebootTimeHour")
  
  private Integer rebootTimeHour;

  @JsonProperty("rebootTimeMinute")
  
  private Integer rebootTimeMinute;

  @JsonProperty("idleTimeoutInSecond")
  
  private Integer idleTimeoutInSecond;

  @JsonProperty("serialNumber")
  
  private String serialNumber;

  @JsonProperty("udid")
  
  private String udid;

  @JsonProperty("deviceType")
  
  private String deviceType;

  @JsonProperty("devicePower")
  
  private Double devicePower;

  @JsonProperty("deviceInterference")
  
  private Double deviceInterference;

  @JsonProperty("lastHeartbeatSent")
  @Valid

  private OffsetDateTime lastHeartbeatSent;

  @JsonProperty("lastDown")
  @Valid

  private OffsetDateTime lastDown;

  @JsonProperty("lastUp")
  @Valid

  private OffsetDateTime lastUp;

  @JsonProperty("lastNotificationSent")
  @Valid

  private OffsetDateTime lastNotificationSent;

  /**
   * Gets or Sets health
   */
  public enum HealthEnum {
    RUNNING("RUNNING"),
    
    WARNING("WARNING"),
    
    DOWN("DOWN");

    private final String value;

    HealthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HealthEnum fromValue(String value) {
      for (HealthEnum b : HealthEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("health")
  
  private HealthEnum health;

  public Device rebootTimeHour(Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
    return this;
  }

   /**
   * Get rebootTimeHour
   * @return rebootTimeHour
  **/
  public Integer getRebootTimeHour() {
    return rebootTimeHour;
  }

  public void setRebootTimeHour(Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
  }

  public Device rebootTimeMinute(Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
    return this;
  }

   /**
   * Get rebootTimeMinute
   * @return rebootTimeMinute
  **/
  public Integer getRebootTimeMinute() {
    return rebootTimeMinute;
  }

  public void setRebootTimeMinute(Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
  }

  public Device idleTimeoutInSecond(Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
    return this;
  }

   /**
   * Get idleTimeoutInSecond
   * @return idleTimeoutInSecond
  **/
  public Integer getIdleTimeoutInSecond() {
    return idleTimeoutInSecond;
  }

  public void setIdleTimeoutInSecond(Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
  }

  public Device serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Device udid(String udid) {
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

  public Device deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public Device devicePower(Double devicePower) {
    this.devicePower = devicePower;
    return this;
  }

   /**
   * Get devicePower
   * @return devicePower
  **/
  public Double getDevicePower() {
    return devicePower;
  }

  public void setDevicePower(Double devicePower) {
    this.devicePower = devicePower;
  }

  public Device deviceInterference(Double deviceInterference) {
    this.deviceInterference = deviceInterference;
    return this;
  }

   /**
   * Get deviceInterference
   * @return deviceInterference
  **/
  public Double getDeviceInterference() {
    return deviceInterference;
  }

  public void setDeviceInterference(Double deviceInterference) {
    this.deviceInterference = deviceInterference;
  }

  public Device lastHeartbeatSent(OffsetDateTime lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
    return this;
  }

   /**
   * Get lastHeartbeatSent
   * @return lastHeartbeatSent
  **/
  public OffsetDateTime getLastHeartbeatSent() {
    return lastHeartbeatSent;
  }

  public void setLastHeartbeatSent(OffsetDateTime lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
  }

  public Device lastDown(OffsetDateTime lastDown) {
    this.lastDown = lastDown;
    return this;
  }

   /**
   * Get lastDown
   * @return lastDown
  **/
  public OffsetDateTime getLastDown() {
    return lastDown;
  }

  public void setLastDown(OffsetDateTime lastDown) {
    this.lastDown = lastDown;
  }

  public Device lastUp(OffsetDateTime lastUp) {
    this.lastUp = lastUp;
    return this;
  }

   /**
   * Get lastUp
   * @return lastUp
  **/
  public OffsetDateTime getLastUp() {
    return lastUp;
  }

  public void setLastUp(OffsetDateTime lastUp) {
    this.lastUp = lastUp;
  }

  public Device lastNotificationSent(OffsetDateTime lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
    return this;
  }

   /**
   * Get lastNotificationSent
   * @return lastNotificationSent
  **/
  public OffsetDateTime getLastNotificationSent() {
    return lastNotificationSent;
  }

  public void setLastNotificationSent(OffsetDateTime lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
  }

  public Device health(HealthEnum health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  public HealthEnum getHealth() {
    return health;
  }

  public void setHealth(HealthEnum health) {
    this.health = health;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(rebootTimeHour, device.rebootTimeHour) &&
        Objects.equals(rebootTimeMinute, device.rebootTimeMinute) &&
        Objects.equals(idleTimeoutInSecond, device.idleTimeoutInSecond) &&
        Objects.equals(serialNumber, device.serialNumber) &&
        Objects.equals(udid, device.udid) &&
        Objects.equals(deviceType, device.deviceType) &&
        Objects.equals(devicePower, device.devicePower) &&
        Objects.equals(deviceInterference, device.deviceInterference) &&
        Objects.equals(lastHeartbeatSent, device.lastHeartbeatSent) &&
        Objects.equals(lastDown, device.lastDown) &&
        Objects.equals(lastUp, device.lastUp) &&
        Objects.equals(lastNotificationSent, device.lastNotificationSent) &&
        Objects.equals(health, device.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, lastHeartbeatSent, lastDown, lastUp, lastNotificationSent, health);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    rebootTimeHour: ").append(toIndentedString(rebootTimeHour)).append("\n");
    sb.append("    rebootTimeMinute: ").append(toIndentedString(rebootTimeMinute)).append("\n");
    sb.append("    idleTimeoutInSecond: ").append(toIndentedString(idleTimeoutInSecond)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    devicePower: ").append(toIndentedString(devicePower)).append("\n");
    sb.append("    deviceInterference: ").append(toIndentedString(deviceInterference)).append("\n");
    sb.append("    lastHeartbeatSent: ").append(toIndentedString(lastHeartbeatSent)).append("\n");
    sb.append("    lastDown: ").append(toIndentedString(lastDown)).append("\n");
    sb.append("    lastUp: ").append(toIndentedString(lastUp)).append("\n");
    sb.append("    lastNotificationSent: ").append(toIndentedString(lastNotificationSent)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

