package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.Account;
import org.openapitools.model.Assignment;
import org.openapitools.model.ScheduledNotification;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssignmentStatus  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Assignment assignment;

  @ApiModelProperty(value = "")

  @Valid

  private Account creator;

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

  private Date followUp;

  @ApiModelProperty(value = "")

  @Valid

  private ScheduledNotification notification;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssignmentStatus id(Long id) {
    this.id = id;
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

  public AssignmentStatus active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public AssignmentStatus valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get assignment
   * @return assignment
  **/
  @JsonProperty("assignment")
  public Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  public AssignmentStatus assignment(Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

 /**
   * Get creator
   * @return creator
  **/
  @JsonProperty("creator")
  public Account getCreator() {
    return creator;
  }

  public void setCreator(Account creator) {
    this.creator = creator;
  }

  public AssignmentStatus creator(Account creator) {
    this.creator = creator;
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

  public AssignmentStatus toDo(ToDoEnum toDo) {
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

  public AssignmentStatus connection(ConnectionEnum connection) {
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

  public AssignmentStatus method(MethodEnum method) {
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

  public AssignmentStatus status(StatusEnum status) {
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

  public AssignmentStatus closure(ClosureEnum closure) {
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

  public AssignmentStatus message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get followUp
   * @return followUp
  **/
  @JsonProperty("followUp")
  public Date getFollowUp() {
    return followUp;
  }

  public void setFollowUp(Date followUp) {
    this.followUp = followUp;
  }

  public AssignmentStatus followUp(Date followUp) {
    this.followUp = followUp;
    return this;
  }

 /**
   * Get notification
   * @return notification
  **/
  @JsonProperty("notification")
  public ScheduledNotification getNotification() {
    return notification;
  }

  public void setNotification(ScheduledNotification notification) {
    this.notification = notification;
  }

  public AssignmentStatus notification(ScheduledNotification notification) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

