package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScheduledNotificationShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotificationShortResponse {

  private @Nullable Long scheduledNotificationId;

  private @Nullable Boolean active;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    ERROR("ERROR"),
    
    COMPLETE("COMPLETE"),
    
    PROCESSING("PROCESSING"),
    
    TEMPLATE("TEMPLATE");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StatusEnum status;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    HTTP("HTTP"),
    
    SAVE("SAVE"),
    
    EMAIL("EMAIL"),
    
    SMS("SMS"),
    
    APNS("APNS"),
    
    GCM("GCM"),
    
    PUSH("PUSH"),
    
    MOBILE_NOTIFICATION("MOBILE_NOTIFICATION");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private @Nullable String name;

  private @Nullable String message;

  private @Nullable String groupingId;

  private @Nullable Long scheduledDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  public ScheduledNotificationShortResponse scheduledNotificationId(@Nullable Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
    return this;
  }

  /**
   * Get scheduledNotificationId
   * @return scheduledNotificationId
   */
  
  @Schema(name = "scheduledNotificationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledNotificationId")
  public @Nullable Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }

  public void setScheduledNotificationId(@Nullable Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  public ScheduledNotificationShortResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ScheduledNotificationShortResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public ScheduledNotificationShortResponse type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public ScheduledNotificationShortResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ScheduledNotificationShortResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ScheduledNotificationShortResponse groupingId(@Nullable String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

  /**
   * Get groupingId
   * @return groupingId
   */
  
  @Schema(name = "groupingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupingId")
  public @Nullable String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(@Nullable String groupingId) {
    this.groupingId = groupingId;
  }

  public ScheduledNotificationShortResponse scheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * Get scheduledDate
   * @return scheduledDate
   */
  
  @Schema(name = "scheduledDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledDate")
  public @Nullable Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ScheduledNotificationShortResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public ScheduledNotificationShortResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledNotificationShortResponse scheduledNotificationShortResponse = (ScheduledNotificationShortResponse) o;
    return Objects.equals(this.scheduledNotificationId, scheduledNotificationShortResponse.scheduledNotificationId) &&
        Objects.equals(this.active, scheduledNotificationShortResponse.active) &&
        Objects.equals(this.status, scheduledNotificationShortResponse.status) &&
        Objects.equals(this.type, scheduledNotificationShortResponse.type) &&
        Objects.equals(this.name, scheduledNotificationShortResponse.name) &&
        Objects.equals(this.message, scheduledNotificationShortResponse.message) &&
        Objects.equals(this.groupingId, scheduledNotificationShortResponse.groupingId) &&
        Objects.equals(this.scheduledDate, scheduledNotificationShortResponse.scheduledDate) &&
        Objects.equals(this.startDate, scheduledNotificationShortResponse.startDate) &&
        Objects.equals(this.endDate, scheduledNotificationShortResponse.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledNotificationId, active, status, type, name, message, groupingId, scheduledDate, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledNotificationShortResponse {\n");
    sb.append("    scheduledNotificationId: ").append(toIndentedString(scheduledNotificationId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    groupingId: ").append(toIndentedString(groupingId)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

