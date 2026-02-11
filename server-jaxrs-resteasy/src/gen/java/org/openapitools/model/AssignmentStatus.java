package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Account;
import org.openapitools.model.Assignment;
import org.openapitools.model.ScheduledNotification;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentStatus   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Assignment assignment;
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
    private String value;

    ToDoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ToDoEnum toDo;

  /**
   * Gets or Sets connection
   */
  public enum ConnectionEnum {
    INITIAL("INITIAL"),

        FOLLOW_UP("FOLLOW_UP"),

        DECLINED("DECLINED");
    private String value;

    ConnectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConnectionEnum connection;

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    PHONE("PHONE"),

        SITE_VISIT("SITE_VISIT"),

        EMAIL("EMAIL");
    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

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
   * Gets or Sets closure
   */
  public enum ClosureEnum {
    PHONE("PHONE"),

        SITE_VISIT("SITE_VISIT"),

        PHONE_SITE("PHONE_SITE"),

        WEB("WEB");
    private String value;

    ClosureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ClosureEnum closure;
  private String message;
  private Date followUp;
  private ScheduledNotification notification;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assignment")
  @Valid
  public Assignment getAssignment() {
    return assignment;
  }
  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creator")
  @Valid
  public Account getCreator() {
    return creator;
  }
  public void setCreator(Account creator) {
    this.creator = creator;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("toDo")
  public ToDoEnum getToDo() {
    return toDo;
  }
  public void setToDo(ToDoEnum toDo) {
    this.toDo = toDo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connection")
  public ConnectionEnum getConnection() {
    return connection;
  }
  public void setConnection(ConnectionEnum connection) {
    this.connection = connection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
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
  @JsonProperty("closure")
  public ClosureEnum getClosure() {
    return closure;
  }
  public void setClosure(ClosureEnum closure) {
    this.closure = closure;
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
  @JsonProperty("followUp")
  public Date getFollowUp() {
    return followUp;
  }
  public void setFollowUp(Date followUp) {
    this.followUp = followUp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notification")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

