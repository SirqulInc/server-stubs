package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.Account;
import org.openapitools.model.Assignment;
import org.openapitools.model.ScheduledNotification;
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
 * AssignmentStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentStatus {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Assignment assignment;

  private @Nullable Account creator;

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime followUp;

  private @Nullable ScheduledNotification notification;

  public AssignmentStatus id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public AssignmentStatus active(@Nullable Boolean active) {
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

  public AssignmentStatus valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public AssignmentStatus assignment(@Nullable Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

  /**
   * Get assignment
   * @return assignment
   */
  @Valid 
  @Schema(name = "assignment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignment")
  public @Nullable Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(@Nullable Assignment assignment) {
    this.assignment = assignment;
  }

  public AssignmentStatus creator(@Nullable Account creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
   */
  @Valid 
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator")
  public @Nullable Account getCreator() {
    return creator;
  }

  public void setCreator(@Nullable Account creator) {
    this.creator = creator;
  }

  public AssignmentStatus toDo(@Nullable ToDoEnum toDo) {
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

  public AssignmentStatus connection(@Nullable ConnectionEnum connection) {
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

  public AssignmentStatus method(@Nullable MethodEnum method) {
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

  public AssignmentStatus status(@Nullable StatusEnum status) {
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

  public AssignmentStatus closure(@Nullable ClosureEnum closure) {
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

  public AssignmentStatus message(@Nullable String message) {
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

  public AssignmentStatus followUp(@Nullable OffsetDateTime followUp) {
    this.followUp = followUp;
    return this;
  }

  /**
   * Get followUp
   * @return followUp
   */
  @Valid 
  @Schema(name = "followUp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUp")
  public @Nullable OffsetDateTime getFollowUp() {
    return followUp;
  }

  public void setFollowUp(@Nullable OffsetDateTime followUp) {
    this.followUp = followUp;
  }

  public AssignmentStatus notification(@Nullable ScheduledNotification notification) {
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
  public @Nullable ScheduledNotification getNotification() {
    return notification;
  }

  public void setNotification(@Nullable ScheduledNotification notification) {
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
    AssignmentStatus assignmentStatus = (AssignmentStatus) o;
    return Objects.equals(this.id, assignmentStatus.id) &&
        Objects.equals(this.active, assignmentStatus.active) &&
        Objects.equals(this.valid, assignmentStatus.valid) &&
        Objects.equals(this.assignment, assignmentStatus.assignment) &&
        Objects.equals(this.creator, assignmentStatus.creator) &&
        Objects.equals(this.toDo, assignmentStatus.toDo) &&
        Objects.equals(this.connection, assignmentStatus.connection) &&
        Objects.equals(this.method, assignmentStatus.method) &&
        Objects.equals(this.status, assignmentStatus.status) &&
        Objects.equals(this.closure, assignmentStatus.closure) &&
        Objects.equals(this.message, assignmentStatus.message) &&
        Objects.equals(this.followUp, assignmentStatus.followUp) &&
        Objects.equals(this.notification, assignmentStatus.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, assignment, creator, toDo, connection, method, status, closure, message, followUp, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    toDo: ").append(toIndentedString(toDo)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    closure: ").append(toIndentedString(closure)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
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

