package apimodels;

import apimodels.ScheduledNotificationShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssignmentStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssignmentStatusResponse   {
  @JsonProperty("assignmentStatusId")
  
  private Long assignmentStatusId;

  @JsonProperty("active")
  
  private Boolean active;

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

  @JsonProperty("toDo")
  
  private ToDoEnum toDo;

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

  @JsonProperty("connection")
  
  private ConnectionEnum connection;

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

  @JsonProperty("method")
  
  private MethodEnum method;

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

  @JsonProperty("status")
  
  private StatusEnum status;

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

  @JsonProperty("closure")
  
  private ClosureEnum closure;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("followUp")
  
  private Long followUp;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("notification")
  @Valid

  private ScheduledNotificationShortResponse notification;

  public AssignmentStatusResponse assignmentStatusId(Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
    return this;
  }

   /**
   * Get assignmentStatusId
   * @return assignmentStatusId
  **/
  public Long getAssignmentStatusId() {
    return assignmentStatusId;
  }

  public void setAssignmentStatusId(Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
  }

  public AssignmentStatusResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AssignmentStatusResponse toDo(ToDoEnum toDo) {
    this.toDo = toDo;
    return this;
  }

   /**
   * Get toDo
   * @return toDo
  **/
  public ToDoEnum getToDo() {
    return toDo;
  }

  public void setToDo(ToDoEnum toDo) {
    this.toDo = toDo;
  }

  public AssignmentStatusResponse connection(ConnectionEnum connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  public ConnectionEnum getConnection() {
    return connection;
  }

  public void setConnection(ConnectionEnum connection) {
    this.connection = connection;
  }

  public AssignmentStatusResponse method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public AssignmentStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AssignmentStatusResponse closure(ClosureEnum closure) {
    this.closure = closure;
    return this;
  }

   /**
   * Get closure
   * @return closure
  **/
  public ClosureEnum getClosure() {
    return closure;
  }

  public void setClosure(ClosureEnum closure) {
    this.closure = closure;
  }

  public AssignmentStatusResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AssignmentStatusResponse followUp(Long followUp) {
    this.followUp = followUp;
    return this;
  }

   /**
   * Get followUp
   * @return followUp
  **/
  public Long getFollowUp() {
    return followUp;
  }

  public void setFollowUp(Long followUp) {
    this.followUp = followUp;
  }

  public AssignmentStatusResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public AssignmentStatusResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public AssignmentStatusResponse notification(ScheduledNotificationShortResponse notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  public ScheduledNotificationShortResponse getNotification() {
    return notification;
  }

  public void setNotification(ScheduledNotificationShortResponse notification) {
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
    return Objects.equals(assignmentStatusId, assignmentStatusResponse.assignmentStatusId) &&
        Objects.equals(active, assignmentStatusResponse.active) &&
        Objects.equals(toDo, assignmentStatusResponse.toDo) &&
        Objects.equals(connection, assignmentStatusResponse.connection) &&
        Objects.equals(method, assignmentStatusResponse.method) &&
        Objects.equals(status, assignmentStatusResponse.status) &&
        Objects.equals(closure, assignmentStatusResponse.closure) &&
        Objects.equals(message, assignmentStatusResponse.message) &&
        Objects.equals(followUp, assignmentStatusResponse.followUp) &&
        Objects.equals(created, assignmentStatusResponse.created) &&
        Objects.equals(updated, assignmentStatusResponse.updated) &&
        Objects.equals(notification, assignmentStatusResponse.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentStatusId, active, toDo, connection, method, status, closure, message, followUp, created, updated, notification);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

