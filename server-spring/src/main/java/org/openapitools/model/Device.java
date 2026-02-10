package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Device
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Device {

  private @Nullable Integer rebootTimeHour;

  private @Nullable Integer rebootTimeMinute;

  private @Nullable Integer idleTimeoutInSecond;

  private @Nullable String serialNumber;

  private @Nullable String udid;

  private @Nullable String deviceType;

  private @Nullable Double devicePower;

  private @Nullable Double deviceInterference;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastHeartbeatSent;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastDown;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUp;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastNotificationSent;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable HealthEnum health;

  public Device rebootTimeHour(@Nullable Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
    return this;
  }

  /**
   * Get rebootTimeHour
   * @return rebootTimeHour
   */
  
  @Schema(name = "rebootTimeHour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rebootTimeHour")
  public @Nullable Integer getRebootTimeHour() {
    return rebootTimeHour;
  }

  public void setRebootTimeHour(@Nullable Integer rebootTimeHour) {
    this.rebootTimeHour = rebootTimeHour;
  }

  public Device rebootTimeMinute(@Nullable Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
    return this;
  }

  /**
   * Get rebootTimeMinute
   * @return rebootTimeMinute
   */
  
  @Schema(name = "rebootTimeMinute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rebootTimeMinute")
  public @Nullable Integer getRebootTimeMinute() {
    return rebootTimeMinute;
  }

  public void setRebootTimeMinute(@Nullable Integer rebootTimeMinute) {
    this.rebootTimeMinute = rebootTimeMinute;
  }

  public Device idleTimeoutInSecond(@Nullable Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
    return this;
  }

  /**
   * Get idleTimeoutInSecond
   * @return idleTimeoutInSecond
   */
  
  @Schema(name = "idleTimeoutInSecond", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idleTimeoutInSecond")
  public @Nullable Integer getIdleTimeoutInSecond() {
    return idleTimeoutInSecond;
  }

  public void setIdleTimeoutInSecond(@Nullable Integer idleTimeoutInSecond) {
    this.idleTimeoutInSecond = idleTimeoutInSecond;
  }

  public Device serialNumber(@Nullable String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  
  @Schema(name = "serialNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialNumber")
  public @Nullable String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(@Nullable String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Device udid(@Nullable String udid) {
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

  public Device deviceType(@Nullable String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
   */
  
  @Schema(name = "deviceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceType")
  public @Nullable String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(@Nullable String deviceType) {
    this.deviceType = deviceType;
  }

  public Device devicePower(@Nullable Double devicePower) {
    this.devicePower = devicePower;
    return this;
  }

  /**
   * Get devicePower
   * @return devicePower
   */
  
  @Schema(name = "devicePower", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("devicePower")
  public @Nullable Double getDevicePower() {
    return devicePower;
  }

  public void setDevicePower(@Nullable Double devicePower) {
    this.devicePower = devicePower;
  }

  public Device deviceInterference(@Nullable Double deviceInterference) {
    this.deviceInterference = deviceInterference;
    return this;
  }

  /**
   * Get deviceInterference
   * @return deviceInterference
   */
  
  @Schema(name = "deviceInterference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceInterference")
  public @Nullable Double getDeviceInterference() {
    return deviceInterference;
  }

  public void setDeviceInterference(@Nullable Double deviceInterference) {
    this.deviceInterference = deviceInterference;
  }

  public Device lastHeartbeatSent(@Nullable OffsetDateTime lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
    return this;
  }

  /**
   * Get lastHeartbeatSent
   * @return lastHeartbeatSent
   */
  @Valid 
  @Schema(name = "lastHeartbeatSent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastHeartbeatSent")
  public @Nullable OffsetDateTime getLastHeartbeatSent() {
    return lastHeartbeatSent;
  }

  public void setLastHeartbeatSent(@Nullable OffsetDateTime lastHeartbeatSent) {
    this.lastHeartbeatSent = lastHeartbeatSent;
  }

  public Device lastDown(@Nullable OffsetDateTime lastDown) {
    this.lastDown = lastDown;
    return this;
  }

  /**
   * Get lastDown
   * @return lastDown
   */
  @Valid 
  @Schema(name = "lastDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastDown")
  public @Nullable OffsetDateTime getLastDown() {
    return lastDown;
  }

  public void setLastDown(@Nullable OffsetDateTime lastDown) {
    this.lastDown = lastDown;
  }

  public Device lastUp(@Nullable OffsetDateTime lastUp) {
    this.lastUp = lastUp;
    return this;
  }

  /**
   * Get lastUp
   * @return lastUp
   */
  @Valid 
  @Schema(name = "lastUp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUp")
  public @Nullable OffsetDateTime getLastUp() {
    return lastUp;
  }

  public void setLastUp(@Nullable OffsetDateTime lastUp) {
    this.lastUp = lastUp;
  }

  public Device lastNotificationSent(@Nullable OffsetDateTime lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
    return this;
  }

  /**
   * Get lastNotificationSent
   * @return lastNotificationSent
   */
  @Valid 
  @Schema(name = "lastNotificationSent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastNotificationSent")
  public @Nullable OffsetDateTime getLastNotificationSent() {
    return lastNotificationSent;
  }

  public void setLastNotificationSent(@Nullable OffsetDateTime lastNotificationSent) {
    this.lastNotificationSent = lastNotificationSent;
  }

  public Device health(@Nullable HealthEnum health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
   */
  
  @Schema(name = "health", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("health")
  public @Nullable HealthEnum getHealth() {
    return health;
  }

  public void setHealth(@Nullable HealthEnum health) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

