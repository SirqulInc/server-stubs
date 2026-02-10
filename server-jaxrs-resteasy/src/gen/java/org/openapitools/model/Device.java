package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Device   {
  
  private Integer rebootTimeHour;
  private Integer rebootTimeMinute;
  private Integer idleTimeoutInSecond;
  private String serialNumber;
  private String udid;
  private String deviceType;
  private Double devicePower;
  private Double deviceInterference;
  private Date lastHeartbeatSent;
  private Date lastDown;
  private Date lastUp;
  private Date lastNotificationSent;

  /**
   * Gets or Sets health
   */
  public enum HealthEnum {
    RUNNING("RUNNING"),

        WARNING("WARNING"),

        DOWN("DOWN");
    private String value;

    HealthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private HealthEnum health;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rebootTimeHour")
  public Integer getRebootTimeHour() {
    return rebootTimeHour;
  }
  public void setRebootTimeHour(Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rebootTimeMinute")
  public Integer getRebootTimeMinute() {
    return rebootTimeMinute;
  }
  public void setRebootTimeMinute(Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idleTimeoutInSecond")
  public Integer getIdleTimeoutInSecond() {
    return idleTimeoutInSecond;
  }
  public void setIdleTimeoutInSecond(Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

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
  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("devicePower")
  public Double getDevicePower() {
    return devicePower;
  }
  public void setDevicePower(Double devicePower) {
    this.devicePower = devicePower;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceInterference")
  public Double getDeviceInterference() {
    return deviceInterference;
  }
  public void setDeviceInterference(Double deviceInterference) {
    this.deviceInterference = deviceInterference;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastHeartbeatSent")
  public Date getLastHeartbeatSent() {
    return lastHeartbeatSent;
  }
  public void setLastHeartbeatSent(Date lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastDown")
  public Date getLastDown() {
    return lastDown;
  }
  public void setLastDown(Date lastDown) {
    this.lastDown = lastDown;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastUp")
  public Date getLastUp() {
    return lastUp;
  }
  public void setLastUp(Date lastUp) {
    this.lastUp = lastUp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastNotificationSent")
  public Date getLastNotificationSent() {
    return lastNotificationSent;
  }
  public void setLastNotificationSent(Date lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("health")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

