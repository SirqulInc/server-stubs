package apimodels;

import apimodels.Account;
import apimodels.Assignment;
import apimodels.ScheduledNotification;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssignmentStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssignmentStatus   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("assignment")
  @Valid

  private Assignment assignment;

  @JsonProperty("creator")
  @Valid

  private Account creator;

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
  @Valid

  private OffsetDateTime followUp;

  @JsonProperty("notification")
  @Valid

  private ScheduledNotification notification;

  public AssignmentStatus id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssignmentStatus active(Boolean active) {
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

  public AssignmentStatus valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public AssignmentStatus assignment(Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  public Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  public AssignmentStatus creator(Account creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  public Account getCreator() {
    return creator;
  }

  public void setCreator(Account creator) {
    this.creator = creator;
  }

  public AssignmentStatus toDo(ToDoEnum toDo) {
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

  public AssignmentStatus connection(ConnectionEnum connection) {
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

  public AssignmentStatus method(MethodEnum method) {
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

  public AssignmentStatus status(StatusEnum status) {
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

  public AssignmentStatus closure(ClosureEnum closure) {
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

  public AssignmentStatus message(String message) {
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

  public AssignmentStatus followUp(OffsetDateTime followUp) {
    this.followUp = followUp;
    return this;
  }

   /**
   * Get followUp
   * @return followUp
  **/
  public OffsetDateTime getFollowUp() {
    return followUp;
  }

  public void setFollowUp(OffsetDateTime followUp) {
    this.followUp = followUp;
  }

  public AssignmentStatus notification(ScheduledNotification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  public ScheduledNotification getNotification() {
    return notification;
  }

  public void setNotification(ScheduledNotification notification) {
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
    return Objects.equals(id, assignmentStatus.id) &&
        Objects.equals(active, assignmentStatus.active) &&
        Objects.equals(valid, assignmentStatus.valid) &&
        Objects.equals(assignment, assignmentStatus.assignment) &&
        Objects.equals(creator, assignmentStatus.creator) &&
        Objects.equals(toDo, assignmentStatus.toDo) &&
        Objects.equals(connection, assignmentStatus.connection) &&
        Objects.equals(method, assignmentStatus.method) &&
        Objects.equals(status, assignmentStatus.status) &&
        Objects.equals(closure, assignmentStatus.closure) &&
        Objects.equals(message, assignmentStatus.message) &&
        Objects.equals(followUp, assignmentStatus.followUp) &&
        Objects.equals(notification, assignmentStatus.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, assignment, creator, toDo, connection, method, status, closure, message, followUp, notification);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

