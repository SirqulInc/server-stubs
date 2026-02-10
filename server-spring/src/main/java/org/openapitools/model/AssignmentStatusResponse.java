package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ScheduledNotificationShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AssignmentStatusResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentStatusResponse {

  private @Nullable Long assignmentStatusId;

  private @Nullable Boolean active;

  /**
   * Gets or Sets toDo
   */
  public enum ToDoEnum {
    SITE_VISIT("SITE_VISIT"),
    
    PHONE("PHONE"),
    
    RECONTACT("RECONTACT"),
    
    RENEWAL("RENEWAL"),
    
    CREDIT("CREDIT");

    private final String value;

    ToDoEnum(String value) {
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
    public static ToDoEnum fromValue(String value) {
      for (ToDoEnum b : ToDoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ToDoEnum toDo;

  /**
   * Gets or Sets connection
   */
  public enum ConnectionEnum {
    INITIAL("INITIAL"),
    
    FOLLOW_UP("FOLLOW_UP"),
    
    DECLINED("DECLINED");

    private final String value;

    ConnectionEnum(String value) {
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
    public static ConnectionEnum fromValue(String value) {
      for (ConnectionEnum b : ConnectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ConnectionEnum connection;

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    PHONE("PHONE"),
    
    SITE_VISIT("SITE_VISIT"),
    
    EMAIL("EMAIL");

    private final String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MethodEnum method;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ARCHIVED("ARCHIVED"),
    
    SUBSCRIBED("SUBSCRIBED"),
    
    UNSUBSCRIBED("UNSUBSCRIBED"),
    
    CONTACTED("CONTACTED"),
    
    DECLINED("DECLINED"),
    
    NOT_CONTACTED("NOT_CONTACTED");

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
   * Gets or Sets closure
   */
  public enum ClosureEnum {
    PHONE("PHONE"),
    
    SITE_VISIT("SITE_VISIT"),
    
    PHONE_SITE("PHONE_SITE"),
    
    WEB("WEB");

    private final String value;

    ClosureEnum(String value) {
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
    public static ClosureEnum fromValue(String value) {
      for (ClosureEnum b : ClosureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ClosureEnum closure;

  private @Nullable String message;

  private @Nullable Long followUp;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable ScheduledNotificationShortResponse notification;

  public AssignmentStatusResponse assignmentStatusId(@Nullable Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
    return this;
  }

  /**
   * Get assignmentStatusId
   * @return assignmentStatusId
   */
  
  @Schema(name = "assignmentStatusId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignmentStatusId")
  public @Nullable Long getAssignmentStatusId() {
    return assignmentStatusId;
  }

  public void setAssignmentStatusId(@Nullable Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
  }

  public AssignmentStatusResponse active(@Nullable Boolean active) {
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

  public AssignmentStatusResponse toDo(@Nullable ToDoEnum toDo) {
    this.toDo = toDo;
    return this;
  }

  /**
   * Get toDo
   * @return toDo
   */
  
  @Schema(name = "toDo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toDo")
  public @Nullable ToDoEnum getToDo() {
    return toDo;
  }

  public void setToDo(@Nullable ToDoEnum toDo) {
    this.toDo = toDo;
  }

  public AssignmentStatusResponse connection(@Nullable ConnectionEnum connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
   */
  
  @Schema(name = "connection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection")
  public @Nullable ConnectionEnum getConnection() {
    return connection;
  }

  public void setConnection(@Nullable ConnectionEnum connection) {
    this.connection = connection;
  }

  public AssignmentStatusResponse method(@Nullable MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   */
  
  @Schema(name = "method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method")
  public @Nullable MethodEnum getMethod() {
    return method;
  }

  public void setMethod(@Nullable MethodEnum method) {
    this.method = method;
  }

  public AssignmentStatusResponse status(@Nullable StatusEnum status) {
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

  public AssignmentStatusResponse closure(@Nullable ClosureEnum closure) {
    this.closure = closure;
    return this;
  }

  /**
   * Get closure
   * @return closure
   */
  
  @Schema(name = "closure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closure")
  public @Nullable ClosureEnum getClosure() {
    return closure;
  }

  public void setClosure(@Nullable ClosureEnum closure) {
    this.closure = closure;
  }

  public AssignmentStatusResponse message(@Nullable String message) {
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

  public AssignmentStatusResponse followUp(@Nullable Long followUp) {
    this.followUp = followUp;
    return this;
  }

  /**
   * Get followUp
   * @return followUp
   */
  
  @Schema(name = "followUp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUp")
  public @Nullable Long getFollowUp() {
    return followUp;
  }

  public void setFollowUp(@Nullable Long followUp) {
    this.followUp = followUp;
  }

  public AssignmentStatusResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public AssignmentStatusResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public AssignmentStatusResponse notification(@Nullable ScheduledNotificationShortResponse notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification
   * @return notification
   */
  @Valid 
  @Schema(name = "notification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification")
  public @Nullable ScheduledNotificationShortResponse getNotification() {
    return notification;
  }

  public void setNotification(@Nullable ScheduledNotificationShortResponse notification) {
    this.notification = notification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentStatusResponse assignmentStatusResponse = (AssignmentStatusResponse) o;
    return Objects.equals(this.assignmentStatusId, assignmentStatusResponse.assignmentStatusId) &&
        Objects.equals(this.active, assignmentStatusResponse.active) &&
        Objects.equals(this.toDo, assignmentStatusResponse.toDo) &&
        Objects.equals(this.connection, assignmentStatusResponse.connection) &&
        Objects.equals(this.method, assignmentStatusResponse.method) &&
        Objects.equals(this.status, assignmentStatusResponse.status) &&
        Objects.equals(this.closure, assignmentStatusResponse.closure) &&
        Objects.equals(this.message, assignmentStatusResponse.message) &&
        Objects.equals(this.followUp, assignmentStatusResponse.followUp) &&
        Objects.equals(this.created, assignmentStatusResponse.created) &&
        Objects.equals(this.updated, assignmentStatusResponse.updated) &&
        Objects.equals(this.notification, assignmentStatusResponse.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentStatusId, active, toDo, connection, method, status, closure, message, followUp, created, updated, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentStatusResponse {\n");
    sb.append("    assignmentStatusId: ").append(toIndentedString(assignmentStatusId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    toDo: ").append(toIndentedString(toDo)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    closure: ").append(toIndentedString(closure)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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

