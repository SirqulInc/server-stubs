package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Device  {
  
  @ApiModelProperty(value = "")

  private Integer rebootTimeHour;

  @ApiModelProperty(value = "")

  private Integer rebootTimeMinute;

  @ApiModelProperty(value = "")

  private Integer idleTimeoutInSecond;

  @ApiModelProperty(value = "")

  private String serialNumber;

  @ApiModelProperty(value = "")

  private String udid;

  @ApiModelProperty(value = "")

  private String deviceType;

  @ApiModelProperty(value = "")

  private Double devicePower;

  @ApiModelProperty(value = "")

  private Double deviceInterference;

  @ApiModelProperty(value = "")

  private Date lastHeartbeatSent;

  @ApiModelProperty(value = "")

  private Date lastDown;

  @ApiModelProperty(value = "")

  private Date lastUp;

  @ApiModelProperty(value = "")

  private Date lastNotificationSent;

public enum HealthEnum {

RUNNING(String.valueOf("RUNNING")), WARNING(String.valueOf("WARNING")), DOWN(String.valueOf("DOWN"));


    private String value;

    HealthEnum (String v) {
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
    public static HealthEnum fromValue(String value) {
        for (HealthEnum b : HealthEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private HealthEnum health;
 /**
   * Get rebootTimeHour
   * @return rebootTimeHour
  **/
  @JsonProperty("rebootTimeHour")
  public Integer getRebootTimeHour() {
    return rebootTimeHour;
  }

  public void setRebootTimeHour(Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
  }

  public Device rebootTimeHour(Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
    return this;
  }

 /**
   * Get rebootTimeMinute
   * @return rebootTimeMinute
  **/
  @JsonProperty("rebootTimeMinute")
  public Integer getRebootTimeMinute() {
    return rebootTimeMinute;
  }

  public void setRebootTimeMinute(Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
  }

  public Device rebootTimeMinute(Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
    return this;
  }

 /**
   * Get idleTimeoutInSecond
   * @return idleTimeoutInSecond
  **/
  @JsonProperty("idleTimeoutInSecond")
  public Integer getIdleTimeoutInSecond() {
    return idleTimeoutInSecond;
  }

  public void setIdleTimeoutInSecond(Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
  }

  public Device idleTimeoutInSecond(Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
    return this;
  }

 /**
   * Get serialNumber
   * @return serialNumber
  **/
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Device serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

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

  public Device udid(String udid) {
    this.udid = udid;
    return this;
  }

 /**
   * Get deviceType
   * @return deviceType
  **/
  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public Device deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

 /**
   * Get devicePower
   * @return devicePower
  **/
  @JsonProperty("devicePower")
  public Double getDevicePower() {
    return devicePower;
  }

  public void setDevicePower(Double devicePower) {
    this.devicePower = devicePower;
  }

  public Device devicePower(Double devicePower) {
    this.devicePower = devicePower;
    return this;
  }

 /**
   * Get deviceInterference
   * @return deviceInterference
  **/
  @JsonProperty("deviceInterference")
  public Double getDeviceInterference() {
    return deviceInterference;
  }

  public void setDeviceInterference(Double deviceInterference) {
    this.deviceInterference = deviceInterference;
  }

  public Device deviceInterference(Double deviceInterference) {
    this.deviceInterference = deviceInterference;
    return this;
  }

 /**
   * Get lastHeartbeatSent
   * @return lastHeartbeatSent
  **/
  @JsonProperty("lastHeartbeatSent")
  public Date getLastHeartbeatSent() {
    return lastHeartbeatSent;
  }

  public void setLastHeartbeatSent(Date lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
  }

  public Device lastHeartbeatSent(Date lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
    return this;
  }

 /**
   * Get lastDown
   * @return lastDown
  **/
  @JsonProperty("lastDown")
  public Date getLastDown() {
    return lastDown;
  }

  public void setLastDown(Date lastDown) {
    this.lastDown = lastDown;
  }

  public Device lastDown(Date lastDown) {
    this.lastDown = lastDown;
    return this;
  }

 /**
   * Get lastUp
   * @return lastUp
  **/
  @JsonProperty("lastUp")
  public Date getLastUp() {
    return lastUp;
  }

  public void setLastUp(Date lastUp) {
    this.lastUp = lastUp;
  }

  public Device lastUp(Date lastUp) {
    this.lastUp = lastUp;
    return this;
  }

 /**
   * Get lastNotificationSent
   * @return lastNotificationSent
  **/
  @JsonProperty("lastNotificationSent")
  public Date getLastNotificationSent() {
    return lastNotificationSent;
  }

  public void setLastNotificationSent(Date lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
  }

  public Device lastNotificationSent(Date lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
    return this;
  }

 /**
   * Get health
   * @return health
  **/
  @JsonProperty("health")
  public String getHealth() {
    if (health == null) {
      return null;
    }
    return health.value();
  }

  public void setHealth(HealthEnum health) {
    this.health = health;
  }

  public Device health(HealthEnum health) {
    this.health = health;
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
    Device device = (Device) o;
    return Objects.equals(this.rebootTimeHour, device.rebootTimeHour) &&
        Objects.equals(this.rebootTimeMinute, device.rebootTimeMinute) &&
        Objects.equals(this.idleTimeoutInSecond, device.idleTimeoutInSecond) &&
        Objects.equals(this.serialNumber, device.serialNumber) &&
        Objects.equals(this.udid, device.udid) &&
        Objects.equals(this.deviceType, device.deviceType) &&
        Objects.equals(this.devicePower, device.devicePower) &&
        Objects.equals(this.deviceInterference, device.deviceInterference) &&
        Objects.equals(this.lastHeartbeatSent, device.lastHeartbeatSent) &&
        Objects.equals(this.lastDown, device.lastDown) &&
        Objects.equals(this.lastUp, device.lastUp) &&
        Objects.equals(this.lastNotificationSent, device.lastNotificationSent) &&
        Objects.equals(this.health, device.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, lastHeartbeatSent, lastDown, lastUp, lastNotificationSent, health);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

