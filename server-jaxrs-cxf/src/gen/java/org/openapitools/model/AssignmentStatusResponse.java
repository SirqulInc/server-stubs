package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ScheduledNotificationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssignmentStatusResponse  {
  
  @ApiModelProperty(value = "")

  private Long assignmentStatusId;

  @ApiModelProperty(value = "")

  private Boolean active;

public enum ToDoEnum {

SITE_VISIT(String.valueOf("SITE_VISIT")), PHONE(String.valueOf("PHONE")), RECONTACT(String.valueOf("RECONTACT")), RENEWAL(String.valueOf("RENEWAL")), CREDIT(String.valueOf("CREDIT"));


    private String value;

    ToDoEnum (String v) {
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
    public static ToDoEnum fromValue(String value) {
        for (ToDoEnum b : ToDoEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ToDoEnum toDo;

public enum ConnectionEnum {

INITIAL(String.valueOf("INITIAL")), FOLLOW_UP(String.valueOf("FOLLOW_UP")), DECLINED(String.valueOf("DECLINED"));


    private String value;

    ConnectionEnum (String v) {
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
    public static ConnectionEnum fromValue(String value) {
        for (ConnectionEnum b : ConnectionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ConnectionEnum connection;

public enum MethodEnum {

PHONE(String.valueOf("PHONE")), SITE_VISIT(String.valueOf("SITE_VISIT")), EMAIL(String.valueOf("EMAIL"));


    private String value;

    MethodEnum (String v) {
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
    public static MethodEnum fromValue(String value) {
        for (MethodEnum b : MethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private MethodEnum method;

public enum StatusEnum {

ARCHIVED(String.valueOf("ARCHIVED")), SUBSCRIBED(String.valueOf("SUBSCRIBED")), UNSUBSCRIBED(String.valueOf("UNSUBSCRIBED")), CONTACTED(String.valueOf("CONTACTED")), DECLINED(String.valueOf("DECLINED")), NOT_CONTACTED(String.valueOf("NOT_CONTACTED"));


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

public enum ClosureEnum {

PHONE(String.valueOf("PHONE")), SITE_VISIT(String.valueOf("SITE_VISIT")), PHONE_SITE(String.valueOf("PHONE_SITE")), WEB(String.valueOf("WEB"));


    private String value;

    ClosureEnum (String v) {
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
    public static ClosureEnum fromValue(String value) {
        for (ClosureEnum b : ClosureEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ClosureEnum closure;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Long followUp;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  @Valid

  private ScheduledNotificationShortResponse notification;
 /**
   * Get assignmentStatusId
   * @return assignmentStatusId
  **/
  @JsonProperty("assignmentStatusId")
  public Long getAssignmentStatusId() {
    return assignmentStatusId;
  }

  public void setAssignmentStatusId(Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
  }

  public AssignmentStatusResponse assignmentStatusId(Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
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

  public AssignmentStatusResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get toDo
   * @return toDo
  **/
  @JsonProperty("toDo")
  public String getToDo() {
    if (toDo == null) {
      return null;
    }
    return toDo.value();
  }

  public void setToDo(ToDoEnum toDo) {
    this.toDo = toDo;
  }

  public AssignmentStatusResponse toDo(ToDoEnum toDo) {
    this.toDo = toDo;
    return this;
  }

 /**
   * Get connection
   * @return connection
  **/
  @JsonProperty("connection")
  public String getConnection() {
    if (connection == null) {
      return null;
    }
    return connection.value();
  }

  public void setConnection(ConnectionEnum connection) {
    this.connection = connection;
  }

  public AssignmentStatusResponse connection(ConnectionEnum connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Get method
   * @return method
  **/
  @JsonProperty("method")
  public String getMethod() {
    if (method == null) {
      return null;
    }
    return method.value();
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public AssignmentStatusResponse method(MethodEnum method) {
    this.method = method;
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

  public AssignmentStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get closure
   * @return closure
  **/
  @JsonProperty("closure")
  public String getClosure() {
    if (closure == null) {
      return null;
    }
    return closure.value();
  }

  public void setClosure(ClosureEnum closure) {
    this.closure = closure;
  }

  public AssignmentStatusResponse closure(ClosureEnum closure) {
    this.closure = closure;
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

  public AssignmentStatusResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get followUp
   * @return followUp
  **/
  @JsonProperty("followUp")
  public Long getFollowUp() {
    return followUp;
  }

  public void setFollowUp(Long followUp) {
    this.followUp = followUp;
  }

  public AssignmentStatusResponse followUp(Long followUp) {
    this.followUp = followUp;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public AssignmentStatusResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public AssignmentStatusResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get notification
   * @return notification
  **/
  @JsonProperty("notification")
  public ScheduledNotificationShortResponse getNotification() {
    return notification;
  }

  public void setNotification(ScheduledNotificationShortResponse notification) {
    this.notification = notification;
  }

  public AssignmentStatusResponse notification(ScheduledNotificationShortResponse notification) {
    this.notification = notification;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

