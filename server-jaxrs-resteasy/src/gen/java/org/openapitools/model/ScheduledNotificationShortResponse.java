package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotificationShortResponse   {
  
  private Long scheduledNotificationId;
  private Boolean active;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),

        ERROR("ERROR"),

        COMPLETE("COMPLETE"),

        PROCESSING("PROCESSING"),

        TEMPLATE("TEMPLATE");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;

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
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String name;
  private String message;
  private String groupingId;
  private Long scheduledDate;
  private Long startDate;
  private Long endDate;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledNotificationId")
  public Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }
  public void setScheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupingId")
  public String getGroupingId() {
    return groupingId;
  }
  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }
  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

