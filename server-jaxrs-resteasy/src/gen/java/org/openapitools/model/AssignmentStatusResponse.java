package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ScheduledNotificationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentStatusResponse   {
  
  private Long assignmentStatusId;
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
  private Long followUp;
  private Long created;
  private Long updated;
  private ScheduledNotificationShortResponse notification;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assignmentStatusId")
  public Long getAssignmentStatusId() {
    return assignmentStatusId;
  }
  public void setAssignmentStatusId(Long assignmentStatusId) {
    this.assignmentStatusId = assignmentStatusId;
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
  public Long getFollowUp() {
    return followUp;
  }
  public void setFollowUp(Long followUp) {
    this.followUp = followUp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notification")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

