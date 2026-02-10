package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduledNotificationShortResponse  {
  
  @ApiModelProperty(value = "")

  private Long scheduledNotificationId;

  @ApiModelProperty(value = "")

  private Boolean active;

public enum StatusEnum {

NEW(String.valueOf("NEW")), ERROR(String.valueOf("ERROR")), COMPLETE(String.valueOf("COMPLETE")), PROCESSING(String.valueOf("PROCESSING")), TEMPLATE(String.valueOf("TEMPLATE"));


    private String value;

    StatusEnum (String v) {
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
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private StatusEnum status;

public enum TypeEnum {

HTTP(String.valueOf("HTTP")), SAVE(String.valueOf("SAVE")), EMAIL(String.valueOf("EMAIL")), SMS(String.valueOf("SMS")), APNS(String.valueOf("APNS")), GCM(String.valueOf("GCM")), PUSH(String.valueOf("PUSH")), MOBILE_NOTIFICATION(String.valueOf("MOBILE_NOTIFICATION"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private String groupingId;

  @ApiModelProperty(value = "")

  private Long scheduledDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;
 /**
   * Get scheduledNotificationId
   * @return scheduledNotificationId
  **/
  @JsonProperty("scheduledNotificationId")
  public Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }

  public void setScheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  public ScheduledNotificationShortResponse scheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ScheduledNotificationShortResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ScheduledNotificationShortResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ScheduledNotificationShortResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduledNotificationShortResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ScheduledNotificationShortResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get groupingId
   * @return groupingId
  **/
  @JsonProperty("groupingId")
  public String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  public ScheduledNotificationShortResponse groupingId(String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

 /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ScheduledNotificationShortResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public ScheduledNotificationShortResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public ScheduledNotificationShortResponse endDate(Long endDate) {
    this.endDate = endDate;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

